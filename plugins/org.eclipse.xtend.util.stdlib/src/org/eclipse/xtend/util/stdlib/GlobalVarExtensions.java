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
 * Java helper class for Stdlib extension <tt>org::eclipse::xtend::util::stdlib::globalvar</tt>.
 */
public class GlobalVarExtensions {
	
	private static Map<String,Object> vars = new HashMap<String,Object>();
	
	public static void storeGlobalVar(String s, Object o) {
		if (o != null) {
		vars.put(s, o);
		} else {
			vars.remove(s);
		}
	}
	
	public static Object getGlobalVar(String s) {
		return vars.get(s);
	}

	public static Object removeGlobalVar(String s) {
		return vars.remove(s);
	}
	
	public static void clearGlobalVars () {
		vars.clear();
	}
	
}
