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

package org.eclipse.xtend.shared.ui.editor.outlineview;

import org.eclipse.swt.graphics.Image;

public class OutlineElement {

	public static final int NONE = 0, IMPORT = 1, EXTENSION = 2;

	public final int start, length;

	public final String label;

	public final Image image;

	public final int type;

	public OutlineElement(String label, int start, int length) {
		this(label, start, length, null);
	}

	public OutlineElement(String label, int start, int length, Image image) {
		this(label, start, length, image, OutlineElement.NONE);
	}

	public OutlineElement(String label, int start, int length, Image image, int type) {
		this.label = label;
		this.start = start;
		this.length = length;
		this.image = image;
		this.type = type;
	}

	public int getType() {
		return this.type;
	}

	public String getLabel() {
		return this.label;
	}

}
