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
package org.eclipse.xtend.typesystem.xsd.tests.demos;

import java.net.URL;
import java.util.Map;

import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class TestDemos extends AbstractTestCase {
	public void testM2MEcore2XSD() {
		runDemoWorkflow("/xsd/m2m/ecore2xsd/ecore2xsd.oaw");
	}

	public void testM2MNews2XHTML() {
		runDemoWorkflow("/xsd/m2m/news2xhtml/news2xhtml.oaw");
	}

	public void testM2MXML2SVG() {
		runDemoWorkflow("/xsd/m2m/xml2svg/xml2svg.oaw");
	}

	public void testM2TGenmodel() {
		runDemoWorkflow("/xsd/m2t/genmodel/genmodel.oaw");
	}

	public void testM2TMinimal() {
		runDemoWorkflow("/xsd/m2t/minimal/minimal.oaw");
	}

	public void testM2TXML2JavaWizard() {
		runDemoWorkflow("/xsd/m2t/xml2javawizard/xml2javawizard.oaw");
	}

	@SuppressWarnings("unchecked")
	public void runDemoWorkflow(String wfFile) {
		URL u = getClass().getResource(wfFile);
		if (u == null || "".equals(u))
			throw new RuntimeException("File " + wfFile
					+ " not found on classpath. context:" + getClass());
		String path = u.toString();
		path = path.substring(0, (path.length() - wfFile.length()) + 1);
		Map<String, String> p = createWFParams();
		p.put("plugin-src", path);
		runWorkflow(wfFile, p);
	}

}
