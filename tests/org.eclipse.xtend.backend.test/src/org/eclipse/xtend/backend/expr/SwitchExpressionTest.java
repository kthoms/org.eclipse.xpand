/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.expr;

import static org.eclipse.xtend.backend.helpers.BackendTestHelper.SOURCE_POS;
import static org.eclipse.xtend.backend.helpers.BackendTestHelper.createEmptyExecutionContext;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipose.xtend.middleend.FunctionDefContextFactory;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.FunctionDefContextImpl;
import org.eclipse.xtend.backend.helpers.CheckEvaluationExpression;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.types.builtin.StringType;
import org.eclipse.xtend.backend.util.Pair;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class SwitchExpressionTest {
    
    @Test public void testLogic () {
        final CheckEvaluationExpression switchExpr = new CheckEvaluationExpression ("a");
        
        final CheckEvaluationExpression caseAExpr = new CheckEvaluationExpression ("a"); 
        final CheckEvaluationExpression valueAExpr = new CheckEvaluationExpression ("aValue"); 
        
        final CheckEvaluationExpression caseBExpr = new CheckEvaluationExpression ("b"); 
        final CheckEvaluationExpression valueBExpr = new CheckEvaluationExpression ("bValue"); 
        
        final CheckEvaluationExpression defaultExpr = new CheckEvaluationExpression ("defaultValue");
        
        final List<Pair<ExpressionBase, ExpressionBase>> cases = new ArrayList<Pair<ExpressionBase,ExpressionBase>> ();
        cases.add (new Pair<ExpressionBase, ExpressionBase> (caseAExpr, valueAExpr));
        cases.add (new Pair<ExpressionBase, ExpressionBase> (caseBExpr, valueBExpr));
        
        final SwitchExpression expr = new SwitchExpression (switchExpr, cases, defaultExpr, SOURCE_POS);
        
        assertEquals ("aValue", expr.evaluate (createEmptyExecutionContext()));
        assertEquals (1, switchExpr._evalCounter);
        assertEquals (1, caseAExpr._evalCounter);
        assertEquals (1, valueAExpr._evalCounter);
        assertEquals (0, caseBExpr._evalCounter);
        assertEquals (0, valueBExpr._evalCounter);
        assertEquals (0, defaultExpr._evalCounter);
        
        switchExpr._value = "b";
        assertEquals ("bValue", expr.evaluate (createEmptyExecutionContext()));
        assertEquals (2, switchExpr._evalCounter);
        assertEquals (2, caseAExpr._evalCounter);
        assertEquals (1, valueAExpr._evalCounter);
        assertEquals (1, caseBExpr._evalCounter);
        assertEquals (1, valueBExpr._evalCounter);
        assertEquals (0, defaultExpr._evalCounter);
        
        switchExpr._value = "c";
        assertEquals ("defaultValue", expr.evaluate (createEmptyExecutionContext()));
        assertEquals (3, switchExpr._evalCounter);
        assertEquals (3, caseAExpr._evalCounter);
        assertEquals (1, valueAExpr._evalCounter);
        assertEquals (2, caseBExpr._evalCounter);
        assertEquals (1, valueBExpr._evalCounter);
        assertEquals (1, defaultExpr._evalCounter);
        
        switchExpr._value = null;
        assertEquals ("defaultValue", expr.evaluate (createEmptyExecutionContext()));
        assertEquals (4, switchExpr._evalCounter);
        assertEquals (4, caseAExpr._evalCounter);
        assertEquals (1, valueAExpr._evalCounter);
        assertEquals (3, caseBExpr._evalCounter);
        assertEquals (1, valueBExpr._evalCounter);
        assertEquals (2, defaultExpr._evalCounter);
    }

    @Test public void testUsesOperatorEquals () {
        final CheckEvaluationExpression switchExpr = new CheckEvaluationExpression ("xyz");
        
        final CheckEvaluationExpression caseAExpr = new CheckEvaluationExpression ("a"); 
        final CheckEvaluationExpression valueAExpr = new CheckEvaluationExpression ("aValue"); 
        
        final CheckEvaluationExpression defaultExpr = new CheckEvaluationExpression ("defaultValue");
        
        final List<Pair<ExpressionBase, ExpressionBase>> cases = new ArrayList<Pair<ExpressionBase,ExpressionBase>> ();
        cases.add (new Pair<ExpressionBase, ExpressionBase> (caseAExpr, valueAExpr));
        
        final SwitchExpression expr = new SwitchExpression (switchExpr, cases, defaultExpr, SOURCE_POS);

        
        // register an equals function that returns "true" for any two strings
        final NamedFunction myStringEquals = new NamedFunction ("operatorEquals", new Function () {

            public ExpressionBase getGuard () {
                return null;
            }

            public List<? extends BackendType> getParameterTypes () {
                return Arrays.asList(StringType.INSTANCE, StringType.INSTANCE);
            }

            public Object invoke (ExecutionContext ctx, Object[] params) {
                System.err.println ("!!!");
                return true;
            }

            public boolean isCached () {
                return false;
            }            
        });
        
        final FunctionDefContextImpl fdc = new FunctionDefContextFactory (new CompositeTypesystem ()).create();
        fdc.register (myStringEquals);
        
        final ExecutionContext ctx = createEmptyExecutionContext();
        assertEquals ("defaultValue", expr.evaluate (ctx));
        
        ctx.setFunctionDefContext(fdc);
        assertEquals ("aValue", expr.evaluate (ctx));
    }
}





