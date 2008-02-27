/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractNamedDeclaration.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.declaration;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Named Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.AbstractNamedDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getAbstractNamedDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNamedDeclaration extends AbstractDeclaration {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Identifier)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getAbstractNamedDeclaration_Name()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.AbstractNamedDeclaration#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Identifier value);

} // AbstractNamedDeclaration
