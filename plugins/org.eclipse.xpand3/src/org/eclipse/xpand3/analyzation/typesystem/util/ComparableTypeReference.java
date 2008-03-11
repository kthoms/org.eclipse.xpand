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
package org.eclipse.xpand3.analyzation.typesystem.util;

import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;

/**
 * @author Sven Efftinge
 *
 */
public class ComparableTypeReference implements Comparable<ComparableTypeReference> {
	
	private AbstractTypeReference ref = null;
	
	public ComparableTypeReference(AbstractTypeReference ref) {
		this.ref = ref;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(ComparableTypeReference o) {
		return 0;//new ComparableDeclaration(TypeUtil.getDeclaredType(o.ref));
	}
	
}
