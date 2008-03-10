/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.internal;

import java.util.List;

import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.FunctionInvoker;
import org.eclipse.xtend.backend.util.DoubleKeyCache;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class FunctionInvokerImpl implements FunctionInvoker {
	private final DoubleKeyCache <Function, List<?>, Object> _cache = new DoubleKeyCache<Function, List<?>, Object> () {
		@Override
		protected Object create (Function f, List<?> params) {
			final Object result = invoke (f, _ctx, params);
			
			if (result instanceof EfficientLazyString)
			    ((EfficientLazyString) result).makeImmutable();
			
			return result;
		}
	};

	private ExecutionContext _ctx;

	private Object invoke (Function f, ExecutionContext ctx, List<?> params) {
	    //TODO optimize for the case when the fdc is == the existing fdc
	    
	    final FunctionDefContext oldFdc = ctx.getFunctionDefContext();
	    ctx.setFunctionDefContext (f.getFunctionDefContext());
	    try {
	        return f.invoke(ctx, params.toArray());
	    }
	    finally {
	        ctx.setFunctionDefContext (oldFdc);
	    }
	}
	
	public Object invoke (ExecutionContext ctx, Function f, List<?> params) {
		if (f.isCached()) {
			_ctx = ctx;
			return _cache.get (f, params);
		}
		else {
			return invoke (f, ctx, params);
		}
	}
}
