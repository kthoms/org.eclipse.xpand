/**
 * <copyright>
 * </copyright>
 *
 * $Id: IfStatementImpl.java,v 1.5 2008/03/13 11:42:32 sefftinge Exp $
 */
package org.eclipse.xpand3.statement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.expression.AbstractExpression;

import org.eclipse.xpand3.statement.IfStatement;
import org.eclipse.xpand3.statement.StatementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.impl.IfStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.IfStatementImpl#getElseIf <em>Else If</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStatementImpl extends AbstractStatementWithBodyImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression condition;

	/**
	 * The cached value of the '{@link #getElseIf() <em>Else If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIf()
	 * @generated
	 * @ordered
	 */
	protected IfStatement elseIf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(AbstractExpression newCondition, NotificationChain msgs) {
		AbstractExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.IF_STATEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(AbstractExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.IF_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.IF_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.IF_STATEMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement getElseIf() {
		return elseIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseIf(IfStatement newElseIf, NotificationChain msgs) {
		IfStatement oldElseIf = elseIf;
		elseIf = newElseIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.IF_STATEMENT__ELSE_IF, oldElseIf, newElseIf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseIf(IfStatement newElseIf) {
		if (newElseIf != elseIf) {
			NotificationChain msgs = null;
			if (elseIf != null)
				msgs = ((InternalEObject)elseIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.IF_STATEMENT__ELSE_IF, null, msgs);
			if (newElseIf != null)
				msgs = ((InternalEObject)newElseIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.IF_STATEMENT__ELSE_IF, null, msgs);
			msgs = basicSetElseIf(newElseIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.IF_STATEMENT__ELSE_IF, newElseIf, newElseIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.IF_STATEMENT__CONDITION:
				return basicSetCondition(null, msgs);
			case StatementPackage.IF_STATEMENT__ELSE_IF:
				return basicSetElseIf(null, msgs);
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
			case StatementPackage.IF_STATEMENT__CONDITION:
				return getCondition();
			case StatementPackage.IF_STATEMENT__ELSE_IF:
				return getElseIf();
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
			case StatementPackage.IF_STATEMENT__CONDITION:
				setCondition((AbstractExpression)newValue);
				return;
			case StatementPackage.IF_STATEMENT__ELSE_IF:
				setElseIf((IfStatement)newValue);
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
			case StatementPackage.IF_STATEMENT__CONDITION:
				setCondition((AbstractExpression)null);
				return;
			case StatementPackage.IF_STATEMENT__ELSE_IF:
				setElseIf((IfStatement)null);
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
			case StatementPackage.IF_STATEMENT__CONDITION:
				return condition != null;
			case StatementPackage.IF_STATEMENT__ELSE_IF:
				return elseIf != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
