/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xpand3.parser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.xpand3.node.CompositeNode;
import org.eclipse.xpand3.node.Node;
import org.eclipse.xpand3.node.NodeUtil;

/**
 * @author Jan Kšhnlein
 */
public class StatementParserTest extends AbstractXpand3NodeParserTest {
	private CompositeNode parse(String s) throws Exception {
		System.out.println(s);
		ANTLRStringStream stream = new ANTLRStringStream(s);
		Xpand3Lexer lexer = new Xpand3Lexer(stream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		AbstractXpand3NodeParser xpand3NodeParser = new Xpand3NodeParser(
				tokenStream);
		xpand3NodeParser.r_file();
		Node rootNode = xpand3NodeParser.getRootNode();
		if (rootNode == null) {
			System.out.println("Nothing parsed.");
		} else {
			System.out.println(NodeUtil.toString(rootNode));
		}
		return (CompositeNode) rootNode;
	}

	public final void testEmptyTemplate() throws Exception {
		Node expr = parse("");
		assertNull(expr);
	}

	public final void testSimpleDefine() throws Exception {
		Node expr = parse(tag("DEFINE test FOR ecore::EClass")
				+ tag("ENDDEFINE"));
		checkIsRule(expr, "r_definition", 8);
		checkChildIsToken(expr, 0, LGS);
		checkChildIsToken(expr, 1, "DEFINE");
		checkChildIsToken(expr, 3, "FOR");
		checkChildIsToken(expr, 6, "ENDEFINE");
		checkChildIsToken(expr, 7, RGS);

	}
	//
	// public final void testDoubleDefine() throws Exception {
	// final Template t = parse(tag("DEFINE test FOR ecore::EClass") +
	// tag("ENDDEFINE")
	// + tag("DEFINE test2(String txt) FOR ecore::EClass") + tag("ENDDEFINE"));
	// assertEquals(2, t.getDefinitions().length);
	// }
	//
	// public final void testMoreComplexDefine() throws Exception {
	// final Template t = parse(tag("DEFINE test(ecore::EPackage a,String b) FOR
	// ecore::EClass")
	// + tag("FILE name+\".txt\"") + "Text und so " + tag("name") + tag("FOREACH
	// eAllattributes AS attr")
	// + "Attribute : " + tag("attr.name") + tag("ENDFOREACH") + tag("ENDFILE")
	// +
	// tag("ENDDEFINE"));
	// assertEquals(1, t.getDefinitions().length);
	// final Definition def = (Definition) t.getDefinitions()[0];
	// assertEquals("test", def.getName());
	// assertEquals(2, def.getParams().length);
	// DeclaredParameter param = def.getParams()[0];
	// assertEquals("a", param.getName().getValue());
	// assertEquals("ecore::EPackage", param.getType().getValue());
	// param = def.getParams()[1];
	// assertEquals("b", param.getName().getValue());
	// assertEquals("String", param.getType().getValue());
	// assertEquals("ecore::EClass", def.getType().getValue());
	// List<Statement> statements = Arrays.asList(def.getBody());
	// assertEquals(3, statements.size());
	// final FileStatement f = (FileStatement) statements.get(1);
	// final Expression concat = f.getTargetFileName();
	// assertNotNull(concat);
	// statements = Arrays.asList(f.getBody());
	// assertEquals(5, statements.size());
	// assertEquals("Text und so ", ((TextStatement)
	// statements.get(0)).getValue());
	// }
	//
	// public final void testImportDeclaration() throws Exception {
	// Template t;
	// t = parse(tag("IMPORT org::eclipse::xtend") + tag("IMPORT
	// org::eclipse::xtend::xpand")
	// + tag("DEFINE test FOR ecore::EClass") + tag("ENDDEFINE"));
	// assertEquals(1, t.getDefinitions().length);
	// assertEquals(2, t.getImports().length);
	//
	// }
	//
	// public final void testFileStatement() throws Exception {
	// final Template t = parse(tag("DEFINE test FOR ecore::EClass") + tag("FILE
	// \"test.txt\" ONCE") + tag("ENDFILE")
	// + tag("ENDDEFINE"));
	// assertEquals(1, t.getDefinitions().length);
	// final FileStatement file = (FileStatement) ((Definition)
	// t.getDefinitions()[0]).getBody()[1];
	// assertEquals("ONCE", file.getMode().getValue());
	// }
	//
	// public final void testIfStatement() throws Exception {
	// final Template t = parse(tag("DEFINE test FOR ecore::EClass") + tag("IF
	// !true") + tag("ELSEIF false")
	// + tag("ELSE") + tag("ENDIF") + tag("ENDDEFINE"));
	// assertEquals(1, t.getDefinitions().length);
	//
	// final IfStatement ifSt = (IfStatement) ((Definition)
	// t.getDefinitions()[0]).getBody()[1];
	// assertNotNull(ifSt);
	// assertNotNull(ifSt.getCondition());
	// assertNotNull(ifSt.getElseIf());
	// assertNotNull(ifSt.getElseIf().getCondition());
	// assertNotNull(ifSt.getElseIf().getElseIf());
	// assertNull(ifSt.getElseIf().getElseIf().getCondition());
	// }
	//    
	// public void testLocation() throws Exception {
	// String defineStart = tag("DEFINE test FOR ecore::EClass");
	// String ifStmnt = tag("IF !true") + tag("ELSEIF false")
	// + tag("ELSE") + tag("ENDIF");
	// String string = defineStart + ifStmnt + tag("ENDDEFINE");
	// final Template t = parse(string);
	// assertEquals(0,t.getStart());
	// assertEquals(string.length(),t.getEnd());
	//    	
	// Definition xpandDefinition = (Definition) t.getDefinitions()[0];
	// assertEquals(1,xpandDefinition.getStart());
	// assertEquals(string.length()-1,xpandDefinition.getEnd());
	//    	
	// Statement statement = xpandDefinition.getBody()[1];
	// assertEquals(defineStart.length()+1,statement.getStart());
	// assertEquals(defineStart.length()+ifStmnt.length()-1,statement.getEnd());
	// }

}