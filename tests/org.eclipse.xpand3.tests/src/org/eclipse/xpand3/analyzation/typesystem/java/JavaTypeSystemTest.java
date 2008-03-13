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
import org.eclipse.xpand3.analyzation.GenericsUtil;
import org.eclipse.xpand3.analyzation.TypeSystem;
import org.eclipse.xpand3.analyzation.TypeSystemFactory;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.DeclaredProperty;
import org.eclipse.xpand3.staticTypesystem.DeclaredStaticProperty;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.DeclaredTypeParameter;
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
	
	public void testGenericTypes() throws Exception {
		TypeSystem typeSystem = factory.getTypeSystem(GenericsBean.class
				.getName());
		DeclaredType declaredType = typeSystem.typeForName(GenericsBean.class
				.getSimpleName());
		assertNotNull(declaredType);
		EList<AbstractTypeReference> superTypes = declaredType.getSuperTypes();
		assertEquals(1,superTypes.size());
	}
	
	public void testGenericMethods() throws Exception {
		TypeSystem typeSystem = factory.getTypeSystem(GenericsBean.class
				.getName());
		DeclaredType typeForName = typeSystem.typeForName("String");
		Type typeRef = GenericsUtil.typeRef(typeForName);
		DeclaredFunction declaredFunction = typeSystem.functionForName("compareTo", typeRef, typeRef);
		assertNotNull(declaredFunction);
		
		declaredFunction = typeSystem.functionForName("doStuff", typeRef, typeRef);
		assertNotNull(declaredFunction);
		EList<DeclaredTypeParameter> declaredTypeParameters = declaredFunction.getDeclaredTypeParameters();
		assertEquals(1,declaredTypeParameters.size());
		DeclaredTypeParameter typeParameter = declaredTypeParameters.get(0);
		assertEquals("X",typeParameter.getName());
		assertEquals(1,typeParameter.getUpperBounds().size());
		Type t = (Type) typeParameter.getUpperBounds().get(0);
		assertEquals(typeSystem.typeForName(GenericsBean.class.getSimpleName()), t.getDeclaredType());
	}
}
