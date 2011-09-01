/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestFactory.java,v 1.3 2009/01/12 19:00:57 pschonbac Exp $
 */
package org.eclipse.xtend.typesystem.emf.check.model.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage
 * @generated
 */
public interface TestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestFactory eINSTANCE = org.eclipse.xtend.typesystem.emf.check.model.test.impl.TestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>My Meta Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Meta Class</em>'.
	 * @generated
	 */
	MyMetaClass createMyMetaClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestPackage getTestPackage();

} //TestFactory
