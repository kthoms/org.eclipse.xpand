/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExpandStatement.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.statement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expand Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.ExpandStatement#isForeach <em>Foreach</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.ExpandStatement#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.ExpandStatement#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.ExpandStatement#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.ExpandStatement#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.statement.StatementPackage#getExpandStatement()
 * @model
 * @generated
 */
public interface ExpandStatement extends AbstractStatement {
	/**
	 * Returns the value of the '<em><b>Foreach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreach</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreach</em>' attribute.
	 * @see #setForeach(boolean)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getExpandStatement_Foreach()
	 * @model
	 * @generated
	 */
	boolean isForeach();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ExpandStatement#isForeach <em>Foreach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreach</em>' attribute.
	 * @see #isForeach()
	 * @generated
	 */
	void setForeach(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.expression.AbstractExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.xpand3.statement.StatementPackage#getExpandStatement_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractExpression> getParameters();

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
	 * @see org.eclipse.xpand3.statement.StatementPackage#getExpandStatement_Separator()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getSeparator();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ExpandStatement#getSeparator <em>Separator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' containment reference.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(AbstractExpression value);

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
	 * @see org.eclipse.xpand3.statement.StatementPackage#getExpandStatement_Target()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ExpandStatement#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Identifier)
	 * @see org.eclipse.xpand3.statement.StatementPackage#getExpandStatement_Definition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Identifier getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.statement.ExpandStatement#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Identifier value);

} // ExpandStatement
