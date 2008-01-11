package org.eclipse.xtend.backend.types.builtin;

import java.util.HashSet;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.AbstractType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class SetType extends AbstractType {
    private SetType () {
        super ("Set", CollectionType.INSTANCE);
    }
    
    public static final SetType INSTANCE = new SetType ();
    
    @Override
    public Object create() {
        return new HashSet<Object>();
    }

    public boolean isAssignableFrom(BackendType other) {
        return other == this || other == VoidType.INSTANCE;
    }
}
