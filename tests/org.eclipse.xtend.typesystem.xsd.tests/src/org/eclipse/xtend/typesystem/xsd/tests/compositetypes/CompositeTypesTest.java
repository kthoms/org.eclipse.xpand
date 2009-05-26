/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests.compositetypes;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.xsd.XSDMetaModel;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;
import org.eclipse.xtend.typesystem.xsd.util.Msg;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class CompositeTypesTest extends AbstractTestCase {

	private ExpressionFacade ec;

	private void assertAttr(String attr, String val, int result) {
		Object o = def("obj", "new compositeTypes::RootType()");
		String str = "obj.set" + attr + "(" + val + ")";
		log.info("Evaluating " + str + ", expecting " + getServ(result));
		ec.evaluate(str);
		Diagnostic d = Diagnostician.INSTANCE.validate((EObject) o);
		if (d.getSeverity() != result) {
			printDiag("", d);
			fail();
		}
	}

	private void assertInvalid(String attr, String val) {
		assertAttr(attr, val, Diagnostic.ERROR);
	}

	private void assertValid(String attr, String val) {
		assertAttr(attr, val, Diagnostic.OK);
	}

	private Object def(String varname, String exp) {
		Object o = ec.evaluate(exp);
		ec = ec.cloneWithVariable(new Variable(varname, o));
		return o;
	}

	private String getServ(int serv) {
		switch (serv) {
		case Diagnostic.OK:
			return "OK";
		case Diagnostic.INFO:
			return "INFO";
		case Diagnostic.WARNING:
			return "WARNING";
		case Diagnostic.ERROR:
			return "ERROR";
		case Diagnostic.CANCEL:
			return "CANCEL";
		}
		return "";
	}

	private void printDiag(String pref, Diagnostic diag) {
		log.info(Msg.create(pref).txt(getServ(diag.getSeverity())).txt(": ")
				.txt(diag.getMessage()).txt(": ").txt(diag.getSource()));
		for (Diagnostic d : diag.getChildren())
			printDiag(pref + "  ", d);
	}

	protected void setUp() throws Exception {
		super.setUp();
		String xsd = getSrcDir() + "/CompositeTypes.xsd";
		XSDMetaModel mm = new XSDMetaModel();
		mm.setId("mm");
		mm.addSchemaFile(xsd);
		// for (EPackage p : mm.allPackages())
		// print(p);
		ExecutionContextImpl ctx = new ExecutionContextImpl();
		ctx.registerMetaModel(mm);
		ec = new ExpressionFacade(ctx);
	}

	public void testA() {
		assertValid("A", "1");
		assertInvalid("A", "-1");
	}

	public void testB() {
		assertValid("B", "compositeTypes::BAMember1::unbounded");
		assertValid("B", "compositeTypes::BAMember1::undefined");
		assertValid("B", "1");
		assertInvalid("B", "-1");
	}

	public void testC() {
		assertValid("C", "compositeTypes::BAMember1::unbounded");
		assertValid("C", "compositeTypes::BAMember1::undefined");
		assertValid("C", "1");
		assertValid("C", "1.1");
		assertInvalid("C", "-1");
	}

	public void testD() {
		assertInvalid("D", "'a'");
		assertInvalid("D", "'ab'");
		assertValid("D", "'abc'");
		assertValid("D", "'abcd'");
		assertValid("D", "'abcde'");
		assertInvalid("D", "'abcdef'");
		assertInvalid("D", "'1234'");
	}

	public void testE() {
		assertValid("E", "compositeTypes::BAMember1::unbounded");
		assertValid("E", "compositeTypes::BAMember1::undefined");
		assertValid("E", "1");
		assertValid("E", "1.1");
		assertInvalid("E", "-1");
		assertInvalid("E", "'a'");
		assertInvalid("E", "'ab'");
		assertValid("E", "'abc'");
		assertValid("E", "'abcd'");
		assertValid("E", "'abcde'");
		assertInvalid("E", "'abcdef'");
		assertInvalid("E", "'1234'");
	}
}
