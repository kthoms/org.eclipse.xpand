/**
 * <copyright>
 * </copyright>
 *
 * $Id: FunctionTypeImpl.java,v 1.1 2008/03/04 10:53:02 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.FunctionType;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage;

import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.FunctionTypeImpl#getDeclaredFunction <em>Declared Function</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.FunctionTypeImpl#getActualTypeArguments <em>Actual Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionTypeImpl extends AbstractTypeReferenceImpl implements FunctionType {
	/**
	 * The cached value of the '{@link #getDeclaredFunction() <em>Declared Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredFunction()
	 * @generated
	 * @ordered
	 */
	protected DeclaredFunction declaredFunction;

	/**
	 * The cached value of the '{@link #getActualTypeArguments() <em>Actual Type Arguments</em>}' reference list.
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
	protected FunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticTypesystemPackage.Literals.FUNCTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredFunction getDeclaredFunction() {
		if (declaredFunction != null && declaredFunction.eIsProxy()) {
			InternalEObject oldDeclaredFunction = (InternalEObject)declaredFunction;
			declaredFunction = (DeclaredFunction)eResolveProxy(oldDeclaredFunction);
			if (declaredFunction != oldDeclaredFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticTypesystemPackage.FUNCTION_TYPE__DECLARED_FUNCTION, oldDeclaredFunction, declaredFunction));
			}
		}
		return declaredFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredFunction basicGetDeclaredFunction() {
		return declaredFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredFunction(DeclaredFunction newDeclaredFunction) {
		DeclaredFunction oldDeclaredFunction = declaredFunction;
		declaredFunction = newDeclaredFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticTypesystemPackage.FUNCTION_TYPE__DECLARED_FUNCTION, oldDeclaredFunction, declaredFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTypeReference> getActualTypeArguments() {
		if (actualTypeArguments == null) {
			actualTypeArguments = new EObjectResolvingEList<AbstractTypeReference>(AbstractTypeReference.class, this, StaticTypesystemPackage.FUNCTION_TYPE__ACTUAL_TYPE_ARGUMENTS);
		}
		return actualTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticTypesystemPackage.FUNCTION_TYPE__DECLARED_FUNCTION:
				if (resolve) return getDeclaredFunction();
				return basicGetDeclaredFunction();
			case StaticTypesystemPackage.FUNCTION_TYPE__ACTUAL_TYPE_ARGUMENTS:
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
			case StaticTypesystemPackage.FUNCTION_TYPE__DECLARED_FUNCTION:
				setDeclaredFunction((DeclaredFunction)newValue);
				return;
			case StaticTypesystemPackage.FUNCTION_TYPE__ACTUAL_TYPE_ARGUMENTS:
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
			case StaticTypesystemPackage.FUNCTION_TYPE__DECLARED_FUNCTION:
				setDeclaredFunction((DeclaredFunction)null);
				return;
			case StaticTypesystemPackage.FUNCTION_TYPE__ACTUAL_TYPE_ARGUMENTS:
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
			case StaticTypesystemPackage.FUNCTION_TYPE__DECLARED_FUNCTION:
				return declaredFunction != null;
			case StaticTypesystemPackage.FUNCTION_TYPE__ACTUAL_TYPE_ARGUMENTS:
				return actualTypeArguments != null && !actualTypeArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionTypeImpl
