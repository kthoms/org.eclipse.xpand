/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredType.java,v 1.2 2008/03/04 11:00:30 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.declaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xpand3.staticTypesystem.AbstractNamedElement;
import org.eclipse.xtend.backend.common.BackendType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getStaticProperties <em>Static Properties</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getDeclaredTypeParameters <em>Declared Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getBackendType <em>Backend Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage#getDeclaredType()
 * @model
 * @generated
 */
public interface DeclaredType extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Static Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredStaticProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Properties</em>' containment reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage#getDeclaredType_StaticProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredStaticProperty> getStaticProperties();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage#getDeclaredType_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage#getDeclaredType_Operations()
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation#getDeclaringType
	 * @model opposite="declaringType" containment="true"
	 * @generated
	 */
	EList<DeclaredOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Declared Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Type Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Type Parameters</em>' containment reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage#getDeclaredType_DeclaredTypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredTypeParameter> getDeclaredTypeParameters();

	/**
	 * Returns the value of the '<em><b>Backend Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Type</em>' attribute.
	 * @see #setBackendType(BackendType)
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage#getDeclaredType_BackendType()
	 * @model dataType="org.eclipse.xpand3.staticTypesystem.BackendType" required="true"
	 * @generated
	 */
	BackendType getBackendType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getBackendType <em>Backend Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Type</em>' attribute.
	 * @see #getBackendType()
	 * @generated
	 */
	void setBackendType(BackendType value);

} // DeclaredType
