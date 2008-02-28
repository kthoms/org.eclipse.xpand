package org.eclipse.xpand3.parser;

import java.util.List;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.xpand3.node.CompositeNode;
import org.eclipse.xpand3.node.LeafNode;
import org.eclipse.xpand3.node.LexedToken;
import org.eclipse.xpand3.node.Node;
import org.eclipse.xpand3.node.NodeUtil;

public class Xpand3MigratedNodeParserTest extends TestCase {

	private CompositeNode parse(String s) throws Exception {
		ANTLRStringStream stream = new ANTLRStringStream(s);
		Xpand3Lexer lexer = new Xpand3Lexer(stream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		AbstractXpand3NodeParser xpand3NodeParser = new Xpand3NodeParser(
				tokenStream);
		xpand3NodeParser.test_expression();
		Node rootNode = xpand3NodeParser.getRootNode();
		System.out.println(NodeUtil.toString(rootNode));
		// System.out.println(NodeUtil.serialize(rootNode));
		return (CompositeNode) rootNode;
	}

	private CompositeNode checkIsRule(Node node, String ruleName,
			int numChildren) {
		assertTrue(node instanceof CompositeNode);
		assertEquals(ruleName, ((CompositeNode) node).getRule());
		assertEquals(numChildren, ((CompositeNode) node).getChildren().size());
		return (CompositeNode) node;
	}

	private CompositeNode checkChildIsRule(Node parent, int index,
			String ruleName, int numChildren) {
		return checkIsRule(getChild(parent, index), ruleName, numChildren);
	}

	private CompositeNode checkChildIsIdentifier(Node parent, int index,
			String identifierName) {
		CompositeNode st = checkChildIsRule(parent, index, "r_simpleType", 1);
		CompositeNode i = checkChildIsRule(st, 0, "r_identifier", 1);
		checkChildIsToken(i, 0, identifierName);
		return st;
	}

	private LeafNode checkIsToken(Node node, String tokenText) {
		assertTrue(node instanceof LeafNode);
		LexedToken token = ((LeafNode) node).getToken();
		assertNotNull(token);
		assertEquals(tokenText, token.getText());
		return (LeafNode) node;
	}

	private LeafNode checkChildIsToken(Node parent, int index, String tokenText) {
		return checkIsToken(getChild(parent, index), tokenText);
	}

	private Node getChild(Node parent, int index) {
		assertNotNull(parent);
		assertTrue(parent instanceof CompositeNode);
		List<Node> children = ((CompositeNode) parent).getChildren();
		assertTrue(children.size() > index);
		Node child = children.get(index);
		return child;
	}

	public final void testSimple() throws Exception {
		CompositeNode parse = parse("true == null");
		CompositeNode cn = checkIsRule(parse, "r_relationalExpression", 3);
		CompositeNode bl = checkChildIsRule(cn, 0, "r_booleanLiteral", 1);
		checkChildIsToken(bl, 0, "true");
		checkChildIsToken(cn, 1, "==");
		CompositeNode nl = checkChildIsRule(cn, 2, "r_nullLiteral", 1);
		checkChildIsToken(nl, 0, "null");
	}

	public final void testSimple2() throws Exception {
		CompositeNode ie = checkIsRule(
				parse("String.feature.test(true,{\"test\",\"hallo\"})"),
				"r_infixExpression", 5);
		checkChildIsIdentifier(ie, 0, "String");
		checkChildIsToken(ie, 1, ".");
		checkChildIsIdentifier(ie, 2, "feature");
		checkChildIsToken(ie, 3, ".");
		CompositeNode fc = checkChildIsRule(ie, 4, "r_featureCall", 4);
		CompositeNode i3 = checkChildIsRule(fc, 0, "r_identifier", 1);
		checkChildIsToken(i3, 0, "test");
		checkChildIsToken(fc, 1, "(");
		CompositeNode pl = checkChildIsRule(fc, 2, "r_parameterList", 3);
		CompositeNode bl = checkChildIsRule(pl, 0, "r_booleanLiteral", 1);
		checkChildIsToken(bl, 0, "true");
		checkChildIsToken(pl, 1, ",");
		CompositeNode ll = checkChildIsRule(pl, 2, "r_listLiteral", 5);
		checkChildIsToken(ll, 0, "{");
		CompositeNode pe1 = checkChildIsRule(ll, 1, "r_stringLiteral", 1);
		checkChildIsToken(pe1, 0, "\"test\"");
		checkChildIsToken(ll, 2, ",");
		CompositeNode pe2 = checkChildIsRule(ll, 3, "r_stringLiteral", 1);
		checkChildIsToken(pe2, 0, "\"hallo\"");
		checkChildIsToken(ll, 4, "}");
		checkChildIsToken(fc, 3, ")");
	}

	public final void testIfExpression() throws Exception {
		CompositeNode expr = parse("(client.sIdent1 != null) ? client.sIdent1 : \"XXXXXXXX\"");
		CompositeNode ie = checkIsRule(expr, "r_ifExpression", 5);
		CompositeNode pe = checkChildIsRule(ie, 0, "r_paranthesizedExpression",
				3);
		checkChildIsToken(pe, 0, "(");
		CompositeNode re = checkChildIsRule(pe, 1, "r_relationalExpression", 3);
		CompositeNode ie0 = checkChildIsRule(re, 0, "r_infixExpression", 3);
		checkChildIsIdentifier(ie0, 0, "client");
		checkChildIsToken(ie0, 1, ".");
		checkChildIsIdentifier(ie0, 2, "sIdent1");
		checkChildIsToken(re, 1, "!=");
		CompositeNode nl = checkChildIsRule(re, 2, "r_nullLiteral", 1);
		checkChildIsToken(nl, 0, "null");
		checkChildIsToken(pe, 2, ")");
		checkChildIsToken(ie, 1, "?");
		CompositeNode ie1 = checkChildIsRule(ie, 2, "r_infixExpression", 3);
		checkChildIsIdentifier(ie1, 0, "client");
		checkChildIsToken(ie1, 1, ".");
		checkChildIsIdentifier(ie1, 2, "sIdent1");
		checkChildIsToken(ie, 3, ":");
		CompositeNode pe1 = checkChildIsRule(ie, 4, "r_stringLiteral", 1);
		checkChildIsToken(pe1, 0, "\"XXXXXXXX\"");
	}

	public void testIfExpression2() throws Exception {
		Node expr = parse("if true then true else false");
		checkIsRule(expr, "r_ifExpression", 6);
		checkChildIsToken(expr, 0, "if");
		CompositeNode bl0 = checkChildIsRule(expr, 1, "r_booleanLiteral", 1);
		checkChildIsToken(bl0, 0, "true");
		checkChildIsToken(expr, 2, "then");
		CompositeNode bl1 = checkChildIsRule(expr, 3, "r_booleanLiteral", 1);
		checkChildIsToken(bl1, 0, "true");
		checkChildIsToken(expr, 4, "else");
		CompositeNode bl2 = checkChildIsRule(expr, 5, "r_booleanLiteral", 1);
		checkChildIsToken(bl2, 0, "false");
	}

	public final void testEscaped() throws Exception {
		Node expr = parse("\"\\\"\"");
		checkIsRule(expr, "r_stringLiteral", 1);
		checkChildIsToken(expr, 0, "\"\\\"\"");
	}

	public final void testNot() throws Exception {
		Node expr = parse("! ts.checked");
		checkIsRule(expr, "r_unaryExpression", 2);
		checkChildIsToken(expr, 0, "!");
	}

	public final void testCast() throws Exception {
		Node expr = parse("(List[InnerType]) anExpr");
		checkIsRule(expr, "r_castedExpression", 4);
		checkChildIsToken(expr, 0, "(");
		CompositeNode ct = checkChildIsRule(expr, 1, "r_collectionType", 4);
		checkChildIsToken(ct, 0, "List");
		checkChildIsToken(ct, 1, "[");
		checkChildIsIdentifier(ct, 2, "InnerType");
		checkChildIsToken(ct, 3, "]");
		checkChildIsToken(expr, 2, ")");
		checkChildIsIdentifier(expr, 3, "anExpr");
	}

	public final void testSwitch() throws Exception {
		Node expr = parse("switch { default : true }");

	}
	// assertNull(expr.getSwitchExpr());
	// assertTrue(expr.getCases().isEmpty());
	// assertEquals("true", ((BooleanLiteral)
	// expr.getDefaultExpr()).getLiteralValue().getValue());
	//
	// expr = (SwitchExpression) parse("switch (\"test\") { case \"horst\":
	// false default : true }");
	// assertEquals("\"test\"", ((StringLiteral)
	// expr.getSwitchExpr()).getLiteralValue().getValue());
	// final Case c = expr.getCases().get(0);
	// assertEquals("\"horst\"", ((StringLiteral)
	// c.getCondition()).getLiteralValue().getValue());
	// assertEquals("false", ((BooleanLiteral)
	// c.getThenPart()).getLiteralValue().getValue());
	//
	// assertEquals("true", ((BooleanLiteral)
	// expr.getDefaultExpr()).getLiteralValue().getValue());
	// }
	//
	// public final void testChainExpression() {
	// final ChainExpression expr = (ChainExpression) parse("1 -> 2 -> 3 -> 4");
	// assertEquals("4", expr.getNext().toString());
	// assertEquals("1->2->3", expr.getFirst().toString());
	// }
	//
	// public final void testPositionInfo() {
	// final Expression exp = parse("\n\n\n1");
	// assertEquals(4, exp.getLine());
	// assertEquals(3, exp.getStart());
	// assertEquals(4, exp.getEnd());
	//
	// }
	//
	// public final void testPositionInfo2() {
	// final Expression exp = parse("/*\n\n\n*/1");
	// assertEquals(4, exp.getLine());
	// assertEquals(7, exp.getStart());
	// assertEquals(8, exp.getEnd());
	// }
	//
	// public final void testPositionInfo3() {
	// final OperationCall exp = (OperationCall) parse("'/*\n\n\n*/'+1");
	// assertEquals(1, exp.getLine());
	// assertEquals(0, exp.getStart());
	// assertEquals(11, exp.getEnd());
	// final StringLiteral target = (StringLiteral) exp.getTarget();
	// assertEquals(1, target.getLine());
	// assertEquals(0, target.getStart());
	// assertEquals(9, target.getEnd());
	// final IntegerLiteral param = (IntegerLiteral) exp.getParams()[0];
	// assertEquals(4, param.getLine());
	// assertEquals(10, param.getStart());
	// assertEquals(11, param.getEnd());
	// }
	//
	// public final void testTypeLiterals() {
	// final Expression e = parse("{" + " Object,\n" + " String,\n" +
	// "Collection,\n" + " Set,\n" + " List,\n"
	// + " oaw::Type,\n" + " oaw::Feature,\n" + " oaw::Property\n}");
	//
	// assertNotNull(e);
	// }
	//
}
