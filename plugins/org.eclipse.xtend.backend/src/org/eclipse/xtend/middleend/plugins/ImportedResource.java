/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.plugins;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ImportedResource {
    private final String _resourceName;
    private final boolean _isReexported;
    
    public ImportedResource (String resourceName, boolean isReexported) {
        _resourceName = resourceName;
        _isReexported = isReexported;
    }

    public String getResourceName () {
        return _resourceName;
    }

    public boolean isReexported () {
        return _isReexported;
    }
}
