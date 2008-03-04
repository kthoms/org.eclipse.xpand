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
package org.eclipse.xand3.analyzation;

import java.io.Serializable;

/**
 * @author Sven Efftinge
 *
 */
public class RefTest<T extends Serializable> implements Comparable<T>{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class<RefTest> cls = RefTest.class;
		cls.getTypeParameters();
		cls.getDeclaredMethods();

	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
