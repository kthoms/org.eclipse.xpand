/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.functions.java.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ArrayConverter implements JavaBuiltinConverter {
    private final Class<?> _componentType;
    
    public ArrayConverter (Class<?> componentType) {
        _componentType = componentType;
    }
    
    public Object backendToJava (Object o) {
        if (o == null)
            return null;
        
        final List<?> l = (List<?>) o;
        final Object[] result = (Object[]) Array.newInstance (_componentType, l.size());
        return l.toArray (result);
    }
    
    public Object javaToBackend (Object o) {
        if (o == null)
            return null;
        
        return Arrays.asList ((Object[]) o);
    }
}
