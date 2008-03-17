/**
 * <copyright>
 * </copyright>
 *
 * $Id: CreateExtension.java,v 1.1 2008/03/17 14:39:12 jkohnlein Exp $
 */
package org.eclipse.xpand3.declaration;

import org.eclipse.xpand3.DeclaredParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.CreateExtension#getToBeCreated <em>To Be Created</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getCreateExtension()
 * @model
 * @generated
 */
public interface CreateExtension extends Extension {
	/**
	 * Returns the value of the '<em><b>To Be Created</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Be Created</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Created</em>' reference.
	 * @see #setToBeCreated(DeclaredParameter)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getCreateExtension_ToBeCreated()
	 * @model
	 * @generated
	 */
	DeclaredParameter getToBeCreated();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.CreateExtension#getToBeCreated <em>To Be Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Created</em>' reference.
	 * @see #getToBeCreated()
	 * @generated
	 */
	void setToBeCreated(DeclaredParameter value);

} // CreateExtension
