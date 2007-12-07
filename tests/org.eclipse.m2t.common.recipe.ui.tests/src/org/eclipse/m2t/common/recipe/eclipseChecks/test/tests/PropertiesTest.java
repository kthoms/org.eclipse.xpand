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

import org.eclipse.m2t.common.recipe.astChecks.checks.PropertyFileExistenceCheck;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.EvalStatus;
import org.eclipse.m2t.common.recipe.eval.CheckEvaluator;
import org.eclipse.m2t.common.recipe.eval.EvaluationContext;

public class PropertiesTest extends TestCase {

	private static final String PROJECT_NAME = "test";
	
	protected void setUp() throws Exception {
		TestUtil.setUpWorkspace();
	}

	public void testLoadFile() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init("src/org/openarchitectureware/recipe/eclipseChecks/test/impl/test.properties", null, null);
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}

	public void testFindProperty() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init("src/org/openarchitectureware/recipe/eclipseChecks/test/impl/test.properties", "testProp", null);
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}
	
	public void testFindNotExistingProperty() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init("src/org/openarchitectureware/recipe/eclipseChecks/test/impl/test.properties", "testPropXXY", null);
		eval.evaluate(check);
		assertEquals(EvalStatus.FAILED, check.getStatus());
	}
	
	public void testCorrectValue() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init("src/org/openarchitectureware/recipe/eclipseChecks/test/impl/test.properties", "testProp", "hallo");
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}
	
	public void testIncorrectValue() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init("src/org/openarchitectureware/recipe/eclipseChecks/test/impl/test.properties", "testProp", "halloXXY");
		eval.evaluate(check);
		assertEquals(EvalStatus.FAILED, check.getStatus());
	}
	
	public void testEmptyProperty() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init("src/org/openarchitectureware/recipe/eclipseChecks/test/impl/test.properties", "anOtherTestProp", null);
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}
	
	public void testEmptyValue() throws Exception {
		CheckEvaluator eval = new CheckEvaluator(new EvaluationContext());
		Check check = init("src/org/openarchitectureware/recipe/eclipseChecks/test/impl/test.properties", "anOtherTestProp", "");
		eval.evaluate(check);
		assertEquals(EvalStatus.OK, check.getStatus());
	}

	private Check init(String file, String propertyName, String propertyValue) {
		return new PropertyFileExistenceCheck("something went wrong", PROJECT_NAME, file, propertyName, propertyValue);
	}
}
