/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.ui.editor.PreferencesConstants;
import org.eclipse.xtend.ui.editor.color.ColorProvider;
import org.osgi.framework.BundleContext;

public class XtendEditorPlugin extends AbstractUIPlugin {
    // The shared instance.
    private static XtendEditorPlugin plugin;

    private ColorProvider colorProvider;

    /**
     * The constructor.
     */
    public XtendEditorPlugin() {
        plugin = this;
        colorProvider = new ColorProvider();
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
    public static XtendEditorPlugin getDefault() {
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
