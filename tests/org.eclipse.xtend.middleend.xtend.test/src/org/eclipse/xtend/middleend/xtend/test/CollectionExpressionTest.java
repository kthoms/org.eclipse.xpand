/*******************************************************************************
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.middleend.xtend.test;

import java.util.Arrays;
import java.util.List;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.junit.Assert;
import org.junit.Test;

public class CollectionExpressionTest extends ExpressionTest {

	@Test
	public void testTypeSelect() {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testTypeSelect"), Arrays.asList (Arrays.asList(_person, _employee)));
		Assert.assertFalse(result.contains(_person));
		Assert.assertTrue(result.contains(_employee));
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void testSelect() {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testSelect"), Arrays.asList (Arrays.asList(_person, _employee, _otherPerson)));
		Assert.assertFalse(result.contains(_person));
		Assert.assertTrue(result.contains(_employee));
		Assert.assertTrue(result.contains(_otherPerson));
	}
	
	@Test
	public void testCollect() {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testCollect"), Arrays.asList (Arrays.asList(_person, _employee, _otherPerson)));
		Assert.assertTrue(result.contains(_person.getName()));
		Assert.assertTrue(result.contains(_employee.getName()));
		Assert.assertTrue(result.contains(_otherPerson.getName()));
		Assert.assertFalse(result.contains(_person));
	}
	
	@Test
	public void testTypeSelectPolymorphism() {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testTypeSelectPolymorphism"), Arrays.asList ((List)Arrays.asList(_person, _employee)));
		Assert.assertTrue(result.contains(_person));
		Assert.assertTrue(result.contains(_employee));
	}

}
