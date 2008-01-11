package org.eclipse.xtend.backend.functions;

import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.LocalVarContext;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class SourceDefinedFunction implements Function {
	private final String _name;
    private final List<String> _paramNames;
    private final List<BackendType> _paramTypes;
    private final FunctionDefContext _defContext;
    private final ExpressionBase _def;
    private final boolean _cached;
    private final ExpressionBase _guard;

    public SourceDefinedFunction (String name, List<String> paramNames, List<BackendType> paramTypes, FunctionDefContext defContext, ExpressionBase def, boolean cached, ExpressionBase guard) {
    	_name = name;
        _paramNames = paramNames;
        _paramTypes = paramTypes;
        _defContext = defContext;
        _def = def;
        _cached = cached;
        _guard = guard;
    }

    public boolean isCached () {
        return _cached;
    }
    
    public List<BackendType> getParameterTypes() {
        return _paramTypes;
    }

    public FunctionDefContext getFunctionDefContext () {
        return _defContext;
    }
    
    public Object invoke (ExecutionContext ctx, Object[] params) {
        if (_defContext == ctx.getFunctionDefContext())
            return invokeWithExistingFdc (ctx, params);
        else {
            final FunctionDefContext oldFdc = ctx.getFunctionDefContext ();
            try {
                ctx.setFunctionDefContext (_defContext);
                return invokeWithExistingFdc(ctx, params);
            }
            finally {
                ctx.setFunctionDefContext (oldFdc);
            }
        }
    }
    
    private Object invokeWithExistingFdc (ExecutionContext ctx, Object[] params) {
        final LocalVarContext lvc = new LocalVarContext ();
        for (int i=0; i<_paramNames.size(); i++) {
            lvc.getLocalVars().put(_paramNames.get(i), params[i]);
        }
        
        final LocalVarContext oldLvc = ctx.getLocalVarContext();
        try {
            ctx.setLocalVarContext(lvc);
            return _def.evaluate(ctx);
        }
        finally {
            ctx.setLocalVarContext(oldLvc);
        }
    }

	public ExpressionBase getGuard() {
		return _guard;
	}
	
	@Override
	public String toString () {
	    return "SourceDefinedFunction '" + _name + "' " + _paramTypes;
	}
}

