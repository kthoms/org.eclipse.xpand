/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelImpl.java,v 1.1 2008/03/17 14:39:20 jkohnlein Exp $
 */
package org.eclipse.xpand3.staticTypesystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.Model;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.ModelImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.eclipse.xpand3.staticTypesystem.impl.ModelImpl#getFunctionDeclarations <em>Function Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclaredType> declarations;

	/**
	 * The cached value of the '{@link #getFunctionDeclarations() <em>Function Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclaredFunction> functionDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticTypesystemPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclaredType> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<DeclaredType>(DeclaredType.class, this, StaticTypesystemPackage.MODEL__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclaredFunction> getFunctionDeclarations() {
		if (functionDeclarations == null) {
			functionDeclarations = new EObjectContainmentEList<DeclaredFunction>(DeclaredFunction.class, this, StaticTypesystemPackage.MODEL__FUNCTION_DECLARATIONS);
		}
		return functionDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticTypesystemPackage.MODEL__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StaticTypesystemPackage.MODEL__FUNCTION_DECLARATIONS:
				return ((InternalEList<?>)getFunctionDeclarations()).basicRemove(otherEnd, msgs);
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
			case StaticTypesystemPackage.MODEL__DECLARATIONS:
				return getDeclarations();
			case StaticTypesystemPackage.MODEL__FUNCTION_DECLARATIONS:
				return getFunctionDeclarations();
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
			case StaticTypesystemPackage.MODEL__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends DeclaredType>)newValue);
				return;
			case StaticTypesystemPackage.MODEL__FUNCTION_DECLARATIONS:
				getFunctionDeclarations().clear();
				getFunctionDeclarations().addAll((Collection<? extends DeclaredFunction>)newValue);
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
			case StaticTypesystemPackage.MODEL__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StaticTypesystemPackage.MODEL__FUNCTION_DECLARATIONS:
				getFunctionDeclarations().clear();
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
			case StaticTypesystemPackage.MODEL__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StaticTypesystemPackage.MODEL__FUNCTION_DECLARATIONS:
				return functionDeclarations != null && !functionDeclarations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
