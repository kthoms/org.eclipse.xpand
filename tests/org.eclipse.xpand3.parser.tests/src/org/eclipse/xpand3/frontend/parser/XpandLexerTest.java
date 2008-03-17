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

import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.xpand3.internal.frontend.parser.Xpand3NodeLexer;

/**
 * @author Jan Köhnlein
 */
public class XpandLexerTest extends AbstractXpand3NodeParserTest {

	public void testComments() throws Exception {
		String toScan = tag("REM") + "foo" + tag("DEFINE") + "'//" + LG
				+ "ENDRE" + tag("ENDREM");
		System.out.println(toScan);
		Xpand3NodeLexer l = new Xpand3NodeLexer(new ANTLRStringStream(toScan));
		CommonTokenStream stream = new CommonTokenStream(l);
		List<CommonToken> tokens = stream.getTokens();
		assertEquals(1, tokens.size());
		assertEquals(Xpand3NodeLexer.REM_COMMENT_OUT, tokens.get(0).getType());
	}
}
