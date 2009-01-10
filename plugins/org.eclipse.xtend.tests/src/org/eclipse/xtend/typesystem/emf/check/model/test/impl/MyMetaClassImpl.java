/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.typesystem.emf.check.model.test.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum;
import org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass;
import org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage;
import org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackageMetaClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Meta Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtend.typesystem.emf.check.model.test.impl.MyMetaClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.typesystem.emf.check.model.test.impl.MyMetaClassImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.xtend.typesystem.emf.check.model.test.impl.MyMetaClassImpl#getSubPackageRef <em>Sub Package Ref</em>}</li>
 *   <li>{@link org.eclipse.xtend.typesystem.emf.check.model.test.impl.MyMetaClassImpl#getEnumAttr <em>Enum Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyMetaClassImpl extends EObjectImpl implements MyMetaClass {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<MyMetaClass> children;

	/**
	 * The cached value of the '{@link #getSubPackageRef() <em>Sub Package Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackageRef()
	 * @generated
	 * @ordered
	 */
	protected SubpackageMetaClass subPackageRef;

	/**
	 * The default value of the '{@link #getEnumAttr() <em>Enum Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumAttr()
	 * @generated
	 * @ordered
	 */
	protected static final MyEnum ENUM_ATTR_EDEFAULT = MyEnum.X;

	/**
	 * The cached value of the '{@link #getEnumAttr() <em>Enum Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumAttr()
	 * @generated
	 * @ordered
	 */
	protected MyEnum enumAttr = ENUM_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyMetaClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.MY_META_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.MY_META_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MyMetaClass> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<MyMetaClass>(MyMetaClass.class, this, TestPackage.MY_META_CLASS__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubpackageMetaClass getSubPackageRef() {
		return subPackageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubPackageRef(SubpackageMetaClass newSubPackageRef, NotificationChain msgs) {
		SubpackageMetaClass oldSubPackageRef = subPackageRef;
		subPackageRef = newSubPackageRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.MY_META_CLASS__SUB_PACKAGE_REF, oldSubPackageRef, newSubPackageRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPackageRef(SubpackageMetaClass newSubPackageRef) {
		if (newSubPackageRef != subPackageRef) {
			NotificationChain msgs = null;
			if (subPackageRef != null)
				msgs = ((InternalEObject)subPackageRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.MY_META_CLASS__SUB_PACKAGE_REF, null, msgs);
			if (newSubPackageRef != null)
				msgs = ((InternalEObject)newSubPackageRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.MY_META_CLASS__SUB_PACKAGE_REF, null, msgs);
			msgs = basicSetSubPackageRef(newSubPackageRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.MY_META_CLASS__SUB_PACKAGE_REF, newSubPackageRef, newSubPackageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyEnum getEnumAttr() {
		return enumAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumAttr(MyEnum newEnumAttr) {
		MyEnum oldEnumAttr = enumAttr;
		enumAttr = newEnumAttr == null ? ENUM_ATTR_EDEFAULT : newEnumAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.MY_META_CLASS__ENUM_ATTR, oldEnumAttr, enumAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.MY_META_CLASS__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case TestPackage.MY_META_CLASS__SUB_PACKAGE_REF:
				return basicSetSubPackageRef(null, msgs);
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
			case TestPackage.MY_META_CLASS__NAME:
				return getName();
			case TestPackage.MY_META_CLASS__CHILDREN:
				return getChildren();
			case TestPackage.MY_META_CLASS__SUB_PACKAGE_REF:
				return getSubPackageRef();
			case TestPackage.MY_META_CLASS__ENUM_ATTR:
				return getEnumAttr();
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
			case TestPackage.MY_META_CLASS__NAME:
				setName((String)newValue);
				return;
			case TestPackage.MY_META_CLASS__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends MyMetaClass>)newValue);
				return;
			case TestPackage.MY_META_CLASS__SUB_PACKAGE_REF:
				setSubPackageRef((SubpackageMetaClass)newValue);
				return;
			case TestPackage.MY_META_CLASS__ENUM_ATTR:
				setEnumAttr((MyEnum)newValue);
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
			case TestPackage.MY_META_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestPackage.MY_META_CLASS__CHILDREN:
				getChildren().clear();
				return;
			case TestPackage.MY_META_CLASS__SUB_PACKAGE_REF:
				setSubPackageRef((SubpackageMetaClass)null);
				return;
			case TestPackage.MY_META_CLASS__ENUM_ATTR:
				setEnumAttr(ENUM_ATTR_EDEFAULT);
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
			case TestPackage.MY_META_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestPackage.MY_META_CLASS__CHILDREN:
				return children != null && !children.isEmpty();
			case TestPackage.MY_META_CLASS__SUB_PACKAGE_REF:
				return subPackageRef != null;
			case TestPackage.MY_META_CLASS__ENUM_ATTR:
				return enumAttr != ENUM_ATTR_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", enumAttr: ");
		result.append(enumAttr);
		result.append(')');
		return result.toString();
	}

} //MyMetaClassImpl
