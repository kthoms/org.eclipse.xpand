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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.CreateExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.ExpressionExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.JavaExtensionStatement;
import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.common.SyntaxConstants;
import org.eclipse.xtend.backend.expr.CreateCachedExpression;
import org.eclipse.xtend.backend.expr.LocalVarEvalExpression;
import org.eclipse.xtend.backend.expr.NewLocalVarDefExpression;
import org.eclipse.xtend.backend.expr.SequenceExpression;
import org.eclipse.xtend.backend.functions.SourceDefinedFunction;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.middleend.xtend.internal.OldExpressionConverter;
import org.eclipse.xtend.middleend.xtend.internal.TypeToBackendType;
import org.eclipse.xtend.typesystem.Type;


/**
 * converts a single extension function
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class OldExtensionConverter {
    private final ExecutionContext _ctx;
    private final TypeToBackendType _typeConverter;
    
    
    public OldExtensionConverter (ExecutionContext ctx, TypeToBackendType typeConverter) {
        _ctx = ctx;
        _typeConverter = typeConverter;
    }
    
    public AroundAdvice create (Around around) {
        final OldExpressionConverter exprConv = new OldExpressionConverter (_ctx, _typeConverter, "<around>");
        
        final List<DeclaredParameter> parameters = around.getParams();
        final List<String> localVarNames = new ArrayList<String> ();
        localVarNames.addAll(exprConv.getAdviceLocalVarNames());
        final List<Type> localVarTypes = new ArrayList<Type> ();
        localVarTypes.addAll(exprConv.getAdviceLocalVarTypes(_ctx));
        for (DeclaredParameter declaredParameter : parameters) {
			localVarNames.add(declaredParameter.getName().getValue());
			localVarTypes.add(_ctx.getTypeForName(declaredParameter.getType().getValue()));
		}

        final ExpressionBase body = convertExpression (around.getExpression(), localVarNames, localVarTypes, "<around>");
        return exprConv.convertAdvice (body, around.getPointCut().getValue(), around.getParams(), around.isWildparams());
    }    
    
    public NamedFunction createUnregistered (Extension extension) {
        if (extension instanceof JavaExtensionStatement)
        	//TODO check extension.getQualifiedName() was extension.getName()
            return new NamedFunction (new QualifiedName (extension.getQualifiedName().replaceAll("/", SyntaxConstants.NS_DELIM)), createJavaExtension ((JavaExtensionStatement) extension));
        
        if (extension instanceof ExpressionExtensionStatement)
            return new NamedFunction (new QualifiedName (extension.getQualifiedName().replaceAll("/", SyntaxConstants.NS_DELIM)), createExpressionExtension ((ExpressionExtensionStatement) extension));
        
        if (extension instanceof CreateExtensionStatement)
            return new NamedFunction (new QualifiedName (extension.getQualifiedName().replaceAll("/", SyntaxConstants.NS_DELIM)), createCreateExtension ((CreateExtensionStatement) extension));
        
        throw new IllegalArgumentException ("unsupported extension type " + extension.getClass().getName());
    }
    
    private List<BackendType> getParameterTypes (Extension extension) {
        final List<Type> unconvertedParamTypes = extension.getParameterTypes();
        
        final List<BackendType> result = new ArrayList<BackendType>();
        for (Type t: unconvertedParamTypes)
            result.add (_typeConverter.convertToBackendType(t));

        return result;
    }

    private ExpressionBase convertExpression (Expression expr, List<String> localVarNames, List<Type> localVarTypes, String extensionName) {
        ExecutionContext ctx = _ctx.cloneWithoutVariables();
        
        for (int i=0; i<localVarNames.size(); i++)
            ctx = ctx.cloneWithVariable(new Variable (localVarNames.get(i), localVarTypes.get (i)));
        
        final OldExpressionConverter exprConverter = new OldExpressionConverter (ctx, _typeConverter, extensionName);
        return exprConverter.convert (expr);
    }
    
    private Function createExpressionExtension (ExpressionExtensionStatement extension) {
    	BackendType returnType;
		try {
			returnType = _typeConverter.convertToBackendType(extension
					.getReturnType());
		} catch (UnsupportedOperationException e) {
			returnType = null;
		}
        return new SourceDefinedFunction (new QualifiedName (extension.getQualifiedName().replaceAll("/", SyntaxConstants.NS_DELIM)), extension.getParameterNames(), getParameterTypes (extension), // 
                returnType, convertExpression (extension.getExpression(), extension.getParameterNames(), extension.getParameterTypes(), extension.getName ()), extension.isCached(), null);
    }
    
    private Function createCreateExtension (CreateExtensionStatement extension) {
        final Type createdType = _ctx.getTypeForName (extension.getReturnTypeIdentifier().getValue());
        //TODO suggest getter for returnVarName on CreateExtensionStatement
        final String createdVarName = !extension.getReturnVarName().equals(ExecutionContext.IMPLICIT_VARIABLE) ? extension.getReturnVarName() : SyntaxConstants.THIS;
        final List<ExpressionBase> paramExprs = new ArrayList<ExpressionBase> ();
        for (String varName: extension.getParameterNames())
            paramExprs.add (new LocalVarEvalExpression (varName, OldExpressionConverter.getSourcePos (extension, extension.getName())));
        
        final List<String> innerParamNames = new ArrayList<String>();
        innerParamNames.add(createdVarName);
        innerParamNames.addAll(extension.getParameterNames());
        final List<Type> innerParamTypes = new ArrayList<Type>();
        innerParamTypes.add(createdType);
        innerParamTypes.addAll(extension.getParameterTypes());

        final ExpressionBase inner = convertExpression (extension.getExpression(), innerParamNames, innerParamTypes/*extension.getParameterNames(), extension.getParameterTypes()*/, extension.getName ());
        final List<ExpressionBase> innerSeq= new ArrayList<ExpressionBase> ();
        innerSeq.add (inner);
        innerSeq.add (new LocalVarEvalExpression(createdVarName, inner.getPos()));
        final ExpressionBase body = new SequenceExpression (innerSeq, inner.getPos());
        final ExpressionBase createExpr = new CreateCachedExpression (_typeConverter.convertToBackendType(createdType), paramExprs, OldExpressionConverter.getSourcePos (extension, extension.getName()));
        final ExpressionBase createWrapper = new NewLocalVarDefExpression (createdVarName, createExpr, body, OldExpressionConverter.getSourcePos (extension, extension.getName ()));

    	BackendType returnType;
		try {
			returnType = _typeConverter.convertToBackendType(extension
					.getReturnType());
		} catch (UnsupportedOperationException e) {
			returnType = null;
		}

        return new SourceDefinedFunction (new QualifiedName (extension.getQualifiedName()), extension.getParameterNames(), getParameterTypes(extension), returnType, createWrapper, true, null);
    }
    
    private Function createJavaExtension (JavaExtensionStatement extension) {
        final Method mtd = extension.getJavaMethod (_ctx, new HashSet<AnalysationIssue>());
        BackendType returnType;
        try {
        	returnType = _typeConverter.convertToBackendType (mtd.getReturnType ());
        } catch (UnsupportedOperationException e) {
        	returnType = null;
        }
        return new JavaExtensionFunction (mtd, extension.isCached(), getParameterTypes(extension), returnType);
    }
}

