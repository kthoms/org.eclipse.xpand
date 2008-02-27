/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChainExpressionImpl.java,v 1.1 2008/02/27 13:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.ChainExpression;
import org.eclipse.xpand3.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.impl.ChainExpressionImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.impl.ChainExpressionImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainExpressionImpl extends AbstractExpressionImpl implements ChainExpression {
	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression first;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.CHAIN_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst(AbstractExpression newFirst, NotificationChain msgs) {
		AbstractExpression oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.CHAIN_EXPRESSION__FIRST, oldFirst, newFirst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(AbstractExpression newFirst) {
		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.CHAIN_EXPRESSION__FIRST, null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.CHAIN_EXPRESSION__FIRST, null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.CHAIN_EXPRESSION__FIRST, newFirst, newFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(AbstractExpression newNext, NotificationChain msgs) {
		AbstractExpression oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.CHAIN_EXPRESSION__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(AbstractExpression newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.CHAIN_EXPRESSION__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.CHAIN_EXPRESSION__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.CHAIN_EXPRESSION__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.CHAIN_EXPRESSION__FIRST:
				return basicSetFirst(null, msgs);
			case ExpressionPackage.CHAIN_EXPRESSION__NEXT:
				return basicSetNext(null, msgs);
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
			case ExpressionPackage.CHAIN_EXPRESSION__FIRST:
				return getFirst();
			case ExpressionPackage.CHAIN_EXPRESSION__NEXT:
				return getNext();
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
			case ExpressionPackage.CHAIN_EXPRESSION__FIRST:
				setFirst((AbstractExpression)newValue);
				return;
			case ExpressionPackage.CHAIN_EXPRESSION__NEXT:
				setNext((AbstractExpression)newValue);
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
			case ExpressionPackage.CHAIN_EXPRESSION__FIRST:
				setFirst((AbstractExpression)null);
				return;
			case ExpressionPackage.CHAIN_EXPRESSION__NEXT:
				setNext((AbstractExpression)null);
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
			case ExpressionPackage.CHAIN_EXPRESSION__FIRST:
				return first != null;
			case ExpressionPackage.CHAIN_EXPRESSION__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

} //ChainExpressionImpl
