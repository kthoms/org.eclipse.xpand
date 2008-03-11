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
package org.eclipse.xpand3.analyzation.typesystem.java;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xpand3.analyzation.DeclarationsContributor;
import org.eclipse.xpand3.analyzation.TypeSystem;
import org.eclipse.xpand3.analyzation.TypeSystemFactory;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.util.LoaderFactory;

/**
 * @author Sven Efftinge
 * 
 */
public class JavaDeclarationsContributor implements DeclarationsContributor {

	private Map<String, DeclaredType> types = new HashMap<String, DeclaredType>();

	private TypeSystemFactory typeSystemFactory = null;
	
	private Class<?> cls;
	
	/**
	 * 
	 */
	public JavaDeclarationsContributor(String importedNamespace) {
		this.cls = LoaderFactory.getClassLoader(this).loadClass(importedNamespace);
		if (cls==null) {
			throw new IllegalArgumentException("Couldn't find Java Class '"+importedNamespace+"'");
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.Xpand3DeclarationsResource#setTypeSystem(org.eclipse.xand3.analyzation.TypeSystem)
	 */
	public void setTypeSystemFactory(TypeSystemFactory tsf) {
		this.typeSystemFactory = tsf;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.Xpand3DeclarationsResource#getReferencedResources()
	 */
	public String[] getReferencedContributors() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor#typeForName(java.lang.String)
	 */
	public DeclaredType typeForName(String name) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor#functionForName(java.lang.String, org.eclipse.xpand3.staticTypesystem.AbstractTypeReference[])
	 */
	public DeclaredFunction functionForName(String name,
			AbstractTypeReference... parameterTypes) {
		return null;
	}

}
