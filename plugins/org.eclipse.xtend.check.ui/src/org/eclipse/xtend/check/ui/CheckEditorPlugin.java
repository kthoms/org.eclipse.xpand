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

package org.eclipse.xtend.check.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.check.ui.editor.PreferencesConstants;
import org.eclipse.xtend.check.ui.editor.color.ColorProvider;
import org.eclipse.xtend.shared.ui.Activator;
import org.osgi.framework.BundleContext;

public class CheckEditorPlugin extends AbstractUIPlugin {
    // The shared instance.
    private static CheckEditorPlugin plugin;

    private ColorProvider colorProvider;

    /**
     * The constructor.
     */
    public CheckEditorPlugin() {
        plugin = this;
        colorProvider = new ColorProvider();
    }

    /**
     * Returns the standard display to be used. The method first checks, if the
     * thread calling this method has an associated display. If so, this display
     * is returned. Otherwise the method returns the default display.
     */
    public static Display getStandardDisplay() {
        Display display = Display.getCurrent();
        if (display == null) {
            display = Display.getDefault();
        }
        return display;
    }

    /**
     * This method is called upon plug-in activation
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
		if (PlatformUI.isWorkbenchRunning()) {
			Activator.getDefault();
			PreferencesConstants.initializeDefaultValues(getPreferenceStore());
		}
    }

    /**
     * This method is called when the plug-in is stopped
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        super.stop(context);
        plugin = null;
        colorProvider.dispose();
        colorProvider = null;
    }

    /**
     * Returns the shared instance.
     */
    public static CheckEditorPlugin getDefault() {
        return plugin;
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in
     * relative path.
     * 
     * @param path
     *            the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(final String path) {
        return AbstractUIPlugin.imageDescriptorFromPlugin(getId(), path);
    }

    public static String getId() {
        return getDefault().getBundle().getSymbolicName();
    }

    public static ColorProvider getColorProvider() {
        return getDefault().colorProvider;
    }

    /**
     * @return
     */
    public static Shell getActiveWorkbenchShell() {
        final IWorkbenchWindow window = getActiveWorkbenchWindow();
        if (window != null)
            return window.getShell();
        return null;
    }

    /**
     * @return
     */
    private static IWorkbenchWindow getActiveWorkbenchWindow() {
        return getDefault().getWorkbench().getActiveWorkbenchWindow();
    }

}
