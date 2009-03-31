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
package org.eclipse.xtend.typesystem.xsd.tests.xsdecorebuilder;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.typesystem.xsd.builder.OawXSDResourceSet;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class XSDEcoreBuilderTest extends AbstractTestCase {
	public void testNameMapping() {
		OawXSDResourceSet rs = new OawXSDResourceSet();
		rs.loadAndGenerate(URI.createFileURI(getPluginDir()
				+ "/NameConversion.xsd"));

		// System.out.println(EmfFormatter.objToStr(rs.getPackages(), ""));

		EcorePackage p = EcorePackage.eINSTANCE;

		assertType(rs, p.getEClass(), "UppercaseComplexType");
		assertType(rs, p.getEDataType(), "CamelCaseSimpleType");
		assertType(rs, p.getEDataType(), "UppercaseSimpleType");
		assertType(rs, p.getEAttribute(), "uppercaseElement");
		assertType(rs, p.getEAttribute(), "uppercaseAttribute");
		assertType(rs, p.getEDataType(), "UnderscoreSeparatedSimpleType");
		assertType(rs, p.getEEnumLiteral(), "UPPERCASEENUMLITERAL1");
	}

	private void assertType(OawXSDResourceSet rs, EClass clazz, String name) {
		for (EPackage r : rs.getPackages()) {
			TreeIterator<EObject> i = r.eAllContents();
			EStructuralFeature f = clazz.getEStructuralFeature("name");
			if (f == null)
				throw new RuntimeException(clazz + " has no feature 'name'");
			while (i.hasNext()) {
				EObject n = i.next();
				if (n.eClass().equals(clazz) && name.equals(n.eGet(f)))
					return;
			}
		}
		fail(name + " not found");
	}

}
