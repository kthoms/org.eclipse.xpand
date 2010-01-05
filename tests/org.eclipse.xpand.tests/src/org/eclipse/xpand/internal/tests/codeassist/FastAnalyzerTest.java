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

package org.eclipse.xpand.internal.tests.codeassist;

import java.util.List;
import java.util.Stack;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.XpandTokens;
import org.eclipse.internal.xpand2.ast.Advice;
import org.eclipse.internal.xpand2.codeassist.FastAnalyzer;
import org.eclipse.internal.xpand2.codeassist.LazyVar;
import org.eclipse.internal.xpand2.codeassist.StackElement;
import org.eclipse.internal.xpand2.type.DefinitionType;
import org.eclipse.xtend.expression.ExecutionContext;

public class FastAnalyzerTest extends TestCase {

    public final void testComputeStack1() {
        final String txt = tag("DEFINE test(String txt) FOR Entity") + tag("FOREACH txt.list AS c") + tag("doStuff");
        final Stack<StackElement> s = FastAnalyzer.computeStack(txt);
        assertEquals(2, s.size());

        StackElement se = s.pop();
        assertEquals(XpandTokens.FOREACH, se.block);
        LazyVar v = se.variables.get("c");
        assertNotNull(v);
        assertEquals("txt.list", v.expression);
        assertEquals("c", v.name);

        se = s.pop();
        assertEquals(XpandTokens.DEFINE, se.block);
        v = se.variables.get("txt");
        assertNotNull(v);
        assertEquals("String", v.typeName);
        assertEquals("txt", v.name);
        v = se.variables.get(ExecutionContext.IMPLICIT_VARIABLE);
        assertNotNull(v);
        assertEquals("Entity", v.typeName);
        assertEquals(ExecutionContext.IMPLICIT_VARIABLE, v.name);
    }
    
    public final void testComputeStackWithIterator() {
        final String txt = tag("DEFINE test(String txt) FOR Entity") + tag("FOREACH txt.list AS c ITERATOR i") + tag("doStuff");
        final Stack<StackElement> s = FastAnalyzer.computeStack(txt);
        assertEquals(2, s.size());
        
        StackElement se = s.pop();
        assertEquals(XpandTokens.FOREACH, se.block);
        LazyVar v = se.variables.get("c");
        assertNotNull(v);
        assertEquals("txt.list", v.expression);
        assertEquals("c", v.name);
        
        v = se.variables.get("i");
        assertNotNull(v);
        assertEquals("xpand2::Iterator", v.typeName);
        assertEquals("i", v.name);
        
        se = s.pop();
        assertEquals(XpandTokens.DEFINE, se.block);
        v = se.variables.get("txt");
        assertNotNull(v);
        assertEquals("String", v.typeName);
        assertEquals("txt", v.name);
        v = se.variables.get(ExecutionContext.IMPLICIT_VARIABLE);
        assertNotNull(v);
        assertEquals("Entity", v.typeName);
        assertEquals(ExecutionContext.IMPLICIT_VARIABLE, v.name);
    }

    public final void testComputeStack11() {
        final String txt = tag("AROUND *test* (String txt) FOR Entity") + tag("FOREACH txt.list AS c") + tag("doStuff");
        final Stack<StackElement> s = FastAnalyzer.computeStack(txt);
        assertEquals(2, s.size());

        StackElement se = s.pop();
        assertEquals(XpandTokens.FOREACH, se.block);
        LazyVar v = se.variables.get("c");
        assertNotNull(v);
        assertEquals("txt.list", v.expression);
        assertEquals("c", v.name);

        se = s.pop();
        assertEquals(XpandTokens.AROUND, se.block);
        v = se.variables.get("txt");
        assertNotNull(v);
        assertEquals("String", v.typeName);
        assertEquals("txt", v.name);
        v = se.variables.get(ExecutionContext.IMPLICIT_VARIABLE);
        assertNotNull(v);
        assertEquals("Entity", v.typeName);
        assertEquals(ExecutionContext.IMPLICIT_VARIABLE, v.name);
    }

    public final void testComputeStack12() {
        final String txt = tag("AROUND *features(*) FOR ecore::EStructuralFeature ")
                + tag("\n" + "logWarn(targetDef.name+\" FOR \"+targetDef.targetType) ") + tag("\n" + "targ")
                + tag("doStuff");
        final Stack<StackElement> s = FastAnalyzer.computeStack(txt);
        assertEquals(1, s.size());

        final StackElement se = s.pop();
        assertEquals(XpandTokens.AROUND, se.block);
        LazyVar v = se.variables.get(ExecutionContext.IMPLICIT_VARIABLE);
        assertNotNull(v);
        assertEquals("ecore::EStructuralFeature", v.typeName);
        v = se.variables.get(Advice.DEF_VAR_NAME);
        assertNotNull(v);
        assertEquals(DefinitionType.TYPE_NAME, v.typeName);
    }

    public String tag(final String txt) {
        return XpandTokens.LT + txt + XpandTokens.RT;
    }

    public final void testComputeStack2() {
        final String txt = tag("DEFINE test(String txt, List[xpand2::Type] typeList) FOR Entity")
                + tag("FOREACH txt.list AS c") + tag("c.stuff") + tag("ENDFOREACH")
                + tag("LET stuff(txt+'holla') AS stuff") + tag("stuff.bla");
        final Stack<StackElement> s = FastAnalyzer.computeStack(txt);
        assertEquals(2, s.size());

        StackElement se = s.pop();
        assertEquals(XpandTokens.LET, se.block);
        LazyVar v = se.variables.get("stuff");
        assertNotNull(v);
        assertEquals("stuff(txt+'holla')", v.expression);
        assertEquals("stuff", v.name);

        se = s.pop();
        assertEquals(XpandTokens.DEFINE, se.block);
        v = se.variables.get("txt");
        assertNotNull(v);
        assertEquals("String", v.typeName);
        assertEquals("txt", v.name);
        v = se.variables.get("typeList");
        assertNotNull(v);
        assertEquals("List[xpand2::Type]", v.typeName);
        assertEquals("typeList", v.name);
        v = se.variables.get(ExecutionContext.IMPLICIT_VARIABLE);
        assertNotNull(v);
        assertEquals("Entity", v.typeName);
        assertEquals(ExecutionContext.IMPLICIT_VARIABLE, v.name);
    }

    public final void testIsInTag() {
        assertFalse(FastAnalyzer.isInTag("test"));
        assertFalse(FastAnalyzer.isInTag(XpandTokens.RT + "test"));
        assertFalse(FastAnalyzer.isInTag(XpandTokens.LT + "test" + XpandTokens.RT));

        assertTrue(FastAnalyzer.isInTag(XpandTokens.LT + "test"));
        assertTrue(FastAnalyzer.isInTag(XpandTokens.LT + "test" + XpandTokens.RT + "test" + XpandTokens.LT));
    }

    public final void testIsInImport() {
        assertFalse(FastAnalyzer.isInImport(XpandTokens.RT + "IMPORT"));
        assertFalse(FastAnalyzer.isInImport(XpandTokens.LT + "IMPORT " + XpandTokens.RT));

        assertFalse(FastAnalyzer.isInImport("IMPORT"));
        assertTrue(FastAnalyzer.isInImport(XpandTokens.LT + "IMPORT "));
        assertTrue(FastAnalyzer.isInImport(XpandTokens.LT + "IMPORT org::xpand2::"));

    }

    public final void testIsInExtensionImport() {
        assertFalse(FastAnalyzer.isInExtensionImport(XpandTokens.RT + "EXTENSION"));
        assertFalse(FastAnalyzer.isInExtensionImport(XpandTokens.LT + "EXTENSION " + XpandTokens.RT));

        assertFalse(FastAnalyzer.isInExtensionImport("EXTENSION"));
        assertTrue(FastAnalyzer.isInExtensionImport(XpandTokens.LT + "EXTENSION "));
        assertTrue(FastAnalyzer.isInExtensionImport(XpandTokens.LT + "EXTENSION org::xpand2::"));

    }

    public final void testFindImports() {
        final List<String> imports = FastAnalyzer.findImports(tag("IMPORT a1") + tag("IMPORT a::b::c::d::x"));
        assertEquals("a1", imports.get(0));
        assertEquals("a::b::c::d::x", imports.get(1));
        assertEquals(2, imports.size());
    }

    public final void testFindExetnsionImports() {
        final List<String> imports = FastAnalyzer.findExtensions(tag("EXTENSION a1") + tag("EXTENSION a::b::c::d::x"));
        assertEquals("a1", imports.get(0));
        assertEquals("a::b::c::d::x", imports.get(1));
        assertEquals(2, imports.size());
    }

    public final void testIsInTypeDecl() {
        assertTrue(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(")));
        assertTrue(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(Str")));
        assertTrue(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(String s,")));
        assertTrue(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(String s,oaw:")));
        assertTrue(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(String s,String txt,")));
        assertTrue(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(String s) FOR ")));
        assertTrue(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(String s) FOR oaw")));
        assertTrue(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("test.typeSelect(")));
        assertTrue(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("test.typeSelect( xpand2::")));

        assertFalse(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test")));
        assertFalse(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(String ")));
        assertFalse(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(String s")));
        assertFalse(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(String s)")));
        assertFalse(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(String s) FOR")));
        assertFalse(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("DEFINE test(String s) FOR Test ")));
        assertFalse(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("test.typeSelect( oaw ")));
        assertFalse(FastAnalyzer.isInTypeDecl(XpandTokens.LT + ("test.typeSelect( oaw)")));

    }
    
    public final void testIsInExpandStatement() {
        assertTrue(FastAnalyzer.isInExpand(XpandTokens.LT + ("EXPAND test")));
        assertFalse(FastAnalyzer.isInExpand(XpandTokens.LT + ("EXPAND test FOR")));
        assertTrue(FastAnalyzer.isInExpand(XpandTokens.LT + ("EXPAND test::Holla::test")));
        assertFalse(FastAnalyzer.isInExpand(XpandTokens.LT + ("EXPAND test::Test(s")));
        
    }
}
