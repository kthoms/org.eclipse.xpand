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

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.text.AbstractTextSearchResult;
import org.eclipse.search.ui.text.IEditorMatchAdapter;
import org.eclipse.search.ui.text.IFileMatchAdapter;
import org.eclipse.search.ui.text.Match;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.xtend.shared.ui.expression.editor.EditorImages;

/**
 * <code>XtendXpandSearchResult</code> contains a list of text-based matches for a
 * given query.
 * 
 * @author Peter Friese
 */
public class XtendXpandSearchResult extends AbstractTextSearchResult implements IEditorMatchAdapter, IFileMatchAdapter {

	private final XtendXpandSearchQuery query;

	private final Match[] EMPTY_ARR = new Match[0];

	/**
	 * Creates a new <code>XtendXpandSearchResult</code>.
	 * 
	 * @param query
	 *            The query that yielded this result.
	 */
	public XtendXpandSearchResult(XtendXpandSearchQuery query) {
		super();
		this.query = query;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IEditorMatchAdapter getEditorMatchAdapter() {
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IFileMatchAdapter getFileMatchAdapter() {
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	public ImageDescriptor getImageDescriptor() {
		return EditorImages.getImageDescriptor(EditorImages.SEARCH_REFERENCES);
	}

	/**
	 * {@inheritDoc}
	 */
	public String getLabel() {
		return query.getResultLabel(getMatchCount());
	}

	/**
	 * {@inheritDoc}
	 */
	public ISearchQuery getQuery() {
		return query;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getTooltip() {
		return getLabel();
	}

	/**
	 * {@inheritDoc}
	 */
	public Match[] computeContainedMatches(AbstractTextSearchResult result, IEditorPart editor) {
		IEditorInput ei = editor.getEditorInput();
		if (ei instanceof IFileEditorInput) {
			IFileEditorInput fi = (IFileEditorInput) ei;
			return getMatches(fi.getFile());
		}
		return EMPTY_ARR;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isShownInEditor(Match match, IEditorPart editor) {
		IEditorInput ei = editor.getEditorInput();
		if (ei instanceof IFileEditorInput) {
			IFileEditorInput fi = (IFileEditorInput) ei;
			return match.getElement().equals(fi.getFile());
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	public Match[] computeContainedMatches(AbstractTextSearchResult result, IFile file) {
		return getMatches(file);
	}

	/**
	 * {@inheritDoc}
	 */
	public IFile getFile(Object element) {
		if (element instanceof IFile) {
			return (IFile) element;
		}
		return null;
	}

}
