package org.eclipse.xtend.backend.ui;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.xtend.backend.ui.middleend.LanguageSpecificMiddleEndConfigurer;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    private static final Log _log = LogFactory.getLog (Activator.class);

	private static BundleContext context;
	
	private static Activator _instance = null;

    public static Activator getInstance () {
        return _instance;
    }

    static BundleContext getContext() {
		return context;
	}


	private boolean _isInitialized;

	private List<LanguageSpecificMiddleEndConfigurer> _middleEndConfigContribution = new ArrayList<LanguageSpecificMiddleEndConfigurer>();

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		_instance = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		_instance = null;
	}

	/**
	 * @return the _isInitialized
	 */
	public boolean isInitialized() {
		return _isInitialized;
	}


	public List<LanguageSpecificMiddleEndConfigurer> getMiddleEndConfigurers () {
        init ();
        
        return _middleEndConfigContribution;
	}
	
    private void init () {
        if (_isInitialized)
            return;
        
        _isInitialized = true;
        _middleEndConfigContribution.clear ();

        try {
            final IConfigurationElement[] confEl = RegistryFactory.getRegistry().getConfigurationElementsFor ("org.eclipse.xtend.backend.ui.MiddleEndConfigurer");

            for (IConfigurationElement curEl: confEl) {
                final Object o = curEl.createExecutableExtension ("class");
                _middleEndConfigContribution.add ((LanguageSpecificMiddleEndConfigurer) o);
            }
        }
        catch (Exception exc) {
            _log.error("Error initializing middleend configurer", exc);
        }
                
        _log.info ("Activating Eclipse Modeling Middle End configurators - configurers for the following middle ends are registered:");
        for (LanguageSpecificMiddleEndConfigurer factory: _middleEndConfigContribution)
            _log.info ("  " + factory.getMiddleEndName ());
    }
}
