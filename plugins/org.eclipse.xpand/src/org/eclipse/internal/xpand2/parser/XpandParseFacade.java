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
package org.eclipse.internal.xpand2.parser;

import java.io.IOException;
import java.io.Reader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xtend.xtend.parser.ErrorHandler;
import org.eclipse.internal.xtend.xtend.parser.XtendError;
import org.eclipse.internal.xtend.xtend.parser.ParseException;
import org.eclipse.internal.xtend.xtend.parser.SyntaxError;

public final class XpandParseFacade {
	private XpandParseFacade() {
	}
	
	public static Template file(Reader r, String fileName) {
		return file(r,fileName,null);
	}

	public static Template file(Reader r, String fileName,
			ErrorHandler handler) {
		ANTLRReaderStream readerStream;
		try {
			readerStream = new ANTLRReaderStream(r);
		} catch (IOException e2) {
			throw new RuntimeException(e2);
		}
		final ErrorHandler h = getErrorHandler(handler);
		try {
			return getParser(fileName, readerStream, h).template();
		} catch (final RecognitionException e) {
			h.handleError(createError(e, ""));
		}
		return null;
	}

	private static XpandLocationAddingParser getParser(String fileName, ANTLRReaderStream readerStream, final ErrorHandler h) {
		XpandLexer lex = new XpandLexer(readerStream) {
			@Override
			public void reportError(RecognitionException e) {
				h.handleError(createError(e, this.getErrorMessage(e, this
						.getTokenNames())));
			}
		};

		CommonTokenStream str = new CommonTokenStream();
		str.setTokenSource(lex);
		XpandLocationAddingParser parser = new XpandLocationAddingParser(str,
				fileName) {
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
			return new SyntaxError(t.getStartIndex(), t.getStopIndex(), t
					.getLine(), string);
		}
	}
}
