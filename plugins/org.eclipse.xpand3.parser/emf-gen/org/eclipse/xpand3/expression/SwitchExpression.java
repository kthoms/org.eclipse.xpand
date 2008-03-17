/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwitchExpression.java,v 1.1 2008/03/17 14:39:05 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.SwitchExpression#getSwitchExpr <em>Switch Expr</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.SwitchExpression#getDefaultExpr <em>Default Expr</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.SwitchExpression#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getSwitchExpression()
 * @model
 * @generated
 */
public interface SwitchExpression extends AbstractExpression {
	/**
	 * Returns the value of the '<em><b>Switch Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Expr</em>' containment reference.
	 * @see #setSwitchExpr(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getSwitchExpression_SwitchExpr()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getSwitchExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.SwitchExpression#getSwitchExpr <em>Switch Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Expr</em>' containment reference.
	 * @see #getSwitchExpr()
	 * @generated
	 */
	void setSwitchExpr(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Default Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Expr</em>' containment reference.
	 * @see #setDefaultExpr(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getSwitchExpression_DefaultExpr()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getDefaultExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.SwitchExpression#getDefaultExpr <em>Default Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Expr</em>' containment reference.
	 * @see #getDefaultExpr()
	 * @generated
	 */
	void setDefaultExpr(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.expression.Case}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getSwitchExpression_Cases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Case> getCases();

} // SwitchExpression
