/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationPackageImpl.java,v 1.4 2008/03/07 11:10:52 jkohnlein Exp $
 */
package org.eclipse.xpand3.declaration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xpand3.Xpand3Package;

import org.eclipse.xpand3.declaration.AbstractAspect;
import org.eclipse.xpand3.declaration.AbstractDeclaration;
import org.eclipse.xpand3.declaration.AbstractNamedDeclaration;
import org.eclipse.xpand3.declaration.Advice;
import org.eclipse.xpand3.declaration.Check;
import org.eclipse.xpand3.declaration.CreateExtensionStatement;
import org.eclipse.xpand3.declaration.DeclarationFactory;
import org.eclipse.xpand3.declaration.DeclarationPackage;
import org.eclipse.xpand3.declaration.Definition;
import org.eclipse.xpand3.declaration.DefinitionAspect;
import org.eclipse.xpand3.declaration.Extension;
import org.eclipse.xpand3.declaration.ExtensionAspect;
import org.eclipse.xpand3.declaration.JavaExtensionStatement;

import org.eclipse.xpand3.expression.ExpressionPackage;

import org.eclipse.xpand3.expression.impl.ExpressionPackageImpl;

import org.eclipse.xpand3.impl.Xpand3PackageImpl;

import org.eclipse.xpand3.statement.StatementPackage;

import org.eclipse.xpand3.statement.impl.StatementPackageImpl;

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
	private EClass abstractDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNamedDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createExtensionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaExtensionStatementEClass = null;

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
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#eNS_URI
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
		Xpand3PackageImpl theXpand3Package = (Xpand3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Xpand3Package.eNS_URI) instanceof Xpand3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Xpand3Package.eNS_URI) : Xpand3Package.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		StatementPackageImpl theStatementPackage = (StatementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) instanceof StatementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) : StatementPackage.eINSTANCE);

		// Create package meta-data objects
		theDeclarationPackage.createPackageContents();
		theXpand3Package.createPackageContents();
		theExpressionPackage.createPackageContents();
		theStatementPackage.createPackageContents();

		// Initialize created meta-data
		theDeclarationPackage.initializePackageContents();
		theXpand3Package.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeclarationPackage.freeze();

		return theDeclarationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDeclaration() {
		return abstractDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDeclaration_Owner() {
		return (EReference)abstractDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDeclaration_Params() {
		return (EReference)abstractDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDeclaration_IsPrivate() {
		return (EAttribute)abstractDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDeclaration_Guard() {
		return (EReference)abstractDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNamedDeclaration() {
		return abstractNamedDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNamedDeclaration_Name() {
		return (EReference)abstractNamedDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_Body() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvice() {
		return adviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Cached() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_Body() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAspect() {
		return abstractAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAspect_Pointcut() {
		return (EReference)abstractAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAspect_Params() {
		return (EReference)abstractAspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractAspect_Wildparams() {
		return (EAttribute)abstractAspectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionAspect() {
		return extensionAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionAspect_Expression() {
		return (EReference)extensionAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionAspect() {
		return definitionAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionAspect_Body() {
		return (EReference)definitionAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheck() {
		return checkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_ErrorSeverity() {
		return (EAttribute)checkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheck_Msg() {
		return (EReference)checkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheck_Constraint() {
		return (EReference)checkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_Feature() {
		return (EAttribute)checkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateExtensionStatement() {
		return createExtensionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateExtensionStatement_ToBeCreated() {
		return (EReference)createExtensionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaExtensionStatement() {
		return javaExtensionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaExtensionStatement_JavaType() {
		return (EReference)javaExtensionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaExtensionStatement_JavaMethod() {
		return (EReference)javaExtensionStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaExtensionStatement_JavaParamTypes() {
		return (EReference)javaExtensionStatementEClass.getEStructuralFeatures().get(2);
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
		abstractDeclarationEClass = createEClass(ABSTRACT_DECLARATION);
		createEReference(abstractDeclarationEClass, ABSTRACT_DECLARATION__OWNER);
		createEReference(abstractDeclarationEClass, ABSTRACT_DECLARATION__PARAMS);
		createEAttribute(abstractDeclarationEClass, ABSTRACT_DECLARATION__IS_PRIVATE);
		createEReference(abstractDeclarationEClass, ABSTRACT_DECLARATION__GUARD);

		abstractNamedDeclarationEClass = createEClass(ABSTRACT_NAMED_DECLARATION);
		createEReference(abstractNamedDeclarationEClass, ABSTRACT_NAMED_DECLARATION__NAME);

		definitionEClass = createEClass(DEFINITION);
		createEReference(definitionEClass, DEFINITION__BODY);

		adviceEClass = createEClass(ADVICE);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__CACHED);
		createEReference(extensionEClass, EXTENSION__BODY);

		abstractAspectEClass = createEClass(ABSTRACT_ASPECT);
		createEReference(abstractAspectEClass, ABSTRACT_ASPECT__POINTCUT);
		createEReference(abstractAspectEClass, ABSTRACT_ASPECT__PARAMS);
		createEAttribute(abstractAspectEClass, ABSTRACT_ASPECT__WILDPARAMS);

		extensionAspectEClass = createEClass(EXTENSION_ASPECT);
		createEReference(extensionAspectEClass, EXTENSION_ASPECT__EXPRESSION);

		definitionAspectEClass = createEClass(DEFINITION_ASPECT);
		createEReference(definitionAspectEClass, DEFINITION_ASPECT__BODY);

		checkEClass = createEClass(CHECK);
		createEAttribute(checkEClass, CHECK__ERROR_SEVERITY);
		createEReference(checkEClass, CHECK__MSG);
		createEReference(checkEClass, CHECK__CONSTRAINT);
		createEAttribute(checkEClass, CHECK__FEATURE);

		createExtensionStatementEClass = createEClass(CREATE_EXTENSION_STATEMENT);
		createEReference(createExtensionStatementEClass, CREATE_EXTENSION_STATEMENT__TO_BE_CREATED);

		javaExtensionStatementEClass = createEClass(JAVA_EXTENSION_STATEMENT);
		createEReference(javaExtensionStatementEClass, JAVA_EXTENSION_STATEMENT__JAVA_TYPE);
		createEReference(javaExtensionStatementEClass, JAVA_EXTENSION_STATEMENT__JAVA_METHOD);
		createEReference(javaExtensionStatementEClass, JAVA_EXTENSION_STATEMENT__JAVA_PARAM_TYPES);
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
		Xpand3Package theXpand3Package = (Xpand3Package)EPackage.Registry.INSTANCE.getEPackage(Xpand3Package.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		StatementPackage theStatementPackage = (StatementPackage)EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractDeclarationEClass.getESuperTypes().add(theXpand3Package.getSyntaxElement());
		abstractNamedDeclarationEClass.getESuperTypes().add(this.getAbstractDeclaration());
		definitionEClass.getESuperTypes().add(this.getAbstractNamedDeclaration());
		adviceEClass.getESuperTypes().add(this.getAbstractNamedDeclaration());
		extensionEClass.getESuperTypes().add(this.getAbstractNamedDeclaration());
		abstractAspectEClass.getESuperTypes().add(theXpand3Package.getSyntaxElement());
		extensionAspectEClass.getESuperTypes().add(this.getAbstractAspect());
		definitionAspectEClass.getESuperTypes().add(this.getAbstractAspect());
		checkEClass.getESuperTypes().add(this.getAbstractDeclaration());
		createExtensionStatementEClass.getESuperTypes().add(this.getExtension());
		javaExtensionStatementEClass.getESuperTypes().add(this.getAbstractNamedDeclaration());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractDeclarationEClass, AbstractDeclaration.class, "AbstractDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractDeclaration_Owner(), theXpand3Package.getFile(), null, "owner", null, 1, 1, AbstractDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractDeclaration_Params(), theXpand3Package.getDeclaredParameter(), null, "params", null, 0, -1, AbstractDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractDeclaration_IsPrivate(), ecorePackage.getEBoolean(), "isPrivate", null, 0, 1, AbstractDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractDeclaration_Guard(), theExpressionPackage.getAbstractExpression(), null, "guard", null, 0, 1, AbstractDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNamedDeclarationEClass, AbstractNamedDeclaration.class, "AbstractNamedDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractNamedDeclaration_Name(), theXpand3Package.getIdentifier(), null, "name", null, 0, 1, AbstractNamedDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinition_Body(), theStatementPackage.getAbstractStatement(), null, "body", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adviceEClass, Advice.class, "Advice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtension_Cached(), ecorePackage.getEBoolean(), "cached", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_Body(), theExpressionPackage.getAbstractExpression(), null, "body", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAspectEClass, AbstractAspect.class, "AbstractAspect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractAspect_Pointcut(), theXpand3Package.getIdentifier(), null, "pointcut", null, 0, 1, AbstractAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractAspect_Params(), theXpand3Package.getDeclaredParameter(), null, "params", null, 0, -1, AbstractAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractAspect_Wildparams(), ecorePackage.getEBoolean(), "wildparams", null, 0, 1, AbstractAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionAspectEClass, ExtensionAspect.class, "ExtensionAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionAspect_Expression(), theExpressionPackage.getAbstractExpression(), null, "expression", null, 0, 1, ExtensionAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionAspectEClass, DefinitionAspect.class, "DefinitionAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionAspect_Body(), theStatementPackage.getAbstractStatement(), null, "body", null, 0, -1, DefinitionAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheck_ErrorSeverity(), ecorePackage.getEBoolean(), "errorSeverity", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheck_Msg(), theExpressionPackage.getAbstractExpression(), null, "msg", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheck_Constraint(), theExpressionPackage.getAbstractExpression(), null, "constraint", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheck_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createExtensionStatementEClass, CreateExtensionStatement.class, "CreateExtensionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateExtensionStatement_ToBeCreated(), theXpand3Package.getDeclaredParameter(), null, "toBeCreated", null, 0, 1, CreateExtensionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaExtensionStatementEClass, JavaExtensionStatement.class, "JavaExtensionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaExtensionStatement_JavaType(), theXpand3Package.getIdentifier(), null, "javaType", null, 0, 1, JavaExtensionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaExtensionStatement_JavaMethod(), theXpand3Package.getIdentifier(), null, "javaMethod", null, 0, 1, JavaExtensionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaExtensionStatement_JavaParamTypes(), theXpand3Package.getIdentifier(), null, "javaParamTypes", null, 0, -1, JavaExtensionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DeclarationPackageImpl
