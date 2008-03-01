/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.xtend.internal.xtendlib;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class XtendIterator {
    private long _counter = 0L;
    private final long _elementCount;

    
    public XtendIterator (long elementCount) {
        _elementCount = elementCount;
    }

    public void increment() {
        _counter++;
    }

    public boolean isLastIteration() {
        return _counter + 1 == _elementCount;
    }

    public boolean isFirstIteration() {
        return _counter == 0;
    }

    public long getCounter0() {
        return _counter;
    }
    
    public long getCounter1() {
        return _counter+1;
    }

    public long getElementCount() {
        return _elementCount;
    }    
}

