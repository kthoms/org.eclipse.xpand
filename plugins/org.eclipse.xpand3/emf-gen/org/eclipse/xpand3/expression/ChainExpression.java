/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChainExpression.java,v 1.2 2008/03/07 11:10:31 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.ChainExpression#getFirst <em>First</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.ChainExpression#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getChainExpression()
 * @model
 * @generated
 */
public interface ChainExpression extends AbstractExpression {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getChainExpression_First()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getFirst();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.ChainExpression#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getChainExpression_Next()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getNext();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.ChainExpression#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(AbstractExpression value);

} // ChainExpression
