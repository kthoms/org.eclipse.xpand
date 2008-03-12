/**
 * <copyright>
 * </copyright>
 *
 * $Id: ForEachStatementImpl.java,v 1.3 2008/03/12 09:54:30 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;

import org.eclipse.xpand3.statement.ForEachStatement;
import org.eclipse.xpand3.statement.StatementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ForEachStatementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ForEachStatementImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ForEachStatementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ForEachStatementImpl#getIteratorName <em>Iterator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForEachStatementImpl extends AbstractStatementWithBodyImpl implements ForEachStatement {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression target;

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression separator;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Identifier variable;

	/**
	 * The cached value of the '{@link #getIteratorName() <em>Iterator Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteratorName()
	 * @generated
	 * @ordered
	 */
	protected Identifier iteratorName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForEachStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.FOR_EACH_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(AbstractExpression newTarget, NotificationChain msgs) {
		AbstractExpression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.FOR_EACH_STATEMENT__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(AbstractExpression newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FOR_EACH_STATEMENT__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FOR_EACH_STATEMENT__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.FOR_EACH_STATEMENT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeparator(AbstractExpression newSeparator, NotificationChain msgs) {
		AbstractExpression oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.FOR_EACH_STATEMENT__SEPARATOR, oldSeparator, newSeparator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(AbstractExpression newSeparator) {
		if (newSeparator != separator) {
			NotificationChain msgs = null;
			if (separator != null)
				msgs = ((InternalEObject)separator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FOR_EACH_STATEMENT__SEPARATOR, null, msgs);
			if (newSeparator != null)
				msgs = ((InternalEObject)newSeparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FOR_EACH_STATEMENT__SEPARATOR, null, msgs);
			msgs = basicSetSeparator(newSeparator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.FOR_EACH_STATEMENT__SEPARATOR, newSeparator, newSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Identifier newVariable, NotificationChain msgs) {
		Identifier oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.FOR_EACH_STATEMENT__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Identifier newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FOR_EACH_STATEMENT__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FOR_EACH_STATEMENT__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.FOR_EACH_STATEMENT__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIteratorName() {
		return iteratorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIteratorName(Identifier newIteratorName, NotificationChain msgs) {
		Identifier oldIteratorName = iteratorName;
		iteratorName = newIteratorName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.FOR_EACH_STATEMENT__ITERATOR_NAME, oldIteratorName, newIteratorName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteratorName(Identifier newIteratorName) {
		if (newIteratorName != iteratorName) {
			NotificationChain msgs = null;
			if (iteratorName != null)
				msgs = ((InternalEObject)iteratorName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FOR_EACH_STATEMENT__ITERATOR_NAME, null, msgs);
			if (newIteratorName != null)
				msgs = ((InternalEObject)newIteratorName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FOR_EACH_STATEMENT__ITERATOR_NAME, null, msgs);
			msgs = basicSetIteratorName(newIteratorName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.FOR_EACH_STATEMENT__ITERATOR_NAME, newIteratorName, newIteratorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.FOR_EACH_STATEMENT__TARGET:
				return basicSetTarget(null, msgs);
			case StatementPackage.FOR_EACH_STATEMENT__SEPARATOR:
				return basicSetSeparator(null, msgs);
			case StatementPackage.FOR_EACH_STATEMENT__VARIABLE:
				return basicSetVariable(null, msgs);
			case StatementPackage.FOR_EACH_STATEMENT__ITERATOR_NAME:
				return basicSetIteratorName(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatementPackage.FOR_EACH_STATEMENT__TARGET:
				return getTarget();
			case StatementPackage.FOR_EACH_STATEMENT__SEPARATOR:
				return getSeparator();
			case StatementPackage.FOR_EACH_STATEMENT__VARIABLE:
				return getVariable();
			case StatementPackage.FOR_EACH_STATEMENT__ITERATOR_NAME:
				return getIteratorName();
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
			case StatementPackage.FOR_EACH_STATEMENT__TARGET:
				setTarget((AbstractExpression)newValue);
				return;
			case StatementPackage.FOR_EACH_STATEMENT__SEPARATOR:
				setSeparator((AbstractExpression)newValue);
				return;
			case StatementPackage.FOR_EACH_STATEMENT__VARIABLE:
				setVariable((Identifier)newValue);
				return;
			case StatementPackage.FOR_EACH_STATEMENT__ITERATOR_NAME:
				setIteratorName((Identifier)newValue);
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
			case StatementPackage.FOR_EACH_STATEMENT__TARGET:
				setTarget((AbstractExpression)null);
				return;
			case StatementPackage.FOR_EACH_STATEMENT__SEPARATOR:
				setSeparator((AbstractExpression)null);
				return;
			case StatementPackage.FOR_EACH_STATEMENT__VARIABLE:
				setVariable((Identifier)null);
				return;
			case StatementPackage.FOR_EACH_STATEMENT__ITERATOR_NAME:
				setIteratorName((Identifier)null);
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
			case StatementPackage.FOR_EACH_STATEMENT__TARGET:
				return target != null;
			case StatementPackage.FOR_EACH_STATEMENT__SEPARATOR:
				return separator != null;
			case StatementPackage.FOR_EACH_STATEMENT__VARIABLE:
				return variable != null;
			case StatementPackage.FOR_EACH_STATEMENT__ITERATOR_NAME:
				return iteratorName != null;
		}
		return super.eIsSet(featureID);
	}

} //ForEachStatementImpl
