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
package org.eclipse.xtend.typesystem.baseimpl.types;

public class MyClass {
    private MyEnum _myEnum;
    private String _myStringAttribute;

    public MyEnum getMyEnum() {
        return _myEnum;
    }

    public void setMyEnum(MyEnum myEnum) {
        _myEnum = myEnum;
    }

    public String getMyStringAttribute() {
        return _myStringAttribute;
    }

    public void setMyStringAttribute(String myStringAttribute) {
        _myStringAttribute = myStringAttribute;
    }
}
