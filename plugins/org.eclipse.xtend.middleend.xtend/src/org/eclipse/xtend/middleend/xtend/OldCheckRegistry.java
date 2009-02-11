/*******************************************************************************
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.middleend.xtend;

import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.ast.ImportStatement;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.check.CheckUtils;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.plugins.ImportedResource;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.ParsedResource;
import org.eclipse.xtend.middleend.xtend.internal.OldHelper;
import org.eclipse.xtend.middleend.xtend.internal.TypeToBackendType;
import org.eclipse.xtend.middleend.xtend.internal.xtend.CheckConverter;
import org.eclipse.xtend.middleend.xtend.internal.xtend.OldExtensionConverter;
import org.eclipse.xtend.middleend.xtend.internal.xtendlib.XtendLibContributor;
import org.eclipse.xtend.typesystem.emf.check.CheckFileWithContext;

public class OldCheckRegistry implements LanguageSpecificMiddleEnd {

	private final ExecutionContext _ctx;

	private MiddleEnd _middleEnd;

	private BackendTypesystem _ts;

	public OldCheckRegistry(Object specificData) {
		if (specificData == null)
			throw new IllegalArgumentException(getName()
					+ " middle end is not initialized - will not contribute");

		_ctx = (ExecutionContext) specificData;
	}

	public boolean canHandle(String resourceName) {
        resourceName = OldHelper.normalizeCheckResourceName (resourceName);
        
        try {
            final ExtensionFile checkFile = (ExtensionFile) _ctx.getResourceManager().loadResource (resourceName,CheckUtils.FILE_EXTENSION);
            return checkFile != null;
        }
        catch (Exception exc) {
            return false;
        }
	}

	public String getName() {
		return "Check";
	}

	public ParsedResource parseResource(String checkFileName) {
		ParsedResource result = new ParsedResource();

		checkFileName = OldHelper.normalizeCheckResourceName(checkFileName);

		ExtensionFile checkFile = (ExtensionFile) _ctx.getResourceManager()
				.loadResource(checkFileName, CheckUtils.FILE_EXTENSION);
		if (checkFile == null)
			throw new IllegalArgumentException("could not find check file '"
					+ checkFile + "'");

		final ExecutionContext ctx = _ctx.cloneWithResource(checkFile);

		final TypeToBackendType typeConverter = new TypeToBackendType(_ts, ctx);
		final OldExtensionConverter extensionFactory = new OldExtensionConverter(
				ctx, typeConverter);

		for (Extension ext : checkFile.getExtensions())
			ext.init(ctx);

		// register the XtendLib. Do this first so the extension can override
		// functions
		result.getPrivateFunctions().addAll(
				new XtendLibContributor(_middleEnd).getContributedFunctions());

		result.getPrivateFunctions().add(
				new CheckConverter(ctx, typeConverter).createCheckFunction(_ts,
						checkFile));

		for (Extension ext : checkFile.getExtensions()) {
			final NamedFunction f = extensionFactory.createUnregistered(ext);
			if (ext.isPrivate())
				result.getPrivateFunctions().add(f);
			else
				result.getPublicFunctions().add(f);
		}

		for (ImportStatement imp : checkFile.getExtImports())
			result.getImports().add(
					new ImportedResource(OldHelper
							.normalizeXtendResourceName(imp.getImportedId()
									.getValue()), imp.isExported()));

		for (Around a : checkFile.getArounds())
			result.getAdvice().add(extensionFactory.create(a));

		return result;
	}

	public void setMiddleEnd(MiddleEnd middleEnd) {
		_middleEnd = middleEnd;
		_ts = middleEnd.getTypesystem();
	}

}
