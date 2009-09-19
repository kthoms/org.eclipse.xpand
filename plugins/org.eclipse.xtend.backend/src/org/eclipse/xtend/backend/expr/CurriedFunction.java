/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.expr;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.types.builtin.ObjectType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
final class CurriedFunction implements Function {
    private final Function _inner;
    private final boolean[] _isBound;
    private final Object[] _boundValue;
    private final List<BackendType> _paramTypes = new ArrayList<BackendType>();

    public CurriedFunction (Function inner, List<ExpressionBase> boundParams, ExecutionContext ctx) {
        _inner = inner;
        _isBound = new boolean[inner.getParameterTypes().size()];
        _boundValue = new Object[inner.getParameterTypes().size()];

        for (int i = 0; i < boundParams.size(); i++) {
            final ExpressionBase curParam = boundParams.get(i);

            if (curParam == null) {
                _paramTypes.add(inner.getParameterTypes().get(i));
            } else {
                _isBound[i] = true;
                _boundValue[i] = boundParams.get(i).evaluate(ctx);
            }
        }
    }

    public ExpressionBase getGuard () {
        return _inner.getGuard();
    }

    public List<? extends BackendType> getParameterTypes () {
        return _paramTypes;
    }

    public Object invoke (ExecutionContext ctx, Object[] params) {
        final List<Object> realParams = new ArrayList<Object>();

        int j = 0;
        for (int i = 0; i < _isBound.length; i++) {
            if (_isBound[i])
                realParams.add(_boundValue[i]);
            else
                realParams.add(params[j++]);
        }

        return ctx.getFunctionInvoker().invoke(ctx, _inner, realParams);
    }

    public boolean isCached () {
        return false;
    }

    public FunctionDefContext getFunctionDefContext () {
        return _inner.getFunctionDefContext();
    }

    public void setFunctionDefContext (FunctionDefContext fdc) {
        throw new UnsupportedOperationException ();
    }

	public BackendType getReturnType() {
		return _inner.getReturnType();
	}
}
