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

import java.util.List;

import org.eclipse.xpand3.analyzation.typesystem.builtin.BuiltinTypeSystem;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.FunctionType;
import org.eclipse.xpand3.staticTypesystem.Type;
import org.eclipse.xpand3.staticTypesystem.WildcardType;

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
	
	// Datatypes
	final String BOOLEAN = "Boolean";
	final String INTEGER = "Integer";
	final String REAL = "Real";
	final String STRING = "String";
	
	// reflection layer types
	final String FEATURE = "Feature";
	final String TYPE = "Type";
	final String OPERATION = "Operation";
	final String PROPERTY = "Property";
	final String STATIC_PROPERTY = "StaticProperty";
	
	final TypeSystem BUILTIN_TYPESYSTEM = new BuiltinTypeSystem(null);
	
	WildcardType wildCard(AbstractTypeReference...upperBounds);
	WildcardType wildCardWithLower(AbstractTypeReference...lowerBounds);
	
	Type typeForName(String name, AbstractTypeReference...typeArguments);
	
	FunctionType functionForNameAndParameterTypes(String name, AbstractTypeReference...parameterTypes);
	FunctionType functionForName(String name, List<AbstractTypeReference> parameterTypes, AbstractTypeReference...typeArguments);
	
}
