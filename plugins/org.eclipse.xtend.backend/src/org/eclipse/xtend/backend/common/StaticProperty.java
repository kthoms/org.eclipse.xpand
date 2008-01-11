package org.eclipse.xtend.backend.common;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface StaticProperty {
    String getName ();
    BackendType getOwner ();

    BackendType getType ();
    
    Object get ();
}
