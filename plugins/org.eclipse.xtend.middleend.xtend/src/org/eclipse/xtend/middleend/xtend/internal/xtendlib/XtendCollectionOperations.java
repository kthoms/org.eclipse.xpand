/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.middleend.xtend.internal.xtendlib;

import java.util.Collection;

import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.syslib.StringOperations;
import org.eclipse.xtend.middleend.javaannotations.AbstractExecutionContextAware;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class XtendCollectionOperations extends AbstractExecutionContextAware {
    
    /**
     * invokes the function for each element of the collection, concatenating the results.
     */
    public CharSequence XpandForEach (Collection<?> c, Function f) {
        return XpandForEach (c, f, null);
    }
        
    /**
     * invokes the function for each element of the collection, concatenating the results and
     *  adding the separator between them.
     */
    public CharSequence XpandForEach (Collection<?> c, Function f, CharSequence separator) {
        EfficientLazyString result = new EfficientLazyString ();

        boolean first = true;
        
        for (Object o: c) {
            if (first)
                first = false;
            else
                result = EfficientLazyString.createAppendedString (result, separator);
            
            final Object part = f.invoke (_ctx, new Object[] {o});
            if (part != null)
            	// TODO verify fix
                result = EfficientLazyString.createAppendedString (result, StringOperations.overridableToString (_ctx, /*o*/part));
        }

        return result;
    }
    
    /**
     * invokes the function for each element of the collection, concatenating the results. The function
     *  is passed an "XtendIterator" instance as a second parameter.
     */
    public CharSequence XpandForEachWithIterator (Collection<?> c, Function f) {
        return XpandForEachWithIterator (c, f, null);
    }
        
    /**
     * invokes the function for each element of the collection, concatenating the results and
     *  adding the separator between them. The function is passed an "XtendIterator" instance 
     *  as a second parameter.
     */
    public CharSequence XpandForEachWithIterator (Collection<?> c, Function f, CharSequence separator) {
        EfficientLazyString result = new EfficientLazyString ();

        boolean first = true;

        final XtendIterator iter = new XtendIterator (c.size());
        for (Object o: c) {
            if (first)
                first = false;
            else
                result = EfficientLazyString.createAppendedString (result, separator);
            
            final Object part = f.invoke (_ctx, new Object[] {o, iter});
            if (part != null)
                result = EfficientLazyString.createAppendedString (result, StringOperations.overridableToString (_ctx, part));
            
            iter.increment();
        }

        return result;
    }
}
