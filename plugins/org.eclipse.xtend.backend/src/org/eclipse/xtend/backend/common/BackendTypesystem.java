/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.common;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface BackendTypesystem {
    /**
     * returns the type for a given object or, if this type system does not feel responsible, null. 
     */
    BackendType findType (Object o);
    
    /**
     * returns the type for instances of a given class or, if this type system does not feel responsible, null.
     */
    BackendType findType (Class<?> cls);
    
    
    void setRootTypesystem (BackendTypesystem ts);
    BackendTypesystem getRootTypesystem ();
}
