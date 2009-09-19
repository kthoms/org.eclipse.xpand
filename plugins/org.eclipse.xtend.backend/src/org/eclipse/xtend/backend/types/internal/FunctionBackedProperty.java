/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.backend.types.internal;

import java.util.Arrays;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Property;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.types.builtin.ObjectType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class FunctionBackedProperty implements Property {
    private final String _name;
    private final BackendType _owner;
    private final String _getterName;
    private final String _setterName;
    
    //TODO inherit from AbstractProperty once the JavaConversion stuff is factored to a more generic place

    public FunctionBackedProperty (String name, String getterName, String setterName, BackendType owner) {
        _name = name;
        _owner = owner;
        _getterName = getterName;
        _setterName = setterName;
    }


    public Object get (ExecutionContext ctx, Object o) {
        return ctx.getFunctionDefContext().invoke (ctx, new QualifiedName (_getterName), Arrays.asList (o));
    }

    public void set (ExecutionContext ctx, Object o, Object newValue) {
        ctx.getFunctionDefContext().invoke (ctx, new QualifiedName (_setterName), Arrays.asList (o, newValue));
    }

    public String getName () {
        return _name;
    }

    public BackendType getOwner () {
        return _owner;
    }

    public boolean isReadable () {
        return _getterName != null;
    }
    
    public boolean isWritable () {
        return _setterName != null;
    }

	public BackendType getType (BackendTypesystem ts) {
		throw new UnsupportedOperationException();
	}
}
