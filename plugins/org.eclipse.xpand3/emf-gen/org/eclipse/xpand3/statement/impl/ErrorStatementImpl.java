/**
 * <copyright>
 * </copyright>
 *
 * $Id: ErrorStatementImpl.java,v 1.1 2008/02/27 13:21:07 sefftinge Exp $
 */
package org.eclipse.xpand3.statement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.expression.AbstractExpression;

import org.eclipse.xpand3.statement.ErrorStatement;
import org.eclipse.xpand3.statement.StatementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ErrorStatementImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorStatementImpl extends AbstractStatementImpl implements ErrorStatement {
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.ERROR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(AbstractExpression newMessage, NotificationChain msgs) {
		AbstractExpression oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.ERROR_STATEMENT__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(AbstractExpression newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.ERROR_STATEMENT__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.ERROR_STATEMENT__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.ERROR_STATEMENT__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.ERROR_STATEMENT__MESSAGE:
				return basicSetMessage(null, msgs);
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
			case StatementPackage.ERROR_STATEMENT__MESSAGE:
				return getMessage();
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
			case StatementPackage.ERROR_STATEMENT__MESSAGE:
				setMessage((AbstractExpression)newValue);
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
			case StatementPackage.ERROR_STATEMENT__MESSAGE:
				setMessage((AbstractExpression)null);
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
			case StatementPackage.ERROR_STATEMENT__MESSAGE:
				return message != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorStatementImpl
