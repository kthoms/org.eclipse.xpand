package org.eclipse.xtend.backend.types.builtin;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.AbstractType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class DoubleType extends AbstractType {
    public static final DoubleType INSTANCE = new DoubleType();
    
    private DoubleType () {super ("double"); }

    public boolean isAssignableFrom (BackendType other) {
        return other == this || other == VoidType.INSTANCE; 
    }
}
