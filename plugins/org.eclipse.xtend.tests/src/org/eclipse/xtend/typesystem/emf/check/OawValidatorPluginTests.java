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
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum;
import org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass;
import org.eclipse.xtend.typesystem.emf.check.model.test.TestFactory;
import org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage;

/**
 * @author Jan Köhnlein
 */
public class OawValidatorPluginTests extends TestCase {

	public void testOawValidator() {
		// Plugin test
		CheckRegistry.getInstance();
		EValidator validator = EValidator.Registry.INSTANCE
				.getEValidator(TestPackage.eINSTANCE);
		assertNotNull("Validator registration failed", validator);
		assertTrue("Wrong validator class",
				validator instanceof CheckEValidatorAdapter);
		MyMetaClass myClass = TestFactory.eINSTANCE.createMyMetaClass();
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(myClass);
		assertEquals("Validation should have failed", Diagnostic.ERROR,
				diagnostic.getSeverity());
		myClass.setName("Hugo");
		myClass.setEnumAttr(MyEnum.X);
		diagnostic = Diagnostician.INSTANCE.validate(myClass);
		assertEquals("Validation should have succeeded", Diagnostic.OK,
				diagnostic.getSeverity());
		MyMetaClass childClass = TestFactory.eINSTANCE.createMyMetaClass();
		childClass.setName("");
		myClass.getChildren().add(childClass);
		diagnostic = Diagnostician.INSTANCE.validate(myClass);
		assertEquals("Validation should have a warning", Diagnostic.WARNING,
				diagnostic.getSeverity());
	}
}
