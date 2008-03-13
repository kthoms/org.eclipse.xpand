/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileStatementNodeImpl.java,v 1.4 2008/03/13 08:40:01 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Statement Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FileStatementNodeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FileStatementNodeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FileStatementNodeImpl#getNameExpression <em>Name Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileStatementNodeImpl extends CompositeNodeImpl implements FileStatementNode {
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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode identifier;

	/**
	 * The cached value of the '{@link #getNameExpression() <em>Name Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameExpression()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode nameExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileStatementNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.FILE_STATEMENT_NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.FILE_STATEMENT_NODE__SEQUENCE, oldSequence, sequence));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.FILE_STATEMENT_NODE__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (CompositeNode)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.FILE_STATEMENT_NODE__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(CompositeNode newIdentifier) {
		CompositeNode oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.FILE_STATEMENT_NODE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getNameExpression() {
		if (nameExpression != null && nameExpression.eIsProxy()) {
			InternalEObject oldNameExpression = (InternalEObject)nameExpression;
			nameExpression = (CompositeNode)eResolveProxy(oldNameExpression);
			if (nameExpression != oldNameExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.FILE_STATEMENT_NODE__NAME_EXPRESSION, oldNameExpression, nameExpression));
			}
		}
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetNameExpression() {
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameExpression(CompositeNode newNameExpression) {
		CompositeNode oldNameExpression = nameExpression;
		nameExpression = newNameExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.FILE_STATEMENT_NODE__NAME_EXPRESSION, oldNameExpression, nameExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.FILE_STATEMENT_NODE__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case Xpand3nodePackage.FILE_STATEMENT_NODE__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case Xpand3nodePackage.FILE_STATEMENT_NODE__NAME_EXPRESSION:
				if (resolve) return getNameExpression();
				return basicGetNameExpression();
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
			case Xpand3nodePackage.FILE_STATEMENT_NODE__SEQUENCE:
				setSequence((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.FILE_STATEMENT_NODE__IDENTIFIER:
				setIdentifier((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.FILE_STATEMENT_NODE__NAME_EXPRESSION:
				setNameExpression((CompositeNode)newValue);
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
			case Xpand3nodePackage.FILE_STATEMENT_NODE__SEQUENCE:
				setSequence((CompositeNode)null);
				return;
			case Xpand3nodePackage.FILE_STATEMENT_NODE__IDENTIFIER:
				setIdentifier((CompositeNode)null);
				return;
			case Xpand3nodePackage.FILE_STATEMENT_NODE__NAME_EXPRESSION:
				setNameExpression((CompositeNode)null);
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
			case Xpand3nodePackage.FILE_STATEMENT_NODE__SEQUENCE:
				return sequence != null;
			case Xpand3nodePackage.FILE_STATEMENT_NODE__IDENTIFIER:
				return identifier != null;
			case Xpand3nodePackage.FILE_STATEMENT_NODE__NAME_EXPRESSION:
				return nameExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //FileStatementNodeImpl
