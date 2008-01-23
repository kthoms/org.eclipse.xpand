package org.eclipse.xtend.backend.functions.java;


class ShortConverter implements JavaBuiltinConverter {
    public static final JavaBuiltinConverter INSTANCE = new ShortConverter ();

    public Object backendToJava (Object o) {
        if (o == null)
            return null;
        return ((Number) o).shortValue();
    }
    
    public Object javaToBackend (Object o) {
        if (o == null)
            return null;
        return ((Number) o).longValue();
    }
}
