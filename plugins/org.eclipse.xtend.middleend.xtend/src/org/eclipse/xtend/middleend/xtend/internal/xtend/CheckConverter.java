/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.middleend.xtend.internal.xtend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.internal.xtend.xtend.ast.Check;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.common.SyntaxConstants;
import org.eclipse.xtend.backend.expr.AndExpression;
import org.eclipse.xtend.backend.expr.IfExpression;
import org.eclipse.xtend.backend.expr.InitClosureExpression;
import org.eclipse.xtend.backend.expr.InvocationOnObjectExpression;
import org.eclipse.xtend.backend.expr.LiteralExpression;
import org.eclipse.xtend.backend.expr.LocalVarEvalExpression;
import org.eclipse.xtend.backend.expr.OrExpression;
import org.eclipse.xtend.backend.expr.SequenceExpression;
import org.eclipse.xtend.backend.functions.SourceDefinedFunction;
import org.eclipse.xtend.backend.syslib.SysLibNames;
import org.eclipse.xtend.backend.types.builtin.CollectionType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.middleend.xtend.internal.OldExpressionConverter;
import org.eclipse.xtend.middleend.xtend.internal.OldHelper;
import org.eclipse.xtend.middleend.xtend.internal.TypeToBackendType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class CheckConverter {
    public static final QualifiedName ALL_CHECKS_FUNCTION_NAME = new QualifiedName ("CheckAllChecks");
    
    /**
     * name of the parameter in which the Issues are passed to the check function. This is not intended to
     *  be edited in a source file, so it is chosen not to be a valid identifier to avoid name clashes.
     */
    public static final String ISSUES_PARAM_NAME = "$issues";
    public static final String ALL_OBJECTS_PARAM_NAME = "$allObjects";
    
    private final TypeToBackendType _typeConverter;
    private final ExecutionContext _emptyExecutionContext;
    
    public CheckConverter (ExecutionContext ctx, TypeToBackendType typeConverter) {
        _emptyExecutionContext = ctx;
        _typeConverter = typeConverter;
    }

    
    public NamedFunction createCheckFunction (BackendTypesystem ts, ExtensionFile extensionFile) {
        final OldExpressionConverter exprConv = new OldExpressionConverter (_emptyExecutionContext.cloneWithResource (extensionFile), _typeConverter, OldHelper.normalizeXtendResourceName (extensionFile.getFullyQualifiedName()));
        final List<String> paramNames = Arrays.asList (ISSUES_PARAM_NAME, ALL_OBJECTS_PARAM_NAME);
        final List<BackendType> paramTypes = Arrays.asList (ts.findType (Issues.class), CollectionType.INSTANCE);
        
        final List<ExpressionBase> allChecks = new ArrayList<ExpressionBase> ();
        for (Check chk: extensionFile.getChecks()) {
        	if (!exprConv.hasThis() ) {
        		ExecutionContext oldCtx = exprConv.getExecutionContext(); 
        		exprConv.setExecutionContext(oldCtx.cloneWithVariable(new Variable(ExecutionContext.IMPLICIT_VARIABLE, oldCtx.getTypeForName(chk.getType().getValue()))));
           		allChecks.add (convertCheck (chk, exprConv));
           		exprConv.setExecutionContext(oldCtx);
        	}
        }
        
        final ExpressionBase body = new SequenceExpression (allChecks, exprConv.getSourcePos (extensionFile));
        
        return new NamedFunction (ALL_CHECKS_FUNCTION_NAME, new SourceDefinedFunction (ALL_CHECKS_FUNCTION_NAME, paramNames, paramTypes, body, false, null));
    }
    
    
    private ExpressionBase convertCheck (Check chk, OldExpressionConverter exprConv) {
        final SourcePos sourcePos = exprConv.getSourcePos (chk);

        final ExpressionBase preCondExpression = (chk.getGuard() == null) ? 
                exprConv.convert (chk.getConstraint()) :
                new OrExpression(
                		new InvocationOnObjectExpression (new QualifiedName (SysLibNames.OPERATOR_NOT), Arrays.asList (exprConv.convert (chk.getGuard())), true, sourcePos), 
                		new AndExpression (exprConv.convert (chk.getGuard()), exprConv.convert (chk.getConstraint()), sourcePos), 
                		sourcePos);
        
        final String addIssueMethodName = chk.isErrorCheck() ? "addError" : "addWarning";
        
        final List<ExpressionBase> failureParams = new ArrayList<ExpressionBase> ();
        failureParams.add (new LocalVarEvalExpression (ISSUES_PARAM_NAME, sourcePos));
        failureParams.add (exprConv.convert(chk.getMsg()));
        failureParams.add (new LocalVarEvalExpression (SyntaxConstants.THIS, sourcePos));
        
        final ExpressionBase failureExpression = new InvocationOnObjectExpression (new QualifiedName (addIssueMethodName), failureParams, true, sourcePos);

        final ExpressionBase onEachExpression = new IfExpression (preCondExpression, new LiteralExpression (null, sourcePos), failureExpression, sourcePos);
        
        final List<ExpressionBase> typeSelectParams = new ArrayList<ExpressionBase> ();
        typeSelectParams.add (new LocalVarEvalExpression (ALL_OBJECTS_PARAM_NAME, sourcePos));
        typeSelectParams.add (new LiteralExpression (_typeConverter.convertToBackendType (chk.getType()), sourcePos));
        final ExpressionBase typeSelectExpression = new InvocationOnObjectExpression (new QualifiedName (SysLibNames.TYPE_SELECT), typeSelectParams, true, sourcePos);
                
        final List<ExpressionBase> collectParams = new ArrayList<ExpressionBase> ();
        collectParams.add (typeSelectExpression);
        collectParams.add (new InitClosureExpression (Arrays.asList(SyntaxConstants.THIS), Arrays.asList(ObjectType.INSTANCE), onEachExpression, sourcePos));
        return new InvocationOnObjectExpression (new QualifiedName (SysLibNames.COLLECT), collectParams, true, sourcePos);
    }
}
