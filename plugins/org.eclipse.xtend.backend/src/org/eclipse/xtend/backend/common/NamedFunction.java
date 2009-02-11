/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.backend.common;


/**
 * This class represents the binding of a function to a name. It is a separate
 *  concept from Function itself so that the same function can have several names.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public class NamedFunction {
    private final Function _function;
    private final QualifiedName _name;

    public NamedFunction (QualifiedName name, Function f) {
        _function = f;
        _name = name;
    }
    
    public Function getFunction () {
        return _function;
    }
    
    public QualifiedName getName () {
        return _name;
    }

    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_function == null) ? 0 : _function.hashCode());
        result = prime * result + ((_name == null) ? 0 : _name.hashCode());
        return result;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final NamedFunction other = (NamedFunction) obj;
        if (_function == null) {
            if (other._function != null)
                return false;
        } else if (!_function.equals(other._function))
            return false;
        if (_name == null) {
            if (other._name != null)
                return false;
        } else if (!_name.equals(other._name))
            return false;
        return true;
    }
    
    @Override
    public String toString () {
        return "NamedFunction [" + _name + ": " + _function + "]";
    }
}
