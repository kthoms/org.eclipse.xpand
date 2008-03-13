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

import org.eclipse.xpand3.analyzation.LanguageSpecificTypeSystemFactory;
import org.eclipse.xpand3.analyzation.TypeSystem;
import org.eclipse.xpand3.util.LoaderFactory;
import org.eclipse.xtend.backend.util.Cache;

/**
 * @author Sven Efftinge
 *
 */
public class JavaTypeSystemFactory implements LanguageSpecificTypeSystemFactory {
	
	protected static final String FUNCTIONS_PROTOKOLL = "jf:";
	private Object ctx;
	private Cache<String,AbstractJavaTypeSystem> typeSystems = new Cache<String, AbstractJavaTypeSystem>(){

		@Override
		protected AbstractJavaTypeSystem create(String key) {
			boolean functionMapping = false;
			if (key.startsWith(FUNCTIONS_PROTOKOLL)) {
				key = key.substring(FUNCTIONS_PROTOKOLL.length()-1);
			}
			Class<?> class1 = LoaderFactory.getClassLoader(ctx).loadClass(key);
			if (class1!=null) {
				if (functionMapping) {
					return new JavaFunctionsTypeSystem(class1);
				}
				return new JavaTypeSystem(class1);
			}
			return null;
		}};

	public JavaTypeSystemFactory(Object ctx) {
		this.ctx = ctx;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xpand3.analyzation.LanguageSpecificTypeSystemFactory#canHandle(java.lang.String)
	 */
	public boolean canHandle(String resourceName) {
		return LoaderFactory.getClassLoader(ctx).loadClass(resourceName)!=null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xpand3.analyzation.LanguageSpecificTypeSystemFactory#createTypeSystem(java.lang.String)
	 */
	public TypeSystem createTypeSystem(String resourceName) {
		return typeSystems.get(resourceName);
	}

}
