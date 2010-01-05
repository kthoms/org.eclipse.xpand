/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xpand.internal.tests.ast;

import org.eclipse.internal.xpand2.ast.Template;

/**
 * @author Karsten Thoms - Initial contribution and API
 */
public class ImportDeclarationTest extends AbstractXpandASTTest {

	public void testAnalyze_ImportTemplate() {
		Template t1 = parse("«DEFINE SomeDef FOR Object»«ENDDEFINE»", "some/namespace/Template1");
		t1.setFullyQualifiedName("some::namespace::Template1");
		t1.analyze(execCtx, issues);
		dumpIssues();
		assertEquals(0, issues.size());

		// Now add a template that uses the other template file
		Template t2 = parse(""
			+ "«IMPORT some::namespace»"
			+ "«DEFINE OtherDef FOR Object»" 
			+ "«EXPAND Template1::SomeDef»" 
			+ "«ENDDEFINE»", "other/namespace/Template2.xpt");
		t2.setFullyQualifiedName("other::namespace::Template2");
		t2.analyze(execCtx, issues);
		dumpIssues();
		assertEquals(0, issues.size());
	}

	public void testAnalyze_ImportNamespace() {
		Template t1 = parse("«IMPORT java::util»«DEFINE SomeDef FOR Date»«ENDDEFINE»", "nofile");
		t1.analyze(execCtx, issues);
		dumpIssues();
		assertEquals(0, issues.size());
	}

	public void testAnalyze_InvalidNamespace() {
		Template t1 = parse("«DEFINE SomeDef FOR Object»«ENDDEFINE»", "some/namespace/Template1.xpt");
		t1.setFullyQualifiedName("some::namespace::Template1");
		t1.analyze(execCtx, issues);
		dumpIssues();
		assertEquals(0, issues.size());

		// Now add a template that uses the other template file
		Template t2 = parse(""
			+ "«IMPORT invalid::namespace»"
			+ "«DEFINE OtherDef FOR Object»" 
			+ "«EXPAND Template1::SomeDef»" 
			+ "«ENDDEFINE»", "other/namespace/Template2.xpt");
		t2.setFullyQualifiedName("other::namespace::Template2");
		t2.analyze(execCtx, issues);
		assertEquals(2, issues.size());
	}

	public void testAnalyze_UnusedImportedNamespace() {
		Template t1 = parse("«IMPORT java::math»«DEFINE SomeDef FOR Object»«ENDDEFINE»","nofile");
		t1.analyze(execCtx, issues);
		assertEquals(1, issues.size());
	}
}
