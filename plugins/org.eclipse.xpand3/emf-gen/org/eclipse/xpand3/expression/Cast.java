/**
 * <copyright>
 * </copyright>
 *
 * $Id: Cast.java,v 1.1 2008/02/27 13:21:07 sefftinge Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.Cast#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.Cast#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getCast()
 * @model
 * @generated
 */
public interface Cast extends AbstractExpression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Identifier)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getCast_Type()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.Cast#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Identifier value);

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
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getCast_Target()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.Cast#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractExpression value);

} // Cast
