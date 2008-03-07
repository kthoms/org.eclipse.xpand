/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeImpl.java,v 1.5 2008/03/07 14:21:07 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage;
import org.eclipse.xpand3.staticTypesystem.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.TypeImpl#getDeclaredType <em>Declared Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.TypeImpl#getActualTypeArguments <em>Actual Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends AbstractTypeReferenceImpl implements Type {
	/**
	 * The cached value of the '{@link #getDeclaredType() <em>Declared Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredType()
	 * @generated
	 * @ordered
	 */
	protected DeclaredType declaredType;

	/**
	 * The cached value of the '{@link #getActualTypeArguments() <em>Actual Type Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeReference> actualTypeArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticTypesystemPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredType getDeclaredType() {
		if (declaredType != null && declaredType.eIsProxy()) {
			InternalEObject oldDeclaredType = (InternalEObject)declaredType;
			declaredType = (DeclaredType)eResolveProxy(oldDeclaredType);
			if (declaredType != oldDeclaredType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticTypesystemPackage.TYPE__DECLARED_TYPE, oldDeclaredType, declaredType));
			}
		}
		return declaredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredType basicGetDeclaredType() {
		return declaredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredType(DeclaredType newDeclaredType) {
		DeclaredType oldDeclaredType = declaredType;
		declaredType = newDeclaredType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticTypesystemPackage.TYPE__DECLARED_TYPE, oldDeclaredType, declaredType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTypeReference> getActualTypeArguments() {
		if (actualTypeArguments == null) {
			actualTypeArguments = new EObjectContainmentEList<AbstractTypeReference>(AbstractTypeReference.class, this, StaticTypesystemPackage.TYPE__ACTUAL_TYPE_ARGUMENTS);
		}
		return actualTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticTypesystemPackage.TYPE__ACTUAL_TYPE_ARGUMENTS:
				return ((InternalEList<?>)getActualTypeArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticTypesystemPackage.TYPE__DECLARED_TYPE:
				if (resolve) return getDeclaredType();
				return basicGetDeclaredType();
			case StaticTypesystemPackage.TYPE__ACTUAL_TYPE_ARGUMENTS:
				return getActualTypeArguments();
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
			case StaticTypesystemPackage.TYPE__DECLARED_TYPE:
				setDeclaredType((DeclaredType)newValue);
				return;
			case StaticTypesystemPackage.TYPE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
				getActualTypeArguments().addAll((Collection<? extends AbstractTypeReference>)newValue);
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
			case StaticTypesystemPackage.TYPE__DECLARED_TYPE:
				setDeclaredType((DeclaredType)null);
				return;
			case StaticTypesystemPackage.TYPE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
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
			case StaticTypesystemPackage.TYPE__DECLARED_TYPE:
				return declaredType != null;
			case StaticTypesystemPackage.TYPE__ACTUAL_TYPE_ARGUMENTS:
				return actualTypeArguments != null && !actualTypeArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeImpl
