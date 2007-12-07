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
package org.eclipse.xtend.typesystem.impl.oawclassic;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.oawclassic.OAWClassicStrategy;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.typesystem.Operation;
import org.eclipse.xtend.typesystem.Property;
import org.eclipse.xtend.typesystem.Type;

public class OawClassicStrategyTest extends TestCase {
	
	
    public final void testLowerCase() {
        final ExecutionContextImpl ec = new ExecutionContextImpl();
        ec.release();
        final OAWClassicStrategy strategy = new OAWClassicStrategy();
        strategy.setConvertPropertiesToLowerCase(true);
        ec.registerMetaModel(new JavaMetaModel("asdf", strategy));

        final Type mt = ec.getTypeForName(OawClassicMetaType.class.getName().replaceAll("\\.", "::"));
        assertNotNull(mt);

        final Property prop = mt.getProperty("field");
        assertNotNull(prop);
    }

    public final void testUpperCase() {
        final ExecutionContextImpl ec = new ExecutionContextImpl();
        ec.release();
        final OAWClassicStrategy strategy = new OAWClassicStrategy();
        strategy.setConvertPropertiesToLowerCase(false);
        ec.registerMetaModel(new JavaMetaModel("asdf", strategy));

        final Type mt = ec.getTypeForName(OawClassicMetaType.class.getName().replaceAll("\\.", "::"));
        assertNotNull(mt);

        final Property prop = mt.getProperty("Field");
        assertNotNull(prop);
    }

    public final void testOperation() {
        final ExecutionContextImpl ec = new ExecutionContextImpl();
        final OAWClassicStrategy strategy = new OAWClassicStrategy();
        strategy.setConvertPropertiesToLowerCase(false);
        ec.registerMetaModel(new JavaMetaModel("asdf", strategy));

        final Type mt = ec.getTypeForName(OawClassicMetaType.class.getName().replaceAll("\\.", "::"));
        assertNotNull(mt);

        final Operation op = mt.getOperation("myOperation", new Type[] { ec.getStringType() });
        assertNotNull(op);
        assertEquals(ec.getIntegerType(), op.getReturnType());
        assertEquals(new Integer(3), op.evaluate(new OawClassicMetaType(), new Object[] { "123" }));

    }
}
