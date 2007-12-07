/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * DO NOT DELETE! this class is referenced by extension tests!
 * 
 * @author user
 * 
 */
public class Helper {

    public final static String toUpperCase(final String str) {
        return str.toUpperCase();
    }

    public String nonStaticHelper(final String str) {
        return null;
    }

	public final static Collection union(final Collection c1, final Collection c2) {
        final Set r = new HashSet();
        r.addAll(c1);
        r.addAll(c2);
        return r;
    }
}
