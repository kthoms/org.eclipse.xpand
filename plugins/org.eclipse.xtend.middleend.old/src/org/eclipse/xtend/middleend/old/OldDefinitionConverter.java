package org.eclipse.xtend.middleend.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.internal.xpand2.ast.Definition;
import org.eclipse.internal.xpand2.ast.ErrorStatement;
import org.eclipse.internal.xpand2.ast.ExpandStatement;
import org.eclipse.internal.xpand2.ast.ExpressionStatement;
import org.eclipse.internal.xpand2.ast.FileStatement;
import org.eclipse.internal.xpand2.ast.ForEachStatement;
import org.eclipse.internal.xpand2.ast.IfStatement;
import org.eclipse.internal.xpand2.ast.LetStatement;
import org.eclipse.internal.xpand2.ast.ProtectStatement;
import org.eclipse.internal.xpand2.ast.Statement;
import org.eclipse.internal.xpand2.ast.TextStatement;
import org.eclipse.internal.xpand2.model.XpandDefinition;
import org.eclipse.internal.xpand2.type.IteratorType;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.expr.HidingLocalVarDefExpression;
import org.eclipse.xtend.backend.expr.IfExpression;
import org.eclipse.xtend.backend.expr.InitClosureExpression;
import org.eclipse.xtend.backend.expr.InvocationOnObjectExpression;
import org.eclipse.xtend.backend.expr.LiteralExpression;
import org.eclipse.xtend.backend.expr.LocalVarEvalExpression;
import org.eclipse.xtend.backend.expr.NewLocalVarDefExpression;
import org.eclipse.xtend.backend.functions.FunctionDefContextImpl;
import org.eclipse.xtend.backend.functions.SourceDefinedFunction;
import org.eclipse.xtend.backend.syslib.XtendIterator;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.util.SyntaxConstants;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.ParameterizedType;
import org.eclipse.xtend.typesystem.Type;


/**
 * converts a single template
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
final class OldDefinitionConverter {
    private ExecutionContext _ctx;
    private final TypeToBackendType _typeConverter;
    
    private String _definitionName;
    
    private int _localVarCounter = 0;
    
    
    public OldDefinitionConverter (ExecutionContext ctx, TypeToBackendType typeConverter) {
        _ctx = ctx;
        _typeConverter = typeConverter;
    }
    
    
    /**
     * converts an extension to a function, taking care of mutual registration with its fdc
     */
    public NamedFunction create (XpandDefinition def, FunctionDefContextImpl fdc) {
        final NamedFunction result = createUnregistered (def, fdc);
        fdc.register (result);
        return result;
    }

    private NamedFunction createUnregistered (XpandDefinition def, FunctionDefContextImpl fdc) {
        if (def instanceof Definition)
            return new NamedFunction (def.getName(), createNormalDefinition ((Definition) def, fdc));
        
        throw new IllegalArgumentException ("unsupported definition type " + def.getClass().getName());
    }

    //TODO imported namespaces (probably one level up)
    //TODO included extensions (probably one level up)
    
    private Function createNormalDefinition (Definition def, FunctionDefContext fdc) {
        final ExecutionContext oldCtx = _ctx;
        
        try {
            final List<String> paramNames = new ArrayList<String>();
            final List<BackendType> paramTypes = new ArrayList<BackendType>();
            
            final Type ft = _ctx.getTypeForName (def.getTargetType());
            _ctx = _ctx.cloneWithVariable (new Variable (ExecutionContext.IMPLICIT_VARIABLE, ft));
            paramNames.add (SyntaxConstants.THIS);
            paramTypes.add (_typeConverter.convertToBackendType(ft));
            
            for (DeclaredParameter dp: def.getParams()) {
                final Type pt = _ctx.getTypeForName (dp.getType().getValue());
                _ctx = _ctx.cloneWithVariable (new Variable (dp.getName().getValue(), pt));
                paramNames.add (dp.getName().getValue());
                paramTypes.add (_typeConverter.convertToBackendType (pt));
            }

            return new SourceDefinedFunction (def.getName(), paramNames, paramTypes, fdc, convertStatmentSequence (def.getBody(), def), false, null);
        }
        finally {
            _ctx = oldCtx;
        }
    }

    private ExpressionBase convertStatmentSequence (Statement[] statements, SyntaxElement oldPos) {
        final List<ExpressionBase> parts = new ArrayList<ExpressionBase> ();
        
        for (Statement stmt: statements)
            parts.add(convertStatement (stmt));
        
        final SourcePos newPos = OldExpressionConverter.getSourcePos (oldPos, _definitionName);
        final ExpressionBase paramExpr = new LiteralExpression (parts, newPos);
        
        return new InvocationOnObjectExpression (SyntaxConstants.CONCAT, Collections.singletonList (paramExpr), newPos);
    }
    
    private ExpressionBase convertStatement (Statement stmt) {
        if (stmt instanceof ErrorStatement)
            return convertErrorStatement((ErrorStatement) stmt);
        if (stmt instanceof ExpandStatement)
            return convertExpandStatement ((ExpandStatement) stmt);
        if (stmt instanceof ExpressionStatement)
            return convertExpressionStatement ((ExpressionStatement) stmt);
        if (stmt instanceof FileStatement)
            return convertFileStatement ((FileStatement) stmt);
        if (stmt instanceof ForEachStatement)
            return convertForEachStatement ((ForEachStatement) stmt);
        if (stmt instanceof IfStatement)
            return convertIfStatement ((IfStatement) stmt);
        if (stmt instanceof LetStatement)
            return convertLetStatement ((LetStatement) stmt);
        if (stmt instanceof ProtectStatement)
            return convertProtectStatement ((ProtectStatement) stmt);
        if (stmt instanceof TextStatement)
            return convertTextStatement ((TextStatement) stmt);
        
        throw new IllegalArgumentException ("unknown statement type " + stmt.getClass().getName());
    }
    
    private ExpressionBase convertErrorStatement (ErrorStatement stmt) {
        final ExpressionBase msg = convertExpression (stmt.getMessage());
        
        return new ExpressionBase (OldExpressionConverter.getSourcePos (stmt, stmt.getFileName())) {
            @Override
            protected Object evaluateInternal (org.eclipse.xtend.backend.common.ExecutionContext ctx) {
                System.err.println (msg.evaluate (ctx)); // TODO throw an exception instead?
                return null;
            }
        };
    }
    
    private ExpressionBase convertExpandStatement (ExpandStatement stmt) {
        //TODO mitloggen, was aufgerufen wird --> in den fdc ziehen
        
        if (stmt.isForeach()) {
            final ExpressionBase separator = (stmt.getSeparator() != null) ? convertExpression (stmt.getSeparator()) : null;
            final ExpressionBase target = convertExpression (stmt.getTarget());
            
            final String closureParamName = createUniqueLocalVarName();
            final List<ExpressionBase> params = new ArrayList<ExpressionBase> ();
            params.add (new LocalVarEvalExpression (closureParamName, getSourcePos(stmt)));
            for (Expression e: stmt.getParameters())
                params.add (convertExpression (e));
            
            final ExpressionBase invocationExpression = new InvocationOnObjectExpression (stmt.getDefinition().getValue(), params, getSourcePos(stmt));
            final ExpressionBase loopBody = new InitClosureExpression (Arrays.asList(closureParamName), Arrays.asList(ObjectType.INSTANCE), invocationExpression, getSourcePos(stmt));
            
            if (separator == null)
                return new InvocationOnObjectExpression (SyntaxConstants.FOREACH_WITHOUT_ITERATOR, Arrays.asList(target, loopBody), getSourcePos (stmt));
            else
                return new InvocationOnObjectExpression (SyntaxConstants.FOREACH_WITHOUT_ITERATOR, Arrays.asList(target, loopBody, separator), getSourcePos (stmt));
        }
        else {
            final List<ExpressionBase> params = new ArrayList<ExpressionBase>();
            if (stmt.getTarget() != null)
                params.add (convertExpression(stmt.getTarget()));
            else
                params.add (new LocalVarEvalExpression (SyntaxConstants.THIS, getSourcePos(stmt)));
            
            for (Expression e: stmt.getParameters())
                params.add (convertExpression (e));
            
            return new InvocationOnObjectExpression (stmt.getDefinition().getValue(), params, getSourcePos(stmt));
        }
    }
    
    
    private String createUniqueLocalVarName () {
        return "$localVar_" + _localVarCounter++;
    }
    
    
    private ExpressionBase convertExpressionStatement (ExpressionStatement stmt) {
        return convertExpression (stmt.getExpression());
    }
    
    private ExpressionBase convertForEachStatement (ForEachStatement stmt) {
        final ExecutionContext oldContext = _ctx;
        
        final ExpressionBase separator = (stmt.getSeparator() != null) ? convertExpression (stmt.getSeparator()) : null;
        final ExpressionBase target = convertExpression (stmt.getTarget());
        
        final Type collType = stmt.getTarget().analyze(oldContext, new HashSet<AnalysationIssue>());
        final Type eleType = (collType instanceof ParameterizedType) ? ((ParameterizedType) collType).getInnerType() : _ctx.getObjectType(); 

        final String varName = stmt.getVariable().getValue();

        ExpressionBase body;

        if (stmt.getIteratorName() == null) {
            // forEach without an iterator
            _ctx = _ctx.cloneWithVariable (new Variable (varName, eleType));
            try {
                body = convertStatmentSequence (stmt.getBody(), stmt);
            }
            finally {
                _ctx = oldContext;
            }
            final ExpressionBase closureCreation = new InitClosureExpression (Arrays.asList (varName), Arrays.asList (_typeConverter.convertToBackendType(eleType)), body, getSourcePos (stmt));

            if (separator == null)
                return new InvocationOnObjectExpression (SyntaxConstants.FOREACH_WITHOUT_ITERATOR, Arrays.asList(target, closureCreation), getSourcePos (stmt));
            else
                return new InvocationOnObjectExpression (SyntaxConstants.FOREACH_WITHOUT_ITERATOR, Arrays.asList(target, closureCreation, separator), getSourcePos (stmt));
        }
        else {
            // forEach with an iterator
            _ctx = _ctx.cloneWithVariable (new Variable (varName, eleType));
            _ctx = _ctx.cloneWithVariable (new Variable (stmt.getIteratorName().getValue(), _ctx.getTypeForName (IteratorType.TYPE_NAME)));
            try {
                body = convertStatmentSequence (stmt.getBody(), stmt);
            }
            finally {
                _ctx = oldContext;
            }
            
            final List<String> paramNames = Arrays.asList (varName, stmt.getIteratorName().getValue());
            final List<BackendType> paramTypes = Arrays.asList (_typeConverter.convertToBackendType (eleType), _typeConverter.convertToBackendType (XtendIterator.class));
            
            final ExpressionBase closureCreation = new InitClosureExpression (paramNames, paramTypes, body, getSourcePos (stmt));

            if (separator == null)
                return new InvocationOnObjectExpression (SyntaxConstants.FOREACH_WITH_ITERATOR, Arrays.asList(target, closureCreation), getSourcePos (stmt));
            else
                return new InvocationOnObjectExpression (SyntaxConstants.FOREACH_WITH_ITERATOR, Arrays.asList(target, closureCreation, separator), getSourcePos (stmt));
        }
    }
    
    private ExpressionBase convertIfStatement (IfStatement stmt) {
        if (stmt.getCondition() != null) {
            final ExpressionBase condExpr = convertExpression (stmt.getCondition());
            final ExpressionBase ifExpr = convertStatement (stmt.getUpperIf());
            final ExpressionBase elseExpr = stmt.getElseIf() != null ? convertStatement (stmt.getElseIf()) : new LiteralExpression (null, getSourcePos (stmt));
            
            return new IfExpression (condExpr, ifExpr, elseExpr, getSourcePos (stmt));
        }
        else {
            // the else part is an IfStatement with null condition
            return convertStatmentSequence (stmt.getBody(), stmt);
        }
    }
    
    
    private ExpressionBase convertLetStatement (LetStatement stmt) {
        final String varName = stmt.getVarName().getValue();
        final Type type = stmt.getVarValue().analyze (_ctx, new HashSet<AnalysationIssue> ());
        
        final ExecutionContext oldContext = _ctx;
        _ctx = _ctx.cloneWithVariable (new Variable (varName, type));
        
        try {
            final ExpressionBase def = convertExpression (stmt.getVarValue());
            final ExpressionBase body = convertStatmentSequence (stmt.getBody(), stmt);
            
            if (oldContext.getVisibleVariables().containsKey (varName))
                return new HidingLocalVarDefExpression (varName, def, body, getSourcePos (stmt));
            else
                return new NewLocalVarDefExpression (varName, def, body, getSourcePos (stmt));
        }
        finally {
            _ctx = oldContext;
        }
    }
    
    private ExpressionBase convertFileStatement (FileStatement stmt) {
        throw new UnsupportedOperationException(); //TODO implement FileStatement
    }
    
    private ExpressionBase convertProtectStatement (ProtectStatement stmt) {
        throw new UnsupportedOperationException(); //TODO implement ProtectStatement
    }
    
    private ExpressionBase convertTextStatement (TextStatement stmt) {
        //TODO isDeleteLine
        return new LiteralExpression (stmt.getValue(), getSourcePos(stmt));
    }
    
    
    private SourcePos getSourcePos (SyntaxElement stmt) {
        return OldExpressionConverter.getSourcePos(stmt, _definitionName);
    }
    
    private ExpressionBase convertExpression (Expression expr) {
        final OldExpressionConverter exprConverter = new OldExpressionConverter (_ctx, _typeConverter, _definitionName);
        return exprConverter.convert (expr);
    }
}

