/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParanthesizedExpressionNode.java,v 1.1 2008/03/17 14:39:11 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paranthesized Expression Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.ParanthesizedExpressionNode#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getParanthesizedExpressionNode()
 * @model
 * @generated
 */
public interface ParanthesizedExpressionNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(CompositeNode)
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getParanthesizedExpressionNode_Expression()
	 * @model
	 * @generated
	 */
	CompositeNode getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.ParanthesizedExpressionNode#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(CompositeNode value);

} // ParanthesizedExpressionNode
