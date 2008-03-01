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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.types.builtin.ListType;
import org.eclipse.xtend.backend.types.builtin.SetType;
import org.eclipse.xtend.backend.types.builtin.VoidType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class EObjectType extends AbstractType {
    public static final EObjectType INSTANCE = new EObjectType ();

    private EObjectType () {
        super ("emf::EObject");

        register (new AbstractProperty (INSTANCE, INSTANCE, EObject.class, "eContainer", false) {
            @Override
            public Object getRaw (ExecutionContext ctx, Object o) {
                return ((EObject) o).eContainer();
            }
        });
        register (new AbstractProperty (INSTANCE, ListType.INSTANCE, java.util.List.class, "eContents", false) {
            @Override
            public Object getRaw (ExecutionContext ctx, Object o) {
                return ((EObject) o).eContents();
            }
        });
        register (new AbstractProperty (INSTANCE, INSTANCE, EObject.class, "eRootContainer", false) {
            @Override
            public Object getRaw (ExecutionContext ctx, Object o) {
                return EcoreUtil.getRootContainer((EObject) o);
            }
        });
        register (new AbstractProperty (INSTANCE, SetType.INSTANCE, java.util.Set.class, "eAllContents", false) {
            @Override
            public Object getRaw (ExecutionContext ctx, Object o) {
                final Set<Object> result = new HashSet<Object>();

                for (Iterator<?> iter = ((EObject) o).eAllContents(); iter.hasNext(); )
                    result.add (iter.next());

                return result;
            }
        });
    }
    
    @Override
    public boolean isAssignableFrom (BackendType other) {
        return other == this || other == VoidType.INSTANCE;
    }
}

