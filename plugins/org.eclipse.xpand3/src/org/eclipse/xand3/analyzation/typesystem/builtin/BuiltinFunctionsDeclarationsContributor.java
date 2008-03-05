/**
 * <copyright> 
 *
 * Copyright (c) 2002-2007 itemis AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   itemis AG - Initial API and implementation
 *
 * </copyright>
 *
 */
package org.eclipse.xand3.analyzation.typesystem.builtin;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xand3.analyzation.DeclarationsContributor;
import org.eclipse.xand3.analyzation.TypeSystem;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemFactory;
import org.eclipse.xtend.backend.common.NamedFunction;

/**
 * @author Sven Efftinge
 * 
 */
public class BuiltinFunctionsDeclarationsContributor implements DeclarationsContributor {

	private Map<String, DeclaredFunction> functions = new HashMap<String, DeclaredFunction>();
	private TypeSystem typeSystem;

	private DeclaredFunction createDeclaredFunction(NamedFunction backendFunction) {
		if (functions.containsKey(backendFunction.getName())) {
			return functions.get(backendFunction.getName());
		}
		DeclaredFunction df = StaticTypesystemFactory.eINSTANCE
				.createDeclaredFunction();
		functions.put(backendFunction.getName(), df);
		df.setName(backendFunction.getName());
//		df.setReturnType(typeSystem.typeForName(OBJECT, typeArguments))
		return df;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor#functionForName(java.lang.String, org.eclipse.xpand3.staticTypesystem.AbstractTypeReference[])
	 */
	public DeclaredFunction functionForName(String name,
			AbstractTypeReference... parameterTypes) {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor#typeForName(java.lang.String)
	 */
	public DeclaredType typeForName(String name) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.Xpand3DeclarationsResource#getReferencedResources()
	 */
	public String[] getReferencedContributors() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.Xpand3DeclarationsResource#setTypeSystem(org.eclipse.xand3.analyzation.TypeSystem)
	 */
	public void setTypeSystem(TypeSystem ts) {
		this.typeSystem = ts;
	}

}
