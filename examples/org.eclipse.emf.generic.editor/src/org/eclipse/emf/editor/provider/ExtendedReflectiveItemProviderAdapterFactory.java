package org.eclipse.emf.editor.provider;

/**
 * <copyright> 
 *
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   itemis AG - Initial API and implementation
 *
 * </copyright>
 *
 */

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

/**
 * @author Dennis Huebner
 * 
 */
public class ExtendedReflectiveItemProviderAdapterFactory extends
		ReflectiveItemProviderAdapterFactory {

	public final class ExtendedReflectiveItemProvider extends
			ReflectiveItemProvider {
		private final ExtendedLabelProvider labelProvider;

		private ExtendedReflectiveItemProvider(AdapterFactory adapterFactory,
				ExtendedLabelProvider labelProvider) {
			super(adapterFactory);
			this.labelProvider = labelProvider;
		}

		public String getTextForFeature(EStructuralFeature feature) {
			return getFeatureText(feature);
		}

		@Override
		public String getText(Object object) {
			String text = labelProvider.getText(object);
			if (text == null) {
				if (object instanceof EStructuralFeature) {
					EStructuralFeature f = (EStructuralFeature) object;
					text = super.getFeatureText(f);
				}
				text = super.getText(object);
			}
			return text;
		}

		@Override
		public Object getImage(Object object) {
			Object imURI = labelProvider.getImage(object);
			if (imURI != null) {
				return imURI;
			}
			return super.getImage(object);
		}
	}

	public ExtendedReflectiveItemProviderAdapterFactory(
			final ExtendedLabelProvider labelProvider) {
		super();
		reflectiveItemProviderAdapter = new ExtendedReflectiveItemProvider(
				this, labelProvider);
	}

}
