package org.eclipse.xtend.util.stdlib;

import java.util.HashMap;
import java.util.Map;

public class UIDHelper {

	private static int counter;
	private static Map<Object, String> ids = new HashMap<Object, String>();

	public static String createNewUID( Object o ) {
		String id = ""+System.currentTimeMillis()+countUp();
		return id;
	}
	
	public static String uid( Object o ) {
		String id = ids.get(o);
		if ( id == null ) {
			id = createNewUID(o);
			ids.put(o, id);
		}
		return id;
	}

	private static String countUp() {
		counter++;
		if ( counter == 10000 ) counter = 0;
		return String.valueOf(counter);
	}
	
}
