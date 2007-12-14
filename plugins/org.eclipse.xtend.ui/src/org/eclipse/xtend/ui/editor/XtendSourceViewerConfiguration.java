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


package org.eclipse.xtend.ui.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandProblemHover;
import org.eclipse.xtend.shared.ui.editor.AbstractXtendXandSourceViewerConfiguration;
import org.eclipse.xtend.ui.editor.codeassist.XtendContentAssistProcessor;
import org.eclipse.xtend.ui.editor.scanning.CommentScanner;
import org.eclipse.xtend.ui.editor.scanning.ContentScanner;
import org.eclipse.xtend.ui.editor.scanning.StringLiteralScanner;
import org.eclipse.xtend.ui.editor.scanning.XtendPartitionScanner;

public class XtendSourceViewerConfiguration extends AbstractXtendXandSourceViewerConfiguration {

	private ContentScanner contentScanner;

	private CommentScanner commentScanner;

	private StringLiteralScanner stringLiteralScanner;

	public XtendSourceViewerConfiguration(final IEditorPart editor) {
		super(editor);
	}

	@Override
	public String[] getConfiguredContentTypes(final ISourceViewer aSourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE, XtendPartitionScanner.COMMENT,
				XtendPartitionScanner.STRING_LIT };
	}

	@Override
	protected void createContentAssistProcessor(ContentAssistant contentAssistant) {
		final XtendContentAssistProcessor processor = new XtendContentAssistProcessor(getEditor());
		contentAssistant.setContentAssistProcessor(processor, IDocument.DEFAULT_CONTENT_TYPE);
	}

	@Override
	public String[] getIndentPrefixes(final ISourceViewer aSourceViewer, final String aContentType) {
		return new String[] { "\t", "    " }; // see also 'getTabWidth' ...
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(final ISourceViewer aSourceViewer) {
		final PresentationReconciler reconciler = new PresentationReconciler();
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getCommentScanner());
		reconciler.setDamager(dr, XtendPartitionScanner.COMMENT);
		reconciler.setRepairer(dr, XtendPartitionScanner.COMMENT);

		dr = new DefaultDamagerRepairer(getStringLiteralScanner());
		reconciler.setDamager(dr, XtendPartitionScanner.STRING_LIT);
		reconciler.setRepairer(dr, XtendPartitionScanner.STRING_LIT);

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

	private StringLiteralScanner getStringLiteralScanner() {
		if (stringLiteralScanner == null) {
			stringLiteralScanner = new StringLiteralScanner();
		}
		return stringLiteralScanner;
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

}