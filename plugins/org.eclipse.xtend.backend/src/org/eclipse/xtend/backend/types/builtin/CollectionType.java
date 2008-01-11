package org.eclipse.xtend.backend.types.builtin;

import java.util.Collection;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.util.ReflectionHelper;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class CollectionType extends AbstractType {
    public static final CollectionType INSTANCE = new CollectionType();

    private CollectionType() {
        super ("Collection"); 
    
        register (new BuiltinProperty (CollectionType.INSTANCE, LongType.INSTANCE, "size", ReflectionHelper.getKnownMethod(Collection.class, "size"), null));
        register (new BuiltinProperty (CollectionType.INSTANCE, BooleanType.INSTANCE, "isEmpty", ReflectionHelper.getKnownMethod(Collection.class, "isEmpty"), null));
    }
    
    public boolean isAssignableFrom (BackendType other) {
        return other == this || other == ListType.INSTANCE || other == SetType.INSTANCE || other == VoidType.INSTANCE;
    }
}

