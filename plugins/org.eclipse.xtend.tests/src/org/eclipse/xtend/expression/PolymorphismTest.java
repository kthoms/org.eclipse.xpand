/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.expression;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.xtend.typesystem.Operation;
import org.eclipse.xtend.typesystem.Type;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class PolymorphismTest extends TestCase {

    ExecutionContextImpl ec;

    @Override
    protected void setUp() throws Exception {
        ec = new ExecutionContextImpl();
        ec.registerMetaModel(new JavaMetaModel("asdf", new JavaBeansStrategy()));
    }
    
    public final void testAmbigous() {
        Type t = ec.getType(new Type2());
        assertNotNull(t.getFeature("test", new Type[0]));
    }

    public final void testStuff() {
        final Type2 o = new Type2();
        final Object obj = new Object();
        final String str = "test";
        final Integer other = new Integer(2);

        assertEquals(Type1.TYPE1_OBJECT_OBJECT, executeOperation("test", o, new Object[] {}));
        assertEquals(Type1.TYPE1_OBJECT_OBJECT, executeOperation("myOp", o, new Object[] { obj, str }));
        assertEquals(Type2.TYPE2_STRING_STRING, executeOperation("myOp", o, new Object[] { str, str }));
        assertEquals(Type2.TYPE2_STRING_OBJECT, executeOperation("myOp", o, new Object[] { str, other }));
        assertEquals(Type1.TYPE1_STRING_OBJECT, executeOperation("myOp", new Type1(), new Object[] { str, other }));

    }

    public Object executeOperation(final String name, final Object target, final Object[] params) {
        final Operation op = ec.findOperation(name, target, params);
        assertNotNull(op);
        return op.evaluate(target, params);
    }
}
