/**
 * <copyright>
 * </copyright>
 *
 * $Id: DefinitionNodeImpl.java,v 1.1 2008/03/06 08:55:16 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.DefinitionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.DefinitionNodeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionNodeImpl extends CompositeNodeImpl implements DefinitionNode {
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
	protected DefinitionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.DEFINITION_NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.DEFINITION_NODE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.DEFINITION_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.DEFINITION_NODE__NAME:
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
			case Xpand3nodePackage.DEFINITION_NODE__NAME:
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
			case Xpand3nodePackage.DEFINITION_NODE__NAME:
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
			case Xpand3nodePackage.DEFINITION_NODE__NAME:
				return name != null;
		}
		return super.eIsSet(featureID);
	}

} //DefinitionNodeImpl
