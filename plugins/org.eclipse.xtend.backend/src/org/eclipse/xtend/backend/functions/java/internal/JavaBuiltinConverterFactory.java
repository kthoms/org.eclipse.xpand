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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.functions.java.ParameterConverter;
import org.eclipse.xtend.backend.types.builtin.DoubleType;
import org.eclipse.xtend.backend.types.builtin.ListType;
import org.eclipse.xtend.backend.types.builtin.LongType;
import org.eclipse.xtend.backend.types.builtin.StringType;

/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class JavaBuiltinConverterFactory {
    private static final Map<Class<?>, JavaBuiltinConverter> _converters = new HashMap<Class<?>, JavaBuiltinConverter> ();
    private static final Map<Class<?>, BackendType> _additionalTypes = new HashMap<Class<?>, BackendType> ();
    
    static {
        _converters.put (Integer.class, new IntConverter ());
        _converters.put (Integer.TYPE, new IntConverter ());
        _converters.put (Short.class, new ShortConverter ());
        _converters.put (Short.TYPE, new ShortConverter ());
        _converters.put (Byte.class, new ByteConverter ());
        _converters.put (Byte.TYPE, new ByteConverter ());
        
        _converters.put (Float.class, new FloatConverter ());
        _converters.put (Float.TYPE, new FloatConverter ());
        
        _converters.put (Character.class, new CharConverter ());
        _converters.put (Character.TYPE, new CharConverter ());
        
        _converters.put (String.class, new StringConverter ());
        _converters.put (StringBuilder.class, new StringBuilderConverter ());
        _converters.put (StringBuffer.class, new StringBufferConverter ());
        _converters.put (EfficientLazyString.class, new EfficientLazyStringConverter ());
    }
    
    static {
        _additionalTypes.put (Integer.class, LongType.INSTANCE);
        _additionalTypes.put (Integer.TYPE, LongType.INSTANCE);
        _additionalTypes.put (Short.class, LongType.INSTANCE);
        _additionalTypes.put (Short.TYPE, LongType.INSTANCE);
        _additionalTypes.put (Byte.class, LongType.INSTANCE);
        _additionalTypes.put (Byte.TYPE, LongType.INSTANCE);
        
        _additionalTypes.put (Float.class, DoubleType.INSTANCE);
        _additionalTypes.put (Float.TYPE, DoubleType.INSTANCE);
        
        _additionalTypes.put (Character.class, StringType.INSTANCE);
        _additionalTypes.put (Character.TYPE, StringType.INSTANCE);
    }
    
    public static JavaBuiltinConverter getConverter (Class<?> cls) {
        final JavaBuiltinConverter resultRaw = _converters.get (cls);
        if (resultRaw != null)
            return resultRaw;

        if (cls.isArray())
            return new ArrayConverter (cls.getComponentType());

        return NullConverter.INSTANCE;
    }

    
    /**
     * This method returns a wrapper around a JavaBuiltinConverter that knows about the index of a (parameter) array.
     */
    public static ParameterConverter getParameterConverter (Class<?> paramClass, int index) {
        final JavaBuiltinConverter inner = getConverter(paramClass);
        if (inner == NullConverter.INSTANCE)
            return null;
        
        return new ParameterConverter (index, inner);
    }
    
    
    /**
     * This method retrieves the backend type for non-standard built-in Java types. 
     */
    public static BackendType getTypeForAdditionalBuiltin (Class<?> cls) {
        final BackendType resultRaw = _additionalTypes.get (cls);
        if (resultRaw != null)
            return resultRaw;
        
        if (cls.isArray())
            return ListType.INSTANCE;
        
        return null;
    }
}



