/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.types;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Property;
import org.eclipse.xtend.backend.functions.java.internal.JavaBuiltinConverter;
import org.eclipse.xtend.backend.functions.java.internal.JavaBuiltinConverterFactory;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public abstract class AbstractProperty implements Property {
    protected final BackendType _owner;
    protected final BackendType _type;
    protected final String _name;
    protected final boolean _isWritable;
    protected final JavaBuiltinConverter _converter;

    public AbstractProperty (BackendType owner, BackendType type, Class<?> javaType, String name, boolean isWritable) {
        if (owner == null)
            throw new IllegalArgumentException ();
        if (type == null)
            throw new IllegalArgumentException ();
        
        _owner = owner;
        _type = type;
        _name = name;
        _isWritable = isWritable;
        
        _converter = JavaBuiltinConverterFactory.getConverter (javaType);
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
    
    public final Object get (ExecutionContext ctx, Object o) {
        return _converter.javaToBackend (getRaw (ctx, o));
    }

    
    public final void set (ExecutionContext ctx, Object o, Object newValue) {
        setRaw (ctx, o, _converter.backendToJava (newValue));
    }

    protected abstract Object getRaw (ExecutionContext ctx, Object o);
    
    @SuppressWarnings("unused")
    public void setRaw (ExecutionContext ctx,  Object o, Object newValue) {
        throw new IllegalStateException ("property " + _name + " of type " + _owner.getName() + " can not be set");
    }
    
    public boolean isWritable () {
        return _isWritable;
    }
}
