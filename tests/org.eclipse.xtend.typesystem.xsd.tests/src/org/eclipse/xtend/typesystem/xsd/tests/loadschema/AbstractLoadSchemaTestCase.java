/*******************************************************************************
 * Copyright (c) 2005 - 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.typesystem.xsd.tests.loadschema;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public abstract class AbstractLoadSchemaTestCase extends AbstractTestCase {

	protected void assertDevice(Object obj) {
		assertInstanceOf(obj, EObject.class);
		EObject e = (EObject) obj;
		assertEquals("Device", e.eClass().getName());
		assertEquals("Magicwash", eGet(e, "name"));
		@SuppressWarnings("unchecked")
		EList<EObject> ml = eGet(e, "mode", EList.class);
		assertTrue(ml.size() > 0);
		assertEquals("30", eGet(ml.get(0), "name"));
	}

	protected void assertGlobalPackage(String name) {
		for (Object o : EPackage.Registry.INSTANCE.values())
			if (o instanceof EPackage)
				if (name.equals(((EPackage) o).getName()))
					return;
		fail("Package '" + name + "' has not been registered globally.");
	}

	protected void assertLoadcurve(Object obj) {
		assertLoadcurve(obj, "LoadCurve");
	}

	protected void assertLoadcurve(Object obj, String rootType) {
		assertInstanceOf(obj, EObject.class);
		EObject e = (EObject) obj;
		assertEquals(rootType, e.eClass().getName());
		assertEquals("MyLoadcurve", eGet(e, "name"));
		@SuppressWarnings("unchecked")
		EList<EObject> ml = eGet(e, "measurement", EList.class);
		assertTrue(ml.size() > 0);
		assertEquals(new Integer(5), eGet(ml.get(0), "time"));
	}

	protected Object load(String xml) {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("xmlfile", xml);
		Object o = runWorkflow("LoadXML.oaw", "model", p);
		assertNotNull(o);
		return o;
	}

	protected Object load(String xml, String xsd) {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("xmlfile", xml);
		p.put("xsdfile", xsd);
		Object o = runWorkflow("LoadXML-withOneMM.oaw", "model", p);
		assertNotNull(o);
		return o;
	}

	protected Object load(String xml, String xsd1, String xsd2) {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("xmlfile", xml);
		p.put("xsdfile1", xsd1);
		p.put("xsdfile2", xsd2);
		Object o = runWorkflow("LoadXML-withTwoMM.oaw", "model", p);
		assertNotNull(o);
		return o;
	}

	protected void loadExpectFailure(String xml) {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("xmlfile", xml);
		failWorkflow("LoadXML.oaw", "model", p);
	}

	protected void loadExpectFailure(String xml, String xsd) {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("xmlfile", xml);
		p.put("xsdfile", xsd);
		failWorkflow("LoadXML-withOneMM.oaw", "model", p);
	}

}
