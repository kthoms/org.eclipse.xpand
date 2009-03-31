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
package org.eclipse.xtend.typesystem.xsd.tests.ecorebuilder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtend.typesystem.xsd.builder.OawEcoreBuilder;
import org.eclipse.xtend.typesystem.xsd.builder.OawXSDResource;
import org.eclipse.xtend.typesystem.xsd.builder.OawXSDResourceSet;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class EcoreBuilderTest extends AbstractTestCase {
	protected OawEcoreBuilder builder;

	protected OawXSDResourceSet resourceSet;

	protected void assertPackageExists(String pkgName) {
		for (EPackage p : resourceSet.getPackages())
			if (pkgName.equals(p.getName()))
				return;
		fail("Package '" + pkgName + "' not found. Builder:" + builder);
	}

	private OawXSDResource loadXSD(String file) {
		URI uri = EcoreUtil2.getURI(getSrcDir() + file);
		Resource r = resourceSet.getResource(uri, true);
		assertInstanceOf(r, OawXSDResource.class);
		return (OawXSDResource) r;
	}

	protected void setUp() throws Exception {
		super.setUp();
		resourceSet = new OawXSDResourceSet();
		builder = new OawEcoreBuilder(resourceSet);
	}

	public void testSchemaWithoutElements() {
		OawXSDResource xsd = loadXSD("/SchemaWithoutGlobalElements.xsd");
		xsd.generateECore();
		assertPackageExists("schemaWithoutGlobalElements");
	}

	public void testSchemaWithoutElementsWithInclude() {
		OawXSDResource xsd = loadXSD("/SchemaWithoutGlobalElementsWithInclude.xsd");
		xsd.generateECore();
		assertPackageExists("schemaWithoutGlobalElementsWithInclude");
	}

	public void testSchemaWithoutElementsWithInclude2() {
		OawXSDResource xsd = loadXSD("/SchemaWithoutGlobalElementsWithInclude2.xsd");
		xsd.generateECore();
		assertPackageExists("schemaWithoutGlobalElementsWithInclude2");
	}

	// public void testX() {
	// // URI uri = URI.createURI("src/model/w3c/XMLSchema.xsd");
	// URI uri = URI.createURI("src/model/w3c/SVG.xsd");
	// Resource r = resourceSet.getResource(uri, true);
	// assertInstanceOf(r, OawXSDResource.class);
	// OawXSDResource or = (OawXSDResource) r;
	// or.generateECore();
	// }
}
