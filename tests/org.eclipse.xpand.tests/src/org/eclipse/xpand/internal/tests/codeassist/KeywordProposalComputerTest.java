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
package org.eclipse.xpand.internal.tests.codeassist;

import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.codeassist.KeywordProposalComputer;
import org.eclipse.internal.xpand2.codeassist.XpandTokens;
import org.eclipse.internal.xtend.expression.codeassist.Proposal;
import org.eclipse.internal.xtend.expression.codeassist.ProposalFactoryDefaultImpl;

public class KeywordProposalComputerTest extends TestCase {
	private KeywordProposalComputer kpc;
    private ProposalFactoryDefaultImpl f;
	
	public void setUp () throws Exception {
		kpc = new KeywordProposalComputer();
        f = new ProposalFactoryDefaultImpl();
        super.setUp();
	}
	
	public void testComputePropsals1 () {
		String txt;
		List<Object> p;
		
		txt = XpandTokens.LT_CHAR+"DEFI";
	    p = kpc.computeProposals(txt, null, f);
		assertTrue(matches(p, "DEFINE "));

		txt = XpandTokens.LT_CHAR+"RE";
	    p = kpc.computeProposals(txt, null, f);
		assertTrue(matches(p, "REM"+XpandTokens.RT_CHAR));
	}

	/**
	 * For closing keywords ("ENDDEFINE", "ENDFOREACH") a closing bracket should be inserted instead of 
	 * a whitespace.
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=141662
	 */
	public void testComputeClosingKeywordsProposals () {
		String txt;
		List<Object> p;
		
		txt = XpandTokens.LT_CHAR+"ENDDEFI";
	    p = kpc.computeProposals(txt, null, f);
		assertTrue(matches(p, "ENDDEFINE"+XpandTokens.RT_CHAR));
	}
	
    public boolean matches(final List<Object> proposals, final String keyword) {
        for (final Iterator<Object> iter = proposals.iterator(); iter.hasNext();) {
            final Proposal element = (Proposal) iter.next();
            if (element.getInsertString().matches(keyword))
                return true;
        }
        return false;
    }
	
}
