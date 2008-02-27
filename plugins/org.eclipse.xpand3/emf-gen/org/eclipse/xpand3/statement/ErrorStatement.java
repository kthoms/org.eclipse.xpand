/**
 * <copyright>
 * </copyright>
 *
 * $Id: ErrorStatement.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.statement;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.ErrorStatement#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.statement.StatementPackage#getErrorStatement()
 * @model
 * @generated
 */
public interface ErrorStatement extends AbstractStatement {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(AbstractExpression)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getErrorStatement_Message()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractExpression getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ErrorStatement#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(AbstractExpression value);

} // ErrorStatement
