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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.eclipse.xtend.middleend.xtend.XtendComponent;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.util.stdlib.PropertiesReader;
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
	
	@Test
	public void testStdLibGetProperty() {
        final List<MetaModel> mms = new ArrayList<MetaModel> ();
        mms.add (new JavaBeansMetaModel ());

        WorkflowContext ctx = new WorkflowContextDefaultImpl();
        Person p = new Person();
        p.setName("Tester");
        p.setFirstName("Testerossa");

		ctx.set("MODEL_SLOT", p);
		Issues issues = new IssuesImpl();
        Outlet out = new Outlet("out4");
        Collection<Outlet> outlets = new ArrayList<Outlet>();
        outlets.add(out);
        
        PropertiesReader propReader = new PropertiesReader();
        propReader.addPropertiesFile ("src/org/eclipse/xtend/middleend/xtend/test/test.properties");
        
        propReader.invoke(ctx, new NullProgressMonitor(), issues);
        XtendComponent xtComp = new XtendComponent();
        xtComp.addMetaModel(mms.get(0));
        xtComp.setInvoke("org::eclipse::xtend::middleend::xtend::test::expressions::testStdLibGetProperty(\"testProperty\")");
        xtComp.setOutputSlot("ResultSlot");
        xtComp.invoke(ctx, new NullProgressMonitor(), issues);
        Object result = ctx.get("ResultSlot");
        
        assertNotNull (result);
        assertEquals("testPropertyValue", result);
	}
	
	@Test
	public void testThisParameter() {
		assertEquals ("thisthatfirstsecondNULLlast", BackendFacade.invoke (_ctx, new QualifiedName ("testThisParameter"), Arrays.asList ("this")).toString());		
	}
}
