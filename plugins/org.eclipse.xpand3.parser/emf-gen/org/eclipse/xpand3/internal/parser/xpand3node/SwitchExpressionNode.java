/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwitchExpressionNode.java,v 1.4 2008/03/17 10:55:26 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.emf.common.util.EList;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Expression Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.SwitchExpressionNode#getCases <em>Cases</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.SwitchExpressionNode#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.SwitchExpressionNode#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getSwitchExpressionNode()
 * @model
 * @generated
 */
public interface SwitchExpressionNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getSwitchExpressionNode_Default()
	 * @model
	 * @generated
	 */
	CompositeNode getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.SwitchExpressionNode#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(CompositeNode value);

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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getSwitchExpressionNode_Expression()
	 * @model
	 * @generated
	 */
	CompositeNode getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.SwitchExpressionNode#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.tmf.common.node.CompositeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' reference list.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getSwitchExpressionNode_Cases()
	 * @model
	 * @generated
	 */
	EList<CompositeNode> getCases();

} // SwitchExpressionNode
