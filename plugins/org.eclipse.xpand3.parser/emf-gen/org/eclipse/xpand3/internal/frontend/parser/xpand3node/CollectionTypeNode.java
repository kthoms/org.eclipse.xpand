/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionTypeNode.java,v 1.1 2008/03/17 14:39:12 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CollectionTypeNode#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CollectionTypeNode#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getCollectionTypeNode()
 * @model
 * @generated
 */
public interface CollectionTypeNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Type</em>' reference.
	 * @see #setCollectionType(LeafNode)
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getCollectionTypeNode_CollectionType()
	 * @model
	 * @generated
	 */
	LeafNode getCollectionType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CollectionTypeNode#getCollectionType <em>Collection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' reference.
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(LeafNode value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(CompositeNode)
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getCollectionTypeNode_ElementType()
	 * @model
	 * @generated
	 */
	CompositeNode getElementType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CollectionTypeNode#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(CompositeNode value);

} // CollectionTypeNode
