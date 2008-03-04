/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationFactory.java,v 1.1 2008/03/04 10:52:59 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.declaration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage
 * @generated
 */
public interface DeclarationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarationFactory eINSTANCE = org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Declared Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Type</em>'.
	 * @generated
	 */
	DeclaredType createDeclaredType();

	/**
	 * Returns a new object of class '<em>Declared Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Operation</em>'.
	 * @generated
	 */
	DeclaredOperation createDeclaredOperation();

	/**
	 * Returns a new object of class '<em>Declared Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Function</em>'.
	 * @generated
	 */
	DeclaredFunction createDeclaredFunction();

	/**
	 * Returns a new object of class '<em>Declared Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Property</em>'.
	 * @generated
	 */
	DeclaredProperty createDeclaredProperty();

	/**
	 * Returns a new object of class '<em>Declared Static Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Static Property</em>'.
	 * @generated
	 */
	DeclaredStaticProperty createDeclaredStaticProperty();

	/**
	 * Returns a new object of class '<em>Declared Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Type Parameter</em>'.
	 * @generated
	 */
	DeclaredTypeParameter createDeclaredTypeParameter();

	/**
	 * Returns a new object of class '<em>Declared Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Parameter</em>'.
	 * @generated
	 */
	DeclaredParameter createDeclaredParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeclarationPackage getDeclarationPackage();

} //DeclarationFactory
