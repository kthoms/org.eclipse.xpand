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

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.SOURCE_POS;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyExecutionContext;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.eclipse.xtend.backend.testhelpers.CheckEvaluationExpression;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class SequenceExpressionTest {
    @Test public void testLogic () {
        final CheckEvaluationExpression first = new CheckEvaluationExpression ("a");
        final CheckEvaluationExpression second = new CheckEvaluationExpression ("b");
        final CheckEvaluationExpression third = new CheckEvaluationExpression ("c");
        
        final SequenceExpression se = new SequenceExpression (Arrays.asList(first, second, third), SOURCE_POS);
        
        assertEquals ("c", se.evaluate (createEmptyExecutionContext()));
        assertEquals (1, first._evalCounter);
        assertEquals (1, second._evalCounter);
        assertEquals (1, third._evalCounter);
    }
    
}
