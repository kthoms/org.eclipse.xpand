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
package org.eclipse.xpand.internal.tests.evaluate;

import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;

/**
 * *
 * 
 * @author Sven Efftinge (http://www.efftinge.de) *
 */
public class OutputStringImpl implements Output {
    StringBuffer buff = new StringBuffer();

    public void write(final byte[] bytes) {
        buff.append(new String(bytes));
    }

    public void write(final String string) {
        buff.append(string);
    }

    private SyntaxElement curr = null;

    public void pushStatement(final SyntaxElement stmt,XpandExecutionContext ctx) {
        curr = stmt;
    }

    public SyntaxElement popStatement() {
        return curr;
    }

    @Override
    public String toString() {
        return buff.toString();
    }

    public void openFile(final String path, final String fileMode) {
        // TODO Auto-generated method stub

    }

    public void closeFile() {
        // TODO Auto-generated method stub

    }

    public void setFileEncoding(final String encoding) {
        // TODO Auto-generated method stub

    }

	public void addOutlet(Outlet outlet) {
		// TODO Auto-generated method stub
		
	}
    
    
}
