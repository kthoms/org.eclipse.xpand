/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.editor.extxpt;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

/**
 * @author Dennis Huebner - Initial contribution and API
 */
public class ExtendUtilsTest extends TestCase {

	private EObject eObject;
	private EObject nestedClazzEObject;

	@Override
	protected void setUp() throws Exception {
		EPackage rootPack = EcoreFactory.eINSTANCE.createEPackage();
		rootPack.setName("rootPack");
		EPackage subPack = EcoreFactory.eINSTANCE.createEPackage();
		subPack.setName("subPack");

		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName("SomeClass");

		EClass nestedEClass = EcoreFactory.eINSTANCE.createEClass();
		nestedEClass.setName("SomeNestedClass");

		rootPack.getEClassifiers().add(eClass);
		subPack.getEClassifiers().add(nestedEClass);
		rootPack.getESubpackages().add(subPack);

		nestedClazzEObject = subPack.getEFactoryInstance().create(nestedEClass);
		eObject = rootPack.getEFactoryInstance().create(eClass);
	}

	public void testPathForNestedEClazz() throws Exception {
		Assert.assertEquals("rootPack::subPack::Checks", ExtendUtils.appropriateCheckFile(nestedClazzEObject));
	}

	public void testAppropriateChecksFile() throws Exception {
		Assert.assertEquals("rootPack::subPack::Checks", ExtendUtils.appropriateCheckFile(nestedClazzEObject));
		Assert.assertEquals("rootPack::Checks", ExtendUtils.appropriateCheckFile(eObject));
	}

	public void testAppropriateStyleFile() throws Exception {
		Assert.assertEquals("rootPack::ItemLabelProvider", ExtendUtils.appropriateStyleFile(eObject));
	}

	public void testAppropriateProposalsFile() throws Exception {
		Assert.assertEquals("rootPack::Proposals", ExtendUtils.appropriateProposalsFile(eObject));
	}
}
