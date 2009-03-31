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
public class LoadSchemaByXSDIncludeTest extends AbstractLoadSchemaTestCase {

	public void testLoadSchemaByRelativePath() {
		String xml = getSrcDir() + "/Device-DeviceNSOnly.xml";
		String xsd = getSrcDir() + "/Device-RelativeInclude-DeviceNS.xsd";
		assertDevice(load(xml, xsd));
	}
	
	
	// EMF doesn't seem to support this
	// public void testLoadSchemaByRelativePathChameleonNS() {
	// String xml = getSrcDir() + "/Device-DeviceNSOnly.xml";
	// String xsd = getSrcDir() + "/Device-RelativeInclude-ChameleonNS.xsd";
	// assertDevice(load(xml, xsd));
	//	}
}
