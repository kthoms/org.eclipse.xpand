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

package org.eclipse.xand3.analyzation.typesystem.builtin;

import java.util.List;
import java.util.Set;

import org.eclipse.xand3.analyzation.typesystem.declaration.DeclaredTypeParameter;
import org.eclipse.xand3.analyzation.typesystem.type.Type;


public final class BooleanTypeImpl extends BuiltinBaseType  {
	public BooleanTypeImpl(final String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.declaration.DeclaredType#getSuperTypes()
	 */
	public Set<Type> getSuperTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.declaration.DeclaredType#getTypeParameters()
	 */
	public List<DeclaredTypeParameter> getTypeParameters() {
		// TODO Auto-generated method stub
		return null;
	}
}
