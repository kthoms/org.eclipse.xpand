/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompositeNodeImpl.java,v 1.1 2008/02/27 13:21:10 sefftinge Exp $
 */
package org.eclipse.xpand3.node.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xpand3.node.CompositeNode;
import org.eclipse.xpand3.node.Node;
import org.eclipse.xpand3.node.NodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.node.impl.CompositeNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.impl.CompositeNodeImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeNodeImpl extends NodeImpl implements CompositeNode {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> children;

	/**
	 * The default value of the '{@link #getRule() <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected String rule = RULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodePackage.Literals.COMPOSITE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Node>(Node.class, this, NodePackage.COMPOSITE_NODE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(String newRule) {
		String oldRule = rule;
		rule = newRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.COMPOSITE_NODE__RULE, oldRule, rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int start() {
		return org.eclipse.xpand3.node.NodeUtil.start(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int end() {
		return org.eclipse.xpand3.node.NodeUtil.end(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int line() {
		return org.eclipse.xpand3.node.NodeUtil.line(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String text() {
		return org.eclipse.xpand3.node.NodeUtil.text(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NodePackage.COMPOSITE_NODE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case NodePackage.COMPOSITE_NODE__CHILDREN:
				return getChildren();
			case NodePackage.COMPOSITE_NODE__RULE:
				return getRule();
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
			case NodePackage.COMPOSITE_NODE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Node>)newValue);
				return;
			case NodePackage.COMPOSITE_NODE__RULE:
				setRule((String)newValue);
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
			case NodePackage.COMPOSITE_NODE__CHILDREN:
				getChildren().clear();
				return;
			case NodePackage.COMPOSITE_NODE__RULE:
				setRule(RULE_EDEFAULT);
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
			case NodePackage.COMPOSITE_NODE__CHILDREN:
				return children != null && !children.isEmpty();
			case NodePackage.COMPOSITE_NODE__RULE:
				return RULE_EDEFAULT == null ? rule != null : !RULE_EDEFAULT.equals(rule);
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
		result.append(" (rule: ");
		result.append(rule);
		result.append(')');
		return result.toString();
	}

} //CompositeNodeImpl
