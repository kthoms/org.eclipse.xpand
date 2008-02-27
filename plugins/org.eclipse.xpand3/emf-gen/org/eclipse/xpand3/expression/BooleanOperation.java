/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanOperation.java,v 1.1 2008/02/27 13:21:06 sefftinge Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.BooleanOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.BooleanOperation#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.BooleanOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getBooleanOperation()
 * @model
 * @generated
 */
public interface BooleanOperation extends AbstractExpression {
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
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getBooleanOperation_Left()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.BooleanOperation#getLeft <em>Left</em>}' containment reference.
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
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getBooleanOperation_Right()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getRight();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.BooleanOperation#getRight <em>Right</em>}' containment reference.
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
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getBooleanOperation_Operator()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.BooleanOperation#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Identifier value);

} // BooleanOperation
