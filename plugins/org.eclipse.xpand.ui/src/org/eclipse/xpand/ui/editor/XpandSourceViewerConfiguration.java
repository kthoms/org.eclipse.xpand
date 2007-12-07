/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xpand.ui.editor;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xpand.ui.editor.codeassist.XpandContentAssistProcessor;
import org.eclipse.xpand.ui.editor.scanning.CommentScanner;
import org.eclipse.xpand.ui.editor.scanning.ContentScanner;
import org.eclipse.xpand.ui.editor.scanning.TemplateTagScanner;
import org.eclipse.xpand.ui.editor.scanning.XpandPartitionScanner;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandProblemHover;
import org.eclipse.xtend.shared.ui.editor.AbstractXtendXandSourceViewerConfiguration;

public class XpandSourceViewerConfiguration extends AbstractXtendXandSourceViewerConfiguration {

	private ContentScanner contentScanner;

	private CommentScanner commentScanner;

	private TemplateTagScanner tagScanner;

	public XpandSourceViewerConfiguration(final IEditorPart editor, IPreferenceStore preferenceStore) {
		super(editor, preferenceStore);
	}

	@Override
	public String[] getConfiguredContentTypes(final ISourceViewer aSourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE, XpandPartitionScanner.TAG, XpandPartitionScanner.COMMENT };
	}

	@Override
	public void createContentAssistProcessor(ContentAssistant contentAssistant) {
		final IContentAssistProcessor processor = new XpandContentAssistProcessor(getEditor());
		contentAssistant.setContentAssistProcessor(processor, IDocument.DEFAULT_CONTENT_TYPE);
		contentAssistant.setContentAssistProcessor(processor, XpandPartitionScanner.TAG);
		contentAssistant.setContentAssistProcessor(processor, XpandPartitionScanner.COMMENT);
	}

	@Override
	public String[] getIndentPrefixes(final ISourceViewer aSourceViewer, final String aContentType) {
		return new String[] { "\t", "    " }; // see also 'getTabWidth' ...
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(final ISourceViewer aSourceViewer) {
		final PresentationReconciler reconciler = new PresentationReconciler();
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getTemplateTagScanner());
		reconciler.setDamager(dr, XpandPartitionScanner.TAG);
		reconciler.setRepairer(dr, XpandPartitionScanner.TAG);

		dr = new DefaultDamagerRepairer(getCommentScanner());
		reconciler.setDamager(dr, XpandPartitionScanner.COMMENT);
		reconciler.setRepairer(dr, XpandPartitionScanner.COMMENT);

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

	protected ITokenScanner getTemplateTagScanner() {
		if (tagScanner == null) {
			tagScanner = new TemplateTagScanner();
		}
		return tagScanner;
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