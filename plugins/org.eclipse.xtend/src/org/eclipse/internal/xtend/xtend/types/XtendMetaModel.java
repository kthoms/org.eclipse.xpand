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

	public Set<? extends Type> getKnownTypes() {
		return new HashSet<Type>(types.values());
	}

	public String getName() {
		return "xtend";
	}

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

	public Type getTypeForName(String typeName) {
		return types.get(typeName);
	}

	private TypeSystem ts = null;

	public TypeSystem getTypeSystem() {
		return ts;
	}

	public void setTypeSystem(TypeSystem typeSystem) {
		ts = typeSystem;
	}

	public Set<String> getNamespaces() {
		return new HashSet<String>();
	}

}
