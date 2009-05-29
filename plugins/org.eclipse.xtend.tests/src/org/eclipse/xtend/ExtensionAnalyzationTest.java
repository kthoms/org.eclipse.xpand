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

package org.eclipse.xtend;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.internal.xtend.xtend.ast.ExpressionExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.javabeansimpl.test.TypeA;

public class ExtensionAnalyzationTest extends TestCase {
	private Set<AnalysationIssue> issues;

	private ExecutionContextImpl ec;

	@Override
	protected void setUp() throws Exception {
		ec = new ExecutionContextImpl();
		ec.registerMetaModel(new JavaMetaModel("asdf", new JavaBeansStrategy()));
		issues = new HashSet<AnalysationIssue>();
	}

	private ExtensionFile parse(final String expression) {
		return ParseFacade.file(new StringReader(expression), "nofile");
	}

	private void dumpIssues() {
		for (final Iterator<AnalysationIssue> iter = issues.iterator(); iter.hasNext();) {
			final AnalysationIssue element = iter.next();
			System.out.println(element.getType().toString() + " - " + element.getMessage());
		}
	}

	public final void testWithEverything() {
		final ExtensionFile file = parse("String toUpperCase(String str) : JAVA org.eclipse.xtend.Helper.toUpperCase(java.lang.String) ; \n"
				+ "\n"
				+ "String privateHelper(String str) :JAVA org.eclipse.xtend.Helper.privateHelper(java.lang.String) ; \n"
				+ "\n"
				+ "String nonStaticHelper(String str) :JAVA org.eclipse.xtend.Helper.nonStaticHelper(java.lang.String) ; \n"
				+ "\n" + "/* \n" + " * Meine Funktion \n" + " */ \n" + "myExtension(Object val) : {val}; \n");

		file.analyze(ec, issues);
		dumpIssues();

		assertEquals(2, issues.size());
		final ExpressionExtensionStatement ext = (ExpressionExtensionStatement) file.getExtensions().get(3);

		assertEquals(ec.getListType(ec.getBooleanType()), ext.getReturnType(new Type[] { ec.getBooleanType() }, ec,
				new HashSet<AnalysationIssue>()));
		assertEquals(ec.getListType(ec.getStringType()), ext.getReturnType(new Type[] { ec.getStringType() }, ec,
				new HashSet<AnalysationIssue>()));
		assertEquals(ec.getListType(ec.getObjectType()), ext.getReturnType(new Type[] { ec.getObjectType() }, ec,
				new HashSet<AnalysationIssue>()));
	}

	public final void testRecursionWithoutType() {
		final ExtensionFile file = parse("recExtension(Integer i) : i==0 ? {i} : recExtension(i-1).add(i) ; \n");

		ec = (ExecutionContextImpl) ec.cloneWithResource(file);
		final ExpressionExtensionStatement ext = (ExpressionExtensionStatement) file.getExtensions().get(0);
		final Type result = ext.getReturnType(new Type[] { ec.getIntegerType() }, ec, new HashSet<AnalysationIssue>());
		assertNull(result);

	}

	public final void testRecursionWithType() {
		final ExtensionFile file = parse("List[Integer] recExtension(Integer i) : i==0 ? {i} : recExtension(i-1).add(i) ; \n");

		ec = (ExecutionContextImpl) ec.cloneWithResource(file);
		final ExpressionExtensionStatement ext = (ExpressionExtensionStatement) file.getExtensions().get(0);
		final Type result = ext.getReturnType(new Type[] { ec.getIntegerType() }, ec, new HashSet<AnalysationIssue>());
		assertEquals(0, issues.size());
		assertEquals(ec.getListType(ec.getIntegerType()), result);

	}

	public final void testMemberPosition() {
		final ExtensionFile file = parse("ext1(String txt) : 'test'+txt ;" + "ext2(String txt) : txt.ext1() ;");
		ec = (ExecutionContextImpl) ec.cloneWithResource(file);

		final Extension ext = ec.getExtensionForTypes("ext2", new Type[] { ec.getStringType() });
		final Type evalResult = ext.getReturnType(new Type[] { ec.getStringType() }, ec,
				new HashSet<AnalysationIssue>());
		assertEquals(ec.getStringType(), evalResult);
	}

	public final void testDuplicateParameterNames1() {
		final ExtensionFile file = parse("ext1(String txt, String txt) : 'test'+txt ;");
		ec = (ExecutionContextImpl) ec.cloneWithResource(file);
		file.analyze(ec, issues);
		assertEquals(1, issues.size());

	}

	public final void testDuplicateParameterNames2() {
		final ExtensionFile file = parse("ext1(String txt, String txt2) : 'test'+txt ;");
		ec = (ExecutionContextImpl) ec.cloneWithResource(file);
		file.analyze(ec, issues);
		assertEquals(0, issues.size());
	}

	public final void testThisParameterName() {
		final ExtensionFile file = parse("ext1(String this, String txt2) : 'test'+length ;");
		ec = (ExecutionContextImpl) ec.cloneWithResource(file);
		file.analyze(ec, issues);
		assertEquals(0, issues.size());
	}

	public final void testCreateExtension() {
		final ExtensionFile file = parse("create List l test(String s) : l.add(s) ;");
		ec = (ExecutionContextImpl) ec.cloneWithResource(file);
		file.analyze(ec, issues);
		assertEquals(0, issues.size());
		final Extension ext = (Extension) file.getExtensions().get(0);
		assertEquals("List", ext.getReturnType(null, ec, null).getName());
	}

	public final void testCreateExtension1() {
		final ExtensionFile file = parse("create List test(String s) : add(s) ;");
		ec = (ExecutionContextImpl) ec.cloneWithResource(file);
		file.analyze(ec, issues);
		assertEquals(0, issues.size());
		final Extension ext = (Extension) file.getExtensions().get(0);
		assertEquals("List", ext.getReturnType(null, ec, null).getName());
	}

	public final void testAmbigous() {
		final ExtensionFile file = parse("import " + TypeA.class.getPackage().getName().replaceAll("\\.", "::") + ";"
				+ "doStuff(TypeA this) : true; " + "doStuff(TypeC this) : false;" + "bla(TypeB this) : this.doStuff();");
		ec = (ExecutionContextImpl) ec.cloneWithResource(file);
		file.analyze(ec, issues);
		assertEquals(1, issues.size());
		System.out.println(issues);
	}

	public void testReexport() throws Exception {
		final ExtensionFile file = parse("extension org::eclipse::xtend::Reexporting; foo(String this) : doStuff(); ");
		file.analyze(ec, issues);
		System.out.println(issues);
		assertEquals(0,issues.size());
	}

	public void testResolving() {
	    if (!VersionComparator.isAtLeastVersion("1.6"))
	        return;
	    final ExtensionFile file = parse("import javax::lang::model::element;\n" + 
	    		"test(TypeElement e) : e.typeParameters.first();\n");
	    file.analyze(ec, issues);
	    System.out.println(issues);
	    assertEquals(0, issues.size());
    }
	
	public final void testMultipleCalls() {
		final ExtensionFile file = parse(
				"a()    : 'A' ; \n" +
				"aa()   : a() + 'B'; \n" +
				"ab()   : a() + 'B'; \n" +
				"aaab() : aa() + ab(); \n" +
				"outer(): aaab();"
				);

		file.analyze(ec, issues);
		dumpIssues();

		assertEquals(0, issues.size());
	}
	


}
