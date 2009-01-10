/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.util.stdlib;

import java.util.HashMap;
import java.util.Map;

public class ElementPropertiesExtensions {

	private static Map<Object, Map<String,Object>> outerMap = new HashMap<Object, Map<String,Object>>();
	
	public static void setProperty( Object element, String name, Object value ) {
		Map<String,Object> innerMap = getInnerMap(element);
		innerMap.put( name , value );
	}
	
	public static Object getProperty( Object element, String name ) {
		Map<String,Object> innerMap = getInnerMap(element);
		Object value = innerMap.get( name );
		return value;
	}

	private static Map<String,Object> getInnerMap( Object element ) {
		Map<String,Object> innerMap = outerMap.get(element);
		if ( innerMap == null ) {
			innerMap = new HashMap<String, Object>();
			outerMap.put(element, innerMap);
		}
		return innerMap;
	}
	
}
