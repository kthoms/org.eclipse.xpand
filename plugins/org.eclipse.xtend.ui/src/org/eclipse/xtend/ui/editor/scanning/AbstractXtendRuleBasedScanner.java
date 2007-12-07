/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
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
import org.eclipse.xtend.ui.XtendEditorPlugin;
import org.eclipse.xtend.ui.editor.PreferencesConstants;
import org.eclipse.xtend.ui.editor.color.ColorProvider;

public abstract class AbstractXtendRuleBasedScanner extends RuleBasedScanner {

    protected Token keyword;

    protected Token string;

    protected Token comment;

    protected Token other;

    public AbstractXtendRuleBasedScanner() {
        super();
        setTokens();
        setDefaultReturnToken(other);
    }

    protected synchronized void setTokens() {
        final IPreferenceStore aPreferenceStore = XtendEditorPlugin.getDefault().getPreferenceStore();
        final ColorProvider provider = XtendEditorPlugin.getColorProvider();

        keyword = new Token(new TextAttribute(provider.getColor(PreferenceConverter.getColor(aPreferenceStore,
                PreferencesConstants.HIGHLIGHT_KEYWORDS)), null, SWT.BOLD));

        string = new Token(new TextAttribute(provider.getColor(PreferenceConverter.getColor(aPreferenceStore,
                PreferencesConstants.HIGHLIGHT_STRING))));

        comment = new Token(new TextAttribute(provider.getColor(PreferenceConverter.getColor(aPreferenceStore,
                PreferencesConstants.HIGHLIGHT_COMMENT))));

        other = new Token(new TextAttribute(provider.getColor(PreferenceConverter.getColor(aPreferenceStore,
                PreferencesConstants.HIGHLIGHT_OTHER))));
    }

}
