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

package org.eclipse.xtend.typesystem.impl.oawclassic;

public class OawClassicMetaType {
    public String field;

    public void setField(final String field) {
        this.field = field;
    }

    public String Field() {
        return field;
    }

    public Integer myOperation(final String txt) {
        return new Integer(txt.length());
    }
}
