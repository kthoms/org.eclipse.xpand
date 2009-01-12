/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.util.stdlib;

import java.util.HashMap;
import java.util.Map;

/**
 * Java helper class for Stdlib extension <tt>org::openarchitectureware::util::stdlib::counter</tt>.
 */
public class CounterExtensions {
	
	private static int globalCounter = 0;
	private static Map<Object,Integer> vars = new HashMap<Object,Integer>();
	
	public static int counterReset(Object o) {
		if ( o == null ) {
			globalCounter = 0;
		}
		vars.put(o, new Integer(0));
		return 0;
	}
	
	public static int counterInc(Object o){
		if ( o == null ) return globalCounter++;
		Integer count = vars.get(o);
		if ( count == null ) count = new Integer(0);
		int i = count.intValue()+1;
		vars.put(o, new Integer(i));
		return i;
	}
	
	public static int counterDec(Object o){
		if ( o == null ) return globalCounter--;
		Integer count = vars.get(o);
		if ( count == null ) count = new Integer(0);
		int i = count.intValue()-1;
		vars.put(o, new Integer(i));
		return i;
	}
	
	public static int counterGet(Object o){
		if ( o == null ) return globalCounter++;
		Integer count = vars.get(o);
		if ( count == null ) count = new Integer(0);
		return count;
	}

}
