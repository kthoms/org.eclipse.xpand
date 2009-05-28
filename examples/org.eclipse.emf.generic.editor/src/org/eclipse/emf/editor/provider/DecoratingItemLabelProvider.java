/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.editor.provider;

import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * @author Dennis Hübner - Initial contribution and API
 * 
 */
public class DecoratingItemLabelProvider extends DecoratingLabelProvider implements IItemLabelProvider {

	public DecoratingItemLabelProvider(final IItemLabelProvider provider, ILabelDecorator decorator) {
		super(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return provider.getText(element);
			}

			@Override
			public Image getImage(Object element) {
				Object im = provider.getImage(element);

				if (im instanceof Image)
					return (Image) im;
				
				return super.getImage(element);
			}
		}, decorator);
	}
}
