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
