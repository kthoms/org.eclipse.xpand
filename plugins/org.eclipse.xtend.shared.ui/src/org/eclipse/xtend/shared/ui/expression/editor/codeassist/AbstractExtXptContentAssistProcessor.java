/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.expression.editor.codeassist;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend.shared.ui.Messages;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandNature;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandNatureUtil;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

public abstract class AbstractExtXptContentAssistProcessor implements IContentAssistProcessor {

    private IEditorPart editor;

    public AbstractExtXptContentAssistProcessor(final IEditorPart editor) {
        this.editor = editor;
    }

    /**
     * @return
     */
    protected IJavaProject getJavaProject() {
        final IResource file = (IResource) editor.getEditorInput().getAdapter(IResource.class);
        final IProject p = file.getProject();
        return JavaCore.create(p);
    }

    protected IFile getFile() {
        return (IFile) editor.getEditorInput().getAdapter(IFile.class);
    }

    public final ICompletionProposal[] computeCompletionProposals(final ITextViewer viewer, final int offset) {
        final IProject p = getFile().getProject();
        final IJavaProject jp = JavaCore.create(p);
        if (jp == null)
            return null;
        try {
            if (!p.isNatureEnabled(XtendXpandNature.NATURE_ID)) {
                if (MessageDialog.openQuestion(editor.getEditorSite().getShell(), Messages.AbstractExtXptContentAssistProcessor_Error,
                        Messages.AbstractExtXptContentAssistProcessor_Prompt + p.getName() + "'?")) {
                    XtendXpandNatureUtil.addExtXptNature(jp);
                } else
                    return null;
            }
        } catch (final CoreException e) {
            XtendLog.logError(e);
        }
        try {
            return internalComputeCompletionProposals(viewer, offset);
        } catch (final Exception e) {
            XtendLog.logError(e);
            return null;
        }
    }

    protected abstract ICompletionProposal[] internalComputeCompletionProposals(ITextViewer viewer, int offset);

}
