/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.typesystem.emf.check.model.test;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackageMetaClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Meta Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getSubPackageRef <em>Sub Package Ref</em>}</li>
 *   <li>{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getEnumAttr <em>Enum Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage#getMyMetaClass()
 * @model
 * @generated
 */
public interface MyMetaClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage#getMyMetaClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage#getMyMetaClass_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<MyMetaClass> getChildren();

	/**
	 * Returns the value of the '<em><b>Sub Package Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Package Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Package Ref</em>' containment reference.
	 * @see #setSubPackageRef(SubpackageMetaClass)
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage#getMyMetaClass_SubPackageRef()
	 * @model containment="true"
	 * @generated
	 */
	SubpackageMetaClass getSubPackageRef();

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getSubPackageRef <em>Sub Package Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Package Ref</em>' containment reference.
	 * @see #getSubPackageRef()
	 * @generated
	 */
	void setSubPackageRef(SubpackageMetaClass value);

	/**
	 * Returns the value of the '<em><b>Enum Attr</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Attr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Attr</em>' attribute.
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum
	 * @see #setEnumAttr(MyEnum)
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage#getMyMetaClass_EnumAttr()
	 * @model
	 * @generated
	 */
	MyEnum getEnumAttr();

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getEnumAttr <em>Enum Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Attr</em>' attribute.
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum
	 * @see #getEnumAttr()
	 * @generated
	 */
	void setEnumAttr(MyEnum value);

} // MyMetaClass
