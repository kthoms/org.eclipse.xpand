package org.eclipse.xtend.backend.functions.java;


class ByteConverter implements JavaBuiltinConverter {
    public static final JavaBuiltinConverter INSTANCE = new ByteConverter ();

    public Object backendToJava (Object o) {
        if (o == null)
            return null;
        return ((Number) o).byteValue();
    }

    public Object javaToBackend (Object o) {
        if (o == null)
            return null;
        return ((Number) o).longValue();
    }
}
