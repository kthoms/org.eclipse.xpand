/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProtectStatement.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.statement;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protect Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.ProtectStatement#getCommentStart <em>Comment Start</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.ProtectStatement#getCommentEnd <em>Comment End</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.ProtectStatement#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.ProtectStatement#isDisable <em>Disable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.statement.StatementPackage#getProtectStatement()
 * @model
 * @generated
 */
public interface ProtectStatement extends AbstractStatementWithBody {
	/**
	 * Returns the value of the '<em><b>Comment Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Start</em>' containment reference.
	 * @see #setCommentStart(AbstractExpression)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getProtectStatement_CommentStart()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getCommentStart();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ProtectStatement#getCommentStart <em>Comment Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Start</em>' containment reference.
	 * @see #getCommentStart()
	 * @generated
	 */
	void setCommentStart(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Comment End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment End</em>' containment reference.
	 * @see #setCommentEnd(AbstractExpression)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getProtectStatement_CommentEnd()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getCommentEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ProtectStatement#getCommentEnd <em>Comment End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment End</em>' containment reference.
	 * @see #getCommentEnd()
	 * @generated
	 */
	void setCommentEnd(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(AbstractExpression)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getProtectStatement_Id()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getId();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ProtectStatement#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable</em>' attribute.
	 * @see #setDisable(boolean)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getProtectStatement_Disable()
	 * @model
	 * @generated
	 */
	boolean isDisable();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ProtectStatement#isDisable <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable</em>' attribute.
	 * @see #isDisable()
	 * @generated
	 */
	void setDisable(boolean value);

} // ProtectStatement
