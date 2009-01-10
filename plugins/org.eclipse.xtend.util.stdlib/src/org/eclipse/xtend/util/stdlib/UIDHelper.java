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

/**
 * Java helper class for Stdlib extension <tt>org::openarchitectureware::util::stdlib::uid</tt>.
 */
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
