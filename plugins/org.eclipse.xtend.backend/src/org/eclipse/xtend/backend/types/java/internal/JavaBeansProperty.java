/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.types.java.internal;

import java.beans.PropertyDescriptor;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.util.ErrorHandler;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class JavaBeansProperty extends AbstractProperty {
    private final PropertyDescriptor _pd;
    

    public JavaBeansProperty (PropertyDescriptor pd, BackendType owner) {
        super (owner, pd.getPropertyType(), pd.getName(), pd.getReadMethod() != null, pd.getWriteMethod() != null);
        
        _pd = pd;
    }

    @Override
    public Object getRaw (ExecutionContext ctx, Object o) {
        try {
            return _pd.getReadMethod().invoke (o);
        } catch (Exception e) {
            ErrorHandler.handle(e);
            return null; // to make the compiler happy - this is never executed
        }
    }
    
    @Override
    public void setRaw (ExecutionContext ctx, Object o, Object newValue) {
        try {
            if (_pd.getWriteMethod() == null)
                super.setRaw (ctx, o, newValue);
            
            _pd.getWriteMethod().invoke (o, newValue);
        } catch (Exception e) {
            ErrorHandler.handle (e);
        }
    }

	public BackendType getType(BackendTypesystem ts) {
		// TODO Auto-generated method stub
		return ts.findType (_pd.getPropertyType());
	}
}
