/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProtectStatementNode.java,v 1.3 2008/03/12 09:54:12 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protect Statement Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode#getCend <em>Cend</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode#getCstart <em>Cstart</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getProtectStatementNode()
 * @model
 * @generated
 */
public interface ProtectStatementNode extends CompositeNode {

	/**
	 * Returns the value of the '<em><b>Cstart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cstart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cstart</em>' reference.
	 * @see #setCstart(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getProtectStatementNode_Cstart()
	 * @model
	 * @generated
	 */
	CompositeNode getCstart();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode#getCstart <em>Cstart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cstart</em>' reference.
	 * @see #getCstart()
	 * @generated
	 */
	void setCstart(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Cend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cend</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cend</em>' reference.
	 * @see #setCend(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getProtectStatementNode_Cend()
	 * @model
	 * @generated
	 */
	CompositeNode getCend();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode#getCend <em>Cend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cend</em>' reference.
	 * @see #getCend()
	 * @generated
	 */
	void setCend(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' reference.
	 * @see #setId(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getProtectStatementNode_Id()
	 * @model
	 * @generated
	 */
	CompositeNode getId();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode#getId <em>Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(CompositeNode value);

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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getProtectStatementNode_Sequence()
	 * @model
	 * @generated
	 */
	CompositeNode getSequence();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode#getSequence <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(CompositeNode value);
} // ProtectStatementNode
