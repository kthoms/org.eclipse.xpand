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
package org.eclipse.emf.editor.ui;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.emf.editor.EEPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.services.IDisposable;

/**
 * Automatic refreshable ImageRegistry
 * 
 * @author Dennis Hübner
 * 
 */
public class ImageRegistry implements IDisposable {
	private static ImageRegistry imageRegistry;
	private Map<String, Image> register = new HashMap<String, Image>();
	private Set<Image> deletedImages = new HashSet<Image>();
	private List<ChangeListener> registryChangedListeners = new ArrayList<ChangeListener>();

	public static ImageRegistry getDefault() {
		if (imageRegistry == null)
			imageRegistry = new ImageRegistry();
		return imageRegistry;
	}

	public Image getImage(IFile iconFile) {
		String imageKey = computeImageKey(iconFile);
		Image icon = register.get(imageKey);
		if (icon == null) {
			// load from project
			registerImage(iconFile);
			icon = register.get(imageKey);
		}
		return icon;
	}

	/**
	 * @param iconFile
	 * @param imageKey
	 */
	private Image registerImage(IFile iconFile) {
		Image icon = null;
		if (iconFile.exists()) {
			ImageDescriptor imageDescriptor = null;
			try {
				imageDescriptor = ImageDescriptor.createFromURL(iconFile
						.getLocation().toFile().toURI().toURL());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			if (imageDescriptor != null) {
				icon = imageDescriptor.createImage(false);
				if (icon != null) {
					// register
					register.put(computeImageKey(iconFile), icon);
					notifyListeners();
					registerResourceChangeListener(iconFile);
				}
			}
		}
		return icon;
	}

	/**
	 * @param iconFile
	 * @return
	 */
	private String computeImageKey(IFile iconFile) {
		return iconFile.getFullPath().toString();
	}

	private void registerResourceChangeListener(final IFile iconFile) {
		final IWorkspace workspace = iconFile.getWorkspace();
		IResourceChangeListener listener = new IResourceChangeListener() {
			private IFile resource = iconFile;

			public void resourceChanged(IResourceChangeEvent event) {

				if (event.getDelta() != null) {// ignore open close project
					// events
					IResourceDelta findMember = event.getDelta().findMember(
							resource.getFullPath());
					if (findMember != null) {
						String imageKey = computeImageKey(iconFile);
						// resource changed
						notifyListeners();
						if ((findMember.getKind() & IResourceDelta.REMOVED) == IResourceDelta.REMOVED) {
							// TODO couldn't dispose Image cause it used by a
							// TreeViewer or DragDrop or else
							// dispose later
							deletedImages.add(register.remove(imageKey));
							workspace.removeResourceChangeListener(this);
						}
						if ((findMember.getKind() & IResourceDelta.CHANGED) == IResourceDelta.CHANGED) {
							deletedImages.add(register.remove(imageKey));
							registerImage(iconFile);
						}
					}
				}
			}

		};
		workspace.addResourceChangeListener(listener);
	}

	public void dispose() {
		try {
			Set<String> keySet = register.keySet();
			for (String key : keySet) {
				Image im = register.get(key);
				destroyImage(im);
			}
			register.clear();
			for (Image delIm : deletedImages) {
				destroyImage(delIm);
			}
			deletedImages.clear();
		} catch (Exception e) {
			EEPlugin.logError("ImageRegisty dispose failed!", e);
		} finally {
			register = new HashMap<String, Image>();
			registryChangedListeners = new ArrayList<ChangeListener>();
		}
	}

	/**
	 * @param im
	 */
	private void destroyImage(final Image im) {
		if (im != null && !im.isDisposed()) {
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					im.dispose();
				}
			});
		}
	}

	public boolean addChangeListener(ChangeListener listener) {
		return registryChangedListeners.add(listener);
	}

	public boolean removeChangeListener(ChangeListener listener) {
		return registryChangedListeners.remove(listener);
	}

	private void notifyListeners() {
		for (ChangeListener chl : registryChangedListeners) {
			chl.stateChanged(new ChangeEvent(this));
		}
	}
}
