/**
 * <copyright>
 * </copyright>
 *
 * $Id: IfExpression.java,v 1.1 2008/03/17 14:39:05 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.IfExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.IfExpression#getThenPart <em>Then Part</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.IfExpression#getElsePart <em>Else Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getIfExpression()
 * @model
 * @generated
 */
public interface IfExpression extends AbstractExpression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getIfExpression_Condition()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.IfExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Then Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Part</em>' containment reference.
	 * @see #setThenPart(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getIfExpression_ThenPart()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getThenPart();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.IfExpression#getThenPart <em>Then Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Part</em>' containment reference.
	 * @see #getThenPart()
	 * @generated
	 */
	void setThenPart(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Part</em>' containment reference.
	 * @see #setElsePart(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getIfExpression_ElsePart()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getElsePart();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.IfExpression#getElsePart <em>Else Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Part</em>' containment reference.
	 * @see #getElsePart()
	 * @generated
	 */
	void setElsePart(AbstractExpression value);

} // IfExpression
