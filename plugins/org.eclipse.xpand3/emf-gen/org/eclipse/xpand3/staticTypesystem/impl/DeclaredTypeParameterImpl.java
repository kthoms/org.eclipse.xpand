/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredTypeParameterImpl.java,v 1.1 2008/03/04 14:03:38 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredTypeParameter;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredTypeParameterImpl#getUpperBounds <em>Upper Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclaredTypeParameterImpl extends AbstractNamedElementImpl implements DeclaredTypeParameter {
	/**
	 * The cached value of the '{@link #getUpperBounds() <em>Upper Bounds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBounds()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeReference> upperBounds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredTypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticTypesystemPackage.Literals.DECLARED_TYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTypeReference> getUpperBounds() {
		if (upperBounds == null) {
			upperBounds = new EObjectResolvingEList<AbstractTypeReference>(AbstractTypeReference.class, this, StaticTypesystemPackage.DECLARED_TYPE_PARAMETER__UPPER_BOUNDS);
		}
		return upperBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticTypesystemPackage.DECLARED_TYPE_PARAMETER__UPPER_BOUNDS:
				return getUpperBounds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StaticTypesystemPackage.DECLARED_TYPE_PARAMETER__UPPER_BOUNDS:
				getUpperBounds().clear();
				getUpperBounds().addAll((Collection<? extends AbstractTypeReference>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StaticTypesystemPackage.DECLARED_TYPE_PARAMETER__UPPER_BOUNDS:
				getUpperBounds().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StaticTypesystemPackage.DECLARED_TYPE_PARAMETER__UPPER_BOUNDS:
				return upperBounds != null && !upperBounds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeclaredTypeParameterImpl
