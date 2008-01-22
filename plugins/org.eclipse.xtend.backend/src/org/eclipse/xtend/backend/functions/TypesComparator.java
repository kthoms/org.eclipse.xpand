/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.functions;

import java.util.Comparator;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
final class TypesComparator implements Comparator<List<? extends BackendType>> {
    /**
     * 
     * returns -1 if the second list of types is not assignable to the first
     * list of types returns 0 if the second list of types exactly matches the
     * first list of types returns 1 if the second list of types is assignable
     * to the first list of types
     */
    public int compare(final List<? extends BackendType> types1, final List<? extends BackendType> types2) {
        if (types1 == null || types2 == null)
            throw new NullPointerException ();
        if (types1.size() != types2.size ())
            return -1;
        boolean directMatch = true;
        for (int i = 0, x = types1.size (); i < x; i++) {
            final BackendType type1 = types1.get (i);
            final BackendType type2 = types2.get (i);
            if (type1.isAssignableFrom (type2)) {
                if (!type1.equals (type2)) {
                    directMatch = false;
                }
            } else
                return -1;
        }
        if (directMatch)
            return 0;
        else
            return 1;
    }

}