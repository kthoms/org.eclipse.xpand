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
