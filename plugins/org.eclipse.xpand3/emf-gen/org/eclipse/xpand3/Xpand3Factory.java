/**
 * <copyright>
 * </copyright>
 *
 * $Id: Xpand3Factory.java,v 1.3 2008/03/06 15:37:18 jkohnlein Exp $
 */
package org.eclipse.xpand3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.Xpand3Package
 * @generated
 */
public interface Xpand3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Xpand3Factory eINSTANCE = org.eclipse.xpand3.impl.Xpand3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Statement</em>'.
	 * @generated
	 */
	ImportStatement createImportStatement();

	/**
	 * Returns a new object of class '<em>Simple Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Identifier</em>'.
	 * @generated
	 */
	SimpleIdentifier createSimpleIdentifier();

	/**
	 * Returns a new object of class '<em>Composed Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed Identifier</em>'.
	 * @generated
	 */
	ComposedIdentifier createComposedIdentifier();

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
	Xpand3Package getXpand3Package();

} //Xpand3Factory
