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

package org.eclipse.xtend.check.ui.editor.codeassist;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.internal.xtend.expression.codeassist.ProposalComputer;
import org.eclipse.internal.xtend.expression.codeassist.ProposalFactory;
import org.eclipse.xtend.check.ui.editor.lang.CheckTokens;
import org.eclipse.xtend.expression.ExecutionContext;

/**
 * Responsible for proposals of Check keywords.
 * 
 * @author Peter Friese
 */
public class KeywordProposalComputer implements ProposalComputer {

	public List<Object> computeProposals(final String txt, final ExecutionContext ctx, final ProposalFactory factory) {
		final String prefix = getPrefix(txt);
		final List<Object> result = new ArrayList<Object>();
		final String[] kw = CheckTokens.allKeywords();
		for (final String string : kw) {
			if (string.toLowerCase().startsWith(prefix.toLowerCase())) {
				result.add(factory.createKeywordProposal(string, string, prefix));
			}
		}
		return result;
	}

	/** Match capital letters at the end of some string */
	private final static Pattern PREFIX = Pattern.compile("([A-Za-z]+)\\z");

	/**
	 * @param txt
	 *            Some text
	 * @return The capital letters (A-Z) at the end of <tt>txt</tt>
	 */
	private String getPrefix(final String txt) {
		final Matcher m = KeywordProposalComputer.PREFIX.matcher(txt);
		if (m.find()) {
			return m.group(1);
		}
		return "";
	}
}
