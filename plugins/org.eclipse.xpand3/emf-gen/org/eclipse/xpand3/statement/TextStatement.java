/**
 * <copyright>
 * </copyright>
 *
 * $Id: TextStatement.java,v 1.2 2008/03/07 11:10:51 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.TextStatement#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.TextStatement#isDeleteLine <em>Delete Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.statement.StatementPackage#getTextStatement()
 * @model
 * @generated
 */
public interface TextStatement extends AbstractStatement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getTextStatement_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.TextStatement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Delete Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Line</em>' attribute.
	 * @see #setDeleteLine(boolean)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getTextStatement_DeleteLine()
	 * @model
	 * @generated
	 */
	boolean isDeleteLine();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.TextStatement#isDeleteLine <em>Delete Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Line</em>' attribute.
	 * @see #isDeleteLine()
	 * @generated
	 */
	void setDeleteLine(boolean value);

} // TextStatement
