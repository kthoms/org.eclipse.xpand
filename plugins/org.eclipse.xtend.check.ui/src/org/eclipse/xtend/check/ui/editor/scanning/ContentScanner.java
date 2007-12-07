/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.check.ui.editor.scanning;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.xtend.check.ui.editor.lang.CheckTokens;
import org.eclipse.xtend.ui.editor.scanning.AbstractXtendRuleBasedScanner;
import org.eclipse.xtend.ui.editor.scanning.KeywordRule;
import org.eclipse.xtend.ui.editor.scanning.WhitespaceDetector;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * 
 * 
 */
public class ContentScanner extends AbstractXtendRuleBasedScanner {

    public ContentScanner() {
        final IRule[] rules = new IRule[4];
        // Add generic whitespace rule.
        rules[0] = new WhitespaceRule(new WhitespaceDetector());
        rules[1] = new KeywordRule(keyword, CheckTokens.allKeywords());
        rules[2] = new MultiLineRule("'", "'", string);
        rules[3] = new MultiLineRule("\"", "\"", string);

        setRules(rules);
        setDefaultReturnToken(other);
    }
}