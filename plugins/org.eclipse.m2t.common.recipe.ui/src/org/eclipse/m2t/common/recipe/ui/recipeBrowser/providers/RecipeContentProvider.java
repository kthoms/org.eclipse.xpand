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

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.CheckSet;
import org.eclipse.m2t.common.recipe.core.CompositeCheck;

public class RecipeContentProvider implements ITreeContentProvider, ISelectionChangedListener {

	private Map<Object, Object> parents = new HashMap<Object, Object>();;

	public Object[] getChildren(Object parent) {
		Collection<Check> c = getChildrenInternal( parent );
		if ( c == null ) return new Object[]{};
		for (Iterator<?> iter = c.iterator(); iter.hasNext();) {
			Object o = (Object) iter.next();
			parents.put( o, parent );
		}
		return c.toArray();
	}
		
	public Collection<Check> getChildrenInternal(Object parent) {
		if ( parent instanceof CheckSet ) {
			return ((CheckSet)parent).getChecks();
		}
		if ( parent instanceof CompositeCheck ) {
			return ((CompositeCheck)parent).getChildren();
		}
		return null;
	}

	public Object getParent(Object element) {
		return parents.get( element );
	}

	public boolean hasChildren(Object element) {
		if ( getChildren(element) == null ) return false;
		return getChildren(element).length > 0;
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if ( newInput == null ) return;
		parents = new HashMap<Object, Object>();
		viewer.refresh();
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public void selectionChanged(SelectionChangedEvent event) {
	}
	
}


