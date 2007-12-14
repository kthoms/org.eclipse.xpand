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

package org.eclipse.xtend.ui.editor.scanning;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * 
 * 
 */
public class XtendPartitionScanner extends RuleBasedPartitionScanner {
    public final static String COMMENT = "__comment";
    public final static String STRING_LIT = "__stringlit";
    

    public XtendPartitionScanner() {

        final IToken comment = new Token(COMMENT);
        final IToken stringLit = new Token(STRING_LIT);

        final List<IPredicateRule> rules = new ArrayList<IPredicateRule>();

        rules.add(new MultiLineRule("/*", "*/", comment));
        rules.add(new SingleLineRule("//", "", comment));
        
        rules.add(new MultiLineRule("'", "'", stringLit,'\\'));
        rules.add(new MultiLineRule("\"", "\"", stringLit,'\\'));

        setPredicateRules(rules.toArray(new IPredicateRule[rules.size()]));
    }
}
