package org.eclipse.xtend.backend;

import java.util.List;

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
			return f.invoke (_ctx, params.toArray());
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
