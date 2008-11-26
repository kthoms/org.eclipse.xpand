/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.editor.search.query;

import java.util.List;

import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.search.SearchMatch;
import org.eclipse.xtend.shared.ui.core.search.XtendXpandSearchEngine;

/**
 * <code>OawSearchReferencesQuery</code> performs a query for references of a
 * given identifier.
 * 
 * @author Peter Friese
 */
public class OawSearchReferencesQuery extends OawSearchQuery {

	/**
	 * Creates a new <code>OawSearchReferencesQuery</code>.
	 * 
	 * @param project
	 *            The project to operate on.
	 * @param identifier
	 *            The identifier to look for.
	 */
	public OawSearchReferencesQuery(IXtendXpandProject project, String identifier) {
		super(project, identifier);
	}

	@Override
	protected List<SearchMatch> performSearch() {
		List<SearchMatch> matches = XtendXpandSearchEngine.findReferences(getProject(), getIdentifier());
		return matches;
	}
}
