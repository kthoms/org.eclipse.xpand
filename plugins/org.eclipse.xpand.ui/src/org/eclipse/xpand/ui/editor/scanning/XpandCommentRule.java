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

package org.eclipse.xpand.ui.editor.scanning;

import org.eclipse.internal.xpand2.codeassist.XpandTokens;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * 
 * 
 */
public class XpandCommentRule implements IPredicateRule {

	private final IToken token;

	/**
     * 
     */
	public XpandCommentRule(final IToken token) {
		this.token = token;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.text.rules.IRule#evaluate(org.eclipse.jface.text.rules
	 * .ICharacterScanner)
	 */
	public IToken evaluate(final ICharacterScanner scanner) {
		final StringBuffer buff = new StringBuffer();
		boolean stopReading = false;
		int reads = 0;
		final String keyword = XpandTokens.REM + " ";
		while (!stopReading) {
			reads++;
			final char c = (char) scanner.read();
			if (buff.length() > 0 && XpandTokens.RT_CHAR == c) {
				if (buff.toString().startsWith(keyword)) {
					scanner.unread();
					return token;
				}
			}
			buff.append(c);
			stopReading = !(keyword.startsWith(buff.toString()) || buff.toString().startsWith(keyword));

		}

		for (int i = 0; i < reads; i++) {
			scanner.unread();
		}
		return Token.UNDEFINED;
	}

	public IToken evaluate(final ICharacterScanner scanner, final boolean resume) {
		return evaluate(scanner);
	}

	public IToken getSuccessToken() {
		return token;
	}

}
