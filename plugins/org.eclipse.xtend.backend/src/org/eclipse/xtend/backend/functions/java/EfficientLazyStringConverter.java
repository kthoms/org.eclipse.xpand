package org.eclipse.xtend.backend.functions.java;

import org.eclipse.xtend.backend.common.EfficientLazyString;


/**
 * This class is provided to allow Java methods to deal with EfficientLazyString without
 *  the performance penalty of conversion to String and without forcing them to deal with
 *  conversion and special cases.
 */
class EfficientLazyStringConverter implements JavaBuiltinConverter {

    public Object backendToJava (Object o) {
        if (o == null)
            return null;
        
        final EfficientLazyString result = new EfficientLazyString ();
        result.append (o);
        return result;
    }

    public Object javaToBackend (Object o) {
        return o;
    }
}
