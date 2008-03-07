/**
 * <copyright>
 * </copyright>
 *
 * $Id: GlobalVarExpressionImpl.java,v 1.2 2008/03/07 11:10:38 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.ExpressionPackage;
import org.eclipse.xpand3.expression.GlobalVarExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Var Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.impl.GlobalVarExpressionImpl#getGlobalVarName <em>Global Var Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalVarExpressionImpl extends AbstractExpressionImpl implements GlobalVarExpression {
	/**
	 * The cached value of the '{@link #getGlobalVarName() <em>Global Var Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVarName()
	 * @generated
	 * @ordered
	 */
	protected Identifier globalVarName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVarExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.GLOBAL_VAR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getGlobalVarName() {
		return globalVarName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalVarName(Identifier newGlobalVarName, NotificationChain msgs) {
		Identifier oldGlobalVarName = globalVarName;
		globalVarName = newGlobalVarName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.GLOBAL_VAR_EXPRESSION__GLOBAL_VAR_NAME, oldGlobalVarName, newGlobalVarName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalVarName(Identifier newGlobalVarName) {
		if (newGlobalVarName != globalVarName) {
			NotificationChain msgs = null;
			if (globalVarName != null)
				msgs = ((InternalEObject)globalVarName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.GLOBAL_VAR_EXPRESSION__GLOBAL_VAR_NAME, null, msgs);
			if (newGlobalVarName != null)
				msgs = ((InternalEObject)newGlobalVarName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.GLOBAL_VAR_EXPRESSION__GLOBAL_VAR_NAME, null, msgs);
			msgs = basicSetGlobalVarName(newGlobalVarName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.GLOBAL_VAR_EXPRESSION__GLOBAL_VAR_NAME, newGlobalVarName, newGlobalVarName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.GLOBAL_VAR_EXPRESSION__GLOBAL_VAR_NAME:
				return basicSetGlobalVarName(null, msgs);
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
			case ExpressionPackage.GLOBAL_VAR_EXPRESSION__GLOBAL_VAR_NAME:
				return getGlobalVarName();
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
			case ExpressionPackage.GLOBAL_VAR_EXPRESSION__GLOBAL_VAR_NAME:
				setGlobalVarName((Identifier)newValue);
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
			case ExpressionPackage.GLOBAL_VAR_EXPRESSION__GLOBAL_VAR_NAME:
				setGlobalVarName((Identifier)null);
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
			case ExpressionPackage.GLOBAL_VAR_EXPRESSION__GLOBAL_VAR_NAME:
				return globalVarName != null;
		}
		return super.eIsSet(featureID);
	}

} //GlobalVarExpressionImpl
