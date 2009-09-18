/*
Copyright (c) 2008, 2009 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.middleend.xtend.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.eclipse.internal.xpand2.ast.Advice;
import org.eclipse.internal.xpand2.type.DefinitionType;
import org.eclipse.internal.xpand2.type.IteratorType;
import org.eclipse.internal.xtend.expression.ast.BooleanLiteral;
import org.eclipse.internal.xtend.expression.ast.BooleanOperation;
import org.eclipse.internal.xtend.expression.ast.Case;
import org.eclipse.internal.xtend.expression.ast.Cast;
import org.eclipse.internal.xtend.expression.ast.ChainExpression;
import org.eclipse.internal.xtend.expression.ast.CollectionExpression;
import org.eclipse.internal.xtend.expression.ast.ConstructorCallExpression;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.FeatureCall;
import org.eclipse.internal.xtend.expression.ast.GlobalVarExpression;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.IfExpression;
import org.eclipse.internal.xtend.expression.ast.IntegerLiteral;
import org.eclipse.internal.xtend.expression.ast.LetExpression;
import org.eclipse.internal.xtend.expression.ast.ListLiteral;
import org.eclipse.internal.xtend.expression.ast.Literal;
import org.eclipse.internal.xtend.expression.ast.NullLiteral;
import org.eclipse.internal.xtend.expression.ast.OperationCall;
import org.eclipse.internal.xtend.expression.ast.RealLiteral;
import org.eclipse.internal.xtend.expression.ast.StringLiteral;
import org.eclipse.internal.xtend.expression.ast.SwitchExpression;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.internal.xtend.expression.ast.TypeSelectExpression;
import org.eclipse.internal.xtend.type.baseimpl.types.CollectionTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.ListTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.ObjectTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.SetTypeImpl;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.types.AdviceContextType;
import org.eclipse.xtend.backend.aop.AdviceParamType;
import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.aop.ExecutionPointcut;
import org.eclipse.xtend.backend.aop.Pointcut;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.common.SyntaxConstants;
import org.eclipse.xtend.backend.expr.AndExpression;
import org.eclipse.xtend.backend.expr.CreateUncachedExpression;
import org.eclipse.xtend.backend.expr.HidingLocalVarDefExpression;
import org.eclipse.xtend.backend.expr.InitClosureExpression;
import org.eclipse.xtend.backend.expr.InvocationOnCollectionExpression;
import org.eclipse.xtend.backend.expr.InvocationOnObjectExpression;
import org.eclipse.xtend.backend.expr.InvocationOnWhateverExpression;
import org.eclipse.xtend.backend.expr.ListLiteralExpression;
import org.eclipse.xtend.backend.expr.LiteralExpression;
import org.eclipse.xtend.backend.expr.LocalVarEvalExpression;
import org.eclipse.xtend.backend.expr.NewLocalVarDefExpression;
import org.eclipse.xtend.backend.expr.OrExpression;
import org.eclipse.xtend.backend.expr.PropertyOnWhateverExpression;
import org.eclipse.xtend.backend.expr.SequenceExpression;
import org.eclipse.xtend.backend.syslib.SysLibNames;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.util.CollectionHelper;
import org.eclipse.xtend.backend.util.Pair;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.TypeSystem;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.middleend.xtend.internal.xtendlib.XtendLibNames;
import org.eclipse.xtend.typesystem.Operation;
import org.eclipse.xtend.typesystem.StaticProperty;
import org.eclipse.xtend.typesystem.Type;


/**
 * converts a single expression or advice
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class OldExpressionConverter {
    private static final String AROUND_PROCEED = "proceed";
    private static final String XPAND_AROUND_DEF = "targetDef";

	private final TypeToBackendType _typeConverter;
    private ExecutionContext _ctx;
    private final String _extensionName;
    
    public OldExpressionConverter (ExecutionContext ctx, TypeToBackendType typeConverter, String extensionName) {
        _typeConverter = typeConverter;
        _ctx = ctx;
        _extensionName = extensionName;
    }
    
    private static final List<String> _adviceLocalVarNames = Arrays.asList (Around.CONTEXT_PARAM_NAME, SyntaxConstants.THIS_JOINPOINT_STATICPART);
    
    public List<String> getAdviceLocalVarNames () {
        return _adviceLocalVarNames;
    }
    
    public List<Type> getAdviceLocalVarTypes (TypeSystem ts) {
        return Arrays.asList (ts.getStringType(), ts.getStringType()); // any type other than Object will do - as a hint for the right optimizations
    }
    
    private static final AdviceParamType _wildCardParamType = new AdviceParamType (ObjectType.INSTANCE, true);

    public AroundAdvice convertAdvice (ExpressionBase body, String namePattern, List<DeclaredParameter> params, boolean hasVarArgs) {
        final List <Pair <String, AdviceParamType>> paramTypes = new ArrayList <Pair <String, AdviceParamType>> ();
        for (DeclaredParameter dp: params)
            paramTypes.add (new Pair <String, AdviceParamType> (dp.getName().getValue(), new AdviceParamType (_typeConverter.convertToBackendType (dp.getType()), true)));

        final Pointcut pointcut = new ExecutionPointcut (namePattern, paramTypes, hasVarArgs, _wildCardParamType);

        return new AroundAdvice (body, pointcut, false);
    }

    public AroundAdvice convertAdvice (ExpressionBase body, String namePattern, Identifier targetType, List<DeclaredParameter> params, boolean hasVarArgs) {
        final List <Pair <String, AdviceParamType>> paramTypes = new ArrayList <Pair <String, AdviceParamType>> ();
        if (targetType != null)
        	paramTypes.add (new Pair<String, AdviceParamType> (ExecutionContext.IMPLICIT_VARIABLE, new AdviceParamType (_typeConverter.convertToBackendType (_ctx.getTypeForName (targetType.getValue())), true)));
        for (DeclaredParameter dp: params)
            paramTypes.add (new Pair <String, AdviceParamType> (dp.getName().getValue(), new AdviceParamType (_typeConverter.convertToBackendType (dp.getType()), true)));

        final Pointcut pointcut = new ExecutionPointcut (namePattern, paramTypes, hasVarArgs, _wildCardParamType);

        return new AroundAdvice (body, pointcut, false);
    }
    
    public ExpressionBase convert (Expression expr) {
        if (expr instanceof BooleanLiteral)
            return new LiteralExpression ("true".equals (((Literal) expr).getLiteralValue().getValue()), getSourcePos (expr));
        if (expr instanceof IntegerLiteral)
            return new LiteralExpression (new Long (((Literal) expr).getLiteralValue().getValue()), getSourcePos(expr));
        if (expr instanceof NullLiteral)
            return new LiteralExpression (null, getSourcePos (expr));
        if (expr instanceof RealLiteral)
            return new LiteralExpression (new Double (((Literal) expr).getLiteralValue().getValue()), getSourcePos(expr));
        if (expr instanceof StringLiteral)
            return new LiteralExpression (((StringLiteral) expr).getValue(), getSourcePos(expr));
        if (expr instanceof ListLiteral)
            return convertListLiteral ((ListLiteral) expr);

        if (expr instanceof OperationCall)
            return convertOperationCall ((OperationCall) expr);
        if (expr instanceof CollectionExpression)
            return convertCollectionExpression ((CollectionExpression) expr);
        if (expr instanceof TypeSelectExpression)
            return convertTypeSelectExpression ((TypeSelectExpression) expr);
        
        // This case must come *after* OperationCall etc. because of implementation inheritance in the Xtend AST!
        if (expr instanceof FeatureCall)
            return convertFeatureCallExpression ((FeatureCall) expr);
        
        if (expr instanceof BooleanOperation)
            return convertBooleanOperation ((BooleanOperation) expr);
        
        if (expr instanceof GlobalVarExpression)
            return convertGlobalVarExpression ((GlobalVarExpression) expr);
        if (expr instanceof LetExpression)
            return convertLetExpression ((LetExpression) expr);
        if (expr instanceof ChainExpression)
            return convertChainExpression ((ChainExpression) expr);

        if (expr instanceof ConstructorCallExpression)
            return convertConstructorCallExpression ((ConstructorCallExpression) expr);
        
        if (expr instanceof IfExpression)
            return convertIfExpression ((IfExpression) expr);
        if (expr instanceof SwitchExpression)
            return convertSwitchExpression ((SwitchExpression) expr);
        
        if (expr instanceof Cast)
        	return convertCast ((Cast) expr);
        
        throw new IllegalArgumentException ("unsupported expression type: " + expr.getClass().getName());
    }

	private ExpressionBase convertOperationCall (OperationCall expr) {
        final SourcePos sourcePos = getSourcePos (expr);
        final String functionName = transformFunctionName (expr);
        
        final List<ExpressionBase> params = new ArrayList<ExpressionBase> ();
        for (Expression e: expr.getParams ()) 
            params.add (convert (e));

        final List<Type> paramTypes = new ArrayList<Type>();
        for (Expression e: expr.getParams())
            paramTypes.add (new OldTypeAnalyzer ().analyze (_ctx, e));
        
        if (expr.getTarget() == null) {
            if (hasThis()) {
                // if a function matches directly (i.e. without implicitly passing 'this' as a first parameter), that
                //  has precedence in matching
//                if (hasMatchingOperationCall (functionName, paramTypes.toArray (new Type[0]))) 
                if (hasMatchingOperationCall (expr.getName().getValue(), paramTypes.toArray (new Type[0]))) 
                    return new InvocationOnObjectExpression (new QualifiedName (functionName), params, false, sourcePos);
                else {
                    final ExpressionBase thisExpression = new LocalVarEvalExpression (org.eclipse.xtend.backend.common.SyntaxConstants.THIS, sourcePos);
                    final Type thisType = (Type) _ctx.getVariable (ExecutionContext.IMPLICIT_VARIABLE).getValue();
                    return createInvocationOnTargetExpression (functionName, expr.getName().getValue(), thisExpression, thisType, params, paramTypes, true, sourcePos);
                }
            }
            else 
                return new InvocationOnObjectExpression (new QualifiedName (functionName), params, false, sourcePos);
        }
        else if (isAdviceProceedCall(expr))
        	return new InvocationOnObjectExpression (new QualifiedName (AROUND_PROCEED), Arrays.asList (new LocalVarEvalExpression (SyntaxConstants.THIS_JOINPOINT, sourcePos)), true, sourcePos);
        else if (isAdviceCtxLiteral(expr))
        	return new InvocationOnObjectExpression (new QualifiedName (functionName), Arrays.asList (new LocalVarEvalExpression (SyntaxConstants.THIS_JOINPOINT, sourcePos)), true, sourcePos);
        else
            return createInvocationOnTargetExpression (functionName, expr.getName().getValue(), convert (expr.getTarget()), new OldTypeAnalyzer ().analyze (_ctx, expr.getTarget ()), params, paramTypes, true, sourcePos);
    }

	private boolean isAdviceProceedCall(OperationCall expr) {
		return expr.getName ().getValue ().equals (AROUND_PROCEED) && 
        		expr.getTarget () instanceof FeatureCall && 
        		isAdviceCtxLiteral(expr);
	}

	private boolean isAdviceCtxLiteral(FeatureCall expr) {
		if (expr.getTarget () instanceof FeatureCall) {
			return (((FeatureCall) expr.getTarget ()).getName ().getValue ().equals(Around.CONTEXT_PARAM_NAME) ||
				((FeatureCall) expr.getTarget ()).getName ().getValue ().equals(XPAND_AROUND_DEF));
		}
		return false;
	}
    
    private boolean hasMatchingOperationCall (String functionName, Type[] paramTypes) {
        if (_ctx.getExtensionForTypes (functionName, paramTypes) != null)
            return true;

        if (paramTypes.length == 0)
            return false;
        
        final Type target = paramTypes[0];
        return target.getOperation (functionName, CollectionHelper.withoutFirst (paramTypes)) != null;
    }
    
    private boolean hasPotentiallyMatchingOperationCall (String functionName, Type[] paramTypes) {
    	Set<? extends Operation> operations = paramTypes[0].getAllOperations();
    	for (Type paramType : paramTypes) {
			if (isObjectType(paramType)) {
				for (Operation operation : operations) {
					if (operation.getName().equals(functionName))
						return true;
				}
			}
		}
    	return false;
    }
    
    /**
     * transform built-in operator names from the old to the new special names
     */
    private String transformFunctionName (OperationCall expr) {
    	final String functionName = expr.getName().getValue();
        if ("+".equals (functionName))
            return SysLibNames.OPERATOR_PLUS;
        if ("-".equals (functionName))
            return SysLibNames.OPERATOR_MINUS;
        if ("*".equals (functionName))
            return SysLibNames.OPERATOR_MULT;
        if ("/".equals (functionName))
            return SysLibNames.OPERATOR_DIV;
        if ("%".equals (functionName))
            return SysLibNames.OPERATOR_MOD;

        if ("==".equals (functionName))
            return SysLibNames.OPERATOR_EQUALS;
        if ("!=".equals (functionName))
            return SysLibNames.OPERATOR_NOT_EQUALS;
        if ("<".equals (functionName))
            return SysLibNames.OPERATOR_LESS;
        if ("<=".equals (functionName))
            return SysLibNames.OPERATOR_LESS_OR_EQUALS;
        if (">=".equals (functionName))
            return SysLibNames.OPERATOR_GREATER_OR_EQUALS;
        if (">".equals (functionName))
            return SysLibNames.OPERATOR_GREATER;
        
        if ("!".equals (functionName))
            return SysLibNames.OPERATOR_NOT;
        
        if ("subString".equals (functionName))
            return SysLibNames.SUBSTRING;
        if ("replaceAll".equals (functionName))
            return SysLibNames.REPLACE_ALL_REGEX;
        if ("add".equals (functionName))
        	return XtendLibNames.ADD;
        if ("addAll".equals (functionName))
        	return XtendLibNames.ADD_ALL;
        if ("remove".equals (functionName))
        	return XtendLibNames.REMOVE;
        if ("removeAll".equals (functionName))
        	return XtendLibNames.REMOVE_ALL;
        if ("replaceFirst".equals(functionName))
        	return XtendLibNames.STRING_REPLACE_FIRST;
        if ("upTo".equals(functionName))
        	return XtendLibNames.UPTO;
        if ("getFeature".equals(functionName))
        	return XtendLibNames.TYPE_GET_FEATURE;
        if ("getProperty".equals(functionName))
        	return XtendLibNames.TYPE_GET_PROPERTY;
        if ("getOperation".equals(functionName))
        	return XtendLibNames.TYPE_GET_OPERATION;
        if ("getParameterTypes".equals(functionName))
        	return XtendLibNames.OPREATION_GET_PARAMETER_TYPES;
        if ("evaluate".equals(functionName))
        	return XtendLibNames.OPERATION_EVALUATE;
        if ("compareTo".equals(functionName))
        	return XtendLibNames.COMPARE_TO;
        
        if ("toString".equals(functionName)) {
        		if (expr.getTarget() instanceof FeatureCall && ((FeatureCall) expr.getTarget()).getName().getValue().equals(Advice.DEF_VAR_NAME))
        	return XtendLibNames.DEFINITION_TOSTRING;
        }
        return functionName;
    }
    
    private ExpressionBase createInvocationOnTargetExpression (String functionName, String oldFunctionName, ExpressionBase targetExpression, Type targetType, List<ExpressionBase> params, List<Type> paramTypes, boolean isMethodStyle, SourcePos sourcePos) {
        final List<ExpressionBase> paramsWithoutFirst = params;
        final List<ExpressionBase> allParams = new ArrayList<ExpressionBase> ();
        allParams.add (targetExpression);
        allParams.addAll (params);
        
        if (isCollectionType (targetType)) {
            paramTypes.add (0, targetType);
            final Type[] paramTypeArray = paramTypes.toArray(new Type[0]);
            
            if (hasMatchingOperationCall (oldFunctionName, paramTypeArray)) 
//                if (hasMatchingOperationCall (functionName, paramTypeArray)) 
                // check if there is a function that directly matches the collection
                return new InvocationOnObjectExpression (new QualifiedName (functionName), allParams, true, sourcePos);
            else if (hasPotentiallyMatchingOperationCall (oldFunctionName, paramTypeArray))
                // if the static type of one of the other parameters is "Object", we do not know if a matching operation exists on the collection, so we do the logic at runtime
                return new InvocationOnWhateverExpression (new QualifiedName (functionName), allParams, isMethodStyle, sourcePos);
            else
                // otherwise, do a 'collect' and call the function on all elements of the collection
                return new InvocationOnCollectionExpression (targetExpression, new QualifiedName (functionName), paramsWithoutFirst, sourcePos);
        }
        
        if (isObjectType (targetType))
            // if the static type is "Object", we do not know if it is a collection, so we do the logic at runtime
            return new InvocationOnWhateverExpression (new QualifiedName (functionName), allParams, isMethodStyle, sourcePos);
        
        // otherwise we know that it is not a collection and can avoid repeating this logic at runtime
        return new InvocationOnObjectExpression (new QualifiedName (functionName), allParams, isNullIfNullParam(functionName), sourcePos);
    }
    
    private ExpressionBase convertTypeSelectExpression (TypeSelectExpression expr) {
        final SourcePos sourcePos = getSourcePos (expr);
        
        final Type t = _ctx.getTypeForName (expr.getTypeName());
        final ExpressionBase typeExpr = new LiteralExpression (_typeConverter.convertToBackendType(t), sourcePos);
        
        if (expr.getTarget() == null) {
            if (! hasThis())
                throw new IllegalStateException ("typeSelect with neither a target nor an implicit 'this'");
            
            final ExpressionBase thisExpr = new LocalVarEvalExpression (org.eclipse.xtend.backend.common.SyntaxConstants.THIS, sourcePos);
            return new InvocationOnObjectExpression (new QualifiedName (SysLibNames.TYPE_SELECT), Arrays.asList (thisExpr, typeExpr), true, sourcePos);
        }
        else
            return new InvocationOnObjectExpression (new QualifiedName (SysLibNames.TYPE_SELECT), Arrays.asList(convert (expr.getTarget()), typeExpr), false, sourcePos);
    }
    
    private ExpressionBase convertSwitchExpression (SwitchExpression expr) {
        final List<Pair<ExpressionBase, ExpressionBase>> cases = new ArrayList<Pair<ExpressionBase,ExpressionBase>>();
        for (Case c: expr.getCases())
            cases.add (new Pair<ExpressionBase, ExpressionBase> (convert (c.getCondition()), convert (c.getThenPart())));
        
        return new org.eclipse.xtend.backend.expr.SwitchExpression (convert (expr.getSwitchExpr()), cases, convert (expr.getDefaultExpr()), getSourcePos(expr));
    }
    
    private ExpressionBase convertCast(Cast expr) {
		return convert (expr.getTarget());
	}
    
    private ExpressionBase convertListLiteral (ListLiteral expr) {
        final List<ExpressionBase> inner = new ArrayList<ExpressionBase>();
        
        for (Expression e: expr.getElements ())
            inner.add (convert (e));
        
        return new ListLiteralExpression (inner, getSourcePos(expr));
    }
    
    private ExpressionBase convertLetExpression (LetExpression expr) {
        final ExpressionBase varExpr = convert (expr.getVarExpression());
        final Type varType = new OldTypeAnalyzer ().analyze (_ctx, expr.getVarExpression());
        
        final ExecutionContext oldCtx = _ctx;
        _ctx = _ctx.cloneWithVariable (new Variable (expr.getName(), varType));
        
        try {
            if (oldCtx.getVisibleVariables().containsKey(expr.getName()))
                return new HidingLocalVarDefExpression (expr.getName(), varExpr, convert (expr.getTargetExpression()), getSourcePos(expr));
            else
                return new NewLocalVarDefExpression (expr.getName(), varExpr, convert (expr.getTargetExpression()), getSourcePos(expr));
        }
        finally {
            _ctx = oldCtx;
        }
    }
    
    private ExpressionBase convertIfExpression (IfExpression expr) {
        final ExpressionBase elseExpr = (expr.getElsePart() != null) ? convert (expr.getElsePart()) : new LiteralExpression (null, getSourcePos (expr));
        
        return new org.eclipse.xtend.backend.expr.IfExpression (
                convert (expr.getCondition()),
                convert (expr.getThenPart()),
                elseExpr,
                getSourcePos(expr));
    }
    
    private ExpressionBase convertFeatureCallExpression (FeatureCall expr) {
        final SourcePos sourcePos = getSourcePos(expr);
        
        if (expr.getTarget() == null) {
            // 1. check for a static property
            final StaticProperty staticProp = expr.getEnumLiteral (_ctx);
            if (staticProp != null)
                return new LiteralExpression (staticProp.get(), sourcePos);
            
            // 2. check for a local variable
            if (_ctx.getVisibleVariables().containsKey (expr.getName().getValue())) 
                return new LocalVarEvalExpression (expr.getName().getValue(), sourcePos);
            
            // 3. check for a type literal
            try {
                return new LiteralExpression (_typeConverter.convertToBackendType (expr.getName()), sourcePos);
            }
            catch (IllegalArgumentException exc) {} // do nothing - this means it is not a type literal
            
            // 4. check for "this"
            if (hasThis()) {
                final ExpressionBase thisExpr = new LocalVarEvalExpression (org.eclipse.xtend.backend.common.SyntaxConstants.THIS, sourcePos);
                return createPropertyExpression (thisExpr, (Type) _ctx.getVisibleVariables().get (ExecutionContext.IMPLICIT_VARIABLE).getValue(), expr.getName().getValue(), sourcePos);
            }
            
            if (expr instanceof FeatureCall && ((FeatureCall)expr).getName().getValue().equals(ExecutionContext.IMPLICIT_VARIABLE)) {
                final ExpressionBase thisExpr = new LocalVarEvalExpression (org.eclipse.xtend.backend.common.SyntaxConstants.THIS, sourcePos);
                return thisExpr;
            }
             
            throw new IllegalArgumentException ("feature call " + expr.toString() + " does not match any feature: " + sourcePos);
        } else if (isAdviceCtxLiteral(expr)) {
            final Type t = new OldTypeAnalyzer ().analyze (_ctx,expr.getTarget());
            return createAdvCtxPropertyExpression (new LocalVarEvalExpression (SyntaxConstants.THIS_JOINPOINT, sourcePos), t, expr, sourcePos);
//            return createPropertyExpression(convert (expr.getTarget()), t, expr.getName().getValue(), sourcePos);
        } else {
            // evaluate the target and evaluate the property on the result
            final Type t = new OldTypeAnalyzer ().analyze (_ctx,expr.getTarget());
            return createPropertyExpression(convert (expr.getTarget()), t, expr.getName().getValue(), sourcePos);
        }
    }
    
    private ExpressionBase createPropertyExpression (ExpressionBase target, Type type, String varName, SourcePos sourcePos) {
//        if (isCollectionType (type)) {
//            if (CollectionType.INSTANCE.getProperties().keySet().contains (varName))
//                return new PropertyOnObjectExpression (target, varName, sourcePos);
//            else
//                return new PropertyOnCollectionExpression (target, varName, sourcePos);
//        }
//        
//        if (isObjectType (type))
    	final String builtinPropName =  transformPropertyName (target, type, varName);
    	if (builtinPropName != null)
    		return new InvocationOnWhateverExpression(new QualifiedName (builtinPropName), Arrays.asList (target), true, sourcePos);
    	else
            return new PropertyOnWhateverExpression (target, varName, sourcePos);
        
//        return new PropertyOnObjectExpression (target, varName, sourcePos);
    }

    private ExpressionBase createAdvCtxPropertyExpression (ExpressionBase target, Type type, FeatureCall expr, SourcePos sourcePos) {
	  	final String builtinPropName =  transformAdvCtxPropertyName (expr);
	  	if (builtinPropName != null)
	  		return new InvocationOnWhateverExpression(new QualifiedName (builtinPropName), Arrays.asList (target), true, sourcePos);
	  	else
	  		return new PropertyOnWhateverExpression (target, expr.getName().getValue(), sourcePos);
    }
    
    private String transformPropertyName (ExpressionBase target, Type type, String varName) {
		// TODO Auto-generated method stub
    	if (varName.equals ("metaType"))
    		return XtendLibNames.OBJECT_META_TYPE;
    	if (varName.equals ("elements") && type.isAssignableFrom (_ctx.getTypeForName(IteratorType.TYPE_NAME)))
    		return XtendLibNames.ITERATOR_ELEMENTS;
    	if (varName.equals ("allStaticProperties") && type.isAssignableFrom (_ctx.getTypeType()))
    		return XtendLibNames.TYPE_ALL_STATIC_PROPERTIES;
    	if (varName.equals ("allFeatures") && type.isAssignableFrom (_ctx.getTypeType()))
    		return XtendLibNames.TYPE_ALL_FEATURES;
    	if (varName.equals ("allOperations") && type.isAssignableFrom (_ctx.getTypeType()))
    		return XtendLibNames.TYPE_ALL_OPERATIONS;
    	if (varName.equals ("allProperties") && type.isAssignableFrom (_ctx.getTypeType()))
    		return XtendLibNames.TYPE_ALL_PROPERTIES;
    	if (varName.equals ("superTypes") && type.isAssignableFrom (_ctx.getTypeType()))
    		return XtendLibNames.TYPE_SUPER_TYPES;
    	if (varName.equals ("documentation") && type.isAssignableFrom (_ctx.getTypeType()))
    		return XtendLibNames.TYPE_DOCUMENTATION;
    	if (varName.equals ("returnType") && type.isAssignableFrom (_ctx.getFeatureType()))
    		return XtendLibNames.FEATURE_RETURNTYPE;
    	if (varName.equals ("owner") && type.isAssignableFrom (_ctx.getFeatureType()))
    		return XtendLibNames.FEATURE_OWNER;
    	if (varName.equals ("name"))
    		return XtendLibNames.OPERATION_NAME;
    	return null;
	}

    private String transformAdvCtxPropertyName (FeatureCall expr) {
    	final String varName = expr.getName().getValue();
    	final Expression target = expr.getTarget();
    	if ("paramTypes".equals(varName) && target instanceof FeatureCall && ((FeatureCall)target).getName().getValue().equals(Advice.DEF_VAR_NAME))
    		return XtendLibNames.DEFINITION_PARAM_TYPES;
       	if ("paramNames".equals(varName) && target instanceof FeatureCall && ((FeatureCall)target).getName().getValue().equals(Advice.DEF_VAR_NAME))
    		return XtendLibNames.DEFINITION_PARAM_NAMES;
    	if ("name".equals (varName) && target instanceof FeatureCall && ((FeatureCall)target).getName().getValue().equals(Advice.DEF_VAR_NAME))
    		return XtendLibNames.DEFINITION_NAME;
    	if ("paramTypes".equals (varName))
    		return XtendLibNames.ADVICE_CTX_PARAM_TYPES;
    	if ("targetType".equals(varName))
    		return XtendLibNames.ADVICE_CTX_TARGET_TYPE;
    	if ("paramNames".equals (varName))
    		return XtendLibNames.ADVICE_CTX_PARAM_NAMES;
    	if ("paramValues".equals (varName))
    		return XtendLibNames.ADVICE_CTX_PARAM_VALUES;
    	if ("name".equals (varName))
    		return XtendLibNames.ADVICE_CTX_NAME;
    	return null;
    }
    
    private ExpressionBase convertConstructorCallExpression (ConstructorCallExpression expr) {
        final BackendType t = _typeConverter.convertToBackendType (expr.getType ());
        return new CreateUncachedExpression (t, getSourcePos(expr));
    }
    
    private ExpressionBase convertCollectionExpression (CollectionExpression expr) {
        final SourcePos sourcePos = getSourcePos (expr);

        final String functionName = expr.getName().getValue();
        
        final ExecutionContext oldCtx = _ctx;
        _ctx = _ctx.cloneWithVariable (new Variable (expr.getElementName(), new ObjectTypeImpl (_ctx, "Object")));
        final ExpressionBase bodyExpr = convert (expr.getClosure());
        _ctx = oldCtx;

        final InitClosureExpression closureExpr = new InitClosureExpression (Arrays.asList(expr.getElementName()), Arrays.asList(ObjectType.INSTANCE), bodyExpr, sourcePos);
        
        if (expr.getTarget() == null) {
            if (! hasThis())
                throw new IllegalStateException (functionName + " with neither a target nor an implicit 'this'");
            
            final ExpressionBase thisExpr = new LocalVarEvalExpression (org.eclipse.xtend.backend.common.SyntaxConstants.THIS, sourcePos);
            return new InvocationOnObjectExpression (new QualifiedName (functionName), Arrays.asList (thisExpr, closureExpr), true, sourcePos);
        }
        else
            return new InvocationOnObjectExpression (new QualifiedName (functionName), Arrays.asList(convert (expr.getTarget()), closureExpr), true, sourcePos);
    }
    
    private ExpressionBase convertChainExpression (ChainExpression expr) {
        return new SequenceExpression (getInner(expr), getSourcePos(expr));
    }
    
    /**
     * extract the inner expressions as a "flat" list - they are stored as a 
     *  binary tree in the ChainExpression...
     */
    private List<ExpressionBase> getInner (ChainExpression expr) {
        final List<ExpressionBase> result = new ArrayList<ExpressionBase>();
        
        if (expr.getFirst() instanceof ChainExpression) 
            result.addAll (getInner ((ChainExpression) expr.getFirst()));
        else
            result.add (convert (expr.getFirst()));

        if (expr.getNext() instanceof ChainExpression) 
            result.addAll (getInner ((ChainExpression) expr.getNext()));
        else
            result.add (convert (expr.getNext()));
        
        return result;
    }
    
    private ExpressionBase convertGlobalVarExpression (GlobalVarExpression expr) {
        return new InvocationOnObjectExpression (new QualifiedName (XtendLibNames.GLOBAL_VAR_VALUE), Arrays.asList (new LiteralExpression (expr.getVarName(), getSourcePos(expr))), true, getSourcePos (expr));
    }
    
    private ExpressionBase convertBooleanOperation (BooleanOperation expr) {
        final ExpressionBase left = convert (expr.getLeft());
        final ExpressionBase right = convert (expr.getRight());
        
        if ("&&".equals (expr.getOperator().getValue()))
            return new AndExpression (left, right, getSourcePos(expr));
        if ("||".equals (expr.getOperator().getValue()))
            return new OrExpression (left, right, getSourcePos(expr));
        if ("implies".equals (expr.getOperator().getValue()))
            return new InvocationOnObjectExpression (new QualifiedName (SysLibNames.IMPLIES), Arrays.asList(left, right), true, getSourcePos(expr));
        
        throw new IllegalArgumentException ("unknown boolean operator " + expr.getOperator().getValue());
    }
    
    public SourcePos getSourcePos (SyntaxElement se) {
        return getSourcePos (se, _extensionName);
    }
    
    public static SourcePos getSourcePos (SyntaxElement se, String extensionName) {
        return new SourcePos (se.getFileName(), extensionName, se.getLine());
    }
    
    private boolean isObjectType (Type t) {
        return t instanceof ObjectTypeImpl;
    }
    
    private boolean isCollectionType (Type t) {
        return t instanceof CollectionTypeImpl ||
            t instanceof ListTypeImpl ||
            t instanceof SetTypeImpl;
    }
    
    //TODO should this become private again?
    public boolean hasThis () {
        return _ctx.getVisibleVariables().containsKey (ExecutionContext.IMPLICIT_VARIABLE);
    }
    
    private boolean hasThisJoinPoint() {
    	return _ctx.getVisibleVariables().containsKey(Around.CONTEXT_PARAM_NAME);
    }
    
    private boolean isNullIfNullParam(String functionName) {
    	return !(functionName.equals(SysLibNames.OPERATOR_EQUALS) || 
    			functionName.equals(SysLibNames.OPERATOR_NOT_EQUALS));
    }
    
    public ExecutionContext getExecutionContext() {
    	return _ctx;
    }
    
    public void setExecutionContext(ExecutionContext ctx) {
    	_ctx = ctx;
    }
}

