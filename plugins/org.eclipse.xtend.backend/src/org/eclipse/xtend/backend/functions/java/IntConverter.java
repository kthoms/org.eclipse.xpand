package org.eclipse.xtend.backend.functions.java;


class IntConverter implements JavaBuiltinConverter {
    public static final JavaBuiltinConverter INSTANCE = new IntConverter ();
    
    public Object backendToJava (Object o) {
        if (o == null)
            return null;
        return ((Number) o).intValue();
    }
    
    public Object javaToBackend (Object o) {
        if (o == null)
            return null;
        return ((Number) o).longValue();
    }
}
