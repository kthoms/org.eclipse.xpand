package org.eclipse.xtend.middleend.javaannotations;


import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JavaAnnotationsBackendFacadeTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testInvokeFunktion () {
		final String result = JavaAnnotationBackendFacade.invokeFunction("org.eclipse.xtend.middleend.javaannotations.TestFunctions", new CompositeTypesystem (), new QualifiedName ("someFunction"), new ArrayList()).toString();
		Assert.assertEquals("someFunctionResult", result);
	}
	
	@Test
	public void testInvokeFunktionWithParam () {
		final String result = JavaAnnotationBackendFacade.invokeFunction("org.eclipse.xtend.middleend.javaannotations.TestFunctions", new CompositeTypesystem (), new QualifiedName ("someFunction"), Arrays.asList ("parameter")).toString();
		Assert.assertEquals("someFunctionResult parameter", result);
	}

}
