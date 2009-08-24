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

package org.eclipse.xtend.check.ui.editor.codeassist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.internal.xtend.check.codeassist.CheckFastAnalyzer;
import org.eclipse.internal.xtend.expression.codeassist.ExpressionProposalComputer;
import org.eclipse.internal.xtend.expression.codeassist.ExtensionImportProposalComputer;
import org.eclipse.internal.xtend.expression.codeassist.ProposalFactory;
import org.eclipse.internal.xtend.expression.codeassist.TypeProposalComputer;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.internal.xtend.xtend.codeassist.Partition;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.expression.editor.codeassist.AbstractExtXptContentAssistProcessor;
import org.eclipse.xtend.shared.ui.expression.editor.codeassist.ProposalComparator;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 */
public class CheckContentAssistProcessor extends AbstractExtXptContentAssistProcessor {

	public CheckContentAssistProcessor(final IEditorPart editor) {
		super(editor);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected ICompletionProposal[] internalComputeCompletionProposals(final ITextViewer viewer,
			final int documentOffset) {
		String part = viewer.getDocument().get().substring(0, documentOffset);
		ExecutionContext ctx = Activator.getExecutionContext(getJavaProject());
		final Partition p = CheckFastAnalyzer.computePartition(part);
		final ProposalFactory factory = new CheckProposalFactoryEclipseImpl(documentOffset);
		List proposals = new ArrayList();
		if (p == Partition.EXPRESSION) {
			ctx = CheckFastAnalyzer.computeExecutionContext(part, ctx);
			final int i = part.lastIndexOf(';');
			if (i != -1) {
				part = part.substring(i);
			}
			proposals.addAll(new ExpressionProposalComputer().computeProposals(part, ctx, factory));
// proposals.addAll(new KeywordProposalComputer().computeProposals(part, ctx,
// factory));
		} else if (p == Partition.TYPE_DECLARATION) {
			ctx = CheckFastAnalyzer.computeExecutionContext(part, ctx);
			proposals = new TypeProposalComputer().computeProposals(part, ctx, factory);
		} else if (p == Partition.EXTENSION_IMPORT) {
			IXtendXpandProject project = Activator.getExtXptModelManager().findProject(getFile());
			IXtendXpandResource[] resources = project.getAllRegisteredResources();
			Set<String> extensionNames = new HashSet<String>();
			for (IXtendXpandResource resource : resources) {
				if (resource instanceof XtendFile) {
					extensionNames.add(resource.getFullyQualifiedName());
				}
			}
			proposals = new ExtensionImportProposalComputer().computeProposals(part, ctx, factory, extensionNames);
		} else if (p == Partition.DEFAULT) {
			proposals = new KeywordProposalComputer().computeProposals(part, ctx, factory);
		}
		Collections.sort(proposals, new ProposalComparator());
		return (ICompletionProposal[]) proposals.toArray(new ICompletionProposal[proposals.size()]);
	}

	/**
	 * {@inheritDoc}
	 */
	public IContextInformation[] computeContextInformation(final ITextViewer viewer, final int documentOffset) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '.' };
	}

	/**
	 * {@inheritDoc}
	 */
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getErrorMessage() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

}
