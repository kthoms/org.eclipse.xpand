/**
 * <copyright>
 * </copyright>
 *
 * $Id: SequenceNode.java,v 1.1 2008/03/17 14:39:11 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node;

import org.eclipse.emf.common.util.EList;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.SequenceNode#getTextSequences <em>Text Sequences</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.SequenceNode#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getSequenceNode()
 * @model
 * @generated
 */
public interface SequenceNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>Text Sequences</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.tmf.common.node.CompositeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Sequences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Sequences</em>' reference list.
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getSequenceNode_TextSequences()
	 * @model
	 * @generated
	 */
	EList<CompositeNode> getTextSequences();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.tmf.common.node.CompositeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' reference list.
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getSequenceNode_Statements()
	 * @model
	 * @generated
	 */
	EList<CompositeNode> getStatements();

} // SequenceNode
