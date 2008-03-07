/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredFunctionImpl.java,v 1.4 2008/03/07 14:21:07 sefftinge Exp $
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

import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.DeclaredParameter;
import org.eclipse.xpand3.staticTypesystem.DeclaredTypeParameter;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredFunctionImpl#getDeclaredParameters <em>Declared Parameters</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredFunctionImpl#getDeclaredTypeParameters <em>Declared Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredFunctionImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclaredFunctionImpl extends AbstractNamedElementImpl implements DeclaredFunction {
	/**
	 * The cached value of the '{@link #getDeclaredParameters() <em>Declared Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclaredParameter> declaredParameters;

	/**
	 * The cached value of the '{@link #getDeclaredTypeParameters() <em>Declared Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclaredTypeParameter> declaredTypeParameters;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeReference returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticTypesystemPackage.Literals.DECLARED_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclaredParameter> getDeclaredParameters() {
		if (declaredParameters == null) {
			declaredParameters = new EObjectContainmentEList<DeclaredParameter>(DeclaredParameter.class, this, StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_PARAMETERS);
		}
		return declaredParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclaredTypeParameter> getDeclaredTypeParameters() {
		if (declaredTypeParameters == null) {
			declaredTypeParameters = new EObjectContainmentEList<DeclaredTypeParameter>(DeclaredTypeParameter.class, this, StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_TYPE_PARAMETERS);
		}
		return declaredTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeReference getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(AbstractTypeReference newReturnType, NotificationChain msgs) {
		AbstractTypeReference oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StaticTypesystemPackage.DECLARED_FUNCTION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(AbstractTypeReference newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StaticTypesystemPackage.DECLARED_FUNCTION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StaticTypesystemPackage.DECLARED_FUNCTION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticTypesystemPackage.DECLARED_FUNCTION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_PARAMETERS:
				return ((InternalEList<?>)getDeclaredParameters()).basicRemove(otherEnd, msgs);
			case StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_TYPE_PARAMETERS:
				return ((InternalEList<?>)getDeclaredTypeParameters()).basicRemove(otherEnd, msgs);
			case StaticTypesystemPackage.DECLARED_FUNCTION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
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
			case StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_PARAMETERS:
				return getDeclaredParameters();
			case StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_TYPE_PARAMETERS:
				return getDeclaredTypeParameters();
			case StaticTypesystemPackage.DECLARED_FUNCTION__RETURN_TYPE:
				return getReturnType();
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
			case StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_PARAMETERS:
				getDeclaredParameters().clear();
				getDeclaredParameters().addAll((Collection<? extends DeclaredParameter>)newValue);
				return;
			case StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_TYPE_PARAMETERS:
				getDeclaredTypeParameters().clear();
				getDeclaredTypeParameters().addAll((Collection<? extends DeclaredTypeParameter>)newValue);
				return;
			case StaticTypesystemPackage.DECLARED_FUNCTION__RETURN_TYPE:
				setReturnType((AbstractTypeReference)newValue);
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
			case StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_PARAMETERS:
				getDeclaredParameters().clear();
				return;
			case StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_TYPE_PARAMETERS:
				getDeclaredTypeParameters().clear();
				return;
			case StaticTypesystemPackage.DECLARED_FUNCTION__RETURN_TYPE:
				setReturnType((AbstractTypeReference)null);
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
			case StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_PARAMETERS:
				return declaredParameters != null && !declaredParameters.isEmpty();
			case StaticTypesystemPackage.DECLARED_FUNCTION__DECLARED_TYPE_PARAMETERS:
				return declaredTypeParameters != null && !declaredTypeParameters.isEmpty();
			case StaticTypesystemPackage.DECLARED_FUNCTION__RETURN_TYPE:
				return returnType != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclaredFunctionImpl
