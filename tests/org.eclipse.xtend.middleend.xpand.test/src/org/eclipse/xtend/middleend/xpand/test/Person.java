/*
Copyright (c) 2008 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.middleend.xpand.test;


public class Person {
    private String _name;
    private String _firstName;
    
    public String getName () {
        return _name;
    }
    public void setName (String name) {
        _name = name;
    }
    public String getFirstName () {
        return _firstName;
    }
    public void setFirstName (String firstName) {
        _firstName = firstName;
    }
    
    public String retrieveTheFullName () {
        return _firstName + " " + _name;
    }
    
    public Person getMother () { // to test for endless recursion during type initialization
        return null;
    }
}
