/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.testhelpers;

import java.util.ArrayList;
import java.util.List;


/**
 * This bean class serves as support for the PropertyOn* tests.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class BeanWithSizeProperty {
    private long _size;
    
    public BeanWithSizeProperty (long size) {
        _size = size;
    }

    public long getSize () {
        return _size;
    }
    
    public void setSize (long size) {
        _size = size;
    }
    
    public List<String> getChunks () {
        final List<String> result = new ArrayList<String>();
        
        for (int i=0; i<_size; i++)
            result.add ("a" + i);
        
        return result;
    }
    
    public Object myFunction (StringBuilder s, int i) {
        return "asdf" + s + getSize() + " - " + (getSize() - i);
    }
    
    @Override
    public String toString () {
        return "BeanWithSize [" + _size + "]";
    }
}
