package org.eclipse.xtend.backend.functions.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


class ArrayConverter implements JavaBuiltinConverter {
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
