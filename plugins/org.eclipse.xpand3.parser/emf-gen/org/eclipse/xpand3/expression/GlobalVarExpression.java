/**
 * <copyright>
 * </copyright>
 *
 * $Id: GlobalVarExpression.java,v 1.1 2008/03/17 14:39:05 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Var Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.GlobalVarExpression#getGlobalVarName <em>Global Var Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getGlobalVarExpression()
 * @model
 * @generated
 */
public interface GlobalVarExpression extends AbstractExpression {
	/**
	 * Returns the value of the '<em><b>Global Var Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Var Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Var Name</em>' containment reference.
	 * @see #setGlobalVarName(Identifier)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getGlobalVarExpression_GlobalVarName()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getGlobalVarName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.GlobalVarExpression#getGlobalVarName <em>Global Var Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Var Name</em>' containment reference.
	 * @see #getGlobalVarName()
	 * @generated
	 */
	void setGlobalVarName(Identifier value);

} // GlobalVarExpression
