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

package org.eclipse.m2t.common.recipe.ui.recipeBrowser.providers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.CheckParameter;

public class ParameterContentProvider implements IStructuredContentProvider {

	public Object[] getElements(Object inputElement) {
		//return filterAndSort( ((Check)inputElement).getParameters() ).toArray();
		List<CheckParameter> l = new ArrayList<CheckParameter>();
		l.addAll( ((Check)inputElement).getParameters() );
		l.addAll( ((Check)inputElement).getIndirectParameters() );
		return filterAndSort(l).toArray();
	}
	
	private List<CheckParameter> filterAndSort(List<CheckParameter> l) {
		Collections.sort( l, new Comparator<CheckParameter>() {
			public int compare(CheckParameter o1, CheckParameter o2) {
				String k1 = o1.getKey();
				String k2 = o2.getKey();
				return k1.compareTo(k2);
			}
		} );
		return l;
	}	

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if ( newInput == null ) return;
		viewer.refresh();
	}

}