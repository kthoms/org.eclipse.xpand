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
public class Type2 extends Type1 implements Type3 {

    public static final String TYPE2_STRING_OBJECT = "Type2::String::Object";

    public static final String TYPE2_STRING_STRING = "Type2::String::String";

    @Override
    public String myOp(final String test, final Object test2) {
        return TYPE2_STRING_OBJECT;
    }

    public String myOp(final String test, final String test2) {
        return TYPE2_STRING_STRING;
    }
    
    public String getTest() {
    	return "bar";
    }
}
