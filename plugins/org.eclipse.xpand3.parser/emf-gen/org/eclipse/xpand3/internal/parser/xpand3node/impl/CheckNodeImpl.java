/**
 * <copyright>
 * </copyright>
 *
 * $Id: CheckNodeImpl.java,v 1.3 2008/03/13 08:40:01 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.CheckNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CheckNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CheckNodeImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CheckNodeImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CheckNodeImpl#getIfExpression <em>If Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CheckNodeImpl#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CheckNodeImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckNodeImpl extends CompositeNodeImpl implements CheckNode {
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
	 * The cached value of the '{@link #getError() <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected LeafNode error;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode message;

	/**
	 * The cached value of the '{@link #getIfExpression() <em>If Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfExpression()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode ifExpression;

	/**
	 * The cached value of the '{@link #getWarning() <em>Warning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarning()
	 * @generated
	 * @ordered
	 */
	protected LeafNode warning;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.CHECK_NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.CHECK_NODE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.CHECK_NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode getError() {
		if (error != null && error.eIsProxy()) {
			InternalEObject oldError = (InternalEObject)error;
			error = (LeafNode)eResolveProxy(oldError);
			if (error != oldError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.CHECK_NODE__ERROR, oldError, error));
			}
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode basicGetError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(LeafNode newError) {
		LeafNode oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.CHECK_NODE__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = (CompositeNode)eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.CHECK_NODE__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(CompositeNode newMessage) {
		CompositeNode oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.CHECK_NODE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getIfExpression() {
		if (ifExpression != null && ifExpression.eIsProxy()) {
			InternalEObject oldIfExpression = (InternalEObject)ifExpression;
			ifExpression = (CompositeNode)eResolveProxy(oldIfExpression);
			if (ifExpression != oldIfExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.CHECK_NODE__IF_EXPRESSION, oldIfExpression, ifExpression));
			}
		}
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetIfExpression() {
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfExpression(CompositeNode newIfExpression) {
		CompositeNode oldIfExpression = ifExpression;
		ifExpression = newIfExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.CHECK_NODE__IF_EXPRESSION, oldIfExpression, ifExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode getWarning() {
		if (warning != null && warning.eIsProxy()) {
			InternalEObject oldWarning = (InternalEObject)warning;
			warning = (LeafNode)eResolveProxy(oldWarning);
			if (warning != oldWarning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.CHECK_NODE__WARNING, oldWarning, warning));
			}
		}
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode basicGetWarning() {
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarning(LeafNode newWarning) {
		LeafNode oldWarning = warning;
		warning = newWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.CHECK_NODE__WARNING, oldWarning, warning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getConstraint() {
		if (constraint != null && constraint.eIsProxy()) {
			InternalEObject oldConstraint = (InternalEObject)constraint;
			constraint = (CompositeNode)eResolveProxy(oldConstraint);
			if (constraint != oldConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.CHECK_NODE__CONSTRAINT, oldConstraint, constraint));
			}
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(CompositeNode newConstraint) {
		CompositeNode oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.CHECK_NODE__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.CHECK_NODE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case Xpand3nodePackage.CHECK_NODE__ERROR:
				if (resolve) return getError();
				return basicGetError();
			case Xpand3nodePackage.CHECK_NODE__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
			case Xpand3nodePackage.CHECK_NODE__IF_EXPRESSION:
				if (resolve) return getIfExpression();
				return basicGetIfExpression();
			case Xpand3nodePackage.CHECK_NODE__WARNING:
				if (resolve) return getWarning();
				return basicGetWarning();
			case Xpand3nodePackage.CHECK_NODE__CONSTRAINT:
				if (resolve) return getConstraint();
				return basicGetConstraint();
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
			case Xpand3nodePackage.CHECK_NODE__TYPE:
				setType((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.CHECK_NODE__ERROR:
				setError((LeafNode)newValue);
				return;
			case Xpand3nodePackage.CHECK_NODE__MESSAGE:
				setMessage((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.CHECK_NODE__IF_EXPRESSION:
				setIfExpression((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.CHECK_NODE__WARNING:
				setWarning((LeafNode)newValue);
				return;
			case Xpand3nodePackage.CHECK_NODE__CONSTRAINT:
				setConstraint((CompositeNode)newValue);
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
			case Xpand3nodePackage.CHECK_NODE__TYPE:
				setType((CompositeNode)null);
				return;
			case Xpand3nodePackage.CHECK_NODE__ERROR:
				setError((LeafNode)null);
				return;
			case Xpand3nodePackage.CHECK_NODE__MESSAGE:
				setMessage((CompositeNode)null);
				return;
			case Xpand3nodePackage.CHECK_NODE__IF_EXPRESSION:
				setIfExpression((CompositeNode)null);
				return;
			case Xpand3nodePackage.CHECK_NODE__WARNING:
				setWarning((LeafNode)null);
				return;
			case Xpand3nodePackage.CHECK_NODE__CONSTRAINT:
				setConstraint((CompositeNode)null);
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
			case Xpand3nodePackage.CHECK_NODE__TYPE:
				return type != null;
			case Xpand3nodePackage.CHECK_NODE__ERROR:
				return error != null;
			case Xpand3nodePackage.CHECK_NODE__MESSAGE:
				return message != null;
			case Xpand3nodePackage.CHECK_NODE__IF_EXPRESSION:
				return ifExpression != null;
			case Xpand3nodePackage.CHECK_NODE__WARNING:
				return warning != null;
			case Xpand3nodePackage.CHECK_NODE__CONSTRAINT:
				return constraint != null;
		}
		return super.eIsSet(featureID);
	}

} //CheckNodeImpl
