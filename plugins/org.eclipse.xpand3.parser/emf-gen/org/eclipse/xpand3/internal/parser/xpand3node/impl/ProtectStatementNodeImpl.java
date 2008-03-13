/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProtectStatementNodeImpl.java,v 1.4 2008/03/13 08:40:01 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protect Statement Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ProtectStatementNodeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ProtectStatementNodeImpl#getCend <em>Cend</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ProtectStatementNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ProtectStatementNodeImpl#getCstart <em>Cstart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtectStatementNodeImpl extends CompositeNodeImpl implements ProtectStatementNode {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode sequence;

	/**
	 * The cached value of the '{@link #getCend() <em>Cend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCend()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode cend;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode id;

	/**
	 * The cached value of the '{@link #getCstart() <em>Cstart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCstart()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode cstart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectStatementNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.PROTECT_STATEMENT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getSequence() {
		if (sequence != null && sequence.eIsProxy()) {
			InternalEObject oldSequence = (InternalEObject)sequence;
			sequence = (CompositeNode)eResolveProxy(oldSequence);
			if (sequence != oldSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.PROTECT_STATEMENT_NODE__SEQUENCE, oldSequence, sequence));
			}
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(CompositeNode newSequence) {
		CompositeNode oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.PROTECT_STATEMENT_NODE__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getCend() {
		if (cend != null && cend.eIsProxy()) {
			InternalEObject oldCend = (InternalEObject)cend;
			cend = (CompositeNode)eResolveProxy(oldCend);
			if (cend != oldCend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.PROTECT_STATEMENT_NODE__CEND, oldCend, cend));
			}
		}
		return cend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetCend() {
		return cend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCend(CompositeNode newCend) {
		CompositeNode oldCend = cend;
		cend = newCend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.PROTECT_STATEMENT_NODE__CEND, oldCend, cend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getId() {
		if (id != null && id.eIsProxy()) {
			InternalEObject oldId = (InternalEObject)id;
			id = (CompositeNode)eResolveProxy(oldId);
			if (id != oldId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.PROTECT_STATEMENT_NODE__ID, oldId, id));
			}
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(CompositeNode newId) {
		CompositeNode oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.PROTECT_STATEMENT_NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getCstart() {
		if (cstart != null && cstart.eIsProxy()) {
			InternalEObject oldCstart = (InternalEObject)cstart;
			cstart = (CompositeNode)eResolveProxy(oldCstart);
			if (cstart != oldCstart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.PROTECT_STATEMENT_NODE__CSTART, oldCstart, cstart));
			}
		}
		return cstart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetCstart() {
		return cstart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCstart(CompositeNode newCstart) {
		CompositeNode oldCstart = cstart;
		cstart = newCstart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.PROTECT_STATEMENT_NODE__CSTART, oldCstart, cstart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__CEND:
				if (resolve) return getCend();
				return basicGetCend();
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__ID:
				if (resolve) return getId();
				return basicGetId();
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__CSTART:
				if (resolve) return getCstart();
				return basicGetCstart();
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
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__SEQUENCE:
				setSequence((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__CEND:
				setCend((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__ID:
				setId((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__CSTART:
				setCstart((CompositeNode)newValue);
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
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__SEQUENCE:
				setSequence((CompositeNode)null);
				return;
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__CEND:
				setCend((CompositeNode)null);
				return;
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__ID:
				setId((CompositeNode)null);
				return;
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__CSTART:
				setCstart((CompositeNode)null);
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
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__SEQUENCE:
				return sequence != null;
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__CEND:
				return cend != null;
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__ID:
				return id != null;
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE__CSTART:
				return cstart != null;
		}
		return super.eIsSet(featureID);
	}

} //ProtectStatementNodeImpl
