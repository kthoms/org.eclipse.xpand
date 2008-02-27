/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.old.internal.xtend;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.CreateExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.ExpressionExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.JavaExtensionStatement;
import org.eclipse.xtend.backend.aop.AdviceParamType;
import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.aop.ExecutionPointcut;
import org.eclipse.xtend.backend.aop.Pointcut;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.SyntaxConstants;
import org.eclipse.xtend.backend.expr.CreateCachedExpression;
import org.eclipse.xtend.backend.expr.LocalVarEvalExpression;
import org.eclipse.xtend.backend.expr.NewLocalVarDefExpression;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;
import org.eclipse.xtend.backend.functions.SourceDefinedFunction;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.util.Pair;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.middleend.old.common.OldExpressionConverter;
import org.eclipse.xtend.middleend.old.common.TypeToBackendType;
import org.eclipse.xtend.typesystem.Type;


/**
 * converts a single extension function
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class OldExtensionConverter {
    private final ExecutionContext _ctx;
    private final TypeToBackendType _typeConverter;
    
    
    public OldExtensionConverter (ExecutionContext ctx, TypeToBackendType typeConverter) {
        _ctx = ctx;
        _typeConverter = typeConverter;
    }
    
    private static final AdviceParamType _wildCardParamType = new AdviceParamType (ObjectType.INSTANCE, true);
    
    public AroundAdvice create (Around around, FunctionDefContext fdc) {
        final List<String> localVarNames = Arrays.asList (SyntaxConstants.THIS_JOINPOINT, SyntaxConstants.THIS_JOINPOINT_STATICPART);
        final List<Type> localVarTypes = Arrays.asList (_ctx.getStringType(), _ctx.getStringType()); // any type other than Object will do - as a hint for the right optimizations
        final ExpressionBase body = convertExpression (around.getExpression(), localVarNames, localVarTypes, "<around>");

        final String namePattern = around.getPointCut().getValue();
        
        final List <Pair <String, AdviceParamType>> paramTypes = new ArrayList <Pair <String, AdviceParamType>> ();
        for (DeclaredParameter dp: around.getParams())
            paramTypes.add (new Pair <String, AdviceParamType> (dp.getName().getValue(), new AdviceParamType (_typeConverter.convertToBackendType (dp.getType()), true)));
        
        final boolean hasVarArgs = around.isWildparams(); 
        
        final Pointcut pointcut = new ExecutionPointcut (namePattern, paramTypes, hasVarArgs, _wildCardParamType);
        
        return new AroundAdvice (body, pointcut, false, fdc);
    }
    
    
    /**
     * converts an extension to a function, taking care of mutual registration with its fdc
     */
    public NamedFunction create (Extension extension, FunctionDefContextInternal fdc) {
        final NamedFunction result = new NamedFunction (extension.getName(), createUnregistered (extension, fdc));
        fdc.register (result, !extension.isPrivate());
        return result;
    }

    private Function createUnregistered (Extension extension, FunctionDefContextInternal fdc) {
        if (extension instanceof JavaExtensionStatement)
            return createJavaExtension ((JavaExtensionStatement) extension);
        
        if (extension instanceof ExpressionExtensionStatement)
            return createExpressionExtension ((ExpressionExtensionStatement) extension, fdc);
        
        if (extension instanceof CreateExtensionStatement)
            return createCreateExtension ((CreateExtensionStatement) extension, fdc);
        
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
    
    private Function createExpressionExtension (ExpressionExtensionStatement extension, FunctionDefContext fdc) {
        return new SourceDefinedFunction (extension.getName(), extension.getParameterNames(), getParameterTypes (extension), // 
                fdc, convertExpression (extension.getExpression(), extension.getParameterNames(), extension.getParameterTypes(), extension.getName ()), extension.isCached(), null);
    }
    
    private Function createCreateExtension (CreateExtensionStatement extension, FunctionDefContext fdc) {
        final Type createdType = _ctx.getTypeForName (extension.getReturnTypeIdentifier().getValue());
        final List<ExpressionBase> paramExprs = new ArrayList<ExpressionBase> ();
        for (String varName: extension.getParameterNames())
            paramExprs.add (new LocalVarEvalExpression (varName, OldExpressionConverter.getSourcePos (extension, extension.getName())));
        
        final ExpressionBase body = convertExpression (extension.getExpression(), extension.getParameterNames(), extension.getParameterTypes(), extension.getName ());
        final ExpressionBase createExpr = new CreateCachedExpression (_typeConverter.convertToBackendType(createdType), paramExprs, OldExpressionConverter.getSourcePos (extension, extension.getName()));
        final ExpressionBase createWrapper = new NewLocalVarDefExpression (SyntaxConstants.THIS, createExpr, body, OldExpressionConverter.getSourcePos (extension, extension.getName ()));
        
        return new SourceDefinedFunction (extension.getName(), extension.getParameterNames(), getParameterTypes(extension), fdc, createWrapper, true, null);
    }
    
    private Function createJavaExtension (JavaExtensionStatement extension) {
        final Method mtd = extension.getJavaMethod (_ctx, new HashSet<AnalysationIssue>());
        return new JavaExtensionFunction (mtd, extension.isCached(), getParameterTypes(extension));
    }
}

