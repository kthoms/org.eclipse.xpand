package org.eclipse.xpand3.parser;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.xpand3.node.Node;
import org.eclipse.xpand3.node.NodeUtil;

public class Xpand3NodeParserTest extends TestCase {
	private Node parse(String s) throws Exception {
		ANTLRStringStream stream = new ANTLRStringStream(s);
		Xpand3Lexer lexer = new Xpand3Lexer(stream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		AbstractXpand3NodeParser xpand3NodeParser = new Xpand3NodeParser(tokenStream);
		xpand3NodeParser.r_file();
		return xpand3NodeParser.getRootNode();
	}
	
	public void testFoo() throws Exception {
		Node node = parse("import foo; myFunction(String this) : doStuff('holla');");
		System.out.println(NodeUtil.toString(node));
		System.out.println(NodeUtil.serialize(node));
	}
}
