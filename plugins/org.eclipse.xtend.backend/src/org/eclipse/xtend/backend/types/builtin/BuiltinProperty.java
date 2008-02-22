/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.types.builtin;

import java.lang.reflect.Method;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.util.ErrorHandler;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class BuiltinProperty extends AbstractProperty {
    private final Method _getter;
    private final Method _setter;
    
    public BuiltinProperty (BackendType owner, BackendType type, String name, Method getter, Method setter) {
        super (owner, type, getJavaClassForProperty(getter, setter), name, setter != null);
        
        _getter = getter;
        _setter = setter;
    }

    private static Class<?> getJavaClassForProperty (Method getter, Method setter) {
        if (getter != null)
            return getter.getReturnType();
        return setter.getParameterTypes()[0];
    }
    
    @Override
    public Object getRaw (ExecutionContext ctx, Object o) {
        try {
            return _getter.invoke(o);
        } catch (Exception e) {
            ErrorHandler.handle(e);
            return null; // to make the compiler happy - this is never executed
        }
    }

    @Override
    public void setRaw (ExecutionContext ctx, Object o, Object newValue) {
        if (_setter == null)
            super.setRaw (ctx, o, newValue);
        
        try {
            _setter.invoke (o, newValue);
        } catch (Exception e) {
            ErrorHandler.handle(e);
        }
    }
}
