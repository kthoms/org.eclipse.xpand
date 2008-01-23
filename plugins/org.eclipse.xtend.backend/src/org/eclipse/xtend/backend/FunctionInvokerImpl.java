/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend;

import java.util.List;

import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.FunctionInvoker;
import org.eclipse.xtend.backend.util.DoubleKeyCache;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
final class FunctionInvokerImpl implements FunctionInvoker {
	private final DoubleKeyCache <Function, List<?>, Object> _cache = new DoubleKeyCache<Function, List<?>, Object> () {
		@Override
		protected Object create (Function f, List<?> params) {
			final Object result = f.invoke (_ctx, params.toArray());
			
			if (result instanceof EfficientLazyString)
			    ((EfficientLazyString) result).makeImmutable();
			
			return result;
		}
	};

	private ExecutionContext _ctx;
	
	public Object invoke(ExecutionContext ctx, Function f, List<?> params) {
		if (f.isCached()) {
			_ctx = ctx;
			return _cache.get(f, params);
		}
		else {
			return f.invoke(ctx, params.toArray());
		}
	}
}
