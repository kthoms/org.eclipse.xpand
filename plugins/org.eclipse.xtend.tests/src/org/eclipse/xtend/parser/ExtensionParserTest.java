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
package org.eclipse.xtend.parser;

import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.internal.xtend.expression.ast.BooleanLiteral;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.CreateExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.ExpressionExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.ast.ImportStatement;
import org.eclipse.internal.xtend.xtend.ast.JavaExtensionStatement;
import org.eclipse.internal.xtend.xtend.parser.XtendLexer;
import org.eclipse.internal.xtend.xtend.parser.XtendLocationAddingParser;
import org.eclipse.xtend.XtendFacade;

public class ExtensionParserTest extends TestCase {
	private ExtensionFile parse(final String expression) {
		final XtendLexer scanner = new XtendLexer(new ANTLRStringStream(
				expression));
		final XtendLocationAddingParser parser = new XtendLocationAddingParser(
				new CommonTokenStream(scanner));
		try {
			return parser.file();
		} catch (final Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public final void testSimple() {
		final ExtensionFile file = parse("trueFunc() :true;");
		assertTrue(file.getNsImports().isEmpty());
		assertTrue(file.getExtImports().isEmpty());
		assertEquals(1, file.getExtensions().size());
		final ExpressionExtensionStatement fd = (ExpressionExtensionStatement) file
				.getExtensions().get(0);
		assertEquals("trueFunc", fd.getName());
		assertTrue(fd.getFormalParameters().isEmpty());

		assertTrue(fd.getExpression() instanceof BooleanLiteral);
	}

	public final void testWithImportAndComments() {
		final ExtensionFile file = parse("// test \n" + "import org::oaw; \n"
				+ "/* \n" + " * Meine Funktion \n" + " */ \n"
				+ "trueFunc() :true; \n");
		assertEquals(1, file.getNsImports().size());
		final ImportStatement imp = file.getNsImports().get(0);
		assertEquals("org::oaw", imp.getImportedId().getValue());
		assertTrue(file.getExtImports().isEmpty());
		assertEquals(1, file.getExtensions().size());
		final ExpressionExtensionStatement fd = (ExpressionExtensionStatement) file
				.getExtensions().get(0);
		assertEquals("trueFunc", fd.getName());
		assertTrue(fd.getFormalParameters().isEmpty());

		assertTrue(fd.getExpression() instanceof BooleanLiteral);
	}

	public final void testWithEverything() {
		final ExtensionFile file = parse("import org::oaw; \n"
				+ "import org::oaw2; \n"
				+ "extension test::TestExtension; \n"
				+ "\n"
				+ "private Void dump(Object obj) :JAVA java.util.String.valueOf(char) ; \n"
				+ "\n"
				+ "/* \n"
				+ " * Meine Funktion \n"
				+ " */ \n"
				+ "trueFunc() :true; \n"
				+ "\n"
				+ "Void dump(String s) : JAVA de.DefaultImpl.doStuff(java.util.Collection,java.util.Set) ; \n");
		assertEquals(2, file.getNsImports().size());

		final ImportStatement imp = file.getNsImports().get(1);
		assertEquals("org::oaw2", imp.getImportedId().getValue());
		assertEquals(1, file.getExtImports().size());

		final ImportStatement extImp = file.getExtImports().get(0);
		assertEquals("test::TestExtension", extImp.getImportedId().getValue());

		assertEquals(3, file.getExtensions().size());
		final JavaExtensionStatement ext1 = (JavaExtensionStatement) file
				.getExtensions().get(0);
		assertNotNull(ext1.getJavaType());
		assertEquals("dump", ext1.getName());
		assertTrue(ext1.isPrivate());
		final DeclaredParameter param = (DeclaredParameter) ext1
				.getFormalParameters().get(0);
		assertEquals("obj", param.getName().getValue());
		assertEquals("Object", param.getType().getValue());

		final ExpressionExtensionStatement fd = (ExpressionExtensionStatement) file
				.getExtensions().get(1);
		assertEquals("trueFunc", fd.getName());
		assertTrue(fd.getFormalParameters().isEmpty());

		assertTrue(fd.getExpression() instanceof BooleanLiteral);
	}

	public final void testCreateExtension() {
		final ExtensionFile file = parse("create List[String] test(String s) : add(s) ;");
		final CreateExtensionStatement c = (CreateExtensionStatement) file
				.getExtensions().get(0);
		assertNotNull(c);
		assertEquals("List[String]", c.getReturnTypeIdentifier().getValue());
		assertEquals("test", c.getName());
	}

	public final void testCreateExtension2() {
		XtendFacade f = XtendFacade.create();
		f = f
				.cloneWithExtensions("create List[String] resolveTarget(Object target):"
						+ "List.isInstance(target) ? addAll(target) : add(target);");
		assertEquals(Collections.singletonList(null), f.call("resolveTarget",
				(Object[]) null));
	}

	public void testSortBy() throws Exception {
		XtendFacade f = XtendFacade.create();
		f = f.cloneWithExtensions("stuff():{'C','B','A'}.sortBy(e|e).first();");
		assertEquals("A", f.call("stuff", new Object[0]));
	}

	public void testAround1() throws Exception {
		final ExtensionFile file = parse("around test::*(String x, *) : doStuff ;");
		Around a = file.getArounds().get(0);
		assertEquals("test::*", a.getPointCut().getValue());
		assertEquals("String", a.getParams().get(0).getType().getValue());
		assertEquals("x", a.getParams().get(0).getName().getValue());
		assertEquals(true, a.isWildparams());
		assertEquals("doStuff", a.getExpression().toString());
	}

	public void testAround2() throws Exception {
		final ExtensionFile file = parse("around test::Honk() : doStuff ;");
		Around a = file.getArounds().get(0);
		assertEquals("test::Honk", a.getPointCut().getValue());
		assertTrue(a.getParams().isEmpty());
		assertFalse(a.isWildparams());
		assertEquals("doStuff", a.getExpression().toString());
	}

	public void testDoubleSemicolon() throws Exception {
		try {
			parse("foo() : 'x';; bar() : 'y';");
			fail();
		} catch (RuntimeException e) {
			// expected
		}
	}
	
	public void testLocation() throws Exception {
		final ExtensionFile file = parse("foo() : 1;\n" +
				"bar() : 2;\n");
		List<Extension> extensions = file.getExtensions();
		Extension e1 = extensions.get(0);
		Extension e2 = extensions.get(1);
		assertNotNull(e1);
		assertNotNull(e2);
		assertEquals(0,e1.getStart());
		assertEquals(10,e1.getEnd());
		assertEquals(11,e2.getStart());
		assertEquals(21,e2.getEnd());
	}
}
