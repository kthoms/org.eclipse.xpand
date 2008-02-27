/**
 * <copyright>
 * </copyright>
 *
 * $Id: CreateExtensionStatementImpl.java,v 1.1 2008/02/27 13:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3.declaration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.DeclaredParameter;

import org.eclipse.xpand3.declaration.CreateExtensionStatement;
import org.eclipse.xpand3.declaration.DeclarationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Extension Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.CreateExtensionStatementImpl#getToBeCreated <em>To Be Created</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateExtensionStatementImpl extends ExtensionImpl implements CreateExtensionStatement {
	/**
	 * The cached value of the '{@link #getToBeCreated() <em>To Be Created</em>}' containment reference.
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
	protected CreateExtensionStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CREATE_EXTENSION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredParameter getToBeCreated() {
		return toBeCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToBeCreated(DeclaredParameter newToBeCreated, NotificationChain msgs) {
		DeclaredParameter oldToBeCreated = toBeCreated;
		toBeCreated = newToBeCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.CREATE_EXTENSION_STATEMENT__TO_BE_CREATED, oldToBeCreated, newToBeCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBeCreated(DeclaredParameter newToBeCreated) {
		if (newToBeCreated != toBeCreated) {
			NotificationChain msgs = null;
			if (toBeCreated != null)
				msgs = ((InternalEObject)toBeCreated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CREATE_EXTENSION_STATEMENT__TO_BE_CREATED, null, msgs);
			if (newToBeCreated != null)
				msgs = ((InternalEObject)newToBeCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CREATE_EXTENSION_STATEMENT__TO_BE_CREATED, null, msgs);
			msgs = basicSetToBeCreated(newToBeCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CREATE_EXTENSION_STATEMENT__TO_BE_CREATED, newToBeCreated, newToBeCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.CREATE_EXTENSION_STATEMENT__TO_BE_CREATED:
				return basicSetToBeCreated(null, msgs);
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
			case DeclarationPackage.CREATE_EXTENSION_STATEMENT__TO_BE_CREATED:
				return getToBeCreated();
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
			case DeclarationPackage.CREATE_EXTENSION_STATEMENT__TO_BE_CREATED:
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
			case DeclarationPackage.CREATE_EXTENSION_STATEMENT__TO_BE_CREATED:
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
			case DeclarationPackage.CREATE_EXTENSION_STATEMENT__TO_BE_CREATED:
				return toBeCreated != null;
		}
		return super.eIsSet(featureID);
	}

} //CreateExtensionStatementImpl
