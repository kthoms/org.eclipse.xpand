/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xpand2.output;

import org.eclipse.internal.xpand2.ast.TextStatement;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.XpandExecutionContext;


/**
 * This output implementation avoids writing of unnecessary blank lines.  
 * @author Karsten Thoms
 * @since 4.1.2
 */
public class BlankLineSkippingOutput extends OutputImpl {
    private final static char NEWLINE = '\n';
    private StringBuffer buffer = null;
    private boolean evaluateLine = false;
    public void write(final String bytes) {
        if (current() != null) {
        	int idxNL = bytes.indexOf(NEWLINE);
        	if (buffer==null && idxNL>=0) {
        		buffer = new StringBuffer();
        		((StringBuffer) current().getBuffer()).append(bytes.substring(0, idxNL));
        		if (idxNL<bytes.length()) buffer.append(bytes.substring(idxNL));
        	} else if (buffer!=null && idxNL>=0) {
        		buffer.append(bytes.substring(0, idxNL));
        		if (evaluateLine && !buffer.toString().trim().equals("")) {
        		    ((StringBuffer) current().getBuffer()).append (buffer.toString());
        		}
        		buffer = null;
        		evaluateLine = false;
        		if (idxNL<bytes.length()) write(bytes.substring(idxNL));
        	} else if (buffer!=null) {
        		buffer.append(bytes);
        	} else {
        	    ((StringBuffer) current().getBuffer()).append(bytes);
            }
        }
    }

    public void closeFile() {
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
