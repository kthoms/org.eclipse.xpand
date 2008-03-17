/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationCall.java,v 1.1 2008/03/17 14:39:06 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.OperationCall#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.expression.ExpressionPackage#getOperationCall()
 * @model
 * @generated
 */
public interface OperationCall extends FeatureCall {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.expression.AbstractExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see org.eclipse.xpand3.expression.ExpressionPackage#getOperationCall_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractExpression> getParams();

} // OperationCall
