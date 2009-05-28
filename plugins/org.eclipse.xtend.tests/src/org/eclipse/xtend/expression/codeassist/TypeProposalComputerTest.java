/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.expression.codeassist;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.expression.codeassist.TypeProposalComputer;

public class TypeProposalComputerTest extends TestCase {
    private TypeProposalComputer tpc;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        tpc = new TypeProposalComputer();
    }

    public final void testGetPrefix() {

        assertEquals("Str", tpc.findPrefix("tedfc fer 34r30f3nf fe[Str"));

    }
}
