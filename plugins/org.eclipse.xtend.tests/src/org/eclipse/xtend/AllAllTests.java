package org.eclipse.xtend;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllAllTests extends TestSuite{

	public AllAllTests() {
		addTest(AllTests.suite());
		addTest(org.eclipse.xtend.check.AllTests.suite());
		addTest(org.eclipse.xtend.codeassist.AllTests.suite());
		addTest(org.eclipse.xtend.expression.AllTests.suite());
		addTest(org.eclipse.xtend.expression.ast.AllTests.suite());
		addTest(org.eclipse.xtend.expression.codeassist.AllTests.suite());
		addTest(org.eclipse.xtend.expression.parser.AllTests.suite());
		addTest(org.eclipse.xtend.parser.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.baseimpl.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.baseimpl.types.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.impl.javabeans.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.impl.oawclassic.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.javabeansimpl.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.javabeansimpl.test.AllTests.suite());
	}
	
}
