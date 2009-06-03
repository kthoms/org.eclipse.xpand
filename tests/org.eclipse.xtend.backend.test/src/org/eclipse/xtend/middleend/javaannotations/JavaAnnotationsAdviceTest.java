/*
Copyright (c) 2009 Andr� Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Andr� Arnold - initial API and implementation
*/
package org.eclipse.xtend.middleend.javaannotations;

import java.util.ArrayList;

import junit.framework.Assert;

import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.junit.Before;
import org.junit.Test;

public class JavaAnnotationsAdviceTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testSimpleAdvice () {
		Object result = JavaAnnotationBackendFacade.invokeFunction(TestFunctions.class.getName(), new CompositeTypesystem (), TestAdvice.class.getName (), new QualifiedName ("someFunction"), new ArrayList ());
		
		Assert.assertEquals("pre someFunctionResult post", result.toString());
	}
}
