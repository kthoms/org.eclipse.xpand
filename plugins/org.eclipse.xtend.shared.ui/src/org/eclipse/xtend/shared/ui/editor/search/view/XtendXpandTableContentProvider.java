/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: committers of openArchitectureWare - initial API and
 * implementation
 ******************************************************************************/
package org.eclipse.xtend.shared.ui.editor.search.view;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.search.ui.text.AbstractTextSearchResult;
import org.eclipse.xtend.shared.ui.editor.search.query.XtendXpandSearchResult;

/**
 * <code>XtendXpandTableContentProvider</code> is a chnage/aware content provider for
 * the search result list view.
 * 
 * @author Peter Friese
 */
public class XtendXpandTableContentProvider implements IStructuredContentProvider, IFileSearchContentProvider {

	private final Object[] EMPTY_ARR = new Object[0];

	private final XtendXpandSearchResultPage page;
	private AbstractTextSearchResult result;

	/**
	 * Creates a new <code>XtendXpandTableContentProvider</code>.
	 * 
	 * @param page
	 *            The Xtend search result page this content provider is associated
	 *            with.
	 */
	public XtendXpandTableContentProvider(XtendXpandSearchResultPage page) {
		this.page = page;
	}

	/**
	 * {@inheritDoc}
	 */
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof XtendXpandSearchResult) {
			int elementLimit = 1000; // getElementLimit();
			Object[] elements = ((XtendXpandSearchResult) inputElement).getElements();
			if (elementLimit != -1 && elements.length > elementLimit) {
				Object[] shownElements = new Object[elementLimit];
				System.arraycopy(elements, 0, shownElements, 0, elementLimit);
				return shownElements;
			}
			return elements;
		}
		return EMPTY_ARR;
	}

	/**
	 * {@inheritDoc}
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof XtendXpandSearchResult) {
			result = (XtendXpandSearchResult) newInput;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public void elementsChanged(Object[] updatedElements) {
		TableViewer viewer = getViewer();
		int elementLimit = 1000; // getElementLimit();
		boolean tableLimited = elementLimit != -1;
		for (Object element : updatedElements) {
			if (result.getMatchCount(element) > 0) {
				if (viewer.testFindItem(element) != null) {
					viewer.update(element, null);
				} else {
					if (!tableLimited || viewer.getTable().getItemCount() < elementLimit) {
						viewer.add(element);
					}
				}
			} else {
				viewer.remove(element);
			}
		}
	}

	// private int getElementLimit() {
	// return page.getElementLimit().intValue();
	// }

	private TableViewer getViewer() {
		return (TableViewer) page.getViewer();
	}

	/**
	 * {@inheritDoc}
	 */
	public void clear() {
		getViewer().refresh();
	}

	/**
	 * {@inheritDoc}
	 */
	public void dispose() {
	}
}
