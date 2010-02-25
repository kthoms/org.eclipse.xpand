/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.ui.editor.codeassist;

import java.util.Arrays;

import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtend.expression.TypeNameUtil;
import org.eclipse.xtend.shared.ui.expression.editor.EditorImages;
import org.eclipse.xtend.shared.ui.expression.editor.codeassist.ProposalFactoryEclipseImpl;
import org.eclipse.xtend.typesystem.Property;
import org.eclipse.xtend.ui.editor.lang.XtendTokens;

/**
 * @author Darius Jockel - Initial contribution and API
 */
public class XtendProposalFactoryEclipseImpl extends ProposalFactoryEclipseImpl {

	public XtendProposalFactoryEclipseImpl(int offset) {
		super(offset);
	}
	
	@Override
	public ICompletionProposal createPropertyProposal(final Property p, final String prefix, final boolean onOperation) {
		final String returnType = computeReturnType(p.getReturnType(), onOperation);
		String displayStr = p.getName() + " " + returnType + " - "
				+ TypeNameUtil.getSimpleName(p.getOwner().getName());
		String insertStr = p.getName();
		if (Arrays.asList(XtendTokens.allKeywords()).contains(p.getName())){
			displayStr = "^"+displayStr;
			insertStr = "^"+insertStr;
		}
		final Image img = EditorImages.getImage(EditorImages.PROPERTY);
		return new CompletionProposal(insertStr, offset - prefix.length(), prefix.length(), insertStr.length(), img,
				displayStr, null, null);
	}

}
