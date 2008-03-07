/**
 * <copyright>
 * </copyright>
 *
 * $Id: NsImportNode.java,v 1.2 2008/03/07 09:39:40 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ns Import Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.NsImportNode#getNs <em>Ns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getNsImportNode()
 * @model
 * @generated
 */
public interface NsImportNode extends CompositeNode {
	/**
	 * Returns the value of the '<em><b>Ns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns</em>' reference.
	 * @see #setNs(CompositeNode)
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#getNsImportNode_Ns()
	 * @model
	 * @generated
	 */
	CompositeNode getNs();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.parser.xpand3node.NsImportNode#getNs <em>Ns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' reference.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(CompositeNode value);

} // NsImportNode
