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

import junit.framework.TestCase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xpand3.analyzation.TypeSystem;
import org.eclipse.xpand3.analyzation.TypeSystemFactory;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredProperty;
import org.eclipse.xpand3.staticTypesystem.DeclaredStaticProperty;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.Type;

/**
 * @author Sven Efftinge
 * 
 */
public class JavaTypeSystemTest extends TestCase {
	private TypeSystemFactory factory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		factory = new TypeSystemFactory();
		factory
				.registerLanguageSpecificFactory(new JavaTypeSystemFactory(this));
	}

	public void testSimpleBean() throws Exception {
		TypeSystem typeSystem = factory.getTypeSystem(SimpleBean.class
				.getName());
		DeclaredType declaredType = typeSystem.typeForName(SimpleBean.class
				.getSimpleName());
		assertNotNull(declaredType);
		
		// property 
		DeclaredProperty property = declaredType.getProperties().get(0);
		assertEquals("foo", property.getName());
		assertEquals(factory.getBuiltInTypeSystem().typeForName(
				TypeSystem.STRING), ((Type) property.getType())
				.getDeclaredType());
		
		// check static property
		DeclaredStaticProperty staticProperty = declaredType.getStaticProperties().get(0);
		assertEquals("INSTANCE", staticProperty.getName());
		assertEquals(declaredType, staticProperty.getType().getDeclaredType());
	}
	
	public void testGenerics() throws Exception {
		TypeSystem typeSystem = factory.getTypeSystem(GenericsBean.class
				.getName());
		DeclaredType declaredType = typeSystem.typeForName(GenericsBean.class
				.getSimpleName());
		assertNotNull(declaredType);
		EList<AbstractTypeReference> superTypes = declaredType.getSuperTypes();
		assertEquals(1,superTypes.size());
	}
}
