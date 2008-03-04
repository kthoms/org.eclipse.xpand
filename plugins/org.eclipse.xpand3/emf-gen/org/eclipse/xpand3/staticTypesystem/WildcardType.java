/**
 * <copyright>
 * </copyright>
 *
 * $Id: WildcardType.java,v 1.3 2008/03/04 14:28:06 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wildcard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.WildcardType#getLowerBounds <em>Lower Bounds</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.WildcardType#getUpperBounds <em>Upper Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getWildcardType()
 * @model
 * @generated
 */
public interface WildcardType extends AbstractTypeReference {
	/**
	 * Returns the value of the '<em><b>Lower Bounds</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.AbstractTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bounds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bounds</em>' reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getWildcardType_LowerBounds()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeReference> getLowerBounds();

	/**
	 * Returns the value of the '<em><b>Upper Bounds</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.staticTypesystem.AbstractTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bounds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bounds</em>' reference list.
	 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage#getWildcardType_UpperBounds()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeReference> getUpperBounds();

} // WildcardType
