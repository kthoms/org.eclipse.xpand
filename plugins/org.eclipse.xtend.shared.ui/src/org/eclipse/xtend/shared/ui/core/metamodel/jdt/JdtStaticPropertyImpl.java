/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.shared.ui.core.metamodel.jdt;

import org.eclipse.internal.xtend.type.baseimpl.StaticPropertyImpl;
import org.eclipse.xtend.typesystem.Type;

public class JdtStaticPropertyImpl extends StaticPropertyImpl {
	private Object constant;
	
    public JdtStaticPropertyImpl(final Type owner, final String name, final Type returnType, final Object constant) {
        super(owner, name, returnType);
        this.constant = constant;
    }

    public Object get() {
        return constant;
    }
}