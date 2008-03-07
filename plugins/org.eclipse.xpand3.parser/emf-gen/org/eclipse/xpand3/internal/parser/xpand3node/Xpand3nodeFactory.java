/**
 * <copyright>
 * </copyright>
 *
 * $Id: Xpand3nodeFactory.java,v 1.3 2008/03/07 09:39:41 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage
 * @generated
 */
public interface Xpand3nodeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Xpand3nodeFactory eINSTANCE = org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Node</em>'.
	 * @generated
	 */
	FileNode createFileNode();

	/**
	 * Returns a new object of class '<em>Ns Import Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ns Import Node</em>'.
	 * @generated
	 */
	NsImportNode createNsImportNode();

	/**
	 * Returns a new object of class '<em>Definition Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Node</em>'.
	 * @generated
	 */
	DefinitionNode createDefinitionNode();

	/**
	 * Returns a new object of class '<em>Definition Around Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Around Node</em>'.
	 * @generated
	 */
	DefinitionAroundNode createDefinitionAroundNode();

	/**
	 * Returns a new object of class '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Node</em>'.
	 * @generated
	 */
	SequenceNode createSequenceNode();

	/**
	 * Returns a new object of class '<em>Text Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Sequence Node</em>'.
	 * @generated
	 */
	TextSequenceNode createTextSequenceNode();

	/**
	 * Returns a new object of class '<em>Text Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Node</em>'.
	 * @generated
	 */
	TextNode createTextNode();

	/**
	 * Returns a new object of class '<em>Error Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Statement Node</em>'.
	 * @generated
	 */
	ErrorStatementNode createErrorStatementNode();

	/**
	 * Returns a new object of class '<em>Expand Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expand Statement Node</em>'.
	 * @generated
	 */
	ExpandStatementNode createExpandStatementNode();

	/**
	 * Returns a new object of class '<em>Expression Stmt Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Stmt Node</em>'.
	 * @generated
	 */
	ExpressionStmtNode createExpressionStmtNode();

	/**
	 * Returns a new object of class '<em>File Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Statement Node</em>'.
	 * @generated
	 */
	FileStatementNode createFileStatementNode();

	/**
	 * Returns a new object of class '<em>Foreach Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreach Statement Node</em>'.
	 * @generated
	 */
	ForeachStatementNode createForeachStatementNode();

	/**
	 * Returns a new object of class '<em>If Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement Node</em>'.
	 * @generated
	 */
	IfStatementNode createIfStatementNode();

	/**
	 * Returns a new object of class '<em>Else If Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else If Statement Node</em>'.
	 * @generated
	 */
	ElseIfStatementNode createElseIfStatementNode();

	/**
	 * Returns a new object of class '<em>Else Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else Statement Node</em>'.
	 * @generated
	 */
	ElseStatementNode createElseStatementNode();

	/**
	 * Returns a new object of class '<em>Let Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Let Statement Node</em>'.
	 * @generated
	 */
	LetStatementNode createLetStatementNode();

	/**
	 * Returns a new object of class '<em>Protect Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protect Statement Node</em>'.
	 * @generated
	 */
	ProtectStatementNode createProtectStatementNode();

	/**
	 * Returns a new object of class '<em>Check Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Node</em>'.
	 * @generated
	 */
	CheckNode createCheckNode();

	/**
	 * Returns a new object of class '<em>Around Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Around Node</em>'.
	 * @generated
	 */
	AroundNode createAroundNode();

	/**
	 * Returns a new object of class '<em>Pointcut Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointcut Node</em>'.
	 * @generated
	 */
	PointcutNode createPointcutNode();

	/**
	 * Returns a new object of class '<em>Extension Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Node</em>'.
	 * @generated
	 */
	ExtensionNode createExtensionNode();

	/**
	 * Returns a new object of class '<em>Java Type Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Type Node</em>'.
	 * @generated
	 */
	JavaTypeNode createJavaTypeNode();

	/**
	 * Returns a new object of class '<em>Test expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test expression Node</em>'.
	 * @generated
	 */
	Test_expressionNode createTest_expressionNode();

	/**
	 * Returns a new object of class '<em>Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Node</em>'.
	 * @generated
	 */
	ExpressionNode createExpressionNode();

	/**
	 * Returns a new object of class '<em>Let Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Let Expression Node</em>'.
	 * @generated
	 */
	LetExpressionNode createLetExpressionNode();

	/**
	 * Returns a new object of class '<em>Casted Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Casted Expression Node</em>'.
	 * @generated
	 */
	CastedExpressionNode createCastedExpressionNode();

	/**
	 * Returns a new object of class '<em>Chain Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain Expression Node</em>'.
	 * @generated
	 */
	ChainExpressionNode createChainExpressionNode();

	/**
	 * Returns a new object of class '<em>If Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Expression Node</em>'.
	 * @generated
	 */
	IfExpressionNode createIfExpressionNode();

	/**
	 * Returns a new object of class '<em>Switch Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Expression Node</em>'.
	 * @generated
	 */
	SwitchExpressionNode createSwitchExpressionNode();

	/**
	 * Returns a new object of class '<em>Case Part Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Part Node</em>'.
	 * @generated
	 */
	CasePartNode createCasePartNode();

	/**
	 * Returns a new object of class '<em>Or Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Expression Node</em>'.
	 * @generated
	 */
	OrExpressionNode createOrExpressionNode();

	/**
	 * Returns a new object of class '<em>And Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Expression Node</em>'.
	 * @generated
	 */
	AndExpressionNode createAndExpressionNode();

	/**
	 * Returns a new object of class '<em>Implies Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implies Expression Node</em>'.
	 * @generated
	 */
	ImpliesExpressionNode createImpliesExpressionNode();

	/**
	 * Returns a new object of class '<em>Relational Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Expression Node</em>'.
	 * @generated
	 */
	RelationalExpressionNode createRelationalExpressionNode();

	/**
	 * Returns a new object of class '<em>Additive Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additive Expression Node</em>'.
	 * @generated
	 */
	AdditiveExpressionNode createAdditiveExpressionNode();

	/**
	 * Returns a new object of class '<em>Multiplicative Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicative Expression Node</em>'.
	 * @generated
	 */
	MultiplicativeExpressionNode createMultiplicativeExpressionNode();

	/**
	 * Returns a new object of class '<em>Unary Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression Node</em>'.
	 * @generated
	 */
	UnaryExpressionNode createUnaryExpressionNode();

	/**
	 * Returns a new object of class '<em>Infix Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infix Expression Node</em>'.
	 * @generated
	 */
	InfixExpressionNode createInfixExpressionNode();

	/**
	 * Returns a new object of class '<em>String Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal Node</em>'.
	 * @generated
	 */
	StringLiteralNode createStringLiteralNode();

	/**
	 * Returns a new object of class '<em>Paranthesized Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paranthesized Expression Node</em>'.
	 * @generated
	 */
	ParanthesizedExpressionNode createParanthesizedExpressionNode();

	/**
	 * Returns a new object of class '<em>Global Var Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Var Expression Node</em>'.
	 * @generated
	 */
	GlobalVarExpressionNode createGlobalVarExpressionNode();

	/**
	 * Returns a new object of class '<em>Feature Call Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Call Node</em>'.
	 * @generated
	 */
	FeatureCallNode createFeatureCallNode();

	/**
	 * Returns a new object of class '<em>List Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Literal Node</em>'.
	 * @generated
	 */
	ListLiteralNode createListLiteralNode();

	/**
	 * Returns a new object of class '<em>Constructor Call Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Call Node</em>'.
	 * @generated
	 */
	ConstructorCallNode createConstructorCallNode();

	/**
	 * Returns a new object of class '<em>Boolean Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal Node</em>'.
	 * @generated
	 */
	BooleanLiteralNode createBooleanLiteralNode();

	/**
	 * Returns a new object of class '<em>Null Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Literal Node</em>'.
	 * @generated
	 */
	NullLiteralNode createNullLiteralNode();

	/**
	 * Returns a new object of class '<em>Number Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Literal Node</em>'.
	 * @generated
	 */
	NumberLiteralNode createNumberLiteralNode();

	/**
	 * Returns a new object of class '<em>Collection Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Expression Node</em>'.
	 * @generated
	 */
	CollectionExpressionNode createCollectionExpressionNode();

	/**
	 * Returns a new object of class '<em>Declared Parameter List Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Parameter List Node</em>'.
	 * @generated
	 */
	DeclaredParameterListNode createDeclaredParameterListNode();

	/**
	 * Returns a new object of class '<em>Declared Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Parameter Node</em>'.
	 * @generated
	 */
	DeclaredParameterNode createDeclaredParameterNode();

	/**
	 * Returns a new object of class '<em>Parameter List Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter List Node</em>'.
	 * @generated
	 */
	ParameterListNode createParameterListNode();

	/**
	 * Returns a new object of class '<em>Collection Type Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Type Node</em>'.
	 * @generated
	 */
	CollectionTypeNode createCollectionTypeNode();

	/**
	 * Returns a new object of class '<em>Simple Type Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Type Node</em>'.
	 * @generated
	 */
	SimpleTypeNode createSimpleTypeNode();

	/**
	 * Returns a new object of class '<em>Identifier Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier Node</em>'.
	 * @generated
	 */
	IdentifierNode createIdentifierNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Xpand3nodePackage getXpand3nodePackage();

} //Xpand3nodeFactory
