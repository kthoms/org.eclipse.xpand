package org.eclipse.xtend.backend.util;

import java.lang.reflect.Method;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ReflectionHelper {
    /**
     * retrieve a well-known method from a class, disregarding any thrown exceptions
     */
    public static Method getKnownMethod (Class<?> cls, String name, Class<?>... paramTypes) {
        try {
            return cls.getMethod(name, paramTypes);
        } catch (Exception e) {
            ErrorHandler.handle(e);
            return null; // to make the compiler happy - this is never executed
        }
    }
}
