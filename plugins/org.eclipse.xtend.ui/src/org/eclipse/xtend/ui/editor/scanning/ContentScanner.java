/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.ui.editor.scanning;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.xtend.ui.editor.lang.XtendTokens;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * 
 * 
 */
public class ContentScanner extends AbstractXtendRuleBasedScanner {

    public ContentScanner() {
        final IRule[] rules = new IRule[2];
        // Add generic whitespace rule.
        rules[0] = new WhitespaceRule(new WhitespaceDetector());
//        rules[1] = new MultiLineRule("'", "'", string,'\\',true);
//        rules[2] = new MultiLineRule("\"", "\"", string,'\\',true);
//        rules[1] = new XtendKeywordRule(keyword, XtendTokens.allKeywords());
        rules[1] = new KeywordRule(keyword, XtendTokens.allKeywords());

        setRules(rules);
        setDefaultReturnToken(other);
    }
}