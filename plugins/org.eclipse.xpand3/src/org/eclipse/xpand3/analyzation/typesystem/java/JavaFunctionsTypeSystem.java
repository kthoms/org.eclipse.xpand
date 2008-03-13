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

import java.lang.reflect.Method;

import org.eclipse.xpand3.staticTypesystem.DeclaredType;

/**
 * @author Sven Efftinge
 *
 */
public class JavaFunctionsTypeSystem extends AbstractJavaTypeSystem {

	/**
	 * @param javaClass
	 */
	public JavaFunctionsTypeSystem(Class<?> javaClass) {
		super(javaClass);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xpand3.analyzation.typesystem.java.AbstractJavaTypeSystem#typeForName(java.lang.String)
	 */
	@Override
	public DeclaredType typeForName(String name) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xpand3.analyzation.typesystem.java.AbstractJavaTypeSystem#mapDeclaringTypeAsFirstArgument(java.lang.reflect.Method)
	 */
	@Override
	protected boolean mapDeclaringTypeAsFirstArgument(Method method) {
		return false;
	}
}
