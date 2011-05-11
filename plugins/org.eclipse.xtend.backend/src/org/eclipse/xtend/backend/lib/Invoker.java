/*******************************************************************************
 * Copyright (c) 2011 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend.lib;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.functions.java.internal.JavaBuiltinConverter;
import org.eclipse.xtend.backend.functions.java.internal.ParameterConverter;
import org.eclipse.xtend.backend.syslib.CollectionOperations;
import org.eclipse.xtend.backend.util.ErrorHandler;
import org.eclipse.xtend.middleend.javaannotations.ExecutionContextAware;

/**
 * @author aarnold - Initial contribution and API
 */
public class Invoker {
	
	public static Object invokeOnObject (final QualifiedName functionName, final List<Object> params, ExecutionContext ctx, final boolean firstParamIsThis) {
        // this is for "method-style" invocations: if the first parameter (i.e. the one "before the dot") is null,
        //  shortcut the evaluation and return null
        //
        // CAUTION - without this shortcut, the polymorphic resolution may be ambiguous in unexpected ways
        return ctx.getFunctionDefContext().invoke (ctx, functionName, params, firstParamIsThis);
	}

	public static Object invokeOnObjectNullChecked (final QualifiedName functionName, final List<Object> params, ExecutionContext ctx, final boolean firstParamIsThis, final SourcePos pos) {
        // this is for "method-style" invocations: if the first parameter (i.e. the one "before the dot") is null,
        //  shortcut the evaluation and return null
        //
        // CAUTION - without this shortcut, the polymorphic resolution may be ambiguous in unexpected ways
        if (params.size() > 0 && params.get(0) == null) {
            ctx.logNullDeRef (pos);
            return null;
        }
        
        return ctx.getFunctionDefContext().invoke (ctx, functionName, params, firstParamIsThis);
	}
	
	public static Object invokeOnCollection (final QualifiedName functionName, final Collection<?> coll, final List<Object> params, ExecutionContext ctx, final boolean firstParamIsThis, final SourcePos pos) {
        if (coll == null) {
            ctx.logNullDeRef (pos);
            return null;
        }
        
        final Collection<Object> result = CollectionOperations.createMatchingCollection (coll);
        
        for (Object o: coll) {
        	params.set (0, o);

        	CollectionOperations.addFlattened (result, ctx.getFunctionDefContext().invoke (ctx, functionName, params, firstParamIsThis));
        }
        
        return result;
	}
	
	public static Object invokeOnWhatEver (final QualifiedName functionName, final List<Object> params, ExecutionContext ctx, final boolean firstParamIsThis) {        
        if (params.get (0) instanceof Collection<?>) {
            // check if this is a function on Collection itself
            if (ctx.getFunctionDefContext().hasMatch (ctx, functionName, params))
                return ctx.getFunctionDefContext().invoke (ctx, functionName, params, firstParamIsThis);

            final Collection<?> coll = (Collection<?>) params.get (0);
            
            final Collection<Object> result = CollectionOperations.createMatchingCollection (coll);
            
            for (Object o: coll) {
                params.set (0, o);
                
                CollectionOperations.addFlattened (result, ctx.getFunctionDefContext().invoke (ctx, functionName, params, firstParamIsThis));
            }
            
            return result;

        }
        else 
            return ctx.getFunctionDefContext().invoke (ctx, functionName, params, firstParamIsThis);

	}

	public static Object invokeOnWhatEverNullChecked (final QualifiedName functionName, final List<Object> params, ExecutionContext ctx, final boolean firstParamIsThis, final SourcePos pos) {
        if (params.get(0) == null) {
            ctx.logNullDeRef (pos);
            return null;
        }
        
        if (params.get (0) instanceof Collection<?>) {
            // check if this is a function on Collection itself
            if (ctx.getFunctionDefContext().hasMatch (ctx, functionName, params))
                return ctx.getFunctionDefContext().invoke (ctx, functionName, params, firstParamIsThis);

            final Collection<?> coll = (Collection<?>) params.get (0);
            
            final Collection<Object> result = CollectionOperations.createMatchingCollection (coll);
            
            for (Object o: coll) {
                params.set (0, o);
                
                CollectionOperations.addFlattened (result, ctx.getFunctionDefContext().invoke (ctx, functionName, params, firstParamIsThis));
            }
            
            return result;

        }
        else 
            return ctx.getFunctionDefContext().invoke (ctx, functionName, params, firstParamIsThis);

	}

	public static Object invokeOnObject (final NamedFunction function, final List<Object> params, ExecutionContext ctx, final boolean nullIfFirstParamIsNull, final boolean firstParamIsThis, final SourcePos pos) {
        // this is for "method-style" invocations: if the first parameter (i.e. the one "before the dot") is null,
        //  shortcut the evaluation and return null
        //
        // CAUTION - without this shortcut, the polymorphic resolution may be ambiguous in unexpected ways
        if (nullIfFirstParamIsNull && params.size() > 0 && params.get(0) == null) {
            ctx.logNullDeRef (pos);
            return null;
        }
        
        return ctx.getFunctionInvoker().invoke (ctx, function.getFunction(), params);
	}
	
	public static Object invokeOnCollection (final NamedFunction function, final Collection<?> coll, final List<Object> params, ExecutionContext ctx, final boolean nullIfFirstParamIsNull, final boolean firstParamIsThis, final SourcePos pos) {
        if (coll == null) {
            ctx.logNullDeRef (pos);
            return null;
        }
        
        final Collection<Object> result = CollectionOperations.createMatchingCollection (coll);
        
        for (Object o: coll) {
        	params.set (0, o);

        	CollectionOperations.addFlattened (result, ctx.getFunctionInvoker().invoke (ctx, function.getFunction(), params));
        }
        
        return result;
	}
	
	
	public static Object invokeMethod (Method method, List<Object> params, final List<ParameterConverter> parameterConverters, final boolean isStatic, final JavaBuiltinConverter returnValueConverter, ExecutionContext ctx, final boolean nullIfFirstParamIsNull, final boolean firstParamIsThis, final SourcePos pos) {
		// this is for "method-style" invocations: if the first parameter (i.e.
		// the one "before the dot") is null,
		// shortcut the evaluation and return null
		//
		// CAUTION - without this shortcut, the polymorphic resolution may be
		// ambiguous in unexpected ways
		if (nullIfFirstParamIsNull && params.size() > 0
				&& params.get(0) == null) {
			ctx.logNullDeRef(pos);
			return null;
		}
		Object[] rawParams = params.toArray(new Object[params.size()]);
		try {
			// param Expressions must have been evaluated before method can fully qualified with it's param types

			for (int i = 0; i < parameterConverters.size(); i++) {
				parameterConverters.get(i).convert(rawParams);
			}
			
			Object o = getInstance(ctx, method, isStatic);
			if (o instanceof ExecutionContextAware) {
				((ExecutionContextAware) o).setExecutionContext(ctx);
			}

			final Object resultRaw = method.invoke(o, rawParams);
			return returnValueConverter.javaToBackend(resultRaw);

		} catch (Exception e) {
			final List<String> paramTypes = new ArrayList<String>();
			for (Object p : params) {
				if (p == null)
					paramTypes.add(Void.TYPE.getName());
				else
					paramTypes.add(p.getClass().getName());
			}

			ErrorHandler.handle("could not invoke method " + method
					+ " with parameters " + params
					+ " of types " + paramTypes, e);
			return null; // to make the compiler happy - this is never executed
		}
	}
	
	private static Object getInstance(ExecutionContext ctx, Method method, boolean isStatic) {
		final Class<?> clazz = method.getDeclaringClass();
		if (isStatic)
			return null;

		try {
			Object result = ctx.getContributionStateContext().retrieveState(
					clazz);
			if (result == null) {
				result = clazz.newInstance();
				ctx.getContributionStateContext().storeState(clazz, result);
			}
			return result;
		} catch (Exception exc) {
			ErrorHandler.handle(exc);
			return null; // just for the compiler - this is never executed
		}
	}

	public static List<BackendType> guessParameterTypes(Method mtd,
			BackendTypesystem ts) {
		final List<BackendType> result = new ArrayList<BackendType>();

		for (Class<?> cls : mtd.getParameterTypes())
			result.add(ts.findType(cls));

		return result;
	}


}
