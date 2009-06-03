package org.eclipse.xtend.middleend.javaannotations;

import javax.annotation.Resource;

@M2tImports (imports= {
		@M2tImport (resource = "org.eclipse.xtend.middleend.javaannotations.SomeOtherTestFunctions", reexport = false)
		})
public class TestFunctions {

	public String someFunction () {
		return "someFunctionResult";
	}
	
	public String someFunction (String param) {
		return "someFunctionResult" + " " + param;
	}
	
}
