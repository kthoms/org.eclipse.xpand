/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeSelectExpression.java,v 1.2 2008/03/07 11:10:31 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Select Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.TypeSelectExpression#getTypeLiteral <em>Type Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getTypeSelectExpression()
 * @model
 * @generated
 */
public interface TypeSelectExpression extends FeatureCall {
	/**
	 * Returns the value of the '<em><b>Type Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Literal</em>' containment reference.
	 * @see #setTypeLiteral(Identifier)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getTypeSelectExpression_TypeLiteral()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getTypeLiteral();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.TypeSelectExpression#getTypeLiteral <em>Type Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Literal</em>' containment reference.
	 * @see #getTypeLiteral()
	 * @generated
	 */
	void setTypeLiteral(Identifier value);

} // TypeSelectExpression
