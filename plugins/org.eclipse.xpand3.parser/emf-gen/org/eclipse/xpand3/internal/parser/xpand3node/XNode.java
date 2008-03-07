/**
 * <copyright>
 * </copyright>
 *
 * $Id: XNode.java,v 1.1 2008/03/07 11:11:14 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XNode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.XNode#getL <em>L</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getXNode()
 * @model
 * @generated
 */
public interface XNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' reference.
	 * @see #setL(LeafNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getXNode_L()
	 * @model
	 * @generated
	 */
	LeafNode getL();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.XNode#getL <em>L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L</em>' reference.
	 * @see #getL()
	 * @generated
	 */
	void setL(LeafNode value);

} // XNode
