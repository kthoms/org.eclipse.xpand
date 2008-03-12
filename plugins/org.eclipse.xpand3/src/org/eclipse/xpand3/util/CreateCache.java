/**
 * <copyright> 
 *
 * Copyright (c) 2002-2007 itemis AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   itemis AG - Initial API and implementation
 *
 * </copyright>
 *
 */
package org.eclipse.xpand3.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sven Efftinge
 * 
 */
public abstract class CreateCache<K, V> {
	private final Map<K, V> _cache = new HashMap<K, V>();

	public V get(K key) {
		if (_cache.containsKey(key))
			return _cache.get(key);

		final V result = create(key);
		_cache.put(key, result);
		if (result != null)
			initialize(key, result);
		return result;
	}

	protected abstract V create(K key);

	protected abstract void initialize(K key, V value);

	public Map<K, V> getMap() {
		return _cache;
	}
}