/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.backend.syslib;

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.expr.ConcatExpression;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;
import org.eclipse.xtend.backend.testhelpers.NamedFunctionFactory;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.types.builtin.LongType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public class OverrideTest {
    /**
     * This method tests that it is possible to override a function from the syslib by
     *  contributing another function of the same signature to the fdc.
     */
    @Test public void testOverride () {
        final NamedFunction myLongToString = new NamedFunctionFactory ("toString", LongType.INSTANCE) {
            public Object invoke (ExecutionContext ctx, Object[] params) {
                return "Long<" + params[0] + ">";
            }
        }.create();
        final NamedFunction myObjectToString = new NamedFunctionFactory ("toString", ObjectType.INSTANCE) {
            public Object invoke (ExecutionContext ctx, Object[] params) {
                return "Object<" + params[0] + ">";
            }
        }.create();
        
        final ExpressionBase expr = new ConcatExpression (Arrays.asList (createLiteral (25L), createLiteral ("Abc")), SOURCE_POS);
        
        final FunctionDefContextInternal fdc = createEmptyFdc (new CompositeTypesystem ());
        fdc.register (myLongToString, true);
        fdc.register (myObjectToString, true);
        
        final ExecutionContext ctx = createEmptyExecutionContext();
        assertEquals ("25Abc", expr.evaluate (ctx).toString());
        
        ctx.setFunctionDefContext(fdc);
        assertEquals ("Long<25>Object<Abc>", expr.evaluate (ctx).toString());
        
    }
}
