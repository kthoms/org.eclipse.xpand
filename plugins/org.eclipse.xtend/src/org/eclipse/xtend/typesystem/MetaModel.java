/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.typesystem;

import java.util.Set;

import org.eclipse.xtend.expression.TypeSystem;


/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 * @author Peter Friese
 */
public interface MetaModel {

	TypeSystem getTypeSystem();

	void setTypeSystem(TypeSystem typeSystem);

	/**
	 * if this metamodel is responsible for a type with the given name, it
	 * returns the corresponding type. Otherwise returns <code>null</code>
	 * 
	 * @param typeName
	 * @return
	 */
	Type getTypeForName(String typeName);

	/**
	 * if this metamodel is responsible for a types which are responsible for
	 * the given object, it returns the corresponding type. Otherwise returns
	 * <code>null</code>
	 * 
	 * @param obj
	 * @return
	 */
	Type getType(Object obj);

	/**
	 * returns all types this metamodel is responsible for
	 * 
	 * @return
	 */
	Set<? extends Type> getKnownTypes();

	/**
	 * Returns all namespaces provided by this metamodel.
	 * 
	 * @return A {@link Set} containing the names of all namespaces provided by
	 *         this metamodel.
	 */
	Set<String> getNamespaces();

}
