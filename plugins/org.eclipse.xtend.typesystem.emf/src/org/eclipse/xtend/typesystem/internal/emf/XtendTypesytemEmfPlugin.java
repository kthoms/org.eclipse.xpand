package org.eclipse.xtend.typesystem.internal.emf;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.xtend.typesystem.emf.check.CheckRegistry;
import org.osgi.framework.BundleContext;

public class XtendTypesytemEmfPlugin extends Plugin {

	// the shared instance
	private static XtendTypesytemEmfPlugin plugin;

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.xtend.typesystem.emf";
	
	public XtendTypesytemEmfPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		CheckRegistry.getInstance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static XtendTypesytemEmfPlugin getDefault() {
		return plugin;
	}


}
