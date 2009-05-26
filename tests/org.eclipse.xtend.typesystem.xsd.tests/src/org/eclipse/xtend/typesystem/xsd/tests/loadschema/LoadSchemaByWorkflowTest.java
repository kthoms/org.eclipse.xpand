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
public class LoadSchemaByWorkflowTest extends AbstractLoadSchemaTestCase {

	public void testLoadSchemaByClasspath() {
		String xml = getSrcDir() + "/Loadcurve-noSchemaLocation.xml";
		String xsd = getSrcDir() + "/Loadcurve.xsd";
		assertLoadcurve(load(xml, xsd));
	}

	public void testLoadSchemaByPluginPath() {
		String xml = getSrcDir() + "/Loadcurve-noSchemaLocation.xml";
		String xsd = getPluginDir() + "/Loadcurve.xsd";
		assertLoadcurve(load(xml, xsd));
	}

	public void testLoadSchemaByInvalidPath() {
		String xml = getSrcDir() + "/Loadcurve-noSchemaLocation.xml";
		String xsd = getPluginDir() + "/NonExistingLoadcurve.xsd";
		loadExpectFailure(xml, xsd);
	}
	
	public void testLoadSchemaWithSpaces() {
		String xml = getSrcDir() + "/Loadcurve-noSchemaLocation.xml";
		String xsd = getPluginDir() + "/Loadcurve with spaces in filename.xsd";
		assertLoadcurve(load(xml, xsd));
	}

}
