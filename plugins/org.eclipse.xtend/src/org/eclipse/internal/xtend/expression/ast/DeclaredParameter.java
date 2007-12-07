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
package org.eclipse.internal.xtend.expression.ast;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class DeclaredParameter extends SyntaxElement {

    private Identifier type;

    private Identifier name;

    public DeclaredParameter(final Identifier type,
            final Identifier name) {
        this.type = type;
        this.name = name;
    }

    public Identifier getName() {
        return name;
    }

    public Identifier getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.getValue() + " " + name.getValue();
    }
}
