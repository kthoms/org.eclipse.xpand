package org.eclipse.xtend.backend.types.builtin;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.AbstractType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class BooleanType extends AbstractType {
    public static final BooleanType INSTANCE = new BooleanType ();
    
    private BooleanType () {super ("boolean");}

    public boolean isAssignableFrom (BackendType other) {
        return other == this || other == VoidType.INSTANCE;
    }
}
