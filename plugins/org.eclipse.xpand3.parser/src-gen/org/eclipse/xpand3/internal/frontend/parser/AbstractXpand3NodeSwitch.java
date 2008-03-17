
package org.eclipse.xpand3.internal.frontend.parser;

import org.eclipse.tmf.common.node.*;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.*;

public abstract class AbstractXpand3NodeSwitch<T,E extends Exception> {

	public T doSwitch(Node node) throws E {
		int classifierID = node.eClass().getClassifierID();
		switch(classifierID) {
		case Xpand3nodePackage.FILE_NODE:
			return caseFileNode(node);
		case Xpand3nodePackage.IMPORT_NODE:
			return caseImportNode(node);
		case Xpand3nodePackage.EXTENSION_IMPORT_NODE:
			return caseExtensionImportNode(node);
		case Xpand3nodePackage.DEFINITION_NODE:
			return caseDefinitionNode(node);
		case Xpand3nodePackage.DEFINITION_AROUND_NODE:
			return caseDefinitionAroundNode(node);
		case Xpand3nodePackage.SEQUENCE_NODE:
			return caseSequenceNode(node);
		case Xpand3nodePackage.TEXT_SEQUENCE_NODE:
			return caseTextSequenceNode(node);
		case Xpand3nodePackage.TEXT_NODE:
			return caseTextNode(node);
		case Xpand3nodePackage.ERROR_STATEMENT_NODE:
			return caseErrorStatementNode(node);
		case Xpand3nodePackage.EXPAND_STATEMENT_NODE:
			return caseExpandStatementNode(node);
		case Xpand3nodePackage.EXPRESSION_STMT_NODE:
			return caseExpressionStmtNode(node);
		case Xpand3nodePackage.FILE_STATEMENT_NODE:
			return caseFileStatementNode(node);
		case Xpand3nodePackage.FOREACH_STATEMENT_NODE:
			return caseForeachStatementNode(node);
		case Xpand3nodePackage.IF_STATEMENT_NODE:
			return caseIfStatementNode(node);
		case Xpand3nodePackage.ELSE_IF_STATEMENT_NODE:
			return caseElseIfStatementNode(node);
		case Xpand3nodePackage.ELSE_STATEMENT_NODE:
			return caseElseStatementNode(node);
		case Xpand3nodePackage.LET_STATEMENT_NODE:
			return caseLetStatementNode(node);
		case Xpand3nodePackage.PROTECT_STATEMENT_NODE:
			return caseProtectStatementNode(node);
		case Xpand3nodePackage.CHECK_NODE:
			return caseCheckNode(node);
		case Xpand3nodePackage.AROUND_NODE:
			return caseAroundNode(node);
		case Xpand3nodePackage.POINTCUT_NODE:
			return casePointcutNode(node);
		case Xpand3nodePackage.EXTENSION_NODE:
			return caseExtensionNode(node);
		case Xpand3nodePackage.JAVA_CALL_NODE:
			return caseJavaCallNode(node);
		case Xpand3nodePackage.JAVA_TYPE_NODE:
			return caseJavaTypeNode(node);
		case Xpand3nodePackage.TEST_EXPRESSION_NODE:
			return caseTest_expressionNode(node);
		case Xpand3nodePackage.LET_EXPRESSION_NODE:
			return caseLetExpressionNode(node);
		case Xpand3nodePackage.CASTED_EXPRESSION_NODE:
			return caseCastedExpressionNode(node);
		case Xpand3nodePackage.CHAIN_EXPRESSION_NODE:
			return caseChainExpressionNode(node);
		case Xpand3nodePackage.IF_EXPRESSION_NODE:
			return caseIfExpressionNode(node);
		case Xpand3nodePackage.SWITCH_EXPRESSION_NODE:
			return caseSwitchExpressionNode(node);
		case Xpand3nodePackage.CASE_PART_NODE:
			return caseCasePartNode(node);
		case Xpand3nodePackage.OR_EXPRESSION_NODE:
			return caseOrExpressionNode(node);
		case Xpand3nodePackage.AND_EXPRESSION_NODE:
			return caseAndExpressionNode(node);
		case Xpand3nodePackage.IMPLIES_EXPRESSION_NODE:
			return caseImpliesExpressionNode(node);
		case Xpand3nodePackage.RELATIONAL_EXPRESSION_NODE:
			return caseRelationalExpressionNode(node);
		case Xpand3nodePackage.ADDITIVE_EXPRESSION_NODE:
			return caseAdditiveExpressionNode(node);
		case Xpand3nodePackage.MULTIPLICATIVE_EXPRESSION_NODE:
			return caseMultiplicativeExpressionNode(node);
		case Xpand3nodePackage.UNARY_EXPRESSION_NODE:
			return caseUnaryExpressionNode(node);
		case Xpand3nodePackage.INFIX_EXPRESSION_NODE:
			return caseInfixExpressionNode(node);
		case Xpand3nodePackage.STRING_LITERAL_NODE:
			return caseStringLiteralNode(node);
		case Xpand3nodePackage.PARANTHESIZED_EXPRESSION_NODE:
			return caseParanthesizedExpressionNode(node);
		case Xpand3nodePackage.GLOBAL_VAR_EXPRESSION_NODE:
			return caseGlobalVarExpressionNode(node);
		case Xpand3nodePackage.FEATURE_CALL_NODE:
			return caseFeatureCallNode(node);
		case Xpand3nodePackage.LIST_LITERAL_NODE:
			return caseListLiteralNode(node);
		case Xpand3nodePackage.CONSTRUCTOR_CALL_NODE:
			return caseConstructorCallNode(node);
		case Xpand3nodePackage.BOOLEAN_LITERAL_NODE:
			return caseBooleanLiteralNode(node);
		case Xpand3nodePackage.NULL_LITERAL_NODE:
			return caseNullLiteralNode(node);
		case Xpand3nodePackage.NUMBER_LITERAL_NODE:
			return caseNumberLiteralNode(node);
		case Xpand3nodePackage.COLLECTION_EXPRESSION_NODE:
			return caseCollectionExpressionNode(node);
		case Xpand3nodePackage.DECLARED_PARAMETER_LIST_NODE:
			return caseDeclaredParameterListNode(node);
		case Xpand3nodePackage.DECLARED_PARAMETER_NODE:
			return caseDeclaredParameterNode(node);
		case Xpand3nodePackage.PARAMETER_LIST_NODE:
			return caseParameterListNode(node);
		case Xpand3nodePackage.COLLECTION_TYPE_NODE:
			return caseCollectionTypeNode(node);
		case Xpand3nodePackage.SIMPLE_TYPE_NODE:
			return caseSimpleTypeNode(node);
		case Xpand3nodePackage.IDENTIFIER_NODE:
			return caseIdentifierNode(node);
		default: error("Node " + node.toString() + " not supported", node);
		}
		return null;
	}
	
	public final T caseFileNode(Node node) throws E {
		if(!(node instanceof FileNode)) {
			classCastError(node, "FileNode");
		} 
		return caseFileNode((FileNode) node);
	}

	public T caseFileNode(FileNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseImportNode(Node node) throws E {
		if(!(node instanceof ImportNode)) {
			classCastError(node, "ImportNode");
		} 
		return caseImportNode((ImportNode) node);
	}

	public T caseImportNode(ImportNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseExtensionImportNode(Node node) throws E {
		if(!(node instanceof ExtensionImportNode)) {
			classCastError(node, "ExtensionImportNode");
		} 
		return caseExtensionImportNode((ExtensionImportNode) node);
	}

	public T caseExtensionImportNode(ExtensionImportNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseDefinitionNode(Node node) throws E {
		if(!(node instanceof DefinitionNode)) {
			classCastError(node, "DefinitionNode");
		} 
		return caseDefinitionNode((DefinitionNode) node);
	}

	public T caseDefinitionNode(DefinitionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseDefinitionAroundNode(Node node) throws E {
		if(!(node instanceof DefinitionAroundNode)) {
			classCastError(node, "DefinitionAroundNode");
		} 
		return caseDefinitionAroundNode((DefinitionAroundNode) node);
	}

	public T caseDefinitionAroundNode(DefinitionAroundNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseSequenceNode(Node node) throws E {
		if(!(node instanceof SequenceNode)) {
			classCastError(node, "SequenceNode");
		} 
		return caseSequenceNode((SequenceNode) node);
	}

	public T caseSequenceNode(SequenceNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseTextSequenceNode(Node node) throws E {
		if(!(node instanceof TextSequenceNode)) {
			classCastError(node, "TextSequenceNode");
		} 
		return caseTextSequenceNode((TextSequenceNode) node);
	}

	public T caseTextSequenceNode(TextSequenceNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseTextNode(Node node) throws E {
		if(!(node instanceof TextNode)) {
			classCastError(node, "TextNode");
		} 
		return caseTextNode((TextNode) node);
	}

	public T caseTextNode(TextNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseErrorStatementNode(Node node) throws E {
		if(!(node instanceof ErrorStatementNode)) {
			classCastError(node, "ErrorStatementNode");
		} 
		return caseErrorStatementNode((ErrorStatementNode) node);
	}

	public T caseErrorStatementNode(ErrorStatementNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseExpandStatementNode(Node node) throws E {
		if(!(node instanceof ExpandStatementNode)) {
			classCastError(node, "ExpandStatementNode");
		} 
		return caseExpandStatementNode((ExpandStatementNode) node);
	}

	public T caseExpandStatementNode(ExpandStatementNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseExpressionStmtNode(Node node) throws E {
		if(!(node instanceof ExpressionStmtNode)) {
			classCastError(node, "ExpressionStmtNode");
		} 
		return caseExpressionStmtNode((ExpressionStmtNode) node);
	}

	public T caseExpressionStmtNode(ExpressionStmtNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseFileStatementNode(Node node) throws E {
		if(!(node instanceof FileStatementNode)) {
			classCastError(node, "FileStatementNode");
		} 
		return caseFileStatementNode((FileStatementNode) node);
	}

	public T caseFileStatementNode(FileStatementNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseForeachStatementNode(Node node) throws E {
		if(!(node instanceof ForeachStatementNode)) {
			classCastError(node, "ForeachStatementNode");
		} 
		return caseForeachStatementNode((ForeachStatementNode) node);
	}

	public T caseForeachStatementNode(ForeachStatementNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseIfStatementNode(Node node) throws E {
		if(!(node instanceof IfStatementNode)) {
			classCastError(node, "IfStatementNode");
		} 
		return caseIfStatementNode((IfStatementNode) node);
	}

	public T caseIfStatementNode(IfStatementNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseElseIfStatementNode(Node node) throws E {
		if(!(node instanceof ElseIfStatementNode)) {
			classCastError(node, "ElseIfStatementNode");
		} 
		return caseElseIfStatementNode((ElseIfStatementNode) node);
	}

	public T caseElseIfStatementNode(ElseIfStatementNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseElseStatementNode(Node node) throws E {
		if(!(node instanceof ElseStatementNode)) {
			classCastError(node, "ElseStatementNode");
		} 
		return caseElseStatementNode((ElseStatementNode) node);
	}

	public T caseElseStatementNode(ElseStatementNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseLetStatementNode(Node node) throws E {
		if(!(node instanceof LetStatementNode)) {
			classCastError(node, "LetStatementNode");
		} 
		return caseLetStatementNode((LetStatementNode) node);
	}

	public T caseLetStatementNode(LetStatementNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseProtectStatementNode(Node node) throws E {
		if(!(node instanceof ProtectStatementNode)) {
			classCastError(node, "ProtectStatementNode");
		} 
		return caseProtectStatementNode((ProtectStatementNode) node);
	}

	public T caseProtectStatementNode(ProtectStatementNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseCheckNode(Node node) throws E {
		if(!(node instanceof CheckNode)) {
			classCastError(node, "CheckNode");
		} 
		return caseCheckNode((CheckNode) node);
	}

	public T caseCheckNode(CheckNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseAroundNode(Node node) throws E {
		if(!(node instanceof AroundNode)) {
			classCastError(node, "AroundNode");
		} 
		return caseAroundNode((AroundNode) node);
	}

	public T caseAroundNode(AroundNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T casePointcutNode(Node node) throws E {
		if(!(node instanceof PointcutNode)) {
			classCastError(node, "PointcutNode");
		} 
		return casePointcutNode((PointcutNode) node);
	}

	public T casePointcutNode(PointcutNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseExtensionNode(Node node) throws E {
		if(!(node instanceof ExtensionNode)) {
			classCastError(node, "ExtensionNode");
		} 
		return caseExtensionNode((ExtensionNode) node);
	}

	public T caseExtensionNode(ExtensionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseJavaCallNode(Node node) throws E {
		if(!(node instanceof JavaCallNode)) {
			classCastError(node, "JavaCallNode");
		} 
		return caseJavaCallNode((JavaCallNode) node);
	}

	public T caseJavaCallNode(JavaCallNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseJavaTypeNode(Node node) throws E {
		if(!(node instanceof JavaTypeNode)) {
			classCastError(node, "JavaTypeNode");
		} 
		return caseJavaTypeNode((JavaTypeNode) node);
	}

	public T caseJavaTypeNode(JavaTypeNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseTest_expressionNode(Node node) throws E {
		if(!(node instanceof Test_expressionNode)) {
			classCastError(node, "Test_expressionNode");
		} 
		return caseTest_expressionNode((Test_expressionNode) node);
	}

	public T caseTest_expressionNode(Test_expressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseLetExpressionNode(Node node) throws E {
		if(!(node instanceof LetExpressionNode)) {
			classCastError(node, "LetExpressionNode");
		} 
		return caseLetExpressionNode((LetExpressionNode) node);
	}

	public T caseLetExpressionNode(LetExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseCastedExpressionNode(Node node) throws E {
		if(!(node instanceof CastedExpressionNode)) {
			classCastError(node, "CastedExpressionNode");
		} 
		return caseCastedExpressionNode((CastedExpressionNode) node);
	}

	public T caseCastedExpressionNode(CastedExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseChainExpressionNode(Node node) throws E {
		if(!(node instanceof ChainExpressionNode)) {
			classCastError(node, "ChainExpressionNode");
		} 
		return caseChainExpressionNode((ChainExpressionNode) node);
	}

	public T caseChainExpressionNode(ChainExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseIfExpressionNode(Node node) throws E {
		if(!(node instanceof IfExpressionNode)) {
			classCastError(node, "IfExpressionNode");
		} 
		return caseIfExpressionNode((IfExpressionNode) node);
	}

	public T caseIfExpressionNode(IfExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseSwitchExpressionNode(Node node) throws E {
		if(!(node instanceof SwitchExpressionNode)) {
			classCastError(node, "SwitchExpressionNode");
		} 
		return caseSwitchExpressionNode((SwitchExpressionNode) node);
	}

	public T caseSwitchExpressionNode(SwitchExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseCasePartNode(Node node) throws E {
		if(!(node instanceof CasePartNode)) {
			classCastError(node, "CasePartNode");
		} 
		return caseCasePartNode((CasePartNode) node);
	}

	public T caseCasePartNode(CasePartNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseOrExpressionNode(Node node) throws E {
		if(!(node instanceof OrExpressionNode)) {
			classCastError(node, "OrExpressionNode");
		} 
		return caseOrExpressionNode((OrExpressionNode) node);
	}

	public T caseOrExpressionNode(OrExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseAndExpressionNode(Node node) throws E {
		if(!(node instanceof AndExpressionNode)) {
			classCastError(node, "AndExpressionNode");
		} 
		return caseAndExpressionNode((AndExpressionNode) node);
	}

	public T caseAndExpressionNode(AndExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseImpliesExpressionNode(Node node) throws E {
		if(!(node instanceof ImpliesExpressionNode)) {
			classCastError(node, "ImpliesExpressionNode");
		} 
		return caseImpliesExpressionNode((ImpliesExpressionNode) node);
	}

	public T caseImpliesExpressionNode(ImpliesExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseRelationalExpressionNode(Node node) throws E {
		if(!(node instanceof RelationalExpressionNode)) {
			classCastError(node, "RelationalExpressionNode");
		} 
		return caseRelationalExpressionNode((RelationalExpressionNode) node);
	}

	public T caseRelationalExpressionNode(RelationalExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseAdditiveExpressionNode(Node node) throws E {
		if(!(node instanceof AdditiveExpressionNode)) {
			classCastError(node, "AdditiveExpressionNode");
		} 
		return caseAdditiveExpressionNode((AdditiveExpressionNode) node);
	}

	public T caseAdditiveExpressionNode(AdditiveExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseMultiplicativeExpressionNode(Node node) throws E {
		if(!(node instanceof MultiplicativeExpressionNode)) {
			classCastError(node, "MultiplicativeExpressionNode");
		} 
		return caseMultiplicativeExpressionNode((MultiplicativeExpressionNode) node);
	}

	public T caseMultiplicativeExpressionNode(MultiplicativeExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseUnaryExpressionNode(Node node) throws E {
		if(!(node instanceof UnaryExpressionNode)) {
			classCastError(node, "UnaryExpressionNode");
		} 
		return caseUnaryExpressionNode((UnaryExpressionNode) node);
	}

	public T caseUnaryExpressionNode(UnaryExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseInfixExpressionNode(Node node) throws E {
		if(!(node instanceof InfixExpressionNode)) {
			classCastError(node, "InfixExpressionNode");
		} 
		return caseInfixExpressionNode((InfixExpressionNode) node);
	}

	public T caseInfixExpressionNode(InfixExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseStringLiteralNode(Node node) throws E {
		if(!(node instanceof StringLiteralNode)) {
			classCastError(node, "StringLiteralNode");
		} 
		return caseStringLiteralNode((StringLiteralNode) node);
	}

	public T caseStringLiteralNode(StringLiteralNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseParanthesizedExpressionNode(Node node) throws E {
		if(!(node instanceof ParanthesizedExpressionNode)) {
			classCastError(node, "ParanthesizedExpressionNode");
		} 
		return caseParanthesizedExpressionNode((ParanthesizedExpressionNode) node);
	}

	public T caseParanthesizedExpressionNode(ParanthesizedExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseGlobalVarExpressionNode(Node node) throws E {
		if(!(node instanceof GlobalVarExpressionNode)) {
			classCastError(node, "GlobalVarExpressionNode");
		} 
		return caseGlobalVarExpressionNode((GlobalVarExpressionNode) node);
	}

	public T caseGlobalVarExpressionNode(GlobalVarExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseFeatureCallNode(Node node) throws E {
		if(!(node instanceof FeatureCallNode)) {
			classCastError(node, "FeatureCallNode");
		} 
		return caseFeatureCallNode((FeatureCallNode) node);
	}

	public T caseFeatureCallNode(FeatureCallNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseListLiteralNode(Node node) throws E {
		if(!(node instanceof ListLiteralNode)) {
			classCastError(node, "ListLiteralNode");
		} 
		return caseListLiteralNode((ListLiteralNode) node);
	}

	public T caseListLiteralNode(ListLiteralNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseConstructorCallNode(Node node) throws E {
		if(!(node instanceof ConstructorCallNode)) {
			classCastError(node, "ConstructorCallNode");
		} 
		return caseConstructorCallNode((ConstructorCallNode) node);
	}

	public T caseConstructorCallNode(ConstructorCallNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseBooleanLiteralNode(Node node) throws E {
		if(!(node instanceof BooleanLiteralNode)) {
			classCastError(node, "BooleanLiteralNode");
		} 
		return caseBooleanLiteralNode((BooleanLiteralNode) node);
	}

	public T caseBooleanLiteralNode(BooleanLiteralNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseNullLiteralNode(Node node) throws E {
		if(!(node instanceof NullLiteralNode)) {
			classCastError(node, "NullLiteralNode");
		} 
		return caseNullLiteralNode((NullLiteralNode) node);
	}

	public T caseNullLiteralNode(NullLiteralNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseNumberLiteralNode(Node node) throws E {
		if(!(node instanceof NumberLiteralNode)) {
			classCastError(node, "NumberLiteralNode");
		} 
		return caseNumberLiteralNode((NumberLiteralNode) node);
	}

	public T caseNumberLiteralNode(NumberLiteralNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseCollectionExpressionNode(Node node) throws E {
		if(!(node instanceof CollectionExpressionNode)) {
			classCastError(node, "CollectionExpressionNode");
		} 
		return caseCollectionExpressionNode((CollectionExpressionNode) node);
	}

	public T caseCollectionExpressionNode(CollectionExpressionNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseDeclaredParameterListNode(Node node) throws E {
		if(!(node instanceof DeclaredParameterListNode)) {
			classCastError(node, "DeclaredParameterListNode");
		} 
		return caseDeclaredParameterListNode((DeclaredParameterListNode) node);
	}

	public T caseDeclaredParameterListNode(DeclaredParameterListNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseDeclaredParameterNode(Node node) throws E {
		if(!(node instanceof DeclaredParameterNode)) {
			classCastError(node, "DeclaredParameterNode");
		} 
		return caseDeclaredParameterNode((DeclaredParameterNode) node);
	}

	public T caseDeclaredParameterNode(DeclaredParameterNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseParameterListNode(Node node) throws E {
		if(!(node instanceof ParameterListNode)) {
			classCastError(node, "ParameterListNode");
		} 
		return caseParameterListNode((ParameterListNode) node);
	}

	public T caseParameterListNode(ParameterListNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseCollectionTypeNode(Node node) throws E {
		if(!(node instanceof CollectionTypeNode)) {
			classCastError(node, "CollectionTypeNode");
		} 
		return caseCollectionTypeNode((CollectionTypeNode) node);
	}

	public T caseCollectionTypeNode(CollectionTypeNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseSimpleTypeNode(Node node) throws E {
		if(!(node instanceof SimpleTypeNode)) {
			classCastError(node, "SimpleTypeNode");
		} 
		return caseSimpleTypeNode((SimpleTypeNode) node);
	}

	public T caseSimpleTypeNode(SimpleTypeNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	
	public final T caseIdentifierNode(Node node) throws E {
		if(!(node instanceof IdentifierNode)) {
			classCastError(node, "IdentifierNode");
		} 
		return caseIdentifierNode((IdentifierNode) node);
	}

	public T caseIdentifierNode(IdentifierNode node) throws E {
		error("Not implemented yet", node);
		return null;
	}
	

	
	public abstract void error(String message, Node node) throws E;
	
	public void classCastError(Node node, String expectedType) throws E {
		if(node == null) return;
		error("Expected " + expectedType + " but got " + ((node == null) ? "null" : node.eClass().getName()), node);
	}
}
