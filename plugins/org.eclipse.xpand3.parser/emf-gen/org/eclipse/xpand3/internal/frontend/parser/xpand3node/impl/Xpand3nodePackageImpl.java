/**
 * <copyright>
 * </copyright>
 *
 * $Id: Xpand3nodePackageImpl.java,v 1.1 2008/03/17 14:39:06 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.tmf.common.node.NodePackage;

import org.eclipse.xpand3.internal.frontend.parser.xpand3node.AdditiveExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.AndExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.AroundNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.BooleanLiteralNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.CasePartNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.CastedExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ChainExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.CheckNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.CollectionExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.CollectionTypeNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ConstructorCallNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.DeclaredParameterListNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.DeclaredParameterNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.DefinitionAroundNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.DefinitionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ElseIfStatementNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ElseStatementNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ErrorStatementNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ExpandStatementNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ExpressionStmtNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ExtensionImportNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ExtensionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.FeatureCallNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.FileNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.FileStatementNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ForeachStatementNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.GlobalVarExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.IdentifierNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.IfExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.IfStatementNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ImpliesExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ImportNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.InfixExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.JavaCallNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.JavaTypeNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.LetExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.LetStatementNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ListLiteralNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.MultiplicativeExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.NullLiteralNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.NumberLiteralNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.OrExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ParameterListNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ParanthesizedExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.PointcutNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.ProtectStatementNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.RelationalExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.SequenceNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.SimpleTypeNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.StringLiteralNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.SwitchExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.Test_expressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.TextNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.TextSequenceNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.UnaryExpressionNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodeFactory;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Xpand3nodePackageImpl extends EPackageImpl implements Xpand3nodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionImportNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionAroundNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSequenceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorStatementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expandStatementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionStmtNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileStatementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreachStatementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseIfStatementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseStatementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letStatementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectStatementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aroundNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointcutNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaCallNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaTypeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass test_expressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castedExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casePartNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impliesExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additiveExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicativeExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infixExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paranthesizedExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVarExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureCallNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listLiteralNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorCallNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullLiteralNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberLiteralNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionExpressionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredParameterListNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredParameterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterListNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierNodeEClass = null;

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
	 * @see org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Xpand3nodePackageImpl() {
		super(eNS_URI, Xpand3nodeFactory.eINSTANCE);
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
	public static Xpand3nodePackage init() {
		if (isInited) return (Xpand3nodePackage)EPackage.Registry.INSTANCE.getEPackage(Xpand3nodePackage.eNS_URI);

		// Obtain or create and register package
		Xpand3nodePackageImpl theXpand3nodePackage = (Xpand3nodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Xpand3nodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new Xpand3nodePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NodePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXpand3nodePackage.createPackageContents();

		// Initialize created meta-data
		theXpand3nodePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXpand3nodePackage.freeze();

		return theXpand3nodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileNode() {
		return fileNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileNode_Declarations() {
		return (EReference)fileNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileNode_Imports() {
		return (EReference)fileNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportNode() {
		return importNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportNode_Namespace() {
		return (EReference)importNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportNode_Type() {
		return (EReference)importNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionImportNode() {
		return extensionImportNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionImportNode_Type() {
		return (EReference)extensionImportNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionImportNode_Namespace() {
		return (EReference)extensionImportNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionNode() {
		return definitionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionNode_Name() {
		return (EReference)definitionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionNode_Type() {
		return (EReference)definitionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionNode_Sequence() {
		return (EReference)definitionNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionNode_ParamList() {
		return (EReference)definitionNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionAroundNode() {
		return definitionAroundNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionAroundNode_Type() {
		return (EReference)definitionAroundNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionAroundNode_Pointcut() {
		return (EReference)definitionAroundNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionAroundNode_ParamList() {
		return (EReference)definitionAroundNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionAroundNode_Sequence() {
		return (EReference)definitionAroundNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceNode() {
		return sequenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceNode_TextSequences() {
		return (EReference)sequenceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceNode_Statements() {
		return (EReference)sequenceNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextSequenceNode() {
		return textSequenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextSequenceNode_Texts() {
		return (EReference)textSequenceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextNode() {
		return textNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorStatementNode() {
		return errorStatementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorStatementNode_Expression() {
		return (EReference)errorStatementNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpandStatementNode() {
		return expandStatementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpandStatementNode_Separator() {
		return (EReference)expandStatementNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpandStatementNode_ParamList() {
		return (EReference)expandStatementNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpandStatementNode_ForEachExpression() {
		return (EReference)expandStatementNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpandStatementNode_ForExpression() {
		return (EReference)expandStatementNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpandStatementNode_Name() {
		return (EReference)expandStatementNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionStmtNode() {
		return expressionStmtNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionStmtNode_Expression() {
		return (EReference)expressionStmtNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileStatementNode() {
		return fileStatementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileStatementNode_Sequence() {
		return (EReference)fileStatementNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileStatementNode_Identifier() {
		return (EReference)fileStatementNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileStatementNode_NameExpression() {
		return (EReference)fileStatementNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeachStatementNode() {
		return foreachStatementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeachStatementNode_Iterator() {
		return (EReference)foreachStatementNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeachStatementNode_Identifier() {
		return (EReference)foreachStatementNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeachStatementNode_Sequence() {
		return (EReference)foreachStatementNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeachStatementNode_ForExpression() {
		return (EReference)foreachStatementNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeachStatementNode_SeparatorExpression() {
		return (EReference)foreachStatementNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatementNode() {
		return ifStatementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatementNode_ElseIfs() {
		return (EReference)ifStatementNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatementNode_Expression() {
		return (EReference)ifStatementNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatementNode_Else() {
		return (EReference)ifStatementNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatementNode_Sequence() {
		return (EReference)ifStatementNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElseIfStatementNode() {
		return elseIfStatementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseIfStatementNode_Sequence() {
		return (EReference)elseIfStatementNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseIfStatementNode_Expression() {
		return (EReference)elseIfStatementNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElseStatementNode() {
		return elseStatementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseStatementNode_Sequence() {
		return (EReference)elseStatementNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetStatementNode() {
		return letStatementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetStatementNode_Expression() {
		return (EReference)letStatementNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetStatementNode_Name() {
		return (EReference)letStatementNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetStatementNode_Sequence() {
		return (EReference)letStatementNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtectStatementNode() {
		return protectStatementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectStatementNode_Sequence() {
		return (EReference)protectStatementNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectStatementNode_Cend() {
		return (EReference)protectStatementNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectStatementNode_Id() {
		return (EReference)protectStatementNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectStatementNode_Cstart() {
		return (EReference)protectStatementNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckNode() {
		return checkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckNode_Type() {
		return (EReference)checkNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckNode_Error() {
		return (EReference)checkNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckNode_Message() {
		return (EReference)checkNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckNode_IfExpression() {
		return (EReference)checkNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckNode_Warning() {
		return (EReference)checkNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckNode_Constraint() {
		return (EReference)checkNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAroundNode() {
		return aroundNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointcutNode() {
		return pointcutNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionNode() {
		return extensionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionNode_ExtendBody() {
		return (EReference)extensionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionNode_ReturnType() {
		return (EReference)extensionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionNode_CreatedName() {
		return (EReference)extensionNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionNode_Private() {
		return (EReference)extensionNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionNode_JavaCall() {
		return (EReference)extensionNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionNode_Name() {
		return (EReference)extensionNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionNode_Create() {
		return (EReference)extensionNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionNode_Cached() {
		return (EReference)extensionNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionNode_ParamList() {
		return (EReference)extensionNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaCallNode() {
		return javaCallNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaCallNode_JavaReturnType() {
		return (EReference)javaCallNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaCallNode_JavaName() {
		return (EReference)javaCallNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaTypeNode() {
		return javaTypeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest_expressionNode() {
		return test_expressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetExpressionNode() {
		return letExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCastedExpressionNode() {
		return castedExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastedExpressionNode_Type() {
		return (EReference)castedExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastedExpressionNode_Target() {
		return (EReference)castedExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainExpressionNode() {
		return chainExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainExpressionNode_Nexts() {
		return (EReference)chainExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainExpressionNode_First() {
		return (EReference)chainExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfExpressionNode() {
		return ifExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpressionNode_Condition0() {
		return (EReference)ifExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpressionNode_Else() {
		return (EReference)ifExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpressionNode_Then() {
		return (EReference)ifExpressionNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpressionNode_Condition1() {
		return (EReference)ifExpressionNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchExpressionNode() {
		return switchExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchExpressionNode_Expression() {
		return (EReference)switchExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchExpressionNode_Cases() {
		return (EReference)switchExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchExpressionNode_Default() {
		return (EReference)switchExpressionNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasePartNode() {
		return casePartNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCasePartNode_Condition() {
		return (EReference)casePartNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCasePartNode_Expression() {
		return (EReference)casePartNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrExpressionNode() {
		return orExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrExpressionNode_First() {
		return (EReference)orExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrExpressionNode_Nexts() {
		return (EReference)orExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndExpressionNode() {
		return andExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndExpressionNode_First() {
		return (EReference)andExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndExpressionNode_Nexts() {
		return (EReference)andExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpliesExpressionNode() {
		return impliesExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliesExpressionNode_Nexts() {
		return (EReference)impliesExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliesExpressionNode_First() {
		return (EReference)impliesExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalExpressionNode() {
		return relationalExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpressionNode_Nexts() {
		return (EReference)relationalExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpressionNode_First() {
		return (EReference)relationalExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditiveExpressionNode() {
		return additiveExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditiveExpressionNode_Nexts() {
		return (EReference)additiveExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditiveExpressionNode_First() {
		return (EReference)additiveExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicativeExpressionNode() {
		return multiplicativeExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicativeExpressionNode_First() {
		return (EReference)multiplicativeExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicativeExpressionNode_Nexts() {
		return (EReference)multiplicativeExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpressionNode() {
		return unaryExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpressionNode_Operand() {
		return (EReference)unaryExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfixExpressionNode() {
		return infixExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfixExpressionNode_Target() {
		return (EReference)infixExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfixExpressionNode_Calls() {
		return (EReference)infixExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteralNode() {
		return stringLiteralNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParanthesizedExpressionNode() {
		return paranthesizedExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParanthesizedExpressionNode_Expression() {
		return (EReference)paranthesizedExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVarExpressionNode() {
		return globalVarExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureCallNode() {
		return featureCallNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureCallNode_ParamList() {
		return (EReference)featureCallNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureCallNode_Name() {
		return (EReference)featureCallNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureCallNode_Type() {
		return (EReference)featureCallNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListLiteralNode() {
		return listLiteralNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListLiteralNode_Elements() {
		return (EReference)listLiteralNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorCallNode() {
		return constructorCallNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteralNode() {
		return booleanLiteralNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullLiteralNode() {
		return nullLiteralNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberLiteralNode() {
		return numberLiteralNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionExpressionNode() {
		return collectionExpressionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionExpressionNode_Variable() {
		return (EReference)collectionExpressionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionExpressionNode_Type() {
		return (EReference)collectionExpressionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionExpressionNode_Expression() {
		return (EReference)collectionExpressionNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredParameterListNode() {
		return declaredParameterListNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredParameterListNode_Params() {
		return (EReference)declaredParameterListNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaredParameterNode() {
		return declaredParameterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredParameterNode_Name() {
		return (EReference)declaredParameterNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaredParameterNode_Ptype() {
		return (EReference)declaredParameterNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterListNode() {
		return parameterListNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterListNode_Params() {
		return (EReference)parameterListNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionTypeNode() {
		return collectionTypeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionTypeNode_CollectionType() {
		return (EReference)collectionTypeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionTypeNode_ElementType() {
		return (EReference)collectionTypeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTypeNode() {
		return simpleTypeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTypeNode_Names() {
		return (EReference)simpleTypeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierNode() {
		return identifierNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xpand3nodeFactory getXpand3nodeFactory() {
		return (Xpand3nodeFactory)getEFactoryInstance();
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
		fileNodeEClass = createEClass(FILE_NODE);
		createEReference(fileNodeEClass, FILE_NODE__DECLARATIONS);
		createEReference(fileNodeEClass, FILE_NODE__IMPORTS);

		importNodeEClass = createEClass(IMPORT_NODE);
		createEReference(importNodeEClass, IMPORT_NODE__NAMESPACE);
		createEReference(importNodeEClass, IMPORT_NODE__TYPE);

		extensionImportNodeEClass = createEClass(EXTENSION_IMPORT_NODE);
		createEReference(extensionImportNodeEClass, EXTENSION_IMPORT_NODE__TYPE);
		createEReference(extensionImportNodeEClass, EXTENSION_IMPORT_NODE__NAMESPACE);

		definitionNodeEClass = createEClass(DEFINITION_NODE);
		createEReference(definitionNodeEClass, DEFINITION_NODE__NAME);
		createEReference(definitionNodeEClass, DEFINITION_NODE__TYPE);
		createEReference(definitionNodeEClass, DEFINITION_NODE__SEQUENCE);
		createEReference(definitionNodeEClass, DEFINITION_NODE__PARAM_LIST);

		definitionAroundNodeEClass = createEClass(DEFINITION_AROUND_NODE);
		createEReference(definitionAroundNodeEClass, DEFINITION_AROUND_NODE__TYPE);
		createEReference(definitionAroundNodeEClass, DEFINITION_AROUND_NODE__POINTCUT);
		createEReference(definitionAroundNodeEClass, DEFINITION_AROUND_NODE__PARAM_LIST);
		createEReference(definitionAroundNodeEClass, DEFINITION_AROUND_NODE__SEQUENCE);

		sequenceNodeEClass = createEClass(SEQUENCE_NODE);
		createEReference(sequenceNodeEClass, SEQUENCE_NODE__TEXT_SEQUENCES);
		createEReference(sequenceNodeEClass, SEQUENCE_NODE__STATEMENTS);

		textSequenceNodeEClass = createEClass(TEXT_SEQUENCE_NODE);
		createEReference(textSequenceNodeEClass, TEXT_SEQUENCE_NODE__TEXTS);

		textNodeEClass = createEClass(TEXT_NODE);

		errorStatementNodeEClass = createEClass(ERROR_STATEMENT_NODE);
		createEReference(errorStatementNodeEClass, ERROR_STATEMENT_NODE__EXPRESSION);

		expandStatementNodeEClass = createEClass(EXPAND_STATEMENT_NODE);
		createEReference(expandStatementNodeEClass, EXPAND_STATEMENT_NODE__SEPARATOR);
		createEReference(expandStatementNodeEClass, EXPAND_STATEMENT_NODE__PARAM_LIST);
		createEReference(expandStatementNodeEClass, EXPAND_STATEMENT_NODE__FOR_EACH_EXPRESSION);
		createEReference(expandStatementNodeEClass, EXPAND_STATEMENT_NODE__FOR_EXPRESSION);
		createEReference(expandStatementNodeEClass, EXPAND_STATEMENT_NODE__NAME);

		expressionStmtNodeEClass = createEClass(EXPRESSION_STMT_NODE);
		createEReference(expressionStmtNodeEClass, EXPRESSION_STMT_NODE__EXPRESSION);

		fileStatementNodeEClass = createEClass(FILE_STATEMENT_NODE);
		createEReference(fileStatementNodeEClass, FILE_STATEMENT_NODE__SEQUENCE);
		createEReference(fileStatementNodeEClass, FILE_STATEMENT_NODE__IDENTIFIER);
		createEReference(fileStatementNodeEClass, FILE_STATEMENT_NODE__NAME_EXPRESSION);

		foreachStatementNodeEClass = createEClass(FOREACH_STATEMENT_NODE);
		createEReference(foreachStatementNodeEClass, FOREACH_STATEMENT_NODE__ITERATOR);
		createEReference(foreachStatementNodeEClass, FOREACH_STATEMENT_NODE__IDENTIFIER);
		createEReference(foreachStatementNodeEClass, FOREACH_STATEMENT_NODE__SEQUENCE);
		createEReference(foreachStatementNodeEClass, FOREACH_STATEMENT_NODE__FOR_EXPRESSION);
		createEReference(foreachStatementNodeEClass, FOREACH_STATEMENT_NODE__SEPARATOR_EXPRESSION);

		ifStatementNodeEClass = createEClass(IF_STATEMENT_NODE);
		createEReference(ifStatementNodeEClass, IF_STATEMENT_NODE__ELSE_IFS);
		createEReference(ifStatementNodeEClass, IF_STATEMENT_NODE__EXPRESSION);
		createEReference(ifStatementNodeEClass, IF_STATEMENT_NODE__ELSE);
		createEReference(ifStatementNodeEClass, IF_STATEMENT_NODE__SEQUENCE);

		elseIfStatementNodeEClass = createEClass(ELSE_IF_STATEMENT_NODE);
		createEReference(elseIfStatementNodeEClass, ELSE_IF_STATEMENT_NODE__SEQUENCE);
		createEReference(elseIfStatementNodeEClass, ELSE_IF_STATEMENT_NODE__EXPRESSION);

		elseStatementNodeEClass = createEClass(ELSE_STATEMENT_NODE);
		createEReference(elseStatementNodeEClass, ELSE_STATEMENT_NODE__SEQUENCE);

		letStatementNodeEClass = createEClass(LET_STATEMENT_NODE);
		createEReference(letStatementNodeEClass, LET_STATEMENT_NODE__EXPRESSION);
		createEReference(letStatementNodeEClass, LET_STATEMENT_NODE__NAME);
		createEReference(letStatementNodeEClass, LET_STATEMENT_NODE__SEQUENCE);

		protectStatementNodeEClass = createEClass(PROTECT_STATEMENT_NODE);
		createEReference(protectStatementNodeEClass, PROTECT_STATEMENT_NODE__SEQUENCE);
		createEReference(protectStatementNodeEClass, PROTECT_STATEMENT_NODE__CEND);
		createEReference(protectStatementNodeEClass, PROTECT_STATEMENT_NODE__ID);
		createEReference(protectStatementNodeEClass, PROTECT_STATEMENT_NODE__CSTART);

		checkNodeEClass = createEClass(CHECK_NODE);
		createEReference(checkNodeEClass, CHECK_NODE__TYPE);
		createEReference(checkNodeEClass, CHECK_NODE__ERROR);
		createEReference(checkNodeEClass, CHECK_NODE__MESSAGE);
		createEReference(checkNodeEClass, CHECK_NODE__IF_EXPRESSION);
		createEReference(checkNodeEClass, CHECK_NODE__WARNING);
		createEReference(checkNodeEClass, CHECK_NODE__CONSTRAINT);

		aroundNodeEClass = createEClass(AROUND_NODE);

		pointcutNodeEClass = createEClass(POINTCUT_NODE);

		extensionNodeEClass = createEClass(EXTENSION_NODE);
		createEReference(extensionNodeEClass, EXTENSION_NODE__EXTEND_BODY);
		createEReference(extensionNodeEClass, EXTENSION_NODE__RETURN_TYPE);
		createEReference(extensionNodeEClass, EXTENSION_NODE__CREATED_NAME);
		createEReference(extensionNodeEClass, EXTENSION_NODE__PRIVATE);
		createEReference(extensionNodeEClass, EXTENSION_NODE__JAVA_CALL);
		createEReference(extensionNodeEClass, EXTENSION_NODE__NAME);
		createEReference(extensionNodeEClass, EXTENSION_NODE__CREATE);
		createEReference(extensionNodeEClass, EXTENSION_NODE__CACHED);
		createEReference(extensionNodeEClass, EXTENSION_NODE__PARAM_LIST);

		javaCallNodeEClass = createEClass(JAVA_CALL_NODE);
		createEReference(javaCallNodeEClass, JAVA_CALL_NODE__JAVA_RETURN_TYPE);
		createEReference(javaCallNodeEClass, JAVA_CALL_NODE__JAVA_NAME);

		javaTypeNodeEClass = createEClass(JAVA_TYPE_NODE);

		test_expressionNodeEClass = createEClass(TEST_EXPRESSION_NODE);

		letExpressionNodeEClass = createEClass(LET_EXPRESSION_NODE);

		castedExpressionNodeEClass = createEClass(CASTED_EXPRESSION_NODE);
		createEReference(castedExpressionNodeEClass, CASTED_EXPRESSION_NODE__TYPE);
		createEReference(castedExpressionNodeEClass, CASTED_EXPRESSION_NODE__TARGET);

		chainExpressionNodeEClass = createEClass(CHAIN_EXPRESSION_NODE);
		createEReference(chainExpressionNodeEClass, CHAIN_EXPRESSION_NODE__NEXTS);
		createEReference(chainExpressionNodeEClass, CHAIN_EXPRESSION_NODE__FIRST);

		ifExpressionNodeEClass = createEClass(IF_EXPRESSION_NODE);
		createEReference(ifExpressionNodeEClass, IF_EXPRESSION_NODE__CONDITION0);
		createEReference(ifExpressionNodeEClass, IF_EXPRESSION_NODE__ELSE);
		createEReference(ifExpressionNodeEClass, IF_EXPRESSION_NODE__THEN);
		createEReference(ifExpressionNodeEClass, IF_EXPRESSION_NODE__CONDITION1);

		switchExpressionNodeEClass = createEClass(SWITCH_EXPRESSION_NODE);
		createEReference(switchExpressionNodeEClass, SWITCH_EXPRESSION_NODE__EXPRESSION);
		createEReference(switchExpressionNodeEClass, SWITCH_EXPRESSION_NODE__CASES);
		createEReference(switchExpressionNodeEClass, SWITCH_EXPRESSION_NODE__DEFAULT);

		casePartNodeEClass = createEClass(CASE_PART_NODE);
		createEReference(casePartNodeEClass, CASE_PART_NODE__CONDITION);
		createEReference(casePartNodeEClass, CASE_PART_NODE__EXPRESSION);

		orExpressionNodeEClass = createEClass(OR_EXPRESSION_NODE);
		createEReference(orExpressionNodeEClass, OR_EXPRESSION_NODE__FIRST);
		createEReference(orExpressionNodeEClass, OR_EXPRESSION_NODE__NEXTS);

		andExpressionNodeEClass = createEClass(AND_EXPRESSION_NODE);
		createEReference(andExpressionNodeEClass, AND_EXPRESSION_NODE__FIRST);
		createEReference(andExpressionNodeEClass, AND_EXPRESSION_NODE__NEXTS);

		impliesExpressionNodeEClass = createEClass(IMPLIES_EXPRESSION_NODE);
		createEReference(impliesExpressionNodeEClass, IMPLIES_EXPRESSION_NODE__NEXTS);
		createEReference(impliesExpressionNodeEClass, IMPLIES_EXPRESSION_NODE__FIRST);

		relationalExpressionNodeEClass = createEClass(RELATIONAL_EXPRESSION_NODE);
		createEReference(relationalExpressionNodeEClass, RELATIONAL_EXPRESSION_NODE__NEXTS);
		createEReference(relationalExpressionNodeEClass, RELATIONAL_EXPRESSION_NODE__FIRST);

		additiveExpressionNodeEClass = createEClass(ADDITIVE_EXPRESSION_NODE);
		createEReference(additiveExpressionNodeEClass, ADDITIVE_EXPRESSION_NODE__NEXTS);
		createEReference(additiveExpressionNodeEClass, ADDITIVE_EXPRESSION_NODE__FIRST);

		multiplicativeExpressionNodeEClass = createEClass(MULTIPLICATIVE_EXPRESSION_NODE);
		createEReference(multiplicativeExpressionNodeEClass, MULTIPLICATIVE_EXPRESSION_NODE__FIRST);
		createEReference(multiplicativeExpressionNodeEClass, MULTIPLICATIVE_EXPRESSION_NODE__NEXTS);

		unaryExpressionNodeEClass = createEClass(UNARY_EXPRESSION_NODE);
		createEReference(unaryExpressionNodeEClass, UNARY_EXPRESSION_NODE__OPERAND);

		infixExpressionNodeEClass = createEClass(INFIX_EXPRESSION_NODE);
		createEReference(infixExpressionNodeEClass, INFIX_EXPRESSION_NODE__TARGET);
		createEReference(infixExpressionNodeEClass, INFIX_EXPRESSION_NODE__CALLS);

		stringLiteralNodeEClass = createEClass(STRING_LITERAL_NODE);

		paranthesizedExpressionNodeEClass = createEClass(PARANTHESIZED_EXPRESSION_NODE);
		createEReference(paranthesizedExpressionNodeEClass, PARANTHESIZED_EXPRESSION_NODE__EXPRESSION);

		globalVarExpressionNodeEClass = createEClass(GLOBAL_VAR_EXPRESSION_NODE);

		featureCallNodeEClass = createEClass(FEATURE_CALL_NODE);
		createEReference(featureCallNodeEClass, FEATURE_CALL_NODE__PARAM_LIST);
		createEReference(featureCallNodeEClass, FEATURE_CALL_NODE__NAME);
		createEReference(featureCallNodeEClass, FEATURE_CALL_NODE__TYPE);

		listLiteralNodeEClass = createEClass(LIST_LITERAL_NODE);
		createEReference(listLiteralNodeEClass, LIST_LITERAL_NODE__ELEMENTS);

		constructorCallNodeEClass = createEClass(CONSTRUCTOR_CALL_NODE);

		booleanLiteralNodeEClass = createEClass(BOOLEAN_LITERAL_NODE);

		nullLiteralNodeEClass = createEClass(NULL_LITERAL_NODE);

		numberLiteralNodeEClass = createEClass(NUMBER_LITERAL_NODE);

		collectionExpressionNodeEClass = createEClass(COLLECTION_EXPRESSION_NODE);
		createEReference(collectionExpressionNodeEClass, COLLECTION_EXPRESSION_NODE__VARIABLE);
		createEReference(collectionExpressionNodeEClass, COLLECTION_EXPRESSION_NODE__TYPE);
		createEReference(collectionExpressionNodeEClass, COLLECTION_EXPRESSION_NODE__EXPRESSION);

		declaredParameterListNodeEClass = createEClass(DECLARED_PARAMETER_LIST_NODE);
		createEReference(declaredParameterListNodeEClass, DECLARED_PARAMETER_LIST_NODE__PARAMS);

		declaredParameterNodeEClass = createEClass(DECLARED_PARAMETER_NODE);
		createEReference(declaredParameterNodeEClass, DECLARED_PARAMETER_NODE__NAME);
		createEReference(declaredParameterNodeEClass, DECLARED_PARAMETER_NODE__PTYPE);

		parameterListNodeEClass = createEClass(PARAMETER_LIST_NODE);
		createEReference(parameterListNodeEClass, PARAMETER_LIST_NODE__PARAMS);

		collectionTypeNodeEClass = createEClass(COLLECTION_TYPE_NODE);
		createEReference(collectionTypeNodeEClass, COLLECTION_TYPE_NODE__COLLECTION_TYPE);
		createEReference(collectionTypeNodeEClass, COLLECTION_TYPE_NODE__ELEMENT_TYPE);

		simpleTypeNodeEClass = createEClass(SIMPLE_TYPE_NODE);
		createEReference(simpleTypeNodeEClass, SIMPLE_TYPE_NODE__NAMES);

		identifierNodeEClass = createEClass(IDENTIFIER_NODE);
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
		NodePackage theNodePackage = (NodePackage)EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fileNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		importNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		extensionImportNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		definitionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		definitionAroundNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		sequenceNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		textSequenceNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		textNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		errorStatementNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		expandStatementNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		expressionStmtNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		fileStatementNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		foreachStatementNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		ifStatementNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		elseIfStatementNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		elseStatementNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		letStatementNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		protectStatementNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		checkNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		aroundNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		pointcutNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		extensionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		javaCallNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		javaTypeNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		test_expressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		letExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		castedExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		chainExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		ifExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		switchExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		casePartNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		orExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		andExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		impliesExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		relationalExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		additiveExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		multiplicativeExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		unaryExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		infixExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		stringLiteralNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		paranthesizedExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		globalVarExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		featureCallNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		listLiteralNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		constructorCallNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		booleanLiteralNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		nullLiteralNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		numberLiteralNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		collectionExpressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		declaredParameterListNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		declaredParameterNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		parameterListNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		collectionTypeNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		simpleTypeNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		identifierNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());

		// Initialize classes and features; add operations and parameters
		initEClass(fileNodeEClass, FileNode.class, "FileNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileNode_Declarations(), theNodePackage.getCompositeNode(), null, "declarations", null, 0, -1, FileNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileNode_Imports(), theNodePackage.getCompositeNode(), null, "imports", null, 0, -1, FileNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importNodeEClass, ImportNode.class, "ImportNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportNode_Namespace(), theNodePackage.getCompositeNode(), null, "namespace", null, 0, 1, ImportNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportNode_Type(), theNodePackage.getCompositeNode(), null, "type", null, 0, 1, ImportNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionImportNodeEClass, ExtensionImportNode.class, "ExtensionImportNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionImportNode_Type(), theNodePackage.getCompositeNode(), null, "type", null, 0, 1, ExtensionImportNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionImportNode_Namespace(), theNodePackage.getCompositeNode(), null, "namespace", null, 0, 1, ExtensionImportNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionNodeEClass, DefinitionNode.class, "DefinitionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionNode_Name(), theNodePackage.getCompositeNode(), null, "name", null, 0, 1, DefinitionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionNode_Type(), theNodePackage.getCompositeNode(), null, "type", null, 0, 1, DefinitionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionNode_Sequence(), theNodePackage.getCompositeNode(), null, "sequence", null, 0, 1, DefinitionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionNode_ParamList(), theNodePackage.getCompositeNode(), null, "paramList", null, 0, 1, DefinitionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionAroundNodeEClass, DefinitionAroundNode.class, "DefinitionAroundNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionAroundNode_Type(), theNodePackage.getCompositeNode(), null, "type", null, 0, 1, DefinitionAroundNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionAroundNode_Pointcut(), theNodePackage.getCompositeNode(), null, "pointcut", null, 0, 1, DefinitionAroundNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionAroundNode_ParamList(), theNodePackage.getCompositeNode(), null, "paramList", null, 0, 1, DefinitionAroundNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionAroundNode_Sequence(), theNodePackage.getCompositeNode(), null, "sequence", null, 0, 1, DefinitionAroundNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceNodeEClass, SequenceNode.class, "SequenceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceNode_TextSequences(), theNodePackage.getCompositeNode(), null, "textSequences", null, 0, -1, SequenceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceNode_Statements(), theNodePackage.getCompositeNode(), null, "statements", null, 0, -1, SequenceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textSequenceNodeEClass, TextSequenceNode.class, "TextSequenceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextSequenceNode_Texts(), theNodePackage.getCompositeNode(), null, "texts", null, 0, -1, TextSequenceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textNodeEClass, TextNode.class, "TextNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorStatementNodeEClass, ErrorStatementNode.class, "ErrorStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorStatementNode_Expression(), theNodePackage.getCompositeNode(), null, "expression", null, 0, 1, ErrorStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expandStatementNodeEClass, ExpandStatementNode.class, "ExpandStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpandStatementNode_Separator(), theNodePackage.getCompositeNode(), null, "separator", null, 0, 1, ExpandStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpandStatementNode_ParamList(), theNodePackage.getCompositeNode(), null, "paramList", null, 0, 1, ExpandStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpandStatementNode_ForEachExpression(), theNodePackage.getCompositeNode(), null, "forEachExpression", null, 0, 1, ExpandStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpandStatementNode_ForExpression(), theNodePackage.getCompositeNode(), null, "forExpression", null, 0, 1, ExpandStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpandStatementNode_Name(), theNodePackage.getCompositeNode(), null, "name", null, 0, 1, ExpandStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionStmtNodeEClass, ExpressionStmtNode.class, "ExpressionStmtNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionStmtNode_Expression(), theNodePackage.getCompositeNode(), null, "expression", null, 0, 1, ExpressionStmtNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileStatementNodeEClass, FileStatementNode.class, "FileStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileStatementNode_Sequence(), theNodePackage.getCompositeNode(), null, "sequence", null, 0, 1, FileStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileStatementNode_Identifier(), theNodePackage.getCompositeNode(), null, "identifier", null, 0, 1, FileStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileStatementNode_NameExpression(), theNodePackage.getCompositeNode(), null, "nameExpression", null, 0, 1, FileStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreachStatementNodeEClass, ForeachStatementNode.class, "ForeachStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForeachStatementNode_Iterator(), theNodePackage.getCompositeNode(), null, "iterator", null, 0, 1, ForeachStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeachStatementNode_Identifier(), theNodePackage.getCompositeNode(), null, "identifier", null, 0, 1, ForeachStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeachStatementNode_Sequence(), theNodePackage.getCompositeNode(), null, "sequence", null, 0, 1, ForeachStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeachStatementNode_ForExpression(), theNodePackage.getCompositeNode(), null, "forExpression", null, 0, 1, ForeachStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeachStatementNode_SeparatorExpression(), theNodePackage.getCompositeNode(), null, "separatorExpression", null, 0, 1, ForeachStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifStatementNodeEClass, IfStatementNode.class, "IfStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatementNode_ElseIfs(), theNodePackage.getCompositeNode(), null, "elseIfs", null, 0, -1, IfStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatementNode_Expression(), theNodePackage.getCompositeNode(), null, "expression", null, 0, 1, IfStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatementNode_Else(), theNodePackage.getCompositeNode(), null, "else", null, 0, 1, IfStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatementNode_Sequence(), theNodePackage.getCompositeNode(), null, "sequence", null, 0, 1, IfStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseIfStatementNodeEClass, ElseIfStatementNode.class, "ElseIfStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseIfStatementNode_Sequence(), theNodePackage.getCompositeNode(), null, "sequence", null, 0, 1, ElseIfStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElseIfStatementNode_Expression(), theNodePackage.getCompositeNode(), null, "expression", null, 0, 1, ElseIfStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseStatementNodeEClass, ElseStatementNode.class, "ElseStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseStatementNode_Sequence(), theNodePackage.getCompositeNode(), null, "sequence", null, 0, 1, ElseStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(letStatementNodeEClass, LetStatementNode.class, "LetStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetStatementNode_Expression(), theNodePackage.getCompositeNode(), null, "expression", null, 0, 1, LetStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetStatementNode_Name(), theNodePackage.getCompositeNode(), null, "name", null, 0, 1, LetStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetStatementNode_Sequence(), theNodePackage.getCompositeNode(), null, "sequence", null, 0, 1, LetStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protectStatementNodeEClass, ProtectStatementNode.class, "ProtectStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtectStatementNode_Sequence(), theNodePackage.getCompositeNode(), null, "sequence", null, 0, 1, ProtectStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectStatementNode_Cend(), theNodePackage.getCompositeNode(), null, "cend", null, 0, 1, ProtectStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectStatementNode_Id(), theNodePackage.getCompositeNode(), null, "id", null, 0, 1, ProtectStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectStatementNode_Cstart(), theNodePackage.getCompositeNode(), null, "cstart", null, 0, 1, ProtectStatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkNodeEClass, CheckNode.class, "CheckNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckNode_Type(), theNodePackage.getCompositeNode(), null, "type", null, 0, 1, CheckNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckNode_Error(), theNodePackage.getLeafNode(), null, "error", null, 0, 1, CheckNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckNode_Message(), theNodePackage.getCompositeNode(), null, "message", null, 0, 1, CheckNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckNode_IfExpression(), theNodePackage.getCompositeNode(), null, "ifExpression", null, 0, 1, CheckNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckNode_Warning(), theNodePackage.getLeafNode(), null, "warning", null, 0, 1, CheckNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckNode_Constraint(), theNodePackage.getCompositeNode(), null, "constraint", null, 0, 1, CheckNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aroundNodeEClass, AroundNode.class, "AroundNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointcutNodeEClass, PointcutNode.class, "PointcutNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extensionNodeEClass, ExtensionNode.class, "ExtensionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionNode_ExtendBody(), theNodePackage.getCompositeNode(), null, "extendBody", null, 0, 1, ExtensionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionNode_ReturnType(), theNodePackage.getCompositeNode(), null, "returnType", null, 0, 1, ExtensionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionNode_CreatedName(), theNodePackage.getCompositeNode(), null, "createdName", null, 0, 1, ExtensionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionNode_Private(), theNodePackage.getLeafNode(), null, "private", null, 0, 1, ExtensionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionNode_JavaCall(), theNodePackage.getCompositeNode(), null, "javaCall", null, 0, 1, ExtensionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionNode_Name(), theNodePackage.getCompositeNode(), null, "name", null, 0, 1, ExtensionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionNode_Create(), theNodePackage.getLeafNode(), null, "create", null, 0, 1, ExtensionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionNode_Cached(), theNodePackage.getLeafNode(), null, "cached", null, 0, 1, ExtensionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionNode_ParamList(), theNodePackage.getCompositeNode(), null, "paramList", null, 0, 1, ExtensionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaCallNodeEClass, JavaCallNode.class, "JavaCallNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaCallNode_JavaReturnType(), theNodePackage.getCompositeNode(), null, "javaReturnType", null, 0, 1, JavaCallNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaCallNode_JavaName(), theNodePackage.getCompositeNode(), null, "javaName", null, 0, 1, JavaCallNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaTypeNodeEClass, JavaTypeNode.class, "JavaTypeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(test_expressionNodeEClass, Test_expressionNode.class, "Test_expressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(letExpressionNodeEClass, LetExpressionNode.class, "LetExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(castedExpressionNodeEClass, CastedExpressionNode.class, "CastedExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCastedExpressionNode_Type(), theNodePackage.getCompositeNode(), null, "type", null, 0, 1, CastedExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCastedExpressionNode_Target(), theNodePackage.getCompositeNode(), null, "target", null, 0, 1, CastedExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainExpressionNodeEClass, ChainExpressionNode.class, "ChainExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainExpressionNode_Nexts(), theNodePackage.getCompositeNode(), null, "nexts", null, 0, -1, ChainExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainExpressionNode_First(), theNodePackage.getCompositeNode(), null, "first", null, 0, 1, ChainExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifExpressionNodeEClass, IfExpressionNode.class, "IfExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfExpressionNode_Condition0(), theNodePackage.getCompositeNode(), null, "condition0", null, 0, 1, IfExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfExpressionNode_Else(), theNodePackage.getCompositeNode(), null, "else", null, 0, 1, IfExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfExpressionNode_Then(), theNodePackage.getCompositeNode(), null, "then", null, 0, 1, IfExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfExpressionNode_Condition1(), theNodePackage.getCompositeNode(), null, "condition1", null, 0, 1, IfExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchExpressionNodeEClass, SwitchExpressionNode.class, "SwitchExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchExpressionNode_Expression(), theNodePackage.getCompositeNode(), null, "expression", null, 0, 1, SwitchExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchExpressionNode_Cases(), theNodePackage.getCompositeNode(), null, "cases", null, 0, -1, SwitchExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchExpressionNode_Default(), theNodePackage.getCompositeNode(), null, "default", null, 0, 1, SwitchExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casePartNodeEClass, CasePartNode.class, "CasePartNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCasePartNode_Condition(), theNodePackage.getCompositeNode(), null, "condition", null, 0, 1, CasePartNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCasePartNode_Expression(), theNodePackage.getCompositeNode(), null, "expression", null, 0, 1, CasePartNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orExpressionNodeEClass, OrExpressionNode.class, "OrExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrExpressionNode_First(), theNodePackage.getCompositeNode(), null, "first", null, 0, 1, OrExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrExpressionNode_Nexts(), theNodePackage.getCompositeNode(), null, "nexts", null, 0, -1, OrExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andExpressionNodeEClass, AndExpressionNode.class, "AndExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndExpressionNode_First(), theNodePackage.getCompositeNode(), null, "first", null, 0, 1, AndExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndExpressionNode_Nexts(), theNodePackage.getCompositeNode(), null, "nexts", null, 0, -1, AndExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(impliesExpressionNodeEClass, ImpliesExpressionNode.class, "ImpliesExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImpliesExpressionNode_Nexts(), theNodePackage.getCompositeNode(), null, "nexts", null, 0, -1, ImpliesExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImpliesExpressionNode_First(), theNodePackage.getCompositeNode(), null, "first", null, 0, 1, ImpliesExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalExpressionNodeEClass, RelationalExpressionNode.class, "RelationalExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalExpressionNode_Nexts(), theNodePackage.getCompositeNode(), null, "nexts", null, 0, -1, RelationalExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpressionNode_First(), theNodePackage.getCompositeNode(), null, "first", null, 0, 1, RelationalExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additiveExpressionNodeEClass, AdditiveExpressionNode.class, "AdditiveExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdditiveExpressionNode_Nexts(), theNodePackage.getCompositeNode(), null, "nexts", null, 0, -1, AdditiveExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditiveExpressionNode_First(), theNodePackage.getCompositeNode(), null, "first", null, 0, 1, AdditiveExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicativeExpressionNodeEClass, MultiplicativeExpressionNode.class, "MultiplicativeExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicativeExpressionNode_First(), theNodePackage.getCompositeNode(), null, "first", null, 0, 1, MultiplicativeExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicativeExpressionNode_Nexts(), theNodePackage.getCompositeNode(), null, "nexts", null, 0, -1, MultiplicativeExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionNodeEClass, UnaryExpressionNode.class, "UnaryExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpressionNode_Operand(), theNodePackage.getCompositeNode(), null, "operand", null, 0, 1, UnaryExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infixExpressionNodeEClass, InfixExpressionNode.class, "InfixExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfixExpressionNode_Target(), theNodePackage.getCompositeNode(), null, "target", null, 0, 1, InfixExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfixExpressionNode_Calls(), theNodePackage.getCompositeNode(), null, "calls", null, 0, -1, InfixExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralNodeEClass, StringLiteralNode.class, "StringLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paranthesizedExpressionNodeEClass, ParanthesizedExpressionNode.class, "ParanthesizedExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParanthesizedExpressionNode_Expression(), theNodePackage.getCompositeNode(), null, "expression", null, 0, 1, ParanthesizedExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalVarExpressionNodeEClass, GlobalVarExpressionNode.class, "GlobalVarExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureCallNodeEClass, FeatureCallNode.class, "FeatureCallNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureCallNode_ParamList(), theNodePackage.getCompositeNode(), null, "paramList", null, 0, 1, FeatureCallNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCallNode_Name(), theNodePackage.getCompositeNode(), null, "name", null, 0, 1, FeatureCallNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCallNode_Type(), theNodePackage.getCompositeNode(), null, "type", null, 0, 1, FeatureCallNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listLiteralNodeEClass, ListLiteralNode.class, "ListLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListLiteralNode_Elements(), theNodePackage.getCompositeNode(), null, "elements", null, 0, -1, ListLiteralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorCallNodeEClass, ConstructorCallNode.class, "ConstructorCallNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanLiteralNodeEClass, BooleanLiteralNode.class, "BooleanLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nullLiteralNodeEClass, NullLiteralNode.class, "NullLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberLiteralNodeEClass, NumberLiteralNode.class, "NumberLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionExpressionNodeEClass, CollectionExpressionNode.class, "CollectionExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionExpressionNode_Variable(), theNodePackage.getCompositeNode(), null, "variable", null, 0, 1, CollectionExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionExpressionNode_Type(), theNodePackage.getCompositeNode(), null, "type", null, 0, 1, CollectionExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionExpressionNode_Expression(), theNodePackage.getCompositeNode(), null, "expression", null, 0, 1, CollectionExpressionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaredParameterListNodeEClass, DeclaredParameterListNode.class, "DeclaredParameterListNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaredParameterListNode_Params(), theNodePackage.getCompositeNode(), null, "params", null, 0, -1, DeclaredParameterListNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaredParameterNodeEClass, DeclaredParameterNode.class, "DeclaredParameterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaredParameterNode_Name(), theNodePackage.getCompositeNode(), null, "name", null, 0, 1, DeclaredParameterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaredParameterNode_Ptype(), theNodePackage.getCompositeNode(), null, "ptype", null, 0, 1, DeclaredParameterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterListNodeEClass, ParameterListNode.class, "ParameterListNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterListNode_Params(), theNodePackage.getCompositeNode(), null, "params", null, 0, -1, ParameterListNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionTypeNodeEClass, CollectionTypeNode.class, "CollectionTypeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionTypeNode_CollectionType(), theNodePackage.getLeafNode(), null, "collectionType", null, 0, 1, CollectionTypeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionTypeNode_ElementType(), theNodePackage.getCompositeNode(), null, "elementType", null, 0, 1, CollectionTypeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTypeNodeEClass, SimpleTypeNode.class, "SimpleTypeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleTypeNode_Names(), theNodePackage.getCompositeNode(), null, "names", null, 0, -1, SimpleTypeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierNodeEClass, IdentifierNode.class, "IdentifierNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Xpand3nodePackageImpl
