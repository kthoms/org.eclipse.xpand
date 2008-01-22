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
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class Triplet<T1, T2, T3> {
    private final T1 _o1;
    private final T2 _o2;
    private final T3 _o3;
    
    public Triplet (T1 o1, T2 o2, T3 o3) {
        _o1 = o1;
        _o2 = o2;
        _o3 = o3;
    }

    public T1 getFirst() {
        return _o1;
    }

    public T2 getSecond() {
        return _o2;
    }

    public T3 getThird() {
        return _o3;
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + ((_o1 == null) ? 0 : _o1.hashCode());
        result = PRIME * result + ((_o2 == null) ? 0 : _o2.hashCode());
        result = PRIME * result + ((_o3 == null) ? 0 : _o3.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Triplet<?, ?, ?> other = (Triplet<?, ?, ?>) obj;
        if (_o1 == null) {
            if (other._o1 != null)
                return false;
        } else if (!_o1.equals(other._o1))
            return false;
        if (_o2 == null) {
            if (other._o2 != null)
                return false;
        } else if (!_o2.equals(other._o2))
            return false;
        if (_o3 == null) {
            if (other._o3 != null)
                return false;
        } else if (!_o3.equals(other._o3))
            return false;
        return true;
    }
}
