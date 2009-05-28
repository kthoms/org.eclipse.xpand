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

package org.eclipse.xtend.expression.codeassist;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.expression.codeassist.ExpressionProposalComputer;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.Variable;

public class ExpressionProposalComputerTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public final void testComputePrefixAndTargetExpression1() {
        final String[] s = ExpressionProposalComputer.computePrefixAndTargetExpression("test");
        assertEquals("test", s[0]);
        assertNull(s[1]);
    }

    public final void testComputePrefixAndTargetExpression2() {
        final String[] s = ExpressionProposalComputer.computePrefixAndTargetExpression("test.th");
        assertEquals("th", s[0]);
        assertEquals("test", s[1]);
    }

    public final void testComputePrefixAndTargetExpression3() {
        final String[] s = ExpressionProposalComputer.computePrefixAndTargetExpression("test.the.computer.now");
        assertEquals("now", s[0]);
        assertEquals("test.the.computer", s[1]);
    }

    public final void testComputePrefixAndTargetExpression4() {
        final String[] s = ExpressionProposalComputer.computePrefixAndTargetExpression("test(true,\nfalse()).next");
        assertEquals("next", s[0]);
        assertEquals("test(true,\nfalse())", s[1]);
    }

    public final void testComputePrefixAndTargetExpression5() {
        final String[] s = ExpressionProposalComputer.computePrefixAndTargetExpression("bdlfsdfows test. bla({}).");
        assertEquals("", s[0]);
        assertEquals("test. bla({})", s[1]);
    }

    public final void testComputePrefixAndTargetExpression6() {
        final String[] s = ExpressionProposalComputer
                .computePrefixAndTargetExpression("test(true, {false, 'hallo',stuff.");
        assertEquals("", s[0]);
        assertEquals("stuff", s[1]);
    }

    public final void testComputePrefixAndTargetExpression7() {
        final String[] s = ExpressionProposalComputer.computePrefixAndTargetExpression("rfq.*test");
        assertEquals("test", s[0]);
        assertEquals(null, s[1]);
    }

    public final void testComputePrefixAndTargetExpression8() {
        final String[] s = ExpressionProposalComputer.computePrefixAndTargetExpression("\\x");
        assertEquals("x", s[0]);
        assertEquals(null, s[1]);
    }

    public final void testComputePrefixAndTargetExpression9() {
        final String[] s = ExpressionProposalComputer.computePrefixAndTargetExpression("FOREACH (Set[EPackage])e.all");
        assertEquals("all", s[0]);
        assertEquals("e", s[1]);
    }

    public final void testComputePrefixAndTargetExpression10() {
        final String[] s = ExpressionProposalComputer.computePrefixAndTargetExpression("TEST ");
        assertEquals("", s[0]);
        assertEquals(null, s[1]);
    }

    public final void testSetInState() {
        ExecutionContextImpl ctx = new ExecutionContextImpl();
        ctx = (ExecutionContextImpl) ctx.cloneWithVariable(new Variable("v", ctx.getListType(ctx.getStringType())));
        final String s = "v.select(e| true";
        ctx = (ExecutionContextImpl) ExpressionProposalComputer.computeExecutionContext(s, ctx);
        assertEquals(2, ctx.getVisibleVariables().size());
        assertEquals(ctx.getListType(ctx.getStringType()), ctx.getVariable("v").getValue());
        assertEquals(ctx.getStringType(), ctx.getVariable("e").getValue());
    }

    public final void testSetInState1() {
        ExecutionContextImpl ctx = new ExecutionContextImpl();
        ctx = (ExecutionContextImpl) ctx.cloneWithVariable(new Variable("v", ctx.getListType(ctx.getStringType())));
        final String s = "v.select(e| true)";
        ctx = (ExecutionContextImpl) ExpressionProposalComputer.computeExecutionContext(s, ctx);
        assertEquals(1, ctx.getVisibleVariables().size());
        assertEquals(ctx.getListType(ctx.getStringType()), ctx.getVariable("v").getValue());
    }

    public final void testSetInState2() {
        ExecutionContextImpl ctx = new ExecutionContextImpl();
        ctx = (ExecutionContextImpl) ctx.cloneWithVariable(new Variable("v", ctx.getListType(ctx.getStringType())));
        final String s = "v.select(e| ((List[Boolean]){true}).collect(e|";
        ctx = (ExecutionContextImpl) ExpressionProposalComputer.computeExecutionContext(s, ctx);
        assertEquals(2, ctx.getVisibleVariables().size());
        assertEquals(ctx.getListType(ctx.getStringType()), ctx.getVariable("v").getValue());
        assertEquals(ctx.getBooleanType(), ctx.getVariable("e").getValue());
    }

    public final void testSetInState3() {
        ExecutionContextImpl ctx = new ExecutionContextImpl();
        ctx = (ExecutionContextImpl) ctx.cloneWithVariable(new Variable("v", ctx.getListType(ctx.getStringType())));
        final String s = "v.select(e| ((List[Boolean]){true}).collect(b|";
        ctx = (ExecutionContextImpl) ExpressionProposalComputer.computeExecutionContext(s, ctx);
        assertEquals(3, ctx.getVisibleVariables().size());
        assertEquals(ctx.getListType(ctx.getStringType()), ctx.getVariable("v").getValue());
        assertEquals(ctx.getStringType(), ctx.getVariable("e").getValue());
        assertEquals(ctx.getBooleanType(), ctx.getVariable("b").getValue());
    }

    public final void testSetInState4() {
        ExecutionContextImpl ctx = new ExecutionContextImpl();
        ctx = (ExecutionContextImpl) ctx.cloneWithVariable(new Variable(ExecutionContext.IMPLICIT_VARIABLE, ctx
                .getListType(ctx.getStringType())));
        final String s = "select(e| ((List[Boolean]){true}).collect(b|";
        ctx = (ExecutionContextImpl) ExpressionProposalComputer.computeExecutionContext(s, ctx);
        assertEquals(3, ctx.getVisibleVariables().size());
        assertEquals(ctx.getListType(ctx.getStringType()), ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE)
                .getValue());
        assertEquals(ctx.getStringType(), ctx.getVariable("e").getValue());
        assertEquals(ctx.getBooleanType(), ctx.getVariable("b").getValue());
    }

    public final void testSetInState5() {
        ExecutionContextImpl ctx = new ExecutionContextImpl();
        ctx = (ExecutionContextImpl) ctx.cloneWithVariable(new Variable(ExecutionContext.IMPLICIT_VARIABLE, ctx
                .getListType(ctx.getStringType())));
        final String s = "let x = 'test' : select(e| ((List[Boolean]){true}).collect(b|";
        ctx = (ExecutionContextImpl) ExpressionProposalComputer.computeExecutionContext(s, ctx);
        assertEquals(4, ctx.getVisibleVariables().size());
        assertEquals(ctx.getListType(ctx.getStringType()), ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE)
                .getValue());
        assertEquals(ctx.getStringType(), ctx.getVariable("e").getValue());
        assertEquals(ctx.getBooleanType(), ctx.getVariable("b").getValue());
        assertEquals(ctx.getStringType(), ctx.getVariable("x").getValue());
    }
}
