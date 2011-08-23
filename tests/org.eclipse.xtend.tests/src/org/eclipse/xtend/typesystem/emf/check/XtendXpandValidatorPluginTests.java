/*******************************************************************************
 * <copyright>
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * committers of openArchitectureWare - initial API and implementation
 * </copyright>
 *******************************************************************************/

package org.eclipse.xtend.typesystem.emf.check;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum;
import org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass;
import org.eclipse.xtend.typesystem.emf.check.model.test.TestFactory;
import org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage;

/**
 * @author Jan Köhnlein
 */
public class XtendXpandValidatorPluginTests extends TestCase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		CheckRegistry.getInstance();
	}

	public void testExtXptValidator() {
		// Plugin test
		EValidator validator = EValidator.Registry.INSTANCE.getEValidator(TestPackage.eINSTANCE);
		assertNotNull("Validator registration failed", validator);
		assertTrue("Wrong validator class", validator instanceof CheckEValidatorAdapter);
		MyMetaClass myClass = TestFactory.eINSTANCE.createMyMetaClass();
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(myClass);
		assertEquals("Validation should have failed", Diagnostic.ERROR, diagnostic.getSeverity());

		myClass.setName("Hugo");
		myClass.setEnumAttr(MyEnum.X);
		diagnostic = Diagnostician.INSTANCE.validate(myClass);
		assertEquals("Validation should have succeeded", Diagnostic.OK, diagnostic.getSeverity());
		MyMetaClass childClass = TestFactory.eINSTANCE.createMyMetaClass();
		childClass.setName("");
		myClass.getChildren().add(childClass);
		diagnostic = Diagnostician.INSTANCE.validate(myClass);
		assertEquals("Validation should have a warning", Diagnostic.WARNING, diagnostic.getSeverity());
	}

	public void testExtXptValidatorFeatureScope() {
		MyMetaClass objectUnderTest = TestFactory.eINSTANCE.createMyMetaClass();
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(objectUnderTest);
		assertEquals("Validation should have failed", Diagnostic.ERROR, diagnostic.getSeverity());
		assertTrue("There are any children in the Diagnostic", !diagnostic.getChildren().isEmpty());
		Diagnostic firstChild = diagnostic.getChildren().get(0);
		assertEquals(objectUnderTest, firstChild.getData().get(0));

		// feature check
		Object feature = firstChild.getData().get(1);
		assertNotNull("Feature is not set", feature);
		assertTrue("Wrong type '" + feature.getClass() + "', should be instance of '" + String.class + "'.",
				String.class.isInstance(feature));
		EObject eO = (EObject) firstChild.getData().get(0);
		EStructuralFeature eSF = eO.eClass().getEStructuralFeature(feature.toString());
		assertNotNull("EStructuralFeature " + feature + " can't be resolved", eSF);
	}
}
