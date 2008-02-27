/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtensionImpl.java,v 1.1 2008/02/27 13:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3.declaration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.declaration.DeclarationPackage;
import org.eclipse.xpand3.declaration.Extension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.ExtensionImpl#isCached <em>Cached</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends AbstractNamedDeclarationImpl implements Extension {
	/**
	 * The default value of the '{@link #isCached() <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCached()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCached() <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCached()
	 * @generated
	 * @ordered
	 */
	protected boolean cached = CACHED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCached() {
		return cached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCached(boolean newCached) {
		boolean oldCached = cached;
		cached = newCached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.EXTENSION__CACHED, oldCached, cached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.EXTENSION__CACHED:
				return isCached() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeclarationPackage.EXTENSION__CACHED:
				setCached(((Boolean)newValue).booleanValue());
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
			case DeclarationPackage.EXTENSION__CACHED:
				setCached(CACHED_EDEFAULT);
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
			case DeclarationPackage.EXTENSION__CACHED:
				return cached != CACHED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cached: ");
		result.append(cached);
		result.append(')');
		return result.toString();
	}

} //ExtensionImpl
