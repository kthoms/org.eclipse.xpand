/*******************************************************************************
 * Copyright (c) 2011 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.middleend.xtend.internal.types;

import java.lang.reflect.Field;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.typesystem.Type;

/**
 * @author aarnold - Initial contribution and API
 */
public abstract class TypeToBackendTypeMapper {
	
    public abstract BackendType convertToBackendType (Type t);
    
    
    protected Object getField (Object o, String fieldName) {
        try {
            final Class<?> cls = o.getClass();
            final Field f = cls.getDeclaredField(fieldName);
            f.setAccessible(true);
            return f.get(o);
        } catch (Exception e) {
            throw new RuntimeException (e);
        }
    }


}
