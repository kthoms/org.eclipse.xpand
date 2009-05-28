/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xpand.ui.editor.codeassist;

import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtend.shared.ui.expression.editor.EditorImages;
import org.eclipse.xtend.shared.ui.expression.editor.codeassist.ProposalFactoryEclipseImpl;
import org.eclipse.xtend.shared.ui.expression.editor.codeassist.TextSelectingProposal;

public class XpandProposalFactoryEclipseImpl extends ProposalFactoryEclipseImpl {

    public XpandProposalFactoryEclipseImpl(final int offset) {
        super(offset);
    }

    @Override
    public Object createStatementProposal(final String insertString, final String displayString, final String prefix,
            final int cursor, final int marked) {
        final Image img = EditorImages.getImage(EditorImages.STATEMENT);
        return new TextSelectingProposal(insertString, offset, prefix.length(), cursor, marked, img, displayString,
                null, null);
    }

    @Override
    public Object createStatementProposal(final String insertString, final String displayString, final String prefix) {
        return createStatementProposal(insertString, displayString, prefix, insertString.length(), 0);
    }

    @Override
    public Object createKeywordProposal(final String insertString, final String displayString, final String prefix) {
        return new CompletionProposal(insertString, offset - prefix.length(), prefix.length(), insertString.length(), null, displayString, null, null);
    }
    
}
