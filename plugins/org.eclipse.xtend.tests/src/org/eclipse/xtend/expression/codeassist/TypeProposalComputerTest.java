/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.expression.codeassist;

import org.eclipse.internal.xtend.expression.codeassist.TypeProposalComputer;

import junit.framework.TestCase;

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
