/**
 * <copyright>
 * </copyright>
 *
 * $Id: Type.java,v 1.3 2008/03/04 14:28:06 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.Type#getDeclaredType <em>Declared Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.Type#getActualTypeArguments <em>Actual Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getType()
 * @model
 * @generated
 */
public interface Type extends AbstractTypeReference {
	/**
	 * Returns the value of the '<em><b>Declared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Type</em>' reference.
	 * @see #setDeclaredType(DeclaredType)
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getType_DeclaredType()
	 * @model required="true"
	 * @generated
	 */
	DeclaredType getDeclaredType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.staticTypesystem.Type#getDeclaredType <em>Declared Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Type</em>' reference.
	 * @see #getDeclaredType()
	 * @generated
	 */
	void setDeclaredType(DeclaredType value);

	/**
	 * Returns the value of the '<em><b>Actual Type Arguments</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.AbstractTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Type Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Type Arguments</em>' reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getType_ActualTypeArguments()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeReference> getActualTypeArguments();

} // Type
