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

import org.eclipse.jface.text.IRegion;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.search.SearchMatch;
import org.eclipse.xtend.shared.ui.core.search.XtendXpandSearchEngine;

/**
 * GenericHyperlinkDetector is used to detect hyperlinkable words inside Xtend
 * editors.
 * 
 * @author Peter Friese
 * @author Darius Jockel
 */
public class GenericHyperlinkDetector extends AbstractHyperlinkDetector {

	public GenericHyperlinkDetector(IEditorPart editor) {
		super(editor);
	}

	@Override
	protected List<GenericHyperlink> computeMatchesAndHyperlinks(IRegion hyperlinkRegion, String hyperlinkedWord,
			IXtendXpandProject project) {
		List<SearchMatch> matches = XtendXpandSearchEngine.findDeclarations(project, hyperlinkedWord);
		List<GenericHyperlink> links = new ArrayList<GenericHyperlink>();
		for (SearchMatch searchMatch : matches) {
			GenericHyperlink genericHyperlink = new GenericHyperlink(getWorkbenchPage(), searchMatch,
					hyperlinkRegion, hyperlinkedWord);
			links.add(genericHyperlink);
		}
		return links;
	}


}
