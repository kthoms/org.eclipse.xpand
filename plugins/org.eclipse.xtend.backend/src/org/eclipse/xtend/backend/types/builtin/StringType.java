package org.eclipse.xtend.backend.types.builtin;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.AbstractType;


/**
 * The canonical, internal representation of a string object is "anything that implements CharSequence", i.e.
 *  a function that accepts a parameter of type string must accept any CharSequence. This is done to
 *  enable internal optimizations like lazy concatenation and streaming.<p>
 *  
 * This has the consequence that functions may need to convert a given CharSequence to whatever more specific
 *  string representation they need internally.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class StringType extends AbstractType {
    public static final StringType INSTANCE = new StringType();
    
    private StringType () {super ("String"); }

    public boolean isAssignableFrom (BackendType other) {
        return other == this || other == VoidType.INSTANCE;
    }
}
