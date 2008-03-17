/**
 * <copyright>
 * </copyright>
 *
 * $Id: AndExpressionNodeImpl.java,v 1.1 2008/03/17 14:39:06 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.frontend.parser.xpand3node.AndExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Expression Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.AndExpressionNodeImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.AndExpressionNodeImpl#getNexts <em>Nexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndExpressionNodeImpl extends CompositeNodeImpl implements AndExpressionNode {
	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode first;

	/**
	 * The cached value of the '{@link #getNexts() <em>Nexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNexts()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeNode> nexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndExpressionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.AND_EXPRESSION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (CompositeNode)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.AND_EXPRESSION_NODE__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(CompositeNode newFirst) {
		CompositeNode oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.AND_EXPRESSION_NODE__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeNode> getNexts() {
		if (nexts == null) {
			nexts = new EObjectResolvingEList<CompositeNode>(CompositeNode.class, this, Xpand3nodePackage.AND_EXPRESSION_NODE__NEXTS);
		}
		return nexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.AND_EXPRESSION_NODE__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case Xpand3nodePackage.AND_EXPRESSION_NODE__NEXTS:
				return getNexts();
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
			case Xpand3nodePackage.AND_EXPRESSION_NODE__FIRST:
				setFirst((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.AND_EXPRESSION_NODE__NEXTS:
				getNexts().clear();
				getNexts().addAll((Collection<? extends CompositeNode>)newValue);
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
			case Xpand3nodePackage.AND_EXPRESSION_NODE__FIRST:
				setFirst((CompositeNode)null);
				return;
			case Xpand3nodePackage.AND_EXPRESSION_NODE__NEXTS:
				getNexts().clear();
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
			case Xpand3nodePackage.AND_EXPRESSION_NODE__FIRST:
				return first != null;
			case Xpand3nodePackage.AND_EXPRESSION_NODE__NEXTS:
				return nexts != null && !nexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AndExpressionNodeImpl
