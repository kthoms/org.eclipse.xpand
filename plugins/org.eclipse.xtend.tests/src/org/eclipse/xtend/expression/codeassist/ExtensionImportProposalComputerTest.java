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

import org.eclipse.internal.xtend.expression.codeassist.ExtensionImportProposalComputer;

public class ExtensionImportProposalComputerTest extends TestCase {
    private ExtensionImportProposalComputer tpc;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        tpc = new ExtensionImportProposalComputer();
    }

    public final void testGetPrefix() {
        
        assertEquals(null, tpc.test__computePrefix("blfddgfg dfg fdgd extension"));
        assertEquals("holla::die::Waldfee", tpc.test__computePrefix("import x;\n extension holla::die::Waldfee"));
        
    }
}
