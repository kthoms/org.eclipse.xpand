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
package org.eclipse.xpand3.analyzation.typesystem.util;

import java.util.Collection;

import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;

/**
 * @author Sven Efftinge
 *
 */
public class PolymorphicResolver {

	/**
	 * @param values
	 * @param name
	 * @param parameterTypes
	 * @param object
	 */
	public static DeclaredFunction findFunction(Collection<DeclaredFunction> functions,
			String name, AbstractTypeReference[] parameterTypes, AbstractTypeReference[] typeArguments) {
		for (DeclaredFunction f : functions) {
			if (f.getName().equals(name)) {
				if (f.getDeclaredParameters().size() == parameterTypes.length) {
					// TODO check types etc.
					return f;
				}
			}
		}
		return null;
	}

}
