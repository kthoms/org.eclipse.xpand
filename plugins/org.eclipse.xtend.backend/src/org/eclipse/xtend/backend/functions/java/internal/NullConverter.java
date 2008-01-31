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
 * This is a "Null Object" implementation that performs no conversion whatsoever
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class NullConverter implements JavaBuiltinConverter {
    public static final JavaBuiltinConverter INSTANCE = new NullConverter ();
    
    private NullConverter () {}
    
    public Object backendToJava (Object o) {
        return o;
    }

    public Object javaToBackend (Object o) {
        return o;
    }
}
