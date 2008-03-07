/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeSelectExpressionImpl.java,v 1.2 2008/03/07 11:10:35 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.ExpressionPackage;
import org.eclipse.xpand3.expression.TypeSelectExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Select Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.expression.impl.TypeSelectExpressionImpl#getTypeLiteral <em>Type Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSelectExpressionImpl extends FeatureCallImpl implements TypeSelectExpression {
	/**
	 * The cached value of the '{@link #getTypeLiteral() <em>Type Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLiteral()
	 * @generated
	 * @ordered
	 */
	protected Identifier typeLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSelectExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.TYPE_SELECT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getTypeLiteral() {
		return typeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeLiteral(Identifier newTypeLiteral, NotificationChain msgs) {
		Identifier oldTypeLiteral = typeLiteral;
		typeLiteral = newTypeLiteral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.TYPE_SELECT_EXPRESSION__TYPE_LITERAL, oldTypeLiteral, newTypeLiteral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLiteral(Identifier newTypeLiteral) {
		if (newTypeLiteral != typeLiteral) {
			NotificationChain msgs = null;
			if (typeLiteral != null)
				msgs = ((InternalEObject)typeLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TYPE_SELECT_EXPRESSION__TYPE_LITERAL, null, msgs);
			if (newTypeLiteral != null)
				msgs = ((InternalEObject)newTypeLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TYPE_SELECT_EXPRESSION__TYPE_LITERAL, null, msgs);
			msgs = basicSetTypeLiteral(newTypeLiteral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.TYPE_SELECT_EXPRESSION__TYPE_LITERAL, newTypeLiteral, newTypeLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.TYPE_SELECT_EXPRESSION__TYPE_LITERAL:
				return basicSetTypeLiteral(null, msgs);
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
			case ExpressionPackage.TYPE_SELECT_EXPRESSION__TYPE_LITERAL:
				return getTypeLiteral();
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
			case ExpressionPackage.TYPE_SELECT_EXPRESSION__TYPE_LITERAL:
				setTypeLiteral((Identifier)newValue);
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
			case ExpressionPackage.TYPE_SELECT_EXPRESSION__TYPE_LITERAL:
				setTypeLiteral((Identifier)null);
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
			case ExpressionPackage.TYPE_SELECT_EXPRESSION__TYPE_LITERAL:
				return typeLiteral != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeSelectExpressionImpl
