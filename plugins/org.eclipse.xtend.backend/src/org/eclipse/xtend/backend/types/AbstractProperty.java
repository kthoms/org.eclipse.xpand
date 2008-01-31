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


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public abstract class AbstractProperty implements Property {
    protected final BackendType _owner;
    protected final BackendType _type;
    protected final String _name;
    
    public AbstractProperty (BackendType owner, BackendType type, String name) {
        if (owner == null)
            throw new IllegalArgumentException ();
        if (type == null)
            throw new IllegalArgumentException ();
        
        _owner = owner;
        _type = type;
        _name = name;
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
        throw new IllegalStateException ("property " + _name + " of type " + _owner.getName() + " can not be read");
    }

    public void set (ExecutionContext ctx, Object o, Object newValue) {
        throw new IllegalStateException ("property " + _name + " of type " + _owner.getName() + " can not be set");
    }
}
