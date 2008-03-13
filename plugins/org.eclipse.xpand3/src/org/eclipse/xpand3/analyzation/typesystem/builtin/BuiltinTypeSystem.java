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
package org.eclipse.xpand3.analyzation.typesystem.builtin;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xpand3.analyzation.DeclarationsContributor;
import org.eclipse.xpand3.analyzation.TypeSystem;
import org.eclipse.xpand3.analyzation.TypeSystemFactory;
import org.eclipse.xpand3.analyzation.typesystem.TypeSystemImpl;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.Model;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage;
import org.eclipse.xpand3.util.LoaderFactory;

/**
 * @author Sven Efftinge
 *
 */
public class BuiltinTypeSystem extends TypeSystemImpl implements TypeSystem {
	private static Map<String, DeclaredType> types = new HashMap<String, DeclaredType>();
	static {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		@SuppressWarnings("unused")
		EFactory factoryInstance = StaticTypesystemPackage.eINSTANCE.getEFactoryInstance();
		// TODO use classpath: URI
		InputStream resourceAsStream = LoaderFactory.getClassLoader(BuiltinTypeSystem.class).getResourceAsStream("built-in.xmi");
		Resource resource = new ResourceSetImpl().createResource(URI.createURI("classpath:/built-in.xmi"));
		try {
			resource.load(resourceAsStream, null);
			Model m = (Model) resource.getContents().get(0);
			for (DeclaredType dt : m.getDeclarations()) {
				types.put(dt.getName(), dt);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * @param contributor
	 */
	public BuiltinTypeSystem(DeclarationsContributor contributor) {
		super(new DeclarationsContributor() {

			public DeclaredFunction functionForName(String name,
					AbstractTypeReference... parameterTypes) {
				return null;
			}

			public void setTypeSystemFactory(TypeSystemFactory ts) {
			}

			public DeclaredType typeForName(String name) {
				return types.get(name);
			}
			
		});
	}

}	
