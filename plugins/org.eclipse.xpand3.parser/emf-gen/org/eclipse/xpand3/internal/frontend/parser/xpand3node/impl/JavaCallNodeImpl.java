/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaCallNodeImpl.java,v 1.1 2008/03/17 14:39:06 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.frontend.parser.xpand3node.JavaCallNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Call Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.JavaCallNodeImpl#getJavaReturnType <em>Java Return Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.JavaCallNodeImpl#getJavaName <em>Java Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaCallNodeImpl extends CompositeNodeImpl implements JavaCallNode {
	/**
	 * The cached value of the '{@link #getJavaReturnType() <em>Java Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaReturnType()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode javaReturnType;

	/**
	 * The cached value of the '{@link #getJavaName() <em>Java Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaName()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode javaName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaCallNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.JAVA_CALL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getJavaReturnType() {
		if (javaReturnType != null && javaReturnType.eIsProxy()) {
			InternalEObject oldJavaReturnType = (InternalEObject)javaReturnType;
			javaReturnType = (CompositeNode)eResolveProxy(oldJavaReturnType);
			if (javaReturnType != oldJavaReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.JAVA_CALL_NODE__JAVA_RETURN_TYPE, oldJavaReturnType, javaReturnType));
			}
		}
		return javaReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetJavaReturnType() {
		return javaReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaReturnType(CompositeNode newJavaReturnType) {
		CompositeNode oldJavaReturnType = javaReturnType;
		javaReturnType = newJavaReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.JAVA_CALL_NODE__JAVA_RETURN_TYPE, oldJavaReturnType, javaReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getJavaName() {
		if (javaName != null && javaName.eIsProxy()) {
			InternalEObject oldJavaName = (InternalEObject)javaName;
			javaName = (CompositeNode)eResolveProxy(oldJavaName);
			if (javaName != oldJavaName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.JAVA_CALL_NODE__JAVA_NAME, oldJavaName, javaName));
			}
		}
		return javaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetJavaName() {
		return javaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaName(CompositeNode newJavaName) {
		CompositeNode oldJavaName = javaName;
		javaName = newJavaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.JAVA_CALL_NODE__JAVA_NAME, oldJavaName, javaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.JAVA_CALL_NODE__JAVA_RETURN_TYPE:
				if (resolve) return getJavaReturnType();
				return basicGetJavaReturnType();
			case Xpand3nodePackage.JAVA_CALL_NODE__JAVA_NAME:
				if (resolve) return getJavaName();
				return basicGetJavaName();
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
			case Xpand3nodePackage.JAVA_CALL_NODE__JAVA_RETURN_TYPE:
				setJavaReturnType((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.JAVA_CALL_NODE__JAVA_NAME:
				setJavaName((CompositeNode)newValue);
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
			case Xpand3nodePackage.JAVA_CALL_NODE__JAVA_RETURN_TYPE:
				setJavaReturnType((CompositeNode)null);
				return;
			case Xpand3nodePackage.JAVA_CALL_NODE__JAVA_NAME:
				setJavaName((CompositeNode)null);
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
			case Xpand3nodePackage.JAVA_CALL_NODE__JAVA_RETURN_TYPE:
				return javaReturnType != null;
			case Xpand3nodePackage.JAVA_CALL_NODE__JAVA_NAME:
				return javaName != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaCallNodeImpl
