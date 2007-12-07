/*******************************************************************************
 * Copyright (c) 2007, 2007 SD-mda Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jeremie Ratomposon <jratomposon@sdmda.com> SD-mdA
 *******************************************************************************/

package org.eclipse.xtend.shared.ui.editor.outlineview;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

/**
 * Viewer comparator for out-of-the-parsing, outline elements. Ordered by
 * element category, then by element label. Package fragment roots are sorted as
 * ordered on the classpath.
 * 
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 * 
 * @since 3.3
 */

public class OutlineElementComparator extends ViewerComparator {

	// Or (if code remains void) it will stupidly (that is to say without
	// minding possibly existing categories but very well) sort by label...

	/**
	 * Constructor.
	 */
	public OutlineElementComparator() {
		super(null); // delay initialization of collator
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ViewerComparator#category(java.lang.Object)
	 */
	@Override
	public int category(Object element) {
		// for Check Content Outline elements, the category is their type...
		if (element instanceof OutlineElement)
			return ((OutlineElement) element).getType();
		return OutlineElement.NONE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ViewerComparator#compare(org.eclipse.jface.viewers.Viewer,
	 *      java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {

		if (!(e1 instanceof OutlineElement))
			return 0;

		if (!(e2 instanceof OutlineElement))
			return 0;

		int cat1 = category(e1);
		int cat2 = category(e2);

		if (cat1 != cat2)
			return cat1 - cat2;

		OutlineElement ccoe1 = (OutlineElement) e1;
		OutlineElement ccoe2 = (OutlineElement) e2;

		String label1 = ccoe1.getLabel();
		String label2 = ccoe2.getLabel();
		if (label1==label2)
			return 0;
		if (label1==null)
			return -1;
		if (label2==null)
			return 1;
		return label1.toLowerCase().compareTo(label2.toLowerCase());
	}

}
