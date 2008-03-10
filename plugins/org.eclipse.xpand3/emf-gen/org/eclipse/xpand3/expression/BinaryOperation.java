/**
 * <copyright>
 * </copyright>
 *
 * $Id: BinaryOperation.java,v 1.1 2008/03/10 08:25:35 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.BinaryOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.BinaryOperation#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.BinaryOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getBinaryOperation()
 * @model
 * @generated
 */
public interface BinaryOperation extends AbstractExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getBinaryOperation_Left()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.BinaryOperation#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getBinaryOperation_Right()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getRight();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.BinaryOperation#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Identifier)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getBinaryOperation_Operator()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.BinaryOperation#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Identifier value);

} // BinaryOperation
