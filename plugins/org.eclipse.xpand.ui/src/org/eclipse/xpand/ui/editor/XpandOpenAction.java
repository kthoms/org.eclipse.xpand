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
package org.eclipse.xpand.ui.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtend.check.CheckUtils;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.editor.navigation.OpenAction;

/**
 * OpenAction is instantiated by the editor and will be invoked when the user
 * presses the F3 key.
 * 
 * @author Darius Jockel
 */
public class XpandOpenAction extends OpenAction {

	private final XpandEditor editor;

	/**
	 * Creates a new <code>OpenAction</code>.
	 * 
	 * @param editor
	 *            the Properties file editor which provides the context
	 *            information for this action
	 */
	public XpandOpenAction(XpandEditor editor) {
		super(editor);
		this.editor = editor;
	}

	

	

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void run(ITextSelection selection) {
		
		if (!checkEnabled(selection) || selection == null) {
			return;
		}

		IFile file = (IFile) editor.getEditorInput().getAdapter(IFile.class);
		IXtendXpandResource resource = Activator.getExtXptModelManager().findExtXptResource(file);

		// get hyperlinked region
		IRegion hyperlinkRegion = getHyperlinkRegion(selection);
		if (hyperlinkRegion == null) {
			return;
		}
		
		XpandHyperlinkDetector detector = new XpandHyperlinkDetector(editor);
		IHyperlink[] hyperlinks = detector.detectHyperlinks(editor.internalGetSourceViewer(), hyperlinkRegion, false);
		if (hyperlinks != null && hyperlinks.length == 1) {
			hyperlinks[0].open();
			return;
		}
		
		if (file.getFileExtension().equals(CheckUtils.FILE_EXTENSION)){
			
		}
		
	}
}
