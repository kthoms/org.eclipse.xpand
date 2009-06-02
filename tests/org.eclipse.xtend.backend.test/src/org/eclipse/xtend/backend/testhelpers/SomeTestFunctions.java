package org.eclipse.xtend.backend.testhelpers;

public class SomeTestFunctions {
	
	public String sayHello () {
		return "Hello";
	}

	public String sayHello (String name) {
		return "Hello " + name;
	}

	public String sayHello (int num) {
		return "Hello number " + num;
	}

	public String sayHello (String firstName, String lastName) {
		return "Hello " + firstName + " " + lastName;
	}
	
	public int calc (int param) {
		return 1+param;
	}

}
