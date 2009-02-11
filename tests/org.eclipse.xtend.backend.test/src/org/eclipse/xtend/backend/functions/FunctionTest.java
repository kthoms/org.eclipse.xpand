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
package org.eclipse.xtend.backend.functions;

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyExecutionContext;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyFdc;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createFdc;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.testhelpers.CounterFunction;
import org.eclipse.xtend.backend.testhelpers.NamedFunctionFactory;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public class FunctionTest {
    @Test public void testCachedAndSingleInstance () {
        final ExecutionContext ctx = createEmptyExecutionContext ();
        
        final FunctionDefContextInternal fdc = createFdc (ctx.getTypesystem(), CounterFunction.class);
        ctx.setFunctionDefContext (fdc);
        
        fdc.register (new NamedFunctionFactory ("myCached", true, fdc) {
            public Object invoke (ExecutionContext innerCtx, Object[] params) {
                return innerCtx.getFunctionDefContext().invoke (innerCtx, new QualifiedName ("nextCounterValue"), new ArrayList<Object> ());
            }
        }.create(), true);
        fdc.register (new NamedFunctionFactory ("myUncached", false, fdc) {
            public Object invoke (ExecutionContext innerCtx, Object[] params) {
                return innerCtx.getFunctionDefContext().invoke (innerCtx, new QualifiedName ("nextCounterValue"), new ArrayList<Object> ());
            }
        }.create(), true);
        
        assertEquals (0L, fdc.invoke (ctx, new QualifiedName ("myUncached"), new ArrayList<Object> ()));
        assertEquals (1L, fdc.invoke (ctx, new QualifiedName ("myUncached"), new ArrayList<Object> ()));
        assertEquals (2L, fdc.invoke (ctx, new QualifiedName ("myCached"), new ArrayList<Object> ()));
        assertEquals (2L, fdc.invoke (ctx, new QualifiedName ("myCached"), new ArrayList<Object> ()));
        assertEquals (3L, fdc.invoke (ctx, new QualifiedName ("myUncached"), new ArrayList<Object> ()));
        assertEquals (2L, fdc.invoke (ctx, new QualifiedName ("myCached"), new ArrayList<Object> ()));
        assertEquals (4L, fdc.invoke (ctx, new QualifiedName ("myUncached"), new ArrayList<Object> ()));
        assertEquals (2L, fdc.invoke (ctx, new QualifiedName ("myCached"), new ArrayList<Object> ()));
    }
    
    @Test public void testImmutableCachedStringResult () {
        final ExecutionContext ctx = createEmptyExecutionContext ();
        
        final FunctionDefContextInternal fdc = createEmptyFdc (ctx.getTypesystem());
        ctx.setFunctionDefContext (fdc);
        
        fdc.register (new NamedFunctionFactory ("myCached", true) {
            public Object invoke (ExecutionContext innerCtx, Object[] params) {
                final EfficientLazyString result = new EfficientLazyString ();
                return EfficientLazyString.createAppendedString (result, "Hi Arno");
            }
        }.create(), true);
        
        assertEquals ("Hi Arno", fdc.invoke (ctx, new QualifiedName ("myCached"), new ArrayList<Object> ()).toString());
        EfficientLazyString.createAppendedString ((EfficientLazyString) fdc.invoke (ctx, new QualifiedName ("myCached"), new ArrayList<Object> ()), "... and something else");
        assertEquals ("Hi Arno", fdc.invoke (ctx, new QualifiedName ("myCached"), new ArrayList<Object> ()).toString());
    }
}
