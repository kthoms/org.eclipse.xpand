/**
 * <copyright>
 * </copyright>
 *
 * $Id: StaticTypesystemFactory.java,v 1.1 2008/03/17 14:39:20 jkohnlein Exp $
 */
package org.eclipse.xpand3.staticTypesystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage
 * @generated
 */
public interface StaticTypesystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaticTypesystemFactory eINSTANCE = org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Variable</em>'.
	 * @generated
	 */
	TypeVariable createTypeVariable();

	/**
	 * Returns a new object of class '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void Type</em>'.
	 * @generated
	 */
	VoidType createVoidType();

	/**
	 * Returns a new object of class '<em>Wildcard Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wildcard Type</em>'.
	 * @generated
	 */
	WildcardType createWildcardType();

	/**
	 * Returns a new object of class '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Type</em>'.
	 * @generated
	 */
	FunctionType createFunctionType();

	/**
	 * Returns a new object of class '<em>Declared Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Type</em>'.
	 * @generated
	 */
	DeclaredType createDeclaredType();

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
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StaticTypesystemPackage getStaticTypesystemPackage();

} //StaticTypesystemFactory
