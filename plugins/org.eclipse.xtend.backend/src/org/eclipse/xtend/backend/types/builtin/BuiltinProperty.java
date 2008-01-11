package org.eclipse.xtend.backend.types.builtin;

import java.lang.reflect.Method;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Property;
import org.eclipse.xtend.backend.util.ErrorHandler;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class BuiltinProperty implements Property {
    private final BackendType _owner;
    private final BackendType _type;
    private final String _name;
    private final Method _getter;
    private final Method _setter;
    
    public BuiltinProperty (BackendType owner, BackendType type, String name, Method getter, Method setter) {
        _owner = owner;
        _type = type;
        _name = name;
        _getter = getter;
        _setter = setter;
    }

    public String getName () {
        return _name;
    }
    
    public BackendType getOwner () {
        return _owner;
    }
    
    public BackendType getType () {
        return _type;
    }
    
    public Object get (ExecutionContext ctx, Object o) {
        if (_getter == null)
            throw new IllegalStateException ("property " + _name + " of type " + _owner.getName() + " can not be read");
        
        try {
            return _getter.invoke(o);
        } catch (Exception e) {
            ErrorHandler.handle(e);
            return null; // to make the compiler happy - this is never executed
        }
    }

    public void set (ExecutionContext ctx, Object o, Object newValue) {
        if (_getter == null)
            throw new IllegalStateException ("property " + _name + " of type " + _owner.getName() + " can not be set");
        
        try {
            _setter.invoke (o, newValue);
        } catch (Exception e) {
            ErrorHandler.handle(e);
        }
    }
}
