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
package org.eclipse.xtend.backend.common;

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyExecutionContext;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createLiteral;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createSourcePos;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public class ExpressionBaseTest {
    private final List<String> _log = new ArrayList<String> ();
    
    @Before
    public void init () {
        _log.clear ();
    }
    
    private class TestingExecutionListener implements ExecutionListener {
        private final String _id;
        private final Object _vetoValue;
        
        public TestingExecutionListener (String id, Object vetoValue) {
            _id = id;
            _vetoValue = vetoValue;
        }

        public void preExecute (ExecutionContext ctx, ExpressionBase originator) throws EvaluationVetoException {
            _log.add("pre" + _id);
            if (_vetoValue != null)
                throw new EvaluationVetoException (_vetoValue);
        }
        
        public void postExecute (Object result, ExecutionContext ctx, ExpressionBase originator) {
            _log.add ("post" + _id);
        }
    }
    
    
    
    @Test
    public void testVeto () {
        final ExpressionBase expr = new ExpressionBase (createSourcePos()) {

            @Override
            protected Object evaluateInternal (ExecutionContext ctx) {
                ExpressionBaseTest.this._log.add ("evaluated");
                return null;
            }
        };
        
        expr.registerExecutionListener (new TestingExecutionListener ("First", "veto1"));
        expr.registerExecutionListener (new TestingExecutionListener ("Second", "veto2"));
        
        assertEquals ("veto1", expr.evaluate (createEmptyExecutionContext()));
        assertEquals (Arrays.asList ("preFirst"), _log);
        
    }
    
    
    @Test 
    public void testExecutionListener () {
        final ExpressionBase expr = createLiteral ("a");

        expr.registerExecutionListener (new TestingExecutionListener ("First", null));
        expr.registerExecutionListener (new TestingExecutionListener ("Second", null));
        
        expr.evaluate (createEmptyExecutionContext());
        
        assertEquals (Arrays.asList ("preFirst", "preSecond", "postSecond", "postFirst"), _log);
    }
}
