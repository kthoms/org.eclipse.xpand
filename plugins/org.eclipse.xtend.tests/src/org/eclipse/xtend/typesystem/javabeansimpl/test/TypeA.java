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

package org.eclipse.xtend.typesystem.javabeansimpl.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class TypeA {

    public final static int TEST = 3;

    private String name;
    private List<TypeB> typeBs = new ArrayList<TypeB>();
    private TypeC[] arrayOfCs = new TypeC[0];

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public List<TypeB> getTypeBs() {
		return typeBs;
	}

	public void setTypeBs(List<TypeB> typeBs) {
		this.typeBs = typeBs;
	}

    public TypeC[] getArrayOfCs() {
		return arrayOfCs;
	}

	public void setArrayOfCs(TypeC[] arrayOfCs) {
		this.arrayOfCs = arrayOfCs;
	}

	public String toString () {
    	return getClass().getSimpleName()+"(name="+name+",typeBs=" + typeBs+",arrayOfCs="+arrayOfCs+")";
    }

}
