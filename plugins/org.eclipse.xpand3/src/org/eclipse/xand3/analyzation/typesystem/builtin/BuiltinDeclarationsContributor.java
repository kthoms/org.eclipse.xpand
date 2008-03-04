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
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor;
import org.eclipse.xand3.analyzation.typesystem.TypeSystemFacade;
import org.eclipse.xpand3.declaration.DeclarationFactory;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.DeclaredFunction;
import org.eclipse.xpand3.staticTypesystem.DeclaredProperty;
import org.eclipse.xpand3.staticTypesystem.DeclaredStaticProperty;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemFactory;
import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.NamedFunction;
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

/**
 * @author Sven Efftinge
 * 
 */
public class BuiltinDeclarationsContributor implements DeclarationsContributor {

	private Map<String, DeclaredType> types = new HashMap<String, DeclaredType>();
	private Map<String, DeclaredFunction> functions = new HashMap<String, DeclaredFunction>();

	private TypeSystemFacade facade = TypeSystemFacade.create();

	
	private DeclaredFunction createDeclaredFunction(NamedFunction backendFunction) {
		if (functions.containsKey(backendFunction.getName())) {
			return functions.get(backendFunction.getName());
		}
		DeclaredFunction df = StaticTypesystemFactory.eINSTANCE
				.createDeclaredFunction();
		functions.put(backendFunction.getName(), df);
		df.setName(backendFunction.getName());
		return df;
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
		// for (NamedFunction func: bt.getBuiltinOperations()) {
		// dt.getProperties().add(createDeclaredOperation(func));
		// }
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
		return null;
	}

	/**
	 * @param value
	 * @return
	 */
	private DeclaredProperty createDeclaredProperty(Property value) {
		DeclaredProperty dp = StaticTypesystemFactory.eINSTANCE
				.createDeclaredProperty();
		dp.setName(value.getName());
		dp
				.setType(facade.typeReference(typeForName(value.getType()
						.getName())));
		return dp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xand3.analyzation.typesystem.DeclarationsContributor#functionsForName(java.lang.String)
	 */
	public Set<DeclaredFunction> functionsForName(String name) {

		return null;
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
		} else if (name.equals(VOID)) {
			createVoidType();
		}
		return null;
	}

	/**
	 * 
	 */
	private void createVoidType() {

	}

	public static final String OBJECT = "Object";

	// Datatypes
	public final static String STRING = "String";

	public final static String BOOLEAN = "Boolean";

	public final static String INTEGER = "Integer";

	public final static String REAL = "Real";

	// Collection types
	public final static String COLLECTION = "Collection";

	public final static String SET = "Set";

	public final static String LIST = "List";

	// reflection layer types
	public static final String TYPE = "Type";

	public static final String FEATURE = "Feature";

	public static final String PROPERTY = "Property";

	public static final String OPERATION = "Operation";

	public static final String STATIC_PROPERTY = "StaticProperty";

	public static final String VOID = "Void";
}
