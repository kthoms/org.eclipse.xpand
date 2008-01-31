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
 * This interface serves as an abstraction to convert types supported by Java but not directly
 *  supported by the backend - such as Integer or Float - to backend types and vice versa.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface JavaBuiltinConverter {
    Object javaToBackend (Object o);
    Object backendToJava (Object o);
}






