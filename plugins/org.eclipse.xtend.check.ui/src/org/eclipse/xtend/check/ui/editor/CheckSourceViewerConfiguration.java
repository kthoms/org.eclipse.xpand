/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.check.ui.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.hyperlink.IHyperlinkDetector;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend.check.ui.editor.codeassist.CheckContentAssistProcessor;
import org.eclipse.xtend.check.ui.editor.scanning.ContentScanner;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandProblemHover;
import org.eclipse.xtend.shared.ui.editor.AbstractXtendXpandSourceViewerConfiguration;
import org.eclipse.xtend.ui.editor.scanning.CommentScanner;
import org.eclipse.xtend.ui.editor.scanning.XtendPartitionScanner;

public class CheckSourceViewerConfiguration extends AbstractXtendXpandSourceViewerConfiguration {

	private ContentScanner contentScanner;

	private CommentScanner commentScanner;

	public CheckSourceViewerConfiguration(final IEditorPart editor) {
		super(editor);
	}

	/**
	 * Returns all configured content types for the given source viewer.
	 * 
	 * @param sourceViewer
	 *            the source viewer to be configured by this configuration
	 * @return all configured content types
	 */
	@Override
	public String[] getConfiguredContentTypes(final ISourceViewer aSourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE, XtendPartitionScanner.COMMENT };
	}

	@Override
	protected void createContentAssistProcessor(ContentAssistant contentAssistant) {
		final CheckContentAssistProcessor processor = new CheckContentAssistProcessor(getEditor());
		contentAssistant.setContentAssistProcessor(processor, IDocument.DEFAULT_CONTENT_TYPE);
	}

	/**
	 * Returns the prefixes to be used by the line-shift operation. This
	 * implementation always returns new String[] { "\t", " " }.
	 * 
	 * @param sourceViewer
	 *            the source viewer to be configured by this configuration
	 * @param contentType
	 *            the content type for which the strategy is applicable
	 * @return the prefixes or null if the prefix operation should not be
	 *         supported
	 */
	@Override
	public String[] getIndentPrefixes(final ISourceViewer aSourceViewer, final String aContentType) {
		return new String[] { "\t", "    " }; // see also 'getTabWidth' ...
	}

	/**
	 * Returns the presentation reconciler ready to be used with the given
	 * source viewer.
	 * 
	 * @param sourceViewer
	 *            the source viewer to be configured by this configuration
	 * @return the presentation reconciler or null if presentation reconciling
	 *         should not be supported
	 */
	@Override
	public IPresentationReconciler getPresentationReconciler(final ISourceViewer aSourceViewer) {
		final PresentationReconciler reconciler = new PresentationReconciler();
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getCommentScanner());
		reconciler.setDamager(dr, XtendPartitionScanner.COMMENT);
		reconciler.setRepairer(dr, XtendPartitionScanner.COMMENT);

		dr = new DefaultDamagerRepairer(getContentScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		return reconciler;
	}

	private CommentScanner getCommentScanner() {
		if (commentScanner == null) {
			commentScanner = new CommentScanner();
		}
		return commentScanner;
	}

	protected ITokenScanner getContentScanner() {
		if (contentScanner == null) {
			contentScanner = new ContentScanner();
		}
		return contentScanner;
	}

	@Override
	public IAnnotationHover getAnnotationHover(final ISourceViewer sourceViewer) {
		return new XtendXpandProblemHover(sourceViewer);
	}

	@Override
	public ITextHover getTextHover(final ISourceViewer sourceViewer, final String contentType) {
		return new XtendXpandProblemHover(sourceViewer);
	}
	
	@Override
	public IHyperlinkDetector[] getHyperlinkDetectors(ISourceViewer sourceViewer) { 
		return new IHyperlinkDetector[] { new CheckHyperlinkDetector(getEditor()) };
	}

	@Override
	public void refresh() {
		if (commentScanner != null) {
			commentScanner.initialize();
		}
		if (contentScanner != null) {
			contentScanner.initialize();
		}
	}

}