/*
Copyright (c) 2009 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.backend.expr;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.functions.java.internal.JavaBuiltinConverter;
import org.eclipse.xtend.backend.functions.java.internal.JavaBuiltinConverterFactory;
import org.eclipse.xtend.backend.functions.java.internal.ParameterConverter;
import org.eclipse.xtend.backend.util.ErrorHandler;
import org.eclipse.xtend.middleend.javaannotations.ExecutionContextAware;

public class MethodInvocationExpression extends ExpressionBase {

    private final Method _mtd;
    private final boolean _isStatic;
    
    private final List<ParameterConverter> _parameterConverters = new ArrayList<ParameterConverter>();
    private final JavaBuiltinConverter _returnValueConverter;
	private final List<? extends ExpressionBase> _params;
	private final boolean _nullIfFirstParamIsNull;
	private Class<?> _clazz;

	/**
	 * An expression that invokes an already known method
	 * 
	 * @param mtd
	 * @param params
	 * @param nullIfFirstParamIsNull
	 * @param sourcePos
	 */
	public MethodInvocationExpression(Method mtd,
			List<? extends ExpressionBase> params,
			boolean nullIfFirstParamIsNull, SourcePos sourcePos) {
		super(sourcePos);

		_mtd = mtd;
		_clazz = mtd.getDeclaringClass();
		_params = params;
		_nullIfFirstParamIsNull = nullIfFirstParamIsNull;

        for (int i=0; i<mtd.getParameterTypes().length; i++) {
            final ParameterConverter pc = JavaBuiltinConverterFactory.getParameterConverter (mtd.getParameterTypes()[i], i);
            if (pc != null)
                _parameterConverters.add(pc);
        }
        
        _returnValueConverter = JavaBuiltinConverterFactory.getConverter (mtd.getReturnType());
        
        _isStatic = (mtd.getModifiers() & Modifier.STATIC) != 0;

	}

	@Override
	protected Object evaluateInternal(ExecutionContext ctx) {
		final List<Object> params = new ArrayList<Object>();
		for (ExpressionBase expr : _params)
			params.add(expr.evaluate(ctx));

		// this is for "method-style" invocations: if the first parameter (i.e.
		// the one "before the dot") is null,
		// shortcut the evaluation and return null
		//
		// CAUTION - without this shortcut, the polymorphic resolution may be
		// ambiguous in unexpected ways
		if (_nullIfFirstParamIsNull && params.size() > 0
				&& params.get(0) == null) {
			ctx.logNullDeRef(getPos());
			return null;
		}
		Object[] rawParams = params.toArray(new Object[params.size()]);
		try {
			// param Expressions must have been evaluated before method can fully qualified with it's param types

			for (int i = 0; i < _parameterConverters.size(); i++) {
				_parameterConverters.get(i).convert(rawParams);
			}
			
			Object o = getInstance(ctx);
			if (o instanceof ExecutionContextAware) {
				((ExecutionContextAware) o).setExecutionContext(ctx);
			}

			final Object resultRaw = _mtd.invoke(o, rawParams);
			return _returnValueConverter.javaToBackend(resultRaw);

		} catch (Exception e) {
			final List<String> paramTypes = new ArrayList<String>();
			for (Object p : params) {
				if (p == null)
					paramTypes.add(Void.TYPE.getName());
				else
					paramTypes.add(p.getClass().getName());
			}

			ErrorHandler.handle("could not invoke method " + _mtd
					+ " with parameters " + params
					+ " of types " + paramTypes, e);
			return null; // to make the compiler happy - this is never executed
		}
	}

	private Object getInstance(ExecutionContext ctx) {
		if (_isStatic)
			return null;

		try {
			Object result = ctx.getContributionStateContext().retrieveState(
					_clazz);
			if (result == null) {
				result = _clazz.newInstance();
				ctx.getContributionStateContext().storeState(_clazz, result);
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

	public String getName() {
		return _mtd.getName();
	}

}
