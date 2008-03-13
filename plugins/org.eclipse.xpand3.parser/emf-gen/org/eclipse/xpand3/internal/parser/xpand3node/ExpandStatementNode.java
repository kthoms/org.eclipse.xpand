/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExpandStatementNode.java,v 1.4 2008/03/13 08:40:00 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expand Statement Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode#getParamList <em>Param List</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode#getForEachExpression <em>For Each Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExpandStatementNode()
 * @model
 * @generated
 */
public interface ExpandStatementNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>Separator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' reference.
	 * @see #setSeparator(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExpandStatementNode_Separator()
	 * @model
	 * @generated
	 */
	CompositeNode getSeparator();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode#getSeparator <em>Separator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' reference.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Param List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param List</em>' reference.
	 * @see #setParamList(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExpandStatementNode_ParamList()
	 * @model
	 * @generated
	 */
	CompositeNode getParamList();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode#getParamList <em>Param List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param List</em>' reference.
	 * @see #getParamList()
	 * @generated
	 */
	void setParamList(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>For Each Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Each Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Each Expression</em>' reference.
	 * @see #setForEachExpression(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExpandStatementNode_ForEachExpression()
	 * @model
	 * @generated
	 */
	CompositeNode getForEachExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode#getForEachExpression <em>For Each Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Each Expression</em>' reference.
	 * @see #getForEachExpression()
	 * @generated
	 */
	void setForEachExpression(CompositeNode value);

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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExpandStatementNode_ForExpression()
	 * @model
	 * @generated
	 */
	CompositeNode getForExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode#getForExpression <em>For Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Expression</em>' reference.
	 * @see #getForExpression()
	 * @generated
	 */
	void setForExpression(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExpandStatementNode_Name()
	 * @model
	 * @generated
	 */
	CompositeNode getName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CompositeNode value);

} // ExpandStatementNode
