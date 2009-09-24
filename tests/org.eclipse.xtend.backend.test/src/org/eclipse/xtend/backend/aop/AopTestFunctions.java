/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.aop;

import java.util.Collection;
import java.util.List;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class AopTestFunctions {
    public String firstFunction () {
        return "first";
    }

    public String secondFunction () {
        return "second";
    }
    
    public String f (@SuppressWarnings("unused") Object o) {
        return "f(Object)";
    }
    
    public String f (@SuppressWarnings("unused") Collection<?> c) {
        return "f(Collection)";
    }
    
    public String f (@SuppressWarnings("unused") List<?> l) {
        return "f(List)";
    }
    
    public String func (String s) {
    	return s;
    }

    public String otherFunc (String s1, String s2) {
    	return s1 + " " + s2;
    }
}
