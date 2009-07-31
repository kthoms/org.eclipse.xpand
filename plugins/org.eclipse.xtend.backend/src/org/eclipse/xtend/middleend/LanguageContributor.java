/*
Copyright (c) 2009 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.middleend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEndFactory;

public class LanguageContributor {
	
    private static final Log _log = LogFactory.getLog (LanguageContributor.class);

    public final static LanguageContributor INSTANCE = new LanguageContributor (); 
	
	private final Map<String, LanguageSpecificMiddleEndFactory> _middleEndContributions = new HashMap<String, LanguageSpecificMiddleEndFactory> ();
	
	private LanguageContributor () {
	}
	
	
	public void addLanguageContribution (Class<? extends LanguageSpecificMiddleEndFactory> middleEndFactoryClass) throws ConfigurationException {
		try {
			final LanguageSpecificMiddleEndFactory factory = middleEndFactoryClass.newInstance ();
			_middleEndContributions.put (factory.getName(), factory);
		} catch (InstantiationException e) {
			throw new ConfigurationException(e);
		} catch (IllegalAccessException e) {
			throw new ConfigurationException(e);
		}
	}
	
	public Collection<LanguageSpecificMiddleEndFactory> getLanguageContributions () {
		return _middleEndContributions.values();
	}
	
	public LanguageSpecificMiddleEndFactory getLanguageContributionByName (String middleEndName) {
		return _middleEndContributions.get (middleEndName);
	}

    public List<LanguageSpecificMiddleEnd> getFreshMiddleEnds (Map<Class<?>, Object> specificParams) {
        
        final List<LanguageSpecificMiddleEnd> result = new ArrayList<LanguageSpecificMiddleEnd>();

        for (LanguageSpecificMiddleEndFactory factory: _middleEndContributions.values()) {
            try {
                result.add (factory.create (specificParams.get (factory.getClass())));
            }
            catch (IllegalArgumentException exc) {
                // this is the official way for an implementation to withdraw from the pool for this call
                _log.debug ("middle end implementation " + factory.getName() + " says it is not available: " + exc.getMessage());
            }
        }
        
        return result;
    }
}
