/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaExtensionStatementImpl.java,v 1.1 2008/02/27 13:21:08 sefftinge Exp $
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

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.declaration.DeclarationPackage;
import org.eclipse.xpand3.declaration.JavaExtensionStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Extension Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.JavaExtensionStatementImpl#getJavaType <em>Java Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.JavaExtensionStatementImpl#getJavaMethod <em>Java Method</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.impl.JavaExtensionStatementImpl#getJavaParamTypes <em>Java Param Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaExtensionStatementImpl extends AbstractNamedDeclarationImpl implements JavaExtensionStatement {
	/**
	 * The cached value of the '{@link #getJavaType() <em>Java Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaType()
	 * @generated
	 * @ordered
	 */
	protected Identifier javaType;

	/**
	 * The cached value of the '{@link #getJavaMethod() <em>Java Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaMethod()
	 * @generated
	 * @ordered
	 */
	protected Identifier javaMethod;

	/**
	 * The cached value of the '{@link #getJavaParamTypes() <em>Java Param Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaParamTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> javaParamTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaExtensionStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.JAVA_EXTENSION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getJavaType() {
		return javaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaType(Identifier newJavaType, NotificationChain msgs) {
		Identifier oldJavaType = javaType;
		javaType = newJavaType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_TYPE, oldJavaType, newJavaType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaType(Identifier newJavaType) {
		if (newJavaType != javaType) {
			NotificationChain msgs = null;
			if (javaType != null)
				msgs = ((InternalEObject)javaType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_TYPE, null, msgs);
			if (newJavaType != null)
				msgs = ((InternalEObject)newJavaType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_TYPE, null, msgs);
			msgs = basicSetJavaType(newJavaType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_TYPE, newJavaType, newJavaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getJavaMethod() {
		return javaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaMethod(Identifier newJavaMethod, NotificationChain msgs) {
		Identifier oldJavaMethod = javaMethod;
		javaMethod = newJavaMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_METHOD, oldJavaMethod, newJavaMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaMethod(Identifier newJavaMethod) {
		if (newJavaMethod != javaMethod) {
			NotificationChain msgs = null;
			if (javaMethod != null)
				msgs = ((InternalEObject)javaMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_METHOD, null, msgs);
			if (newJavaMethod != null)
				msgs = ((InternalEObject)newJavaMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_METHOD, null, msgs);
			msgs = basicSetJavaMethod(newJavaMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_METHOD, newJavaMethod, newJavaMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getJavaParamTypes() {
		if (javaParamTypes == null) {
			javaParamTypes = new EObjectContainmentEList<Identifier>(Identifier.class, this, DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_PARAM_TYPES);
		}
		return javaParamTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_TYPE:
				return basicSetJavaType(null, msgs);
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_METHOD:
				return basicSetJavaMethod(null, msgs);
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_PARAM_TYPES:
				return ((InternalEList<?>)getJavaParamTypes()).basicRemove(otherEnd, msgs);
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
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_TYPE:
				return getJavaType();
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_METHOD:
				return getJavaMethod();
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_PARAM_TYPES:
				return getJavaParamTypes();
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
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_TYPE:
				setJavaType((Identifier)newValue);
				return;
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_METHOD:
				setJavaMethod((Identifier)newValue);
				return;
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_PARAM_TYPES:
				getJavaParamTypes().clear();
				getJavaParamTypes().addAll((Collection<? extends Identifier>)newValue);
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
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_TYPE:
				setJavaType((Identifier)null);
				return;
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_METHOD:
				setJavaMethod((Identifier)null);
				return;
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_PARAM_TYPES:
				getJavaParamTypes().clear();
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
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_TYPE:
				return javaType != null;
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_METHOD:
				return javaMethod != null;
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT__JAVA_PARAM_TYPES:
				return javaParamTypes != null && !javaParamTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JavaExtensionStatementImpl
