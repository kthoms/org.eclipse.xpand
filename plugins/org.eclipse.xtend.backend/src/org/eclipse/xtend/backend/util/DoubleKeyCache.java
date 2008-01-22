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

import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public abstract class DoubleKeyCache<K1, K2, V> {
    private final Map<Pair<K1, K2>, V> _cache = new HashMap<Pair <K1, K2>, V>();
    
    public V get (K1 key1, K2 key2) {
        final Pair<K1, K2> key = new Pair<K1, K2> (key1, key2);
        
        if (_cache.containsKey (key))
            return _cache.get (key);
        
        final V result = create (key1, key2);
        _cache.put (key, result);
        return result;
    }

    protected abstract V create (K1 key1, K2 key2);
    
    public Map<Pair<K1, K2>, V> getMap () {
        return _cache;
    }
}
