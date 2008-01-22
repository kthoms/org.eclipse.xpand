/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend;

import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.CreationCache;
import org.eclipse.xtend.backend.util.DoubleKeyCache;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
final class CreationCacheImpl implements CreationCache {
	private DoubleKeyCache<BackendType, List<Object>, Object> _cache = new DoubleKeyCache<BackendType, List<Object>, Object> () {
		@Override
		protected Object create(BackendType t, List<Object> key2) {
			return t.create();
		}
	};
	
	public Object createRaw (BackendType t, List<Object> idParams) {
		return _cache.get (t, idParams);
	}
}
