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

import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.FunctionType;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemFactory;
import org.eclipse.xpand3.staticTypesystem.Type;
import org.eclipse.xpand3.staticTypesystem.WildcardType;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType;

/**
 * @author Sven Efftinge
 * 
 */
public final class TypeSystemFacade {
	private TypeSystemFacade(){}
	
	public static TypeSystemFacade create() {
		return new TypeSystemFacade();
	}
	
	private StaticTypesystemFactory FACTORY = StaticTypesystemFactory.eINSTANCE;
	// factory methods for type arguments
	/**
	 * creates and returns a simple wild card type argument
	 */
	public WildcardType createWildcard() {
		WildcardType wildcardType = FACTORY.createWildcardType();
		return wildcardType;
	}

	/**
	 * creates and returns a wild card type argument with the passed lower bound as well as upper bounds
	 */
	public WildcardType createWildcardWithLower(AbstractTypeReference... lowerBounds) {
		WildcardType wildCard = createWildcard();
		for (AbstractTypeReference abstractTypeReference : lowerBounds) {
			wildCard.getLowerBounds().add(abstractTypeReference);
		}
		return wildCard;
	}

	/**
	 * creates and returns a wild card type argument with the passed upper bounds
	 */
	public WildcardType createWildcardWithUpper(Type... upperBounds){
		WildcardType wildCard = createWildcard();
		for (AbstractTypeReference abstractTypeReference : upperBounds) {
			wildCard.getLowerBounds().add(abstractTypeReference);
		}
		return wildCard;
	}

	/**
	 * creates a type for a declared type and the needed arguments
	 * @param type - the type to be instantiated
	 * @param args
	 * @return
	 */
	public Type typeReference(DeclaredType dt, AbstractTypeReference... args) {
		Type type = FACTORY.createType();
		type.setDeclaredType(dt);
		for (AbstractTypeReference ref : args) {
			type.getActualTypeArguments().add(ref);
		}
		return type;
	}

	/**
	 * @param name - a simple name (not parameterized!)
	 * @param paramTypes - the types of the parameters to be passed
	 * @return the type (maybe unbound) or null if there is no type with the given name
	 */
	public FunctionType functionType(DeclaredFunction func, AbstractTypeReference... args){
		FunctionType funcType = FACTORY.createFunctionType();
		funcType.setDeclaredFunction(func);
		for (AbstractTypeReference ref : args) {
			funcType.getActualTypeArguments().add(ref);
		}
		return funcType;
	}

}
