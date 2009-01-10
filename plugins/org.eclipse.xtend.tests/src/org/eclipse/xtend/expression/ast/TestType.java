/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.expression.ast;

import java.util.Arrays;
import java.util.Collection;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class TestType {
    public Collection<String> getStrings () {
        return Arrays.asList("test");
    }
    
    public Collection<TestType> getList () {
        return Arrays.asList (this);
    }
    
    public Collection<String> strings() {
        return Arrays.asList("test");
    }

    public Collection<TestType> list() {
        return Arrays.asList(this);
    }
}
