/**
 * <copyright>
 * </copyright>
 *
 * $Id: LetStatementImpl.java,v 1.2 2008/03/07 11:10:35 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;

import org.eclipse.xpand3.statement.LetStatement;
import org.eclipse.xpand3.statement.StatementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Let Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.impl.LetStatementImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.LetStatementImpl#getVarValue <em>Var Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LetStatementImpl extends AbstractStatementWithBodyImpl implements LetStatement {
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
	 * The cached value of the '{@link #getVarValue() <em>Var Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarValue()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression varValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LetStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.LET_STATEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.LET_STATEMENT__VAR_NAME, oldVarName, newVarName);
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
				msgs = ((InternalEObject)varName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.LET_STATEMENT__VAR_NAME, null, msgs);
			if (newVarName != null)
				msgs = ((InternalEObject)newVarName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.LET_STATEMENT__VAR_NAME, null, msgs);
			msgs = basicSetVarName(newVarName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.LET_STATEMENT__VAR_NAME, newVarName, newVarName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getVarValue() {
		return varValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarValue(AbstractExpression newVarValue, NotificationChain msgs) {
		AbstractExpression oldVarValue = varValue;
		varValue = newVarValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.LET_STATEMENT__VAR_VALUE, oldVarValue, newVarValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarValue(AbstractExpression newVarValue) {
		if (newVarValue != varValue) {
			NotificationChain msgs = null;
			if (varValue != null)
				msgs = ((InternalEObject)varValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.LET_STATEMENT__VAR_VALUE, null, msgs);
			if (newVarValue != null)
				msgs = ((InternalEObject)newVarValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.LET_STATEMENT__VAR_VALUE, null, msgs);
			msgs = basicSetVarValue(newVarValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.LET_STATEMENT__VAR_VALUE, newVarValue, newVarValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.LET_STATEMENT__VAR_NAME:
				return basicSetVarName(null, msgs);
			case StatementPackage.LET_STATEMENT__VAR_VALUE:
				return basicSetVarValue(null, msgs);
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
			case StatementPackage.LET_STATEMENT__VAR_NAME:
				return getVarName();
			case StatementPackage.LET_STATEMENT__VAR_VALUE:
				return getVarValue();
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
			case StatementPackage.LET_STATEMENT__VAR_NAME:
				setVarName((Identifier)newValue);
				return;
			case StatementPackage.LET_STATEMENT__VAR_VALUE:
				setVarValue((AbstractExpression)newValue);
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
			case StatementPackage.LET_STATEMENT__VAR_NAME:
				setVarName((Identifier)null);
				return;
			case StatementPackage.LET_STATEMENT__VAR_VALUE:
				setVarValue((AbstractExpression)null);
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
			case StatementPackage.LET_STATEMENT__VAR_NAME:
				return varName != null;
			case StatementPackage.LET_STATEMENT__VAR_VALUE:
				return varValue != null;
		}
		return super.eIsSet(featureID);
	}

} //LetStatementImpl
