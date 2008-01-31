/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.functions.java.internal;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ShortConverter implements JavaBuiltinConverter {
    public static final JavaBuiltinConverter INSTANCE = new ShortConverter ();

    public Object backendToJava (Object o) {
        if (o == null)
            return null;
        return ((Number) o).shortValue();
    }
    
    public Object javaToBackend (Object o) {
        if (o == null)
            return null;
        return ((Number) o).longValue();
    }
}
