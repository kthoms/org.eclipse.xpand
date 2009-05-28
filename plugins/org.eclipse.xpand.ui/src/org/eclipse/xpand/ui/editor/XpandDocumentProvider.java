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

package org.eclipse.xpand.ui.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;
import org.eclipse.xpand.ui.editor.scanning.XpandPartitionScanner;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 */
public class XpandDocumentProvider extends FileDocumentProvider {

	@Override
	protected IDocument createDocument(final Object element) throws CoreException {
		final IDocument document = super.createDocument(element);
		if (document != null) {
			final IDocumentPartitioner partitioner = new FastPartitioner(new XpandPartitionScanner(), new String[] {
					XpandPartitionScanner.TAG, XpandPartitionScanner.COMMENT });
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}

}