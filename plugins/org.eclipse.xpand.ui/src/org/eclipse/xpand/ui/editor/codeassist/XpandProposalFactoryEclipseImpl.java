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

package org.eclipse.xpand.ui.editor.codeassist;

import java.util.Arrays;

import org.eclipse.internal.xpand2.XpandTokens;
import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtend.expression.TypeNameUtil;
import org.eclipse.xtend.shared.ui.expression.editor.EditorImages;
import org.eclipse.xtend.shared.ui.expression.editor.codeassist.ProposalFactoryEclipseImpl;
import org.eclipse.xtend.shared.ui.expression.editor.codeassist.TextSelectingProposal;
import org.eclipse.xtend.typesystem.Property;
import org.eclipse.xtend.ui.editor.lang.XtendTokens;

public class XpandProposalFactoryEclipseImpl extends ProposalFactoryEclipseImpl {

    public XpandProposalFactoryEclipseImpl(final int offset) {
        super(offset);
    }

    @Override
    public ICompletionProposal createStatementProposal(final String insertString, final String displayString, final String prefix,
            final int cursor, final int marked) {
        final Image img = EditorImages.getImage(EditorImages.STATEMENT);
        return new TextSelectingProposal(insertString, offset, prefix.length(), cursor, marked, img, displayString,
                null, null);
    }

    @Override
    public ICompletionProposal createStatementProposal(final String insertString, final String displayString, final String prefix) {
        return createStatementProposal(insertString, displayString, prefix, insertString.length(), 0);
    }

    @Override
    public ICompletionProposal createKeywordProposal(final String insertString, final String displayString, final String prefix) {
        return new CompletionProposal(insertString, offset - prefix.length(), prefix.length(), insertString.length(), null, displayString, null, null);
    }
    
    @Override
	public ICompletionProposal createPropertyProposal(final Property p, final String prefix, final boolean onOperation) {
		final String returnType = computeReturnType(p.getReturnType(), onOperation);
		String displayStr = p.getName() + " " + returnType + " - "
				+ TypeNameUtil.getSimpleName(p.getOwner().getName());
		String insertStr = p.getName();
		if (Arrays.asList(XpandTokens.ALLKEYWORDS).contains(p.getName()) ||
				Arrays.asList(SyntaxConstants.ALLKEYWORDS).contains(p.getName())){
			displayStr = "^"+displayStr;
			insertStr = "^"+insertStr;
		}
		final Image img = EditorImages.getImage(EditorImages.PROPERTY);
		return new CompletionProposal(insertStr, offset - prefix.length(), prefix.length(), insertStr.length(), img,
				displayStr, null, null);
	}

}
