/**
 * <copyright>
 * </copyright>
 *
 * $Id: CheckImpl.java,v 1.1 2008/02/27 13:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3.declaration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.declaration.Check;
import org.eclipse.xpand3.declaration.DeclarationPackage;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.CheckImpl#isErrorSeverity <em>Error Severity</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.CheckImpl#getMsg <em>Msg</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.CheckImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.CheckImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckImpl extends AbstractDeclarationImpl implements Check {
	/**
	 * The default value of the '{@link #isErrorSeverity() <em>Error Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isErrorSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ERROR_SEVERITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isErrorSeverity() <em>Error Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isErrorSeverity()
	 * @generated
	 * @ordered
	 */
	protected boolean errorSeverity = ERROR_SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMsg() <em>Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsg()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression msg;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression constraint;

	/**
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected String feature = FEATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isErrorSeverity() {
		return errorSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorSeverity(boolean newErrorSeverity) {
		boolean oldErrorSeverity = errorSeverity;
		errorSeverity = newErrorSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CHECK__ERROR_SEVERITY, oldErrorSeverity, errorSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getMsg() {
		return msg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsg(AbstractExpression newMsg, NotificationChain msgs) {
		AbstractExpression oldMsg = msg;
		msg = newMsg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.CHECK__MSG, oldMsg, newMsg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsg(AbstractExpression newMsg) {
		if (newMsg != msg) {
			NotificationChain msgs = null;
			if (msg != null)
				msgs = ((InternalEObject)msg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CHECK__MSG, null, msgs);
			if (newMsg != null)
				msgs = ((InternalEObject)newMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CHECK__MSG, null, msgs);
			msgs = basicSetMsg(newMsg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CHECK__MSG, newMsg, newMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(AbstractExpression newConstraint, NotificationChain msgs) {
		AbstractExpression oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.CHECK__CONSTRAINT, oldConstraint, newConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(AbstractExpression newConstraint) {
		if (newConstraint != constraint) {
			NotificationChain msgs = null;
			if (constraint != null)
				msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CHECK__CONSTRAINT, null, msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CHECK__CONSTRAINT, null, msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CHECK__CONSTRAINT, newConstraint, newConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(String newFeature) {
		String oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CHECK__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.CHECK__MSG:
				return basicSetMsg(null, msgs);
			case DeclarationPackage.CHECK__CONSTRAINT:
				return basicSetConstraint(null, msgs);
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
			case DeclarationPackage.CHECK__ERROR_SEVERITY:
				return isErrorSeverity() ? Boolean.TRUE : Boolean.FALSE;
			case DeclarationPackage.CHECK__MSG:
				return getMsg();
			case DeclarationPackage.CHECK__CONSTRAINT:
				return getConstraint();
			case DeclarationPackage.CHECK__FEATURE:
				return getFeature();
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
			case DeclarationPackage.CHECK__ERROR_SEVERITY:
				setErrorSeverity(((Boolean)newValue).booleanValue());
				return;
			case DeclarationPackage.CHECK__MSG:
				setMsg((AbstractExpression)newValue);
				return;
			case DeclarationPackage.CHECK__CONSTRAINT:
				setConstraint((AbstractExpression)newValue);
				return;
			case DeclarationPackage.CHECK__FEATURE:
				setFeature((String)newValue);
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
			case DeclarationPackage.CHECK__ERROR_SEVERITY:
				setErrorSeverity(ERROR_SEVERITY_EDEFAULT);
				return;
			case DeclarationPackage.CHECK__MSG:
				setMsg((AbstractExpression)null);
				return;
			case DeclarationPackage.CHECK__CONSTRAINT:
				setConstraint((AbstractExpression)null);
				return;
			case DeclarationPackage.CHECK__FEATURE:
				setFeature(FEATURE_EDEFAULT);
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
			case DeclarationPackage.CHECK__ERROR_SEVERITY:
				return errorSeverity != ERROR_SEVERITY_EDEFAULT;
			case DeclarationPackage.CHECK__MSG:
				return msg != null;
			case DeclarationPackage.CHECK__CONSTRAINT:
				return constraint != null;
			case DeclarationPackage.CHECK__FEATURE:
				return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
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
		result.append(" (errorSeverity: ");
		result.append(errorSeverity);
		result.append(", feature: ");
		result.append(feature);
		result.append(')');
		return result.toString();
	}

} //CheckImpl
