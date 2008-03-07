/**
 * <copyright>
 * </copyright>
 *
 * $Id: StatementPackageImpl.java,v 1.2 2008/03/07 11:10:34 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xpand3.Xpand3Package;

import org.eclipse.xpand3.declaration.DeclarationPackage;

import org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl;

import org.eclipse.xpand3.expression.ExpressionPackage;

import org.eclipse.xpand3.expression.impl.ExpressionPackageImpl;

import org.eclipse.xpand3.impl.Xpand3PackageImpl;

import org.eclipse.xpand3.statement.AbstractStatement;
import org.eclipse.xpand3.statement.AbstractStatementWithBody;
import org.eclipse.xpand3.statement.ErrorStatement;
import org.eclipse.xpand3.statement.ExpandStatement;
import org.eclipse.xpand3.statement.ExpressionStatement;
import org.eclipse.xpand3.statement.FileStatement;
import org.eclipse.xpand3.statement.ForEachStatement;
import org.eclipse.xpand3.statement.IfStatement;
import org.eclipse.xpand3.statement.LetStatement;
import org.eclipse.xpand3.statement.ProtectStatement;
import org.eclipse.xpand3.statement.StatementFactory;
import org.eclipse.xpand3.statement.StatementPackage;
import org.eclipse.xpand3.statement.TextStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementPackageImpl extends EPackageImpl implements StatementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expandStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStatementWithBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEachStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textStatementEClass = null;

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
	 * @see org.eclipse.xpand3.statement.StatementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatementPackageImpl() {
		super(eNS_URI, StatementFactory.eINSTANCE);
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
	public static StatementPackage init() {
		if (isInited) return (StatementPackage)EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI);

		// Obtain or create and register package
		StatementPackageImpl theStatementPackage = (StatementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof StatementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new StatementPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Xpand3PackageImpl theXpand3Package = (Xpand3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Xpand3Package.eNS_URI) instanceof Xpand3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Xpand3Package.eNS_URI) : Xpand3Package.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) : DeclarationPackage.eINSTANCE);

		// Create package meta-data objects
		theStatementPackage.createPackageContents();
		theXpand3Package.createPackageContents();
		theExpressionPackage.createPackageContents();
		theDeclarationPackage.createPackageContents();

		// Initialize created meta-data
		theStatementPackage.initializePackageContents();
		theXpand3Package.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theDeclarationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatementPackage.freeze();

		return theStatementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStatement() {
		return abstractStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpandStatement() {
		return expandStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpandStatement_Foreach() {
		return (EAttribute)expandStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpandStatement_Parameters() {
		return (EReference)expandStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpandStatement_Separator() {
		return (EReference)expandStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpandStatement_Target() {
		return (EReference)expandStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpandStatement_Definition() {
		return (EReference)expandStatementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionStatement() {
		return expressionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionStatement_Expression() {
		return (EReference)expressionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorStatement() {
		return errorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorStatement_Message() {
		return (EReference)errorStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStatementWithBody() {
		return abstractStatementWithBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatementWithBody_Body() {
		return (EReference)abstractStatementWithBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileStatement() {
		return fileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileStatement_FileNameExpression() {
		return (EReference)fileStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileStatement_OutletNameIdentifier() {
		return (EReference)fileStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForEachStatement() {
		return forEachStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachStatement_Target() {
		return (EReference)forEachStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachStatement_Seperator() {
		return (EReference)forEachStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachStatement_Variable() {
		return (EReference)forEachStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachStatement_IteratorName() {
		return (EReference)forEachStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Condition() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_UpperIf() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ElseIf() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetStatement() {
		return letStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetStatement_VarName() {
		return (EReference)letStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetStatement_VarValue() {
		return (EReference)letStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtectStatement() {
		return protectStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectStatement_CommentStart() {
		return (EReference)protectStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectStatement_CommentEnd() {
		return (EReference)protectStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectStatement_Id() {
		return (EReference)protectStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtectStatement_Disable() {
		return (EAttribute)protectStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextStatement() {
		return textStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStatement_Value() {
		return (EAttribute)textStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStatement_DeleteLine() {
		return (EAttribute)textStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementFactory getStatementFactory() {
		return (StatementFactory)getEFactoryInstance();
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
		abstractStatementEClass = createEClass(ABSTRACT_STATEMENT);

		expandStatementEClass = createEClass(EXPAND_STATEMENT);
		createEAttribute(expandStatementEClass, EXPAND_STATEMENT__FOREACH);
		createEReference(expandStatementEClass, EXPAND_STATEMENT__PARAMETERS);
		createEReference(expandStatementEClass, EXPAND_STATEMENT__SEPARATOR);
		createEReference(expandStatementEClass, EXPAND_STATEMENT__TARGET);
		createEReference(expandStatementEClass, EXPAND_STATEMENT__DEFINITION);

		expressionStatementEClass = createEClass(EXPRESSION_STATEMENT);
		createEReference(expressionStatementEClass, EXPRESSION_STATEMENT__EXPRESSION);

		errorStatementEClass = createEClass(ERROR_STATEMENT);
		createEReference(errorStatementEClass, ERROR_STATEMENT__MESSAGE);

		abstractStatementWithBodyEClass = createEClass(ABSTRACT_STATEMENT_WITH_BODY);
		createEReference(abstractStatementWithBodyEClass, ABSTRACT_STATEMENT_WITH_BODY__BODY);

		fileStatementEClass = createEClass(FILE_STATEMENT);
		createEReference(fileStatementEClass, FILE_STATEMENT__FILE_NAME_EXPRESSION);
		createEReference(fileStatementEClass, FILE_STATEMENT__OUTLET_NAME_IDENTIFIER);

		forEachStatementEClass = createEClass(FOR_EACH_STATEMENT);
		createEReference(forEachStatementEClass, FOR_EACH_STATEMENT__TARGET);
		createEReference(forEachStatementEClass, FOR_EACH_STATEMENT__SEPERATOR);
		createEReference(forEachStatementEClass, FOR_EACH_STATEMENT__VARIABLE);
		createEReference(forEachStatementEClass, FOR_EACH_STATEMENT__ITERATOR_NAME);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__CONDITION);
		createEReference(ifStatementEClass, IF_STATEMENT__UPPER_IF);
		createEReference(ifStatementEClass, IF_STATEMENT__ELSE_IF);

		letStatementEClass = createEClass(LET_STATEMENT);
		createEReference(letStatementEClass, LET_STATEMENT__VAR_NAME);
		createEReference(letStatementEClass, LET_STATEMENT__VAR_VALUE);

		protectStatementEClass = createEClass(PROTECT_STATEMENT);
		createEReference(protectStatementEClass, PROTECT_STATEMENT__COMMENT_START);
		createEReference(protectStatementEClass, PROTECT_STATEMENT__COMMENT_END);
		createEReference(protectStatementEClass, PROTECT_STATEMENT__ID);
		createEAttribute(protectStatementEClass, PROTECT_STATEMENT__DISABLE);

		textStatementEClass = createEClass(TEXT_STATEMENT);
		createEAttribute(textStatementEClass, TEXT_STATEMENT__VALUE);
		createEAttribute(textStatementEClass, TEXT_STATEMENT__DELETE_LINE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractStatementEClass.getESuperTypes().add(theXpand3Package.getSyntaxElement());
		expandStatementEClass.getESuperTypes().add(this.getAbstractStatement());
		expressionStatementEClass.getESuperTypes().add(this.getAbstractStatement());
		errorStatementEClass.getESuperTypes().add(this.getAbstractStatement());
		abstractStatementWithBodyEClass.getESuperTypes().add(this.getAbstractStatement());
		fileStatementEClass.getESuperTypes().add(this.getAbstractStatementWithBody());
		forEachStatementEClass.getESuperTypes().add(this.getAbstractStatementWithBody());
		ifStatementEClass.getESuperTypes().add(this.getAbstractStatementWithBody());
		letStatementEClass.getESuperTypes().add(this.getAbstractStatementWithBody());
		protectStatementEClass.getESuperTypes().add(this.getAbstractStatementWithBody());
		textStatementEClass.getESuperTypes().add(this.getAbstractStatement());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractStatementEClass, AbstractStatement.class, "AbstractStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expandStatementEClass, ExpandStatement.class, "ExpandStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpandStatement_Foreach(), ecorePackage.getEBoolean(), "foreach", null, 0, 1, ExpandStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpandStatement_Parameters(), theExpressionPackage.getAbstractExpression(), null, "parameters", null, 0, -1, ExpandStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpandStatement_Separator(), theExpressionPackage.getAbstractExpression(), null, "separator", null, 0, 1, ExpandStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpandStatement_Target(), theExpressionPackage.getAbstractExpression(), null, "target", null, 0, 1, ExpandStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpandStatement_Definition(), theXpand3Package.getIdentifier(), null, "definition", null, 1, 1, ExpandStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionStatementEClass, ExpressionStatement.class, "ExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionStatement_Expression(), theExpressionPackage.getAbstractExpression(), null, "expression", null, 1, 1, ExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorStatementEClass, ErrorStatement.class, "ErrorStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorStatement_Message(), theExpressionPackage.getAbstractExpression(), null, "message", null, 1, 1, ErrorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStatementWithBodyEClass, AbstractStatementWithBody.class, "AbstractStatementWithBody", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractStatementWithBody_Body(), this.getAbstractStatement(), null, "body", null, 1, -1, AbstractStatementWithBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileStatementEClass, FileStatement.class, "FileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileStatement_FileNameExpression(), theExpressionPackage.getAbstractExpression(), null, "fileNameExpression", null, 0, 1, FileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileStatement_OutletNameIdentifier(), theXpand3Package.getIdentifier(), null, "outletNameIdentifier", null, 0, 1, FileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEachStatementEClass, ForEachStatement.class, "ForEachStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForEachStatement_Target(), theExpressionPackage.getAbstractExpression(), null, "target", null, 0, 1, ForEachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEachStatement_Seperator(), theExpressionPackage.getAbstractExpression(), null, "seperator", null, 0, 1, ForEachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEachStatement_Variable(), theXpand3Package.getIdentifier(), null, "variable", null, 0, 1, ForEachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEachStatement_IteratorName(), theXpand3Package.getIdentifier(), null, "iteratorName", null, 0, 1, ForEachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_Condition(), theExpressionPackage.getAbstractExpression(), null, "condition", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_UpperIf(), this.getIfStatement(), null, "upperIf", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_ElseIf(), this.getIfStatement(), null, "elseIf", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(letStatementEClass, LetStatement.class, "LetStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetStatement_VarName(), theXpand3Package.getIdentifier(), null, "varName", null, 0, 1, LetStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetStatement_VarValue(), theExpressionPackage.getAbstractExpression(), null, "varValue", null, 0, 1, LetStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protectStatementEClass, ProtectStatement.class, "ProtectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtectStatement_CommentStart(), theExpressionPackage.getAbstractExpression(), null, "commentStart", null, 0, 1, ProtectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectStatement_CommentEnd(), theExpressionPackage.getAbstractExpression(), null, "commentEnd", null, 0, 1, ProtectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectStatement_Id(), theExpressionPackage.getAbstractExpression(), null, "id", null, 0, 1, ProtectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectStatement_Disable(), ecorePackage.getEBoolean(), "disable", null, 0, 1, ProtectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textStatementEClass, TextStatement.class, "TextStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextStatement_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStatement_DeleteLine(), ecorePackage.getEBoolean(), "deleteLine", null, 0, 1, TextStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StatementPackageImpl
