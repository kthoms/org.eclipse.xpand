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

package org.eclipse.xpand3.frontend.parser;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Jan Köhnlein
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xpand3.parser");
		// $JUnit-BEGIN$
		suite.addTestSuite(XpandLexerTest.class);
		suite.addTestSuite(ExpressionNodeParserTest.class);
		suite.addTestSuite(Xpand3ScannerTest.class);
		suite.addTestSuite(Xpand3NodeParserTest.class);
		suite.addTestSuite(StatementNodeParserTest.class);
		// $JUnit-END$
		return suite;
	}

}
