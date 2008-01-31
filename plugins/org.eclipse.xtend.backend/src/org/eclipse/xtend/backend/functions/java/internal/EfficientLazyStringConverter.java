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

import org.eclipse.xtend.backend.common.EfficientLazyString;


/**
 * This class is provided to allow Java methods to deal with EfficientLazyString without
 *  the performance penalty of conversion to String and without forcing them to deal with
 *  conversion and special cases.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class EfficientLazyStringConverter implements JavaBuiltinConverter {

    public Object backendToJava (Object o) {
        if (o == null)
            return null;
        
        return EfficientLazyString.createAppendedString (new EfficientLazyString(), o);
    }

    public Object javaToBackend (Object o) {
        return o;
    }
}
