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
package org.eclipse.xpand.internal.tests.parser;

import java.util.List;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.internal.xpand2.parser.XpandLexer;

public class XpandLexerTest extends TestCase {
	private final char LG = '\u00AB';

    private final char RG = '\u00BB';

    private String tag(final String str) {
        return LG + str + RG;
    }
    
	@SuppressWarnings("unchecked")
	public void testComments() throws Exception {
		String toScan = tag("REM")+"foo"+tag("DEFINE")+"'//"+LG+"ENDRE"+tag("ENDREM");
		XpandLexer l = new XpandLexer(new ANTLRStringStream(toScan));
		CommonTokenStream stream = new CommonTokenStream(l);
		List<CommonToken> tokens = stream.getTokens();
		assertEquals(3,tokens.size());
		assertEquals(XpandLexer.LG,tokens.get(0).getType());
		assertEquals(XpandLexer.COMMENT,tokens.get(1).getType());
		assertEquals(XpandLexer.TEXT,tokens.get(2).getType());
	}
}
