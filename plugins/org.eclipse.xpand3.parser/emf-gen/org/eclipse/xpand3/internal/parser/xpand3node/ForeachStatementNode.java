/**
 * <copyright>
 * </copyright>
 *
 * $Id: ForeachStatementNode.java,v 1.3 2008/03/12 09:54:12 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreach Statement Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode#getSeparatorExpression <em>Separator Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getForeachStatementNode()
 * @model
 * @generated
 */
public interface ForeachStatementNode extends CompositeNode {

	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' reference.
	 * @see #setIterator(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getForeachStatementNode_Iterator()
	 * @model
	 * @generated
	 */
	CompositeNode getIterator();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode#getIterator <em>Iterator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' reference.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Separator Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator Expression</em>' reference.
	 * @see #setSeparatorExpression(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getForeachStatementNode_SeparatorExpression()
	 * @model
	 * @generated
	 */
	CompositeNode getSeparatorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode#getSeparatorExpression <em>Separator Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator Expression</em>' reference.
	 * @see #getSeparatorExpression()
	 * @generated
	 */
	void setSeparatorExpression(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getForeachStatementNode_Identifier()
	 * @model
	 * @generated
	 */
	CompositeNode getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>For Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Expression</em>' reference.
	 * @see #setForExpression(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getForeachStatementNode_ForExpression()
	 * @model
	 * @generated
	 */
	CompositeNode getForExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode#getForExpression <em>For Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Expression</em>' reference.
	 * @see #getForExpression()
	 * @generated
	 */
	void setForExpression(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' reference.
	 * @see #setSequence(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getForeachStatementNode_Sequence()
	 * @model
	 * @generated
	 */
	CompositeNode getSequence();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode#getSequence <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(CompositeNode value);
} // ForeachStatementNode
