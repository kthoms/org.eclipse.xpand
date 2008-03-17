/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtensionNodeImpl.java,v 1.1 2008/03/17 14:39:06 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ExtensionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExtensionNodeImpl#getExtendBody <em>Extend Body</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExtensionNodeImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExtensionNodeImpl#getCreatedName <em>Created Name</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExtensionNodeImpl#getPrivate <em>Private</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExtensionNodeImpl#getJavaCall <em>Java Call</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExtensionNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExtensionNodeImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExtensionNodeImpl#getCached <em>Cached</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExtensionNodeImpl#getParamList <em>Param List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionNodeImpl extends CompositeNodeImpl implements ExtensionNode {
	/**
	 * The cached value of the '{@link #getExtendBody() <em>Extend Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendBody()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode extendBody;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode returnType;

	/**
	 * The cached value of the '{@link #getCreatedName() <em>Created Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedName()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode createdName;

	/**
	 * The cached value of the '{@link #getPrivate() <em>Private</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate()
	 * @generated
	 * @ordered
	 */
	protected LeafNode private_;

	/**
	 * The cached value of the '{@link #getJavaCall() <em>Java Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaCall()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode javaCall;

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
	 * The cached value of the '{@link #getCreate() <em>Create</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate()
	 * @generated
	 * @ordered
	 */
	protected LeafNode create;

	/**
	 * The cached value of the '{@link #getCached() <em>Cached</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCached()
	 * @generated
	 * @ordered
	 */
	protected LeafNode cached;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.EXTENSION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getExtendBody() {
		if (extendBody != null && extendBody.eIsProxy()) {
			InternalEObject oldExtendBody = (InternalEObject)extendBody;
			extendBody = (CompositeNode)eResolveProxy(oldExtendBody);
			if (extendBody != oldExtendBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXTENSION_NODE__EXTEND_BODY, oldExtendBody, extendBody));
			}
		}
		return extendBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetExtendBody() {
		return extendBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendBody(CompositeNode newExtendBody) {
		CompositeNode oldExtendBody = extendBody;
		extendBody = newExtendBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXTENSION_NODE__EXTEND_BODY, oldExtendBody, extendBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (CompositeNode)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXTENSION_NODE__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(CompositeNode newReturnType) {
		CompositeNode oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXTENSION_NODE__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getCreatedName() {
		if (createdName != null && createdName.eIsProxy()) {
			InternalEObject oldCreatedName = (InternalEObject)createdName;
			createdName = (CompositeNode)eResolveProxy(oldCreatedName);
			if (createdName != oldCreatedName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXTENSION_NODE__CREATED_NAME, oldCreatedName, createdName));
			}
		}
		return createdName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetCreatedName() {
		return createdName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedName(CompositeNode newCreatedName) {
		CompositeNode oldCreatedName = createdName;
		createdName = newCreatedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXTENSION_NODE__CREATED_NAME, oldCreatedName, createdName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode getPrivate() {
		if (private_ != null && private_.eIsProxy()) {
			InternalEObject oldPrivate = (InternalEObject)private_;
			private_ = (LeafNode)eResolveProxy(oldPrivate);
			if (private_ != oldPrivate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXTENSION_NODE__PRIVATE, oldPrivate, private_));
			}
		}
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode basicGetPrivate() {
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(LeafNode newPrivate) {
		LeafNode oldPrivate = private_;
		private_ = newPrivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXTENSION_NODE__PRIVATE, oldPrivate, private_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getJavaCall() {
		if (javaCall != null && javaCall.eIsProxy()) {
			InternalEObject oldJavaCall = (InternalEObject)javaCall;
			javaCall = (CompositeNode)eResolveProxy(oldJavaCall);
			if (javaCall != oldJavaCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXTENSION_NODE__JAVA_CALL, oldJavaCall, javaCall));
			}
		}
		return javaCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetJavaCall() {
		return javaCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaCall(CompositeNode newJavaCall) {
		CompositeNode oldJavaCall = javaCall;
		javaCall = newJavaCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXTENSION_NODE__JAVA_CALL, oldJavaCall, javaCall));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXTENSION_NODE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXTENSION_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode getCreate() {
		if (create != null && create.eIsProxy()) {
			InternalEObject oldCreate = (InternalEObject)create;
			create = (LeafNode)eResolveProxy(oldCreate);
			if (create != oldCreate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXTENSION_NODE__CREATE, oldCreate, create));
			}
		}
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode basicGetCreate() {
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreate(LeafNode newCreate) {
		LeafNode oldCreate = create;
		create = newCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXTENSION_NODE__CREATE, oldCreate, create));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode getCached() {
		if (cached != null && cached.eIsProxy()) {
			InternalEObject oldCached = (InternalEObject)cached;
			cached = (LeafNode)eResolveProxy(oldCached);
			if (cached != oldCached) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXTENSION_NODE__CACHED, oldCached, cached));
			}
		}
		return cached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode basicGetCached() {
		return cached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCached(LeafNode newCached) {
		LeafNode oldCached = cached;
		cached = newCached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXTENSION_NODE__CACHED, oldCached, cached));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXTENSION_NODE__PARAM_LIST, oldParamList, paramList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXTENSION_NODE__PARAM_LIST, oldParamList, paramList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.EXTENSION_NODE__EXTEND_BODY:
				if (resolve) return getExtendBody();
				return basicGetExtendBody();
			case Xpand3nodePackage.EXTENSION_NODE__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case Xpand3nodePackage.EXTENSION_NODE__CREATED_NAME:
				if (resolve) return getCreatedName();
				return basicGetCreatedName();
			case Xpand3nodePackage.EXTENSION_NODE__PRIVATE:
				if (resolve) return getPrivate();
				return basicGetPrivate();
			case Xpand3nodePackage.EXTENSION_NODE__JAVA_CALL:
				if (resolve) return getJavaCall();
				return basicGetJavaCall();
			case Xpand3nodePackage.EXTENSION_NODE__NAME:
				if (resolve) return getName();
				return basicGetName();
			case Xpand3nodePackage.EXTENSION_NODE__CREATE:
				if (resolve) return getCreate();
				return basicGetCreate();
			case Xpand3nodePackage.EXTENSION_NODE__CACHED:
				if (resolve) return getCached();
				return basicGetCached();
			case Xpand3nodePackage.EXTENSION_NODE__PARAM_LIST:
				if (resolve) return getParamList();
				return basicGetParamList();
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
			case Xpand3nodePackage.EXTENSION_NODE__EXTEND_BODY:
				setExtendBody((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__RETURN_TYPE:
				setReturnType((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__CREATED_NAME:
				setCreatedName((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__PRIVATE:
				setPrivate((LeafNode)newValue);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__JAVA_CALL:
				setJavaCall((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__NAME:
				setName((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__CREATE:
				setCreate((LeafNode)newValue);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__CACHED:
				setCached((LeafNode)newValue);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__PARAM_LIST:
				setParamList((CompositeNode)newValue);
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
			case Xpand3nodePackage.EXTENSION_NODE__EXTEND_BODY:
				setExtendBody((CompositeNode)null);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__RETURN_TYPE:
				setReturnType((CompositeNode)null);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__CREATED_NAME:
				setCreatedName((CompositeNode)null);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__PRIVATE:
				setPrivate((LeafNode)null);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__JAVA_CALL:
				setJavaCall((CompositeNode)null);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__NAME:
				setName((CompositeNode)null);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__CREATE:
				setCreate((LeafNode)null);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__CACHED:
				setCached((LeafNode)null);
				return;
			case Xpand3nodePackage.EXTENSION_NODE__PARAM_LIST:
				setParamList((CompositeNode)null);
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
			case Xpand3nodePackage.EXTENSION_NODE__EXTEND_BODY:
				return extendBody != null;
			case Xpand3nodePackage.EXTENSION_NODE__RETURN_TYPE:
				return returnType != null;
			case Xpand3nodePackage.EXTENSION_NODE__CREATED_NAME:
				return createdName != null;
			case Xpand3nodePackage.EXTENSION_NODE__PRIVATE:
				return private_ != null;
			case Xpand3nodePackage.EXTENSION_NODE__JAVA_CALL:
				return javaCall != null;
			case Xpand3nodePackage.EXTENSION_NODE__NAME:
				return name != null;
			case Xpand3nodePackage.EXTENSION_NODE__CREATE:
				return create != null;
			case Xpand3nodePackage.EXTENSION_NODE__CACHED:
				return cached != null;
			case Xpand3nodePackage.EXTENSION_NODE__PARAM_LIST:
				return paramList != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtensionNodeImpl
