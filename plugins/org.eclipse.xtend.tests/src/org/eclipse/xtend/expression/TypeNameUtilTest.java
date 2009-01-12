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

import junit.framework.TestCase;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class TypeNameUtilTest extends TestCase {
    public final void testGetTypeName() {

        assertEquals("de::test::Bla", TypeNameUtil.getTypeName("de::test::Bla"));
        assertEquals("de::test::Bla", TypeNameUtil.getTypeName("MM!de::test::Bla"));
        assertEquals("de::test::Bla", TypeNameUtil.getTypeName("List[de::test::Bla]"));
        assertEquals("Bla", TypeNameUtil.getTypeName("List[Bla]"));
        assertEquals("List", TypeNameUtil.getTypeName("List"));
    }

    public final void testGetCollectionTypeName() {
        assertEquals(null, TypeNameUtil.getCollectionTypeName("de::test::Bla"));
        assertEquals(null, TypeNameUtil.getCollectionTypeName("de::test::Bla"));
        assertEquals("List", TypeNameUtil.getCollectionTypeName("List[de::test::Bla]"));
        assertEquals("Set", TypeNameUtil.getCollectionTypeName("Set[de::test::Bla]"));
        assertEquals("List", TypeNameUtil.getCollectionTypeName("List[Bla]"));
    }
    
    public final void testWithoutLastSegment () {
        assertEquals("de::test", TypeNameUtil.withoutLastSegment("de::test::Bla"));
        assertEquals(null, TypeNameUtil.withoutLastSegment("Bla"));
    }

    public final void testGetLastSegment () {
        assertEquals("Bla", TypeNameUtil.getLastSegment("de::test::Bla"));
        assertEquals("Bla", TypeNameUtil.getLastSegment("Bla"));
    }

    public final void testGetSimpleName () {
        assertEquals("Bla", TypeNameUtil.getSimpleName("de::test::Bla"));
        assertEquals("Set[Bla]", TypeNameUtil.getSimpleName("Set[de::test::Bla]"));
        assertEquals("List[Bla]", TypeNameUtil.getSimpleName("List[Bla]"));
    }
}
