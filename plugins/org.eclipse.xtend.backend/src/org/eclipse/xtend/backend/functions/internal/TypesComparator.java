/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.functions.internal;

import java.util.Comparator;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;


/**
 * This comparator defines a partial order on lists of types by assignability, i.e. l1 <= l2 iff
 *  all types in l2 are assignable from their respective counterparts in l1. It treats all lists of
 *  types as "equal" if neither is fully assignable from the other.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class TypesComparator implements Comparator<List<? extends BackendType>> {

    public int compare(final List<? extends BackendType> types1, final List<? extends BackendType> types2) {
        if (types1 == null || types2 == null)
            throw new NullPointerException ();
        if (types1.size() != types2.size ())
            throw new IllegalArgumentException ("can not compare type lists of different sizes");
        
        boolean less = false;
        boolean greater = false;
        
        for (int i = 0, x = types1.size (); i < x; i++) {
            final BackendType type1 = types1.get (i);
            final BackendType type2 = types2.get (i);

            if (type1.equals (type2))
                continue;
            
            if (type2.isAssignableFrom (type1)) {
                if (greater)
                    return 0;

                less = true;
            } 
            else if (type1.isAssignableFrom (type2)) {
                if (less)
                    return 0;
                
                greater = true;
            }
        }
        
        if (greater)
            return 1;
        if (less)
            return -1;
        
        return 0;
    }

}