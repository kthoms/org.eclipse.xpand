package org.eclipse.xtend.backend.functions.java;


class FloatConverter implements JavaBuiltinConverter {
    public static final JavaBuiltinConverter INSTANCE = new FloatConverter ();
    
    public Object backendToJava (Object o) {
        if (o == null)
            return null;
        return ((Number) o).floatValue();
    }
    
    public Object javaToBackend (Object o) {
        if (o == null)
            return null;
        return ((Number) o).doubleValue();
    }
}
