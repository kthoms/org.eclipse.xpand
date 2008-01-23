package org.eclipse.xtend.backend.functions.java;


class CharConverter implements JavaBuiltinConverter {
    public static final JavaBuiltinConverter INSTANCE = new CharConverter ();

    public Object backendToJava (Object o) {
        if (o == null)
            return null;
        final String s = String.valueOf (o);
        return s.charAt(0);
    }

    public Object javaToBackend (Object o) {
        if (o == null)
            return null;
        return String.valueOf (o);
    }
}
