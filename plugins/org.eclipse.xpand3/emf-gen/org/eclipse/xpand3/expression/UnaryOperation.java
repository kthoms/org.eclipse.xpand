/**
 * <copyright>
 * </copyright>
 *
 * $Id: UnaryOperation.java,v 1.1 2008/03/12 09:54:30 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.UnaryOperation#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.UnaryOperation#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getUnaryOperation()
 * @model
 * @generated
 */
public interface UnaryOperation extends AbstractExpression {
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
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getUnaryOperation_Operator()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.UnaryOperation#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Identifier value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference.
	 * @see #setOperand(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getUnaryOperation_Operand()
	 * @model
	 * @generated
	 */
	AbstractExpression getOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.UnaryOperation#getOperand <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(AbstractExpression value);

} // UnaryOperation
