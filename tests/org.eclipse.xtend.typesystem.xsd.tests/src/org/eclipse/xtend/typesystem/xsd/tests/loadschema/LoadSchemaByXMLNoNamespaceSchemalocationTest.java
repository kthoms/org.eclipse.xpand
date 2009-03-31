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

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class LoadSchemaByXMLNoNamespaceSchemalocationTest extends
		AbstractLoadSchemaTestCase {

	public void testLoadSchemaByRelativePath() {
		String xml = getSrcDir() + "/Loadcurve-noNamespaceSchemaLocation.xml";
		assertLoadcurve(load(xml), "LoadCurveType");
	}

	public void testLoadSchemaByClasspath() {
		String xml = getSrcDir()
				+ "/Loadcurve-noNamespaceClasspathSchemaLocation.xml";
		assertLoadcurve(load(xml), "LoadCurveType");
	}

	public void testLoadSchemaByPluginpath() {
		String xml = getSrcDir()
				+ "/Loadcurve-noNamespacePluginpathSchemaLocation.xml";
		assertLoadcurve(load(xml), "LoadCurveType");
	}

	public void testLoadSchemaInvalidSchemalocation() {
		String xml = getSrcDir()
				+ "/Loadcurve-InvalidNoNamespaceSchemaLocation.xml";
		loadExpectFailure(xml);
	}

	public void testLoadSchemaPreloaded() {
		String xml = getSrcDir()
				+ "/Loadcurve-InvalidNoNamespaceSchemaLocation.xml";
		String xsd = getSrcDir() + "/Loadcurve-noTargetNS.xsd";
		assertLoadcurve(load(xml, xsd), "LoadCurveType");
	}
}
