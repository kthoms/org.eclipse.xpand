/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.check;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.check.codeassist.CheckFastAnalyzer;
import org.eclipse.internal.xtend.expression.codeassist.ExpressionProposalComputer;
import org.eclipse.internal.xtend.expression.codeassist.ProposalFactory;
import org.eclipse.internal.xtend.expression.codeassist.ProposalFactoryDefaultImpl;
import org.eclipse.internal.xtend.expression.codeassist.ProposalImpl;
import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.codeassist.FastAnalyzer;
import org.eclipse.internal.xtend.xtend.codeassist.Partition;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Callable;
import org.eclipse.xtend.typesystem.Type;

public class CheckFastAnalyzerTest extends TestCase {
    private ExecutionContextImpl ctx;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ctx = new ExecutionContextImpl();
        ctx.registerMetaModel(new JavaMetaModel("java", new JavaBeansStrategy()));
    }

    private final List<Object> getProposals(final String txt) {

        final ProposalFactory factory = new ProposalFactoryDefaultImpl();
        return new ExpressionProposalComputer().computeProposals(txt, ctx, factory);
    }

    private boolean containsProposal(final List<Object> ps, final String string, final Type t) {
        for (final Iterator<Object> iter = ps.iterator(); iter.hasNext();) {
            final ProposalImpl element = (ProposalImpl) iter.next();
            final Object o = element.getProposedElement();
            if (o instanceof Variable) {
                final Variable v = (Variable) o;
                if (string.equals(v.getName()) && t.equals(v.getValue()))
                    return true;
            } else if (o instanceof Callable) {
                final Callable c = (Callable) o;
                if (string.equals(c.getName()) && t.equals(c.getReturnType()))
                    return true;
            } else if (o instanceof Type) {
                final Type c = (Type) o;
                if (string.equals(c.getName()) && t.equals(c))
                    return true;
            }
        }
        return false;
    }
    
    public final void testTypeProposal1() {
        final String s = "context Stri";
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.TYPE_DECLARATION, CheckFastAnalyzer.computePartition(s));
    }
    
    public final void testTypeProposal2() {
        final String s = "context ";
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.TYPE_DECLARATION, CheckFastAnalyzer.computePartition(s));
    }

    public final void testExpressionProposal1() {
        final String s = "context String if ";
        ctx = (ExecutionContextImpl) CheckFastAnalyzer.computeExecutionContext(s, ctx);
        assertEquals(Partition.EXPRESSION, CheckFastAnalyzer.computePartition(s));

        final List<Object> ps = getProposals(s);
        assertTrue(!ps.isEmpty());
        assertTrue(containsProposal(ps, "this", ctx.getStringType()));
    }
}
