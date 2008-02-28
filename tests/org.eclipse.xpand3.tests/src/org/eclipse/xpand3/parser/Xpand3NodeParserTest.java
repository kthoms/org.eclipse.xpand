package org.eclipse.xpand3.parser;

import static org.eclipse.xpand3.parser.SyntaxUtil.LG;
import static org.eclipse.xpand3.parser.SyntaxUtil.RG;
import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.xpand3.node.Node;
import org.eclipse.xpand3.node.NodeUtil;
import org.eclipse.xpand3.parser.Xpand3Parser.r_file_return;

public class Xpand3NodeParserTest extends TestCase {
	private Node parse(String s) throws Exception {
		ANTLRStringStream stream = new ANTLRStringStream(s);
		Xpand3Lexer lexer = new Xpand3Lexer(stream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		Xpand3NodeParser parser = new Xpand3NodeParser(tokenStream);
		r_file_return r_file = parser.r_file();
		return parser.getRootNode();
	}
	
	public void testname() throws Exception {
		Node x = parse(LG + "IMPORT foo" + RG
				+ "import foo; myFunction(String this) : doStuff('holla');"
				+ LG + "DEFINE foo FOR Entity" + RG + "bla" + LG + "ENDDEFINE"
				+ RG);
		System.out.println(NodeUtil.toString(x));
	}

	public void testFoo() throws Exception {
		Node node = parse("import foo; myFunction(String this) : doStuff('holla');");
		System.out.println(NodeUtil.toString(node));
		System.out.println(NodeUtil.serialize(node));
	}

	public void testXpandXtendCheckMixedUp1() throws Exception {
		Node node = parse(LG + "IMPORT foo" + RG
				+ "import foo; myFunction(String this) : doStuff('holla');"
				+ LG + "DEFINE foo FOR Entity" + RG + "bla" + LG + "ENDDEFINE"
				+ RG);
		System.out.println(NodeUtil.toString(node));
		System.out.println(NodeUtil.serialize(node));
	}
}
