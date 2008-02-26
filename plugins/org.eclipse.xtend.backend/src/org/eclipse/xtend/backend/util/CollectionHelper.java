/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class CollectionHelper {

    @SuppressWarnings("unchecked")
    public static<T> T[] withoutFirst (T[] o) {
        final Class<?> memberClass = o.getClass().getComponentType();
        final T[] result = (T[]) Array.newInstance (memberClass, o.length - 1);
        System.arraycopy (o, 1, result, 0, result.length);
        return result;
    }

    public static<T> List<T> withoutFirst (List<T> o) {
        final List<T> result = new ArrayList<T>();
        
        for (int i=1; i<o.size(); i++)
            result.add (o.get(i));
        
        return result;
    }
}
