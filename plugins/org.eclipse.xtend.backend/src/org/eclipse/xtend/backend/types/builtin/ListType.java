package org.eclipse.xtend.backend.types.builtin;

import java.util.ArrayList;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.AbstractType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ListType extends AbstractType {
    private ListType () {super ("List", CollectionType.INSTANCE); }
    
    public static final ListType INSTANCE = new ListType ();
    
    @Override
    public Object create() {
        return new ArrayList<Object>();
    }

    public boolean isAssignableFrom(BackendType other) {
        return other == this || other == VoidType.INSTANCE;
    }
}
