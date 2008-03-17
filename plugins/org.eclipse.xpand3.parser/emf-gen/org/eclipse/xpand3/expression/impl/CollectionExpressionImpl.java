/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionExpressionImpl.java,v 1.1 2008/03/17 14:39:10 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.CollectionExpression;
import org.eclipse.xpand3.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.impl.CollectionExpressionImpl#getClosure <em>Closure</em>}</li>
 *   <li>{@link org.eclipse.xpand3.expression.impl.CollectionExpressionImpl#getEleName <em>Ele Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionExpressionImpl extends FeatureCallImpl implements CollectionExpression {
	/**
	 * The cached value of the '{@link #getClosure() <em>Closure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosure()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression closure;

	/**
	 * The cached value of the '{@link #getEleName() <em>Ele Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEleName()
	 * @generated
	 * @ordered
	 */
	protected Identifier eleName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.COLLECTION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getClosure() {
		return closure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClosure(AbstractExpression newClosure, NotificationChain msgs) {
		AbstractExpression oldClosure = closure;
		closure = newClosure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.COLLECTION_EXPRESSION__CLOSURE, oldClosure, newClosure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosure(AbstractExpression newClosure) {
		if (newClosure != closure) {
			NotificationChain msgs = null;
			if (closure != null)
				msgs = ((InternalEObject)closure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.COLLECTION_EXPRESSION__CLOSURE, null, msgs);
			if (newClosure != null)
				msgs = ((InternalEObject)newClosure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.COLLECTION_EXPRESSION__CLOSURE, null, msgs);
			msgs = basicSetClosure(newClosure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.COLLECTION_EXPRESSION__CLOSURE, newClosure, newClosure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getEleName() {
		return eleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEleName(Identifier newEleName, NotificationChain msgs) {
		Identifier oldEleName = eleName;
		eleName = newEleName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.COLLECTION_EXPRESSION__ELE_NAME, oldEleName, newEleName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEleName(Identifier newEleName) {
		if (newEleName != eleName) {
			NotificationChain msgs = null;
			if (eleName != null)
				msgs = ((InternalEObject)eleName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.COLLECTION_EXPRESSION__ELE_NAME, null, msgs);
			if (newEleName != null)
				msgs = ((InternalEObject)newEleName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.COLLECTION_EXPRESSION__ELE_NAME, null, msgs);
			msgs = basicSetEleName(newEleName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.COLLECTION_EXPRESSION__ELE_NAME, newEleName, newEleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.COLLECTION_EXPRESSION__CLOSURE:
				return basicSetClosure(null, msgs);
			case ExpressionPackage.COLLECTION_EXPRESSION__ELE_NAME:
				return basicSetEleName(null, msgs);
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
			case ExpressionPackage.COLLECTION_EXPRESSION__CLOSURE:
				return getClosure();
			case ExpressionPackage.COLLECTION_EXPRESSION__ELE_NAME:
				return getEleName();
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
			case ExpressionPackage.COLLECTION_EXPRESSION__CLOSURE:
				setClosure((AbstractExpression)newValue);
				return;
			case ExpressionPackage.COLLECTION_EXPRESSION__ELE_NAME:
				setEleName((Identifier)newValue);
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
			case ExpressionPackage.COLLECTION_EXPRESSION__CLOSURE:
				setClosure((AbstractExpression)null);
				return;
			case ExpressionPackage.COLLECTION_EXPRESSION__ELE_NAME:
				setEleName((Identifier)null);
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
			case ExpressionPackage.COLLECTION_EXPRESSION__CLOSURE:
				return closure != null;
			case ExpressionPackage.COLLECTION_EXPRESSION__ELE_NAME:
				return eleName != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionExpressionImpl
