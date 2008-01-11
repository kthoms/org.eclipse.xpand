package org.eclipse.xtend.backend.common;

import java.util.Collection;
import java.util.Map;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface BackendType {
    Object create ();
    
    boolean isAssignableFrom (BackendType other);
    
    Object getProperty (ExecutionContext ctx, Object o, String name);
    void setProperty (ExecutionContext ctx, Object o, String name, Object value);

    Collection<? extends NamedFunction> getBuiltinOperations ();
    
    // stuff required for reflection / meta programming
    String getName ();
    Collection<? extends BackendType> getSuperTypes ();
    Map<String, ? extends Property> getProperties ();
    Map<String, ? extends StaticProperty> getStaticProperties ();
}
