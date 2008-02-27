/**
 * <copyright>
 * </copyright>
 *
 * $Id: CreateExtensionStatement.java,v 1.1 2008/02/27 13:21:10 sefftinge Exp $
 */
package org.eclipse.xpand3.declaration;

import org.eclipse.xpand3.DeclaredParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Extension Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.CreateExtensionStatement#getToBeCreated <em>To Be Created</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getCreateExtensionStatement()
 * @model
 * @generated
 */
public interface CreateExtensionStatement extends Extension {
	/**
	 * Returns the value of the '<em><b>To Be Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Be Created</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Created</em>' containment reference.
	 * @see #setToBeCreated(DeclaredParameter)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getCreateExtensionStatement_ToBeCreated()
	 * @model containment="true"
	 * @generated
	 */
	DeclaredParameter getToBeCreated();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.CreateExtensionStatement#getToBeCreated <em>To Be Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Created</em>' containment reference.
	 * @see #getToBeCreated()
	 * @generated
	 */
	void setToBeCreated(DeclaredParameter value);

} // CreateExtensionStatement
