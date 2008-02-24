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
 * This class was introduced to allow the distinction between a cached "null" value
 *  and no stored value without necessitating two lookups.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ObjectWrapper {
    public ObjectWrapper (Object content) {
        _content = content;
    }
    
    public Object _content;
}
