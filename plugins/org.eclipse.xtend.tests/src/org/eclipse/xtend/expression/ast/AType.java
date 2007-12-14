/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.expression.ast;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class AType {
    public final static String TEST = "TEST";

    private String test = "myTestProp";

    public String getTest() {
        return test;
    }

    public void setTest(final String test) {
        this.test = test;
    }

    public String myOperation() {
        return "hallo test";
    }

    public Integer myOperation(final String param) {
        return new Integer(4);
    }
}
