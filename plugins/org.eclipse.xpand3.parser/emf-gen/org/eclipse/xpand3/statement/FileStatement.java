/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileStatement.java,v 1.1 2008/03/17 14:39:03 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.FileStatement#getFileNameExpression <em>File Name Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.FileStatement#getOutletNameIdentifier <em>Outlet Name Identifier</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.FileStatement#isOnce <em>Once</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.statement.StatementPackage#getFileStatement()
 * @model
 * @generated
 */
public interface FileStatement extends AbstractStatementWithBody {
	/**
	 * Returns the value of the '<em><b>File Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name Expression</em>' containment reference.
	 * @see #setFileNameExpression(AbstractExpression)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getFileStatement_FileNameExpression()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getFileNameExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.FileStatement#getFileNameExpression <em>File Name Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name Expression</em>' containment reference.
	 * @see #getFileNameExpression()
	 * @generated
	 */
	void setFileNameExpression(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Outlet Name Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outlet Name Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outlet Name Identifier</em>' containment reference.
	 * @see #setOutletNameIdentifier(Identifier)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getFileStatement_OutletNameIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getOutletNameIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.FileStatement#getOutletNameIdentifier <em>Outlet Name Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outlet Name Identifier</em>' containment reference.
	 * @see #getOutletNameIdentifier()
	 * @generated
	 */
	void setOutletNameIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Once</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Once</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Once</em>' attribute.
	 * @see #setOnce(boolean)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getFileStatement_Once()
	 * @model
	 * @generated
	 */
	boolean isOnce();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.FileStatement#isOnce <em>Once</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Once</em>' attribute.
	 * @see #isOnce()
	 * @generated
	 */
	void setOnce(boolean value);

} // FileStatement
