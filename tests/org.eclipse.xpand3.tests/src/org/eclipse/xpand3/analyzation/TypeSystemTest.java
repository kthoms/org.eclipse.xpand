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

import org.eclipse.xpand3.staticTypesystem.Type;

import junit.framework.TestCase;

/**
 * @author Sven Efftinge
 *
 */
public class TypeSystemTest extends TestCase {
	public void testSimple() throws Exception {
		TypeSystem ts = TypeSystem.BUILTIN_TYPESYSTEM;
		Type typeForName = ts.typeForName("Map", ts.typeForName("String"), ts.typeForName("Object"));
		assertNotNull(typeForName);
	}
}
