/**
 * <copyright> 
 *
 * Copyright (c) 2002-2007 Kolbware and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Kolbware, Bernd Kolb - Initial API and implementation
 *
 * </copyright>
 *
 */
package org.eclipse.xtend.middleend.internal.xpand3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipose.xtend.middleend.MiddleEnd;
import org.eclipose.xtend.middleend.MiddleEndFactory;
import org.eclipse.xand3.analyzation.AnalyzeContext;
import org.eclipse.xpand3.File;
import org.eclipse.xpand3.declaration.Extension;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExpressionBase;

/**
 * @author Bernd Kolb
 * 
 */
public class XtendBackendFacade {

	private MiddleEnd middleEnd;
	private BackendTypeConverter typeConverter;
	private AnalyzeContext ctx;
	private final String extensionFile;

	public XtendBackendFacade(String extensionFile) {
		this.extensionFile = extensionFile;
		middleEnd = MiddleEndFactory.create(findBackendTypeSystem(), Collections.EMPTY_MAP);

		// TODO: To be impl
		typeConverter = null;
		ctx = null;
	}

	private BackendTypesystem findBackendTypeSystem() {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public static Object evaluateExpression(String extensionFile, String expression, Map<String, Object> localVars) {
		return createForFile(extensionFile).evaluateExpression(expression, localVars);
	}

	private static XtendBackendFacade createForFile(String extensionFile) {
		return new XtendBackendFacade(extensionFile);
	}

	private Object evaluateExpression(String expression, Map<String, Object> localVars) {
		if (localVars == null)
			localVars = new HashMap<String, Object>();
		File f = parse();

		Extension ext = ctx.findExtension(expression, f.getDeclarations());
		ExpressionBase expr = new XtendFrontendASTConverter(ctx, typeConverter, extensionFile
				+ SyntaxConstants.NS_DELIM + ext.getName().getValue()).convert(ext);

		return expr.evaluate(middleEnd.getExecutionContext());
	}

	private File parse() {
		// TODO: To be impl
		throw new UnsupportedOperationException("Not yet impl");
	}
}
