/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExpandStatementNodeImpl.java,v 1.1 2008/03/17 14:39:06 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ExpandStatementNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expand Statement Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExpandStatementNodeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExpandStatementNodeImpl#getParamList <em>Param List</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExpandStatementNodeImpl#getForEachExpression <em>For Each Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExpandStatementNodeImpl#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ExpandStatementNodeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpandStatementNodeImpl extends CompositeNodeImpl implements ExpandStatementNode {
	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode separator;

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
	 * The cached value of the '{@link #getForEachExpression() <em>For Each Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForEachExpression()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode forEachExpression;

	/**
	 * The cached value of the '{@link #getForExpression() <em>For Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForExpression()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode forExpression;

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
	protected ExpandStatementNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.EXPAND_STATEMENT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getSeparator() {
		if (separator != null && separator.eIsProxy()) {
			InternalEObject oldSeparator = (InternalEObject)separator;
			separator = (CompositeNode)eResolveProxy(oldSeparator);
			if (separator != oldSeparator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXPAND_STATEMENT_NODE__SEPARATOR, oldSeparator, separator));
			}
		}
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(CompositeNode newSeparator) {
		CompositeNode oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXPAND_STATEMENT_NODE__SEPARATOR, oldSeparator, separator));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXPAND_STATEMENT_NODE__PARAM_LIST, oldParamList, paramList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXPAND_STATEMENT_NODE__PARAM_LIST, oldParamList, paramList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getForEachExpression() {
		if (forEachExpression != null && forEachExpression.eIsProxy()) {
			InternalEObject oldForEachExpression = (InternalEObject)forEachExpression;
			forEachExpression = (CompositeNode)eResolveProxy(oldForEachExpression);
			if (forEachExpression != oldForEachExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EACH_EXPRESSION, oldForEachExpression, forEachExpression));
			}
		}
		return forEachExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetForEachExpression() {
		return forEachExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForEachExpression(CompositeNode newForEachExpression) {
		CompositeNode oldForEachExpression = forEachExpression;
		forEachExpression = newForEachExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EACH_EXPRESSION, oldForEachExpression, forEachExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getForExpression() {
		if (forExpression != null && forExpression.eIsProxy()) {
			InternalEObject oldForExpression = (InternalEObject)forExpression;
			forExpression = (CompositeNode)eResolveProxy(oldForExpression);
			if (forExpression != oldForExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EXPRESSION, oldForExpression, forExpression));
			}
		}
		return forExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetForExpression() {
		return forExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForExpression(CompositeNode newForExpression) {
		CompositeNode oldForExpression = forExpression;
		forExpression = newForExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EXPRESSION, oldForExpression, forExpression));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.EXPAND_STATEMENT_NODE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.EXPAND_STATEMENT_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__SEPARATOR:
				if (resolve) return getSeparator();
				return basicGetSeparator();
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__PARAM_LIST:
				if (resolve) return getParamList();
				return basicGetParamList();
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EACH_EXPRESSION:
				if (resolve) return getForEachExpression();
				return basicGetForEachExpression();
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EXPRESSION:
				if (resolve) return getForExpression();
				return basicGetForExpression();
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__NAME:
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
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__SEPARATOR:
				setSeparator((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__PARAM_LIST:
				setParamList((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EACH_EXPRESSION:
				setForEachExpression((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EXPRESSION:
				setForExpression((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__NAME:
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
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__SEPARATOR:
				setSeparator((CompositeNode)null);
				return;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__PARAM_LIST:
				setParamList((CompositeNode)null);
				return;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EACH_EXPRESSION:
				setForEachExpression((CompositeNode)null);
				return;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EXPRESSION:
				setForExpression((CompositeNode)null);
				return;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__NAME:
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
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__SEPARATOR:
				return separator != null;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__PARAM_LIST:
				return paramList != null;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EACH_EXPRESSION:
				return forEachExpression != null;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__FOR_EXPRESSION:
				return forExpression != null;
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE__NAME:
				return name != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpandStatementNodeImpl
