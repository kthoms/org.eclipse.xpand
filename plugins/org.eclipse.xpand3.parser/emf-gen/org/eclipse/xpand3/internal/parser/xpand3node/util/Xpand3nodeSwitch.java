/**
 * <copyright>
 * </copyright>
 *
 * $Id: Xpand3nodeSwitch.java,v 1.1 2008/03/06 08:55:16 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.Node;

import org.eclipse.xpand3.internal.parser.xpand3node.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage
 * @generated
 */
public class Xpand3nodeSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Xpand3nodePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xpand3nodeSwitch() {
		if (modelPackage == null) {
			modelPackage = Xpand3nodePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Xpand3nodePackage.FILE_NODE: {
				FileNode fileNode = (FileNode)theEObject;
				T result = caseFileNode(fileNode);
				if (result == null) result = caseCompositeNode(fileNode);
				if (result == null) result = caseNode(fileNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.NS_IMPORT_NODE: {
				NsImportNode nsImportNode = (NsImportNode)theEObject;
				T result = caseNsImportNode(nsImportNode);
				if (result == null) result = caseCompositeNode(nsImportNode);
				if (result == null) result = caseNode(nsImportNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.DEFINITION_NODE: {
				DefinitionNode definitionNode = (DefinitionNode)theEObject;
				T result = caseDefinitionNode(definitionNode);
				if (result == null) result = caseCompositeNode(definitionNode);
				if (result == null) result = caseNode(definitionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.DEFINITION_AROUND_NODE: {
				DefinitionAroundNode definitionAroundNode = (DefinitionAroundNode)theEObject;
				T result = caseDefinitionAroundNode(definitionAroundNode);
				if (result == null) result = caseCompositeNode(definitionAroundNode);
				if (result == null) result = caseNode(definitionAroundNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.SEQUENCE_NODE: {
				SequenceNode sequenceNode = (SequenceNode)theEObject;
				T result = caseSequenceNode(sequenceNode);
				if (result == null) result = caseCompositeNode(sequenceNode);
				if (result == null) result = caseNode(sequenceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.TEXT_SEQUENCE_NODE: {
				TextSequenceNode textSequenceNode = (TextSequenceNode)theEObject;
				T result = caseTextSequenceNode(textSequenceNode);
				if (result == null) result = caseCompositeNode(textSequenceNode);
				if (result == null) result = caseNode(textSequenceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.TEXT_NODE: {
				TextNode textNode = (TextNode)theEObject;
				T result = caseTextNode(textNode);
				if (result == null) result = caseCompositeNode(textNode);
				if (result == null) result = caseNode(textNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.ERROR_STATEMENT_NODE: {
				ErrorStatementNode errorStatementNode = (ErrorStatementNode)theEObject;
				T result = caseErrorStatementNode(errorStatementNode);
				if (result == null) result = caseCompositeNode(errorStatementNode);
				if (result == null) result = caseNode(errorStatementNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.EXPAND_STATEMENT_NODE: {
				ExpandStatementNode expandStatementNode = (ExpandStatementNode)theEObject;
				T result = caseExpandStatementNode(expandStatementNode);
				if (result == null) result = caseCompositeNode(expandStatementNode);
				if (result == null) result = caseNode(expandStatementNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.EXPRESSION_STMT_NODE: {
				ExpressionStmtNode expressionStmtNode = (ExpressionStmtNode)theEObject;
				T result = caseExpressionStmtNode(expressionStmtNode);
				if (result == null) result = caseCompositeNode(expressionStmtNode);
				if (result == null) result = caseNode(expressionStmtNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.FILE_STATEMENT_NODE: {
				FileStatementNode fileStatementNode = (FileStatementNode)theEObject;
				T result = caseFileStatementNode(fileStatementNode);
				if (result == null) result = caseCompositeNode(fileStatementNode);
				if (result == null) result = caseNode(fileStatementNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.FOREACH_STATEMENT_NODE: {
				ForeachStatementNode foreachStatementNode = (ForeachStatementNode)theEObject;
				T result = caseForeachStatementNode(foreachStatementNode);
				if (result == null) result = caseCompositeNode(foreachStatementNode);
				if (result == null) result = caseNode(foreachStatementNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.IF_STATEMENT_NODE: {
				IfStatementNode ifStatementNode = (IfStatementNode)theEObject;
				T result = caseIfStatementNode(ifStatementNode);
				if (result == null) result = caseCompositeNode(ifStatementNode);
				if (result == null) result = caseNode(ifStatementNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.ELSE_IF_STATEMENT_NODE: {
				ElseIfStatementNode elseIfStatementNode = (ElseIfStatementNode)theEObject;
				T result = caseElseIfStatementNode(elseIfStatementNode);
				if (result == null) result = caseCompositeNode(elseIfStatementNode);
				if (result == null) result = caseNode(elseIfStatementNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.ELSE_STATEMENT_NODE: {
				ElseStatementNode elseStatementNode = (ElseStatementNode)theEObject;
				T result = caseElseStatementNode(elseStatementNode);
				if (result == null) result = caseCompositeNode(elseStatementNode);
				if (result == null) result = caseNode(elseStatementNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.LET_STATEMENT_NODE: {
				LetStatementNode letStatementNode = (LetStatementNode)theEObject;
				T result = caseLetStatementNode(letStatementNode);
				if (result == null) result = caseCompositeNode(letStatementNode);
				if (result == null) result = caseNode(letStatementNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.PROTECT_STATEMENT_NODE: {
				ProtectStatementNode protectStatementNode = (ProtectStatementNode)theEObject;
				T result = caseProtectStatementNode(protectStatementNode);
				if (result == null) result = caseCompositeNode(protectStatementNode);
				if (result == null) result = caseNode(protectStatementNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.CHECK_NODE: {
				CheckNode checkNode = (CheckNode)theEObject;
				T result = caseCheckNode(checkNode);
				if (result == null) result = caseCompositeNode(checkNode);
				if (result == null) result = caseNode(checkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.AROUND_NODE: {
				AroundNode aroundNode = (AroundNode)theEObject;
				T result = caseAroundNode(aroundNode);
				if (result == null) result = caseCompositeNode(aroundNode);
				if (result == null) result = caseNode(aroundNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.POINTCUT_NODE: {
				PointcutNode pointcutNode = (PointcutNode)theEObject;
				T result = casePointcutNode(pointcutNode);
				if (result == null) result = caseCompositeNode(pointcutNode);
				if (result == null) result = caseNode(pointcutNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.EXTENSION_NODE: {
				ExtensionNode extensionNode = (ExtensionNode)theEObject;
				T result = caseExtensionNode(extensionNode);
				if (result == null) result = caseCompositeNode(extensionNode);
				if (result == null) result = caseNode(extensionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.JAVA_TYPE_NODE: {
				JavaTypeNode javaTypeNode = (JavaTypeNode)theEObject;
				T result = caseJavaTypeNode(javaTypeNode);
				if (result == null) result = caseCompositeNode(javaTypeNode);
				if (result == null) result = caseNode(javaTypeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.TEST_EXPRESSION_NODE: {
				Test_expressionNode test_expressionNode = (Test_expressionNode)theEObject;
				T result = caseTest_expressionNode(test_expressionNode);
				if (result == null) result = caseCompositeNode(test_expressionNode);
				if (result == null) result = caseNode(test_expressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.EXPRESSION_NODE: {
				ExpressionNode expressionNode = (ExpressionNode)theEObject;
				T result = caseExpressionNode(expressionNode);
				if (result == null) result = caseCompositeNode(expressionNode);
				if (result == null) result = caseNode(expressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.LET_EXPRESSION_NODE: {
				LetExpressionNode letExpressionNode = (LetExpressionNode)theEObject;
				T result = caseLetExpressionNode(letExpressionNode);
				if (result == null) result = caseCompositeNode(letExpressionNode);
				if (result == null) result = caseNode(letExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.CASTED_EXPRESSION_NODE: {
				CastedExpressionNode castedExpressionNode = (CastedExpressionNode)theEObject;
				T result = caseCastedExpressionNode(castedExpressionNode);
				if (result == null) result = caseCompositeNode(castedExpressionNode);
				if (result == null) result = caseNode(castedExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.CHAIN_EXPRESSION_NODE: {
				ChainExpressionNode chainExpressionNode = (ChainExpressionNode)theEObject;
				T result = caseChainExpressionNode(chainExpressionNode);
				if (result == null) result = caseCompositeNode(chainExpressionNode);
				if (result == null) result = caseNode(chainExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.IF_EXPRESSION_NODE: {
				IfExpressionNode ifExpressionNode = (IfExpressionNode)theEObject;
				T result = caseIfExpressionNode(ifExpressionNode);
				if (result == null) result = caseCompositeNode(ifExpressionNode);
				if (result == null) result = caseNode(ifExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.SWITCH_EXPRESSION_NODE: {
				SwitchExpressionNode switchExpressionNode = (SwitchExpressionNode)theEObject;
				T result = caseSwitchExpressionNode(switchExpressionNode);
				if (result == null) result = caseCompositeNode(switchExpressionNode);
				if (result == null) result = caseNode(switchExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.CASE_PART_NODE: {
				CasePartNode casePartNode = (CasePartNode)theEObject;
				T result = caseCasePartNode(casePartNode);
				if (result == null) result = caseCompositeNode(casePartNode);
				if (result == null) result = caseNode(casePartNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.OR_EXPRESSION_NODE: {
				OrExpressionNode orExpressionNode = (OrExpressionNode)theEObject;
				T result = caseOrExpressionNode(orExpressionNode);
				if (result == null) result = caseCompositeNode(orExpressionNode);
				if (result == null) result = caseNode(orExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.AND_EXPRESSION_NODE: {
				AndExpressionNode andExpressionNode = (AndExpressionNode)theEObject;
				T result = caseAndExpressionNode(andExpressionNode);
				if (result == null) result = caseCompositeNode(andExpressionNode);
				if (result == null) result = caseNode(andExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.IMPLIES_EXPRESSION_NODE: {
				ImpliesExpressionNode impliesExpressionNode = (ImpliesExpressionNode)theEObject;
				T result = caseImpliesExpressionNode(impliesExpressionNode);
				if (result == null) result = caseCompositeNode(impliesExpressionNode);
				if (result == null) result = caseNode(impliesExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE: {
				RelationalExpressionNode relationalExpressionNode = (RelationalExpressionNode)theEObject;
				T result = caseRelationalExpressionNode(relationalExpressionNode);
				if (result == null) result = caseCompositeNode(relationalExpressionNode);
				if (result == null) result = caseNode(relationalExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.ADDITIVE_EXPRESSION_NODE: {
				AdditiveExpressionNode additiveExpressionNode = (AdditiveExpressionNode)theEObject;
				T result = caseAdditiveExpressionNode(additiveExpressionNode);
				if (result == null) result = caseCompositeNode(additiveExpressionNode);
				if (result == null) result = caseNode(additiveExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE: {
				MultiplicativeExpressionNode multiplicativeExpressionNode = (MultiplicativeExpressionNode)theEObject;
				T result = caseMultiplicativeExpressionNode(multiplicativeExpressionNode);
				if (result == null) result = caseCompositeNode(multiplicativeExpressionNode);
				if (result == null) result = caseNode(multiplicativeExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.UNARY_EXPRESSION_NODE: {
				UnaryExpressionNode unaryExpressionNode = (UnaryExpressionNode)theEObject;
				T result = caseUnaryExpressionNode(unaryExpressionNode);
				if (result == null) result = caseCompositeNode(unaryExpressionNode);
				if (result == null) result = caseNode(unaryExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.INFIX_EXPRESSION_NODE: {
				InfixExpressionNode infixExpressionNode = (InfixExpressionNode)theEObject;
				T result = caseInfixExpressionNode(infixExpressionNode);
				if (result == null) result = caseCompositeNode(infixExpressionNode);
				if (result == null) result = caseNode(infixExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.STRING_LITERAL_NODE: {
				StringLiteralNode stringLiteralNode = (StringLiteralNode)theEObject;
				T result = caseStringLiteralNode(stringLiteralNode);
				if (result == null) result = caseCompositeNode(stringLiteralNode);
				if (result == null) result = caseNode(stringLiteralNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.PARANTHESIZED_EXPRESSION_NODE: {
				ParanthesizedExpressionNode paranthesizedExpressionNode = (ParanthesizedExpressionNode)theEObject;
				T result = caseParanthesizedExpressionNode(paranthesizedExpressionNode);
				if (result == null) result = caseCompositeNode(paranthesizedExpressionNode);
				if (result == null) result = caseNode(paranthesizedExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.GLOBAL_VAR_EXPRESSION_NODE: {
				GlobalVarExpressionNode globalVarExpressionNode = (GlobalVarExpressionNode)theEObject;
				T result = caseGlobalVarExpressionNode(globalVarExpressionNode);
				if (result == null) result = caseCompositeNode(globalVarExpressionNode);
				if (result == null) result = caseNode(globalVarExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.FEATURE_CALL_NODE: {
				FeatureCallNode featureCallNode = (FeatureCallNode)theEObject;
				T result = caseFeatureCallNode(featureCallNode);
				if (result == null) result = caseCompositeNode(featureCallNode);
				if (result == null) result = caseNode(featureCallNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.LIST_LITERAL_NODE: {
				ListLiteralNode listLiteralNode = (ListLiteralNode)theEObject;
				T result = caseListLiteralNode(listLiteralNode);
				if (result == null) result = caseCompositeNode(listLiteralNode);
				if (result == null) result = caseNode(listLiteralNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.CONSTRUCTOR_CALL_NODE: {
				ConstructorCallNode constructorCallNode = (ConstructorCallNode)theEObject;
				T result = caseConstructorCallNode(constructorCallNode);
				if (result == null) result = caseCompositeNode(constructorCallNode);
				if (result == null) result = caseNode(constructorCallNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.BOOLEAN_LITERAL_NODE: {
				BooleanLiteralNode booleanLiteralNode = (BooleanLiteralNode)theEObject;
				T result = caseBooleanLiteralNode(booleanLiteralNode);
				if (result == null) result = caseCompositeNode(booleanLiteralNode);
				if (result == null) result = caseNode(booleanLiteralNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.NULL_LITERAL_NODE: {
				NullLiteralNode nullLiteralNode = (NullLiteralNode)theEObject;
				T result = caseNullLiteralNode(nullLiteralNode);
				if (result == null) result = caseCompositeNode(nullLiteralNode);
				if (result == null) result = caseNode(nullLiteralNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.NUMBER_LITERAL_NODE: {
				NumberLiteralNode numberLiteralNode = (NumberLiteralNode)theEObject;
				T result = caseNumberLiteralNode(numberLiteralNode);
				if (result == null) result = caseCompositeNode(numberLiteralNode);
				if (result == null) result = caseNode(numberLiteralNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.COLLECTION_EXPRESSION_NODE: {
				CollectionExpressionNode collectionExpressionNode = (CollectionExpressionNode)theEObject;
				T result = caseCollectionExpressionNode(collectionExpressionNode);
				if (result == null) result = caseCompositeNode(collectionExpressionNode);
				if (result == null) result = caseNode(collectionExpressionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.DECLARED_PARAMETER_LIST_NODE: {
				DeclaredParameterListNode declaredParameterListNode = (DeclaredParameterListNode)theEObject;
				T result = caseDeclaredParameterListNode(declaredParameterListNode);
				if (result == null) result = caseCompositeNode(declaredParameterListNode);
				if (result == null) result = caseNode(declaredParameterListNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.DECLARED_PARAMETER_NODE: {
				DeclaredParameterNode declaredParameterNode = (DeclaredParameterNode)theEObject;
				T result = caseDeclaredParameterNode(declaredParameterNode);
				if (result == null) result = caseCompositeNode(declaredParameterNode);
				if (result == null) result = caseNode(declaredParameterNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.PARAMETER_LIST_NODE: {
				ParameterListNode parameterListNode = (ParameterListNode)theEObject;
				T result = caseParameterListNode(parameterListNode);
				if (result == null) result = caseCompositeNode(parameterListNode);
				if (result == null) result = caseNode(parameterListNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.COLLECTION_TYPE_NODE: {
				CollectionTypeNode collectionTypeNode = (CollectionTypeNode)theEObject;
				T result = caseCollectionTypeNode(collectionTypeNode);
				if (result == null) result = caseCompositeNode(collectionTypeNode);
				if (result == null) result = caseNode(collectionTypeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.SIMPLE_TYPE_NODE: {
				SimpleTypeNode simpleTypeNode = (SimpleTypeNode)theEObject;
				T result = caseSimpleTypeNode(simpleTypeNode);
				if (result == null) result = caseCompositeNode(simpleTypeNode);
				if (result == null) result = caseNode(simpleTypeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xpand3nodePackage.IDENTIFIER_NODE: {
				IdentifierNode identifierNode = (IdentifierNode)theEObject;
				T result = caseIdentifierNode(identifierNode);
				if (result == null) result = caseCompositeNode(identifierNode);
				if (result == null) result = caseNode(identifierNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileNode(FileNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ns Import Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ns Import Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNsImportNode(NsImportNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionNode(DefinitionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Around Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Around Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionAroundNode(DefinitionAroundNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceNode(SequenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Sequence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextSequenceNode(TextSequenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextNode(TextNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Statement Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorStatementNode(ErrorStatementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expand Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expand Statement Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpandStatementNode(ExpandStatementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Stmt Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Stmt Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStmtNode(ExpressionStmtNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Statement Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileStatementNode(FileStatementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreach Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreach Statement Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeachStatementNode(ForeachStatementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatementNode(IfStatementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else If Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else If Statement Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseIfStatementNode(ElseIfStatementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else Statement Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseStatementNode(ElseStatementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Let Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Statement Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetStatementNode(LetStatementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protect Statement Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protect Statement Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectStatementNode(ProtectStatementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckNode(CheckNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Around Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Around Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAroundNode(AroundNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointcut Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointcut Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointcutNode(PointcutNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionNode(ExtensionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Type Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Type Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaTypeNode(JavaTypeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest_expressionNode(Test_expressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionNode(ExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Let Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetExpressionNode(LetExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Casted Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Casted Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCastedExpressionNode(CastedExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainExpressionNode(ChainExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfExpressionNode(IfExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchExpressionNode(SwitchExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Part Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Part Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasePartNode(CasePartNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrExpressionNode(OrExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndExpressionNode(AndExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implies Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implies Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpliesExpressionNode(ImpliesExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalExpressionNode(RelationalExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additive Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additive Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditiveExpressionNode(AdditiveExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicativeExpressionNode(MultiplicativeExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpressionNode(UnaryExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infix Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infix Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfixExpressionNode(InfixExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteralNode(StringLiteralNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paranthesized Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paranthesized Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParanthesizedExpressionNode(ParanthesizedExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Var Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Var Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVarExpressionNode(GlobalVarExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Call Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Call Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCallNode(FeatureCallNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Literal Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListLiteralNode(ListLiteralNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Call Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Call Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorCallNode(ConstructorCallNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteralNode(BooleanLiteralNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Literal Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullLiteralNode(NullLiteralNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteralNode(NumberLiteralNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Expression Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionExpressionNode(CollectionExpressionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Parameter List Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Parameter List Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredParameterListNode(DeclaredParameterListNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Parameter Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredParameterNode(DeclaredParameterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter List Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter List Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterListNode(ParameterListNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionTypeNode(CollectionTypeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTypeNode(SimpleTypeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierNode(IdentifierNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeNode(CompositeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //Xpand3nodeSwitch
