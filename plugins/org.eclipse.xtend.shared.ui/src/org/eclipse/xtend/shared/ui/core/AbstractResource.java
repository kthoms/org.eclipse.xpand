/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandMarkerManager;

public abstract class AbstractResource implements IXtendXpandResource {
	private class StubResource implements Resource {
		private String fullyQualifiedName;

		public String getFullyQualifiedName() {
			return fullyQualifiedName;
		}

		public String[] getImportedExtensions() {
			return new String[0];
		}

		public String[] getImportedNamespaces() {
			return new String[0];
		}

		public void setFullyQualifiedName(String fqn) {
			this.fullyQualifiedName = fqn;
		}

	}

	private IStorage underlyingFile;

	private Resource resource;

	protected AbstractResource(final IStorage res) {
		underlyingFile = res;
	}

	public void setExtXptResource(final Resource res) {
		resource = res;
	}

	public Resource getExtXptResource() {
		if (resource == null)
			resource = new StubResource();
		return resource;
	}

	public IStorage getUnderlyingStorage() {
		return underlyingFile;
	}

	public String getFullyQualifiedName() {
		return getExtXptResource().getFullyQualifiedName();
	}

	public String[] getImportedNamespaces() {
		return getExtXptResource().getImportedNamespaces();
	}

	public void setFullyQualifiedName(final String fqn) {
		getExtXptResource().setFullyQualifiedName(fqn);
	}

	public String[] getImportedExtensions() {
		return getExtXptResource().getImportedExtensions();
	}

	private boolean hasSemanticErrors = false;

	public final void analyze(ExecutionContext ctx) {
		if (getUnderlyingStorage() instanceof IFile) {
			IFile f = (IFile) getUnderlyingStorage();
			final Set<AnalysationIssue> issues = new HashSet<AnalysationIssue>();
			analyze(ctx, issues);
			if (hasSemanticErrors) {
				XtendXpandMarkerManager.deleteMarkers(f);
			}
			hasSemanticErrors = !issues.isEmpty();
			for (final Iterator<AnalysationIssue> iterator = issues.iterator(); iterator.hasNext();) {
				XtendXpandMarkerManager.addMarker(f, iterator.next());
			}
		}
	}

	protected abstract void analyze(ExecutionContext ctx, Set<AnalysationIssue> issues);

	public final boolean refresh() {
		return internalRefresh();
	}

	protected abstract boolean internalRefresh();

}
