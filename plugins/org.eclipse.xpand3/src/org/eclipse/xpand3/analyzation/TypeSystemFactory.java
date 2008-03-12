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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xpand3.analyzation.typesystem.builtin.BuiltinTypeSystem;
import org.eclipse.xtend.backend.util.Cache;



/**
 * @author Sven Efftinge
 *
 */
public class TypeSystemFactory {
	
	private static Set<LanguageSpecificTypeSystemFactory> factories = new HashSet<LanguageSpecificTypeSystemFactory>();
	
	public void registerLanguageSpecificFactory(LanguageSpecificTypeSystemFactory factory) {
		factories.add(factory);
	}
	
	private final Cache<String, TypeSystem> cache = new Cache<String, TypeSystem>() {
		@Override
		protected TypeSystem create(String namespace) {
			for (LanguageSpecificTypeSystemFactory factory : factories) {
				if (factory.canHandle(namespace)) {
					TypeSystem typeSystem = factory.createTypeSystem(namespace);
					typeSystem.setTypeSystemFactory(TypeSystemFactory.this);
					return typeSystem;
				}
			}
			return null;
		}};
	
	public TypeSystem getTypeSystem(String resourceName) {
		return cache.get(resourceName);
	}
	
	public BuiltinTypeSystem getBuiltInTypeSystem() {
		return BuiltinTypeSystem.BUILTIN_TYPESYSTEM;
	}
	
}
