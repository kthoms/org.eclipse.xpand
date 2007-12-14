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

package org.eclipse.xtend.ui.core.internal.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.internal.xtend.xtend.parser.ExtensionFactory;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.shared.ui.ResourceContributorBase;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.ui.core.internal.XtendResourceImpl;
import org.eclipse.xtend.ui.internal.XtendLog;

public class XtendResourceParser extends ResourceContributorBase {
	@Override
	protected IXtendXpandResource createExtXptResource(Resource resource, IStorage source) {
		return new XtendResourceImpl((XtendFile)resource, source, this);
	}

	@Override
	public Resource parse(IStorage source, String fqn) {
		ExtensionFactory f = new ExtensionFactory(fqn);
		if (source instanceof IResource) {
			IResource res = (IResource) source;
			IJavaProject project = JavaCore.create(res.getProject());
			f = new PluginExtensionFactory(project,fqn);
		}
        return ParseFacade.file(createReader(source), fqn, getErrorHandler(source), f);
	}

	public String getFileExtension() {
        return XtendFile.FILE_EXTENSION;
    }

	@Override
	protected void logError(String message, Throwable t) {
		XtendLog.logError(message, t);
	}

	@Override
	protected void logInfo(String message) {
		XtendLog.logInfo(message);
	}
}
