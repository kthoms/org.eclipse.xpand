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
package org.eclipse.xpand.internal.tests.output;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.ast.ExpressionStatement;
import org.eclipse.internal.xpand2.ast.IfStatement;
import org.eclipse.internal.xpand2.ast.TextStatement;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;

public class OutputImplTest extends TestCase {

	private OutputImpl getOutput() {
		final OutputImpl bo = new OutputImpl();
		final Outlet out = new Outlet();
		out.setName("APPEND");
		bo.addOutlet(out);
		return bo;
	}

	public final void testDeleteLine1() {
		final OutputImpl bo = getOutput();
		bo.openFile("test", "APPEND");

		bo.pushStatement(new TextStatement("", false), null);
		bo.write("Hallo test \r\n    ");
		bo.pushStatement(new TextStatement("", true), null);
		bo.write("     \n  \t  Ola");

		assertEquals("Hallo test \r\n  \t  Ola", bo.current__testONLY()
				.getBuffer().toString());
	}

	public final void testDeleteLine2() {
		final OutputImpl bo = getOutput();
		bo.openFile("test", "APPEND");

		bo.pushStatement(new TextStatement("", false), null);
		bo.write("Hallo test \r  \t  ");
		bo.pushStatement(new TextStatement("", true), null);
		bo.write("     \n    Ola");

		assertEquals("Hallo test \r    Ola", bo.current__testONLY().getBuffer()
				.toString());
	}

	public final void testDeleteLine2_5() {
		final OutputImpl bo = getOutput();
		bo.openFile("test", "APPEND");

		bo.pushStatement(new TextStatement("", true), null);
		bo.write("\r\nfirstLine\r\n");

		assertEquals("firstLine\r\n", bo.current__testONLY().getBuffer()
				.toString());
	}

	public final void testDeleteLine3() {
		final OutputImpl bo = getOutput();
		bo.openFile("test", "APPEND");

		bo.pushStatement(new TextStatement("", true), null);
		bo.write("\r\n");
		bo.pushStatement(new TextStatement("", true), null);
		bo.write("\r\n \tTest");

		assertEquals(" \tTest", bo.current__testONLY().getBuffer().toString());
	}

	public final void testDeleteLine4() {
		final OutputImpl bo = getOutput();
		bo.openFile("test", "APPEND");

		bo.pushStatement(new TextStatement("", true), null);
		bo.write("\r\n");
		bo.pushStatement(new ExpressionStatement(null), null);
		bo.write(" mein scholli ");
		bo.pushStatement(new TextStatement("", true), null);
		bo.write("\r\n \tTest");

		assertEquals(" mein scholli  \tTest", bo.current__testONLY()
				.getBuffer().toString());
	}

	public final void testPattern() {
		assertEquals("   ", del("", "   \n   "));
		assertEquals("foobar", del("foo", "\nbar"));
		assertEquals("foo\nbar", del("foo\n   ", "   \nbar"));
		assertEquals("foo\rbar", del("foo\r\t", "\r\nbar"));

		assertEquals("package", del("", "\r\npackage"));
	}

	private String del(String start, String end) {
		final OutputImpl bo = getOutput();
		bo.openFile("test", "APPEND");

		bo.pushStatement(new TextStatement("", false), null);
		bo.write(start);
		bo.pushStatement(new TextStatement("", true), null);
		bo.write(end);

		return bo.current__testONLY().getBuffer().toString();
	}

	public final void testBug152111() {
		final OutputImpl bo = getOutput();
		bo.openFile("test", "APPEND");

		bo.write("LINESTART ");
		bo.pushStatement(new TextStatement("", true), null);
		bo.write("\r\nWe have a ");
		bo.pushStatement(new TextStatement("", true), null);
		bo.write("\r\nLINEEND");

		assertEquals("LINESTART We have a LINEEND", bo.current__testONLY()
				.getBuffer().toString());
	}

	public void testDeleteAfterWS() throws Exception {
		assertEqualsAfterRemove("", "");
		assertEqualsAfterRemove("\n", "\n");
		assertEqualsAfterRemove("\n", "\n    ");
		assertEqualsAfterRemove("\n    Test", "\n    Test");
		assertEqualsAfterRemove("\n\r    Test", "\n\r    Test");
	}

	public void testTrimUntilNewline() throws Exception {
		assertEqualsTrim("", "");
		assertEqualsTrim("T   \n", "T   \n");
		assertEqualsTrim(" ", "    \n ");
		assertEqualsTrim("  \t  Ola", "     \n  \t  Ola");
	}

	private void assertEqualsAfterRemove(String expected, String toProcess) {
		final OutputImpl bo = getOutput();
		StringBuffer top = new StringBuffer(toProcess);
		bo.removeWSAfterLastNewline(top);
		assertEquals(expected, top.toString());
	}

	private void assertEqualsTrim(String expected, String toProcess) {
		final OutputImpl bo = getOutput();
		assertEquals(expected, bo.trimUntilNewline(toProcess));
	}

	public final void testAutomaticHyphenation1() {
		final OutputImpl bo = getOutput();
		bo.setAutomaticHyphens(true);
		bo.openFile("test", "APPEND");

		bo.pushStatement(new TextStatement("", false), null);
		bo.write("\r\n");
		bo.pushStatement(new IfStatement( null, null), null);
		bo.pushStatement(new TextStatement("", false), null);
		bo.write("\r\n \tTest");

		assertEquals(" \tTest", bo.current__testONLY().getBuffer().toString());
	}
}