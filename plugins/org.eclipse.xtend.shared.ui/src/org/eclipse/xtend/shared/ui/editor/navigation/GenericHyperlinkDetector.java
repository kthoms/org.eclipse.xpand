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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.jface.text.hyperlink.IHyperlinkDetector;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.search.XtendXpandSearchEngine;
import org.eclipse.xtend.shared.ui.core.search.SearchMatch;

/**
 * GenericHyperlinkDetector is used to detect hyperlinkable words inside oAW
 * editors.
 * 
 * @author Peter Friese
 */
public class GenericHyperlinkDetector implements IHyperlinkDetector {

	private final IEditorPart editor;

	public GenericHyperlinkDetector(IEditorPart editor) {
		this.editor = editor;
	}

	/**
	 * {@inheritDoc}
	 */
	public IHyperlink[] detectHyperlinks(ITextViewer textViewer, IRegion region, boolean canShowMultipleHyperlinks) {
		if (region == null || textViewer == null) {
			return null;
		}

		// get hyperlinked region
		IRegion hyperlinkRegion = getHyperlinkRegion(textViewer, region.getOffset());
		if (hyperlinkRegion == null) {
			return null;
		}

		// get the word that is hyperlinked
		String hyperlinkedWord = textViewer.getDocument().get().substring(hyperlinkRegion.getOffset(),
				hyperlinkRegion.getOffset() + hyperlinkRegion.getLength());

		IXtendXpandProject project = getOawProject();
		if (project != null) {
			List<SearchMatch> matches = XtendXpandSearchEngine.findDeclarations(project, hyperlinkedWord);
			List<GenericHyperlink> links = new ArrayList<GenericHyperlink>();
			for (SearchMatch searchMatch : matches) {
				GenericHyperlink genericHyperlink = new GenericHyperlink(getWorkbenchPage(), searchMatch,
						hyperlinkRegion, hyperlinkedWord);
				links.add(genericHyperlink);
			}
			if (canShowMultipleHyperlinks) {
				return links.toArray(new IHyperlink[links.size()]);
			} else if (!links.isEmpty()) {
				return new IHyperlink[] { links.get(0) };
			}
		}
		return null;
	}

	private IWorkbenchPage getWorkbenchPage() {
		return editor.getSite().getWorkbenchWindow().getActivePage();
	}

	private IXtendXpandProject getOawProject() {
		IFile file = getFile();
		if (file == null) {
			return null;
		}
		return Activator.getExtXptModelManager().findProject(file);
	}

	private IFile getFile() {
		return (IFile) editor.getEditorInput().getAdapter(IFile.class);
	}

	/**
	 * Given a text viewer and an offset (i.e. the current cursor position),
	 * analyses the region around this location in order to find the word under
	 * the cursor.
	 * 
	 * @param textViewer
	 *            The underlying text viewer.
	 * @param offset
	 *            The cursor location.
	 * @return The document region defining the hyperlinked word.
	 */
	private IRegion getHyperlinkRegion(ITextViewer textViewer, int offset) {
		String currDoc = textViewer.getDocument().get();

		// special handling if cursor is located at end of document
		if (offset == currDoc.length()) {
			return null;
		}

		// find word start
		int start = offset;
		while (start > -1 && WordDetector.isWordPart(currDoc.charAt(start))) {
			start--;
		}

		// find word end
		start++;
		int end = offset;
		while (end < currDoc.length() && WordDetector.isWordPart(currDoc.charAt(end))) {
			end++;
		}

		if (start < 0) {
			start = 0;
		}

		if (end < start) {
			end = start;
		}

		return new Region(start, end - start);
	}

}
