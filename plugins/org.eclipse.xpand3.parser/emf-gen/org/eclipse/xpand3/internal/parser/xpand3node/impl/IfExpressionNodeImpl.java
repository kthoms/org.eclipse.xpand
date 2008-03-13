/**
 * <copyright>
 * </copyright>
 *
 * $Id: IfExpressionNodeImpl.java,v 1.3 2008/03/13 08:40:01 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Expression Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.IfExpressionNodeImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.IfExpressionNodeImpl#getElse <em>Else</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.IfExpressionNodeImpl#getCondition0 <em>Condition0</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.IfExpressionNodeImpl#getCondition1 <em>Condition1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfExpressionNodeImpl extends CompositeNodeImpl implements IfExpressionNode {
	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode else_;

	/**
	 * The cached value of the '{@link #getCondition0() <em>Condition0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition0()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode condition0;

	/**
	 * The cached value of the '{@link #getCondition1() <em>Condition1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition1()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode condition1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfExpressionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.IF_EXPRESSION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getThen() {
		if (then != null && then.eIsProxy()) {
			InternalEObject oldThen = (InternalEObject)then;
			then = (CompositeNode)eResolveProxy(oldThen);
			if (then != oldThen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.IF_EXPRESSION_NODE__THEN, oldThen, then));
			}
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(CompositeNode newThen) {
		CompositeNode oldThen = then;
		then = newThen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.IF_EXPRESSION_NODE__THEN, oldThen, then));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getElse() {
		if (else_ != null && else_.eIsProxy()) {
			InternalEObject oldElse = (InternalEObject)else_;
			else_ = (CompositeNode)eResolveProxy(oldElse);
			if (else_ != oldElse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.IF_EXPRESSION_NODE__ELSE, oldElse, else_));
			}
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(CompositeNode newElse) {
		CompositeNode oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.IF_EXPRESSION_NODE__ELSE, oldElse, else_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getCondition0() {
		if (condition0 != null && condition0.eIsProxy()) {
			InternalEObject oldCondition0 = (InternalEObject)condition0;
			condition0 = (CompositeNode)eResolveProxy(oldCondition0);
			if (condition0 != oldCondition0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION0, oldCondition0, condition0));
			}
		}
		return condition0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetCondition0() {
		return condition0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition0(CompositeNode newCondition0) {
		CompositeNode oldCondition0 = condition0;
		condition0 = newCondition0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION0, oldCondition0, condition0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getCondition1() {
		if (condition1 != null && condition1.eIsProxy()) {
			InternalEObject oldCondition1 = (InternalEObject)condition1;
			condition1 = (CompositeNode)eResolveProxy(oldCondition1);
			if (condition1 != oldCondition1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION1, oldCondition1, condition1));
			}
		}
		return condition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetCondition1() {
		return condition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition1(CompositeNode newCondition1) {
		CompositeNode oldCondition1 = condition1;
		condition1 = newCondition1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION1, oldCondition1, condition1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.IF_EXPRESSION_NODE__THEN:
				if (resolve) return getThen();
				return basicGetThen();
			case Xpand3nodePackage.IF_EXPRESSION_NODE__ELSE:
				if (resolve) return getElse();
				return basicGetElse();
			case Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION0:
				if (resolve) return getCondition0();
				return basicGetCondition0();
			case Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION1:
				if (resolve) return getCondition1();
				return basicGetCondition1();
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
			case Xpand3nodePackage.IF_EXPRESSION_NODE__THEN:
				setThen((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.IF_EXPRESSION_NODE__ELSE:
				setElse((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION0:
				setCondition0((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION1:
				setCondition1((CompositeNode)newValue);
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
			case Xpand3nodePackage.IF_EXPRESSION_NODE__THEN:
				setThen((CompositeNode)null);
				return;
			case Xpand3nodePackage.IF_EXPRESSION_NODE__ELSE:
				setElse((CompositeNode)null);
				return;
			case Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION0:
				setCondition0((CompositeNode)null);
				return;
			case Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION1:
				setCondition1((CompositeNode)null);
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
			case Xpand3nodePackage.IF_EXPRESSION_NODE__THEN:
				return then != null;
			case Xpand3nodePackage.IF_EXPRESSION_NODE__ELSE:
				return else_ != null;
			case Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION0:
				return condition0 != null;
			case Xpand3nodePackage.IF_EXPRESSION_NODE__CONDITION1:
				return condition1 != null;
		}
		return super.eIsSet(featureID);
	}

} //IfExpressionNodeImpl
