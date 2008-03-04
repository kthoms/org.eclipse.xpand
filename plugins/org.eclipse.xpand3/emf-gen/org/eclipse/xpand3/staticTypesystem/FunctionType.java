/**
 * <copyright>
 * </copyright>
 *
 * $Id: FunctionType.java,v 1.2 2008/03/04 14:03:38 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.FunctionType#getDeclaredFunction <em>Declared Function</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.FunctionType#getActualTypeArguments <em>Actual Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getFunctionType()
 * @model
 * @generated
 */
public interface FunctionType extends AbstractTypeReference {
	/**
	 * Returns the value of the '<em><b>Declared Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Function</em>' reference.
	 * @see #setDeclaredFunction(DeclaredFunction)
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getFunctionType_DeclaredFunction()
	 * @model required="true"
	 * @generated
	 */
	DeclaredFunction getDeclaredFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.staticTypesystem.FunctionType#getDeclaredFunction <em>Declared Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Function</em>' reference.
	 * @see #getDeclaredFunction()
	 * @generated
	 */
	void setDeclaredFunction(DeclaredFunction value);

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
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getFunctionType_ActualTypeArguments()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeReference> getActualTypeArguments();

} // FunctionType
