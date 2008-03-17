/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractStatementWithBody.java,v 1.1 2008/03/17 14:39:03 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Statement With Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.AbstractStatementWithBody#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.statement.StatementPackage#getAbstractStatementWithBody()
 * @model abstract="true"
 * @generated
 */
public interface AbstractStatementWithBody extends AbstractStatement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.statement.AbstractStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.eclipse.xpand3.statement.StatementPackage#getAbstractStatementWithBody_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractStatement> getBody();

} // AbstractStatementWithBody
