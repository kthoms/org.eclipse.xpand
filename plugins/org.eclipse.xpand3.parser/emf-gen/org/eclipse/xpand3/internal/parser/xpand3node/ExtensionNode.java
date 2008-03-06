/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtensionNode.java,v 1.2 2008/03/06 15:25:16 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.emf.common.util.EList;
import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getPrivate <em>Private</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getParamList <em>Param List</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getExtendBody <em>Extend Body</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getCached <em>Cached</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getJavaReturnType <em>Java Return Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getJavaName <em>Java Name</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExtensionNode()
 * @model
 * @generated
 */
public interface ExtensionNode extends CompositeNode {

	/**
	 * Returns the value of the '<em><b>Create</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' reference.
	 * @see #setCreate(LeafNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExtensionNode_Create()
	 * @model
	 * @generated
	 */
	LeafNode getCreate();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getCreate <em>Create</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' reference.
	 * @see #getCreate()
	 * @generated
	 */
	void setCreate(LeafNode value);

	/**
	 * Returns the value of the '<em><b>Private</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private</em>' reference.
	 * @see #setPrivate(LeafNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExtensionNode_Private()
	 * @model
	 * @generated
	 */
	LeafNode getPrivate();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getPrivate <em>Private</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' reference.
	 * @see #getPrivate()
	 * @generated
	 */
	void setPrivate(LeafNode value);

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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExtensionNode_ParamList()
	 * @model
	 * @generated
	 */
	CompositeNode getParamList();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getParamList <em>Param List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param List</em>' reference.
	 * @see #getParamList()
	 * @generated
	 */
	void setParamList(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Extend Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend Body</em>' reference.
	 * @see #setExtendBody(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExtensionNode_ExtendBody()
	 * @model
	 * @generated
	 */
	CompositeNode getExtendBody();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getExtendBody <em>Extend Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend Body</em>' reference.
	 * @see #getExtendBody()
	 * @generated
	 */
	void setExtendBody(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Cached</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached</em>' reference.
	 * @see #setCached(LeafNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExtensionNode_Cached()
	 * @model
	 * @generated
	 */
	LeafNode getCached();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getCached <em>Cached</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached</em>' reference.
	 * @see #getCached()
	 * @generated
	 */
	void setCached(LeafNode value);

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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExtensionNode_JavaReturnType()
	 * @model
	 * @generated
	 */
	CompositeNode getJavaReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getJavaReturnType <em>Java Return Type</em>}' reference.
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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExtensionNode_JavaName()
	 * @model
	 * @generated
	 */
	CompositeNode getJavaName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getJavaName <em>Java Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Name</em>' reference.
	 * @see #getJavaName()
	 * @generated
	 */
	void setJavaName(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExtensionNode_ReturnType()
	 * @model
	 * @generated
	 */
	CompositeNode getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(CompositeNode value);

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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getExtensionNode_Name()
	 * @model
	 * @generated
	 */
	CompositeNode getName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CompositeNode value);
} // ExtensionNode
