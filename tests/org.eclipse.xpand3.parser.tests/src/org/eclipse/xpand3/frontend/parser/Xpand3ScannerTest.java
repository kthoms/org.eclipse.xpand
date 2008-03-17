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

package org.eclipse.xpand3.frontend.parser;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xpand3.internal.frontend.parser.Xpand3NodeLexer;
import org.eclipse.xpand3.internal.frontend.parser.Xpand3NodeLexer;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class Xpand3ScannerTest extends TestCase {

	public Xpand3NodeLexer scan(final String txt) {
		return new Xpand3NodeLexer(new ANTLRStringStream(txt)) {
			@Override
			public void reportError(RecognitionException e) {
				throw new RuntimeException(e);
			}
		};
	}

	public final void testString() throws Exception {
		test("\"test\"");
		test("\"test\"");
		test("\"te\nst\"");
		test("\"te\\nst\"");
		test("'test'");
		test("'test'");
		test("'te\nst'");
		test("'te\\nst'");
		try {
			test("'unterminated");
			fail();
		} catch (final Exception e) {
			// expected
		}
	}

	public void testIdentifier() throws Exception {
		System.out.println(scan("sortBy").nextToken().getType());
		System.out.println(scan("^sortBy").nextToken().getType());
	}

	private void test(final String txt) throws Exception {
		assertEquals(txt, scan(txt).nextToken().getText());
	}
}
