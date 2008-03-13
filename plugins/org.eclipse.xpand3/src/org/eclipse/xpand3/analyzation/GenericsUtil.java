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

import java.util.Arrays;

import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.FunctionType;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemFactory;
import org.eclipse.xpand3.staticTypesystem.Type;
import org.eclipse.xpand3.staticTypesystem.VoidType;
import org.eclipse.xpand3.staticTypesystem.WildcardType;

/**
 * @author Sven Efftinge
 *
 */
public class GenericsUtil {
	private final static StaticTypesystemFactory FACTORY = StaticTypesystemFactory.eINSTANCE;
	/**
	 * 
	 */
	private static final VoidType VOID_TYPE = FACTORY.createVoidType();
	
	public static WildcardType wildCardWithLower(AbstractTypeReference... lowerBounds) {
		WildcardType wildCard = wildCard();
		for (AbstractTypeReference abstractTypeReference : lowerBounds) {
			wildCard.getLowerBounds().add(abstractTypeReference);
		}
		return wildCard;
	}

	public static WildcardType wildCard(AbstractTypeReference... upperBounds) {
		WildcardType wildCard = FACTORY.createWildcardType();
		for (AbstractTypeReference abstractTypeReference : upperBounds) {
			wildCard.getUpperBounds().add(abstractTypeReference);
		}
		return wildCard;
	}
	
	public static Type typeRef(DeclaredType declaredType, AbstractTypeReference... actualArguments) {
		Type type = FACTORY.createType();
		type.setDeclaredType(declaredType);
		type.getActualTypeArguments().addAll(Arrays.asList(actualArguments));
		return type;
	}
	
	public static VoidType voidType() {
		return VOID_TYPE;
	}
	
	public static FunctionType functionTypeRef(DeclaredFunction declaredFunction, AbstractTypeReference... actualArguments) {
		FunctionType type = FACTORY.createFunctionType();
		type.setDeclaredFunction(declaredFunction);
		type.getActualTypeArguments().addAll(Arrays.asList(actualArguments));
		return type;
	}
}
