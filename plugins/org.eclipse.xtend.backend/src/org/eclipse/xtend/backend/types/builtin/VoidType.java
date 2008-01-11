package org.eclipse.xtend.backend.types.builtin;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.AbstractType;


/**
 * This type receives special treatment because it is the only type that can not
 * be determined based on the Java class of an object.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class VoidType extends AbstractType {
    public static final VoidType INSTANCE = new VoidType();

    private VoidType () {super ("Void"); }

    public boolean isAssignableFrom (BackendType other) {
        return other == this;
    }
}
