package org.eclipse.xtend.backend.common;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface Property {
    String getName ();
    BackendType getOwner ();

    BackendType getType ();
    
    Object get (ExecutionContext ctx, Object o);
    void set (ExecutionContext ctx, Object o, Object newValue);
}
