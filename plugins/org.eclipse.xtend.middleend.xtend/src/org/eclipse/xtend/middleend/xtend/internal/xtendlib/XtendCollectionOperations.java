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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.syslib.CollectionOperations;
import org.eclipse.xtend.backend.syslib.StringOperations;
import org.eclipse.xtend.middleend.javaannotations.AbstractExecutionContextAware;
import org.eclipse.xtend.middleend.javaannotations.M2tNoFunction;
import org.eclipse.xtend.middleend.javaannotations.M2tQualifiedName;


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
    
    public Collection<?> flatten (Collection<?> c) {
		final List<Object> result = new ArrayList<Object>();
		flattenRec(result, c);
		return result;
	}

    @M2tNoFunction
	public void flattenRec(final List<Object> result, final Collection col) {
		for (final Object element : col) {
			if (element instanceof Collection) {
				flattenRec(result, (Collection) element);
			}
			else {
				result.add(element);
			}
		}
	}
    
    public Collection<?> XtendAdd (Collection c, Object o) {
        c.add (o);
        return c;
    }
    
    public Collection<?> XtendAddAll (Collection c1, Collection c2) {
        c1.addAll (c2);
        return c1;
    }
    
    public Collection<?> XtendRemove (Collection<?> c, Object o) {
        c.remove (o);
        return c;
    }

    public Collection<?> XtendRemoveAll (Collection<?> c1, Collection<?> c2) {
        c1.removeAll (c2);
        return c1;
    }

}
