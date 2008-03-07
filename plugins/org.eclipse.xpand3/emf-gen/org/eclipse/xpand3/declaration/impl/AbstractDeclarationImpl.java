/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractDeclarationImpl.java,v 1.2 2008/03/07 11:10:53 jkohnlein Exp $
 */
package org.eclipse.xpand3.declaration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xpand3.DeclaredParameter;
import org.eclipse.xpand3.File;

import org.eclipse.xpand3.declaration.AbstractDeclaration;
import org.eclipse.xpand3.declaration.DeclarationPackage;

import org.eclipse.xpand3.expression.AbstractExpression;

import org.eclipse.xpand3.impl.SyntaxElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.AbstractDeclarationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.AbstractDeclarationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.AbstractDeclarationImpl#isIsPrivate <em>Is Private</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.AbstractDeclarationImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractDeclarationImpl extends SyntaxElementImpl implements AbstractDeclaration {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected File owner;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclaredParameter> params;

	/**
	 * The default value of the '{@link #isIsPrivate() <em>Is Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrivate() <em>Is Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrivate()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrivate = IS_PRIVATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression guard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.ABSTRACT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(File newOwner, NotificationChain msgs) {
		File oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.ABSTRACT_DECLARATION__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(File newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.ABSTRACT_DECLARATION__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.ABSTRACT_DECLARATION__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.ABSTRACT_DECLARATION__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclaredParameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<DeclaredParameter>(DeclaredParameter.class, this, DeclarationPackage.ABSTRACT_DECLARATION__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrivate() {
		return isPrivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrivate(boolean newIsPrivate) {
		boolean oldIsPrivate = isPrivate;
		isPrivate = newIsPrivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.ABSTRACT_DECLARATION__IS_PRIVATE, oldIsPrivate, isPrivate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(AbstractExpression newGuard, NotificationChain msgs) {
		AbstractExpression oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.ABSTRACT_DECLARATION__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(AbstractExpression newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.ABSTRACT_DECLARATION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.ABSTRACT_DECLARATION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.ABSTRACT_DECLARATION__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.ABSTRACT_DECLARATION__OWNER:
				return basicSetOwner(null, msgs);
			case DeclarationPackage.ABSTRACT_DECLARATION__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case DeclarationPackage.ABSTRACT_DECLARATION__GUARD:
				return basicSetGuard(null, msgs);
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
			case DeclarationPackage.ABSTRACT_DECLARATION__OWNER:
				return getOwner();
			case DeclarationPackage.ABSTRACT_DECLARATION__PARAMS:
				return getParams();
			case DeclarationPackage.ABSTRACT_DECLARATION__IS_PRIVATE:
				return isIsPrivate() ? Boolean.TRUE : Boolean.FALSE;
			case DeclarationPackage.ABSTRACT_DECLARATION__GUARD:
				return getGuard();
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
			case DeclarationPackage.ABSTRACT_DECLARATION__OWNER:
				setOwner((File)newValue);
				return;
			case DeclarationPackage.ABSTRACT_DECLARATION__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends DeclaredParameter>)newValue);
				return;
			case DeclarationPackage.ABSTRACT_DECLARATION__IS_PRIVATE:
				setIsPrivate(((Boolean)newValue).booleanValue());
				return;
			case DeclarationPackage.ABSTRACT_DECLARATION__GUARD:
				setGuard((AbstractExpression)newValue);
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
			case DeclarationPackage.ABSTRACT_DECLARATION__OWNER:
				setOwner((File)null);
				return;
			case DeclarationPackage.ABSTRACT_DECLARATION__PARAMS:
				getParams().clear();
				return;
			case DeclarationPackage.ABSTRACT_DECLARATION__IS_PRIVATE:
				setIsPrivate(IS_PRIVATE_EDEFAULT);
				return;
			case DeclarationPackage.ABSTRACT_DECLARATION__GUARD:
				setGuard((AbstractExpression)null);
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
			case DeclarationPackage.ABSTRACT_DECLARATION__OWNER:
				return owner != null;
			case DeclarationPackage.ABSTRACT_DECLARATION__PARAMS:
				return params != null && !params.isEmpty();
			case DeclarationPackage.ABSTRACT_DECLARATION__IS_PRIVATE:
				return isPrivate != IS_PRIVATE_EDEFAULT;
			case DeclarationPackage.ABSTRACT_DECLARATION__GUARD:
				return guard != null;
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
		result.append(" (isPrivate: ");
		result.append(isPrivate);
		result.append(')');
		return result.toString();
	}

} //AbstractDeclarationImpl
