/**
 * <copyright>
 * </copyright>
 *
 * $Id: RelationalExpressionNodeImpl.java,v 1.3 2008/03/07 09:39:42 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Expression Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.RelationalExpressionNodeImpl#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.RelationalExpressionNodeImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.RelationalExpressionNodeImpl#getLeftOperand <em>Left Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationalExpressionNodeImpl extends CompositeNodeImpl implements RelationalExpressionNode {
	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode rightOperand;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected LeafNode operator;

	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode leftOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalExpressionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.RELATIONAL_EXPRESSION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode getOperator() {
		if (operator != null && operator.eIsProxy()) {
			InternalEObject oldOperator = (InternalEObject)operator;
			operator = (LeafNode)eResolveProxy(oldOperator);
			if (operator != oldOperator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__OPERATOR, oldOperator, operator));
			}
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode basicGetOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(LeafNode newOperator) {
		LeafNode oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getRightOperand() {
		if (rightOperand != null && rightOperand.eIsProxy()) {
			InternalEObject oldRightOperand = (InternalEObject)rightOperand;
			rightOperand = (CompositeNode)eResolveProxy(oldRightOperand);
			if (rightOperand != oldRightOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__RIGHT_OPERAND, oldRightOperand, rightOperand));
			}
		}
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetRightOperand() {
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightOperand(CompositeNode newRightOperand) {
		CompositeNode oldRightOperand = rightOperand;
		rightOperand = newRightOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__RIGHT_OPERAND, oldRightOperand, rightOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getLeftOperand() {
		if (leftOperand != null && leftOperand.eIsProxy()) {
			InternalEObject oldLeftOperand = (InternalEObject)leftOperand;
			leftOperand = (CompositeNode)eResolveProxy(oldLeftOperand);
			if (leftOperand != oldLeftOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__LEFT_OPERAND, oldLeftOperand, leftOperand));
			}
		}
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetLeftOperand() {
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftOperand(CompositeNode newLeftOperand) {
		CompositeNode oldLeftOperand = leftOperand;
		leftOperand = newLeftOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__LEFT_OPERAND, oldLeftOperand, leftOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__RIGHT_OPERAND:
				if (resolve) return getRightOperand();
				return basicGetRightOperand();
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__OPERATOR:
				if (resolve) return getOperator();
				return basicGetOperator();
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__LEFT_OPERAND:
				if (resolve) return getLeftOperand();
				return basicGetLeftOperand();
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
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__RIGHT_OPERAND:
				setRightOperand((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__OPERATOR:
				setOperator((LeafNode)newValue);
				return;
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__LEFT_OPERAND:
				setLeftOperand((CompositeNode)newValue);
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
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__RIGHT_OPERAND:
				setRightOperand((CompositeNode)null);
				return;
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__OPERATOR:
				setOperator((LeafNode)null);
				return;
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__LEFT_OPERAND:
				setLeftOperand((CompositeNode)null);
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
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__RIGHT_OPERAND:
				return rightOperand != null;
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__OPERATOR:
				return operator != null;
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE__LEFT_OPERAND:
				return leftOperand != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationalExpressionNodeImpl
