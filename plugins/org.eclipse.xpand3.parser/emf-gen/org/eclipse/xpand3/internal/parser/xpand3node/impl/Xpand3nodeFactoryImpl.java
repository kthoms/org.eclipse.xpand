/**
 * <copyright>
 * </copyright>
 *
 * $Id: Xpand3nodeFactoryImpl.java,v 1.6 2008/03/13 08:40:01 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xpand3.internal.parser.xpand3node.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Xpand3nodeFactoryImpl extends EFactoryImpl implements Xpand3nodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Xpand3nodeFactory init() {
		try {
			Xpand3nodeFactory theXpand3nodeFactory = (Xpand3nodeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/tmf/common/Xpand3Node"); 
			if (theXpand3nodeFactory != null) {
				return theXpand3nodeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Xpand3nodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xpand3nodeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Xpand3nodePackage.FILE_NODE: return createFileNode();
			case Xpand3nodePackage.IMPORT_NODE: return createImportNode();
			case Xpand3nodePackage.EXTENSION_IMPORT_NODE: return createExtensionImportNode();
			case Xpand3nodePackage.DEFINITION_NODE: return createDefinitionNode();
			case Xpand3nodePackage.DEFINITION_AROUND_NODE: return createDefinitionAroundNode();
			case Xpand3nodePackage.SEQUENCE_NODE: return createSequenceNode();
			case Xpand3nodePackage.TEXT_SEQUENCE_NODE: return createTextSequenceNode();
			case Xpand3nodePackage.TEXT_NODE: return createTextNode();
			case Xpand3nodePackage.ERROR_STATEMENT_NODE: return createErrorStatementNode();
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE: return createExpandStatementNode();
			case Xpand3nodePackage.EXPRESSION_STMT_NODE: return createExpressionStmtNode();
			case Xpand3nodePackage.FILE_STATEMENT_NODE: return createFileStatementNode();
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE: return createForeachStatementNode();
			case Xpand3nodePackage.IF_STATEMENT_NODE: return createIfStatementNode();
			case Xpand3nodePackage.ELSE_IF_STATEMENT_NODE: return createElseIfStatementNode();
			case Xpand3nodePackage.ELSE_STATEMENT_NODE: return createElseStatementNode();
			case Xpand3nodePackage.LET_STATEMENT_NODE: return createLetStatementNode();
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE: return createProtectStatementNode();
			case Xpand3nodePackage.CHECK_NODE: return createCheckNode();
			case Xpand3nodePackage.AROUND_NODE: return createAroundNode();
			case Xpand3nodePackage.POINTCUT_NODE: return createPointcutNode();
			case Xpand3nodePackage.EXTENSION_NODE: return createExtensionNode();
			case Xpand3nodePackage.JAVA_TYPE_NODE: return createJavaTypeNode();
			case Xpand3nodePackage.TEST_EXPRESSION_NODE: return createTest_expressionNode();
			case Xpand3nodePackage.LET_EXPRESSION_NODE: return createLetExpressionNode();
			case Xpand3nodePackage.CASTED_EXPRESSION_NODE: return createCastedExpressionNode();
			case Xpand3nodePackage.CHAIN_EXPRESSION_NODE: return createChainExpressionNode();
			case Xpand3nodePackage.IF_EXPRESSION_NODE: return createIfExpressionNode();
			case Xpand3nodePackage.SWITCH_EXPRESSION_NODE: return createSwitchExpressionNode();
			case Xpand3nodePackage.CASE_PART_NODE: return createCasePartNode();
			case Xpand3nodePackage.OR_EXPRESSION_NODE: return createOrExpressionNode();
			case Xpand3nodePackage.AND_EXPRESSION_NODE: return createAndExpressionNode();
			case Xpand3nodePackage.IMPLIES_EXPRESSION_NODE: return createImpliesExpressionNode();
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE: return createRelationalExpressionNode();
			case Xpand3nodePackage.ADDITIVE_EXPRESSION_NODE: return createAdditiveExpressionNode();
			case Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE: return createMultiplicativeExpressionNode();
			case Xpand3nodePackage.UNARY_EXPRESSION_NODE: return createUnaryExpressionNode();
			case Xpand3nodePackage.INFIX_EXPRESSION_NODE: return createInfixExpressionNode();
			case Xpand3nodePackage.STRING_LITERAL_NODE: return createStringLiteralNode();
			case Xpand3nodePackage.PARANTHESIZED_EXPRESSION_NODE: return createParanthesizedExpressionNode();
			case Xpand3nodePackage.GLOBAL_VAR_EXPRESSION_NODE: return createGlobalVarExpressionNode();
			case Xpand3nodePackage.FEATURE_CALL_NODE: return createFeatureCallNode();
			case Xpand3nodePackage.LIST_LITERAL_NODE: return createListLiteralNode();
			case Xpand3nodePackage.CONSTRUCTOR_CALL_NODE: return createConstructorCallNode();
			case Xpand3nodePackage.BOOLEAN_LITERAL_NODE: return createBooleanLiteralNode();
			case Xpand3nodePackage.NULL_LITERAL_NODE: return createNullLiteralNode();
			case Xpand3nodePackage.NUMBER_LITERAL_NODE: return createNumberLiteralNode();
			case Xpand3nodePackage.COLLECTION_EXPRESSION_NODE: return createCollectionExpressionNode();
			case Xpand3nodePackage.DECLARED_PARAMETER_LIST_NODE: return createDeclaredParameterListNode();
			case Xpand3nodePackage.DECLARED_PARAMETER_NODE: return createDeclaredParameterNode();
			case Xpand3nodePackage.PARAMETER_LIST_NODE: return createParameterListNode();
			case Xpand3nodePackage.COLLECTION_TYPE_NODE: return createCollectionTypeNode();
			case Xpand3nodePackage.SIMPLE_TYPE_NODE: return createSimpleTypeNode();
			case Xpand3nodePackage.IDENTIFIER_NODE: return createIdentifierNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNode createFileNode() {
		FileNodeImpl fileNode = new FileNodeImpl();
		return fileNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportNode createImportNode() {
		ImportNodeImpl importNode = new ImportNodeImpl();
		return importNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionImportNode createExtensionImportNode() {
		ExtensionImportNodeImpl extensionImportNode = new ExtensionImportNodeImpl();
		return extensionImportNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionNode createDefinitionNode() {
		DefinitionNodeImpl definitionNode = new DefinitionNodeImpl();
		return definitionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionAroundNode createDefinitionAroundNode() {
		DefinitionAroundNodeImpl definitionAroundNode = new DefinitionAroundNodeImpl();
		return definitionAroundNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceNode createSequenceNode() {
		SequenceNodeImpl sequenceNode = new SequenceNodeImpl();
		return sequenceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSequenceNode createTextSequenceNode() {
		TextSequenceNodeImpl textSequenceNode = new TextSequenceNodeImpl();
		return textSequenceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextNode createTextNode() {
		TextNodeImpl textNode = new TextNodeImpl();
		return textNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorStatementNode createErrorStatementNode() {
		ErrorStatementNodeImpl errorStatementNode = new ErrorStatementNodeImpl();
		return errorStatementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandStatementNode createExpandStatementNode() {
		ExpandStatementNodeImpl expandStatementNode = new ExpandStatementNodeImpl();
		return expandStatementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStmtNode createExpressionStmtNode() {
		ExpressionStmtNodeImpl expressionStmtNode = new ExpressionStmtNodeImpl();
		return expressionStmtNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileStatementNode createFileStatementNode() {
		FileStatementNodeImpl fileStatementNode = new FileStatementNodeImpl();
		return fileStatementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeachStatementNode createForeachStatementNode() {
		ForeachStatementNodeImpl foreachStatementNode = new ForeachStatementNodeImpl();
		return foreachStatementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatementNode createIfStatementNode() {
		IfStatementNodeImpl ifStatementNode = new IfStatementNodeImpl();
		return ifStatementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseIfStatementNode createElseIfStatementNode() {
		ElseIfStatementNodeImpl elseIfStatementNode = new ElseIfStatementNodeImpl();
		return elseIfStatementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseStatementNode createElseStatementNode() {
		ElseStatementNodeImpl elseStatementNode = new ElseStatementNodeImpl();
		return elseStatementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetStatementNode createLetStatementNode() {
		LetStatementNodeImpl letStatementNode = new LetStatementNodeImpl();
		return letStatementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectStatementNode createProtectStatementNode() {
		ProtectStatementNodeImpl protectStatementNode = new ProtectStatementNodeImpl();
		return protectStatementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckNode createCheckNode() {
		CheckNodeImpl checkNode = new CheckNodeImpl();
		return checkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AroundNode createAroundNode() {
		AroundNodeImpl aroundNode = new AroundNodeImpl();
		return aroundNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointcutNode createPointcutNode() {
		PointcutNodeImpl pointcutNode = new PointcutNodeImpl();
		return pointcutNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionNode createExtensionNode() {
		ExtensionNodeImpl extensionNode = new ExtensionNodeImpl();
		return extensionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaTypeNode createJavaTypeNode() {
		JavaTypeNodeImpl javaTypeNode = new JavaTypeNodeImpl();
		return javaTypeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test_expressionNode createTest_expressionNode() {
		Test_expressionNodeImpl test_expressionNode = new Test_expressionNodeImpl();
		return test_expressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExpressionNode createLetExpressionNode() {
		LetExpressionNodeImpl letExpressionNode = new LetExpressionNodeImpl();
		return letExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastedExpressionNode createCastedExpressionNode() {
		CastedExpressionNodeImpl castedExpressionNode = new CastedExpressionNodeImpl();
		return castedExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainExpressionNode createChainExpressionNode() {
		ChainExpressionNodeImpl chainExpressionNode = new ChainExpressionNodeImpl();
		return chainExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExpressionNode createIfExpressionNode() {
		IfExpressionNodeImpl ifExpressionNode = new IfExpressionNodeImpl();
		return ifExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchExpressionNode createSwitchExpressionNode() {
		SwitchExpressionNodeImpl switchExpressionNode = new SwitchExpressionNodeImpl();
		return switchExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePartNode createCasePartNode() {
		CasePartNodeImpl casePartNode = new CasePartNodeImpl();
		return casePartNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrExpressionNode createOrExpressionNode() {
		OrExpressionNodeImpl orExpressionNode = new OrExpressionNodeImpl();
		return orExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExpressionNode createAndExpressionNode() {
		AndExpressionNodeImpl andExpressionNode = new AndExpressionNodeImpl();
		return andExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpliesExpressionNode createImpliesExpressionNode() {
		ImpliesExpressionNodeImpl impliesExpressionNode = new ImpliesExpressionNodeImpl();
		return impliesExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpressionNode createRelationalExpressionNode() {
		RelationalExpressionNodeImpl relationalExpressionNode = new RelationalExpressionNodeImpl();
		return relationalExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditiveExpressionNode createAdditiveExpressionNode() {
		AdditiveExpressionNodeImpl additiveExpressionNode = new AdditiveExpressionNodeImpl();
		return additiveExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicativeExpressionNode createMultiplicativeExpressionNode() {
		MultiplicativeExpressionNodeImpl multiplicativeExpressionNode = new MultiplicativeExpressionNodeImpl();
		return multiplicativeExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpressionNode createUnaryExpressionNode() {
		UnaryExpressionNodeImpl unaryExpressionNode = new UnaryExpressionNodeImpl();
		return unaryExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixExpressionNode createInfixExpressionNode() {
		InfixExpressionNodeImpl infixExpressionNode = new InfixExpressionNodeImpl();
		return infixExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteralNode createStringLiteralNode() {
		StringLiteralNodeImpl stringLiteralNode = new StringLiteralNodeImpl();
		return stringLiteralNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParanthesizedExpressionNode createParanthesizedExpressionNode() {
		ParanthesizedExpressionNodeImpl paranthesizedExpressionNode = new ParanthesizedExpressionNodeImpl();
		return paranthesizedExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVarExpressionNode createGlobalVarExpressionNode() {
		GlobalVarExpressionNodeImpl globalVarExpressionNode = new GlobalVarExpressionNodeImpl();
		return globalVarExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCallNode createFeatureCallNode() {
		FeatureCallNodeImpl featureCallNode = new FeatureCallNodeImpl();
		return featureCallNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListLiteralNode createListLiteralNode() {
		ListLiteralNodeImpl listLiteralNode = new ListLiteralNodeImpl();
		return listLiteralNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorCallNode createConstructorCallNode() {
		ConstructorCallNodeImpl constructorCallNode = new ConstructorCallNodeImpl();
		return constructorCallNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteralNode createBooleanLiteralNode() {
		BooleanLiteralNodeImpl booleanLiteralNode = new BooleanLiteralNodeImpl();
		return booleanLiteralNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteralNode createNullLiteralNode() {
		NullLiteralNodeImpl nullLiteralNode = new NullLiteralNodeImpl();
		return nullLiteralNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberLiteralNode createNumberLiteralNode() {
		NumberLiteralNodeImpl numberLiteralNode = new NumberLiteralNodeImpl();
		return numberLiteralNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionExpressionNode createCollectionExpressionNode() {
		CollectionExpressionNodeImpl collectionExpressionNode = new CollectionExpressionNodeImpl();
		return collectionExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredParameterListNode createDeclaredParameterListNode() {
		DeclaredParameterListNodeImpl declaredParameterListNode = new DeclaredParameterListNodeImpl();
		return declaredParameterListNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredParameterNode createDeclaredParameterNode() {
		DeclaredParameterNodeImpl declaredParameterNode = new DeclaredParameterNodeImpl();
		return declaredParameterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterListNode createParameterListNode() {
		ParameterListNodeImpl parameterListNode = new ParameterListNodeImpl();
		return parameterListNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTypeNode createCollectionTypeNode() {
		CollectionTypeNodeImpl collectionTypeNode = new CollectionTypeNodeImpl();
		return collectionTypeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeNode createSimpleTypeNode() {
		SimpleTypeNodeImpl simpleTypeNode = new SimpleTypeNodeImpl();
		return simpleTypeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierNode createIdentifierNode() {
		IdentifierNodeImpl identifierNode = new IdentifierNodeImpl();
		return identifierNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xpand3nodePackage getXpand3nodePackage() {
		return (Xpand3nodePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Xpand3nodePackage getPackage() {
		return Xpand3nodePackage.eINSTANCE;
	}

} //Xpand3nodeFactoryImpl
