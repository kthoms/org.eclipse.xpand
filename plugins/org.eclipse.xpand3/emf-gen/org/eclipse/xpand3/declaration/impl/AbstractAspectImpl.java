/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractAspectImpl.java,v 1.1 2008/02/27 13:21:08 sefftinge Exp $
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
import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.declaration.AbstractAspect;
import org.eclipse.xpand3.declaration.DeclarationPackage;

import org.eclipse.xpand3.impl.SyntaxElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.AbstractAspectImpl#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.AbstractAspectImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.AbstractAspectImpl#isWildparams <em>Wildparams</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractAspectImpl extends SyntaxElementImpl implements AbstractAspect {
	/**
	 * The cached value of the '{@link #getPointcut() <em>Pointcut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcut()
	 * @generated
	 * @ordered
	 */
	protected Identifier pointcut;

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
	 * The default value of the '{@link #isWildparams() <em>Wildparams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWildparams()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WILDPARAMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWildparams() <em>Wildparams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWildparams()
	 * @generated
	 * @ordered
	 */
	protected boolean wildparams = WILDPARAMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractAspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.ABSTRACT_ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPointcut() {
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointcut(Identifier newPointcut, NotificationChain msgs) {
		Identifier oldPointcut = pointcut;
		pointcut = newPointcut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.ABSTRACT_ASPECT__POINTCUT, oldPointcut, newPointcut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointcut(Identifier newPointcut) {
		if (newPointcut != pointcut) {
			NotificationChain msgs = null;
			if (pointcut != null)
				msgs = ((InternalEObject)pointcut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.ABSTRACT_ASPECT__POINTCUT, null, msgs);
			if (newPointcut != null)
				msgs = ((InternalEObject)newPointcut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.ABSTRACT_ASPECT__POINTCUT, null, msgs);
			msgs = basicSetPointcut(newPointcut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.ABSTRACT_ASPECT__POINTCUT, newPointcut, newPointcut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclaredParameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<DeclaredParameter>(DeclaredParameter.class, this, DeclarationPackage.ABSTRACT_ASPECT__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWildparams() {
		return wildparams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWildparams(boolean newWildparams) {
		boolean oldWildparams = wildparams;
		wildparams = newWildparams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.ABSTRACT_ASPECT__WILDPARAMS, oldWildparams, wildparams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.ABSTRACT_ASPECT__POINTCUT:
				return basicSetPointcut(null, msgs);
			case DeclarationPackage.ABSTRACT_ASPECT__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
			case DeclarationPackage.ABSTRACT_ASPECT__POINTCUT:
				return getPointcut();
			case DeclarationPackage.ABSTRACT_ASPECT__PARAMS:
				return getParams();
			case DeclarationPackage.ABSTRACT_ASPECT__WILDPARAMS:
				return isWildparams() ? Boolean.TRUE : Boolean.FALSE;
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
			case DeclarationPackage.ABSTRACT_ASPECT__POINTCUT:
				setPointcut((Identifier)newValue);
				return;
			case DeclarationPackage.ABSTRACT_ASPECT__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends DeclaredParameter>)newValue);
				return;
			case DeclarationPackage.ABSTRACT_ASPECT__WILDPARAMS:
				setWildparams(((Boolean)newValue).booleanValue());
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
			case DeclarationPackage.ABSTRACT_ASPECT__POINTCUT:
				setPointcut((Identifier)null);
				return;
			case DeclarationPackage.ABSTRACT_ASPECT__PARAMS:
				getParams().clear();
				return;
			case DeclarationPackage.ABSTRACT_ASPECT__WILDPARAMS:
				setWildparams(WILDPARAMS_EDEFAULT);
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
			case DeclarationPackage.ABSTRACT_ASPECT__POINTCUT:
				return pointcut != null;
			case DeclarationPackage.ABSTRACT_ASPECT__PARAMS:
				return params != null && !params.isEmpty();
			case DeclarationPackage.ABSTRACT_ASPECT__WILDPARAMS:
				return wildparams != WILDPARAMS_EDEFAULT;
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
		result.append(" (wildparams: ");
		result.append(wildparams);
		result.append(')');
		return result.toString();
	}

} //AbstractAspectImpl
