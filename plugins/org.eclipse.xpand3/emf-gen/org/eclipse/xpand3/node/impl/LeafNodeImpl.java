/**
 * <copyright>
 * </copyright>
 *
 * $Id: LeafNodeImpl.java,v 1.1 2008/02/27 13:21:10 sefftinge Exp $
 */
package org.eclipse.xpand3.node.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.node.LeafNode;
import org.eclipse.xpand3.node.LexedToken;
import org.eclipse.xpand3.node.NodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaf Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.node.impl.LeafNodeImpl#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeafNodeImpl extends NodeImpl implements LeafNode {
	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected LexedToken token;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeafNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodePackage.Literals.LEAF_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexedToken getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToken(LexedToken newToken, NotificationChain msgs) {
		LexedToken oldToken = token;
		token = newToken;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodePackage.LEAF_NODE__TOKEN, oldToken, newToken);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(LexedToken newToken) {
		if (newToken != token) {
			NotificationChain msgs = null;
			if (token != null)
				msgs = ((InternalEObject)token).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodePackage.LEAF_NODE__TOKEN, null, msgs);
			if (newToken != null)
				msgs = ((InternalEObject)newToken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodePackage.LEAF_NODE__TOKEN, null, msgs);
			msgs = basicSetToken(newToken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.LEAF_NODE__TOKEN, newToken, newToken));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NodePackage.LEAF_NODE__TOKEN:
				return basicSetToken(null, msgs);
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
			case NodePackage.LEAF_NODE__TOKEN:
				return getToken();
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
			case NodePackage.LEAF_NODE__TOKEN:
				setToken((LexedToken)newValue);
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
			case NodePackage.LEAF_NODE__TOKEN:
				setToken((LexedToken)null);
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
			case NodePackage.LEAF_NODE__TOKEN:
				return token != null;
		}
		return super.eIsSet(featureID);
	}

} //LeafNodeImpl
