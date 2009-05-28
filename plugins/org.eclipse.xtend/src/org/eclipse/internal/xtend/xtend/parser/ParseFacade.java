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
package org.eclipse.internal.xtend.xtend.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;

public final class ParseFacade {
	private ParseFacade() {
	}
	
	public static Expression expression(String r) {
		return expression(new StringReader(r),null);
	}

	public static Expression expression(Reader r,
			ErrorHandler handler) {
		ANTLRReaderStream readerStream;
		try {
			readerStream = new ANTLRReaderStream(r);
		} catch (IOException e2) {
			throw new RuntimeException(e2);
		}
		final ErrorHandler h = getErrorHandler(handler);
		try {
			return getParser(new ExtensionFactory("nofile"), readerStream, h).expression();
		} catch (final RecognitionException e) {
			h.handleError(createError(e, ""));
		}
		return null;
	}
	
	public static ExtensionFile file(Reader r, String fileName) {
		return file(r,fileName,null);
	}
	
	public static ExtensionFile file(Reader r, String fileName,
			ErrorHandler handler) {
		return file(r,fileName,handler,null);
	}

	public static ExtensionFile file(Reader r, String fileName,
			ErrorHandler handler, ExtensionFactory factory) {
		if (factory == null)
			factory = new ExtensionFactory(fileName);
		ANTLRReaderStream readerStream;
		try {
			readerStream = new ANTLRReaderStream(r);
		} catch (IOException e2) {
			throw new RuntimeException(e2);
		}
		final ErrorHandler h = getErrorHandler(handler);
		try {
			return getParser(factory, readerStream, h).file();
		} catch (final RecognitionException e) {
			h.handleError(createError(e, ""));
		}
		return null;
	}

	private static XtendLocationAddingParser getParser(ExtensionFactory factory, ANTLRReaderStream readerStream, final ErrorHandler h) {
		XtendLexer lex = new XtendLexer(readerStream) {
			@Override
			public void reportError(RecognitionException e) {
				h.handleError(createError(e, this.getErrorMessage(e, this
						.getTokenNames())));
			}
		};

		CommonTokenStream str = new CommonTokenStream();
		str.setTokenSource(lex);
		XtendLocationAddingParser parser = new XtendLocationAddingParser(str,
				factory) {
			@Override
			public void reportError(RecognitionException e) {
				h.handleError(createError(e, this.getErrorMessage(e, this
						.getTokenNames())));
			}
		};
		return parser;
	}

	private static ErrorHandler getErrorHandler(ErrorHandler handler) {
		if (handler == null)
			handler = new ErrorHandler() {

				public void handleError(XtendError e) {
					throw new ParseException(e);
				}
			};
		final ErrorHandler h = handler;
		return h;
	}

	protected static XtendError createError(RecognitionException e, String string) {
		if (e.token == null) {
			return new SyntaxError(e.index, e.line, e.index + 1, string);
		} else {
			CommonToken t = (CommonToken) e.token;
			return new SyntaxError(t.getStartIndex(), t.getStopIndex() + 1, t
					.getLine(), string);
		}
	}
}
