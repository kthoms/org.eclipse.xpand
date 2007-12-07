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
package org.eclipse.internal.xpand2.ast;

import java.util.Arrays;
import java.util.List;


public abstract class StatementWithBody extends Statement{
	
    protected Statement[] body;

    public StatementWithBody(final Statement[] body) {
        this.body = body;
    }

    public Statement[] getBody() {
        return body;
    }

    public List<Statement> getBodyAsList() {
        return Arrays.asList(body);
    }
    
	@Override
	public void setContainingDefinition(AbstractDefinition definition) {
		super.setContainingDefinition(definition);
		for (Statement element : body) {
			element.setContainingDefinition(definition);
		}
	}
    
}
