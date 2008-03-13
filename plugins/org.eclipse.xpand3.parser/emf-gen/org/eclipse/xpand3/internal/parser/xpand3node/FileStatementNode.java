/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileStatementNode.java,v 1.4 2008/03/13 08:40:01 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Statement Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode#getNameExpression <em>Name Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getFileStatementNode()
 * @model
 * @generated
 */
public interface FileStatementNode extends CompositeNode {
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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getFileStatementNode_Sequence()
	 * @model
	 * @generated
	 */
	CompositeNode getSequence();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode#getSequence <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(CompositeNode value);

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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getFileStatementNode_Identifier()
	 * @model
	 * @generated
	 */
	CompositeNode getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Name Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Expression</em>' reference.
	 * @see #setNameExpression(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getFileStatementNode_NameExpression()
	 * @model
	 * @generated
	 */
	CompositeNode getNameExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode#getNameExpression <em>Name Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Expression</em>' reference.
	 * @see #getNameExpression()
	 * @generated
	 */
	void setNameExpression(CompositeNode value);

} // FileStatementNode
