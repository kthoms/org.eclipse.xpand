/**
 * <copyright>
 * </copyright>
 *
 * $Id: InfixExpressionNodeImpl.java,v 1.2 2008/03/06 15:25:17 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix Expression Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.InfixExpressionNodeImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.InfixExpressionNodeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfixExpressionNodeImpl extends CompositeNodeImpl implements InfixExpressionNode {
	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeNode> calls;
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode target;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfixExpressionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.INFIX_EXPRESSION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeNode> getCalls() {
		if (calls == null) {
			calls = new EObjectResolvingEList<CompositeNode>(CompositeNode.class, this, Xpand3nodePackage.INFIX_EXPRESSION_NODE__CALLS);
		}
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (CompositeNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.INFIX_EXPRESSION_NODE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(CompositeNode newTarget) {
		CompositeNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.INFIX_EXPRESSION_NODE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.INFIX_EXPRESSION_NODE__CALLS:
				return getCalls();
			case Xpand3nodePackage.INFIX_EXPRESSION_NODE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Xpand3nodePackage.INFIX_EXPRESSION_NODE__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection<? extends CompositeNode>)newValue);
				return;
			case Xpand3nodePackage.INFIX_EXPRESSION_NODE__TARGET:
				setTarget((CompositeNode)newValue);
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
			case Xpand3nodePackage.INFIX_EXPRESSION_NODE__CALLS:
				getCalls().clear();
				return;
			case Xpand3nodePackage.INFIX_EXPRESSION_NODE__TARGET:
				setTarget((CompositeNode)null);
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
			case Xpand3nodePackage.INFIX_EXPRESSION_NODE__CALLS:
				return calls != null && !calls.isEmpty();
			case Xpand3nodePackage.INFIX_EXPRESSION_NODE__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //InfixExpressionNodeImpl
