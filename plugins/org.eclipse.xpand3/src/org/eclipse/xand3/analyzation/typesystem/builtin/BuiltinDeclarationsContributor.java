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

import java.util.Set;

import org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType;
import org.eclipse.xtend.backend.common.BackendTypesystem;

/**
 * @author Sven Efftinge
 *
 */
public class BuiltinDeclarationsContributor implements DeclarationsContributor {
	
	private BackendTypesystem backendTypesystem = null;
	
	/**
	 * 
	 */
	public BuiltinDeclarationsContributor(BackendTypesystem backendTypesystem) {
		this.backendTypesystem = backendTypesystem;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor#functionsForName(java.lang.String)
	 */
	public Set<DeclaredFunction> functionsForName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor#typeForName(java.lang.String)
	 */
	public DeclaredType typeForName(String name) {
		backendTypesystem.
		return null;
	}
	
	public static final String OBJECT = "Object";

	// Datatypes
	public final static String STRING = "String";

	public final static String BOOLEAN = "Boolean";

	public final static String INTEGER = "Integer";

	public final static String REAL = "Real";

	// Collection types
	public final static String COLLECTION = "Collection";

	public final static String SET = "Set";

	public final static String LIST = "List";

	// reflection layer types
	public static final String TYPE = "Type";

	public static final String FEATURE = "Feature";

	public static final String PROPERTY = "Property";

	public static final String OPERATION = "Operation";

	public static final String STATIC_PROPERTY = "StaticProperty";

	public static final String VOID = "Void";
}
