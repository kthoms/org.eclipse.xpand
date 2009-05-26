/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests.loadschema;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class LoadSchemaByXMLSchemalocationTest extends
		AbstractLoadSchemaTestCase {

	public void testLoadSchemaByRelativePath() {
		String xml = getSrcDir() + "/Loadcurve-RelativeSchemalocation.xml";
		assertLoadcurve(load(xml));
	}

	public void testLoadSchemaByClasspath() {
		String xml = getSrcDir() + "/Loadcurve-ClasspathSchemalocation.xml";
		assertLoadcurve(load(xml));
	}

	public void testLoadSchemaByPluginpath() {
		String xml = getSrcDir() + "/Loadcurve-PluginpathSchemalocation.xml";
		assertLoadcurve(load(xml));
	}

	public void testLoadSchemaInvalidSchemalocation() {
		String xml = getSrcDir() + "/Loadcurve-InvalidSchemalocation.xml";
		loadExpectFailure(xml);
	}

	public void testLoadSchemaPreloaded() {
		String xml = getSrcDir() + "/Loadcurve-InvalidSchemalocation.xml";
		String xsd = getSrcDir() + "/Loadcurve.xsd";
		assertLoadcurve(load(xml, xsd));
	}
}
