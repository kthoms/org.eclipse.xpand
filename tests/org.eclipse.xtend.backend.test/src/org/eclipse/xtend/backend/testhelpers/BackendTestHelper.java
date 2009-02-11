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
package org.eclipse.xtend.backend.testhelpers;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.expr.LiteralExpression;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.middleend.MiddleEndFactory;
import org.eclipse.xtend.middleend.javaannotations.JavaFunctionClassContributor;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public class BackendTestHelper {
    public static final SourcePos SOURCE_POS = createSourcePos();
    
    /**
     * This method returns an ExecutionContext that is basically empty - no registered functions, and
     *  only the JavaBeansTypeSystem. It is useful for simple tests.
     */
    public static ExecutionContext createEmptyExecutionContext () {
        final BackendTypesystem ts = new CompositeTypesystem ();
        return BackendFacade.createExecutionContext (createEmptyFdc (ts), ts, true);
    }

    public static FunctionDefContextInternal createEmptyFdc (BackendTypesystem ts) {
        return (FunctionDefContextInternal) MiddleEndFactory.create (ts, null).getFunctions ("java/lang/Object");
    }
    
    public static FunctionDefContextInternal createFdc (BackendTypesystem ts, Class<?> contributingClass) {
        return (FunctionDefContextInternal) MiddleEndFactory.create (ts, null).getFunctions (JavaFunctionClassContributor.classAsResource (contributingClass));
    }
    
    public static ExpressionBase createLiteral (Object literal) {
        return new LiteralExpression (literal, SOURCE_POS);
    }
    
    public static SourcePos createSourcePos () {
        return new SourcePos ("<no file>", "<no callable>", 0);
    }
}
