/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProtectStatementImpl.java,v 1.2 2008/03/07 11:10:34 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.expression.AbstractExpression;

import org.eclipse.xpand3.statement.ProtectStatement;
import org.eclipse.xpand3.statement.StatementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protect Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ProtectStatementImpl#getCommentStart <em>Comment Start</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ProtectStatementImpl#getCommentEnd <em>Comment End</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ProtectStatementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ProtectStatementImpl#isDisable <em>Disable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtectStatementImpl extends AbstractStatementWithBodyImpl implements ProtectStatement {
	/**
	 * The cached value of the '{@link #getCommentStart() <em>Comment Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentStart()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression commentStart;

	/**
	 * The cached value of the '{@link #getCommentEnd() <em>Comment End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentEnd()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression commentEnd;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression id;

	/**
	 * The default value of the '{@link #isDisable() <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisable() <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisable()
	 * @generated
	 * @ordered
	 */
	protected boolean disable = DISABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.PROTECT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getCommentStart() {
		return commentStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommentStart(AbstractExpression newCommentStart, NotificationChain msgs) {
		AbstractExpression oldCommentStart = commentStart;
		commentStart = newCommentStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.PROTECT_STATEMENT__COMMENT_START, oldCommentStart, newCommentStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentStart(AbstractExpression newCommentStart) {
		if (newCommentStart != commentStart) {
			NotificationChain msgs = null;
			if (commentStart != null)
				msgs = ((InternalEObject)commentStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.PROTECT_STATEMENT__COMMENT_START, null, msgs);
			if (newCommentStart != null)
				msgs = ((InternalEObject)newCommentStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.PROTECT_STATEMENT__COMMENT_START, null, msgs);
			msgs = basicSetCommentStart(newCommentStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.PROTECT_STATEMENT__COMMENT_START, newCommentStart, newCommentStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getCommentEnd() {
		return commentEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommentEnd(AbstractExpression newCommentEnd, NotificationChain msgs) {
		AbstractExpression oldCommentEnd = commentEnd;
		commentEnd = newCommentEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.PROTECT_STATEMENT__COMMENT_END, oldCommentEnd, newCommentEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentEnd(AbstractExpression newCommentEnd) {
		if (newCommentEnd != commentEnd) {
			NotificationChain msgs = null;
			if (commentEnd != null)
				msgs = ((InternalEObject)commentEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.PROTECT_STATEMENT__COMMENT_END, null, msgs);
			if (newCommentEnd != null)
				msgs = ((InternalEObject)newCommentEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.PROTECT_STATEMENT__COMMENT_END, null, msgs);
			msgs = basicSetCommentEnd(newCommentEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.PROTECT_STATEMENT__COMMENT_END, newCommentEnd, newCommentEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(AbstractExpression newId, NotificationChain msgs) {
		AbstractExpression oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.PROTECT_STATEMENT__ID, oldId, newId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(AbstractExpression newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.PROTECT_STATEMENT__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.PROTECT_STATEMENT__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.PROTECT_STATEMENT__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisable() {
		return disable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisable(boolean newDisable) {
		boolean oldDisable = disable;
		disable = newDisable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.PROTECT_STATEMENT__DISABLE, oldDisable, disable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.PROTECT_STATEMENT__COMMENT_START:
				return basicSetCommentStart(null, msgs);
			case StatementPackage.PROTECT_STATEMENT__COMMENT_END:
				return basicSetCommentEnd(null, msgs);
			case StatementPackage.PROTECT_STATEMENT__ID:
				return basicSetId(null, msgs);
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
			case StatementPackage.PROTECT_STATEMENT__COMMENT_START:
				return getCommentStart();
			case StatementPackage.PROTECT_STATEMENT__COMMENT_END:
				return getCommentEnd();
			case StatementPackage.PROTECT_STATEMENT__ID:
				return getId();
			case StatementPackage.PROTECT_STATEMENT__DISABLE:
				return isDisable() ? Boolean.TRUE : Boolean.FALSE;
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
			case StatementPackage.PROTECT_STATEMENT__COMMENT_START:
				setCommentStart((AbstractExpression)newValue);
				return;
			case StatementPackage.PROTECT_STATEMENT__COMMENT_END:
				setCommentEnd((AbstractExpression)newValue);
				return;
			case StatementPackage.PROTECT_STATEMENT__ID:
				setId((AbstractExpression)newValue);
				return;
			case StatementPackage.PROTECT_STATEMENT__DISABLE:
				setDisable(((Boolean)newValue).booleanValue());
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
			case StatementPackage.PROTECT_STATEMENT__COMMENT_START:
				setCommentStart((AbstractExpression)null);
				return;
			case StatementPackage.PROTECT_STATEMENT__COMMENT_END:
				setCommentEnd((AbstractExpression)null);
				return;
			case StatementPackage.PROTECT_STATEMENT__ID:
				setId((AbstractExpression)null);
				return;
			case StatementPackage.PROTECT_STATEMENT__DISABLE:
				setDisable(DISABLE_EDEFAULT);
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
			case StatementPackage.PROTECT_STATEMENT__COMMENT_START:
				return commentStart != null;
			case StatementPackage.PROTECT_STATEMENT__COMMENT_END:
				return commentEnd != null;
			case StatementPackage.PROTECT_STATEMENT__ID:
				return id != null;
			case StatementPackage.PROTECT_STATEMENT__DISABLE:
				return disable != DISABLE_EDEFAULT;
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
		result.append(" (disable: ");
		result.append(disable);
		result.append(')');
		return result.toString();
	}

} //ProtectStatementImpl
