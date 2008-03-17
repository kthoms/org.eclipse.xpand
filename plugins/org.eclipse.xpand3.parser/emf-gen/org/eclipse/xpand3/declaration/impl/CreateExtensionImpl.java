/**
 * <copyright>
 * </copyright>
 *
 * $Id: CreateExtensionImpl.java,v 1.1 2008/03/17 14:39:13 jkohnlein Exp $
 */
package org.eclipse.xpand3.declaration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.DeclaredParameter;

import org.eclipse.xpand3.declaration.CreateExtension;
import org.eclipse.xpand3.declaration.DeclarationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.CreateExtensionImpl#getToBeCreated <em>To Be Created</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateExtensionImpl extends ExtensionImpl implements CreateExtension {
	/**
	 * The cached value of the '{@link #getToBeCreated() <em>To Be Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBeCreated()
	 * @generated
	 * @ordered
	 */
	protected DeclaredParameter toBeCreated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CREATE_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredParameter getToBeCreated() {
		if (toBeCreated != null && toBeCreated.eIsProxy()) {
			InternalEObject oldToBeCreated = (InternalEObject)toBeCreated;
			toBeCreated = (DeclaredParameter)eResolveProxy(oldToBeCreated);
			if (toBeCreated != oldToBeCreated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CREATE_EXTENSION__TO_BE_CREATED, oldToBeCreated, toBeCreated));
			}
		}
		return toBeCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredParameter basicGetToBeCreated() {
		return toBeCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBeCreated(DeclaredParameter newToBeCreated) {
		DeclaredParameter oldToBeCreated = toBeCreated;
		toBeCreated = newToBeCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CREATE_EXTENSION__TO_BE_CREATED, oldToBeCreated, toBeCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CREATE_EXTENSION__TO_BE_CREATED:
				if (resolve) return getToBeCreated();
				return basicGetToBeCreated();
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
			case DeclarationPackage.CREATE_EXTENSION__TO_BE_CREATED:
				setToBeCreated((DeclaredParameter)newValue);
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
			case DeclarationPackage.CREATE_EXTENSION__TO_BE_CREATED:
				setToBeCreated((DeclaredParameter)null);
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
			case DeclarationPackage.CREATE_EXTENSION__TO_BE_CREATED:
				return toBeCreated != null;
		}
		return super.eIsSet(featureID);
	}

} //CreateExtensionImpl
