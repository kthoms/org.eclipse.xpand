/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubpackageFactory.java,v 1.1 2008/10/21 07:32:51 jkohnlein Exp $
 */
package org.eclipse.xtend.typesystem.emf.check.model.test.subpackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackagePackage
 * @generated
 */
public interface SubpackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubpackageFactory eINSTANCE = org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.impl.SubpackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Meta Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Class</em>'.
	 * @generated
	 */
	SubpackageMetaClass createSubpackageMetaClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SubpackagePackage getSubpackagePackage();

} //SubpackageFactory
