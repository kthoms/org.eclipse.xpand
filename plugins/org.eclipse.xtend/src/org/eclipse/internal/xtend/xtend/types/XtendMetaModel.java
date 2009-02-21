/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.internal.xtend.xtend.types;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtend.expression.TypeSystem;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.Type;

public class XtendMetaModel implements MetaModel {

	private final Map<String, Type> types = new HashMap<String, Type>();

	public XtendMetaModel(TypeSystem ts) {
		setTypeSystem(ts);
		AdviceContextType t = new AdviceContextType(ts);
		types.put(t.getName(), t);
	}

	/**
	 * @see org.eclipse.type.MetaModel#getKnownTypes()
	 */
	public Set<? extends Type> getKnownTypes() {
		return new HashSet<Type>(types.values());
	}

	/**
	 * Returns the name of the metamodel.
	 * 
	 * @return name of metamodel
	 */
	public String getName() {
		return "xtend";
	}

	/**
	 * @see org.eclipse.type.MetaModel#getType(java.lang.Object)
	 */
	public Type getType(Object obj) {
		Type bestMatch = null;
		for (Type aType : getKnownTypes()) {
			if (aType.isInstance(obj)) {
				if (bestMatch == null || bestMatch.isAssignableFrom(aType)) {
					bestMatch = aType;
				}
			}
		}
		return bestMatch;
	}

	/**
	 * @see org.eclipse.type.MetaModel#getTypeForName(java.lang.String)
	 */
	public Type getTypeForName(String typeName) {
		return types.get(typeName);
	}

	private TypeSystem ts = null;

	/**
	 * @see org.eclipse.type.MetaModel#getTypeSystem()
	 */
	public TypeSystem getTypeSystem() {
		return ts;
	}

	/**
	 * @see org.eclipse.type.MetaModel#setTypeSystem(org.eclipse.expression.TypeSystem)
	 */
	public void setTypeSystem(TypeSystem typeSystem) {
		ts = typeSystem;
	}

	/**
	 * @see org.eclipse.type.MetaModel#getNamespaces()
	 */
	public Set<String> getNamespaces() {
		return new HashSet<String>();
	}
}
