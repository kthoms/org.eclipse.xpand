/**
 * <copyright>
 * </copyright>
 *
 * $Id: ForEachStatement.java,v 1.1 2008/03/17 14:39:03 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.ForEachStatement#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.ForEachStatement#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.ForEachStatement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.ForEachStatement#getIteratorName <em>Iterator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.statement.StatementPackage#getForEachStatement()
 * @model
 * @generated
 */
public interface ForEachStatement extends AbstractStatementWithBody {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(AbstractExpression)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getForEachStatement_Target()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ForEachStatement#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' containment reference.
	 * @see #setSeparator(AbstractExpression)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getForEachStatement_Separator()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getSeparator();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ForEachStatement#getSeparator <em>Separator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' containment reference.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Identifier)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getForEachStatement_Variable()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ForEachStatement#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Identifier value);

	/**
	 * Returns the value of the '<em><b>Iterator Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator Name</em>' containment reference.
	 * @see #setIteratorName(Identifier)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getForEachStatement_IteratorName()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIteratorName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ForEachStatement#getIteratorName <em>Iterator Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator Name</em>' containment reference.
	 * @see #getIteratorName()
	 * @generated
	 */
	void setIteratorName(Identifier value);

} // ForEachStatement
