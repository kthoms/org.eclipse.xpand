/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeVariableImpl.java,v 1.2 2008/03/04 14:03:38 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.staticTypesystem.DeclaredTypeParameter;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage;
import org.eclipse.xpand3.staticTypesystem.TypeVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.TypeVariableImpl#getDeclaredTypeParameter <em>Declared Type Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeVariableImpl extends AbstractTypeReferenceImpl implements TypeVariable {
	/**
	 * The cached value of the '{@link #getDeclaredTypeParameter() <em>Declared Type Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected DeclaredTypeParameter declaredTypeParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticTypesystemPackage.Literals.TYPE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredTypeParameter getDeclaredTypeParameter() {
		if (declaredTypeParameter != null && declaredTypeParameter.eIsProxy()) {
			InternalEObject oldDeclaredTypeParameter = (InternalEObject)declaredTypeParameter;
			declaredTypeParameter = (DeclaredTypeParameter)eResolveProxy(oldDeclaredTypeParameter);
			if (declaredTypeParameter != oldDeclaredTypeParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticTypesystemPackage.TYPE_VARIABLE__DECLARED_TYPE_PARAMETER, oldDeclaredTypeParameter, declaredTypeParameter));
			}
		}
		return declaredTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredTypeParameter basicGetDeclaredTypeParameter() {
		return declaredTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredTypeParameter(DeclaredTypeParameter newDeclaredTypeParameter) {
		DeclaredTypeParameter oldDeclaredTypeParameter = declaredTypeParameter;
		declaredTypeParameter = newDeclaredTypeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticTypesystemPackage.TYPE_VARIABLE__DECLARED_TYPE_PARAMETER, oldDeclaredTypeParameter, declaredTypeParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticTypesystemPackage.TYPE_VARIABLE__DECLARED_TYPE_PARAMETER:
				if (resolve) return getDeclaredTypeParameter();
				return basicGetDeclaredTypeParameter();
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
			case StaticTypesystemPackage.TYPE_VARIABLE__DECLARED_TYPE_PARAMETER:
				setDeclaredTypeParameter((DeclaredTypeParameter)newValue);
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
			case StaticTypesystemPackage.TYPE_VARIABLE__DECLARED_TYPE_PARAMETER:
				setDeclaredTypeParameter((DeclaredTypeParameter)null);
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
			case StaticTypesystemPackage.TYPE_VARIABLE__DECLARED_TYPE_PARAMETER:
				return declaredTypeParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeVariableImpl
