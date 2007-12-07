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
package org.eclipse.xpand.internal.tests.parser;

import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.ast.Definition;
import org.eclipse.internal.xpand2.ast.FileStatement;
import org.eclipse.internal.xpand2.ast.IfStatement;
import org.eclipse.internal.xpand2.ast.Statement;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xpand2.ast.TextStatement;
import org.eclipse.internal.xpand2.parser.XpandParseFacade;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Expression;

/**
 * *
 * 
 * @author Sven Efftinge (http://www.efftinge.de) *
 */
public class StatementParserTest extends TestCase {

    private Template parse(final String expr) throws Exception {
        return XpandParseFacade.file(new StringReader(expr),null);
    }

    private final char LG = '\u00AB';

    private final char RG = '\u00BB';

    private String tag(final String str) {
        return LG + str + RG;
    }

    public final void testEmptyTemplate() throws Exception {
        final Template t = parse("");
        assertNull(t);
    }

    public final void testSimpleDefine() throws Exception {
        final Template t = parse(tag("DEFINE test FOR ecore::EClass") + tag("ENDDEFINE"));
        assertEquals(1, t.getDefinitions().length);
    }

    public final void testDoubleDefine() throws Exception {
        final Template t = parse(tag("DEFINE test FOR ecore::EClass") + tag("ENDDEFINE")
                + tag("DEFINE test2(String txt) FOR ecore::EClass") + tag("ENDDEFINE"));
        assertEquals(2, t.getDefinitions().length);
    }

    public final void testMoreComplexDefine() throws Exception {
        final Template t = parse(tag("DEFINE test(ecore::EPackage a,String b) FOR ecore::EClass")
                + tag("FILE name+\".txt\"") + "Text und so " + tag("name") + tag("FOREACH eAllattributes AS attr")
                + "Attribute : " + tag("attr.name") + tag("ENDFOREACH") + tag("ENDFILE") + tag("ENDDEFINE"));
        assertEquals(1, t.getDefinitions().length);
        final Definition def = (Definition) t.getDefinitions()[0];
        assertEquals("test", def.getName());
        assertEquals(2, def.getParams().length);
        DeclaredParameter param = def.getParams()[0];
        assertEquals("a", param.getName().getValue());
        assertEquals("ecore::EPackage", param.getType().getValue());
        param = def.getParams()[1];
        assertEquals("b", param.getName().getValue());
        assertEquals("String", param.getType().getValue());
        assertEquals("ecore::EClass", def.getType().getValue());
        List<Statement> statements = Arrays.asList(def.getBody());
        assertEquals(3, statements.size());
        final FileStatement f = (FileStatement) statements.get(1);
        final Expression concat = f.getTargetFileName();
        assertNotNull(concat);
        statements = Arrays.asList(f.getBody());
        assertEquals(5, statements.size());
        assertEquals("Text und so ", ((TextStatement) statements.get(0)).getValue());
    }

    public final void testImportDeclaration() throws Exception {
        Template t;
        t = parse(tag("IMPORT org::eclipse::xtend") + tag("IMPORT org::eclipse::xtend::xpand")
                + tag("DEFINE test FOR ecore::EClass") + tag("ENDDEFINE"));
        assertEquals(1, t.getDefinitions().length);
        assertEquals(2, t.getImports().length);

    }

    public final void testFileStatement() throws Exception {
        final Template t = parse(tag("DEFINE test FOR ecore::EClass") + tag("FILE \"test.txt\" ONCE") + tag("ENDFILE")
                + tag("ENDDEFINE"));
        assertEquals(1, t.getDefinitions().length);
        final FileStatement file = (FileStatement) ((Definition) t.getDefinitions()[0]).getBody()[1];
        assertEquals("ONCE", file.getMode().getValue());
    }

    public final void testIfStatement() throws Exception {
        final Template t = parse(tag("DEFINE test FOR ecore::EClass") + tag("IF !true") + tag("ELSEIF false")
                + tag("ELSE") + tag("ENDIF") + tag("ENDDEFINE"));
        assertEquals(1, t.getDefinitions().length);

        final IfStatement ifSt = (IfStatement) ((Definition) t.getDefinitions()[0]).getBody()[1];
        assertNotNull(ifSt);
        assertNotNull(ifSt.getCondition());
        assertNotNull(ifSt.getElseIf());
        assertNotNull(ifSt.getElseIf().getCondition());
        assertNotNull(ifSt.getElseIf().getElseIf());
        assertNull(ifSt.getElseIf().getElseIf().getCondition());
    }
    
    public void testLocation() throws Exception {
    	String defineStart = tag("DEFINE test FOR ecore::EClass");
    	String ifStmnt = tag("IF !true") + tag("ELSEIF false")
				                + tag("ELSE") + tag("ENDIF");
		String string = defineStart + ifStmnt + tag("ENDDEFINE");
		final Template t = parse(string);
    	assertEquals(0,t.getStart());
    	assertEquals(string.length(),t.getEnd());
    	
    	Definition xpandDefinition = (Definition) t.getDefinitions()[0];
    	assertEquals(1,xpandDefinition.getStart());
    	assertEquals(string.length()-1,xpandDefinition.getEnd());
    	
    	Statement statement = xpandDefinition.getBody()[1];
    	assertEquals(defineStart.length()+1,statement.getStart());
    	assertEquals(defineStart.length()+ifStmnt.length()-1,statement.getEnd());
	}

}