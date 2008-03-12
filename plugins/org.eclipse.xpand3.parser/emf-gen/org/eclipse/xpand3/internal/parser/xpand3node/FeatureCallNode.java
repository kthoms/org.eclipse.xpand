/**
 * <copyright>
 * </copyright>
 *
 * $Id: FeatureCallNode.java,v 1.5 2008/03/12 09:54:12 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Call Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode#getParamList <em>Param List</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getFeatureCallNode()
 * @model
 * @generated
 */
public interface FeatureCallNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getFeatureCallNode_Type()
	 * @model
	 * @generated
	 */
	CompositeNode getType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CompositeNode value);

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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getFeatureCallNode_Name()
	 * @model
	 * @generated
	 */
	CompositeNode getName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CompositeNode value);

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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getFeatureCallNode_ParamList()
	 * @model
	 * @generated
	 */
	CompositeNode getParamList();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode#getParamList <em>Param List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param List</em>' reference.
	 * @see #getParamList()
	 * @generated
	 */
	void setParamList(CompositeNode value);

} // FeatureCallNode
