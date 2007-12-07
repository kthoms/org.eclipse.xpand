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

import org.eclipse.m2t.common.recipe.astChecks.checks.JavaClassExistenceCheck;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.EvalStatus;
import org.eclipse.m2t.common.recipe.eval.CheckEvaluator;
import org.eclipse.m2t.common.recipe.eval.EvaluationContext;

public class ClassExistenceTest extends TestCase {
	
	protected void setUp() throws Exception {
		TestUtil.setUpWorkspace();
	}

	private static final String PROJECT_NAME = "test";

	public void testNotExisitngClass() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.ANotClass");
		eval.evaluate(check);
		assertEquals(EvalStatus.FAILED, check.getStatus());
	}
	
	public void testExisitngClass() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init(
				"org.openarchitectureware.recipe.eclipseChecks.test.impl.AClass");
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}


	private Check init(String clazz) {
		return new JavaClassExistenceCheck("Class does not impl. interface",
				PROJECT_NAME, clazz);
	}
}
