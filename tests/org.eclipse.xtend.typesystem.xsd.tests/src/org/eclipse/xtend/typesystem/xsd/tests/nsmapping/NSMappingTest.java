/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests.nsmapping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class NSMappingTest extends AbstractTestCase {

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

	public void testNoNamespace() {
		Object o = runWorkflow("LoadXML-NoNamespace.oaw", "model");
		assertLoadcurve(o);
	}

	public void testWrongNamespace() {
		Object o = runWorkflow("LoadXML-WrongNamespace.oaw", "model");
		assertLoadcurve(o);
	}

}
