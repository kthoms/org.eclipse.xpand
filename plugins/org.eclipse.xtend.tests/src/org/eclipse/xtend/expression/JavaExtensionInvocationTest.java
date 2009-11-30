/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.expression;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.xtend.type.impl.java.beans.JavaBeansStrategy;

/**
 * This test case tests invocation of JAVA extensions.
 * 
 * @author Karsten Thoms - Initial contribution and API
 */
public class JavaExtensionInvocationTest extends TestCase {
    ExecutionContextImpl ec;

    private ExpressionFacade ef;
    private Set<AnalysationIssue> issues = new HashSet<AnalysationIssue>();

    @Override
    protected void setUp() throws Exception {
        ec = new ExecutionContextImpl();
        ec.registerMetaModel(new JavaMetaModel("JavaBeans", new JavaBeansStrategy()));
        ef = new ExpressionFacade(ec);
    }

    protected void registerExtensions(String extensions) {
    	final ExtensionFile file = ParseFacade.file(new StringReader(
    			extensions
    	), "nofile");
    	ec = (ExecutionContextImpl) ec.cloneWithResource(file);
    	ef = new ExpressionFacade(ec);
    }

    public void testStaticInvocationWithArg () {
        registerExtensions("String testStaticMethod (String s) : JAVA org.eclipse.xtend.expression.TestBean.staticMethodWithArg(java.lang.String) ;");
    	Object result = ef.evaluate("testStaticMethod('World')");
    	assertNotNull(result);
    	assertEquals("Hello World", result);
    }
    
    public void testStaticInvocationWithoutArg () {
        registerExtensions("String testStaticMethod () : JAVA org.eclipse.xtend.expression.TestBean.staticMethodWithoutArg() ;");
    	Object result = ef.evaluate("testStaticMethod()");
    	assertNotNull(result);
    	assertEquals("Hello World", result);
    }

    public void testNonStaticInvocationWithArg () {
        registerExtensions("String testNonStaticMethod (String s) : JAVA org.eclipse.xtend.expression.TestBean.nonStaticMethodWithArg(java.lang.String) ;");
    	Object result = ef.evaluate("testNonStaticMethod('World')");
    	assertNotNull(result);
    	assertEquals("Hello World", result);
    }

    public void testNonStaticInvocationWithoutArg () {
        registerExtensions("String testNonStaticMethod () : JAVA org.eclipse.xtend.expression.TestBean.nonStaticMethodWithoutArg() ;");
    	Object result = ef.evaluate("testNonStaticMethod()");
    	assertNotNull(result);
    	assertEquals("Hello World", result);
    }

    public void testInvocationWithtExecutionContext () {
    	ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable("message", "Hello World"));
        registerExtensions("Object testMethod (String varName) : JAVA org.eclipse.xtend.expression.ExecutionContextAwareTestBean.getVariableFromExecCtx(java.lang.String) ;");
    	Object result = ef.evaluate("testMethod('message')");
    	assertNotNull(result);
    	assertEquals("Hello World", result);
    }
}
