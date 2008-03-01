/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.types.emf.internal;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class EDataTypeType extends AbstractType {
    private final EDataType _dt;
    
    public EDataTypeType (EDataType dt) {
        super (EmfTypesystem.getFullyQualifiedName(dt));
        _dt = dt;
    }

    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_dt == null) ? 0 : _dt.hashCode());
        return result;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EDataTypeType other = (EDataTypeType) obj;
        if (_dt == null) {
            if (other._dt != null)
                return false;
        } else if (!_dt.equals(other._dt))
            return false;
        return true;
    }
}
