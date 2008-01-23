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

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is a "String" implementation that is optimized for efficient concatenation of arbitrary objects. It
 *  has the specialty of converting its contents to Strings lazily, i.e. only when the toString method is called.
 *  That allows slot-like behavior where an element that was added to the string can be modified later so that
 *  the modified version actually gets into the resulting string.
 * <p>
 * Another specialty is that this class can stream its contents to a Writer without the necessity of creating an
 *  intermediate string in memory.
 * <p>
 * One non-obvious benefit of consistent usage of this class is that mostly string constants from classes are stored
 *  here, and they are "interned". This can significantly decrease memory footprint and improve performance.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class EfficientLazyString implements CharSequence {
    private boolean _isDirty = false;
    private boolean _isImmutable = false;
    private String _asString = "";
    private final List<Object> _contents = new ArrayList<Object>();

    private EfficientLazyString _parent = null;
    
    
    public static EfficientLazyString createAppendedString (EfficientLazyString s, Object o) {
        if (s._isImmutable) {
            final EfficientLazyString result = new EfficientLazyString ();
            result.append (s);
            result.append (o);
            return result;
        }
        else {
            s.append (o);
            return s;
        }
    }
    
    private void append (Object o) {
        if (o != null) {
            setDirty();
            _contents.add(o);
            if (o instanceof EfficientLazyString) {
                ((EfficientLazyString) o)._parent = this;
            }
        }
    }

    /**
     * makes this EfficientLazyString immutable, forcing concatenation to create a new EfficientLazyString instance. This 
     *  is done to comply with caching semantics, where the string value once returned from a function should not be 
     *  modified implicitly from outside that function.
     */
    public void makeImmutable () {
        _isImmutable = true;
    }
    
    /**
     * if a hierarchy of EfficientLazyStrings was toString'ed, and later on of the parts down in 
     *  the tree becomes dirty again, all parents are dirty as well by implication.
     */
    private void setDirty () {
        _isDirty = true;
        if (_parent != null)
            _parent.setDirty();
    }
    
    public void writeTo (Writer w) throws IOException {
        if (_isDirty) {
            for (Object o: _contents) {
                if (o instanceof EfficientLazyString) 
                    ((EfficientLazyString) o).writeTo(w);
                else
                    w.write(o.toString());
            }
        }
        else {
            w.write(_asString);
        }
    }

    @Override
    public String toString() {
        if (_isDirty) {
            final StringBuilder result = new StringBuilder (32768); // big initial capacity - this is only a temporary object, and the contents can get rather big

            for (Object o: _contents)
                result.append(o);

            _asString = result.toString();
        }        
        return _asString;
    }

    @Override
    public boolean equals(Object obj) {
        throw new IllegalArgumentException ("EfficientLazyString can not be compared directly - compare string representations");
    }
    
    @Override
    public int hashCode() {
        throw new IllegalArgumentException ("EfficientLazyString can not be compared directly - compare string representations");
    }

    public char charAt(int index) {
        return toString().charAt(index);
    }

    public int length() {
        return toString().length();
    }

    public CharSequence subSequence(int start, int end) {
        return toString().subSequence(start, end);
    }
}



