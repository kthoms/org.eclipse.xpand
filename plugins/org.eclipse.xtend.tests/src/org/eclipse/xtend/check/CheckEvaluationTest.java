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

package org.eclipse.xtend.check;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.ExecutionContextImpl;

public class CheckEvaluationTest extends TestCase {

	private ExecutionContext ec;

	@Override
	protected void setUp() throws Exception {
		ec = new ExecutionContextImpl();
//		((ExecutionContextImpl) ec).registerMetaModel(new JavaMetaModel("asdf", new JavaBeansStrategy()));
	}

	private ExtensionFile parse(final String expression) {
		return ParseFacade.file(new StringReader(expression), null);
	}

	public final void testValidate() {
		final ExtensionFile file = parse("context String ERROR this+' not allowed!' : !this.startsWith('test') ;\n"
				+ "\n" + "context Integer ERROR ''+this+' not allowed!' : !(this > 5); \n" + "\n"
				+ "context Object WARNING 'Objects of type '+this.metaType+' not allowed!' : "
				+ "String.isInstance(this) || Integer.isInstance(this); \n");

		final List<Object> toCheck = new ArrayList<Object>();
		toCheck.add("testThis");
		toCheck.add(new Integer(6));
		toCheck.add(Boolean.TRUE);
		final Issues is = new IssuesImpl();
		file.check(ec, toCheck, is, false);
		assertEquals(2, is.getErrors().length);
		assertEquals(1, is.getWarnings().length);
		assertEquals("Objects of type Boolean not allowed!", is.getWarnings()[0].getMessage());
		assertEquals(Boolean.TRUE, is.getWarnings()[0].getElement());

	}

	public final void testNot() {

		final ExtensionFile file = parse("context String ERROR 'fehler' : !this.startsWith('a');");
		final Issues is = new IssuesImpl();
		file.check(ec, Collections.singleton("name"), is, false);
		assertFalse(is.hasErrors());

		file.check(ec, Collections.singleton("aName"), is, false);
		assertTrue(is.hasErrors());
	}

	public final void testComplex() {
		final ExtensionFile file = parse("context List ERROR 'test' : this.typeSelect(String).forAll(e| this.typeSelect(Integer).exists(a| a == e.length));");
		final List<Object> list = new ArrayList<Object>();
		list.add("123");
		list.add("1234");
		list.add("12345");
		list.add(new Long(3));
		list.add(new Long(4));
		Issues is = new IssuesImpl();
		file.check(ec, Collections.singletonList(list), is, false);
		System.out.println(is.toString());
		assertTrue(is.hasErrors());
		list.add(new Long(5));
		is = new IssuesImpl();
		file.check(ec, list, is, false);
		assertFalse(is.hasErrors());
	}

	public final void testExists() {
		final ExtensionFile file = parse("context List ERROR 'test' : this.exists(e| e.toString() == \"123\" );");
		final List<Object> list = new ArrayList<Object>();
		list.add("1");
		list.add("12");
		list.add("1234");
		Issues is = new IssuesImpl();
		file.check(ec, Collections.singletonList(list), is, false);
		System.out.println(is.toString());
		assertTrue(is.hasErrors());
		list.add("123");
		is = new IssuesImpl();
		file.check(ec, Collections.singletonList(list), is, false);
		assertFalse(is.hasErrors());
	}

	public final void testNotExists() {
		final ExtensionFile file = parse("context List ERROR 'test' : this.notExists(e| e.toString() == \"123\" );");
		final List<Object> list = new ArrayList<Object>();
		list.add("1");
		list.add("12");
		list.add("1234");
		Issues is = new IssuesImpl();
		file.check(ec, Collections.singletonList(list), is, false);
		System.out.println(is.toString());
		assertFalse(is.hasErrors());
		list.add("123");
		is = new IssuesImpl();
		file.check(ec, Collections.singletonList(list), is, false);
		assertTrue(is.hasErrors());
	}

}
