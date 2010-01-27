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

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants;
import org.eclipse.xtend.ui.XtendEditorPlugin;
import org.eclipse.xtend.ui.editor.color.ColorProvider;

public abstract class AbstractXtendRuleBasedScanner extends RuleBasedScanner {

    protected Token keyword;

    protected Token string;

    protected Token comment;

    protected Token other;

    public AbstractXtendRuleBasedScanner() {
        super();
        initialize();
        setDefaultReturnToken(other);
    }

	public synchronized void initialize() {
		final IPreferenceStore aPreferenceStore = Activator.getDefault().getPreferenceStore();

		if (keyword == null) {
			keyword = new Token(null);
		}
		keyword.setData(getAttribute(aPreferenceStore, UiPreferenceConstants.KEYWORDS));

		if (string == null) {
			string = new Token(null);
		}
		string.setData(getAttribute(aPreferenceStore, UiPreferenceConstants.STRING));

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
		final ColorProvider provider = XtendEditorPlugin.getColorProvider();
		Color fgColor = provider.getColor(PreferenceConverter.getColor(store, name + UiPreferenceConstants.FGCOLOR));
		int textStyle = store.getInt(name + UiPreferenceConstants.FONTSTYLE) & (SWT.BOLD | SWT.ITALIC);
		return new TextAttribute(fgColor, null, textStyle);
	}

}
