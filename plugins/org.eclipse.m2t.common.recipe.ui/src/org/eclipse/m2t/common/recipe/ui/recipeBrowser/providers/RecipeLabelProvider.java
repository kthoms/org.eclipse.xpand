/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Markus Voelter and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Voelter - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.m2t.common.recipe.ui.recipeBrowser.providers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.CheckSet;
import org.eclipse.m2t.common.recipe.core.EvalStatus;
import org.eclipse.m2t.common.recipe.ui.RecipePlugin;
import org.eclipse.swt.graphics.Image;

public class RecipeLabelProvider implements ILabelProvider {
	
	private Map<String, Image> map = new HashMap<String, Image>();

	public Image getImage(Object dataObject) {
		if ( dataObject instanceof Check ) {
			Check c = (Check)dataObject;
			if ( c.getStatus() == EvalStatus.OK ) return getIcon("ok");
			if ( c.getStatus() == EvalStatus.SOMECHILDRENFAILED ) return getIcon("someChildrenFailed");
			if ( c.getStatus() == EvalStatus.FAILED ) return getIcon("failed");
			return getIcon("undetermined");
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

	public String getText(Object dataObject) {
		if ( dataObject instanceof CheckSet ) {
			return "set";
		}
		if ( dataObject instanceof Check ) {
			Check c = (Check)dataObject;
			return c.getShortDescription();
		}
		return dataObject.toString();
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



