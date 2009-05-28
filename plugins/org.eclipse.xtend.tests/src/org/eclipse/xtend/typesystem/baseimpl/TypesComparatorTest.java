/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.typesystem.baseimpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.type.baseimpl.TypesComparator;
import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.javabeansimpl.test.TypeA;
import org.eclipse.xtend.typesystem.javabeansimpl.test.TypeB;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class TypesComparatorTest extends TestCase {
    ExecutionContextImpl ec;
	private JavaMetaModel mm;

    @Override
    protected void setUp() throws Exception {
        ec = new ExecutionContextImpl();
        mm = new JavaMetaModel("asdf", new JavaBeansStrategy());
        ec.registerMetaModel(mm);
    }

    public final void testNullParams() {
        final Comparator<List<? extends Type>> c = new TypesComparator();
        final Type aType = mm.getTypeForName(TypeA.class.getName());
        try {
            c.compare(null, null);
            fail();
        } catch (final Exception e) {
        }
        try {
            c.compare(null, l(aType));
            fail();
        } catch (final Exception e) {
        }
        try {
            c.compare(l(aType), null);
            fail();
        } catch (final Exception e) {
        }
    }

    public final void testSimple() {
        final Comparator<List<? extends Type>> c = new TypesComparator();

        final Type aType = mm.getTypeForName(TypeA.class.getName()); // TODO
        final Type bType = mm.getTypeForName(TypeB.class.getName()); // TODO

        assertTrue(c.compare(l(aType), l(aType)) == 0);
        assertTrue(c.compare(l(aType), l(bType)) > 0);
        assertTrue(c.compare(l(bType), l(aType)) < 0);
    }

    public final void testComplex() {
        final Comparator<List<? extends Type>> c = new TypesComparator();

        final Type aType = mm.getTypeForName(TypeA.class.getName()); // TODO
        final Type bType = mm.getTypeForName(TypeB.class.getName()); // TODO

        assertTrue(c.compare(l(aType, aType), l(aType, aType)) == 0);

        assertTrue(c.compare(l(aType, aType), l(bType, aType)) > 0);
        assertTrue(c.compare(l(aType, aType), l(aType, bType)) > 0);

        assertTrue(c.compare(l(bType, aType), l(aType, aType)) < 0);
        assertTrue(c.compare(l(aType, bType), l(aType, aType)) < 0);
    }

    private List<? extends Type> l(final Type a) {
        final List<Type> l = new ArrayList<Type>();
        l.add(a);
        return l;
    }

    private List<? extends Type> l(final Type a, final Type b) {
        final List<Type> l = new ArrayList<Type>();
        l.add(a);
        l.add(b);
        return l;
    }

}