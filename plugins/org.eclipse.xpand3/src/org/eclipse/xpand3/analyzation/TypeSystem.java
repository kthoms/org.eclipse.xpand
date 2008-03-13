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
package org.eclipse.xpand3.analyzation;

import org.eclipse.xpand3.analyzation.typesystem.builtin.BuiltinTypeSystem;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;

/**
 * @author Sven Efftinge
 * 
 */
public interface TypeSystem {
	final String OBJECT = "Object";
	final String VOID = "Void";
	
	// Collection types
	final String COLLECTION = "Collection";
	final String SET = "Set";
	final String LIST = "List";
	final String MAP = "Map";
	
	// Datatypes
	final String BOOLEAN = "Boolean";
	final String INTEGER = "Integer";
	final String REAL = "Real";
	final String STRING = "String";
	
	// reflection layer types
	final String FEATURE = "Feature";
	final String TYPE = "Type";
	final String FUNCTION = "Function";
	final String PROPERTY = "Property";
	final String STATIC_PROPERTY = "StaticProperty";
	
	final BuiltinTypeSystem BUILTIN_TYPESYSTEM = new BuiltinTypeSystem();
	
	/**
	 * if this contributor has a type with the declared name, the respective DeclareTpye should be returned.
	 * This method is only invoked once per name, so caching is done by the framework
	 * @param name
	 * @return the declared type with the given name or null if there is no such type declared in this Resource.
	 */
	DeclaredType typeForName(String name);
	
	/**
	 * if this contributor has a type with the declared name, the respective DeclareTpye should be returned.
	 * This method is only invoked once per name.
	 * @param name
	 * @return
	 */
	DeclaredFunction functionForName(String name, AbstractTypeReference...parameterTypes);
	
	/**
	 * this method is invoked during setup of this contributor.
	 * @param the type system to be used for resolving type and function references.
	 */
	void setTypeSystemFactory(TypeSystemFactory tsf);
	
}
