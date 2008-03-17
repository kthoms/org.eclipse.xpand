/**
 * <copyright>
 * </copyright>
 *
 * $Id: Literal.java,v 1.1 2008/03/17 14:39:06 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.xpand3.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.Literal#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getLiteral()
 * @model abstract="true"
 * @generated
 */
public interface Literal extends AbstractExpression {
	/**
	 * Returns the value of the '<em><b>Literal Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Value</em>' containment reference.
	 * @see #setLiteralValue(Identifier)
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getLiteral_LiteralValue()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getLiteralValue();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.expression.Literal#getLiteralValue <em>Literal Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Value</em>' containment reference.
	 * @see #getLiteralValue()
	 * @generated
	 */
	void setLiteralValue(Identifier value);

} // Literal
