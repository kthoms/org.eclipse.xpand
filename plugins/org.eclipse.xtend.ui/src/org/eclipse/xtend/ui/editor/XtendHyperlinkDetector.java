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
package org.eclipse.xtend.ui.editor;

import java.util.Collections;
import java.util.List;

import org.eclipse.internal.xtend.expression.ast.OperationCall;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.jface.text.IRegion;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.core.search.XtendXpandSearchEngine;
import org.eclipse.xtend.shared.ui.editor.navigation.AbstractHyperlinkDetector;
import org.eclipse.xtend.shared.ui.editor.navigation.GenericHyperlink;


/**
 * @author Darius Jockel - Initial contribution and API
 */
public class XtendHyperlinkDetector extends AbstractHyperlinkDetector {

	public XtendHyperlinkDetector(IEditorPart editor) {
		super(editor);
	}
	
	@Override
	protected List<GenericHyperlink> computeMatchesAndHyperlinks(IRegion hyperlinkRegion, String hyperlinkedWord,
			IXtendXpandProject project) {
		IXtendXpandResource resource = Activator.getExtXptModelManager().findExtXptResource(getFile());
		
		List<GenericHyperlink> links = createHyperlinkToImportedExtensions(resource, hyperlinkRegion, hyperlinkedWord);
		if (!links.isEmpty())
			return links;
		
		OperationCall expression = XtendXpandSearchEngine.findExpressionInExtensionFile(hyperlinkRegion, (ExtensionFile)resource.getExtXptResource());
		
		if (expression == null)
			return Collections.<GenericHyperlink>emptyList();
		
		return findExtensionMatches(hyperlinkRegion, hyperlinkedWord, project, resource, links, expression.getParams().length);
	}

	

}
