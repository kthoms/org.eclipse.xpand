package org.eclipse.xtend.util.stdlib;

import java.util.HashMap;
import java.util.Map;

public class ElementPropertiesExtensions {

	private static Map<Object, Map> outerMap = new HashMap<Object, Map>();
	
	public static void setProperty( Object element, String name, Object value ) {
		Map innerMap = getInnerMap(element);
		innerMap.put( name , value );
	}
	
	public static Object getProperty( Object element, String name ) {
		Map innerMap = getInnerMap(element);
		Object value = innerMap.get( name );
		return value;
	}

	private static Map getInnerMap( Object element ) {
		Map innerMap = outerMap.get(element);
		if ( innerMap == null ) {
			innerMap = new HashMap<String, Object>();
			outerMap.put(element, innerMap);
		}
		return innerMap;
	}
	
}
