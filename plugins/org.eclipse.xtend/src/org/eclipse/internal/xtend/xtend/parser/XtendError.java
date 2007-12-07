package org.eclipse.internal.xtend.xtend.parser;

public interface XtendError {
	public int getStart();
	public int getEnd();
	public int getLine();
	public String getMessage();
}
