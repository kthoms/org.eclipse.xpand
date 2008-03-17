/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredParameter.java,v 1.1 2008/03/17 14:39:13 jkohnlein Exp $
 */
package org.eclipse.xpand3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.DeclaredParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xpand3.DeclaredParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.Xpand3Package#getDeclaredParameter()
 * @model
 * @generated
 */
public interface DeclaredParameter extends SyntaxElement {
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
	 * @see org.eclipse.xpand3.Xpand3Package#getDeclaredParameter_Name()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.DeclaredParameter#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Identifier)
	 * @see org.eclipse.xpand3.Xpand3Package#getDeclaredParameter_Type()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.DeclaredParameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Identifier value);

} // DeclaredParameter
