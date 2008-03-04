/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredType.java,v 1.1 2008/03/04 10:52:58 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.declaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xpand3.staticTypesystem.AbstractNamedElement;

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

} // DeclaredType
