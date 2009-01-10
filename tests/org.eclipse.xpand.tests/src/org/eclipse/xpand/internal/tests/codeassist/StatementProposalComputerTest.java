/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xpand.internal.tests.codeassist;

import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.codeassist.StatementProposalComputer;
import org.eclipse.internal.xpand2.codeassist.XpandTokens;
import org.eclipse.internal.xtend.expression.codeassist.Proposal;
import org.eclipse.internal.xtend.expression.codeassist.ProposalFactoryDefaultImpl;

public class StatementProposalComputerTest extends TestCase {

    private ProposalFactoryDefaultImpl f;

    private StatementProposalComputer kpc;

    @Override
    protected void setUp() throws Exception {
        kpc = new StatementProposalComputer();
        f = new ProposalFactoryDefaultImpl();
        super.setUp();
    }

    public final void testComputeProposals1() {
        final String txt = tag("DEFINE test FOR this") + "  ";
        final List<Object> p = kpc.computeProposals(txt, null, f);
        assertTrue(((Proposal) p.get(0)).getDisplayString().startsWith(XpandTokens.ENDDEFINE));

        assertFalse(contains(p, XpandTokens.ELSE));
        assertFalse(contains(p, XpandTokens.ELSEIF));
        assertTrue(contains(p, XpandTokens.FILE));
        assertTrue(contains(p, XpandTokens.PROTECT));
        assertTrue(contains(p, XpandTokens.IF));
        assertTrue(contains(p, XpandTokens.LET));
        assertTrue(contains(p, XpandTokens.FOREACH));
        assertTrue(contains(p, XpandTokens.EXPAND));
    }

    public final void testComputeProposals2() {
        final String txt = tag("DEFINE test FOR this") + "  " + tag("FILE test") + tag("IF x");
        final List<Object> p = kpc.computeProposals(txt, null, f);
        assertTrue(((Proposal) p.get(0)).getDisplayString().startsWith(XpandTokens.ENDIF));

        assertTrue(contains(p, XpandTokens.ELSE));
        assertTrue(contains(p, XpandTokens.ELSEIF));
        assertFalse(contains(p, XpandTokens.FILE));
        assertTrue(contains(p, XpandTokens.PROTECT));
        assertTrue(contains(p, XpandTokens.IF));
        assertTrue(contains(p, XpandTokens.LET));
        assertTrue(contains(p, XpandTokens.FOREACH));
        assertTrue(contains(p, XpandTokens.EXPAND));
    }

    public final void testComputeProposals3() {
        final String txt = tag("DEFINE test FOR this") + "  " + tag("FILE test") + tag("IF x") + tag("ENDIF")
                + tag("ENDFILE") + tag("PROTECT CSTART x CEND y");
        final List<Object> p = kpc.computeProposals(txt, null, f);
        assertTrue(((Proposal) p.get(0)).getDisplayString().startsWith(XpandTokens.ENDPROTECT));

        assertFalse(contains(p, XpandTokens.ELSE));
        assertFalse(contains(p, XpandTokens.ELSEIF));
        assertTrue(contains(p, XpandTokens.FILE));
        assertFalse(contains(p, XpandTokens.PROTECT));
        assertTrue(contains(p, XpandTokens.IF));
        assertTrue(contains(p, XpandTokens.LET));
        assertTrue(contains(p, XpandTokens.FOREACH));
        assertTrue(contains(p, XpandTokens.EXPAND));
    }

    public final void testComputeProposals4() {
        final String txt = tag("IMPORT xyz") + "  ";
        final List<Object> p = kpc.computeProposals(txt, null, f);
        assertFalse(contains(p, XpandTokens.DEFINE));
        assertFalse(contains(p, XpandTokens.AROUND));
        assertEquals(5, p.size());
    }

    public boolean contains(final List<Object> proposals, final String keyword) {
        for (final Iterator<Object> iter = proposals.iterator(); iter.hasNext();) {
            final Proposal element = (Proposal) iter.next();
            if (element.getDisplayString().startsWith(keyword))
                return true;
        }
        return false;
    }

    public String tag(final String txt) {
        return XpandTokens.LT + txt + XpandTokens.RT;
    }
}
