/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.types;

import static org.junit.Assert.*;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.types.builtin.BooleanType;
import org.eclipse.xtend.backend.types.builtin.CollectionType;
import org.eclipse.xtend.backend.types.builtin.DoubleType;
import org.eclipse.xtend.backend.types.builtin.FunctionType;
import org.eclipse.xtend.backend.types.builtin.ListType;
import org.eclipse.xtend.backend.types.builtin.LongType;
import org.eclipse.xtend.backend.types.builtin.MapType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.types.builtin.PropertyType;
import org.eclipse.xtend.backend.types.builtin.SetType;
import org.eclipse.xtend.backend.types.builtin.StaticPropertyType;
import org.eclipse.xtend.backend.types.builtin.StringType;
import org.eclipse.xtend.backend.types.builtin.TypeType;
import org.eclipse.xtend.backend.types.builtin.VoidType;
import org.junit.Test;

/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class BuiltinTypesTest {
    @Test public void testUniqueIdentifier () {
        check ("{builtin}Boolean", BooleanType.INSTANCE);
        check ("{builtin}Collection", CollectionType.INSTANCE);
        check ("{builtin}Double", DoubleType.INSTANCE);
        check ("{builtin}Function", FunctionType.INSTANCE);
        check ("{builtin}List", ListType.INSTANCE);
        check ("{builtin}Long", LongType.INSTANCE);
        check ("{builtin}Map", MapType.INSTANCE);
        check ("{builtin}Object", ObjectType.INSTANCE);
        check ("{builtin}Property", PropertyType.INSTANCE);
        check ("{builtin}Set", SetType.INSTANCE);
        check ("{builtin}StaticProperty", StaticPropertyType.INSTANCE);
        check ("{builtin}String", StringType.INSTANCE);
        check ("{builtin}Type", TypeType.INSTANCE);
        check ("{builtin}Void", VoidType.INSTANCE);
    }
    
    private void check (String representation, BackendType type) {
        final BackendTypesystem ts = new CompositeTypesystem ();
        assertSame (ts.findType (representation), type);
        assertEquals (representation, type.getUniqueRepresentation());
    }
}
