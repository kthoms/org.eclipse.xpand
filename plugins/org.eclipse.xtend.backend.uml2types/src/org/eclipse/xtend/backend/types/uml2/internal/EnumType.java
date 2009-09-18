/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.backend.types.uml2.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.StaticProperty;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.types.builtin.StringType;
import org.eclipse.xtend.backend.types.emf.EObjectType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class EnumType extends AbstractType {
	/** The Enumeration represented by this. */
    private final Enumeration _enumeration;

    public EnumType (String name, Enumeration en) {
        super (name, name, EObjectType.INSTANCE); //TODO uniqueRepresentation
        _enumeration = en;
        
        for (final EnumerationLiteral el: en.getOwnedLiterals())
            register (new StaticProperty() {
                public Object get () {
                    return el;
                }

                public String getName () {
                    return el.getName();
                }

                public BackendType getOwner () {
                    return EnumType.this;
                }

                public BackendType getType () {
                    return EnumType.this;
                }
            });
        
        register (new AbstractProperty (this, String.class, "literal", true, false) {
            @Override
            public Object getRaw (ExecutionContext ctx, Object o) {
                if (o == null)
                    return null;
                
                final EObject obj = (EObject) o;
                return obj.eGet (obj.eClass ().getEStructuralFeature ("name"));
            }

			@Override
			public BackendType getType (BackendTypesystem ts) {
				return StringType.INSTANCE;
			}
        }, StringType.INSTANCE);
    }

    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_enumeration == null) ? 0 : _enumeration.hashCode());
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
        final EnumType other = (EnumType) obj;
        if (_enumeration == null) {
            if (other._enumeration != null)
                return false;
        } else if (!_enumeration.equals(other._enumeration))
            return false;
        return true;
    }
}
