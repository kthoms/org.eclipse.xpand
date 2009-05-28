/*******************************************************************************
 * <copyright>
 * Copyright (c) 2009 itemis AG and others.
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
import org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackageFactory;
import org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackageMetaClass;
import org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackagePackage;

/**
 * @author Jan Köhnlein
 */
public class XtendXpandValidatorStandaloneTests extends TestCase {

	public void testExtXptValidator() {
		// workaround for MacOSX classloader bug
		ClassLoader classLoader = this.getClass().getClassLoader();
		Thread.currentThread().setContextClassLoader(classLoader);
		
		TestPackage testPackage = TestPackage.eINSTANCE;
		CheckEValidatorAdapter validator = new CheckEValidatorAdapter(
				testPackage);
		CheckFileWithContext checkFileWithContext = new CheckFileWithContext("org/eclipse/xtend/typesystem/emf/check/model/check.chk");
		checkFileWithContext.addImportedEPackageNsUri("http://oaw.org/test/subpackage");
		validator
				.addCheckFile(checkFileWithContext);
		EValidator.Registry.INSTANCE.put(testPackage, validator);

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
		
		myClass.getChildren().remove(childClass);
		SubpackageMetaClass subpackageObject = SubpackageFactory.eINSTANCE.createSubpackageMetaClass();
		myClass.setSubPackageRef(subpackageObject);
		diagnostic = Diagnostician.INSTANCE.validate(myClass);
		assertEquals("Validation should have a warning", Diagnostic.WARNING,
				diagnostic.getSeverity());
		
		CheckEValidatorAdapter subValidator = new CheckEValidatorAdapter(SubpackagePackage.eINSTANCE);
		checkFileWithContext = new CheckFileWithContext("org/openarchitectureware/adapter/emf/check/model/check.chk");
		checkFileWithContext.addImportedEPackageNsUri("http://oaw.org/test/subpackage");
		subValidator.addCheckFile(checkFileWithContext);
		EValidator.Registry.INSTANCE.put(SubpackagePackage.eINSTANCE, validator);
		diagnostic = Diagnostician.INSTANCE.validate(subpackageObject);
		assertEquals("Validation should have a warning", Diagnostic.WARNING,
				diagnostic.getSeverity());
		
	}
}
