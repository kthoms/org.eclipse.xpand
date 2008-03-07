/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredParameterNodeImpl.java,v 1.4 2008/03/07 11:11:15 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Parameter Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.DeclaredParameterNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.DeclaredParameterNodeImpl#getPtype <em>Ptype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclaredParameterNodeImpl extends CompositeNodeImpl implements DeclaredParameterNode {
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
	 * The cached value of the '{@link #getPtype() <em>Ptype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtype()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode ptype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredParameterNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.DECLARED_PARAMETER_NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.DECLARED_PARAMETER_NODE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.DECLARED_PARAMETER_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getPtype() {
		if (ptype != null && ptype.eIsProxy()) {
			InternalEObject oldPtype = (InternalEObject)ptype;
			ptype = (CompositeNode)eResolveProxy(oldPtype);
			if (ptype != oldPtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.DECLARED_PARAMETER_NODE__PTYPE, oldPtype, ptype));
			}
		}
		return ptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetPtype() {
		return ptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtype(CompositeNode newPtype) {
		CompositeNode oldPtype = ptype;
		ptype = newPtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.DECLARED_PARAMETER_NODE__PTYPE, oldPtype, ptype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.DECLARED_PARAMETER_NODE__NAME:
				if (resolve) return getName();
				return basicGetName();
			case Xpand3nodePackage.DECLARED_PARAMETER_NODE__PTYPE:
				if (resolve) return getPtype();
				return basicGetPtype();
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
			case Xpand3nodePackage.DECLARED_PARAMETER_NODE__NAME:
				setName((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.DECLARED_PARAMETER_NODE__PTYPE:
				setPtype((CompositeNode)newValue);
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
			case Xpand3nodePackage.DECLARED_PARAMETER_NODE__NAME:
				setName((CompositeNode)null);
				return;
			case Xpand3nodePackage.DECLARED_PARAMETER_NODE__PTYPE:
				setPtype((CompositeNode)null);
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
			case Xpand3nodePackage.DECLARED_PARAMETER_NODE__NAME:
				return name != null;
			case Xpand3nodePackage.DECLARED_PARAMETER_NODE__PTYPE:
				return ptype != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclaredParameterNodeImpl
