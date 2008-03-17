/**
 * <copyright>
 * </copyright>
 *
 * $Id: Extension.java,v 1.1 2008/03/17 14:39:12 jkohnlein Exp $
 */
package org.eclipse.xpand3.declaration;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.Extension#isCached <em>Cached</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.Extension#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.Extension#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends AbstractNamedDeclaration {
	/**
	 * Returns the value of the '<em><b>Cached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached</em>' attribute.
	 * @see #setCached(boolean)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getExtension_Cached()
	 * @model
	 * @generated
	 */
	boolean isCached();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.Extension#isCached <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached</em>' attribute.
	 * @see #isCached()
	 * @generated
	 */
	void setCached(boolean value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(AbstractExpression)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getExtension_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractExpression getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.Extension#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(Identifier)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getExtension_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.Extension#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Identifier value);

} // Extension
