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

package org.eclipse.xpand.internal.tests.evaluate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.internal.xpand2.ast.Statement;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.output.InsertionPointSupport;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;

/**
 * *
 * 
 * @author Sven Efftinge (http://www.efftinge.de) *
 */
public class OutputStringImpl implements Output, InsertionPointSupport {
	private List<CharSequence> buffers = new ArrayList<CharSequence>();
	private Map<Statement, CharSequence> namedBuffers = new HashMap<Statement, CharSequence>();
	private CharSequence currentNamedBuffer = null;
	private CharSequence currentUnnamedBuffer;
    private StringBuffer buff = new StringBuffer();

    public OutputStringImpl () {
		buffers.add(new StringBuilder(4096));
		currentUnnamedBuffer = buffers.get(0);
    }
    
	private StringBuilder getCurrentBuffer() {
		return (StringBuilder) (currentNamedBuffer!=null ? currentNamedBuffer : currentUnnamedBuffer);
	}

    public void write(final byte[] bytes) {
        getCurrentBuffer().append(new String(bytes));
    }

    public void write(final String string) {
    	getCurrentBuffer().append(string);
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
    	StringBuilder result = new StringBuilder();
    	for (CharSequence buffer : buffers) {
    		result.append(buffer);
    	}
        return result.toString();
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
		throw new UnsupportedOperationException("This implementation does not support outlets");
	}

	public Outlet getOutlet(String name) {
		throw new UnsupportedOperationException("This implementation does not support outlets");
	}

	public void activateInsertionPoint(Statement stmt) {
		CharSequence buffer = namedBuffers.get(stmt);
		if (buffer == null) {
			throw new IllegalStateException ("Unknown insertion point "+stmt+".");
		}
		currentNamedBuffer = buffer;
	}

	public void deactivateInsertionPoint(Statement stmt) {
		if (currentNamedBuffer == null) {
			throw new IllegalStateException ("Insertion point for "+stmt+" was not activated.");
		}
		CharSequence buffer = namedBuffers.get(stmt);
		if (buffer == null) {
			throw new IllegalStateException ("Unknown insertion point "+stmt+".");
		}
		if (buffer != currentNamedBuffer) {
			throw new IllegalStateException ("Insertion point "+stmt+" is not the active one!");
		}
		currentNamedBuffer = null;
	}

	public void registerInsertionPoint(Statement stmt) {
		CharSequence namedBuffer = namedBuffers.get(stmt);
		if (namedBuffer == null) {
			namedBuffer = new StringBuilder();
			namedBuffers.put(stmt, namedBuffer);
		}
		
		buffers.add(namedBuffer);
		currentUnnamedBuffer = new StringBuilder();
		buffers.add(currentUnnamedBuffer);
	}    
    
}
