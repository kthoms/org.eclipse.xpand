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
public class LoadSchemaByXSDImportTest extends AbstractLoadSchemaTestCase {

	public void testLoadSchemaByRelativePath() {
		String xml = getSrcDir() + "/Device.xml";
		String xsd = getSrcDir() + "/Device-RelativeImport.xsd";
		assertDevice(load(xml, xsd));
		assertGlobalPackage("deviceRelativeImport");
		assertGlobalPackage("loadcurve");
	}

	public void testLoadSchemaByClassath() {
		String xml = getSrcDir() + "/Device.xml";
		String xsd = getSrcDir() + "/Device-ClasspathImport.xsd";
		assertDevice(load(xml, xsd));
	}

	public void testLoadSchemaByPluginpath() {
		String xml = getSrcDir() + "/Device.xml";
		String xsd = getSrcDir() + "/Device-PluginpathImport.xsd";
		assertDevice(load(xml, xsd));
	}

	// To provide more useful error messages for this TestCase, it would be
	// necessary to make the ResourceSet use a custom URIConverter. Otherwise,
	// Exceptions that occur while the loading process are swallowed by
	// org.eclipse.xsd.impl.XSDSchemaDirectiveImpl.resolve(String, String)
	public void testLoadSchemaInvalidImport() {
		String xml = getSrcDir() + "/Device.xml";
		String xsd = getSrcDir() + "/Device-InvalidImport.xsd";
		loadExpectFailure(xml, xsd);
	}

	public void testLoadSchemaPreloaded() {
		String xml = getSrcDir() + "/Device.xml";
		String xsd1 = getSrcDir() + "/Loadcurve.xsd";
		String xsd2 = getSrcDir() + "/Device-InvalidImport.xsd";
		assertDevice(load(xml, xsd1, xsd2));
	}
}
