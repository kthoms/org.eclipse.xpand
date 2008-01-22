/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.common;

import java.util.Collections;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class Helpers {
    /**
     * This method is public static so as to be available as a helper method for all code that needs to call "toString".
     *  It calls "toString" on an object, taking into account all potential overriding extensions.<br>
     */
    public static CharSequence overridableToString (ExecutionContext ctx, Object o) {
        if (o == null)
            return "";
        
        if (o instanceof EfficientLazyString)
            return (CharSequence) o;
        
        final Object resultRaw = ctx.getFunctionDefContext().invoke (ctx, "toString", Collections.singletonList (o));
        if (resultRaw instanceof CharSequence)
            return (CharSequence) resultRaw;
        
        return String.valueOf (resultRaw);
    }

}
