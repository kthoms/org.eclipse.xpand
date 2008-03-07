/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredType.java,v 1.5 2008/03/07 14:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtend.backend.common.BackendType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.DeclaredType#getStaticProperties <em>Static Properties</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.DeclaredType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.DeclaredType#getDeclaredTypeParameters <em>Declared Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.DeclaredType#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredType()
 * @model
 * @generated
 */
public interface DeclaredType extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Static Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.DeclaredStaticProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Properties</em>' containment reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredType_StaticProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredStaticProperty> getStaticProperties();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.DeclaredProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredType_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Declared Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.DeclaredTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Type Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Type Parameters</em>' containment reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredType_DeclaredTypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredTypeParameter> getDeclaredTypeParameters();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.AbstractTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' containment reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredType_SuperTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTypeReference> getSuperTypes();

} // DeclaredType
