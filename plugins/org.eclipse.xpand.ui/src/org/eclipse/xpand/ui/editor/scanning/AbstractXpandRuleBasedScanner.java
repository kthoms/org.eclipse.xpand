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

package org.eclipse.xpand.ui.editor.scanning;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xpand.ui.XpandEditorPlugin;
import org.eclipse.xpand.ui.editor.color.ColorProvider;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants;

public abstract class AbstractXpandRuleBasedScanner extends RuleBasedScanner {

    protected Token terminals;

    protected Token keyword;

    protected Token string;

    protected Token text;

    protected Token define;

    protected Token comment;

    protected Token other;

    public AbstractXpandRuleBasedScanner() {
        super();
        initialize();
        setDefaultReturnToken(other);
    }

	public synchronized void initialize() {
		final IPreferenceStore aPreferenceStore = Activator.getDefault().getPreferenceStore();

		if (terminals == null) {
			terminals = new Token(null);
		}
		terminals.setData(getAttribute(aPreferenceStore, UiPreferenceConstants.TERMINALS));

		if (keyword == null) {
			keyword = new Token(null);

		}
		keyword.setData(getAttribute(aPreferenceStore, UiPreferenceConstants.KEYWORDS));

		if (string == null) {
			string = new Token(null);
		}
		string.setData(getAttribute(aPreferenceStore, UiPreferenceConstants.STRING));

		if (define == null) {
			define = new Token(null);
		}
		define.setData(getAttribute(aPreferenceStore, UiPreferenceConstants.DEFINE));

		if (text == null) {
			text = new Token(null);
		}
		text.setData(getAttribute(aPreferenceStore, UiPreferenceConstants.TEXT));

		if (comment == null) {
			comment = new Token(null);
		}
		comment.setData(getAttribute(aPreferenceStore, UiPreferenceConstants.COMMENT));

		if (other == null) {
			other = new Token(null);
		}
		other.setData(getAttribute(aPreferenceStore, UiPreferenceConstants.OTHER));
	}

	private TextAttribute getAttribute(IPreferenceStore store, String name) {
		final ColorProvider provider = XpandEditorPlugin.getColorProvider();
		Color fgColor = provider.getColor(PreferenceConverter.getColor(store, name + UiPreferenceConstants.FGCOLOR));
		int textStyle = store.getInt(name + UiPreferenceConstants.FONTSTYLE);
		return new TextAttribute(fgColor, null, textStyle);
	}

}
