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
package org.eclipse.xand3.analyzation.typesystem;

/**
 * @author Sven Efftinge
 * 
 */
public interface TypeSystemFacade {
	// factory methods for type arguments
	/**
	 * creates and returns a simple wild card type argument
	 */
	WildcardType createWildCard();

	/**
	 * creates and returns a wild card type argument with the passed lower bound as well as upper bounds
	 */
	WildcardType createWildCardWithLowerAndUpper(Type lower,
			Type... upperBounds);

	/**
	 * creates and returns a wild card type argument with the passed upper bounds
	 */
	WildcardType createWildCardWithUpper(Type... upperBounds);

	/**
	 * creates and returns a simple type argument, parameterized with a concrete type
	 */
	WildcardType createSimpleArgument(Type type);

	/**
	 * @param name - a simple name (not parameterized!)
	 * @return the type (maybe unbound) or null if there is no type with the given name
	 */
	Type typeForName(String name);

	/**
	 * this is like currying for generic types
	 * just pass an unbound type and the compatible type arguments and you'll get a new
	 * (partly) bound instance of that type.
	 * @param type - the type to be instantiated
	 * @param args
	 * @return
	 */
	Type addArguments(DeclaredType dt, TypeMirror... args);

	/**
	 * @param name - a simple name (not parameterized!)
	 * @param paramTypes - the types of the parameters to be passed
	 * @return the type (maybe unbound) or null if there is no type with the given name
	 */
	Function functionForNameAndParameterTypes(String name, Type[]... paramTypes);

	/**
	 * this is like currying for generic functions
	 * just pass an unbound functions and the compatible type arguments and you'll get a new
	 * (partly) bound instance of that function.
	 * @param f - the function to be instantiated
	 * @param args - the type arguments
	 * @return
	 */
	Function addArguments(DeclaredFunction f, TypeMirror... args);

	
}
