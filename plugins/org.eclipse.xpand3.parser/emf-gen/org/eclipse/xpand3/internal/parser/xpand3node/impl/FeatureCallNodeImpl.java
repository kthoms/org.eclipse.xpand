/**
 * <copyright>
 * </copyright>
 *
 * $Id: FeatureCallNodeImpl.java,v 1.5 2008/03/12 09:54:13 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Call Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FeatureCallNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FeatureCallNodeImpl#getParamList <em>Param List</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FeatureCallNodeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureCallNodeImpl extends CompositeNodeImpl implements FeatureCallNode {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode type;

	/**
	 * The cached value of the '{@link #getParamList() <em>Param List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamList()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode paramList;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureCallNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.FEATURE_CALL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CompositeNode)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.FEATURE_CALL_NODE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CompositeNode newType) {
		CompositeNode oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.FEATURE_CALL_NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (CompositeNode)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.FEATURE_CALL_NODE__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(CompositeNode newName) {
		CompositeNode oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.FEATURE_CALL_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getParamList() {
		if (paramList != null && paramList.eIsProxy()) {
			InternalEObject oldParamList = (InternalEObject)paramList;
			paramList = (CompositeNode)eResolveProxy(oldParamList);
			if (paramList != oldParamList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.FEATURE_CALL_NODE__PARAM_LIST, oldParamList, paramList));
			}
		}
		return paramList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetParamList() {
		return paramList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamList(CompositeNode newParamList) {
		CompositeNode oldParamList = paramList;
		paramList = newParamList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.FEATURE_CALL_NODE__PARAM_LIST, oldParamList, paramList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.FEATURE_CALL_NODE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case Xpand3nodePackage.FEATURE_CALL_NODE__PARAM_LIST:
				if (resolve) return getParamList();
				return basicGetParamList();
			case Xpand3nodePackage.FEATURE_CALL_NODE__NAME:
				if (resolve) return getName();
				return basicGetName();
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
			case Xpand3nodePackage.FEATURE_CALL_NODE__TYPE:
				setType((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.FEATURE_CALL_NODE__PARAM_LIST:
				setParamList((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.FEATURE_CALL_NODE__NAME:
				setName((CompositeNode)newValue);
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
			case Xpand3nodePackage.FEATURE_CALL_NODE__TYPE:
				setType((CompositeNode)null);
				return;
			case Xpand3nodePackage.FEATURE_CALL_NODE__PARAM_LIST:
				setParamList((CompositeNode)null);
				return;
			case Xpand3nodePackage.FEATURE_CALL_NODE__NAME:
				setName((CompositeNode)null);
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
			case Xpand3nodePackage.FEATURE_CALL_NODE__TYPE:
				return type != null;
			case Xpand3nodePackage.FEATURE_CALL_NODE__PARAM_LIST:
				return paramList != null;
			case Xpand3nodePackage.FEATURE_CALL_NODE__NAME:
				return name != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureCallNodeImpl
