/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.expression.codeassist;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.expression.codeassist.ReverseScanner;
import org.eclipse.internal.xtend.xtend.parser.XtendLexer;

public class ReverseScannerTest extends TestCase {
	public final void testPreviousToken() throws Exception {
		final ReverseScanner s = new ReverseScanner("test");
		assertEquals(XtendLexer.Identifier, s.previousToken().getType());
		assertNull(s.previousToken());
	}

	public final void testPreviousToken1() throws Exception {
		final ReverseScanner s = new ReverseScanner("test test");
		assertEquals(XtendLexer.Identifier, s.previousToken().getType());
		assertEquals(XtendLexer.Identifier, s.previousToken().getType());
		assertNull(s.previousToken());
	}

	// TODO test fails
	// public final void testPreviousToken2() throws TokenStreamException {
	// ReverseScanner s = new ReverseScanner("test 4.3");
	// assertEquals(XtendLexer.REAL,
	// s.previousToken().getType());
	// assertEquals(XtendLexer.Identifier,
	// s.previousToken().getType());
	// assertNull(s.previousToken());
	// }

	public final void testPreviousToken3() throws Exception {
		final ReverseScanner s = new ReverseScanner("test");
		assertEquals(XtendLexer.Identifier, s.previousToken().getType());
		assertNull(s.previousToken());
	}

	public final void testPreviousToken4() throws Exception {
		final ReverseScanner s = new ReverseScanner(
				"test.typeSelect(Stuff,'test bla stuff').size() / 5 * {x,x}.size()");
		assertEquals(")", s.previousToken().getText());
		assertEquals("(", s.previousToken().getText());
		assertEquals(XtendLexer.Identifier, s.previousToken().getType());
		assertEquals(".", s.previousToken().getText());
		assertEquals("}", s.previousToken().getText());
		assertEquals(XtendLexer.Identifier, s.previousToken().getType());
		assertEquals(",", s.previousToken().getText());
		assertEquals(XtendLexer.Identifier, s.previousToken().getType());
		assertEquals("{", s.previousToken().getText());
		assertEquals("*", s.previousToken().getText());
		assertEquals(XtendLexer.IntLiteral, s.previousToken().getType());
		assertEquals("/", s.previousToken().getText());
		assertEquals(")", s.previousToken().getText());
		assertEquals("(", s.previousToken().getText());
		assertEquals(XtendLexer.Identifier, s.previousToken().getType());
		assertEquals(".", s.previousToken().getText());
		assertEquals(")", s.previousToken().getText());
		assertEquals(XtendLexer.StringLiteral, s.previousToken().getType());
		assertEquals(",", s.previousToken().getText());
		assertEquals(XtendLexer.Identifier, s.previousToken().getType());
		assertEquals("(", s.previousToken().getText());
		assertEquals("typeSelect", s.previousToken().getText());
		assertEquals(".", s.previousToken().getText());
		assertEquals(XtendLexer.Identifier, s.previousToken().getType());
		assertNull(s.previousToken());
	}

	public final void testNextToken() throws Exception {
		final ReverseScanner s = new ReverseScanner("test 3 4");
		for (int i = 0; i < 5; i++) {
			assertEquals(XtendLexer.IntLiteral, s.previousToken().getType());
			assertEquals(7,s.getOffset());
			assertEquals(XtendLexer.IntLiteral, s.previousToken().getType());
			assertEquals(5,s.getOffset());
			assertEquals(XtendLexer.Identifier, s.previousToken().getType());
			assertEquals(0,s.getOffset());
			assertNull(s.previousToken());
			assertEquals(0,s.getOffset());
			assertEquals(XtendLexer.Identifier, s.nextToken().getType());
			assertEquals(0,s.getOffset());
			assertEquals(XtendLexer.IntLiteral, s.nextToken().getType());
			assertEquals(5,s.getOffset());
			assertEquals(XtendLexer.IntLiteral, s.nextToken().getType());
			assertEquals(7,s.getOffset());
			assertNull(s.nextToken());
			assertEquals(8,s.getOffset());
		}
	}
	//
	// public final void testGetString() {
	// final ReverseScanner s = new ReverseScanner("");
	//
	// assertEquals("'test'", s.getString("'test'"));
	// assertEquals("\"test\"", s.getString("\"test\""));
	// assertEquals("'test'", s.getString("'test' "));
	// assertEquals("'test'", s.getString(" 'test'"));
	// assertEquals("'te\\'\"st'", s.getString("hallo 'te\\'\"st'"));
	//
	// }
}
