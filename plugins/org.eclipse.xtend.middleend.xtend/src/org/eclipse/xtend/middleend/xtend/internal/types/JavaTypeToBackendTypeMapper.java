/*******************************************************************************
 * Copyright (c) 2011 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.middleend.xtend.internal.types;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.type.impl.java.JavaTypeImpl;
import org.eclipse.xtend.typesystem.Type;

/**
 * @author André Arnold - Initial contribution and API
 */
public class JavaTypeToBackendTypeMapper extends TypeToBackendTypeMapper {
    
    private static final Log _log = LogFactory.getLog (JavaTypeToBackendTypeMapper.class);

	private final BackendTypesystem _backendTypes;
	
	public JavaTypeToBackendTypeMapper (BackendTypesystem ts) {
		_backendTypes = ts;
	}

	@Override
	public BackendType convertToBackendType(Type t) {
		try {
	        if (t instanceof JavaTypeImpl)
	            return convertJavaType (t);
		} catch (Exception e) {
			_log.error("Check project setup for typesystems", e);
		}
		return null;
	}


	private BackendType convertJavaType (Type t) {
        final Class<?> cls = (Class<?>) getField (t, "clazz");
        return _backendTypes.findType(cls);
    }

}
