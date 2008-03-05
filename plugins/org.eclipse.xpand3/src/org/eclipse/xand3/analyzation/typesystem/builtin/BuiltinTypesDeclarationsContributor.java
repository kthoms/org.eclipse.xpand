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
package org.eclipse.xand3.analyzation.typesystem.builtin;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.xand3.analyzation.TypeSystem;
import org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.DeclaredProperty;
import org.eclipse.xpand3.staticTypesystem.DeclaredStaticProperty;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemFactory;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.Property;
import org.eclipse.xtend.backend.common.StaticProperty;
import org.eclipse.xtend.backend.types.builtin.BooleanType;
import org.eclipse.xtend.backend.types.builtin.CollectionType;
import org.eclipse.xtend.backend.types.builtin.DoubleType;
import org.eclipse.xtend.backend.types.builtin.FunctionType;
import org.eclipse.xtend.backend.types.builtin.ListType;
import org.eclipse.xtend.backend.types.builtin.LongType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.types.builtin.PropertyType;
import org.eclipse.xtend.backend.types.builtin.SetType;
import org.eclipse.xtend.backend.types.builtin.StaticPropertyType;
import org.eclipse.xtend.backend.types.builtin.StringType;
import org.eclipse.xtend.backend.types.builtin.TypeType;

import static org.eclipse.xand3.analyzation.TypeSystem.*;

/**
 * @author Sven Efftinge
 * 
 */
public class BuiltinTypesDeclarationsContributor implements DeclarationsContributor {

	private Map<String, DeclaredType> types = new HashMap<String, DeclaredType>();

	private TypeSystem typeSystems = null;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.Xpand3DeclarationsResource#setTypeSystem(org.eclipse.xand3.analyzation.TypeSystem)
	 */
	public void setTypeSystem(TypeSystem ts) {
		this.typeSystems = ts;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.Xpand3DeclarationsResource#getReferencedResources()
	 */
	public String[] getReferencedContributors() {
		return null;
	}
	/**
	 * @param instance
	 * @return
	 */
	private DeclaredType createDeclaredType(BackendType bt) {
		if (types.containsKey(bt.getName())) {
			return types.get(bt.getName());
		}
		DeclaredType dt = StaticTypesystemFactory.eINSTANCE
				.createDeclaredType();
		types.put(bt.getName(), dt);
		dt.setName(bt.getName());
		dt.setBackendType(bt);
		Map<String, ? extends Property> properties = bt.getProperties();
		for (Entry<String, ? extends Property> entry : properties.entrySet()) {
			dt.getProperties().add(createDeclaredProperty(entry.getValue()));
		}
		for (StaticProperty sp : bt.getStaticProperties().values()) {
			dt.getStaticProperties().add(createDeclaredStaticProperty(sp));
		}
		return dt;
	}

	/**
	 * @param sp
	 * @return
	 */
	private DeclaredStaticProperty createDeclaredStaticProperty(
			StaticProperty sp) {
		DeclaredStaticProperty dsp = StaticTypesystemFactory.eINSTANCE.createDeclaredStaticProperty();
		dsp.setName(sp.getName());
		dsp.setType(typeSystems.typeForName(sp.getType().getName()));
		return dsp;
	}

	/**
	 * @param value
	 * @return
	 */
	private DeclaredProperty createDeclaredProperty(Property value) {
		DeclaredProperty dp = StaticTypesystemFactory.eINSTANCE
				.createDeclaredProperty();
		dp.setName(value.getName());
		dp.setType(typeSystems.typeForName(value.getType().getName()));
		return dp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor#typeForName(java.lang.String)
	 */
	public DeclaredType typeForName(String name) {
		if (name.equals(OBJECT)) {
			createDeclaredType(ObjectType.INSTANCE);
		} else if (name.equals(STRING)) {
			createDeclaredType(StringType.INSTANCE);
		} else if (name.equals(BOOLEAN)) {
			createDeclaredType(BooleanType.INSTANCE);
		} else if (name.equals(INTEGER)) {
			createDeclaredType(LongType.INSTANCE);
		} else if (name.equals(REAL)) {
			createDeclaredType(DoubleType.INSTANCE);
		} else if (name.equals(COLLECTION)) {
			createDeclaredType(CollectionType.INSTANCE);
		} else if (name.equals(LIST)) {
			createDeclaredType(ListType.INSTANCE);
		} else if (name.equals(SET)) {
			createDeclaredType(SetType.INSTANCE);
		} else if (name.equals(TYPE)) {
			createDeclaredType(TypeType.INSTANCE);
		} else if (name.equals(PROPERTY)) {
			createDeclaredType(PropertyType.INSTANCE);
		} else if (name.equals(OPERATION)) {
			createDeclaredType(FunctionType.INSTANCE);
		} else if (name.equals(STATIC_PROPERTY)) {
			createDeclaredType(StaticPropertyType.INSTANCE);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor#functionForName(java.lang.String, org.eclipse.xpand3.staticTypesystem.AbstractTypeReference[])
	 */
	public DeclaredFunction functionForName(String name,
			AbstractTypeReference... parameterTypes) {
		return null;
	}

}
