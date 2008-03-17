/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaCallNode.java,v 1.1 2008/03/17 14:39:12 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Call Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.JavaCallNode#getJavaReturnType <em>Java Return Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.JavaCallNode#getJavaName <em>Java Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getJavaCallNode()
 * @model
 * @generated
 */
public interface JavaCallNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>Java Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Return Type</em>' reference.
	 * @see #setJavaReturnType(CompositeNode)
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getJavaCallNode_JavaReturnType()
	 * @model
	 * @generated
	 */
	CompositeNode getJavaReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.JavaCallNode#getJavaReturnType <em>Java Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Return Type</em>' reference.
	 * @see #getJavaReturnType()
	 * @generated
	 */
	void setJavaReturnType(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Java Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Name</em>' reference.
	 * @see #setJavaName(CompositeNode)
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getJavaCallNode_JavaName()
	 * @model
	 * @generated
	 */
	CompositeNode getJavaName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.JavaCallNode#getJavaName <em>Java Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Name</em>' reference.
	 * @see #getJavaName()
	 * @generated
	 */
	void setJavaName(CompositeNode value);

} // JavaCallNode
