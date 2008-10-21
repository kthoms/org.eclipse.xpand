/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestPackageImpl.java,v 1.1 2008/10/21 07:32:52 jkohnlein Exp $
 */
package org.eclipse.xtend.typesystem.emf.check.model.test.impl;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtend.typesystem.emf.check.model.test.MyEnum;
import org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass;
import org.eclipse.xtend.typesystem.emf.check.model.test.TestFactory;
import org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage;
import org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackagePackage;
import org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.impl.SubpackagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPackageImpl extends EPackageImpl implements TestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myMetaClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum myEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackageImpl() {
		super(eNS_URI, TestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackage init() {
		if (isInited) return (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);

		// Obtain or create and register package
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TestPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SubpackagePackageImpl theSubpackagePackage = (SubpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SubpackagePackage.eNS_URI) instanceof SubpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SubpackagePackage.eNS_URI) : SubpackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackage.createPackageContents();
		theSubpackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackage.initializePackageContents();
		theSubpackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackage.freeze();

		return theTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyMetaClass() {
		return myMetaClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMyMetaClass_Name() {
		return (EAttribute)myMetaClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyMetaClass_Children() {
		return (EReference)myMetaClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyMetaClass_SubPackageRef() {
		return (EReference)myMetaClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMyMetaClass_EnumAttr() {
		return (EAttribute)myMetaClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMyEnum() {
		return myEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFactory getTestFactory() {
		return (TestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		myMetaClassEClass = createEClass(MY_META_CLASS);
		createEAttribute(myMetaClassEClass, MY_META_CLASS__NAME);
		createEReference(myMetaClassEClass, MY_META_CLASS__CHILDREN);
		createEReference(myMetaClassEClass, MY_META_CLASS__SUB_PACKAGE_REF);
		createEAttribute(myMetaClassEClass, MY_META_CLASS__ENUM_ATTR);

		// Create enums
		myEnumEEnum = createEEnum(MY_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SubpackagePackage theSubpackagePackage = (SubpackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubpackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubpackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(myMetaClassEClass, MyMetaClass.class, "MyMetaClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMyMetaClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, MyMetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMyMetaClass_Children(), this.getMyMetaClass(), null, "children", null, 0, -1, MyMetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMyMetaClass_SubPackageRef(), theSubpackagePackage.getSubpackageMetaClass(), null, "subPackageRef", null, 0, 1, MyMetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMyMetaClass_EnumAttr(), this.getMyEnum(), "enumAttr", null, 0, 1, MyMetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(myEnumEEnum, MyEnum.class, "MyEnum");
		addEEnumLiteral(myEnumEEnum, MyEnum.X);
		addEEnumLiteral(myEnumEEnum, MyEnum.Y);

		// Create resource
		createResource(eNS_URI);
	}

} //TestPackageImpl
