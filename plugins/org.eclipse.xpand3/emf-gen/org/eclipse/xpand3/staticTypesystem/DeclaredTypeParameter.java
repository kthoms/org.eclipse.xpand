/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredTypeParameter.java,v 1.4 2008/03/07 14:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.DeclaredTypeParameter#getUpperBounds <em>Upper Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredTypeParameter()
 * @model
 * @generated
 */
public interface DeclaredTypeParameter extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Upper Bounds</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.AbstractTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bounds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bounds</em>' containment reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getDeclaredTypeParameter_UpperBounds()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTypeReference> getUpperBounds();

} // DeclaredTypeParameter
