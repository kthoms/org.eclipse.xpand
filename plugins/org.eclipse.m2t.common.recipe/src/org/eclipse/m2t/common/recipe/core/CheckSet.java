/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Markus Voelter and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Voelter - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.m2t.common.recipe.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckSet implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Check> checks = new ArrayList<Check>();
	
	public void add( Check c ) {
		checks.add( c );
	}
	
	public List<Check> getChecks() {
		return checks;
	}
	
	public int getCheckCount() {
		int count = 0;
		for (Iterator<Check> iter = checks.iterator(); iter.hasNext();) {
			Check c = iter.next();
			count += c.getCheckCount();
		}
		return count;
	}
	

	
}
