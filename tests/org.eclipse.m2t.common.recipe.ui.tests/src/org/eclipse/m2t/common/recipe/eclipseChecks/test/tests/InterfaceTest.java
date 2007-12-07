/**
 * <copyright>
 *
 * Copyright (c) 2005-2006 Bernd Kolb and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bernd Kolb - implementation
 *
 * </copyright>
 */

package org.eclipse.m2t.common.recipe.eclipseChecks.test.tests;

import junit.framework.TestCase;

import org.eclipse.m2t.common.recipe.astChecks.checks.JavaSupertypeCheck;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.EvalStatus;
import org.eclipse.m2t.common.recipe.eval.CheckEvaluator;
import org.eclipse.m2t.common.recipe.eval.EvaluationContext;

public class InterfaceTest extends TestCase {
	
	protected void setUp() throws Exception {
		TestUtil.setUpWorkspace();
	}

	private static final String PROJECT_NAME = "test";

	public void testNonExisitngSuperInterface() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AClass",
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AnInterface");
		eval.evaluate(check);
		assertEquals(EvalStatus.FAILED, check.getStatus());
	}

	public void testSuperInterface() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AnExtendingSuperclassAndInterfaceClass",
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AnExtendingInterface");
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());

	}

	public void testInheritedSuperInterface() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AnExtendingSuperclassAndInterfaceClass",
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AnInterface");
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}
	
	public void testInheritedSuperClass() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AnExtendingSuperclassAndInterfaceClass",
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AnInterface");
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}
	
	public void testSuperClass() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AnExtendingSuperclassAndInterfaceClass",
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AClass");
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}

	private Check init(String clazz, String interf) {
		return new JavaSupertypeCheck("Class does not impl. interface",
				PROJECT_NAME, clazz, interf);
	}
}
