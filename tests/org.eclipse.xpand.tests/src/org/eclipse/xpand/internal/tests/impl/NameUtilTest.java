/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xpand.internal.tests.impl;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.xpand2.XpandUtil;

/**
 * *
 * 
 * @author Sven Efftinge (http://www.efftinge.de) *
 */
public class NameUtilTest extends TestCase {

    public final void testGetResourceName() {
        assertEquals("org/test/File.xpt", XpandUtil.getJavaResourceName("org" + SyntaxConstants.NS_DELIM + "test"
                + SyntaxConstants.NS_DELIM + "File"));
    }

    public final void testGetLastSegment() {
        assertEquals("File", XpandUtil.getLastSegment("org" + SyntaxConstants.NS_DELIM + "test"
                + SyntaxConstants.NS_DELIM + "File"));
    }

    public final void testGetNamespace() {
        assertEquals("org" + SyntaxConstants.NS_DELIM + "test", XpandUtil.withoutLastSegment("org"
                + SyntaxConstants.NS_DELIM + "test" + SyntaxConstants.NS_DELIM + "File"));
    }
}
