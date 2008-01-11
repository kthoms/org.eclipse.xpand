package org.eclipse.xtend.backend.common;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface BackendTypesystem {
    /**
     * returns the type for a given object or, if this type system does not feel responsible, null. 
     */
    BackendType findType (Object o);
    
    /**
     * returns the type for instances of a given class or, if this type system does not feel responsible, null.
     */
    BackendType findType (Class<?> cls);
    
    
    void setRootTypesystem (BackendTypesystem ts);
    BackendTypesystem getRootTypesystem ();
}
