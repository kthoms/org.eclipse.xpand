/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.check;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.ExecutionContextImpl;

public class CheckAnalyzationTest extends TestCase {
    private Set<AnalysationIssue> issues;

    private ExecutionContext ec;

    @Override
    protected void setUp() throws Exception {
        ec = new ExecutionContextImpl();
        issues = new HashSet<AnalysationIssue>();
    }

    private ExtensionFile parse(final String expression) {
        return ParseFacade.file(new StringReader(expression), null);
    }

    private void dumpIssues() {
        for (final Iterator<AnalysationIssue> iter = issues.iterator(); iter.hasNext();) {
            final AnalysationIssue element = iter.next();
            System.out.println(element.getType().toString() + " - " + element.getMessage());
        }
    }

    public final void testAnalyze() {
        final ExtensionFile file = parse("// test \n"
                + "context String ERROR this+' not allowed!' : this.startsWith('test') ;\n" + "\n"
                + "context Integer ERROR ''+this+' not allowed!' : this > 5; \n" + "\n"
                + "context Object WARNING 'Objects of type '+this.metaType+' not allowed!' : "
                + "!(String.isInstance(this) || Integer.isInstance(this)); \n");

        ec = ec.cloneWithResource(file);
        file.analyze(ec, issues);
        dumpIssues();
        assertEquals(0, issues.size());

    }

    public final void testAnalyze1() {
        final ExtensionFile file = parse("context String ERROR this+' not allowed!' : this.startsWith('test') ;\n" + "\n"
                + "context Integers ERROR ''+this+' not allowed!' : this > 5; \n" + "\n"
                + "context Object WARNING 'Objects of type '+this.metaType+' not allowed!' : "
                + "!(String.isInstance(this) || Integer.isInstance(this)); \n");

        ec = ec.cloneWithResource(file);
        file.analyze(ec, issues);
        dumpIssues();
        assertEquals(1, issues.size());

    }

    public final void testAnalyze2() {
        final ExtensionFile file = parse("context String ERROR this+' not allowed!' : this.startsWith('test') ;\n" + "\n"
                + "context Integer ERROR ''+this.is+' not allowed!' : this > 5; \n" + "\n"
                + "context Object WARNING 'Objects of type '+this.metaType+' not allowed!' : "
                + "!(String.isInstance(this) || Integer.isInstance(this)); \n");

        ec = ec.cloneWithResource(file);
        file.analyze(ec, issues);
        dumpIssues();
        assertEquals(1, issues.size());

    }

    public final void testAnalyze3() {
        final ExtensionFile file = parse("context String ERROR this+' not allowed!' : this.startsWith('test') ;\n" + "\n"
                + "context Integer ERROR ''+this.is+' not allowed!' : this > 5; \n" + "\n"
                + "context Object WARNING 'Objects of type '+this.metaType+' not allowed!' : "
                + "!(String.isInstance(this) || Integer.blablubb(this)); \n");

        ec = ec.cloneWithResource(file);
        file.analyze(ec, issues);
        dumpIssues();
        assertEquals(2, issues.size());

    }
 
}
