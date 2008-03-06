/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredParameterNode.java,v 1.2 2008/03/06 15:25:15 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Parameter Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode#getPtype <em>Ptype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getDeclaredParameterNode()
 * @model
 * @generated
 */
public interface DeclaredParameterNode extends CompositeNode {

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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getDeclaredParameterNode_Name()
	 * @model
	 * @generated
	 */
	CompositeNode getName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Ptype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ptype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ptype</em>' reference.
	 * @see #setPtype(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getDeclaredParameterNode_Ptype()
	 * @model
	 * @generated
	 */
	CompositeNode getPtype();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode#getPtype <em>Ptype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ptype</em>' reference.
	 * @see #getPtype()
	 * @generated
	 */
	void setPtype(CompositeNode value);
} // DeclaredParameterNode
