/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests.xmlwriter;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class XMLWriterTest extends AbstractTestCase {
	protected void setUp() throws Exception {
		super.setUp();
		Iterator<String> i = EPackage.Registry.INSTANCE.keySet().iterator();
		while (i.hasNext())
			if (i.next().contains("www.eclipse.org/modeling/xpand/example"))
				i.remove();
	}

	public void testSimpleWorkflow() {
		runWorkflow("XMLWriter-ReadWrite.oaw");
	}

	public void testCreateRootElement() {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("method", "createRootElement");
		runWorkflow("XMLWriter-CreateXML.oaw", "model", p);
		assertFilesEqual("CreateXML-createRootElement.xml",
				"XMLWriter-Expected-createRootElement.xml");
	}

	public void testOptions() {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("optkey", "ENCODING");
		p.put("optval", "ISO-8859-9");
		runWorkflow("XMLWriter-TestOption.oaw", "model", p);
		assertFilesEqual("TestOption.xml", "XMLWriter-Expected-TestOption.xml");
	}
	
	public void testDoctypeInfo() {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		runWorkflow("XMLWriter-TestDoctypeInfo.oaw", "model", p);
		assertFilesEqual("TestDoctypeInfo.xml", "XMLWriter-Expected-TestDoctypeInfo.xml");
	}

	public void testCreateRootElementECore() {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("method", "createRootElement");
		runWorkflow("XMLWriter-CreateXMLEcore.oaw", "model", p);
		assertFilesEqual("CreateXML-ECore-createRootElement.xml",
				"XMLWriter-Expected-createRootElement-ECore.xml");
	}

	public void testCreateRootElement2() {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("method", "createRootElement2");
		runWorkflow("XMLWriter-CreateXML.oaw", "model", p);
		assertFilesEqual("CreateXML-createRootElement.xml",
				"XMLWriter-Expected-createRootElement.xml");
	}

	public void testCreateDocumentRoot() {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("method", "createDocumentRoot");
		runWorkflow("XMLWriter-CreateXML.oaw", "model", p);
		assertFilesEqual("CreateXML-createDocumentRoot.xml",
				"XMLWriter-Expected-createDocumentRoot.xml");
	}

	public void testCreateDocumentRootEcore() {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("method", "createDocumentRoot");
		runWorkflow("XMLWriter-CreateXMLEcore.oaw", "model", p);
		assertFilesEqual("CreateXML-ECore-createDocumentRoot.xml",
				"XMLWriter-Expected-createDocumentRoot-ECore.xml");
	}

	public void testMultiFileInline() {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p
				.put("expression", "'" + getSrcGenDir()
						+ "/'+file.name+'-inline.txt'");
		runWorkflow("XMLWriter-MultiFile.oaw", p);

	}

	public void testMultiFileExtFile() {
		@SuppressWarnings("unchecked")
		Map<String, String> p = createWFParams();
		p.put("expression", "'" + getSrcGenDir() + "/'+" + getSrcPkg()
				+ "::XMLWriter-CreateXML::GetFileName(file)");
		runWorkflow("XMLWriter-MultiFile.oaw", p);
	}

}
