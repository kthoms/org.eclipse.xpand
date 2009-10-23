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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.emf.editor.EEPlugin;
import org.eclipse.emf.editor.ValidationInfoAdapter;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.swt.graphics.Image;

/**
 * @author Dennis Huebner
 * 
 */
public class ExtendedReflectiveItemProviderAdapterFactory extends ReflectiveItemProviderAdapterFactory {

	public ExtendedReflectiveItemProviderAdapterFactory(final DecoratingLabelProvider decoratingLabelProvider) {
		super();
		reflectiveItemProviderAdapter = new ExtendedReflectiveItemProvider(this, decoratingLabelProvider);
	}

	public final class ExtendedReflectiveItemProvider extends ReflectiveItemProvider {
		private final DecoratingLabelProvider labelProvider;
		private LocalResourceManager localResourceManager;

		private ExtendedReflectiveItemProvider(AdapterFactory adapterFactory,
				DecoratingLabelProvider decoratingLabelProvider) {
			super(adapterFactory);
			this.labelProvider = decoratingLabelProvider;
		}

		public String getTextForFeature(EStructuralFeature feature) {
			return getFeatureText(feature);
		}

		@Override
		public String getText(Object object) {
			String text = labelProvider.getText(object);
			if (text == null) {
				text = super.getText(object);
			}
			return text;
		}

		protected Image annotateImage(Image image, int severity) {
			ImageDescriptor[] descriptors = new ImageDescriptor[5];
			if (severity == IMessageProvider.ERROR)
				descriptors[IDecoration.BOTTOM_LEFT] = EEPlugin.getDefault().getImageDescriptor("/icons/error.gif");
			if (severity == IMessageProvider.WARNING)
				descriptors[IDecoration.BOTTOM_RIGHT] = EEPlugin.getDefault().getImageDescriptor(
						"/icons/warning_co.gif");
			image = getImageManager().createImage(new DecorationOverlayIcon(image, descriptors));
			return image;

		}

		private org.eclipse.jface.resource.ResourceManager getImageManager() {
			if (localResourceManager == null)
				localResourceManager = new LocalResourceManager(JFaceResources.getResources());
			return localResourceManager;
		}

		@Override
		public Object getImage(Object object) {
			Object imURI = labelProvider.getImage(object);
			if (imURI == null)
				imURI = super.getImage(object);
			Image im = ExtendedImageRegistry.getInstance().getImage(imURI);
			if (im != null) {
				if (object instanceof EObject) {
					ValidationInfoAdapter find = ValidationInfoAdapter.find((EObject) object);
					if (find != null)
						im = annotateImage(im, find.getSeverity());
				}
				return im;
			}
			return imURI;
		}

	}

}
