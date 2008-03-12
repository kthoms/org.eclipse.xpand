package org.eclipse.xpand3.parser.node2ast;

import org.eclipse.emf.common.util.EList;
import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;
import org.eclipse.tmf.common.node.Node;
import org.eclipse.xpand3.DeclaredParameter;
import org.eclipse.xpand3.File;
import org.eclipse.xpand3.Identifier;
import org.eclipse.xpand3.ImportStatement;
import org.eclipse.xpand3.SyntaxElement;
import org.eclipse.xpand3.Xpand3Factory;
import org.eclipse.xpand3.declaration.AbstractDeclaration;
import org.eclipse.xpand3.declaration.DeclarationFactory;
import org.eclipse.xpand3.declaration.Definition;
import org.eclipse.xpand3.declaration.Extension;
import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.BinaryOperation;
import org.eclipse.xpand3.expression.BooleanLiteral;
import org.eclipse.xpand3.expression.ExpressionFactory;
import org.eclipse.xpand3.expression.FeatureCall;
import org.eclipse.xpand3.expression.OperationCall;
import org.eclipse.xpand3.expression.StringLiteral;
import org.eclipse.xpand3.expression.UnaryOperation;
import org.eclipse.xpand3.internal.parser.xpand3node.AdditiveExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.BooleanLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterListNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DefinitionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ElseIfStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ElseStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExpressionStmtNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExtensionImportNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode;
import org.eclipse.xpand3.internal.parser.xpand3node.FileNode;
import org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.IdentifierNode;
import org.eclipse.xpand3.internal.parser.xpand3node.IfStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ImportNode;
import org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.MultiplicativeExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ParameterListNode;
import org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.SequenceNode;
import org.eclipse.xpand3.internal.parser.xpand3node.SimpleTypeNode;
import org.eclipse.xpand3.internal.parser.xpand3node.StringLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.TextNode;
import org.eclipse.xpand3.internal.parser.xpand3node.TextSequenceNode;
import org.eclipse.xpand3.internal.parser.xpand3node.UnaryExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;
import org.eclipse.xpand3.parser.AbstractXpand3NodeSwitch;
import org.eclipse.xpand3.statement.AbstractStatement;
import org.eclipse.xpand3.statement.ExpressionStatement;
import org.eclipse.xpand3.statement.FileStatement;
import org.eclipse.xpand3.statement.ForEachStatement;
import org.eclipse.xpand3.statement.IfStatement;
import org.eclipse.xpand3.statement.StatementFactory;
import org.eclipse.xpand3.statement.TextStatement;

public class Node2AstTransformer extends
		AbstractXpand3NodeSwitch<SyntaxElement, TransformationException> {

	private Xpand3Factory xpandFactory = Xpand3Factory.eINSTANCE;
	private ExpressionFactory expressionFactory = ExpressionFactory.eINSTANCE;
	private StatementFactory statementFactory = StatementFactory.eINSTANCE;
	private DeclarationFactory declarationFactory = DeclarationFactory.eINSTANCE;

	private void setPosition(SyntaxElement syntaxElement, Node node) {
		syntaxElement.setStart(node.start());
		syntaxElement.setLine(node.line());
		syntaxElement.setEnd(node.end());
	}

	private String getTextFromLeafNode(Node node) {
		if (!(node instanceof LeafNode)) {
			throw new TransformationException("Leaf node expected", node);
		}
		return ((LeafNode) node).getToken().getText();
	}

	// Additional dispatchers for abstract classes

	public SyntaxElement caseType(Node node) {
		switch (node.eClass().getClassifierID()) {
		case Xpand3nodePackage.SIMPLE_TYPE_NODE:
			return caseSimpleTypeNode(node);
		case Xpand3nodePackage.COLLECTION_TYPE_NODE:
			return caseCollectionTypeNode(node);
		default:
			throw new TransformationException("Illegal type", node);
		}
	}

	private Identifier createIdentifier(Node node) {
		if (!(node instanceof LeafNode)) {
			classCastError(node, "LeafNode");
		}
		return createIdentifier(((LeafNode) node).getToken().getText(), node);
	}

	private Identifier createIdentifier(String text, Node node) {
		Identifier si = xpandFactory.createIdentifier();
		setPosition(si, node);
		si.setValue(text);
		return si;
	}

	private void createParameters(CompositeNode node,
			EList<DeclaredParameter> parameters) {
		if (!(node instanceof DeclaredParameterListNode)) {
			classCastError(node, "DeclaredParameterlistNode");
		}
		DeclaredParameterListNode paramListNode = (DeclaredParameterListNode) node;
		if (paramListNode != null) {
			for (Node param : paramListNode.getParams()) {
				parameters
						.add((DeclaredParameter) caseDeclaredParameterNode(param));
			}
		}
	}

	private void createBody(Node node, EList<AbstractStatement> body) {
		if (!(node instanceof SequenceNode)) {
			classCastError(node, "SequenceNode");
		}
		SequenceNode sequenceNode = (SequenceNode) node;
		EList<Node> childNodes = sequenceNode.getChildren();
		for (Node childNode : childNodes) {
			switch (childNode.eClass().getClassifierID()) {
			case Xpand3nodePackage.TEXT_SEQUENCE_NODE:
				createTextSequences(childNode, body);
			default:
				body.add((AbstractStatement) doSwitch(childNode));
			}
		}
	}

	private void createTextSequences(Node node,
			EList<AbstractStatement> containerList) {
		if (!(node instanceof TextSequenceNode)) {
			classCastError(node, "TextSequenceNode");
		}
		EList<CompositeNode> texts = ((TextSequenceNode) node).getText();
		for (CompositeNode text : texts) {
			containerList.add((AbstractStatement) caseTextNode(text));
		}

	}

	// Overridden switch methods

	@Override
	public SyntaxElement caseAdditiveExpressionNode(AdditiveExpressionNode node)
			throws TransformationException {
		BinaryOperation binaryOperation = expressionFactory
				.createBinaryOperation();
		binaryOperation.setLeft((AbstractExpression) doSwitch(node.getLeft()));
		binaryOperation
				.setRight((AbstractExpression) doSwitch(node.getRight()));
		binaryOperation
				.setOperator(createIdentifier(node.getChildren().get(1)));
		return binaryOperation;
	}

	@Override
	public SyntaxElement caseBooleanLiteralNode(BooleanLiteralNode node)
			throws TransformationException {
		BooleanLiteral booleanLiteral = expressionFactory
				.createBooleanLiteral();
		booleanLiteral.setLiteralValue(createIdentifier(node.getChildren().get(
				0)));
		return booleanLiteral;
	}

	@Override
	public SyntaxElement caseDeclaredParameterNode(DeclaredParameterNode dpn) {
		DeclaredParameter dp = xpandFactory.createDeclaredParameter();
		setPosition(dp, dpn);
		dp.setName((Identifier) caseIdentifierNode(dpn.getName()));
		dp.setType((Identifier) caseType(dpn.getPtype()));
		return dp;
	}

	@Override
	public SyntaxElement caseDeclaredParameterListNode(
			DeclaredParameterListNode object) {
		throw new TransformationException("Rule should not be called directly",
				object);
	}

	@Override
	public SyntaxElement caseDefinitionNode(DefinitionNode dn) {
		Definition definition = declarationFactory.createDefinition();
		setPosition(definition, dn);
		definition.setName((Identifier) caseIdentifierNode(dn.getName()));

		CompositeNode tn = dn.getType();
		EList<DeclaredParameter> parameters = definition.getParams();
		if (tn != null) {
			DeclaredParameter dp = xpandFactory.createDeclaredParameter();
			dp.setName(createIdentifier("this", tn));
			dp.setType((Identifier) caseSimpleTypeNode(tn));
			setPosition(dp, tn);
			parameters.add(dp);
		}
		createParameters(dn.getParamList(), parameters);

		EList<AbstractStatement> body = definition.getBody();
		createBody(dn.getSequence(), body);

		return definition;
	}

	@Override
	public SyntaxElement caseElseIfStatementNode(ElseIfStatementNode node)
			throws TransformationException {
		throw new TransformationException("Rule should not be called directly",
				node);
	}

	@Override
	public SyntaxElement caseElseStatementNode(ElseStatementNode node)
			throws TransformationException {
		throw new TransformationException("Rule should not be called directly",
				node);
	}

	@Override
	public SyntaxElement caseExpressionStmtNode(ExpressionStmtNode node)
			throws TransformationException {
		ExpressionStatement expressionStatement = statementFactory
				.createExpressionStatement();
		setPosition(expressionStatement, node);
		expressionStatement.setExpression((AbstractExpression) doSwitch(node
				.getExpression()));
		return expressionStatement;
	}

	@Override
	public SyntaxElement caseExtensionNode(ExtensionNode en) {
		Extension ext = declarationFactory.createExtension();
		ext.setName((Identifier) caseIdentifierNode(en.getName()));
		DeclaredParameterListNode paramListNode = (DeclaredParameterListNode) en
				.getParamList();
		EList<DeclaredParameter> parameters = ext.getParams();
		createParameters(paramListNode, parameters);
		CompositeNode extendBody = en.getExtendBody();
		if (extendBody != null) {
			ext.setBody((AbstractExpression) doSwitch(extendBody));
		}
		return ext;
	}

	@Override
	public SyntaxElement caseExtensionImportNode(ExtensionImportNode node)
			throws TransformationException {
		ImportStatement importStatement = xpandFactory.createImportStatement();
		setPosition(importStatement, node);
		if (node.getNamespace() != null) {
			importStatement.setImportedId((Identifier) caseType(node
					.getNamespace()));
		} else if (node.getType() != null) {
			importStatement
					.setImportedId((Identifier) caseType(node.getType()));
		}
		return importStatement;
	}

	@Override
	public SyntaxElement caseFeatureCallNode(FeatureCallNode featureCallNode) {
		FeatureCall featureCall;
		if (featureCallNode.getName() == null) {
			featureCall = expressionFactory.createFeatureCall();
		} else {
			featureCall = expressionFactory.createOperationCall();
			EList<AbstractExpression> params = ((OperationCall) featureCall)
					.getParams();
			ParameterListNode pln = (ParameterListNode) featureCallNode
					.getParamList();
			if (pln != null) {
				for (Node pn : pln.getParams()) {
					params.add((AbstractExpression) caseExpressionNode(pn));
				}
			}
		}
		setPosition(featureCall, featureCallNode);
		Node nameNode = featureCallNode.getChildren().get(0);
		featureCall.setName((Identifier) doSwitch(nameNode));
		return featureCall;
	}

	@Override
	public SyntaxElement caseForeachStatementNode(ForeachStatementNode node)
			throws TransformationException {
		ForEachStatement forEachStatement = statementFactory
				.createForEachStatement();
		setPosition(forEachStatement, node);
		forEachStatement.setTarget((AbstractExpression) doSwitch(node
				.getForExpression()));
		forEachStatement.setVariable((Identifier) caseIdentifierNode(node
				.getIdentifier()));
		if (node.getIterator() != null) {
			forEachStatement
					.setIteratorName((Identifier) caseIdentifierNode(node
							.getIterator()));
		}
		if (node.getSeparatorExpression() != null) {
			forEachStatement.setSeparator((AbstractExpression) doSwitch(node
					.getSeparatorExpression()));
		}
		createBody(node.getSequence(), forEachStatement.getBody());
		return forEachStatement;
	}

	@Override
	public SyntaxElement caseIdentifierNode(IdentifierNode in) {
		return createIdentifier((LeafNode) in.getChildren().get(0));
	}

	@Override
	public SyntaxElement caseIfStatementNode(IfStatementNode node)
			throws TransformationException {
		IfStatement ifStatement = statementFactory.createIfStatement();
		ifStatement.setCondition((AbstractExpression) doSwitch(node
				.getExpression()));
		createBody(node.getSequence(), ifStatement.getBody());
		IfStatement currentParentIf = ifStatement;
		for (Node elseIfNode : node.getElseIf()) {
			ElseIfStatementNode elseIfStatementNode = (ElseIfStatementNode) elseIfNode;
			IfStatement elseIfStatement = statementFactory.createIfStatement();
			setPosition(elseIfStatement, elseIfNode);
			elseIfStatement
					.setCondition((AbstractExpression) doSwitch(elseIfStatementNode
							.getExpression()));
			createBody(elseIfStatementNode.getSequence(), elseIfStatement
					.getBody());
			currentParentIf.setElseIf(elseIfStatement);
			currentParentIf = elseIfStatement;
		}
		ElseStatementNode elseStatementNode = (ElseStatementNode) node
				.getElse();
		if (elseStatementNode != null) {
			IfStatement elseStatement = statementFactory.createIfStatement();
			setPosition(elseStatement, elseStatementNode);
			elseStatement.setCondition(null);
			createBody(elseStatementNode.getSequence(), elseStatement.getBody());
			currentParentIf.setElseIf(elseStatement);
		}
		return ifStatement;
	}

	@Override
	public SyntaxElement caseImportNode(ImportNode node)
			throws TransformationException {
		ImportStatement importStatement = xpandFactory.createImportStatement();
		setPosition(importStatement, node);
		if (node.getNamespace() != null) {
			importStatement.setImportedId((Identifier) caseType(node
					.getNamespace()));
		} else if (node.getType() != null) {
			importStatement
					.setImportedId((Identifier) caseType(node.getType()));
		}
		return importStatement;
	}

	@Override
	public SyntaxElement caseInfixExpressionNode(InfixExpressionNode ien) {
		CompositeNode targetNode = ien.getTarget();
		AbstractExpression target = (AbstractExpression) doSwitch(targetNode);
		for (Node callNode : ien.getCalls()) {
			FeatureCall featureCall = (FeatureCall) doSwitch(callNode);
			featureCall.setTarget(target);
			target = featureCall;
		}
		return target;
	}

	@Override
	public SyntaxElement caseFileNode(FileNode fn) {
		File file = xpandFactory.createFile();
		// TODO: how to handle file name file.setFileName(fn.getName())
		EList<CompositeNode> impNodes = fn.getImports();
		EList<ImportStatement> imports = file.getImports();
		for (CompositeNode impNode : impNodes) {
			imports.add((ImportStatement) doSwitch(impNode));
		}

		EList<CompositeNode> declNodes = fn.getDeclarations();
		EList<AbstractDeclaration> declarations = file.getDeclarations();
		for (CompositeNode declNode : declNodes) {
			declarations.add((AbstractDeclaration) doSwitch(declNode));
		}

		return file;
	}

	@Override
	public SyntaxElement caseFileStatementNode(FileStatementNode node)
			throws TransformationException {
		FileStatement fileStatement = statementFactory.createFileStatement();
		setPosition(fileStatement, node);
		fileStatement.setFileNameExpression((AbstractExpression) doSwitch(node
				.getNameExpression()));
		CompositeNode identifier = node.getIdentifier();
		if (identifier != null) {
			fileStatement
					.setOutletNameIdentifier((Identifier) caseIdentifierNode(identifier));
		}
		fileStatement.setOnce(isOnce(node));
		createBody(node.getSequence(), fileStatement.getBody());
		return fileStatement;
	}

	private boolean isOnce(FileStatementNode node) {
		Node onceCandidateNode = node.getChildren().get(2);
		return onceCandidateNode instanceof LeafNode
				&& ((LeafNode) onceCandidateNode).getToken().getText().equals(
						"ONCE");
	}

	@Override
	public SyntaxElement caseMultiplicativeExpressionNode(
			MultiplicativeExpressionNode node) throws TransformationException {
		BinaryOperation binaryOperation = expressionFactory
				.createBinaryOperation();
		binaryOperation.setLeft((AbstractExpression) doSwitch(node.getLeft()));
		binaryOperation
				.setRight((AbstractExpression) doSwitch(node.getRight()));
		binaryOperation
				.setOperator(createIdentifier(node.getChildren().get(1)));
		return binaryOperation;
	}

	@Override
	public SyntaxElement caseRelationalExpressionNode(
			RelationalExpressionNode ren) {
		BinaryOperation bo = expressionFactory.createBinaryOperation();
		bo.setLeft((AbstractExpression) doSwitch(ren.getLeftOperand()));
		bo
				.setOperator(createIdentifier(ren.getOperator().getChildren()
						.get(0)));
		bo.setRight((AbstractExpression) doSwitch(ren.getRightOperand()));
		return bo;
	}

	@Override
	public SyntaxElement caseSequenceNode(SequenceNode node)
			throws TransformationException {
		throw new TransformationException("Rule should not be called directly",
				node);
	}

	@Override
	public SyntaxElement caseSimpleTypeNode(SimpleTypeNode stn) {
		EList<CompositeNode> names = stn.getNames();
		if (names.isEmpty()) {
			throw new TransformationException("Simple type must have a name",
					stn);
		}
		if (names.size() > 1) {
			Identifier ci = xpandFactory.createIdentifier();
			ci.setValue(stn.text());
			return ci;
		}
		return caseIdentifierNode(names.get(0));
	}

	@Override
	public SyntaxElement caseStringLiteralNode(StringLiteralNode node)
			throws TransformationException {
		StringLiteral stringLiteral = expressionFactory.createStringLiteral();
		stringLiteral.setLiteralValue(createIdentifier(node.getChildren()
				.get(0)));
		return stringLiteral;
	}

	@Override
	public SyntaxElement caseTextNode(TextNode node)
			throws TransformationException {
		TextStatement textStatement = statementFactory.createTextStatement();
		setPosition(textStatement, node);
		EList<Node> children = node.getChildren();
		textStatement.setDeleteLine(children.size() > 1);
		Node text = children.get(children.size() - 1);
		textStatement.setValue(((LeafNode) text).getToken().getText());
		return textStatement;
	}

	@Override
	public SyntaxElement caseUnaryExpressionNode(UnaryExpressionNode node)
			throws TransformationException {
		UnaryOperation unaryOperation = expressionFactory
				.createUnaryOperation();
		if (node.getChildren().size() != 2) {
			throw new TransformationException(
					"Unary expression must have operation and operand", node);
		}
		unaryOperation.setOperand((AbstractExpression) doSwitch(node
				.getOperand()));
		unaryOperation.setOperator(createIdentifier(node.getChildren().get(0)));
		return unaryOperation;
	}

	@Override
	public void error(String message, Node node) throws TransformationException {
		throw new TransformationException(message, node);
	}

}
