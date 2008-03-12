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
package org.eclipse.xpand3.analyzation.typesystem.xpand3;

import org.eclipse.xpand3.DeclaredParameter;
import org.eclipse.xpand3.File;
import org.eclipse.xpand3.Identifier;
import org.eclipse.xpand3.ImportStatement;
import org.eclipse.xpand3.analyzation.TypeSystem;
import org.eclipse.xpand3.analyzation.TypeSystemFactory;
import org.eclipse.xpand3.analyzation.typesystem.util.TypeList;
import org.eclipse.xpand3.ast.AstUtil;
import org.eclipse.xpand3.declaration.Definition;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
/**
 * @author Sven Efftinge
 *
 */
public class Xpand3ResourceDeclarationsContributor implements
		TypeSystem {
	
	private File file = null;
	private TypeSystemFactory typeSystemFactory;
	
	/**
	 * @param file
	 */
	public Xpand3ResourceDeclarationsContributor(File file) {
		super();
		this.file = file;
	}
	

	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.DeclarationsContributor#functionForName(java.lang.String, org.eclipse.xpand3.staticTypesystem.AbstractTypeReference[])
	 */
	public DeclaredFunction functionForName(String name,
			AbstractTypeReference... parameterTypes) {
		
		return null;
	}

	class FunctionSign {
		String name;
		TypeList listOfTypes;
	}
	/**
	 * @param def
	 * @return
	 */
	private AbstractTypeReference[] getParamTypes(Definition def) {
		AbstractTypeReference[] types = new AbstractTypeReference[def.getParams().size()];
		for (int i=0;i<types.length;i++) {
			DeclaredParameter declaredParameter = def.getParams().get(i);
		}
		return types;
	}


	/**
	 * @return
	 */
	private String getResourceName() {
		return file.getFileName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.DeclarationsContributor#setTypeSystem(org.eclipse.xand3.analyzation.TypeSystem)
	 */
	public void setTypeSystemFactory(TypeSystemFactory ts) {
		this.typeSystemFactory = ts;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.DeclarationsContributor#typeForName(java.lang.String)
	 */
	public DeclaredType typeForName(String name) {
		return null;
	}

}
