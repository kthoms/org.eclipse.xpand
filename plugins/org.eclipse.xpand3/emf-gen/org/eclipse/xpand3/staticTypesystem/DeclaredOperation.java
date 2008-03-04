/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredOperation.java,v 1.1 2008/03/04 14:03:38 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.DeclaredOperation#getDeclaredParameters <em>Declared Parameters</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.DeclaredOperation#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.DeclaredOperation#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredOperation()
 * @model
 * @generated
 */
public interface DeclaredOperation extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Declared Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.DeclaredParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Parameters</em>' containment reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredOperation_DeclaredParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredParameter> getDeclaredParameters();

	/**
	 * Returns the value of the '<em><b>Declaring Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xpand3.staticTypesystem.DeclaredType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaring Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Type</em>' container reference.
	 * @see #setDeclaringType(DeclaredType)
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredOperation_DeclaringType()
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredType#getOperations
	 * @model opposite="operations" required="true" transient="false"
	 * @generated
	 */
	DeclaredType getDeclaringType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.staticTypesystem.DeclaredOperation#getDeclaringType <em>Declaring Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Type</em>' container reference.
	 * @see #getDeclaringType()
	 * @generated
	 */
	void setDeclaringType(DeclaredType value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(AbstractTypeReference)
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredOperation_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	AbstractTypeReference getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.staticTypesystem.DeclaredOperation#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(AbstractTypeReference value);

} // DeclaredOperation
