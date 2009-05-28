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
package org.eclipse.xtend.shared.ui.expression.editor.codeassist;

import java.util.Comparator;

import org.eclipse.jface.text.contentassist.ICompletionProposal;

public class ProposalComparator implements Comparator {

    public int compare(final Object o1, final Object o2) {
        final ICompletionProposal p1 = (ICompletionProposal) o1;
        final ICompletionProposal p2 = (ICompletionProposal) o2;

        return p1.getDisplayString().compareTo(p2.getDisplayString());
    }

}
