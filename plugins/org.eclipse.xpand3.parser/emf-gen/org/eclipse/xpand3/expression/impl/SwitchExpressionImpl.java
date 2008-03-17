/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwitchExpressionImpl.java,v 1.1 2008/03/17 14:39:10 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.Case;
import org.eclipse.xpand3.expression.ExpressionPackage;
import org.eclipse.xpand3.expression.SwitchExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.impl.SwitchExpressionImpl#getSwitchExpr <em>Switch Expr</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.impl.SwitchExpressionImpl#getDefaultExpr <em>Default Expr</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.impl.SwitchExpressionImpl#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchExpressionImpl extends AbstractExpressionImpl implements SwitchExpression {
	/**
	 * The cached value of the '{@link #getSwitchExpr() <em>Switch Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchExpr()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression switchExpr;

	/**
	 * The cached value of the '{@link #getDefaultExpr() <em>Default Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExpr()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression defaultExpr;

	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<Case> cases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.SWITCH_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getSwitchExpr() {
		return switchExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchExpr(AbstractExpression newSwitchExpr, NotificationChain msgs) {
		AbstractExpression oldSwitchExpr = switchExpr;
		switchExpr = newSwitchExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.SWITCH_EXPRESSION__SWITCH_EXPR, oldSwitchExpr, newSwitchExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchExpr(AbstractExpression newSwitchExpr) {
		if (newSwitchExpr != switchExpr) {
			NotificationChain msgs = null;
			if (switchExpr != null)
				msgs = ((InternalEObject)switchExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SWITCH_EXPRESSION__SWITCH_EXPR, null, msgs);
			if (newSwitchExpr != null)
				msgs = ((InternalEObject)newSwitchExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SWITCH_EXPRESSION__SWITCH_EXPR, null, msgs);
			msgs = basicSetSwitchExpr(newSwitchExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.SWITCH_EXPRESSION__SWITCH_EXPR, newSwitchExpr, newSwitchExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getDefaultExpr() {
		return defaultExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultExpr(AbstractExpression newDefaultExpr, NotificationChain msgs) {
		AbstractExpression oldDefaultExpr = defaultExpr;
		defaultExpr = newDefaultExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPR, oldDefaultExpr, newDefaultExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultExpr(AbstractExpression newDefaultExpr) {
		if (newDefaultExpr != defaultExpr) {
			NotificationChain msgs = null;
			if (defaultExpr != null)
				msgs = ((InternalEObject)defaultExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPR, null, msgs);
			if (newDefaultExpr != null)
				msgs = ((InternalEObject)newDefaultExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPR, null, msgs);
			msgs = basicSetDefaultExpr(newDefaultExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPR, newDefaultExpr, newDefaultExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Case> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList<Case>(Case.class, this, ExpressionPackage.SWITCH_EXPRESSION__CASES);
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.SWITCH_EXPRESSION__SWITCH_EXPR:
				return basicSetSwitchExpr(null, msgs);
			case ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPR:
				return basicSetDefaultExpr(null, msgs);
			case ExpressionPackage.SWITCH_EXPRESSION__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
			case ExpressionPackage.SWITCH_EXPRESSION__SWITCH_EXPR:
				return getSwitchExpr();
			case ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPR:
				return getDefaultExpr();
			case ExpressionPackage.SWITCH_EXPRESSION__CASES:
				return getCases();
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
			case ExpressionPackage.SWITCH_EXPRESSION__SWITCH_EXPR:
				setSwitchExpr((AbstractExpression)newValue);
				return;
			case ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPR:
				setDefaultExpr((AbstractExpression)newValue);
				return;
			case ExpressionPackage.SWITCH_EXPRESSION__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends Case>)newValue);
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
			case ExpressionPackage.SWITCH_EXPRESSION__SWITCH_EXPR:
				setSwitchExpr((AbstractExpression)null);
				return;
			case ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPR:
				setDefaultExpr((AbstractExpression)null);
				return;
			case ExpressionPackage.SWITCH_EXPRESSION__CASES:
				getCases().clear();
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
			case ExpressionPackage.SWITCH_EXPRESSION__SWITCH_EXPR:
				return switchExpr != null;
			case ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPR:
				return defaultExpr != null;
			case ExpressionPackage.SWITCH_EXPRESSION__CASES:
				return cases != null && !cases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SwitchExpressionImpl
