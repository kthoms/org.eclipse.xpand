package org.eclipse.xtend.backend.functions.java;


/**
 * This interface serves as an abstraction to convert types supported by Java but not directly
 *  supported by the backend - such as Integer or Float - to backend types and vice versa.
 */
public interface JavaBuiltinConverter {
    Object javaToBackend (Object o);
    Object backendToJava (Object o);
}






