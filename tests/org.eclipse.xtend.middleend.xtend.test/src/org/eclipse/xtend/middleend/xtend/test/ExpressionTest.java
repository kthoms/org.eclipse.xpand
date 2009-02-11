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


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.junit.Before;
import org.junit.Test;

public class ExpressionTest extends JavaXtendTest {

	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		_bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::expressions", "iso-8859-1", _mms);;
		_ctx = BackendFacade.createExecutionContext (_bc.getFunctionDefContext(), _ts, true);
	}

	@Test
	public void testMultiDispatch() {
		assertEquals ("Person", BackendFacade.invoke(_ctx, new QualifiedName ("testMultiDispatch"), Arrays.asList (_person)).toString());
		assertEquals ("Employee", BackendFacade.invoke(_ctx, new QualifiedName ("testMultiDispatch"), Arrays.asList (_employee)).toString());
	}
	
	@Test
	public void testFeatureCall() {
		assertEquals ("Testerossa", BackendFacade.invoke(_ctx, new QualifiedName ("testFeatureCall"), Arrays.asList (_person)).toString());
		assertNull (BackendFacade.invoke(_ctx, new QualifiedName ("testFeatureCall"), Arrays.asList (_testPerson2)));
	}

	@Test
	public void testSetter() {
		assertEquals ("NewName", BackendFacade.invoke(_ctx, new QualifiedName ("testSetter"), Arrays.asList (_person)).toString());
	}
	
	@Test
	public void testOperationCall() {
		String param = "Param";
		assertEquals ("called:Param", BackendFacade.invoke (_ctx, new QualifiedName ("testOperationCall"), Arrays.asList (_person, param)).toString());
	}
	
	@Test 
	public void testIf() {
		assertEquals ("isFirst", BackendFacade.invoke (_ctx, new QualifiedName ("testIf"), Arrays.asList ("first")).toString());
		assertEquals ("isOther", BackendFacade.invoke (_ctx, new QualifiedName ("testIf"), Arrays.asList ("second")).toString());
	}
	
	@Test 
	public void testSwitch() {
		assertEquals ("firstCase", BackendFacade.invoke (_ctx, new QualifiedName ("testSwitch"), Arrays.asList ("first")).toString());
		assertEquals ("secondCase", BackendFacade.invoke (_ctx, new QualifiedName ("testSwitch"), Arrays.asList ("second")).toString());
		assertEquals ("defaultCase", BackendFacade.invoke (_ctx, new QualifiedName ("testSwitch"), Arrays.asList ("unknown")).toString());
	}
	
	@Test
	public void testCreate() {
		Person result = (Person) BackendFacade.invoke (_ctx, new QualifiedName ("testCreatePerson"), Arrays.asList ());
		assertTrue (result.getClass().equals(Person.class) && result.getName().equals("Tester") && result.getFirstName() == null ? true : false );
		Person result2 = (Person) BackendFacade.invoke (_ctx, new QualifiedName ("testCreatePersonThis"), Arrays.asList ());
		assertTrue (result2.getClass().equals(Person.class) && result2.getName().equals("Tester") && result2.getFirstName() == null ? true : false );
		Person result3 = (Person) BackendFacade.invoke (_ctx, new QualifiedName ("testCreatePersonVar"), Arrays.asList ());
		assertTrue (result3.getClass().equals(Person.class) && result3.getName().equals("Tester") && result3.getFirstName() == null ? true : false );
	}
}
