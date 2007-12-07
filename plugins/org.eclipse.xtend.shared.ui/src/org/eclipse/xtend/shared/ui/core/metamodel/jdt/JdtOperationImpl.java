/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.shared.ui.core.metamodel.jdt;

import org.eclipse.internal.xtend.type.baseimpl.OperationImpl;
import org.eclipse.xtend.typesystem.Operation;
import org.eclipse.xtend.typesystem.Type;

public class JdtOperationImpl extends OperationImpl implements Operation {

    public JdtOperationImpl(final Type owner, final String name, final Type type, final Type[] parameterTypes) {
        super(owner, name, type, parameterTypes);
    }

    @Override
    public Object evaluateInternal(final Object target, final Object[] params) {
        throw new UnsupportedOperationException();
    }

}
