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
package org.eclipse.xpand3.analyzation.typesystem.java;

/**
 * @author Sven Efftinge
 *
 */
public class GenericsBean<T, L extends Comparable<T>> implements Comparable<L>{

	public int compareTo(L o) {
		return 0;
	}
	
	public static <X extends GenericsBean<String, String>> X doStuff(String a, X b) {
		return null;
	}
	
	{
		GenericsBean<String, String> doStuff = doStuff("", new GenericsBean<String, String>());
	}

}
