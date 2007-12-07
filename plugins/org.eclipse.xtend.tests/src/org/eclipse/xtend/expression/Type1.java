/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
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
