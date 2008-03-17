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

import java.io.UnsupportedEncodingException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.tmf.common.node.Node;
import org.eclipse.tmf.common.treetest.AbstractEcoreTreeTestInterpreter;
import org.eclipse.xpand3.parser.Xpand3NodeLexer;
import org.eclipse.xpand3.parser.Xpand3NodeParser;

/**
 * @author Jan Köhnlein
 */
public class TreetestInterpreterTest extends AbstractEcoreTreeTestInterpreter {

	private boolean parseExpression;

	public void testStatement() throws Throwable {
		parseExpression = false;
		test("org/eclipse/xpand3/parser/node2ast/statement.ttst");
	}

	public void testExpression() throws Throwable {
		parseExpression = true;
		test("org/eclipse/xpand3/parser/node2ast/expression.ttst");
	}

	public void testDeclaration() throws Throwable {
		parseExpression = false;
		test("org/eclipse/xpand3/parser/node2ast/declaration.ttst");
	}

	protected EObject parseAndTransform(String testExpressionBody)
			throws RecognitionException, UnsupportedEncodingException {
		System.out.println("Expression:" + testExpressionBody);
		ANTLRStringStream stream = new ANTLRStringStream(testExpressionBody);
		Xpand3NodeLexer lexer = new Xpand3NodeLexer(stream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		Xpand3NodeParser xpand3NodeParser = new Xpand3NodeParser(tokenStream);

		Node rootNode = (parseExpression) ? xpand3NodeParser.r_expression()
				: xpand3NodeParser.r_file();
		if (rootNode == null) {
			System.out.println("Nothing parsed.");
			return null;
		}
		Node2AstTransformer node2AstTransformer = new Node2AstTransformer();
		return node2AstTransformer.doSwitch(rootNode);
	}

}
