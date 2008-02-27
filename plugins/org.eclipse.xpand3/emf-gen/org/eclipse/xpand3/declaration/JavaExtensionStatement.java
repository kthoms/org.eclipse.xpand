/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaExtensionStatement.java,v 1.1 2008/02/27 13:21:10 sefftinge Exp $
 */
package org.eclipse.xpand3.declaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Extension Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.JavaExtensionStatement#getJavaType <em>Java Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.JavaExtensionStatement#getJavaMethod <em>Java Method</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.JavaExtensionStatement#getJavaParamTypes <em>Java Param Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getJavaExtensionStatement()
 * @model
 * @generated
 */
public interface JavaExtensionStatement extends AbstractNamedDeclaration {
	/**
	 * Returns the value of the '<em><b>Java Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Type</em>' containment reference.
	 * @see #setJavaType(Identifier)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getJavaExtensionStatement_JavaType()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getJavaType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.JavaExtensionStatement#getJavaType <em>Java Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Type</em>' containment reference.
	 * @see #getJavaType()
	 * @generated
	 */
	void setJavaType(Identifier value);

	/**
	 * Returns the value of the '<em><b>Java Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Method</em>' containment reference.
	 * @see #setJavaMethod(Identifier)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getJavaExtensionStatement_JavaMethod()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getJavaMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.JavaExtensionStatement#getJavaMethod <em>Java Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Method</em>' containment reference.
	 * @see #getJavaMethod()
	 * @generated
	 */
	void setJavaMethod(Identifier value);

	/**
	 * Returns the value of the '<em><b>Java Param Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Param Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Param Types</em>' containment reference list.
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getJavaExtensionStatement_JavaParamTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getJavaParamTypes();

} // JavaExtensionStatement
