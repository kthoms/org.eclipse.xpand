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
 * @author Bernd Kolb
 */
public class Case extends SyntaxElement {
    private Expression condition;

    private Expression thenPart;

    public Case(final Expression condition, final Expression part) {
        this.condition = condition;
        thenPart = part;
    }

    public Expression getCondition() {
        return condition;
    }

    public Expression getThenPart() {
        return thenPart;
    }
    
    @Override
    public String toString() {
    	return "case " + condition.toString();
    }

}
