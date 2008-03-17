/**
 * <copyright>
 * </copyright>
 *
 * $Id: DefinitionAroundNodeImpl.java,v 1.1 2008/03/17 14:39:06 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.frontend.parser.xpand3node.DefinitionAroundNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Around Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.DefinitionAroundNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.DefinitionAroundNodeImpl#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.DefinitionAroundNodeImpl#getParamList <em>Param List</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.DefinitionAroundNodeImpl#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionAroundNodeImpl extends CompositeNodeImpl implements DefinitionAroundNode {
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
	 * The cached value of the '{@link #getPointcut() <em>Pointcut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcut()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode pointcut;

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
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode sequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionAroundNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.DEFINITION_AROUND_NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.DEFINITION_AROUND_NODE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.DEFINITION_AROUND_NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getPointcut() {
		if (pointcut != null && pointcut.eIsProxy()) {
			InternalEObject oldPointcut = (InternalEObject)pointcut;
			pointcut = (CompositeNode)eResolveProxy(oldPointcut);
			if (pointcut != oldPointcut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.DEFINITION_AROUND_NODE__POINTCUT, oldPointcut, pointcut));
			}
		}
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetPointcut() {
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointcut(CompositeNode newPointcut) {
		CompositeNode oldPointcut = pointcut;
		pointcut = newPointcut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.DEFINITION_AROUND_NODE__POINTCUT, oldPointcut, pointcut));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.DEFINITION_AROUND_NODE__PARAM_LIST, oldParamList, paramList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.DEFINITION_AROUND_NODE__PARAM_LIST, oldParamList, paramList));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.DEFINITION_AROUND_NODE__SEQUENCE, oldSequence, sequence));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.DEFINITION_AROUND_NODE__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__POINTCUT:
				if (resolve) return getPointcut();
				return basicGetPointcut();
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__PARAM_LIST:
				if (resolve) return getParamList();
				return basicGetParamList();
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
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
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__TYPE:
				setType((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__POINTCUT:
				setPointcut((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__PARAM_LIST:
				setParamList((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__SEQUENCE:
				setSequence((CompositeNode)newValue);
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
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__TYPE:
				setType((CompositeNode)null);
				return;
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__POINTCUT:
				setPointcut((CompositeNode)null);
				return;
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__PARAM_LIST:
				setParamList((CompositeNode)null);
				return;
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__SEQUENCE:
				setSequence((CompositeNode)null);
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
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__TYPE:
				return type != null;
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__POINTCUT:
				return pointcut != null;
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__PARAM_LIST:
				return paramList != null;
			case Xpand3nodePackage.DEFINITION_AROUND_NODE__SEQUENCE:
				return sequence != null;
		}
		return super.eIsSet(featureID);
	}

} //DefinitionAroundNodeImpl
