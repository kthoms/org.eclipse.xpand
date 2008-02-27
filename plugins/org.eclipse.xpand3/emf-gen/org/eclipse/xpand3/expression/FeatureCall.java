/**
 * <copyright>
 * </copyright>
 *
 * $Id: FeatureCall.java,v 1.1 2008/02/27 13:21:06 sefftinge Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.FeatureCall#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.FeatureCall#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getFeatureCall()
 * @model
 * @generated
 */
public interface FeatureCall extends AbstractExpression {
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
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getFeatureCall_Target()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.FeatureCall#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Identifier)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getFeatureCall_Name()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.FeatureCall#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Identifier value);

} // FeatureCall
