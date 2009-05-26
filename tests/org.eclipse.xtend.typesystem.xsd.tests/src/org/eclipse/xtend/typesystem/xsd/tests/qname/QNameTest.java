/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests.qname;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.expression.TypeSystemImpl;
import org.eclipse.xtend.typesystem.Operation;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.emf.EClassType;
import org.eclipse.xtend.typesystem.xsd.XSDMetaModel;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;
import org.eclipse.xtend.typesystem.xsd.type.QNameType;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class QNameTest extends AbstractTestCase {
	public void testReadQNameTypes() {
		EObject model = (EObject) runWorkflow("QName-Read.oaw", "model");
		Object qname1 = eGet(model, "qname1");
		Object qname2 = eGet(model, "qname2");
		Object qname3 = eGet(model, "qname3");
		assertTrue(qname1 instanceof QName);
		assertTrue(qname2 instanceof QName);
		assertTrue(qname3 instanceof QName);
		assertFilesEqual("qname.txt", "QName-Read-Expected.txt");
	}

	public void testCreateQNameTypes() {
		EObject model = (EObject) runWorkflow("QName-Create.oaw", "model");
		Object qname1 = eGet(model, "qname1");
		Object qname2 = eGet(model, "qname2");
		Object qname3 = eGet(model, "qname3");
		assertTrue(qname1 instanceof QName);
		assertTrue(qname2 instanceof QName);
		assertTrue(qname3 instanceof QName);
		assertFilesEqual("qname.txt", "QName-Create-Expected.txt");
	}

	public void testName() {
		XSDMetaModel mm = new XSDMetaModel();
		mm.setTypeSystem(new TypeSystemImpl());
		String n = mm.getQNameType().getName();
		Type qname = mm.getTypeForName(n);
		assertInstanceOf(qname, QNameType.class);
	}

	public void testSetProperty() {
		EObject model = (EObject) runWorkflow("QName-Read.oaw", "model");
		// System.out.println(model);
		// Object qname1 = eGet(model, "qname1");
		XSDMetaModel mm = new XSDMetaModel();
		mm.setTypeSystem(new TypeSystemImpl());
		Type eobjtype = mm.getType(model);
		assertInstanceOf(eobjtype, EClassType.class);
		Operation op = eobjtype.getOperation("setQname1", new Type[] { mm
				.getQNameType() });
		System.out.println("Operation:" + op);
	}

}
