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
public abstract class TripleKeyCache<K1, K2, K3, V> {
    private final Map<Triplet<K1, K2, K3>, V> _cache = new HashMap<Triplet <K1, K2, K3>, V>();
    
    public V get (K1 key1, K2 key2, K3 key3) {
        final Triplet<K1, K2, K3> key = new Triplet<K1, K2, K3> (key1, key2, key3);
        
        if (_cache.containsKey (key))
            return _cache.get (key);
        
        final V result = create (key1, key2, key3);
        _cache.put (key, result);
        return result;
    }

    protected abstract V create (K1 key1, K2 key2, K3 key3);
}
