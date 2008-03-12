/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultiplicativeExpressionNodeImpl.java,v 1.3 2008/03/12 09:54:13 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.MultiplicativeExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicative Expression Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.MultiplicativeExpressionNodeImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.MultiplicativeExpressionNodeImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicativeExpressionNodeImpl extends CompositeNodeImpl implements MultiplicativeExpressionNode {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode left;
	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicativeExpressionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.MULTIPLICATIVE_EXPRESSION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (CompositeNode)eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(CompositeNode newLeft) {
		CompositeNode oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (CompositeNode)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(CompositeNode newRight) {
		CompositeNode oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
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
			case Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__LEFT:
				setLeft((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__RIGHT:
				setRight((CompositeNode)newValue);
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
			case Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__LEFT:
				setLeft((CompositeNode)null);
				return;
			case Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__RIGHT:
				setRight((CompositeNode)null);
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
			case Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__LEFT:
				return left != null;
			case Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE__RIGHT:
				return right != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiplicativeExpressionNodeImpl
