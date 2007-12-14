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


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.CheckParameter;
import org.eclipse.m2t.common.recipe.ui.RecipePlugin;
import org.eclipse.swt.graphics.Image;

public class ParameterLabelProvider implements ITableLabelProvider {

	private Check currentCheck = null;
	
	private Map<String, Image> map = new HashMap<String, Image>();
	
	public void setCurrentCheck( Check c ) {
		this.currentCheck = c;
	}
	
	public Image getColumnImage(Object element, int columnIndex) {
		CheckParameter p = (CheckParameter) element;
		if ( columnIndex == 0 ) {
			if ( currentCheck != p.getOwner() ) return getIcon("indirectParam"); 
			return getIcon("directParam");
		}
		return null;
	}
	
	private Image getIcon(String string) {
		if (map.get(string) == null) {
			ImageDescriptor imageDescriptor = RecipePlugin.getDefault().getImageDescriptor(string+".gif");
			map.put(string, imageDescriptor.createImage());
		}
		return map.get(string);
	}

	public String getColumnText(Object element, int columnIndex) {
		CheckParameter p = (CheckParameter) element;
		switch (columnIndex) {
		case 0:
			return "";
		case 1:
			return (String)p.getKey();
		case 2:
			return p.getValue().toString();
		}
		return null;
	}

	public void addListener(ILabelProviderListener listener) {
	}

	public void dispose() {
		for (Iterator<Image> iter = map.values().iterator(); iter.hasNext();) {
			Image image = iter.next();
			image.dispose();
		}
		map.clear();
	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
	}

}

