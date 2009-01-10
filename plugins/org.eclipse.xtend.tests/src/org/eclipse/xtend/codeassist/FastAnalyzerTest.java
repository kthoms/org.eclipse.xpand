/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.codeassist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.expression.codeassist.ExpressionProposalComputer;
import org.eclipse.internal.xtend.expression.codeassist.ProposalFactory;
import org.eclipse.internal.xtend.expression.codeassist.ProposalFactoryDefaultImpl;
import org.eclipse.internal.xtend.expression.codeassist.ProposalImpl;
import org.eclipse.internal.xtend.expression.codeassist.TypeProposalComputer;
import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.codeassist.FastAnalyzer;
import org.eclipse.internal.xtend.xtend.codeassist.Partition;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Callable;
import org.eclipse.xtend.typesystem.Type;

public class FastAnalyzerTest extends TestCase {

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

    public final void testComputeProposals1() {
        final String s = "doStuff(test::Bean b) : ";
        final Type bt = ctx.getTypeForName("test::Bean");
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.EXPRESSION, FastAnalyzer.computePartition(s));

        assertNotNull(ctx.getVariable("b"));
        assertEquals(bt, ctx.getVariable("b").getValue());

        final List<Object> ps = getProposals(s);
        assertTrue(!ps.isEmpty());
        assertTrue(containsProposal(ps, "b", bt));
    }

    public final void testComputeProposals2() {
        final String s = "doStuff(test::Bean b, String txt) : ";
        final Type bt = ctx.getTypeForName("test::Bean");
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.EXPRESSION, FastAnalyzer.computePartition(s));

        assertEquals(2, ctx.getVisibleVariables().size());
        assertEquals(bt, ctx.getVariable("b").getValue());
        assertEquals(ctx.getStringType(), ctx.getVariable("txt").getValue());

        final List<Object> ps = getProposals(s);
        assertTrue(!ps.isEmpty());
        assertTrue(containsProposal(ps, "b", bt));
        assertTrue(containsProposal(ps, "txt", ctx.getStringType()));
    }

    public final void testComputeProposals3() {
        final String s = "import stuff;\n\r \t /*bla b lubb*/ test \ndoStuff(test::Bean b, String txt) : b + tx";
        final Type bt = ctx.getTypeForName("test::Bean");
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.EXPRESSION, FastAnalyzer.computePartition(s));

        assertEquals(2, ctx.getVisibleVariables().size());
        assertEquals(bt, ctx.getVariable("b").getValue());
        assertEquals(ctx.getStringType(), ctx.getVariable("txt").getValue());

        final List<Object> ps = getProposals(s);
        assertEquals(1, ps.size());
        assertEquals("tx", ((ProposalImpl) ps.get(0)).getPrefix());
        assertTrue(containsProposal(ps, "txt", ctx.getStringType()));
    }

    public final void testComputeProposals5() {
        final String s = "import test;\n\r \t //bla b lubb /** test \nsetter(Bean attr) :\n" + "\"set\"+attr";
        final Type bt = ctx.getTypeForName("test::Bean");
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.EXPRESSION, FastAnalyzer.computePartition(s));

        assertEquals(1, ctx.getVisibleVariables().size());
        assertEquals(bt, ctx.getVariable("attr").getValue());

        final List<Object> ps = getProposals(s);
        assertEquals(1, ps.size());
        assertEquals("attr", ((ProposalImpl) ps.get(0)).getPrefix());
        assertTrue(containsProposal(ps, "attr", bt));
    }

    public final void testComputeProposals6() {
        final String s = "import test;\n" + "setter(Bean attr) :\n" + "\"set\"+attr.";
        final Type bt = ctx.getTypeForName("test::Bean");
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.EXPRESSION, FastAnalyzer.computePartition(s));

        assertEquals(1, ctx.getVisibleVariables().size());
        assertEquals(bt, ctx.getVariable("attr").getValue());

        final List<Object> ps = getProposals(s);
        assertTrue(ps.size() > 5);
        assertTrue(containsProposal(ps, "counter", ctx.getIntegerType()));
        assertTrue(containsProposal(ps, "ready", ctx.getBooleanType()));
        assertTrue(containsProposal(ps, "parentBean", bt));
        assertTrue(containsProposal(ps, "test", ctx.getStringType()));

    }

    public final void testComputeProposals8() {
        final String s = "import test;\n" + "setter(Bean attr) :\n" + "\"set\"+attr;";
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.DEFAULT, FastAnalyzer.computePartition(s));
    }

    public final void testComputeProposals4() {
        final String s = "doStuff(test::Bean b, Stri";
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.TYPE_DECLARATION, FastAnalyzer.computePartition(s));
        assertEquals(0, ctx.getVisibleVariables().size());

        final List<Object> ps = new TypeProposalComputer().computeProposals(s, ctx, new ProposalFactoryDefaultImpl());
        assertEquals(1, ps.size());
        assertEquals("Stri", ((ProposalImpl) ps.get(0)).getPrefix());
        assertTrue(containsProposal(ps, "String", ctx.getStringType()));
    }

    public final void testComputeProposals7() {
        final String s = "import oaw;\n doStuff(Typ";
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.TYPE_DECLARATION, FastAnalyzer.computePartition(s));
        assertEquals(0, ctx.getVisibleVariables().size());

        final List<Object> ps = new TypeProposalComputer().computeProposals(s, ctx, new ProposalFactoryDefaultImpl());
        assertEquals(1, ps.size());
        final ProposalImpl pro = ((ProposalImpl) ps.get(0));
        assertEquals("Typ", pro.getPrefix());
        assertEquals("Type", pro.getInsertString());
    }

    public final void testComputeProposals9() {
        final String s = "create List l doStuff(String s) : ";
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.EXPRESSION, FastAnalyzer.computePartition(s));
        assertEquals(2, ctx.getVisibleVariables().size());

    }

    public final void testComputeProposals10() {
        final String s = "create List doStuff(String s) : ";
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.EXPRESSION, FastAnalyzer.computePartition(s));
        assertEquals(2, ctx.getVisibleVariables().size());
    }

    public final void testComputeProposals11() {
    	final String s = "around tes::doStuff::*(String s) : ";
    	ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
    	assertEquals(Partition.EXPRESSION, FastAnalyzer.computePartition(s));
    	assertEquals(2, ctx.getVisibleVariables().size());
    	assertTrue(ctx.getVisibleVariables().containsKey(Around.CONTEXT_PARAM_NAME));
    }
    
    public final void testComputeProposalsWithoutParams() {
        final String s = "import oaw;\n doStuff() : Strin";
        ctx = (ExecutionContextImpl) FastAnalyzer.computeExecutionContext(s, ctx, new ArrayList<Extension>());
        assertEquals(Partition.EXPRESSION, FastAnalyzer.computePartition(s));
        assertEquals(0, ctx.getVisibleVariables().size());

        final List<Object> ps = new TypeProposalComputer().computeProposals(s, ctx, new ProposalFactoryDefaultImpl());
        assertEquals(1, ps.size());
        final ProposalImpl pro = ((ProposalImpl) ps.get(0));
        assertEquals("Strin", pro.getPrefix());
        assertEquals("String", pro.getInsertString());

    }
    
    public final void testIsInExpression() {
        assertInExpression("myStuff() :");
        assertNotInExpression("myStuff() ");
        assertInExpression("myStuff(String s) :");
        assertInExpression("myStuff(String s,org::Ole this) :");
        assertInExpression("String myStuff() :");
        assertInExpression("private String myStuff() :");
        assertInExpression("private cached String myStuff() :");
        assertInExpression("cached String myStuff() :");
        assertInExpression("create String myStuff() :");
        assertInExpression("private create String myStuff() :");
        assertInExpression("private create String this myStuff() :");
        assertNotInExpression("private create String myStuff() ");
        
        assertInExpression("myStuff() : ele");
        assertInExpression("myStuff() : 'stuff'+ele");
        assertInExpression("myStuff() : let x = \"holla\" :\n x -> 3 ->true ->");
        assertInExpression("import org::openarchitectureware::meta::uml;\n" +
                "import org::openarchitectureware::meta::uml::classifier;\n" +
                "\n" +
                "String asParameter (ModelElement elem) :\n");
        
        
        assertInExpression("around my::Stuff(String t) :");
        assertInExpression("around my::Stuff(String t) : t.");
        assertInExpression("around my::Stuff(String t , *) : t.");
        assertNotInExpression("around my::myStuff");
    }
    
    private void assertInExpression(String s) {
        assertTrue(FastAnalyzer.isInsideExpression(s));
    }
    private void assertNotInExpression(String s) {
        assertFalse(FastAnalyzer.isInsideExpression(s));
    }

    public final void testIsTypeDeclaration() {
        assertTrue(FastAnalyzer.isInsideTypeDeclaration("test ("));
        assertTrue(FastAnalyzer.isInsideTypeDeclaration("import stuff;\n test ("));
        assertTrue(FastAnalyzer.isInsideTypeDeclaration("test () : true ; test2("));
        assertTrue(FastAnalyzer.isInsideTypeDeclaration("test (String txt,"));
        assertTrue(FastAnalyzer.isInsideTypeDeclaration("test (S"));
        assertTrue(FastAnalyzer.isInsideTypeDeclaration("test (List[oaw::Ty"));

        assertFalse(FastAnalyzer.isInsideTypeDeclaration("test (List[oaw::Type] t"));
        assertFalse(FastAnalyzer.isInsideTypeDeclaration("test () : test("));
        assertFalse(FastAnalyzer.isInsideTypeDeclaration("test (String t"));
        assertFalse(FastAnalyzer.isInsideTypeDeclaration("import test;\n test"));
        assertFalse(FastAnalyzer.isInsideTypeDeclaration("test (List[oaw::Type] c)"));
    }

    public final void testIsInsideImport() {
        assertFalse(FastAnalyzer.isInsideImport("impo"));
        assertFalse(FastAnalyzer.isInsideImport("test ("));
        assertFalse(FastAnalyzer.isInsideImport("import test::test;"));
        assertTrue(FastAnalyzer.isInsideImport("import "));
        assertTrue(FastAnalyzer.isInsideImport("import org::"));
        assertTrue(FastAnalyzer.isInsideImport("import org::oaw"));
    }

    public final void testIsInsideExtensionImport() {
        assertFalse(FastAnalyzer.isInsideExtensionImport("extension"));
        assertFalse(FastAnalyzer.isInsideExtensionImport("test ("));
        assertFalse(FastAnalyzer.isInsideExtensionImport("extension test::test;"));
        assertTrue(FastAnalyzer.isInsideExtensionImport("extension "));
        assertTrue(FastAnalyzer.isInsideExtensionImport("extension org::"));
        assertTrue(FastAnalyzer.isInsideExtensionImport("extension org::oaw"));
    }

}
