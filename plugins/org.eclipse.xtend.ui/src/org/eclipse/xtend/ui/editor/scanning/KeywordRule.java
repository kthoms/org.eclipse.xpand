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
package org.eclipse.xtend.ui.editor.scanning;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;

/**
 * Rule implementation that matches Keywords. Keywords are a discrete list of
 * words preceded by a whitespace character. 
 * @author Karsten Thoms
 */
public class KeywordRule extends WordRule {
	private IToken keyWordToken;
	
	private static final IWordDetector WORDDETECTOR = new IWordDetector () {

		public boolean isWordPart(char c) {
			return Character.isLetterOrDigit(c);
		}

		public boolean isWordStart(char c) {
			return Character.isLetter(c);
		}
	};
	
	/**
	 * Creates the rule.
	 * @param token The token that will be returned if the rule matches a keyword.
	 * @param keywords The known keywords.
	 */
	public KeywordRule(IToken token, String[] keywords) {
		super(WORDDETECTOR, Token.UNDEFINED);
		for (String keyword : keywords) {
			addWord(keyword, token);
		}
		keyWordToken = token;
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		// evaluate the preceding character
		// the rule matches only the word, but does not take care if the word is starting within another word.
		// For example, "foobarcase" will match the keyword "case", but it should only do so if the preceding character is whitespace
		int c = ' ';
		if (scanner.getColumn()>0) {
			scanner.unread();
			c = scanner.read();
		}
		IToken result = super.evaluate(scanner);
		if (result==keyWordToken) {
			return Character.isJavaIdentifierPart(c) || c=='^' ? Token.UNDEFINED : keyWordToken;
		} else {
			return result;
		}
	}

}
