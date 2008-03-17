/**
 * <copyright>
 * </copyright>
 *
 * $Id: CheckNode.java,v 1.1 2008/03/17 14:39:12 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getError <em>Error</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getIfExpression <em>If Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getCheckNode()
 * @model
 * @generated
 */
public interface CheckNode extends CompositeNode {
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
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getCheckNode_Type()
	 * @model
	 * @generated
	 */
	CompositeNode getType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' reference.
	 * @see #setError(LeafNode)
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getCheckNode_Error()
	 * @model
	 * @generated
	 */
	LeafNode getError();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getError <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(LeafNode value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(CompositeNode)
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getCheckNode_Message()
	 * @model
	 * @generated
	 */
	CompositeNode getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>If Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Expression</em>' reference.
	 * @see #setIfExpression(CompositeNode)
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getCheckNode_IfExpression()
	 * @model
	 * @generated
	 */
	CompositeNode getIfExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getIfExpression <em>If Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Expression</em>' reference.
	 * @see #getIfExpression()
	 * @generated
	 */
	void setIfExpression(CompositeNode value);

	/**
	 * Returns the value of the '<em><b>Warning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning</em>' reference.
	 * @see #setWarning(LeafNode)
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getCheckNode_Warning()
	 * @model
	 * @generated
	 */
	LeafNode getWarning();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getWarning <em>Warning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning</em>' reference.
	 * @see #getWarning()
	 * @generated
	 */
	void setWarning(LeafNode value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(CompositeNode)
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#getCheckNode_Constraint()
	 * @model
	 * @generated
	 */
	CompositeNode getConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(CompositeNode value);

} // CheckNode
