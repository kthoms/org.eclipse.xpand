/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.typesystem.impl.javabeans;

public class JavaBeansMetaType {
	class InnerJavaBeansMetaType {
		private String innerProp;

		public void setInnerProp(String innerProp) {
			this.innerProp = innerProp;
		}

		public String getInnerProp() {
			return innerProp;
		}
		
	}
    private String myProp;

    public String getMyProp() {
        return myProp;
    }

    public void setMyProp(final String myProp) {
        this.myProp = myProp;
    }
}
