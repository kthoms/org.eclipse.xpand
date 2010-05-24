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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.junit.Before;
import org.junit.Test;

public class OperatorExpressionTest extends JavaXtendTest {
	

	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		_bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::expressions", "iso-8859-1", _mms);;
		_ctx = BackendFacade.createExecutionContext (_bc.getFunctionDefContext(), _ts, true);
	}
	
	@Test
	public void testEqualsNull () {
		Person testPerson1 = new Person();
		testPerson1.setName("TestPerson");
		
		assertFalse ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testEqualsNull"), Arrays.asList (testPerson1)));
		assertTrue ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testEqualsNull"), Arrays.asList (_testPerson2)));
	}
	
	@Test
	public void testNotEqualsNull () {
		Person testPerson1 = new Person();
		testPerson1.setName("TestPerson");
		
		assertTrue ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testNotEqualsNull"), Arrays.asList (testPerson1)));
		assertFalse ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testNotEqualsNull"), Arrays.asList (_testPerson2)));
	}
	
	@Test
	public void testLess () {
		assertTrue ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testLess"), Arrays.asList (5L)));
		assertFalse ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testLess"), Arrays.asList (7L)));
		assertFalse ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testLess"), Arrays.asList (9L)));
	}
	
	@Test
	public void testLessOrEqual () {
		assertTrue ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testLessOrEqual"), Arrays.asList (5L)));
		assertTrue ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testLessOrEqual"), Arrays.asList (7L)));
		assertFalse ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testLessOrEqual"), Arrays.asList (9L)));
	}
	
	@Test
	public void testGreater () {
		assertFalse ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testGreater"), Arrays.asList (5L)));
		assertFalse ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testGreater"), Arrays.asList (7L)));
		assertTrue ((Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testGreater"), Arrays.asList (9L)));
	}
	
	@Test
	public void testGreaterOrEqual() {
		assertFalse ((Boolean) BackendFacade.invoke(_ctx, new QualifiedName ("testGreaterOrEqual"), Arrays.asList (5L)));
		assertTrue ((Boolean) BackendFacade.invoke(_ctx, new QualifiedName ("testGreaterOrEqual"), Arrays.asList (7L)));
		assertTrue ((Boolean) BackendFacade.invoke(_ctx, new QualifiedName ("testGreaterOrEqual"), Arrays.asList (9L)));
	}
}
