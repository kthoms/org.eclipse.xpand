package org.eclipse.xtend.backend.util;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class Pair<T1, T2> {
    private final T1 _o1;
    private final T2 _o2;
    
    public Pair (T1 o1, T2 o2) {
        _o1 = o1;
        _o2 = o2;
    }

    public T1 getFirst() {
        return _o1;
    }

    public T2 getSecond() {
        return _o2;
    }

    @Override
    public String toString () {
        return "[" + _o1 + ", " + _o2 + "]";
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + ((_o1 == null) ? 0 : _o1.hashCode());
        result = PRIME * result + ((_o2 == null) ? 0 : _o2.hashCode());
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
        final Pair<?, ?> other = (Pair<?, ?>) obj;
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
        return true;
    }
}
