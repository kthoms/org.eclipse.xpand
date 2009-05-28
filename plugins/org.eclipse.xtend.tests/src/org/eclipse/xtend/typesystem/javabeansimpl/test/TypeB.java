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

package org.eclipse.xtend.typesystem.javabeansimpl.test;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class TypeB extends TypeA implements TypeC {

    private String foreName;

    public String getForeName() {
        return foreName;
    }

    public void setForeName(final String foreName) {
        this.foreName = foreName;
    }

    public String computeWholeName() {
        return foreName + " " + getName();
    }

    public void testStuff(final Integer i) {

    }
    
    public TypeA getTypeA () { return new TypeA(); }

    public OAWTypeD getOAWTypeD () { return new OAWTypeD(); }

    public boolean isPrimitiveTypeFlag () { return true; }
    public void setPrimitiveTypeFlag (boolean flag) {};
    public boolean getIsPrimitiveTypeFlag () { return true; }
    
    public Boolean isWrapperTypeFlag () { return Boolean.TRUE; } 
    public void setWrapperTypeFlag (Boolean flag) {};
}
