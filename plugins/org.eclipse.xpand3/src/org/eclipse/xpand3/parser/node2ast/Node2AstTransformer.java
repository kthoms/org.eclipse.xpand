/*******************************************************************************
 * <copyright>
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * committers of openArchitectureWare - initial API and implementation
 * </copyright>
 *******************************************************************************/

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
import org.eclipse.xpand3.declaration.Check;
import org.eclipse.xpand3.declaration.DeclarationFactory;
import org.eclipse.xpand3.declaration.Definition;
import org.eclipse.xpand3.declaration.DefinitionAspect;
import org.eclipse.xpand3.declaration.Extension;
import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.BooleanLiteral;
import org.eclipse.xpand3.expression.Case;
import org.eclipse.xpand3.expression.Cast;
import org.eclipse.xpand3.expression.ChainExpression;
import org.eclipse.xpand3.expression.CollectionExpression;
import org.eclipse.xpand3.expression.ExpressionFactory;
import org.eclipse.xpand3.expression.FeatureCall;
import org.eclipse.xpand3.expression.IfExpression;
import org.eclipse.xpand3.expression.ListLiteral;
import org.eclipse.xpand3.expression.Literal;
import org.eclipse.xpand3.expression.NullLiteral;
import org.eclipse.xpand3.expression.OperationCall;
import org.eclipse.xpand3.expression.StringLiteral;
import org.eclipse.xpand3.expression.SwitchExpression;
import org.eclipse.xpand3.expression.TypeSelectExpression;
import org.eclipse.xpand3.expression.UnaryOperation;
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
import org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterListNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DefinitionAroundNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DefinitionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ElseIfStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ElseStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ErrorStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExpressionStmtNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExtensionImportNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode;
import org.eclipse.xpand3.internal.parser.xpand3node.FileNode;
import org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.IdentifierNode;
import org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.IfStatementNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ImpliesExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ImportNode;
import org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ListLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.MultiplicativeExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.NullLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.NumberLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.OrExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ParameterListNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ParanthesizedExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.PointcutNode;
import org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.SequenceNode;
import org.eclipse.xpand3.internal.parser.xpand3node.SimpleTypeNode;
import org.eclipse.xpand3.internal.parser.xpand3node.StringLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.SwitchExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Test_expressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.TextNode;
import org.eclipse.xpand3.internal.parser.xpand3node.TextSequenceNode;
import org.eclipse.xpand3.internal.parser.xpand3node.UnaryExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;
import org.eclipse.xpand3.parser.AbstractXpand3NodeSwitch;
import org.eclipse.xpand3.statement.AbstractStatement;
import org.eclipse.xpand3.statement.ErrorStatement;
import org.eclipse.xpand3.statement.ExpandStatement;
import org.eclipse.xpand3.statement.ExpressionStatement;
import org.eclipse.xpand3.statement.FileStatement;
import org.eclipse.xpand3.statement.ForEachStatement;
import org.eclipse.xpand3.statement.IfStatement;
import org.eclipse.xpand3.statement.StatementFactory;
import org.eclipse.xpand3.statement.TextStatement;

/**
 * @author Jan Köhnlein
 */
public class Node2AstTransformer extends
		AbstractXpand3NodeSwitch<SyntaxElement, TransformationException> {

	private Xpand3Factory xpandFactory = Xpand3Factory.eINSTANCE;
	private ExpressionFactory expressionFactory = ExpressionFactory.eINSTANCE;
	private StatementFactory statementFactory = StatementFactory.eINSTANCE;
	private DeclarationFactory declarationFactory = DeclarationFactory.eINSTANCE;

	public void setPosition(SyntaxElement syntaxElement, Node node) {
		syntaxElement.setStart(node.start());
		syntaxElement.setLine(node.line());
		syntaxElement.setEnd(node.end());
	}

	// Additional dispatchers for abstract classes

	Identifier createIdentifier(Node node) {
		return createIdentifier(node.text(), node);
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
			body.add((AbstractStatement) doSwitch(childNode));
		}
	}

	// Overridden switch methods

	private void createAndAddImplicitlyDeclaredThisParameter(
			CompositeNode thisType, EList<DeclaredParameter> parameters) {
		if (thisType != null) {
			DeclaredParameter dp = xpandFactory.createDeclaredParameter();
			dp.setName(createIdentifier("this", thisType));
			dp.setType((Identifier) caseSimpleTypeNode(thisType));
			setPosition(dp, thisType);
			parameters.add(dp);
		}
	}

	@Override
	public SyntaxElement caseAdditiveExpressionNode(AdditiveExpressionNode node)
			throws TransformationException {
		return Node2AstUtil.createBinaryOperationChainFromList(node, node
				.getFirst(), node.getNexts(), this);
	}

	@Override
	public SyntaxElement caseAndExpressionNode(AndExpressionNode node)
			throws TransformationException {
		return Node2AstUtil.createBinaryOperationChainFromList(node, node
				.getFirst(), node.getNexts(), this);
	}

	@Override
	public SyntaxElement caseAroundNode(AroundNode node)
			throws TransformationException {
		// TODO Auto-generated method stub
		return super.caseAroundNode(node);
	}

	@Override
	public SyntaxElement caseBooleanLiteralNode(BooleanLiteralNode node)
			throws TransformationException {
		BooleanLiteral booleanLiteral = expressionFactory
				.createBooleanLiteral();
		booleanLiteral.setLiteralValue(createIdentifier(node));
		return booleanLiteral;
	}

	@Override
	public SyntaxElement caseCasePartNode(CasePartNode node)
			throws TransformationException {
		Case caseExpression = expressionFactory.createCase();
		setPosition(caseExpression, node);
		caseExpression.setCondition((AbstractExpression) doSwitch(node
				.getCondition()));
		caseExpression.setThenPart((AbstractExpression) doSwitch(node
				.getExpression()));
		return caseExpression;
	}

	@Override
	public SyntaxElement caseCastedExpressionNode(CastedExpressionNode node)
			throws TransformationException {
		Cast cast = expressionFactory.createCast();
		setPosition(cast, node);
		cast.setType((Identifier) doSwitch(node.getType()));
		cast.setTarget((AbstractExpression) doSwitch(node.getTarget()));
		return cast;
	}

	@Override
	public SyntaxElement caseChainExpressionNode(ChainExpressionNode node)
			throws TransformationException {
		ChainExpression chainExpression = expressionFactory
				.createChainExpression();
		setPosition(chainExpression, node);
		chainExpression
				.setFirst((AbstractExpression) doSwitch(node.getFirst()));
		ChainExpression currentPrevious = chainExpression;
		EList<CompositeNode> nextNodes = node.getNexts();
		for (int i = 0; i < nextNodes.size() - 1; ++i) {
			ChainExpression nextExpression = expressionFactory
					.createChainExpression();
			nextExpression.setFirst((AbstractExpression) doSwitch(nextNodes
					.get(i)));
			currentPrevious.setNext(nextExpression);
			currentPrevious = nextExpression;
		}
		currentPrevious.setNext((AbstractExpression) doSwitch(nextNodes
				.get(nextNodes.size() - 1)));
		return chainExpression;
	}

	@Override
	public SyntaxElement caseCheckNode(CheckNode node)
			throws TransformationException {
		Check check = declarationFactory.createCheck();
		setPosition(check, node);
		check.setErrorSeverity(node.getError() != null);
		if (node.getIfExpression() != null) {
			check
					.setGuard((AbstractExpression) doSwitch(node
							.getIfExpression()));
		}
		check
				.setConstraint((AbstractExpression) doSwitch(node
						.getConstraint()));
		check.setMsg((AbstractExpression) doSwitch(node.getMessage()));
		createAndAddImplicitlyDeclaredThisParameter(node.getType(), check
				.getParams());
		return check;
	}

	@Override
	public SyntaxElement caseCollectionExpressionNode(
			CollectionExpressionNode node) throws TransformationException {
		Node kindNode = node.getChildren().get(0);
		String kind = kindNode.text();
		if ("typeSelect".equals(kind)) {
			TypeSelectExpression typeSelectExpression = expressionFactory
					.createTypeSelectExpression();
			setPosition(typeSelectExpression, node);
			typeSelectExpression
					.setTypeLiteral((Identifier) createIdentifier(node
							.getType()));
			return typeSelectExpression;
		}
		CollectionExpression collectionExpression = expressionFactory
				.createCollectionExpression();
		setPosition(collectionExpression, node);
		collectionExpression.setName(createIdentifier(kindNode));
		if (node.getVariable() != null) {
			collectionExpression
					.setEleName(createIdentifier(node.getVariable()));
		}
		collectionExpression.setClosure((AbstractExpression) doSwitch(node
				.getExpression()));
		return collectionExpression;
	}

	@Override
	public SyntaxElement caseCollectionTypeNode(CollectionTypeNode node)
			throws TransformationException {
		Identifier identifier = xpandFactory.createIdentifier();
		setPosition(identifier, node);
		identifier.setValue(node.text());
		return identifier;
	}

	@Override
	public SyntaxElement caseDeclaredParameterNode(DeclaredParameterNode dpn) {
		DeclaredParameter dp = xpandFactory.createDeclaredParameter();
		setPosition(dp, dpn);
		dp.setName((Identifier) caseIdentifierNode(dpn.getName()));
		dp.setType((Identifier) doSwitch(dpn.getPtype()));
		return dp;
	}

	@Override
	public SyntaxElement caseDeclaredParameterListNode(
			DeclaredParameterListNode object) {
		throw new TransformationException("Rule should not be called directly",
				object);
	}

	@Override
	public SyntaxElement caseDefinitionAroundNode(DefinitionAroundNode node)
			throws TransformationException {
		DefinitionAspect definitionAspect = declarationFactory
				.createDefinitionAspect();
		setPosition(definitionAspect, node);
		definitionAspect.setPointcut((Identifier) casePointcutNode(node
				.getPointcut()));

		EList<DeclaredParameter> parameters = definitionAspect.getParams();
		createAndAddImplicitlyDeclaredThisParameter(node.getType(), parameters);
		createParameters(node.getParamList(), parameters);

		EList<AbstractStatement> body = definitionAspect.getBody();
		createBody(node.getSequence(), body);

		return definitionAspect;
	}

	@Override
	public SyntaxElement caseDefinitionNode(DefinitionNode node) {
		Definition definition = declarationFactory.createDefinition();
		setPosition(definition, node);
		definition.setName((Identifier) caseIdentifierNode(node.getName()));

		EList<DeclaredParameter> parameters = definition.getParams();
		createAndAddImplicitlyDeclaredThisParameter(node.getType(), parameters);
		createParameters(node.getParamList(), parameters);

		EList<AbstractStatement> body = definition.getBody();
		createBody(node.getSequence(), body);

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
	public SyntaxElement caseErrorStatementNode(ErrorStatementNode node)
			throws TransformationException {
		ErrorStatement errorStatement = statementFactory.createErrorStatement();
		setPosition(errorStatement, node);
		errorStatement.setMessage((AbstractExpression) doSwitch(node
				.getExpression()));
		return errorStatement;
	}

	@Override
	public SyntaxElement caseExpandStatementNode(ExpandStatementNode node)
			throws TransformationException {
		ExpandStatement expandStatement = statementFactory
				.createExpandStatement();
		expandStatement.setDefinition(createIdentifier(node.getName()));

		EList<AbstractExpression> parameters = expandStatement.getParameters();
		if (node.getForEachExpression() != null) {
			expandStatement.setForeach(true);
			expandStatement.setTarget((AbstractExpression) doSwitch(node
					.getForEachExpression()));
			if (node.getSeparator() != null) {
				expandStatement.setSeparator((AbstractExpression) doSwitch(node
						.getSeparator()));
			}
		} else {
			expandStatement.setForeach(false);
			if (node.getForExpression() != null) {
				expandStatement.setTarget((AbstractExpression) doSwitch(node
						.getForExpression()));
			} else {
				FeatureCall featureCall = expressionFactory.createFeatureCall();
				featureCall.setName(createIdentifier("this", node));
				expandStatement.setTarget(featureCall);
			}
		}

		ParameterListNode pln = (ParameterListNode) node.getParamList();
		if (pln != null) {
			for (Node pn : pln.getParams()) {
				parameters.add((AbstractExpression) doSwitch(pn));
			}
		}
		return expandStatement;
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
	public SyntaxElement caseExtensionNode(ExtensionNode node) {
		Extension extension;
		if (node.getCreate() != null) {
			extension = declarationFactory.createCreateExtensionStatement();
			createAndAddImplicitlyDeclaredThisParameter(node.getReturnType(),
					extension.getParams());
			// TODO alternative identifier
		} else {
			extension = declarationFactory.createExtension();
		}
		extension.setName((Identifier) caseIdentifierNode(node.getName()));
		DeclaredParameterListNode paramListNode = (DeclaredParameterListNode) node
				.getParamList();
		EList<DeclaredParameter> parameters = extension.getParams();
		createParameters(paramListNode, parameters);
		CompositeNode extendBody = node.getExtendBody();
		if (extendBody != null) {
			extension.setBody((AbstractExpression) doSwitch(extendBody));
		} else {
			// TODO JAVA extension
		}
		extension.setCached(node.getCached() != null);
		extension.setIsPrivate(node.getPrivate() != null);
		return extension;
	}

	@Override
	public SyntaxElement caseExtensionImportNode(ExtensionImportNode node)
			throws TransformationException {
		ImportStatement importStatement = xpandFactory.createImportStatement();
		setPosition(importStatement, node);
		if (node.getNamespace() != null) {
			importStatement.setImportedId((Identifier) doSwitch(node
					.getNamespace()));
		} else if (node.getType() != null) {
			importStatement
					.setImportedId((Identifier) doSwitch(node.getType()));
		}
		return importStatement;
	}

	@Override
	public SyntaxElement caseFeatureCallNode(FeatureCallNode node) {
		Node firstChildNode = node.getChildren().get(0);
		if (firstChildNode.eClass().getClassifierID() == Xpand3nodePackage.COLLECTION_EXPRESSION_NODE) {
			return caseCollectionExpressionNode(firstChildNode);
		}
		FeatureCall featureCall;
		if (node.getName() == null) {
			featureCall = expressionFactory.createFeatureCall();
		} else {
			featureCall = expressionFactory.createOperationCall();
			ParameterListNode pln = (ParameterListNode) node.getParamList();
			EList<AbstractExpression> params = ((OperationCall) featureCall)
					.getParams();
			if (pln != null) {
				for (Node pn : pln.getParams()) {
					params.add((AbstractExpression) doSwitch(pn));
				}
			}
		}
		setPosition(featureCall, node);
		Node nameNode = firstChildNode;
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
		return createIdentifier(in);
	}

	@Override
	public SyntaxElement caseIfExpressionNode(IfExpressionNode node)
			throws TransformationException {
		IfExpression ifExpression = expressionFactory.createIfExpression();
		Node conditionNode = (node.getCondition0() != null) ? node
				.getCondition0() : node.getCondition1();
		ifExpression.setCondition((AbstractExpression) doSwitch(conditionNode));
		ifExpression.setThenPart((AbstractExpression) doSwitch(node.getThen()));
		if (node.getElse() != null) {
			ifExpression.setElsePart((AbstractExpression) doSwitch(node
					.getElse()));
		}
		return ifExpression;
	}

	@Override
	public SyntaxElement caseIfStatementNode(IfStatementNode node)
			throws TransformationException {
		IfStatement ifStatement = statementFactory.createIfStatement();
		ifStatement.setCondition((AbstractExpression) doSwitch(node
				.getExpression()));
		createBody(node.getSequence(), ifStatement.getBody());
		IfStatement currentParentIf = ifStatement;
		for (Node elseIfNode : node.getElseIfs()) {
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
	public SyntaxElement caseImpliesExpressionNode(ImpliesExpressionNode node)
			throws TransformationException {
		return Node2AstUtil.createBinaryOperationChainFromList(node, node
				.getFirst(), node.getNexts(), this);
	}

	@Override
	public SyntaxElement caseImportNode(ImportNode node)
			throws TransformationException {
		ImportStatement importStatement = xpandFactory.createImportStatement();
		setPosition(importStatement, node);
		if (node.getNamespace() != null) {
			importStatement.setImportedId((Identifier) doSwitch(node
					.getNamespace()));
		} else if (node.getType() != null) {
			importStatement
					.setImportedId((Identifier) doSwitch(node.getType()));
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
	public SyntaxElement caseNumberLiteralNode(NumberLiteralNode node)
			throws TransformationException {
		EList<Node> childNodes = node.getChildren();
		Literal numberLiteral;
		if (childNodes.size() > 1) {
			numberLiteral = expressionFactory.createRealLiteral();
		} else {
			numberLiteral = expressionFactory.createIntegerLiteral();
		}
		numberLiteral.setLiteralValue(createIdentifier(node));
		return numberLiteral;
	}

	@Override
	public SyntaxElement caseListLiteralNode(ListLiteralNode node)
			throws TransformationException {
		ListLiteral listLiteral = expressionFactory.createListLiteral();
		EList<AbstractExpression> elements = listLiteral.getElements();
		for (Node elementNodes : node.getElements()) {
			elements.add((AbstractExpression) doSwitch(elementNodes));
		}
		return listLiteral;
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
		return Node2AstUtil.createBinaryOperationChainFromList(node, node
				.getFirst(), node.getNexts(), this);
	}

	@Override
	public SyntaxElement caseNullLiteralNode(NullLiteralNode node)
			throws TransformationException {
		NullLiteral nullLiteral = expressionFactory.createNullLiteral();
		nullLiteral.setLiteralValue(createIdentifier(node));
		return nullLiteral;
	}

	@Override
	public SyntaxElement caseOrExpressionNode(OrExpressionNode node)
			throws TransformationException {
		return Node2AstUtil.createBinaryOperationChainFromList(node, node
				.getFirst(), node.getNexts(), this);
	}

	@Override
	public SyntaxElement caseParameterListNode(ParameterListNode node)
			throws TransformationException {
		throw new TransformationException("Rule should not be called directly",
				node);
	}

	@Override
	public SyntaxElement caseParanthesizedExpressionNode(
			ParanthesizedExpressionNode node) throws TransformationException {
		return doSwitch(node.getExpression());
	}

	@Override
	public SyntaxElement casePointcutNode(PointcutNode node)
			throws TransformationException {
		return createIdentifier(node);
	}

	@Override
	public SyntaxElement caseRelationalExpressionNode(
			RelationalExpressionNode node) {
		return Node2AstUtil.createBinaryOperationChainFromList(node, node
				.getFirst(), node.getNexts(), this);
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
		stringLiteral.setLiteralValue(createIdentifier(node));
		return stringLiteral;
	}

	@Override
	public SyntaxElement caseSwitchExpressionNode(SwitchExpressionNode node)
			throws TransformationException {
		SwitchExpression switchExpression = expressionFactory
				.createSwitchExpression();
		setPosition(switchExpression, node);
		if (node.getExpression() != null) {
			switchExpression.setSwitchExpr((AbstractExpression) doSwitch(node
					.getExpression()));
		}
		for (Node caseNode : node.getCases()) {
			switchExpression.getCases().add((Case) caseCasePartNode(caseNode));
		}
		CompositeNode defaultNode = node.getDefault();
		if (defaultNode != null) {
			switchExpression
					.setDefaultExpr((AbstractExpression) doSwitch(defaultNode));
		}
		return switchExpression;
	}

	@Override
	public SyntaxElement caseTest_expressionNode(Test_expressionNode node)
			throws TransformationException {
		throw new TransformationException("Rule should not be called directly",
				node);
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
	public SyntaxElement caseTextSequenceNode(TextSequenceNode node)
			throws TransformationException {
		throw new TransformationException("Rule should not be called directly",
				node);
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
