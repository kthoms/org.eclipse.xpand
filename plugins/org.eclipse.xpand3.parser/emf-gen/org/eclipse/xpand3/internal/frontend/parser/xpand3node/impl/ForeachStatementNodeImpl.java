/**
 * <copyright>
 * </copyright>
 *
 * $Id: ForeachStatementNodeImpl.java,v 1.1 2008/03/17 14:39:06 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ForeachStatementNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreach Statement Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ForeachStatementNodeImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ForeachStatementNodeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ForeachStatementNodeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ForeachStatementNodeImpl#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.ForeachStatementNodeImpl#getSeparatorExpression <em>Separator Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeachStatementNodeImpl extends CompositeNodeImpl implements ForeachStatementNode {
	/**
	 * The cached value of the '{@link #getIterator() <em>Iterator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode iterator;

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
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode sequence;

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
	 * The cached value of the '{@link #getSeparatorExpression() <em>Separator Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparatorExpression()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode separatorExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeachStatementNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.FOREACH_STATEMENT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getIterator() {
		if (iterator != null && iterator.eIsProxy()) {
			InternalEObject oldIterator = (InternalEObject)iterator;
			iterator = (CompositeNode)eResolveProxy(oldIterator);
			if (iterator != oldIterator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.FOREACH_STATEMENT_NODE__ITERATOR, oldIterator, iterator));
			}
		}
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetIterator() {
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterator(CompositeNode newIterator) {
		CompositeNode oldIterator = iterator;
		iterator = newIterator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.FOREACH_STATEMENT_NODE__ITERATOR, oldIterator, iterator));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.FOREACH_STATEMENT_NODE__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.FOREACH_STATEMENT_NODE__IDENTIFIER, oldIdentifier, identifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEQUENCE, oldSequence, sequence));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEQUENCE, oldSequence, sequence));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.FOREACH_STATEMENT_NODE__FOR_EXPRESSION, oldForExpression, forExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.FOREACH_STATEMENT_NODE__FOR_EXPRESSION, oldForExpression, forExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getSeparatorExpression() {
		if (separatorExpression != null && separatorExpression.eIsProxy()) {
			InternalEObject oldSeparatorExpression = (InternalEObject)separatorExpression;
			separatorExpression = (CompositeNode)eResolveProxy(oldSeparatorExpression);
			if (separatorExpression != oldSeparatorExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEPARATOR_EXPRESSION, oldSeparatorExpression, separatorExpression));
			}
		}
		return separatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetSeparatorExpression() {
		return separatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparatorExpression(CompositeNode newSeparatorExpression) {
		CompositeNode oldSeparatorExpression = separatorExpression;
		separatorExpression = newSeparatorExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEPARATOR_EXPRESSION, oldSeparatorExpression, separatorExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__ITERATOR:
				if (resolve) return getIterator();
				return basicGetIterator();
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__FOR_EXPRESSION:
				if (resolve) return getForExpression();
				return basicGetForExpression();
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEPARATOR_EXPRESSION:
				if (resolve) return getSeparatorExpression();
				return basicGetSeparatorExpression();
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
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__ITERATOR:
				setIterator((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__IDENTIFIER:
				setIdentifier((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEQUENCE:
				setSequence((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__FOR_EXPRESSION:
				setForExpression((CompositeNode)newValue);
				return;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEPARATOR_EXPRESSION:
				setSeparatorExpression((CompositeNode)newValue);
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
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__ITERATOR:
				setIterator((CompositeNode)null);
				return;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__IDENTIFIER:
				setIdentifier((CompositeNode)null);
				return;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEQUENCE:
				setSequence((CompositeNode)null);
				return;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__FOR_EXPRESSION:
				setForExpression((CompositeNode)null);
				return;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEPARATOR_EXPRESSION:
				setSeparatorExpression((CompositeNode)null);
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
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__ITERATOR:
				return iterator != null;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__IDENTIFIER:
				return identifier != null;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEQUENCE:
				return sequence != null;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__FOR_EXPRESSION:
				return forExpression != null;
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE__SEPARATOR_EXPRESSION:
				return separatorExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeachStatementNodeImpl
