package org.eclipse.xtend.backend.functions;

import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.FunctionDefContext;


/**
 * This convenience implementation provides default implementations for many of the
 *  Function methods.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public abstract class AbstractFunction implements Function {
    private final ExpressionBase _guard;
    private final List<? extends BackendType> _parameterTypes;
    private final boolean _cached;

    private FunctionDefContext _fdc;
    
    
    public AbstractFunction (ExpressionBase guard, List<? extends BackendType> parameterTypes, boolean cached) {
        _guard = guard;
        _parameterTypes = parameterTypes;
        _cached = cached;
    }

    public ExpressionBase getGuard () {
        return _guard;
    }

    public List<? extends BackendType> getParameterTypes () {
        return _parameterTypes;
    }

    public boolean isCached () {
        return _cached;
    }

    public FunctionDefContext getFunctionDefContext () {
        return _fdc;
    }
    
    public void setFunctionDefContext (FunctionDefContext fdc) {
        _fdc = fdc;
    }
}
