/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubpackagePackage.java,v 1.1 2008/10/21 07:32:51 jkohnlein Exp $
 */
package org.eclipse.xtend.typesystem.emf.check.model.test.subpackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubpackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "subpackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://oaw.org/test/subpackage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "subpackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubpackagePackage eINSTANCE = org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.impl.SubpackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.impl.SubpackageMetaClassImpl <em>Meta Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.impl.SubpackageMetaClassImpl
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.impl.SubpackagePackageImpl#getSubpackageMetaClass()
	 * @generated
	 */
	int SUBPACKAGE_META_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPACKAGE_META_CLASS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Meta Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPACKAGE_META_CLASS_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackageMetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Class</em>'.
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackageMetaClass
	 * @generated
	 */
	EClass getSubpackageMetaClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackageMetaClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackageMetaClass#getName()
	 * @see #getSubpackageMetaClass()
	 * @generated
	 */
	EAttribute getSubpackageMetaClass_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubpackageFactory getSubpackageFactory();

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
		 * The meta object literal for the '{@link org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.impl.SubpackageMetaClassImpl <em>Meta Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.impl.SubpackageMetaClassImpl
		 * @see org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.impl.SubpackagePackageImpl#getSubpackageMetaClass()
		 * @generated
		 */
		EClass SUBPACKAGE_META_CLASS = eINSTANCE.getSubpackageMetaClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBPACKAGE_META_CLASS__NAME = eINSTANCE.getSubpackageMetaClass_Name();

	}

} //SubpackagePackage
