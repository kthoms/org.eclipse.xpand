/**
 * <copyright>
 * </copyright>
 *
 * $Id: LetExpressionImpl.java,v 1.2 2008/03/07 11:10:38 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.ExpressionPackage;
import org.eclipse.xpand3.expression.LetExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Let Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.impl.LetExpressionImpl#getVarExpression <em>Var Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.impl.LetExpressionImpl#getTargetExpression <em>Target Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.impl.LetExpressionImpl#getVarName <em>Var Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LetExpressionImpl extends AbstractExpressionImpl implements LetExpression {
	/**
	 * The cached value of the '{@link #getVarExpression() <em>Var Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarExpression()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression varExpression;

	/**
	 * The cached value of the '{@link #getTargetExpression() <em>Target Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetExpression()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression targetExpression;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected Identifier varName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LetExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.LET_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getVarExpression() {
		return varExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarExpression(AbstractExpression newVarExpression, NotificationChain msgs) {
		AbstractExpression oldVarExpression = varExpression;
		varExpression = newVarExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.LET_EXPRESSION__VAR_EXPRESSION, oldVarExpression, newVarExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarExpression(AbstractExpression newVarExpression) {
		if (newVarExpression != varExpression) {
			NotificationChain msgs = null;
			if (varExpression != null)
				msgs = ((InternalEObject)varExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.LET_EXPRESSION__VAR_EXPRESSION, null, msgs);
			if (newVarExpression != null)
				msgs = ((InternalEObject)newVarExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.LET_EXPRESSION__VAR_EXPRESSION, null, msgs);
			msgs = basicSetVarExpression(newVarExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.LET_EXPRESSION__VAR_EXPRESSION, newVarExpression, newVarExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getTargetExpression() {
		return targetExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetExpression(AbstractExpression newTargetExpression, NotificationChain msgs) {
		AbstractExpression oldTargetExpression = targetExpression;
		targetExpression = newTargetExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.LET_EXPRESSION__TARGET_EXPRESSION, oldTargetExpression, newTargetExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetExpression(AbstractExpression newTargetExpression) {
		if (newTargetExpression != targetExpression) {
			NotificationChain msgs = null;
			if (targetExpression != null)
				msgs = ((InternalEObject)targetExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.LET_EXPRESSION__TARGET_EXPRESSION, null, msgs);
			if (newTargetExpression != null)
				msgs = ((InternalEObject)newTargetExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.LET_EXPRESSION__TARGET_EXPRESSION, null, msgs);
			msgs = basicSetTargetExpression(newTargetExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.LET_EXPRESSION__TARGET_EXPRESSION, newTargetExpression, newTargetExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarName(Identifier newVarName, NotificationChain msgs) {
		Identifier oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.LET_EXPRESSION__VAR_NAME, oldVarName, newVarName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarName(Identifier newVarName) {
		if (newVarName != varName) {
			NotificationChain msgs = null;
			if (varName != null)
				msgs = ((InternalEObject)varName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.LET_EXPRESSION__VAR_NAME, null, msgs);
			if (newVarName != null)
				msgs = ((InternalEObject)newVarName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.LET_EXPRESSION__VAR_NAME, null, msgs);
			msgs = basicSetVarName(newVarName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.LET_EXPRESSION__VAR_NAME, newVarName, newVarName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.LET_EXPRESSION__VAR_EXPRESSION:
				return basicSetVarExpression(null, msgs);
			case ExpressionPackage.LET_EXPRESSION__TARGET_EXPRESSION:
				return basicSetTargetExpression(null, msgs);
			case ExpressionPackage.LET_EXPRESSION__VAR_NAME:
				return basicSetVarName(null, msgs);
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
			case ExpressionPackage.LET_EXPRESSION__VAR_EXPRESSION:
				return getVarExpression();
			case ExpressionPackage.LET_EXPRESSION__TARGET_EXPRESSION:
				return getTargetExpression();
			case ExpressionPackage.LET_EXPRESSION__VAR_NAME:
				return getVarName();
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
			case ExpressionPackage.LET_EXPRESSION__VAR_EXPRESSION:
				setVarExpression((AbstractExpression)newValue);
				return;
			case ExpressionPackage.LET_EXPRESSION__TARGET_EXPRESSION:
				setTargetExpression((AbstractExpression)newValue);
				return;
			case ExpressionPackage.LET_EXPRESSION__VAR_NAME:
				setVarName((Identifier)newValue);
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
			case ExpressionPackage.LET_EXPRESSION__VAR_EXPRESSION:
				setVarExpression((AbstractExpression)null);
				return;
			case ExpressionPackage.LET_EXPRESSION__TARGET_EXPRESSION:
				setTargetExpression((AbstractExpression)null);
				return;
			case ExpressionPackage.LET_EXPRESSION__VAR_NAME:
				setVarName((Identifier)null);
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
			case ExpressionPackage.LET_EXPRESSION__VAR_EXPRESSION:
				return varExpression != null;
			case ExpressionPackage.LET_EXPRESSION__TARGET_EXPRESSION:
				return targetExpression != null;
			case ExpressionPackage.LET_EXPRESSION__VAR_NAME:
				return varName != null;
		}
		return super.eIsSet(featureID);
	}

} //LetExpressionImpl
