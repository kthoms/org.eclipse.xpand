/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.check;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;

import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.xtend.expression.ExecutionContext;

public class CheckFacade {

	public final static void checkAll(final String checkFile, final Collection<?> toCheck, final ExecutionContext ctx, final Issues issues) {
		checkAll(checkFile, toCheck, ctx, issues, false);
	}

	public final static void checkAll(final String checkFile, final InputStream in, final Collection<?> toCheck, final ExecutionContext ctx,
			final Issues issues) {
		checkAll(checkFile,in, toCheck, ctx, issues, false);
	}
	
	public final static void checkAll(final String checkFile, final InputStream in, final Collection<?> toCheck, final ExecutionContext ctx,
			final Issues issues, boolean warnIfNothingChecked) {
		if (in == null)
			throw new ConfigurationException("Couldn't find check file :'" + checkFile + "'");
		ExtensionFile file = ParseFacade.file(new InputStreamReader(in), checkFile);
		file.check(ctx, toCheck, issues, warnIfNothingChecked);
	}

	public final static void checkAll(final String checkFile, final Collection<?> toCheck, final ExecutionContext ctx, final Issues issues,
			boolean warnIfNothingChecked) {
		ExtensionFile file =  (ExtensionFile) ctx.getResourceManager().loadResource(checkFile, "chk");
		if (file != null) {
			file.check(ctx, toCheck, issues, warnIfNothingChecked);
		} else {
			issues.addError("Could not load Check file '"+checkFile+"'.");
		}
	}
}
