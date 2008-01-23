package org.eclipse.xtend.backend.functions.java;


/**
 * This is a "Null Object" implementation that performs no conversion whatsoever
 */
class NullConverter implements JavaBuiltinConverter {
    public static final JavaBuiltinConverter INSTANCE = new NullConverter ();
    
    private NullConverter () {}
    
    public Object backendToJava (Object o) {
        return o;
    }

    public Object javaToBackend (Object o) {
        return o;
    }
}
