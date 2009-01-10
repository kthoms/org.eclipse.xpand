/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.internal.xtend.xtend.parser;


public class SyntaxError implements XtendError {
	private int start,end, line;
	private String message;
	
	
	public SyntaxError(int start, int end, int line, String message) {
		super();
		this.start = start;
		this.end = end;
		this.line = line;
		this.message = message;
	}
	public int getEnd() {
		return end;
	}
	public int getLine() {
		return line;
	}
	public String getMessage() {
		return message;
	}
	public int getStart() {
		return start;
	}
	
	@Override
	public String toString() {
		return getMessage()+" on line "+line;
	}
}
