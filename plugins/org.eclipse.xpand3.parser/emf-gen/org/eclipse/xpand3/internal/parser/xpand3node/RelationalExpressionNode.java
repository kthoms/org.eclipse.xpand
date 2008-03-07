/**
 * <copyright>
 * </copyright>
 *
 * $Id: RelationalExpressionNode.java,v 1.3 2008/03/07 09:39:41 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Expression Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getLeftOperand <em>Left Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getRelationalExpressionNode()
 * @model
 * @generated
 */
public interface RelationalExpressionNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' reference.
	 * @see #setOperator(LeafNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getRelationalExpressionNode_Operator()
	 * @model
	 * @generated
	 */
	LeafNode getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getOperator <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LeafNode value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' reference.
	 * @see #setRightOperand(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getRelationalExpressionNode_RightOperand()
	 * @model
	 * @generated
	 */
	CompositeNode getRightOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getRightOperand <em>Right Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' reference.
	 * @see #setLeftOperand(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getRelationalExpressionNode_LeftOperand()
	 * @model
	 * @generated
	 */
	CompositeNode getLeftOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getLeftOperand <em>Left Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(CompositeNode value);

} // RelationalExpressionNode
