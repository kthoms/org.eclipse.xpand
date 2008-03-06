/**
 * <copyright>
 * </copyright>
 *
 * $Id: NsImportNodeImpl.java,v 1.1 2008/03/06 08:55:16 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.NsImportNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ns Import Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.NsImportNodeImpl#getNs <em>Ns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NsImportNodeImpl extends CompositeNodeImpl implements NsImportNode {
	/**
	 * The cached value of the '{@link #getNs() <em>Ns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode ns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NsImportNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.NS_IMPORT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getNs() {
		if (ns != null && ns.eIsProxy()) {
			InternalEObject oldNs = (InternalEObject)ns;
			ns = (CompositeNode)eResolveProxy(oldNs);
			if (ns != oldNs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.NS_IMPORT_NODE__NS, oldNs, ns));
			}
		}
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetNs() {
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNs(CompositeNode newNs) {
		CompositeNode oldNs = ns;
		ns = newNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.NS_IMPORT_NODE__NS, oldNs, ns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.NS_IMPORT_NODE__NS:
				if (resolve) return getNs();
				return basicGetNs();
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
			case Xpand3nodePackage.NS_IMPORT_NODE__NS:
				setNs((CompositeNode)newValue);
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
			case Xpand3nodePackage.NS_IMPORT_NODE__NS:
				setNs((CompositeNode)null);
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
			case Xpand3nodePackage.NS_IMPORT_NODE__NS:
				return ns != null;
		}
		return super.eIsSet(featureID);
	}

} //NsImportNodeImpl
