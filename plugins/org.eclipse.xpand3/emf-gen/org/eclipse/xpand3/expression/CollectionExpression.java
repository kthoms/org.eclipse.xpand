/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionExpression.java,v 1.2 2008/03/07 11:10:31 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.CollectionExpression#getClosure <em>Closure</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.CollectionExpression#getEleName <em>Ele Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getCollectionExpression()
 * @model
 * @generated
 */
public interface CollectionExpression extends FeatureCall {
	/**
	 * Returns the value of the '<em><b>Closure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closure</em>' containment reference.
	 * @see #setClosure(AbstractExpression)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getCollectionExpression_Closure()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getClosure();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.CollectionExpression#getClosure <em>Closure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closure</em>' containment reference.
	 * @see #getClosure()
	 * @generated
	 */
	void setClosure(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Ele Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ele Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ele Name</em>' containment reference.
	 * @see #setEleName(Identifier)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getCollectionExpression_EleName()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getEleName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.CollectionExpression#getEleName <em>Ele Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ele Name</em>' containment reference.
	 * @see #getEleName()
	 * @generated
	 */
	void setEleName(Identifier value);

} // CollectionExpression
