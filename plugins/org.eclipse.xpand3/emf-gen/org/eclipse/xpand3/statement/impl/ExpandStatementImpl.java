/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExpandStatementImpl.java,v 1.2 2008/03/07 11:10:34 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;

import org.eclipse.xpand3.statement.ExpandStatement;
import org.eclipse.xpand3.statement.StatementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expand Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ExpandStatementImpl#isForeach <em>Foreach</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ExpandStatementImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ExpandStatementImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ExpandStatementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.ExpandStatementImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpandStatementImpl extends AbstractStatementImpl implements ExpandStatement {
	/**
	 * The default value of the '{@link #isForeach() <em>Foreach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForeach()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOREACH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForeach() <em>Foreach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForeach()
	 * @generated
	 * @ordered
	 */
	protected boolean foreach = FOREACH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractExpression> parameters;

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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression target;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Identifier definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpandStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.EXPAND_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForeach() {
		return foreach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeach(boolean newForeach) {
		boolean oldForeach = foreach;
		foreach = newForeach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.EXPAND_STATEMENT__FOREACH, oldForeach, foreach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractExpression> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<AbstractExpression>(AbstractExpression.class, this, StatementPackage.EXPAND_STATEMENT__PARAMETERS);
		}
		return parameters;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.EXPAND_STATEMENT__SEPARATOR, oldSeparator, newSeparator);
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
				msgs = ((InternalEObject)separator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.EXPAND_STATEMENT__SEPARATOR, null, msgs);
			if (newSeparator != null)
				msgs = ((InternalEObject)newSeparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.EXPAND_STATEMENT__SEPARATOR, null, msgs);
			msgs = basicSetSeparator(newSeparator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.EXPAND_STATEMENT__SEPARATOR, newSeparator, newSeparator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.EXPAND_STATEMENT__TARGET, oldTarget, newTarget);
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
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.EXPAND_STATEMENT__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.EXPAND_STATEMENT__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.EXPAND_STATEMENT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Identifier newDefinition, NotificationChain msgs) {
		Identifier oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.EXPAND_STATEMENT__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Identifier newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.EXPAND_STATEMENT__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.EXPAND_STATEMENT__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.EXPAND_STATEMENT__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.EXPAND_STATEMENT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case StatementPackage.EXPAND_STATEMENT__SEPARATOR:
				return basicSetSeparator(null, msgs);
			case StatementPackage.EXPAND_STATEMENT__TARGET:
				return basicSetTarget(null, msgs);
			case StatementPackage.EXPAND_STATEMENT__DEFINITION:
				return basicSetDefinition(null, msgs);
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
			case StatementPackage.EXPAND_STATEMENT__FOREACH:
				return isForeach() ? Boolean.TRUE : Boolean.FALSE;
			case StatementPackage.EXPAND_STATEMENT__PARAMETERS:
				return getParameters();
			case StatementPackage.EXPAND_STATEMENT__SEPARATOR:
				return getSeparator();
			case StatementPackage.EXPAND_STATEMENT__TARGET:
				return getTarget();
			case StatementPackage.EXPAND_STATEMENT__DEFINITION:
				return getDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatementPackage.EXPAND_STATEMENT__FOREACH:
				setForeach(((Boolean)newValue).booleanValue());
				return;
			case StatementPackage.EXPAND_STATEMENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends AbstractExpression>)newValue);
				return;
			case StatementPackage.EXPAND_STATEMENT__SEPARATOR:
				setSeparator((AbstractExpression)newValue);
				return;
			case StatementPackage.EXPAND_STATEMENT__TARGET:
				setTarget((AbstractExpression)newValue);
				return;
			case StatementPackage.EXPAND_STATEMENT__DEFINITION:
				setDefinition((Identifier)newValue);
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
			case StatementPackage.EXPAND_STATEMENT__FOREACH:
				setForeach(FOREACH_EDEFAULT);
				return;
			case StatementPackage.EXPAND_STATEMENT__PARAMETERS:
				getParameters().clear();
				return;
			case StatementPackage.EXPAND_STATEMENT__SEPARATOR:
				setSeparator((AbstractExpression)null);
				return;
			case StatementPackage.EXPAND_STATEMENT__TARGET:
				setTarget((AbstractExpression)null);
				return;
			case StatementPackage.EXPAND_STATEMENT__DEFINITION:
				setDefinition((Identifier)null);
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
			case StatementPackage.EXPAND_STATEMENT__FOREACH:
				return foreach != FOREACH_EDEFAULT;
			case StatementPackage.EXPAND_STATEMENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case StatementPackage.EXPAND_STATEMENT__SEPARATOR:
				return separator != null;
			case StatementPackage.EXPAND_STATEMENT__TARGET:
				return target != null;
			case StatementPackage.EXPAND_STATEMENT__DEFINITION:
				return definition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (foreach: ");
		result.append(foreach);
		result.append(')');
		return result.toString();
	}

} //ExpandStatementImpl
