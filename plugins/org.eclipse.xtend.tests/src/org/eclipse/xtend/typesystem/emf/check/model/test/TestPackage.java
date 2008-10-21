/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestPackage.java,v 1.1 2008/10/21 07:32:51 jkohnlein Exp $
 */
package org.eclipse.xtend.typesystem.emf.check.model.test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.typesystem.emf.check.model.test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.itemis.de/emf.oaw.check.test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackage eINSTANCE = org.eclipse.xtend.typesystem.emf.check.model.test.impl.TestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.typesystem.emf.check.model.test.impl.MyMetaClassImpl <em>My Meta Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.impl.MyMetaClassImpl
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.impl.TestPackageImpl#getMyMetaClass()
	 * @generated
	 */
	int MY_META_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_META_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_META_CLASS__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Sub Package Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_META_CLASS__SUB_PACKAGE_REF = 2;

	/**
	 * The feature id for the '<em><b>Enum Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_META_CLASS__ENUM_ATTR = 3;

	/**
	 * The number of structural features of the '<em>My Meta Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_META_CLASS_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum <em>My Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.impl.TestPackageImpl#getMyEnum()
	 * @generated
	 */
	int MY_ENUM = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass <em>My Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Meta Class</em>'.
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass
	 * @generated
	 */
	EClass getMyMetaClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getName()
	 * @see #getMyMetaClass()
	 * @generated
	 */
	EAttribute getMyMetaClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getChildren()
	 * @see #getMyMetaClass()
	 * @generated
	 */
	EReference getMyMetaClass_Children();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getSubPackageRef <em>Sub Package Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Package Ref</em>'.
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getSubPackageRef()
	 * @see #getMyMetaClass()
	 * @generated
	 */
	EReference getMyMetaClass_SubPackageRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getEnumAttr <em>Enum Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Attr</em>'.
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass#getEnumAttr()
	 * @see #getMyMetaClass()
	 * @generated
	 */
	EAttribute getMyMetaClass_EnumAttr();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum <em>My Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>My Enum</em>'.
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum
	 * @generated
	 */
	EEnum getMyEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.typesystem.emf.check.model.test.impl.MyMetaClassImpl <em>My Meta Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.typesystem.emf.check.model.test.impl.MyMetaClassImpl
		 * @see org.eclipse.xtend.typesystem.emf.check.model.test.impl.TestPackageImpl#getMyMetaClass()
		 * @generated
		 */
		EClass MY_META_CLASS = eINSTANCE.getMyMetaClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_META_CLASS__NAME = eINSTANCE.getMyMetaClass_Name();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_META_CLASS__CHILDREN = eINSTANCE.getMyMetaClass_Children();

		/**
		 * The meta object literal for the '<em><b>Sub Package Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_META_CLASS__SUB_PACKAGE_REF = eINSTANCE.getMyMetaClass_SubPackageRef();

		/**
		 * The meta object literal for the '<em><b>Enum Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_META_CLASS__ENUM_ATTR = eINSTANCE.getMyMetaClass_EnumAttr();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum <em>My Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum
		 * @see org.eclipse.xtend.typesystem.emf.check.model.test.impl.TestPackageImpl#getMyEnum()
		 * @generated
		 */
		EEnum MY_ENUM = eINSTANCE.getMyEnum();

	}

} //TestPackage
