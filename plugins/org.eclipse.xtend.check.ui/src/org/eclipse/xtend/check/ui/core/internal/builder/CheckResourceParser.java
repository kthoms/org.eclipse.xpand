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
package org.eclipse.xtend.check.ui.core.internal.builder;

import org.eclipse.core.resources.IStorage;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.xtend.check.CheckUtils;
import org.eclipse.xtend.check.ui.core.internal.CheckResourceImpl;
import org.eclipse.xtend.check.ui.internal.CheckLog;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.shared.ui.ResourceContributorBase;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;

public class CheckResourceParser extends ResourceContributorBase {

	public String getFileExtension() {
		return CheckUtils.FILE_EXTENSION;
	}

	@Override
	public Resource parse(IStorage source, String fqn) {
        return ParseFacade.file(createReader(source), fqn, getErrorHandler(source));
	}

	@Override
	protected IXtendXpandResource createExtXptResource(Resource resource, IStorage source) {
		CheckResourceImpl result = null;
		result = new CheckResourceImpl((XtendFile) resource, source,this);
		return result;
	}

	@Override
	protected void logError(String message, Throwable t) {
		CheckLog.logError(message, t);
	}

	@Override
	protected void logInfo(String message) {
		CheckLog.logInfo(message);
	}

}
