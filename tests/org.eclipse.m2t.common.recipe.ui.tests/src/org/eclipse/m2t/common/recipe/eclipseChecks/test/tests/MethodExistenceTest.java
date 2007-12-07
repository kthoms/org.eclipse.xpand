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

import org.eclipse.m2t.common.recipe.astChecks.checks.MethodExistenceCheck;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.EvalStatus;
import org.eclipse.m2t.common.recipe.eval.CheckEvaluator;
import org.eclipse.m2t.common.recipe.eval.EvaluationContext;

public class MethodExistenceTest extends TestCase {
	
	private static final String PROJECT_NAME = "test";

	protected void setUp() throws Exception {
		TestUtil.setUpWorkspace();
	}
	
	public void testFindNotExistingMethod() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AClass", "aNotMethod", null);
		eval.evaluate(check);
		assertEquals(EvalStatus.FAILED, check.getStatus());
	}
	
	public void testFindMethodWithWrongParams() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AClass", "aMethod", "java.lang.Integer");
		eval.evaluate(check);
		assertEquals(EvalStatus.FAILED, check.getStatus());
	}
	
	public void testFindMethodWithPrimitiveParams() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AClass", "aMethod", "boolean");
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}
	
	public void testFindMethodWithoutParameters() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AClass", "aMethod", null);
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}
	
	public void testFindMethodWithOneParameters() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AClass", "aMethod", "java.lang.String");
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}


	public void testFindMethodWithTwoParameters() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AClass", "aMethod", "java.lang.String, java.lang.Integer");
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}
	
	private Check init(String clazz, String methodName, String parameters) {
		return new MethodExistenceCheck("Class does not impl. interface",
				PROJECT_NAME, clazz, methodName, parameters);
	}
}
