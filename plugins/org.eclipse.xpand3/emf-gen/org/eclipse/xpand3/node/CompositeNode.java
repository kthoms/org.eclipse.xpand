/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompositeNode.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.node;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.node.CompositeNode#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.CompositeNode#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.node.NodePackage#getCompositeNode()
 * @model
 * @generated
 */
public interface CompositeNode extends Node {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.node.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.xpand3.node.NodePackage#getCompositeNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getChildren();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' attribute.
	 * @see #setRule(String)
	 * @see org.eclipse.xpand3.node.NodePackage#getCompositeNode_Rule()
	 * @model
	 * @generated
	 */
	String getRule();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.node.CompositeNode#getRule <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' attribute.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(String value);

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

} // CompositeNode
