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
package org.eclipse.xpand3.analyzation.typesystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xpand3.analyzation.TypeSystem;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.FunctionType;
import org.eclipse.xpand3.staticTypesystem.Type;

/**
 * @author Sven Efftinge
 * 
 */
public class CompositeTypeSystemImpl extends AbstractTypeSystemImpl implements TypeSystem {
	private List<? extends TypeSystem> delegates = null;
	
	public CompositeTypeSystemImpl(List<? extends TypeSystem> delegates) {
		this.delegates = delegates;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xand3.analyzation.TypeSystem#functionForName(java.lang.String,
	 *      java.util.List,
	 *      org.eclipse.xpand3.staticTypesystem.AbstractTypeReference[])
	 */
	public FunctionType functionForName(String name,
			List<AbstractTypeReference> parameterTypes,
			AbstractTypeReference... typeArguments) {
		List<FunctionType> possibilities = new ArrayList<FunctionType>();
		for (TypeSystem ts : delegates) {
			FunctionType functionType = ts.functionForName(name, parameterTypes, typeArguments);
			if (functionType!=null)
				possibilities.add(functionType);
		}
		if (possibilities.isEmpty())
			return null;
		//TODO sort by specialization
		return possibilities.get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xand3.analyzation.TypeSystem#functionForNameAndParameterTypes(java.lang.String,
	 *      org.eclipse.xpand3.staticTypesystem.AbstractTypeReference[])
	 */
	public FunctionType functionForNameAndParameterTypes(String name,
			AbstractTypeReference... parameterTypes) {
		return functionForName(name, Arrays.asList(parameterTypes));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xand3.analyzation.TypeSystem#typeForName(java.lang.String,
	 *      org.eclipse.xpand3.staticTypesystem.AbstractTypeReference[])
	 */
	public Type typeForName(String name, AbstractTypeReference... typeArguments) {
		for (TypeSystem ts : delegates) {
			Type type = ts.typeForName(name, typeArguments);
			if (type!=null)
				return type;
		}
		return null;
	}

}
