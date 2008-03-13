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

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.StaticProperty;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.types.emf.EObjectType;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class EEnumType extends AbstractType {
    private final EEnum _enum;
    
    public EEnumType (EEnum e) {
        super (EmfTypesystem.getFullyQualifiedName(e), EmfTypesystem.getUniqueIdentifier(e), EObjectType.INSTANCE);
        
        _enum = e;
        
        for (final EEnumLiteral el: e.getELiterals())
            register (new StaticProperty () {
                public Object get () {
                    return el.getInstance();
                }

                public String getName () {
                    return el.getName();
                }

                public BackendType getOwner () {
                    return EEnumType.this;
                }

                public BackendType getType () {
                    return EEnumType.this; //TODO fix this
                }
            });
    }
    
    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_enum == null) ? 0 : _enum.hashCode());
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
        final EEnumType other = (EEnumType) obj;
        if (_enum == null) {
            if (other._enum != null)
                return false;
        } else if (!_enum.equals(other._enum))
            return false;
        return true;
    }
}

