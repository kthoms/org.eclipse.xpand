package org.eclipse.xtend.backend.util;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class CollectionHelper {
    public static Object[] withoutFirst (Object[] o) {
        final Object[] result = new Object[o.length - 1];
        System.arraycopy(o, 1, result, 0, result.length);
        return result;
    }
}
