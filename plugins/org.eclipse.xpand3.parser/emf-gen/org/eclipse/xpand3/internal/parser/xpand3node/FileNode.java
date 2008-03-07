/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileNode.java,v 1.2 2008/03/07 09:39:41 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.emf.common.util.EList;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.FileNode#getImp <em>Imp</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.FileNode#getDecl <em>Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getFileNode()
 * @model
 * @generated
 */
public interface FileNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>Decl</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.tmf.common.node.CompositeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decl</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decl</em>' reference list.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getFileNode_Decl()
	 * @model
	 * @generated
	 */
	EList<CompositeNode> getDecl();

	/**
	 * Returns the value of the '<em><b>Imp</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.tmf.common.node.CompositeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imp</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imp</em>' reference list.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getFileNode_Imp()
	 * @model
	 * @generated
	 */
	EList<CompositeNode> getImp();

} // FileNode
