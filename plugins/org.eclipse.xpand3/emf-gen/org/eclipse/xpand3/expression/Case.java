/**
 * <copyright>
 * </copyright>
 *
 * $Id: Case.java,v 1.2 2008/03/07 11:10:31 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.SyntaxElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.Case#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.Case#getThenPart <em>Then Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends SyntaxElement {
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
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getCase_Condition()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.Case#getCondition <em>Condition</em>}' containment reference.
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
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getCase_ThenPart()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getThenPart();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.Case#getThenPart <em>Then Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Part</em>' containment reference.
	 * @see #getThenPart()
	 * @generated
	 */
	void setThenPart(AbstractExpression value);

} // Case
