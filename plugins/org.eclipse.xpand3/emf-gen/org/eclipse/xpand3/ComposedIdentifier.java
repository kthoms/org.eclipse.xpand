/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComposedIdentifier.java,v 1.1 2008/02/27 13:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.ComposedIdentifier#getIdentifiers <em>Identifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.Xpand3Package#getComposedIdentifier()
 * @model
 * @generated
 */
public interface ComposedIdentifier extends Identifier {
	/**
	 * Returns the value of the '<em><b>Identifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiers</em>' containment reference list.
	 * @see org.eclipse.xpand3.Xpand3Package#getComposedIdentifier_Identifiers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

} // ComposedIdentifier
