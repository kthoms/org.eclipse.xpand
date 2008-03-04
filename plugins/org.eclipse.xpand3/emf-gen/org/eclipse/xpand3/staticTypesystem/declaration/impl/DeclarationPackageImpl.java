/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationPackageImpl.java,v 1.1 2008/03/04 10:53:02 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.declaration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage;

import org.eclipse.xpand3.staticTypesystem.declaration.DeclarationFactory;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredParameter;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredProperty;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredStaticProperty;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredTypeParameter;

import org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationPackageImpl extends EPackageImpl implements DeclarationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredStaticPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredParameterEClass = null;

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
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeclarationPackageImpl() {
		super(eNS_URI, DeclarationFactory.eINSTANCE);
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
	public static DeclarationPackage init() {
		if (isInited) return (DeclarationPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI);

		// Obtain or create and register package
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DeclarationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StaticTypesystemPackageImpl theStaticTypesystemPackage = (StaticTypesystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaticTypesystemPackage.eNS_URI) instanceof StaticTypesystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaticTypesystemPackage.eNS_URI) : StaticTypesystemPackage.eINSTANCE);

		// Create package meta-data objects
		theDeclarationPackage.createPackageContents();
		theStaticTypesystemPackage.createPackageContents();

		// Initialize created meta-data
		theDeclarationPackage.initializePackageContents();
		theStaticTypesystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeclarationPackage.freeze();

		return theDeclarationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredType() {
		return declaredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredType_StaticProperties() {
		return (EReference)declaredTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredType_Properties() {
		return (EReference)declaredTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredType_Operations() {
		return (EReference)declaredTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredType_DeclaredTypeParameters() {
		return (EReference)declaredTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredOperation() {
		return declaredOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredOperation_DeclaredParameters() {
		return (EReference)declaredOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredOperation_DeclaringType() {
		return (EReference)declaredOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredOperation_ReturnType() {
		return (EReference)declaredOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredFunction() {
		return declaredFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredFunction_DeclaredParameters() {
		return (EReference)declaredFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredFunction_DeclaredTypeParameters() {
		return (EReference)declaredFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredFunction_ReturnType() {
		return (EReference)declaredFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredProperty() {
		return declaredPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredStaticProperty() {
		return declaredStaticPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredTypeParameter() {
		return declaredTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredParameter() {
		return declaredParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationFactory getDeclarationFactory() {
		return (DeclarationFactory)getEFactoryInstance();
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
		declaredTypeEClass = createEClass(DECLARED_TYPE);
		createEReference(declaredTypeEClass, DECLARED_TYPE__STATIC_PROPERTIES);
		createEReference(declaredTypeEClass, DECLARED_TYPE__PROPERTIES);
		createEReference(declaredTypeEClass, DECLARED_TYPE__OPERATIONS);
		createEReference(declaredTypeEClass, DECLARED_TYPE__DECLARED_TYPE_PARAMETERS);

		declaredOperationEClass = createEClass(DECLARED_OPERATION);
		createEReference(declaredOperationEClass, DECLARED_OPERATION__DECLARED_PARAMETERS);
		createEReference(declaredOperationEClass, DECLARED_OPERATION__DECLARING_TYPE);
		createEReference(declaredOperationEClass, DECLARED_OPERATION__RETURN_TYPE);

		declaredFunctionEClass = createEClass(DECLARED_FUNCTION);
		createEReference(declaredFunctionEClass, DECLARED_FUNCTION__DECLARED_PARAMETERS);
		createEReference(declaredFunctionEClass, DECLARED_FUNCTION__DECLARED_TYPE_PARAMETERS);
		createEReference(declaredFunctionEClass, DECLARED_FUNCTION__RETURN_TYPE);

		declaredPropertyEClass = createEClass(DECLARED_PROPERTY);

		declaredStaticPropertyEClass = createEClass(DECLARED_STATIC_PROPERTY);

		declaredTypeParameterEClass = createEClass(DECLARED_TYPE_PARAMETER);

		declaredParameterEClass = createEClass(DECLARED_PARAMETER);
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
		StaticTypesystemPackage theStaticTypesystemPackage = (StaticTypesystemPackage)EPackage.Registry.INSTANCE.getEPackage(StaticTypesystemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		declaredTypeEClass.getESuperTypes().add(theStaticTypesystemPackage.getAbstractNamedElement());
		declaredOperationEClass.getESuperTypes().add(theStaticTypesystemPackage.getAbstractNamedElement());
		declaredFunctionEClass.getESuperTypes().add(theStaticTypesystemPackage.getAbstractNamedElement());
		declaredPropertyEClass.getESuperTypes().add(theStaticTypesystemPackage.getAbstractNamedElement());
		declaredStaticPropertyEClass.getESuperTypes().add(theStaticTypesystemPackage.getAbstractNamedElement());
		declaredTypeParameterEClass.getESuperTypes().add(theStaticTypesystemPackage.getAbstractNamedElement());
		declaredParameterEClass.getESuperTypes().add(theStaticTypesystemPackage.getAbstractNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(declaredTypeEClass, DeclaredType.class, "DeclaredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaredType_StaticProperties(), this.getDeclaredStaticProperty(), null, "staticProperties", null, 0, -1, DeclaredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaredType_Properties(), this.getDeclaredProperty(), null, "properties", null, 0, -1, DeclaredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaredType_Operations(), this.getDeclaredOperation(), this.getDeclaredOperation_DeclaringType(), "operations", null, 0, -1, DeclaredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaredType_DeclaredTypeParameters(), this.getDeclaredTypeParameter(), null, "declaredTypeParameters", null, 0, -1, DeclaredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaredOperationEClass, DeclaredOperation.class, "DeclaredOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaredOperation_DeclaredParameters(), this.getDeclaredParameter(), null, "declaredParameters", null, 0, -1, DeclaredOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaredOperation_DeclaringType(), this.getDeclaredType(), this.getDeclaredType_Operations(), "declaringType", null, 1, 1, DeclaredOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaredOperation_ReturnType(), this.getDeclaredType(), null, "returnType", null, 0, 1, DeclaredOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaredFunctionEClass, DeclaredFunction.class, "DeclaredFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaredFunction_DeclaredParameters(), this.getDeclaredParameter(), null, "declaredParameters", null, 0, -1, DeclaredFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaredFunction_DeclaredTypeParameters(), this.getDeclaredTypeParameter(), null, "declaredTypeParameters", null, 0, -1, DeclaredFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaredFunction_ReturnType(), this.getDeclaredType(), null, "returnType", null, 0, 1, DeclaredFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaredPropertyEClass, DeclaredProperty.class, "DeclaredProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declaredStaticPropertyEClass, DeclaredStaticProperty.class, "DeclaredStaticProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declaredTypeParameterEClass, DeclaredTypeParameter.class, "DeclaredTypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declaredParameterEClass, DeclaredParameter.class, "DeclaredParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //DeclarationPackageImpl
