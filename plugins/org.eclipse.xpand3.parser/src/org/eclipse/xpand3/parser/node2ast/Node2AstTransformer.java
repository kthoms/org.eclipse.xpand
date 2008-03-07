package org.eclipse.xpand3.parser.node2ast;

import org.eclipse.emf.common.util.EList;
import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;
import org.eclipse.tmf.common.node.Node;
import org.eclipse.xpand3.DeclaredParameter;
import org.eclipse.xpand3.Identifier;
import org.eclipse.xpand3.SyntaxElement;
import org.eclipse.xpand3.Xpand3Factory;
import org.eclipse.xpand3.declaration.DeclarationFactory;
import org.eclipse.xpand3.declaration.Extension;
import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.BooleanOperation;
import org.eclipse.xpand3.expression.ExpressionFactory;
import org.eclipse.xpand3.expression.FeatureCall;
import org.eclipse.xpand3.expression.OperationCall;
import org.eclipse.xpand3.internal.parser.xpand3node.BooleanOperatorNode;
import org.eclipse.xpand3.internal.parser.xpand3node.CollectionTypeNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterListNode;
import org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode;
import org.eclipse.xpand3.internal.parser.xpand3node.IdentifierNode;
import org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.ParameterListNode;
import org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode;
import org.eclipse.xpand3.internal.parser.xpand3node.SimpleTypeNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;
import org.eclipse.xpand3.internal.parser.xpand3node.util.Xpand3nodeSwitch;
import org.eclipse.xpand3.statement.StatementFactory;

public class Node2AstTransformer extends Xpand3nodeSwitch<SyntaxElement> {

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

	public SyntaxElement caseType(CompositeNode node) {
		switch (node.eClass().getClassifierID()) {
		case Xpand3nodePackage.SIMPLE_TYPE_NODE:
			return caseSimpleTypeNode((SimpleTypeNode) node);
		case Xpand3nodePackage.COLLECTION_TYPE_NODE:
			return caseCollectionTypeNode((CollectionTypeNode) node);
		default:
			throw new TransformationException("Illegal type", node);
		}
	}

	public Identifier createIdentifier(LeafNode leaf) {
		Identifier si = xpandFactory.createIdentifier();
		setPosition(si, leaf);
		si.setValue(getTextFromLeafNode(leaf));
		return si;
	}

	// Overridden switch methods

	@Override
	public SyntaxElement caseBooleanOperatorNode(BooleanOperatorNode bon) {
		return createIdentifier((LeafNode) bon.getChildren().get(0));
	}

	@Override
	public SyntaxElement caseDeclaredParameterNode(DeclaredParameterNode dpn) {
		DeclaredParameter dp = xpandFactory.createDeclaredParameter();
		setPosition(dp, dpn);
		dp.setName((Identifier) caseIdentifierNode((IdentifierNode) dpn
				.getName()));
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
	public SyntaxElement caseExtensionNode(ExtensionNode en) {
		Extension ext = declarationFactory.createExtension();
		ext.setName((Identifier) caseIdentifierNode((IdentifierNode) en
				.getName()));
		DeclaredParameterListNode paramList = (DeclaredParameterListNode) en
				.getParamList();
		if (paramList != null) {
			for (Node param : paramList.getParams()) {
				ext
						.getParams()
						.add(
								(DeclaredParameter) caseDeclaredParameterNode((DeclaredParameterNode) param));
			}
		}
		CompositeNode extendBody = en.getExtendBody();
		if (extendBody != null) {
			ext.setBody((AbstractExpression) doSwitch(extendBody));
		}
		return ext;
	}

	@Override
	public SyntaxElement caseFeatureCallNode(FeatureCallNode fcn) {
		OperationCall operationCall = expressionFactory.createOperationCall();
		setPosition(operationCall, fcn);
		operationCall
				.setName((Identifier) caseIdentifierNode((IdentifierNode) fcn
						.getName()));
		ParameterListNode pln = (ParameterListNode) fcn.getParamList();
		if (pln != null) {
			EList<AbstractExpression> params = operationCall.getParams();
			for (Node pn : pln.getParams()) {
				params
						.add((AbstractExpression) caseExpressionNode((ExpressionNode) pn));
			}
		}
		return operationCall;
	}

	@Override
	public SyntaxElement caseIdentifierNode(IdentifierNode in) {
		return createIdentifier((LeafNode) in.getChildren().get(0));
	}

	@Override
	public SyntaxElement caseInfixExpressionNode(InfixExpressionNode ien) {
		CompositeNode targetNode = ien.getTarget();
		AbstractExpression target = createFeatureOrOperationCall(targetNode,
				null);
		for (Node callNode : ien.getCalls()) {
			target = createFeatureOrOperationCall((CompositeNode) callNode,
					target);
		}
		return target;
	}

	private AbstractExpression createFeatureOrOperationCall(
			CompositeNode targetNode, AbstractExpression target) {
		switch (targetNode.eClass().getClassifierID()) {
		case Xpand3nodePackage.SIMPLE_TYPE_NODE:
			FeatureCall featureCall = createFeatureCall((SimpleTypeNode) targetNode);
			featureCall.setTarget(target);
			return featureCall;
		case Xpand3nodePackage.FEATURE_CALL_NODE:
			OperationCall operationCall = (OperationCall) caseFeatureCallNode((FeatureCallNode) targetNode);
			operationCall.setTarget(target);
			return operationCall;
		default:
			throw new TransformationException(
					"Not implemented yet in infix expression", targetNode);
		}
	}

	private OperationCall createFeatureCall(SimpleTypeNode stn) {
		OperationCall oc = expressionFactory.createOperationCall();
		setPosition(oc, stn);
		oc.setName((Identifier) caseSimpleTypeNode(stn));
		return oc;
	}

	@Override
	public SyntaxElement caseRelationalExpressionNode(
			RelationalExpressionNode ren) {
		BooleanOperation bo = expressionFactory.createBooleanOperation();
		bo.setLeft((AbstractExpression) doSwitch(ren.getLeftOperand()));
		bo
				.setOperator((Identifier) caseBooleanOperatorNode((BooleanOperatorNode) ren
						.getOperator()));
		bo.setRight((AbstractExpression) doSwitch(ren.getRightOperand()));
		return bo;
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
		return caseIdentifierNode((IdentifierNode) names.get(0));
	}

	
}
