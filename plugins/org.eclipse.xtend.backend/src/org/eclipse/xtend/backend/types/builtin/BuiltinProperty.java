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
import org.eclipse.xtend.backend.functions.java.JavaBuiltinConverter;
import org.eclipse.xtend.backend.functions.java.JavaBuiltinConverterFactory;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.util.ErrorHandler;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class BuiltinProperty extends AbstractProperty {
    private final Method _getter;
    private final Method _setter;
    
    private final JavaBuiltinConverter _converter;
    
    public BuiltinProperty (BackendType owner, BackendType type, String name, Method getter, Method setter) {
        super (owner, type, name);
        
        _getter = getter;
        _setter = setter;
        
        _converter = JavaBuiltinConverterFactory.getConverter (getJavaClassForProperty (getter, setter));
    }

    private static Class<?> getJavaClassForProperty (Method getter, Method setter) {
        if (getter != null)
            return getter.getReturnType();
        return setter.getParameterTypes()[0];
    }
    
    @Override
    public Object get (ExecutionContext ctx, Object o) {
        if (_getter == null)
            super.get (ctx, o);
        
        try {
            return _converter.javaToBackend (_getter.invoke(o));
        } catch (Exception e) {
            ErrorHandler.handle(e);
            return null; // to make the compiler happy - this is never executed
        }
    }

    @Override
    public void set (ExecutionContext ctx, Object o, Object newValue) {
        if (_setter == null)
            super.set (ctx, o, newValue);
        
        try {
            _setter.invoke (o, _converter.backendToJava (newValue));
        } catch (Exception e) {
            ErrorHandler.handle(e);
        }
    }
}
