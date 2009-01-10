/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.javabeansimpl.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.expression.TypeNameUtil;
import org.eclipse.xtend.typesystem.Operation;
import org.eclipse.xtend.typesystem.StaticProperty;
import org.eclipse.xtend.typesystem.Type;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class JavaTest extends TestCase {
    private ExecutionContextImpl ec;
    private ExpressionFacade ef;

    @Override
    protected void setUp() throws Exception {
        ec = new ExecutionContextImpl();
        ec.registerMetaModel(new JavaMetaModel("asdf", new JavaBeansStrategy()));
        ef = new ExpressionFacade(ec);
    }

    public final void testSimple() throws Exception {
        final Type aType = ec.getTypeForName(TypeNameUtil.getName(TypeA.class));
        final Type bType = ec.getTypeForName(TypeNameUtil.getName(TypeB.class));
        final Type cType = ec.getTypeForName(TypeNameUtil.getName(TypeC.class));

        assertNotNull(aType);
        assertNotNull(bType);
        assertNotNull(cType);

        assertTrue(aType.isAssignableFrom(bType));
        assertFalse(bType.isAssignableFrom(aType));
        assertTrue(cType.isAssignableFrom(bType));
        assertFalse(bType.isAssignableFrom(cType));
        assertFalse(aType.isAssignableFrom(cType));
        assertFalse(cType.isAssignableFrom(aType));

        assertNotNull(bType.getProperty("name"));
        assertTrue(bType.getProperty("name").equals(aType.getProperty("name")));

        assertNotNull(cType.getOperation("computeWholeName", null));

        final TypeB obj = (TypeB) bType.newInstance();
        bType.getProperty("foreName").set(obj, "Mork");
        aType.getProperty("name").set(obj, "vom Ork");

        assertEquals("Mork vom Ork", cType.getOperation("computeWholeName", null).evaluate(obj, null));

        bType.getOperation("testStuff", new Type[] { ec.getIntegerType() }).evaluate(obj, new Object[] { new Long(3) });

        final Type refType = (Type) bType.getProperty("metaType").get(obj);
        assertEquals(bType, refType);
        assertEquals("Mork vom Ork", refType.getOperation("computeWholeName", null).evaluate(obj, null));
    }

    public final void testSimpleCollection() {
        final Type bType = ec.getTypeForName(TypeB.class.getName().replaceAll("\\.", "::"));
        final Type lType = ec.getListType(bType);
        final List l = (List) lType.newInstance();
        final Operation addOp = lType.getOperation("add", new Type[] { bType });
        for (int i = 0; i < 5; i++) {
            addOp.evaluate(l, new Object[] { bType.newInstance() });
        }
        assertEquals(5, l.size());
    }

    public final void testEnum() {
        final Type bType = ec.getTypeForName(TypeNameUtil.getName(TypeB.class));
        final StaticProperty enumField = bType.getStaticProperty("TEST");
        assertNotNull(enumField);
        assertEquals(new Integer(3), enumField.get());
    }

    public final void testSimple2() throws Exception {
    	String TEST = "ENTITY-MIB";
        Mib aInstance = new Mib();
    	aInstance.setName(TEST);
    	
        final Type stringType = ec.getType(TEST);
        final Type aType = ec.getType(aInstance);
    	
    	assertNotNull (ec.findProperty("name", aInstance));

    	ec.findOperation("+", TEST, new Object[]{".txt"});
        final Type aType2 = ec.getType(aInstance);
        final Type stringType2 = ec.getType(TEST);
    	ec.findOperation("+", TEST, new Object[]{".txt"});

    	assertNotNull (ec.findProperty("name", aInstance));
        assertEquals(aType, aType2);
        assertEquals(stringType, stringType2);
    }
    
    public final void testStaticPropertyOnClass () {
    	assertEquals(new Integer(3), ef.evaluate("org::eclipse::xtend::typesystem::javabeansimpl::test::TypeA::TEST"));
    }
    
    public final void testStaticPropertyOnInterface () {
    	assertEquals("Value1", ef.evaluate("org::eclipse::xtend::typesystem::javabeansimpl::test::InterfaceD::CONST1"));
    	assertEquals(new Integer(5), ef.evaluate("org::eclipse::xtend::typesystem::javabeansimpl::test::InterfaceD::CONST2"));
    }
    
    public final void testAccessorWithNameOfType () {
        final Type bType = ec.getTypeForName(TypeNameUtil.getName(TypeB.class));
        final Type dType = ec.getTypeForName(TypeNameUtil.getName(OAWTypeD.class));
        assertNotNull (bType);
        assertNotNull (dType);
        
        final TypeB obj = (TypeB) bType.newInstance();
    	
        // this is the normal JavaBeans style with accessor methods beginning with one capitel letter
        // for the property name.
        // Method 'getTypeA' => Property name 'typeA', *not* 'TypeA'
    	assertNotNull (ec.findProperty("typeA", obj));
    	assertNull (ec.findProperty("TypeA", obj));
    
    	// For properties whose accessor methods have multiple upper case characters at the beginning
    	// the property name also begins with capital letters
    	// Method 'getOAWTypeD' => Property name 'OAWTypeD', *not* 'oAWTypeD'
    	assertNull (ec.findProperty("oAWTypeD", obj));
    	assertNotNull (ec.findProperty("OAWTypeD", obj));
    }
    
    public final void testBooleanProperties () {
        final Type bType = ec.getTypeForName(TypeNameUtil.getName(TypeB.class));
        assertNotNull (bType);
        final TypeB obj = (TypeB) bType.newInstance();
    	
    	assertNotNull (ec.findProperty("primitiveTypeFlag", obj));
    	assertNotNull (ec.findProperty("wrapperTypeFlag", obj));
    	assertNotNull (ec.findProperty("isPrimitiveTypeFlag", obj));
    	assertNull (ec.findProperty("isWrapperTypeFlag", obj));
    }
    
    /**
     * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=182869
     */
    public final void testFindOperationFromInterface () {
        final Type dType = ec.getTypeForName(TypeNameUtil.getName(OAWTypeD.class));
        assertNotNull(dType);
        final OAWTypeD obj = (OAWTypeD) dType.newInstance();
        
        Operation op = ec.findOperation("setValueX", obj, new Object[] {"Test"});
        assertNotNull(op);
    }

    public final void testArrayAsCollection () {
        final Map vars = new HashMap ();
        vars.put ("a", TypeA.class);
        final String arrayTypeName = (String) ef.evaluate ("a.methods.metaType.name", vars);
        assertEquals ("List", arrayTypeName);
    }
}

