/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.expression;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.xtend.typesystem.ParameterizedType;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class ExecutionContextImplTest extends TestCase {
    ExecutionContextImpl ec;

    @Override
    protected void setUp() throws Exception {
        ec = new ExecutionContextImpl();
        ec.registerMetaModel(new JavaMetaModel("asdf", new JavaBeansStrategy()));

    }

    public final void testgetType() {
        assertEquals(ec.getIntegerType(), ec.getType(new Integer(3)));
        assertEquals(ec.getIntegerType(), ec.getType(new Short((short) 3)));
        assertEquals(ec.getIntegerType(), ec.getType(new Long(3l)));
        assertEquals(ec.getIntegerType(), ec.getType(new Byte((byte) 3)));
        assertEquals(ec.getIntegerType(), ec.getType(new BigInteger("3")));

        assertEquals(ec.getRealType(), ec.getType(new Float(3)));
        assertEquals(ec.getRealType(), ec.getType(new Double(3)));
        assertEquals(ec.getRealType(), ec.getType(new BigDecimal(3)));

        assertEquals(ec.getStringType(), ec.getType("Test"));
        assertEquals(ec.getStringType(), ec.getType(new StringBuffer()));
        assertEquals(ec.getStringType(), ec.getType(new Character('c')));

    }

    public final void testGetTypeForName() {
        final ParameterizedType t = (ParameterizedType) ec.getTypeForName("List[String]");
        assertNotNull(t);
        assertEquals(ec.getStringType(), t.getInnerType());
    }
}
