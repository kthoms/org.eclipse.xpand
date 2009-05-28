/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.expression;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class Type1 {

    public static final String TYPE1_STRING_OBJECT = "Type1::String::Object";

    public static final String TYPE1_OBJECT_OBJECT = "Type1::Object::Object";

    public String myOp(final String test, final Object test2) {
        return TYPE1_STRING_OBJECT;
    }

    public String myOp(final Object test, final Object test2) {
        return TYPE1_OBJECT_OBJECT;
    }
    
    public String test() {
        return TYPE1_OBJECT_OBJECT;
    }
    
    public String getTest() {
    	return "foo";
    }
}
