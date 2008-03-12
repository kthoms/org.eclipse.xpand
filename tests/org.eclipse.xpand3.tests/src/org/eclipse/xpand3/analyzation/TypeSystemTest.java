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
package org.eclipse.xpand3.analyzation;

import junit.framework.TestCase;

import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.Type;
import org.eclipse.xpand3.staticTypesystem.WildcardType;

/**
 * @author Sven Efftinge
 *
 */
public class TypeSystemTest extends TestCase {
	
	public void testSimple() throws Exception {
		TypeSystem ts = TypeSystem.BUILTIN_TYPESYSTEM;
		DeclaredType map = ts.typeForName("Map");
		DeclaredType string = ts.typeForName("String");
		DeclaredType object = ts.typeForName("Object");
		Type typeRef = GenericsUtil.typeRef(map,GenericsUtil.wildCard(GenericsUtil.typeRef(string)), GenericsUtil.typeRef(object));
		assertNotNull(typeRef);
		WildcardType wct = (WildcardType) typeRef.getActualTypeArguments().get(0);
		assertTrue(string == ((Type)wct.getUpperBounds().get(0)).getDeclaredType());
	}
	
	
}
