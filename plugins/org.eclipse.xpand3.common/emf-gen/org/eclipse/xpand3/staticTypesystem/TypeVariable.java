/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeVariable.java,v 1.1 2008/03/17 14:39:20 jkohnlein Exp $
 */
package org.eclipse.xpand3.staticTypesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.TypeVariable#getDeclaredTypeParameter <em>Declared Type Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getTypeVariable()
 * @model
 * @generated
 */
public interface TypeVariable extends AbstractTypeReference {
	/**
	 * Returns the value of the '<em><b>Declared Type Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Type Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Type Parameter</em>' reference.
	 * @see #setDeclaredTypeParameter(DeclaredTypeParameter)
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getTypeVariable_DeclaredTypeParameter()
	 * @model required="true"
	 * @generated
	 */
	DeclaredTypeParameter getDeclaredTypeParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.staticTypesystem.TypeVariable#getDeclaredTypeParameter <em>Declared Type Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Type Parameter</em>' reference.
	 * @see #getDeclaredTypeParameter()
	 * @generated
	 */
	void setDeclaredTypeParameter(DeclaredTypeParameter value);

} // TypeVariable
