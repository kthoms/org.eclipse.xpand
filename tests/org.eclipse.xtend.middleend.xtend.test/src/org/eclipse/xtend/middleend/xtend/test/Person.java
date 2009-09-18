/*
Copyright (c) 2008 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.middleend.xtend.test;

import org.eclipse.xtend.middleend.javaannotations.M2tNoFunction;


public class Person implements Comparable {

	protected String _name;
    protected String _firstName;
    public final static String A_STATIC_PROPERTY = "staticProperty";
    
    public String call(String param) {
    	return "called" + ":" + param;
    }
    
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

    
    @M2tNoFunction
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((_firstName == null) ? 0 : _firstName.hashCode());
		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
		return result;
	}

    @M2tNoFunction
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (_firstName == null) {
			if (other._firstName != null)
				return false;
		} else if (!_firstName.equals(other._firstName))
			return false;
		if (_name == null) {
			if (other._name != null)
				return false;
		} else if (!_name.equals(other._name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Person)
			return _name.compareTo(((Person) o).getName());
		return 0;
	}
	
	public Object concat(Object o) {
		return o;
	}
	
	@Override
	public String toString() {
		return ("Person: " + _firstName + " " + _name);
	}
}
