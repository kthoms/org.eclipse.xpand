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
package org.eclipse.xtend.backend.aop;

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyExecutionContext;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyFdc;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createFdc;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.xtend.backend.common.AdviceContext;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.expr.ConcatExpression;
import org.eclipse.xtend.backend.expr.InvocationOnObjectExpression;
import org.eclipse.xtend.backend.expr.LiteralExpression;
import org.eclipse.xtend.backend.functions.AbstractFunction;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;
import org.eclipse.xtend.backend.testhelpers.CounterFunction;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.types.builtin.CollectionType;
import org.eclipse.xtend.backend.types.builtin.LongType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.util.Pair;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public class AopTest {
    @Test
    public void testUncached () {
        final ExecutionContext ctx = createEmptyExecutionContext();
        
        final FunctionDefContextInternal fdc = createFdc (ctx.getTypesystem(), CounterFunction.class);
        ctx.setFunctionDefContext (fdc);

        @SuppressWarnings("unchecked")
        final Pointcut pointCut = new ExecutionPointcut ("*", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, true));
        registerAdvice (ctx, "pre-1", "post-1", true, pointCut, true);
        
        assertEquals ("pre-10post-1", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("nextCounterValue"), Collections.emptyList()).toString());
        assertEquals ("pre-11post-1", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("nextCounterValue"), Collections.emptyList()).toString());

        // test wrapped advice, particularly the application order
        final AdviceContext advCtx1 = ctx.getAdviceContext();
        registerAdvice (ctx, "pre-2", "post-2", true, pointCut, true);
        assertEquals ("pre-1pre-22post-2post-1", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("nextCounterValue"), Collections.emptyList()).toString());
        
        // test without calling proceed, and at the same time reverting to an earlier AdviceContext
        ctx.setAdviceContext (advCtx1);
        registerAdvice (ctx, "pre-3", "post-3", false, pointCut, true);
        assertEquals ("pre-1pre-3post-3post-1", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("nextCounterValue"), Collections.emptyList()).toString());
        assertEquals ("pre-1pre-3post-3post-1", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("nextCounterValue"), Collections.emptyList()).toString());
        assertEquals ("pre-1pre-3post-3post-1", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("nextCounterValue"), Collections.emptyList()).toString());
        
        // test that the previous invocations did not reach the actual function implementation
        ctx.setAdviceContext (advCtx1);
        assertEquals ("pre-13post-1", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("nextCounterValue"), Collections.emptyList()).toString());
    }

    private void registerAdvice (ExecutionContext ctx, String prefix, String postfix, boolean proceed, Pointcut pointCut, boolean cached) {
        final AroundAdvice newAdvice = new AroundAdvice (ConcatAdviceFactory.createConcatExpression (prefix, postfix, proceed), pointCut, cached);
        newAdvice.setFunctionDefContext (createEmptyFdc (new CompositeTypesystem ()));
        
        ctx.setAdviceContext (ctx.getAdviceContext().copyWithAdvice (newAdvice));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testVarArgsParamTypeMatching () {
        final ExecutionContext ctx = createEmptyExecutionContext();
        
        final FunctionDefContextInternal fdc = createFdc (ctx.getTypesystem(), AopTestFunctions.class);
        ctx.setFunctionDefContext (fdc);

        final Pointcut pointCutObject = new ExecutionPointcut ("f", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, false));
        final Pointcut pointCutObjectPlus = new ExecutionPointcut ("f", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, true));
        final Pointcut pointCutCollection = new ExecutionPointcut ("f", Collections.EMPTY_LIST, true, new AdviceParamType (CollectionType.INSTANCE, false));
        final Pointcut pointCutCollectionPlus = new ExecutionPointcut ("f", Collections.EMPTY_LIST, true, new AdviceParamType (CollectionType.INSTANCE, true));

        registerAdvice (ctx, "object ", "", true, pointCutObject, false);
        registerAdvice (ctx, "object+ ", "", true, pointCutObjectPlus, false);
        registerAdvice (ctx, "collection ", "", true, pointCutCollection, false);
        registerAdvice (ctx, "collection+ ", "", true, pointCutCollectionPlus, false);
        
        assertEquals ("object object+ f(Object)", ctx.getFunctionDefContext().invoke(ctx, new QualifiedName ("f"), Arrays.asList (new Object ())).toString());
        assertEquals ("object object+ f(Object)", ctx.getFunctionDefContext().invoke(ctx, new QualifiedName ("f"), Arrays.asList ("")).toString());
        assertEquals ("object+ collection collection+ f(Collection)", ctx.getFunctionDefContext().invoke(ctx, new QualifiedName ("f"), Arrays.asList (new HashSet<Object> ())).toString());
        assertEquals ("object+ collection+ f(List)", ctx.getFunctionDefContext().invoke(ctx, new QualifiedName ("f"), Arrays.asList (new ArrayList<Object> ())).toString());
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void testExplicitParamTypeMatching () {
        final ExecutionContext ctx = createEmptyExecutionContext();
        
        final FunctionDefContextInternal fdc = createFdc (ctx.getTypesystem(), AopTestFunctions.class);
        ctx.setFunctionDefContext (fdc);
        
        final Pointcut pointCutObject = new ExecutionPointcut ("f", Arrays.asList (new Pair<String, AdviceParamType> ("o", new AdviceParamType (ObjectType.INSTANCE, false))), false, null);
        final Pointcut pointCutObjectPlus = new ExecutionPointcut ("f", Arrays.asList (new Pair<String, AdviceParamType> ("o", new AdviceParamType (ObjectType.INSTANCE, true))), false, null);
        final Pointcut pointCutCollection = new ExecutionPointcut ("f", Arrays.asList (new Pair<String, AdviceParamType> ("o", new AdviceParamType (CollectionType.INSTANCE, false))), false, null);
        final Pointcut pointCutCollectionPlus = new ExecutionPointcut ("f", Arrays.asList (new Pair<String, AdviceParamType> ("o", new AdviceParamType (CollectionType.INSTANCE, true))), false, null);
        
        registerAdvice (ctx, "object ", "", true, pointCutObject, false);
        registerAdvice (ctx, "object+ ", "", true, pointCutObjectPlus, false);
        registerAdvice (ctx, "collection ", "", true, pointCutCollection, false);
        registerAdvice (ctx, "collection+ ", "", true, pointCutCollectionPlus, false);
        
        assertEquals ("object object+ f(Object)", ctx.getFunctionDefContext().invoke(ctx, new QualifiedName ("f"), Arrays.asList (new Object ())).toString());
        assertEquals ("object object+ f(Object)", ctx.getFunctionDefContext().invoke(ctx, new QualifiedName ("f"), Arrays.asList ("")).toString());
        assertEquals ("object+ collection collection+ f(Collection)", ctx.getFunctionDefContext().invoke(ctx, new QualifiedName ("f"), Arrays.asList (new HashSet<Object> ())).toString());
        assertEquals ("object+ collection+ f(List)", ctx.getFunctionDefContext().invoke(ctx, new QualifiedName ("f"), Arrays.asList (new ArrayList<Object> ())).toString());
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void testNameMatching () {
        final ExecutionContext ctx = createEmptyExecutionContext();
        
        final FunctionDefContextInternal fdc = createFdc (ctx.getTypesystem(), AopTestFunctions.class);
        ctx.setFunctionDefContext (fdc);

        final Pointcut pointCutFirstPre = new ExecutionPointcut ("first*", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, true));
        final Pointcut pointCutFirstPost = new ExecutionPointcut ("*tFunction", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, true));
        final Pointcut pointCutFirstIn = new ExecutionPointcut ("*tF*", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, true));
        final Pointcut pointCutFirstIn2 = new ExecutionPointcut ("fir*on", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, true));
        final Pointcut pointCutSecondPre = new ExecutionPointcut ("second*", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, true));
        final Pointcut pointCutSecondPost = new ExecutionPointcut ("*dFunction", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, true));
        final Pointcut pointCutSecondIn = new ExecutionPointcut ("*dF*", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, true));
        final Pointcut pointCutSecondIn2 = new ExecutionPointcut ("sec*on", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, true));
        final Pointcut pointCutBothIn = new ExecutionPointcut ("*Fun*", Collections.EMPTY_LIST, true, new AdviceParamType (ObjectType.INSTANCE, true));

        registerAdvice (ctx, "firstPre ", "", true, pointCutFirstPre, false);
        registerAdvice (ctx, "firstPost ", "", true, pointCutFirstPost, false);
        registerAdvice (ctx, "firstIn ", "", true, pointCutFirstIn, false);
        registerAdvice (ctx, "firstIn2 ", "", true, pointCutFirstIn2, false);
        
        registerAdvice (ctx, "secondPre ", "", true, pointCutSecondPre, false);
        registerAdvice (ctx, "secondPost ", "", true, pointCutSecondPost, false);
        registerAdvice (ctx, "secondIn ", "", true, pointCutSecondIn, false);
        registerAdvice (ctx, "secondIn2 ", "", true, pointCutSecondIn2, false);

        registerAdvice (ctx, "bothIn ", "", true, pointCutBothIn, false);
        
        assertEquals ("firstPre firstPost firstIn firstIn2 bothIn first", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("firstFunction"), Collections.emptyList()).toString());
        assertEquals ("secondPre secondPost secondIn secondIn2 bothIn second", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("secondFunction"), Collections.emptyList()).toString());
    }

    private long _counter = 0;
    
    @SuppressWarnings("unchecked")
    @Test
    public void testCacheable () {
        _counter = 0;
        
        final ExecutionContext ctx = createEmptyExecutionContext();
        
        final FunctionDefContextInternal fdc = createFdc (ctx.getTypesystem(), CounterFunction.class);
        ctx.setFunctionDefContext (fdc);

        fdc.register (new NamedFunction (new QualifiedName ("f"), new AbstractFunction (null, new ArrayList<BackendType> (), LongType.INSTANCE, true) {
            public Object invoke (ExecutionContext localCtx, Object[] params) {
                return _counter++; 
            }
        }), true);
        
        final Pointcut pointCut = new ExecutionPointcut ("f", Collections.EMPTY_LIST, false, null);
        
        registerSideEffectAdvice (ctx, "first ", pointCut, true);
        registerSideEffectAdvice (ctx, "second ", pointCut, false);
        registerSideEffectAdvice (ctx, "third ", pointCut, true);
        
        assertEquals ("first 0 second 1 third 2 0", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("f"), Collections.EMPTY_LIST).toString());
        assertEquals ("first 3 second 4 third 2 0", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("f"), Collections.EMPTY_LIST).toString());
        assertEquals ("first 5 second 6 third 2 0", ctx.getFunctionDefContext().invoke (ctx, new QualifiedName ("f"), Collections.EMPTY_LIST).toString());
    }
    
    @SuppressWarnings("unchecked")
    private void registerSideEffectAdvice (ExecutionContext ctx, String marker, Pointcut pointCut, boolean cacheable) {
        final List<ExpressionBase> toBeConcatenated = new ArrayList<ExpressionBase> ();
        
        toBeConcatenated.add (new LiteralExpression (marker, null));
        toBeConcatenated.add (new InvocationOnObjectExpression (new QualifiedName ("nextCounterValue"), Collections.EMPTY_LIST, true, null));
        toBeConcatenated.add (new LiteralExpression (" ", null));
        toBeConcatenated.add (ConcatAdviceFactory.createProceedExpression());
        
        final AroundAdvice advice = new AroundAdvice (new ConcatExpression (toBeConcatenated, null), pointCut, cacheable);
        advice.setFunctionDefContext (ctx.getFunctionDefContext());
        
        ctx.setAdviceContext (ctx.getAdviceContext().copyWithAdvice (advice));
    }        
}


