/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.check;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.ExecutionContextImpl;

import test.Bean;

/**
 * @author Dennis Hübner - Initial contribution and API
 * 
 */
public class FeaturedCheckTest extends TestCase {

	private ExecutionContext ec;

	@Override
	protected void setUp() throws Exception {
		ec = new ExecutionContextImpl();
		((ExecutionContextImpl) ec).registerMetaModel(new JavaMetaModel("asdf", new JavaBeansStrategy()));
	}

	private ExtensionFile parse(final String expression) {
		return ParseFacade.file(new StringReader(expression), null);
	}

	public final void testFeatureContextForChecks() {
		String fileContent = "context test::Bean#ready ERROR 'Bean is not ready!' :\n" + "ready;";
		fileContent += "context test::Bean#counter WARNING 'Initial counter is not 0.' :\n" + "counter==0;";

		final ExtensionFile file = parse(fileContent);
		final List<Object> toCheck = new ArrayList<Object>();
		Bean objectUnderTest = new Bean();
		objectUnderTest.setReady(false);
		objectUnderTest.setCounter(100);
		toCheck.add(objectUnderTest);
		final Issues issues = new IssuesImpl();
		file.check(ec, toCheck, issues, true);
		// errors
		assertEquals(1, issues.getErrors().length);
		Object feature = issues.getErrors()[0].getData().get(1);
		assertNotNull(feature);
		assertTrue("Fetures should be stored as string in issues", String.class.isInstance(feature));
		assertEquals("ready", ((String) feature));

		// warnings
		assertEquals(1, issues.getWarnings().length);
		Object feature1 = issues.getWarnings()[0].getData().get(1);
		assertNotNull(feature1);
		assertTrue("Fetures should be stored as string in issues", String.class.isInstance(feature1));
		assertEquals("counter", ((String) feature1));

	}

	public final void testEntityContextForChecks() {
		String fileContent = "context test::Bean ERROR 'Bean is not ready!' :\n" + "ready;";
		fileContent += "context test::Bean WARNING 'Initial counter is not 0.' :\n" + "counter==0;";

		final ExtensionFile file = parse(fileContent);
		final List<Object> toCheck = new ArrayList<Object>();
		Bean objectUnderTest = new Bean();
		objectUnderTest.setReady(false);
		objectUnderTest.setCounter(100);
		toCheck.add(objectUnderTest);
		final Issues issues = new IssuesImpl();
		file.check(ec, toCheck, issues, true);
		// errors
		assertEquals(1, issues.getErrors().length);
		Object feature = issues.getErrors()[0].getData().get(1);
		assertNull(feature);

		// warnings
		assertEquals(1, issues.getWarnings().length);
		Object feature1 = issues.getWarnings()[0].getData().get(1);
		assertNull(feature1);

	}
}
