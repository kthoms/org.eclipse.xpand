/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests.extendxmlreader;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class XtendXMLReaderTest extends AbstractTestCase {

	protected void assertLoadcurve(Object obj) {
		assertInstanceOf(obj, EObject.class);
		EObject e = (EObject) obj;
		assertEquals("LoadCurve", e.eClass().getName());
		assertEquals("MyLoadcurve", eGet(e, "name"));
		@SuppressWarnings("unchecked")
		EList<EObject> ml = eGet(e, "measurement", EList.class);
		assertTrue(ml.size() > 0);
		assertEquals(new Integer(5), eGet(ml.get(0), "time"));
	}

	@SuppressWarnings("unchecked")
	public void testReadXMLPreloaded() {
		Map<String, String> p = createWFParams();
		p.put("ext", "readXMLSimple");
		p.put("xmlfile", getSrcDir() + "/Loadcurve.xml");
		Object obj = runWorkflow("InvokeXpand-preloadedXSD.oaw", "model", p);
		assertLoadcurve(obj);
	}

	@SuppressWarnings("unchecked")
	public void testReadXML() {
		Map<String, String> p = createWFParams();
		p.put("ext", "readXMLSimple");
		p.put("xmlfile", getSrcDir() + "/Loadcurve.xml");
		Object obj = runWorkflow("InvokeXpand.oaw", "model", p);
		assertLoadcurve(obj);
	}

	@SuppressWarnings("unchecked")
	public void testReadXMLWithContext() {
		Map<String, String> p = createWFParams();
		p.put("ext", "readXMLWithContext");
		Object obj = runWorkflow("InvokeXpand-preloadedXML.oaw", "model", p);
		assertInstanceOf(obj, Collection.class);
		Collection c = (Collection) obj;
		for (Object o : c)
			assertLoadcurve(o);
	}

	@SuppressWarnings("unchecked")
	public void testReadDocrootAll() {
		Map<String, String> p = createWFParams();
		p.put("ext", "readDocRootAll");
		Object obj = runWorkflow("InvokeXpand-preloadedXML.oaw", "model", p);
		assertInstanceOf(obj, Collection.class);
		Collection c = (Collection) obj;
		for (Object o : c)
			assertLoadcurve(eGet((EObject) o, "loadCurve"));
	}

	@SuppressWarnings("unchecked")
	public void testReadXMLWithReferencedMM() {
		Map<String, String> p = createWFParams();
		p.put("ext", "readXMLWithMM");
		p.put("xmlfile", getSrcDir() + "/Loadcurve-noSchemaLocation.xml");
		Object obj = runWorkflow("InvokeXpand-preloadedXSD.oaw", "model", p);
		assertLoadcurve(obj);
	}

}
