/**
 * <copyright>
 * </copyright>
 *
 * $Id: InfixExpressionNode.java,v 1.2 2008/03/06 15:25:15 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.emf.common.util.EList;
import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infix Expression Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode#getCalls <em>Calls</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getInfixExpressionNode()
 * @model
 * @generated
 */
public interface InfixExpressionNode extends CompositeNode {

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.tmf.common.node.CompositeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' reference list.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getInfixExpressionNode_Calls()
	 * @model
	 * @generated
	 */
	EList<CompositeNode> getCalls();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getInfixExpressionNode_Target()
	 * @model
	 * @generated
	 */
	CompositeNode getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CompositeNode value);
} // InfixExpressionNode
