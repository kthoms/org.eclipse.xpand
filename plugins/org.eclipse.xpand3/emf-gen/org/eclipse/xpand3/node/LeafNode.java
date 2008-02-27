/**
 * <copyright>
 * </copyright>
 *
 * $Id: LeafNode.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.node;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.node.LeafNode#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.node.NodePackage#getLeafNode()
 * @model
 * @generated
 */
public interface LeafNode extends Node {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' containment reference.
	 * @see #setToken(LexedToken)
	 * @see org.eclipse.xpand3.node.NodePackage#getLeafNode_Token()
	 * @model containment="true"
	 * @generated
	 */
	LexedToken getToken();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.node.LeafNode#getToken <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' containment reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(LexedToken value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.xpand3.node.NodeUtil.line(this);'"
	 * @generated
	 */
	int line();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.xpand3.node.NodeUtil.text(this);'"
	 * @generated
	 */
	String text();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.xpand3.node.NodeUtil.start(this);'"
	 * @generated
	 */
	int start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.xpand3.node.NodeUtil.end(this);'"
	 * @generated
	 */
	int end();

} // LeafNode
