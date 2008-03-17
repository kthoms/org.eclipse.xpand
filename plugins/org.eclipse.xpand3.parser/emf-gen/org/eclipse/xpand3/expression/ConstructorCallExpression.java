/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstructorCallExpression.java,v 1.1 2008/03/17 14:39:05 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.ConstructorCallExpression#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getConstructorCallExpression()
 * @model
 * @generated
 */
public interface ConstructorCallExpression extends AbstractExpression {
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
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getConstructorCallExpression_Type()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.ConstructorCallExpression#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Identifier value);

} // ConstructorCallExpression
