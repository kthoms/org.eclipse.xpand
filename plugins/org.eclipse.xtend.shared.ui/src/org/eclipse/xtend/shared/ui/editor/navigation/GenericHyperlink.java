/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: committers of openArchitectureWare - initial API and
 * implementation
 ******************************************************************************/
package org.eclipse.xtend.shared.ui.editor.navigation;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtend.shared.ui.core.search.SearchMatch;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

/**
 * GenericHyperlink is used by Xtend editors to support hyperlinking and F3
 * lookup.
 * 
 * @author Peter Friese
 * @author Sven Efftinge (http://www.efftinge.de)
 */
public class GenericHyperlink implements IHyperlink {

	protected final String identifierString;
	protected final IRegion region;
	protected final IWorkbenchPage workbenchPage;
	protected final SearchMatch searchMatch;

	/**
	 * Creates a new Generic hyperlink.
	 */
	public GenericHyperlink(final IWorkbenchPage workbenchPage, final SearchMatch searchMatch, final IRegion region,
			final String identifierString) {
		Assert.isNotNull(workbenchPage);
		Assert.isNotNull(identifierString);
		Assert.isNotNull(region);
		this.workbenchPage = workbenchPage;
		this.region = region;
		this.identifierString = identifierString;
		this.searchMatch = searchMatch;
	}

	/**
	 * {@inheritDoc}
	 */
	public void open() {
		try {
			if (searchMatch.getFile() != null) {
				final IEditorPart opened = IDE.openEditor(workbenchPage, searchMatch.getFile());
				if (opened instanceof ITextEditor) {
					((ITextEditor) opened).selectAndReveal(searchMatch.getOffSet(), searchMatch.getLength());
				}
			}
		}
		catch (final PartInitException e) {
			XtendLog.logError(e);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public String getTypeLabel() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getHyperlinkText() {
		return identifierString;
	}

	/**
	 * {@inheritDoc}
	 */
	public IRegion getHyperlinkRegion() {
		return region;
	}

	/**
	 * @return The hyperlink text.
	 */
	public String getIdentifierString() {
		return identifierString;
	}

	@Override
	public String toString() {
		String result = "Hyperlink (" + identifierString + ")";
		if (searchMatch != null) {
			result += " [" + searchMatch.getOffSet() + ", " + searchMatch.getLength() + "]";
		}
		return "Hyperlink (" + identifierString + ")";
	}

}
