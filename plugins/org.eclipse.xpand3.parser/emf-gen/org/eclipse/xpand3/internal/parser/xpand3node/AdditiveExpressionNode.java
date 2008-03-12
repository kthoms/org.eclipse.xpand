/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdditiveExpressionNode.java,v 1.3 2008/03/12 09:54:12 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Expression Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.AdditiveExpressionNode#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.AdditiveExpressionNode#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getAdditiveExpressionNode()
 * @model
 * @generated
 */
public interface AdditiveExpressionNode extends CompositeNode {

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getAdditiveExpressionNode_Right()
	 * @model
	 * @generated
	 */
	CompositeNode getRight();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.AdditiveExpressionNode#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getAdditiveExpressionNode_Left()
	 * @model
	 * @generated
	 */
	CompositeNode getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.AdditiveExpressionNode#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(CompositeNode value);
} // AdditiveExpressionNode
