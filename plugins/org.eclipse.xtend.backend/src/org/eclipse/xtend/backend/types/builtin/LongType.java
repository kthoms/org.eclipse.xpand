package org.eclipse.xtend.backend.types.builtin;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.AbstractType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class LongType extends AbstractType {
    public static final LongType INSTANCE = new LongType();
    
    private LongType () {super ("Int"); }

    @Override
    public Object create() {
        throw new UnsupportedOperationException ();
    }

    public boolean isAssignableFrom (BackendType other) {
        return other == this || other == VoidType.INSTANCE;
    }
}
