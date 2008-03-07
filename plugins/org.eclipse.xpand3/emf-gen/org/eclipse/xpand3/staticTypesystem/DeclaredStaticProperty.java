/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredStaticProperty.java,v 1.4 2008/03/07 14:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Static Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.DeclaredStaticProperty#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredStaticProperty()
 * @model
 * @generated
 */
public interface DeclaredStaticProperty extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredStaticProperty_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.staticTypesystem.DeclaredStaticProperty#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // DeclaredStaticProperty
