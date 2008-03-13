/**
 * <copyright>
 * </copyright>
 *
 * $Id: IfExpressionNode.java,v 1.3 2008/03/13 08:40:00 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode#getElse <em>Else</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode#getCondition0 <em>Condition0</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode#getCondition1 <em>Condition1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getIfExpressionNode()
 * @model
 * @generated
 */
public interface IfExpressionNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' reference.
	 * @see #setThen(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getIfExpressionNode_Then()
	 * @model
	 * @generated
	 */
	CompositeNode getThen();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode#getThen <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see #setElse(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getIfExpressionNode_Else()
	 * @model
	 * @generated
	 */
	CompositeNode getElse();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Condition0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition0</em>' reference.
	 * @see #setCondition0(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getIfExpressionNode_Condition0()
	 * @model
	 * @generated
	 */
	CompositeNode getCondition0();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode#getCondition0 <em>Condition0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition0</em>' reference.
	 * @see #getCondition0()
	 * @generated
	 */
	void setCondition0(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Condition1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition1</em>' reference.
	 * @see #setCondition1(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getIfExpressionNode_Condition1()
	 * @model
	 * @generated
	 */
	CompositeNode getCondition1();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode#getCondition1 <em>Condition1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition1</em>' reference.
	 * @see #getCondition1()
	 * @generated
	 */
	void setCondition1(CompositeNode value);

} // IfExpressionNode
