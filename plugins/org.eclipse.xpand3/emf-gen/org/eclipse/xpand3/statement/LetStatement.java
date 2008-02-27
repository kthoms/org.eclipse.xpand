/**
 * <copyright>
 * </copyright>
 *
 * $Id: LetStatement.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.statement;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.LetStatement#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.LetStatement#getVarValue <em>Var Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.statement.StatementPackage#getLetStatement()
 * @model
 * @generated
 */
public interface LetStatement extends AbstractStatementWithBody {
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
	 * @see org.eclipse.xpand3.statement.StatementPackage#getLetStatement_VarName()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getVarName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.LetStatement#getVarName <em>Var Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' containment reference.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(Identifier value);

	/**
	 * Returns the value of the '<em><b>Var Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Value</em>' containment reference.
	 * @see #setVarValue(AbstractExpression)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getLetStatement_VarValue()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getVarValue();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.LetStatement#getVarValue <em>Var Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Value</em>' containment reference.
	 * @see #getVarValue()
	 * @generated
	 */
	void setVarValue(AbstractExpression value);

} // LetStatement
