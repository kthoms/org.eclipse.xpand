/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.expression;


/**
 * @author Karsten Thoms - Initial contribution and API
 */
public class TestBean {
	public static String staticMethodWithArg (String arg) {
		return "Hello "+arg;
	}
	
	public static String staticMethodWithoutArg () {
		return "Hello World";
	}
	public String nonStaticMethodWithArg (String arg) {
		return "Hello "+arg;
	}
	public String nonStaticMethodWithoutArg () {
		return "Hello World";
	}

}
