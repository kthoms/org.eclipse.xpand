/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredOperationImpl.java,v 1.1 2008/03/04 14:03:38 sefftinge Exp $
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredOperation;
import org.eclipse.xpand3.staticTypesystem.DeclaredParameter;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredOperationImpl#getDeclaredParameters <em>Declared Parameters</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredOperationImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredOperationImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclaredOperationImpl extends AbstractNamedElementImpl implements DeclaredOperation {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
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
	protected DeclaredOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticTypesystemPackage.Literals.DECLARED_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclaredParameter> getDeclaredParameters() {
		if (declaredParameters == null) {
			declaredParameters = new EObjectContainmentEList<DeclaredParameter>(DeclaredParameter.class, this, StaticTypesystemPackage.DECLARED_OPERATION__DECLARED_PARAMETERS);
		}
		return declaredParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredType getDeclaringType() {
		if (eContainerFeatureID != StaticTypesystemPackage.DECLARED_OPERATION__DECLARING_TYPE) return null;
		return (DeclaredType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaringType(DeclaredType newDeclaringType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDeclaringType, StaticTypesystemPackage.DECLARED_OPERATION__DECLARING_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaringType(DeclaredType newDeclaringType) {
		if (newDeclaringType != eInternalContainer() || (eContainerFeatureID != StaticTypesystemPackage.DECLARED_OPERATION__DECLARING_TYPE && newDeclaringType != null)) {
			if (EcoreUtil.isAncestor(this, newDeclaringType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeclaringType != null)
				msgs = ((InternalEObject)newDeclaringType).eInverseAdd(this, StaticTypesystemPackage.DECLARED_TYPE__OPERATIONS, DeclaredType.class, msgs);
			msgs = basicSetDeclaringType(newDeclaringType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticTypesystemPackage.DECLARED_OPERATION__DECLARING_TYPE, newDeclaringType, newDeclaringType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeReference getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (AbstractTypeReference)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticTypesystemPackage.DECLARED_OPERATION__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeReference basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(AbstractTypeReference newReturnType) {
		AbstractTypeReference oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticTypesystemPackage.DECLARED_OPERATION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARING_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeclaringType((DeclaredType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARED_PARAMETERS:
				return ((InternalEList<?>)getDeclaredParameters()).basicRemove(otherEnd, msgs);
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARING_TYPE:
				return basicSetDeclaringType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARING_TYPE:
				return eInternalContainer().eInverseRemove(this, StaticTypesystemPackage.DECLARED_TYPE__OPERATIONS, DeclaredType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARED_PARAMETERS:
				return getDeclaredParameters();
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARING_TYPE:
				return getDeclaringType();
			case StaticTypesystemPackage.DECLARED_OPERATION__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
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
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARED_PARAMETERS:
				getDeclaredParameters().clear();
				getDeclaredParameters().addAll((Collection<? extends DeclaredParameter>)newValue);
				return;
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARING_TYPE:
				setDeclaringType((DeclaredType)newValue);
				return;
			case StaticTypesystemPackage.DECLARED_OPERATION__RETURN_TYPE:
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
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARED_PARAMETERS:
				getDeclaredParameters().clear();
				return;
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARING_TYPE:
				setDeclaringType((DeclaredType)null);
				return;
			case StaticTypesystemPackage.DECLARED_OPERATION__RETURN_TYPE:
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
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARED_PARAMETERS:
				return declaredParameters != null && !declaredParameters.isEmpty();
			case StaticTypesystemPackage.DECLARED_OPERATION__DECLARING_TYPE:
				return getDeclaringType() != null;
			case StaticTypesystemPackage.DECLARED_OPERATION__RETURN_TYPE:
				return returnType != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclaredOperationImpl
