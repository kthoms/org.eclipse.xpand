/**
 * <copyright>
 * </copyright>
 *
 * $Id: NodePackageImpl.java,v 1.1 2008/02/27 13:21:10 sefftinge Exp $
 */
package org.eclipse.xpand3.node.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xpand3.node.CompositeNode;
import org.eclipse.xpand3.node.LeafNode;
import org.eclipse.xpand3.node.LexedToken;
import org.eclipse.xpand3.node.Node;
import org.eclipse.xpand3.node.NodeFactory;
import org.eclipse.xpand3.node.NodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodePackageImpl extends EPackageImpl implements NodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexedTokenEClass = null;

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
	 * @see org.eclipse.xpand3.node.NodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NodePackageImpl() {
		super(eNS_URI, NodeFactory.eINSTANCE);
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
	public static NodePackage init() {
		if (isInited) return (NodePackage)EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI);

		// Obtain or create and register package
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new NodePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNodePackage.createPackageContents();

		// Initialize created meta-data
		theNodePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNodePackage.freeze();

		return theNodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeNode() {
		return compositeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeNode_Children() {
		return (EReference)compositeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeNode_Rule() {
		return (EAttribute)compositeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Alias() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeafNode() {
		return leafNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafNode_Token() {
		return (EReference)leafNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLexedToken() {
		return lexedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLexedToken_Hidden() {
		return (EAttribute)lexedTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLexedToken_Start() {
		return (EAttribute)lexedTokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLexedToken_End() {
		return (EAttribute)lexedTokenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLexedToken_Line() {
		return (EAttribute)lexedTokenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLexedToken_Text() {
		return (EAttribute)lexedTokenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLexedToken_TokenType() {
		return (EAttribute)lexedTokenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFactory getNodeFactory() {
		return (NodeFactory)getEFactoryInstance();
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
		compositeNodeEClass = createEClass(COMPOSITE_NODE);
		createEReference(compositeNodeEClass, COMPOSITE_NODE__CHILDREN);
		createEAttribute(compositeNodeEClass, COMPOSITE_NODE__RULE);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__ALIAS);

		leafNodeEClass = createEClass(LEAF_NODE);
		createEReference(leafNodeEClass, LEAF_NODE__TOKEN);

		lexedTokenEClass = createEClass(LEXED_TOKEN);
		createEAttribute(lexedTokenEClass, LEXED_TOKEN__HIDDEN);
		createEAttribute(lexedTokenEClass, LEXED_TOKEN__START);
		createEAttribute(lexedTokenEClass, LEXED_TOKEN__END);
		createEAttribute(lexedTokenEClass, LEXED_TOKEN__LINE);
		createEAttribute(lexedTokenEClass, LEXED_TOKEN__TEXT);
		createEAttribute(lexedTokenEClass, LEXED_TOKEN__TOKEN_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeNodeEClass.getESuperTypes().add(this.getNode());
		leafNodeEClass.getESuperTypes().add(this.getNode());

		// Initialize classes and features; add operations and parameters
		initEClass(compositeNodeEClass, CompositeNode.class, "CompositeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeNode_Children(), this.getNode(), null, "children", null, 0, -1, CompositeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeNode_Rule(), ecorePackage.getEString(), "rule", null, 0, 1, CompositeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(compositeNodeEClass, ecorePackage.getEInt(), "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compositeNodeEClass, ecorePackage.getEInt(), "end", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compositeNodeEClass, ecorePackage.getEInt(), "line", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compositeNodeEClass, ecorePackage.getEString(), "text", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(nodeEClass, ecorePackage.getEInt(), "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(nodeEClass, ecorePackage.getEInt(), "end", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(nodeEClass, ecorePackage.getEInt(), "line", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(nodeEClass, ecorePackage.getEString(), "text", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(leafNodeEClass, LeafNode.class, "LeafNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeafNode_Token(), this.getLexedToken(), null, "token", null, 0, 1, LeafNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(leafNodeEClass, ecorePackage.getEInt(), "line", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(leafNodeEClass, ecorePackage.getEString(), "text", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(leafNodeEClass, ecorePackage.getEInt(), "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(leafNodeEClass, ecorePackage.getEInt(), "end", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lexedTokenEClass, LexedToken.class, "LexedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLexedToken_Hidden(), ecorePackage.getEBoolean(), "hidden", null, 0, 1, LexedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLexedToken_Start(), ecorePackage.getEInt(), "start", null, 0, 1, LexedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLexedToken_End(), ecorePackage.getEInt(), "end", null, 0, 1, LexedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLexedToken_Line(), ecorePackage.getEInt(), "line", null, 0, 1, LexedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLexedToken_Text(), ecorePackage.getEString(), "text", null, 0, 1, LexedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLexedToken_TokenType(), ecorePackage.getEString(), "tokenType", null, 0, 1, LexedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //NodePackageImpl
