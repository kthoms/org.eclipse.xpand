package org.eclipse.internal.xtend.xtend.parser;

@SuppressWarnings("serial")
public class ParseException extends RuntimeException {
	public ParseException(XtendError e) {
		super(e.toString());
	}
}
