/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: committers of openArchitectureWare - initial API and
 * implementation
 ******************************************************************************/
package org.eclipse.xtend.shared.ui.editor.navigation;

/**
 * WordDetector helps detecting words.
 * 
 * @author Peter Friese
 */
public class WordDetector {

	public static boolean isWordPart(char character) {
		return Character.isLetterOrDigit(character) || character == '_' || character == '-';
	}

	public static boolean isWordStart(char character) {
		return Character.isLetter(character);
	}

	public boolean isWord(String word) {
		if (word.length() > 0) {
			if (isWordStart(word.charAt(0))) {
				for (int i = 1; i < word.length(); i++) {
					if (!isWordPart(word.charAt(i))) {
						return false;
					}
				}
				return true;
			}
			return false;
		}
		return false;
	}

	public static boolean isNewLine(char character) {
		if (character == '\n' || character == '\r' || character == '\f') {
			return true;
		}
		return false;
	}
}