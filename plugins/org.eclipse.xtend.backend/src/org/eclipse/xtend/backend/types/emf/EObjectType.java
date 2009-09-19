/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.types.emf;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.types.builtin.CollectionType;
import org.eclipse.xtend.backend.types.builtin.VoidType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class EObjectType extends AbstractType {
    public static final EObjectType INSTANCE = new EObjectType ();

    private EObjectType () {
        super ("emf::EObject", EmfTypesystem.getUniqueIdentifier (EcorePackage.eINSTANCE.getEObject()));

        register (new AbstractProperty (this, EObject.class, "eContainer", true, false) {
            @Override
            public Object getRaw (ExecutionContext ctx, Object o) {
                return ((EObject) o).eContainer();
            }

			public BackendType getType (BackendTypesystem ts) {
				return EObjectType.INSTANCE;
			}
        }, this);
        register (new AbstractProperty (this, java.util.List.class, "eContents", true, false) {
            @Override
            public Object getRaw (ExecutionContext ctx, Object o) {
                return ((EObject) o).eContents();
            }

			public BackendType getType(BackendTypesystem ts) {
				return CollectionType.INSTANCE;
			}
        }, CollectionType.INSTANCE);
        register (new AbstractProperty (this, EObject.class, "eRootContainer", true, false) {
            @Override
            public Object getRaw (ExecutionContext ctx, Object o) {
                return EcoreUtil.getRootContainer((EObject) o);
            }

			public BackendType getType (BackendTypesystem ts) {
				return EObjectType.INSTANCE;
			}
        }, this);
        register (new AbstractProperty (this, java.util.Set.class, "eAllContents", true, false) {
            @Override
            public Object getRaw (ExecutionContext ctx, Object o) {
                final Set<Object> result = new HashSet<Object>();

                for (Iterator<?> iter = ((EObject) o).eAllContents(); iter.hasNext(); )
                    result.add (iter.next());

                return result;
            }

			public BackendType getType (BackendTypesystem ts) {
				return CollectionType.INSTANCE;
			}
        }, CollectionType.INSTANCE);
    }
    
    @Override
    public boolean isAssignableFrom (BackendType other) {
        return other == this || other == VoidType.INSTANCE;
    }
    
    @Override
    public boolean equals (Object other) {
        return other == this;
    }
}

