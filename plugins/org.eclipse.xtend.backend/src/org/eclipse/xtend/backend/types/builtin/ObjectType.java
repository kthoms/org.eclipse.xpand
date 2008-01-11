package org.eclipse.xtend.backend.types.builtin;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.AbstractType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ObjectType extends AbstractType {
    private ObjectType() {super ("Object"); }
    
    public static ObjectType INSTANCE = new ObjectType();
    
    public boolean isAssignableFrom (BackendType other) {
        return true;
    }
}
