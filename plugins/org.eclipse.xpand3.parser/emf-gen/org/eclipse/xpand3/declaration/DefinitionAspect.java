/**
 * <copyright>
 * </copyright>
 *
 * $Id: DefinitionAspect.java,v 1.1 2008/03/17 14:39:12 jkohnlein Exp $
 */
package org.eclipse.xpand3.declaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xpand3.statement.AbstractStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.DefinitionAspect#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getDefinitionAspect()
 * @model
 * @generated
 */
public interface DefinitionAspect extends AbstractAspect {
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
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getDefinitionAspect_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractStatement> getBody();

} // DefinitionAspect
