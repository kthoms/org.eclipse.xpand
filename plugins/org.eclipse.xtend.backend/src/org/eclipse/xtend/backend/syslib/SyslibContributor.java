/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.syslib;

import static org.eclipse.xtend.middleend.javaannotations.JavaFunctionClassContributor.classAsResource;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class SyslibContributor {
    private static final String[] _sysLibResources = new String[] {
        classAsResource (StringOperations.class),
        classAsResource (CollectionOperations.class),
        classAsResource (FileIoOperations.class),
        classAsResource (PrimitiveOperations.class),
        classAsResource (ReflectionOperations.class)};
    
    public static String[] getSysLibResources () {
        return _sysLibResources;
    }
}
