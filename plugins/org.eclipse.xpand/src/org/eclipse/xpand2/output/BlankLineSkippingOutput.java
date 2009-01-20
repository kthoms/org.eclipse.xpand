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
package org.eclipse.xpand2.output;

import org.eclipse.internal.xpand2.ast.TextStatement;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.XpandExecutionContext;


/**
 * This output implementation avoids writing of unnecessary blank lines.  
 * @author Karsten Thoms
 */
public class BlankLineSkippingOutput extends OutputImpl {
    private final static char NEWLINE = '\n';
    private StringBuffer buffer = null;

    private boolean evaluateLine = false;
    
    /**
     * {@inheritDoc}
     */
    public void write(final String bytes) {
        if (current() != null) {
        	int idxNL = bytes.indexOf(NEWLINE);
        	if (buffer==null && idxNL>=0) { // No buffer yet; String contains newline
        		buffer = new StringBuffer();
        		// append string until the newline character
        		((StringBuffer) current().getBuffer()).append(bytes.substring(0, idxNL));
        		// append the rest
        		if (idxNL<bytes.length()) buffer.append(bytes.substring(idxNL));
        	} else if (buffer!=null && idxNL>=0) { // buffer exists; String contains newline
        		// append string until the newline character
        		buffer.append(bytes.substring(0, idxNL));
        		if (evaluateLine && !buffer.toString().trim().equals("")) {
        		    ((StringBuffer) current().getBuffer()).append (buffer.toString());
        		}
        		buffer = null;
        		evaluateLine = false;
        		if (idxNL<bytes.length()) write(bytes.substring(idxNL));
        	} else if (buffer!=null) {
        		// String does not contain newline, so just append
        		buffer.append(bytes);
        	} else {
        		// we are not buffering yet and string does not contain newlines, so just 
        		// append the string to the original output buffer
        	    ((StringBuffer) current().getBuffer()).append(bytes);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void closeFile() {
    	// append the buffer
    	if (buffer!=null && current()!=null) {
    	    ((StringBuffer) current().getBuffer()).append(buffer);
    		buffer=null;
    	}
        super.closeFile();
    }

	@Override
	public void pushStatement(SyntaxElement stmt, XpandExecutionContext ctx) {
		if (buffer!=null && !(stmt instanceof TextStatement)) {
			evaluateLine = true;
		}
		super.pushStatement(stmt, ctx);
	}
    
    
}
