/**
 * <copyright>
 * </copyright>
 *
 * $Id: IfStatement.java,v 1.2 2008/03/07 11:10:51 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.IfStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.IfStatement#getUpperIf <em>Upper If</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.IfStatement#getElseIf <em>Else If</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.statement.StatementPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends AbstractStatementWithBody {
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
	 * @see org.eclipse.xpand3.statement.StatementPackage#getIfStatement_Condition()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.IfStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Upper If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper If</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper If</em>' reference.
	 * @see #setUpperIf(IfStatement)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getIfStatement_UpperIf()
	 * @model
	 * @generated
	 */
	IfStatement getUpperIf();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.IfStatement#getUpperIf <em>Upper If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper If</em>' reference.
	 * @see #getUpperIf()
	 * @generated
	 */
	void setUpperIf(IfStatement value);

	/**
	 * Returns the value of the '<em><b>Else If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else If</em>' containment reference.
	 * @see #setElseIf(IfStatement)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getIfStatement_ElseIf()
	 * @model containment="true"
	 * @generated
	 */
	IfStatement getElseIf();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.IfStatement#getElseIf <em>Else If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else If</em>' containment reference.
	 * @see #getElseIf()
	 * @generated
	 */
	void setElseIf(IfStatement value);

} // IfStatement
