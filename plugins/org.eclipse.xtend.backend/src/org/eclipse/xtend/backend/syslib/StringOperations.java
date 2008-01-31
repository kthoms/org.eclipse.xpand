/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.syslib;

import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Helpers;
import org.eclipse.xtend.backend.functions.java.AbstractExecutionContextAware;
import org.eclipse.xtend.backend.functions.java.M2tHidden;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class StringOperations extends AbstractExecutionContextAware {
    
    public String toString (Object o) {
        if (o == null)
            return "";
        
        return String.valueOf (o);
    }
    
    public CharSequence operatorPlus (Object o1, Object o2) {
        return concat (o1, o2);
    }

    /**
     * This method is duplicated with a different name so as to allow explicit concatenation
     *  even if '+' is defined for the concrete types.
     */
    public CharSequence concat (Object o1, Object o2) {
        if (o1 instanceof EfficientLazyString) 
            return EfficientLazyString.createAppendedString ((EfficientLazyString) o1, overridableToString (_ctx, o2));
        
        EfficientLazyString result = new EfficientLazyString ();

        result = EfficientLazyString.createAppendedString (result, overridableToString (_ctx, o1));
        result = EfficientLazyString.createAppendedString (result, overridableToString (_ctx, o2));
        
        return result;
    }

    /**
     * This method is public static so as to be available as a helper method for all code that needs to call "toString".
     *  It calls "toString" on an object, taking into account all potential overriding extensions.<br>
     *  
     * This method is however not itself intended to be published as an extension. It is a helper function, intended to
     *  be used by other extensions.
     */
    @M2tHidden
    public static CharSequence overridableToString (ExecutionContext ctx, Object o) {
        return Helpers.overridableToString (ctx, o);
    }
}
