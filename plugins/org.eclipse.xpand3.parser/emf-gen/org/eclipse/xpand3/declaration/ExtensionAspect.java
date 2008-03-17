/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtensionAspect.java,v 1.1 2008/03/17 14:39:12 jkohnlein Exp $
 */
package org.eclipse.xpand3.declaration;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.ExtensionAspect#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getExtensionAspect()
 * @model
 * @generated
 */
public interface ExtensionAspect extends AbstractAspect {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(AbstractExpression)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getExtensionAspect_Expression()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.ExtensionAspect#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(AbstractExpression value);

} // ExtensionAspect
