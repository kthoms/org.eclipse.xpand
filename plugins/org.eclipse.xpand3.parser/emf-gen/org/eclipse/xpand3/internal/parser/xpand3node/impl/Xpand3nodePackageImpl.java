/**
 * <copyright>
 * </copyright>
 *
 * $Id: Xpand3nodePackageImpl.java,v 1.1 2008/03/06 08:55:15 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.tmf.common.node.NodePackage;

import org.eclipse.xpand3.internal.parser.xpand3node.AdditiveExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.AndExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.AroundNode;
import org.eclipse.xpand3.internal.parser.xpand3node.BooleanLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.CasePartNode;
import org.eclipse.xpand3.internal.parser.xpand3node.CastedExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ChainExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.CheckNode;
import org.eclipse.xpand3.internal.parser.xpand3node.CollectionExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.CollectionTypeNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ConstructorCallNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterListNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DefinitionAroundNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DefinitionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ElseIfStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ElseStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ErrorStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExpressionStmtNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode;
import org.eclipse.xpand3.internal.parser.xpand3node.FileNode;
import org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.GlobalVarExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.IdentifierNode;
import org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.IfStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ImpliesExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.JavaTypeNode;
import org.eclipse.xpand3.internal.parser.xpand3node.LetExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.LetStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ListLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.MultiplicativeExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.NsImportNode;
import org.eclipse.xpand3.internal.parser.xpand3node.NullLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.NumberLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.OrExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ParameterListNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ParanthesizedExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.PointcutNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.SequenceNode;
import org.eclipse.xpand3.internal.parser.xpand3node.SimpleTypeNode;
import org.eclipse.xpand3.internal.parser.xpand3node.StringLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.SwitchExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Test_expressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.TextNode;
import org.eclipse.xpand3.internal.parser.xpand3node.TextSequenceNode;
import org.eclipse.xpand3.internal.parser.xpand3node.UnaryExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodeFactory;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

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
	private EClass nsImportNodeEClass = null;

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
	private EClass expressionNodeEClass = null;

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
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage#eNS_URI
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
	public EReference getFileNode_Decl() {
		return (EReference)fileNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileNode_Imp() {
		return (EReference)fileNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNsImportNode() {
		return nsImportNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNsImportNode_Ns() {
		return (EReference)nsImportNodeEClass.getEStructuralFeatures().get(0);
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
	public EClass getDefinitionAroundNode() {
		return definitionAroundNodeEClass;
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
	public EClass getTextSequenceNode() {
		return textSequenceNodeEClass;
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
	public EClass getExpandStatementNode() {
		return expandStatementNodeEClass;
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
	public EClass getFileStatementNode() {
		return fileStatementNodeEClass;
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
	public EClass getIfStatementNode() {
		return ifStatementNodeEClass;
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
	public EClass getElseStatementNode() {
		return elseStatementNodeEClass;
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
	public EClass getProtectStatementNode() {
		return protectStatementNodeEClass;
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
	public EClass getExpressionNode() {
		return expressionNodeEClass;
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
	public EClass getChainExpressionNode() {
		return chainExpressionNodeEClass;
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
	public EClass getSwitchExpressionNode() {
		return switchExpressionNodeEClass;
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
	public EClass getOrExpressionNode() {
		return orExpressionNodeEClass;
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
	public EClass getImpliesExpressionNode() {
		return impliesExpressionNodeEClass;
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
	public EClass getAdditiveExpressionNode() {
		return additiveExpressionNodeEClass;
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
	public EClass getUnaryExpressionNode() {
		return unaryExpressionNodeEClass;
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
	public EClass getListLiteralNode() {
		return listLiteralNodeEClass;
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
	public EClass getDeclaredParameterListNode() {
		return declaredParameterListNodeEClass;
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
	public EClass getParameterListNode() {
		return parameterListNodeEClass;
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
	public EClass getSimpleTypeNode() {
		return simpleTypeNodeEClass;
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
		createEReference(fileNodeEClass, FILE_NODE__DECL);
		createEReference(fileNodeEClass, FILE_NODE__IMP);

		nsImportNodeEClass = createEClass(NS_IMPORT_NODE);
		createEReference(nsImportNodeEClass, NS_IMPORT_NODE__NS);

		definitionNodeEClass = createEClass(DEFINITION_NODE);
		createEReference(definitionNodeEClass, DEFINITION_NODE__NAME);

		definitionAroundNodeEClass = createEClass(DEFINITION_AROUND_NODE);

		sequenceNodeEClass = createEClass(SEQUENCE_NODE);

		textSequenceNodeEClass = createEClass(TEXT_SEQUENCE_NODE);

		textNodeEClass = createEClass(TEXT_NODE);

		errorStatementNodeEClass = createEClass(ERROR_STATEMENT_NODE);

		expandStatementNodeEClass = createEClass(EXPAND_STATEMENT_NODE);

		expressionStmtNodeEClass = createEClass(EXPRESSION_STMT_NODE);

		fileStatementNodeEClass = createEClass(FILE_STATEMENT_NODE);

		foreachStatementNodeEClass = createEClass(FOREACH_STATEMENT_NODE);

		ifStatementNodeEClass = createEClass(IF_STATEMENT_NODE);

		elseIfStatementNodeEClass = createEClass(ELSE_IF_STATEMENT_NODE);

		elseStatementNodeEClass = createEClass(ELSE_STATEMENT_NODE);

		letStatementNodeEClass = createEClass(LET_STATEMENT_NODE);

		protectStatementNodeEClass = createEClass(PROTECT_STATEMENT_NODE);

		checkNodeEClass = createEClass(CHECK_NODE);

		aroundNodeEClass = createEClass(AROUND_NODE);

		pointcutNodeEClass = createEClass(POINTCUT_NODE);

		extensionNodeEClass = createEClass(EXTENSION_NODE);

		javaTypeNodeEClass = createEClass(JAVA_TYPE_NODE);

		test_expressionNodeEClass = createEClass(TEST_EXPRESSION_NODE);

		expressionNodeEClass = createEClass(EXPRESSION_NODE);

		letExpressionNodeEClass = createEClass(LET_EXPRESSION_NODE);

		castedExpressionNodeEClass = createEClass(CASTED_EXPRESSION_NODE);

		chainExpressionNodeEClass = createEClass(CHAIN_EXPRESSION_NODE);

		ifExpressionNodeEClass = createEClass(IF_EXPRESSION_NODE);

		switchExpressionNodeEClass = createEClass(SWITCH_EXPRESSION_NODE);

		casePartNodeEClass = createEClass(CASE_PART_NODE);

		orExpressionNodeEClass = createEClass(OR_EXPRESSION_NODE);

		andExpressionNodeEClass = createEClass(AND_EXPRESSION_NODE);

		impliesExpressionNodeEClass = createEClass(IMPLIES_EXPRESSION_NODE);

		relationalExpressionNodeEClass = createEClass(RELATIONAL_EXPRESSION_NODE);

		additiveExpressionNodeEClass = createEClass(ADDITIVE_EXPRESSION_NODE);

		multiplicativeExpressionNodeEClass = createEClass(MULTIPLICATIVE_EXPRESSION_NODE);

		unaryExpressionNodeEClass = createEClass(UNARY_EXPRESSION_NODE);

		infixExpressionNodeEClass = createEClass(INFIX_EXPRESSION_NODE);

		stringLiteralNodeEClass = createEClass(STRING_LITERAL_NODE);

		paranthesizedExpressionNodeEClass = createEClass(PARANTHESIZED_EXPRESSION_NODE);

		globalVarExpressionNodeEClass = createEClass(GLOBAL_VAR_EXPRESSION_NODE);

		featureCallNodeEClass = createEClass(FEATURE_CALL_NODE);

		listLiteralNodeEClass = createEClass(LIST_LITERAL_NODE);

		constructorCallNodeEClass = createEClass(CONSTRUCTOR_CALL_NODE);

		booleanLiteralNodeEClass = createEClass(BOOLEAN_LITERAL_NODE);

		nullLiteralNodeEClass = createEClass(NULL_LITERAL_NODE);

		numberLiteralNodeEClass = createEClass(NUMBER_LITERAL_NODE);

		collectionExpressionNodeEClass = createEClass(COLLECTION_EXPRESSION_NODE);

		declaredParameterListNodeEClass = createEClass(DECLARED_PARAMETER_LIST_NODE);

		declaredParameterNodeEClass = createEClass(DECLARED_PARAMETER_NODE);

		parameterListNodeEClass = createEClass(PARAMETER_LIST_NODE);

		collectionTypeNodeEClass = createEClass(COLLECTION_TYPE_NODE);

		simpleTypeNodeEClass = createEClass(SIMPLE_TYPE_NODE);

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
		nsImportNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
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
		javaTypeNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		test_expressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
		expressionNodeEClass.getESuperTypes().add(theNodePackage.getCompositeNode());
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
		initEReference(getFileNode_Decl(), theNodePackage.getCompositeNode(), null, "decl", null, 0, -1, FileNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileNode_Imp(), theNodePackage.getCompositeNode(), null, "imp", null, 0, -1, FileNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nsImportNodeEClass, NsImportNode.class, "NsImportNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNsImportNode_Ns(), theNodePackage.getCompositeNode(), null, "ns", null, 0, 1, NsImportNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionNodeEClass, DefinitionNode.class, "DefinitionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionNode_Name(), theNodePackage.getCompositeNode(), null, "name", null, 0, 1, DefinitionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionAroundNodeEClass, DefinitionAroundNode.class, "DefinitionAroundNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceNodeEClass, SequenceNode.class, "SequenceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textSequenceNodeEClass, TextSequenceNode.class, "TextSequenceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textNodeEClass, TextNode.class, "TextNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorStatementNodeEClass, ErrorStatementNode.class, "ErrorStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expandStatementNodeEClass, ExpandStatementNode.class, "ExpandStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionStmtNodeEClass, ExpressionStmtNode.class, "ExpressionStmtNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileStatementNodeEClass, FileStatementNode.class, "FileStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(foreachStatementNodeEClass, ForeachStatementNode.class, "ForeachStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifStatementNodeEClass, IfStatementNode.class, "IfStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elseIfStatementNodeEClass, ElseIfStatementNode.class, "ElseIfStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elseStatementNodeEClass, ElseStatementNode.class, "ElseStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(letStatementNodeEClass, LetStatementNode.class, "LetStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protectStatementNodeEClass, ProtectStatementNode.class, "ProtectStatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkNodeEClass, CheckNode.class, "CheckNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aroundNodeEClass, AroundNode.class, "AroundNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointcutNodeEClass, PointcutNode.class, "PointcutNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extensionNodeEClass, ExtensionNode.class, "ExtensionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaTypeNodeEClass, JavaTypeNode.class, "JavaTypeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(test_expressionNodeEClass, Test_expressionNode.class, "Test_expressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionNodeEClass, ExpressionNode.class, "ExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(letExpressionNodeEClass, LetExpressionNode.class, "LetExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(castedExpressionNodeEClass, CastedExpressionNode.class, "CastedExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chainExpressionNodeEClass, ChainExpressionNode.class, "ChainExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifExpressionNodeEClass, IfExpressionNode.class, "IfExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchExpressionNodeEClass, SwitchExpressionNode.class, "SwitchExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(casePartNodeEClass, CasePartNode.class, "CasePartNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orExpressionNodeEClass, OrExpressionNode.class, "OrExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andExpressionNodeEClass, AndExpressionNode.class, "AndExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(impliesExpressionNodeEClass, ImpliesExpressionNode.class, "ImpliesExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalExpressionNodeEClass, RelationalExpressionNode.class, "RelationalExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additiveExpressionNodeEClass, AdditiveExpressionNode.class, "AdditiveExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicativeExpressionNodeEClass, MultiplicativeExpressionNode.class, "MultiplicativeExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryExpressionNodeEClass, UnaryExpressionNode.class, "UnaryExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infixExpressionNodeEClass, InfixExpressionNode.class, "InfixExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringLiteralNodeEClass, StringLiteralNode.class, "StringLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paranthesizedExpressionNodeEClass, ParanthesizedExpressionNode.class, "ParanthesizedExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalVarExpressionNodeEClass, GlobalVarExpressionNode.class, "GlobalVarExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureCallNodeEClass, FeatureCallNode.class, "FeatureCallNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listLiteralNodeEClass, ListLiteralNode.class, "ListLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constructorCallNodeEClass, ConstructorCallNode.class, "ConstructorCallNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanLiteralNodeEClass, BooleanLiteralNode.class, "BooleanLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nullLiteralNodeEClass, NullLiteralNode.class, "NullLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberLiteralNodeEClass, NumberLiteralNode.class, "NumberLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionExpressionNodeEClass, CollectionExpressionNode.class, "CollectionExpressionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declaredParameterListNodeEClass, DeclaredParameterListNode.class, "DeclaredParameterListNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declaredParameterNodeEClass, DeclaredParameterNode.class, "DeclaredParameterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterListNodeEClass, ParameterListNode.class, "ParameterListNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionTypeNodeEClass, CollectionTypeNode.class, "CollectionTypeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleTypeNodeEClass, SimpleTypeNode.class, "SimpleTypeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identifierNodeEClass, IdentifierNode.class, "IdentifierNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Xpand3nodePackageImpl
