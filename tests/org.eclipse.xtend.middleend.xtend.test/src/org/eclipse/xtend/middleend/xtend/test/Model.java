/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.middleend.xtend.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aarnold - Initial contribution and API
 */
public class Model {
	
	private List elements = new ArrayList();

	public List getElements() {
		return elements;
	}

	public void setElements(List elements) {
		this.elements = elements;
	}
	
	public void addElement (Object elem) {
		elements.add(elem);
	}

}
