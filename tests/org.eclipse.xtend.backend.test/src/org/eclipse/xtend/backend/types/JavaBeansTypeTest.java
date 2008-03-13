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

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyExecutionContext;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.testhelpers.BeanWithSizeProperty;
import org.junit.Test;

/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class JavaBeansTypeTest {
    @Test public void testInvokeWithConversion () {
        final ExecutionContext ctx = createEmptyExecutionContext();
        
        assertEquals ("asdfabc7 - 2", ctx.getFunctionDefContext().invoke (ctx, "myFunction", Arrays.asList(new BeanWithSizeProperty(7), "abc", 5L)));
    }
    
    @Test public void testUniqueIdentifier () {
        final BackendTypesystem ts = new CompositeTypesystem ();
        
        final BackendType byClass = ts.findType (BeanWithSizeProperty.class);
        final BackendType byIdentifier = ts.findType ("{javabean}" + BeanWithSizeProperty.class.getName());
        assertSame (byClass, byIdentifier);
        
        assertEquals ("{javabean}" + BeanWithSizeProperty.class.getName(), byClass.getUniqueRepresentation());
    }
}
