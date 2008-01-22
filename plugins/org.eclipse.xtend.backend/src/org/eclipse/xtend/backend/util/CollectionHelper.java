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


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class CollectionHelper {
    public static Object[] withoutFirst (Object[] o) {
        final Object[] result = new Object[o.length - 1];
        System.arraycopy(o, 1, result, 0, result.length);
        return result;
    }
}
