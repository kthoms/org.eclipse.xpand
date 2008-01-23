package org.eclipse.xtend.backend.functions.java;


/**
 * This class is necessary because any CharSequence is a valid backend representation of
 *  a String.
 */
class StringConverter implements JavaBuiltinConverter{

    public Object backendToJava (Object o) {
        if (o == null)
            return null;
        
        return o.toString(); // official way to convert a CharSequence to a String
    }

    public Object javaToBackend (Object o) {
        return o;
    }
}
