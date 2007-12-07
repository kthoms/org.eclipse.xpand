/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xpand.ui.core.internal.builder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xpand2.parser.XpandParseFacade;
import org.eclipse.xpand.ui.core.internal.XpandResourceImpl;
import org.eclipse.xpand.ui.internal.XpandLog;
import org.eclipse.xpand2.XpandUtil;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.shared.ui.ResourceContributorBase;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;

public class XpandResourceParser extends ResourceContributorBase {
	@Override
	public Resource parse(IStorage source, String fqn) {
		Resource tpl = null;
		Reader reader = createReader(source);
		if (reader == null)
			return null;
		try {
			tpl = XpandParseFacade.file(reader, fqn, getErrorHandler(source));
		} finally {
			try {
				reader.close();
			} catch (final IOException e) {
				logError(e.getMessage(), e);
			}
		}
		if (tpl==null)
			return null;
		tpl.setFullyQualifiedName(fqn);
		return tpl;
	}

	@Override
	protected IXtendXpandResource createExtXptResource(Resource resource, IStorage source) {
		return new XpandResourceImpl((Template) resource, source, this);
	}

	@Override
	protected Reader createReader(IStorage resource) {
		InputStream in;
		Reader reader;
		try {
			in = resource.getContents();
		} catch (final CoreException e1) {
			XpandLog.logInfo(e1.getMessage());
			return null;
		}

		if (resource != null) {
			String fileEncoding = ResourcesPlugin.getEncoding();
			try {
				if (resource instanceof IFile) {
					fileEncoding = ((IFile)resource).getCharset();
				}
			} catch (CoreException e) {
				XpandLog
						.logError(
								"Could not get file encoding falling back to default...",
								e);
			}
			if (fileEncoding == null) {
				reader = new InputStreamReader(in);
			} else {
				try {
					reader = new InputStreamReader(in, fileEncoding);
				} catch (UnsupportedEncodingException e) {
					XpandLog.logError(
							"Unsupported encoding falling back to default...",
							e);
					reader = new InputStreamReader(in);
				}
			}
		} else {
			reader = new InputStreamReader(in);
		}
		return reader;
	}

	@Override
	protected void logError(String message, Throwable t) {
		XpandLog.logError(message, t);
	}

	@Override
	protected void logInfo(String message) {
		XpandLog.logInfo(message);
	}

	public String getFileExtension() {
		return XpandUtil.TEMPLATE_EXTENSION;
	}

}
