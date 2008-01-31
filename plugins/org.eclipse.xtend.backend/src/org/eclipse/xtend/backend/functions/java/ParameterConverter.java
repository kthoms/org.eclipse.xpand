/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.functions.java;

import org.eclipse.xtend.backend.functions.java.internal.JavaBuiltinConverter;


/**
 * This class serves as an abstraction to convert between the internal, canonical representation
 *  of the instances of a type, and a variation thereof needed by a specific operation (specifically,
 *  a Java implementation).<p>
 *  
 * Examples of this are the List <--> Array conversion, int <--> long, float <--> double or 
 *  CharSequence <--> String.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ParameterConverter {
    private final int _index;
    private final JavaBuiltinConverter _inner;
    
    public ParameterConverter (int index, JavaBuiltinConverter inner) {
        _index = index;
        _inner = inner;
    }
    
    public void convert (Object[] params) {
        params [_index] = _inner.backendToJava (params[_index]);
    }
}
