/**
 * <copyright>
 * </copyright>
 *
 * $Id: LetExpression.java,v 1.2 2008/03/07 11:10:31 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.LetExpression#getVarExpression <em>Var Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.LetExpression#getTargetExpression <em>Target Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.LetExpression#getVarName <em>Var Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getLetExpression()
 * @model
 * @generated
 */
public interface LetExpression extends AbstractExpression {
	/**
	 * Returns the value of the '<em><b>Var Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Expression</em>' containment reference.
	 * @see #setVarExpression(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getLetExpression_VarExpression()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getVarExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.LetExpression#getVarExpression <em>Var Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Expression</em>' containment reference.
	 * @see #getVarExpression()
	 * @generated
	 */
	void setVarExpression(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Target Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Expression</em>' containment reference.
	 * @see #setTargetExpression(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getLetExpression_TargetExpression()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getTargetExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.LetExpression#getTargetExpression <em>Target Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Expression</em>' containment reference.
	 * @see #getTargetExpression()
	 * @generated
	 */
	void setTargetExpression(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' containment reference.
	 * @see #setVarName(Identifier)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getLetExpression_VarName()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getVarName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.LetExpression#getVarName <em>Var Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' containment reference.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(Identifier value);

} // LetExpression
