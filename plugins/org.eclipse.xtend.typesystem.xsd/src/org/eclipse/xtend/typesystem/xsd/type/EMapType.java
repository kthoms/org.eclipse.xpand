/*******************************************************************************
 * Copyright (c) 2005 - 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.typesystem.xsd.type;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.internal.xtend.type.baseimpl.OperationImpl;
import org.eclipse.xtend.typesystem.AbstractTypeImpl;
import org.eclipse.xtend.typesystem.Feature;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.xsd.XSDMetaModel;


/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class EMapType extends AbstractTypeImpl {

	public static boolean isEMap(ETypedElement element) {
		EClassifier t = element.getEType();
		return element != null && element.eContainer() instanceof EClass
				&& t != null && t.getInstanceClass() != null
				&& Map.Entry.class.isAssignableFrom(t.getInstanceClass())
				&& element.isMany();
	}

	public static boolean isEMapObject(Object o) {
		return o instanceof EMap
				&& o instanceof EStructuralFeature.Setting
				&& isEMap(((EStructuralFeature.Setting) o)
						.getEStructuralFeature());
	}

	private EMapEntryType elementType;

	// private EmfRegistryMetaModel model;
	// private Type valueType;

	public EMapType(final XSDMetaModel model, final String name,
			final EClassifier innerType) {
		super(model.getTypeSystem(), name);
		// this.model = model;
		elementType = model.getEMapEntryType(innerType);
	}

	public Feature[] getContributedFeatures() {
		Type keyType = elementType.getKeyType();
		Type valueType = elementType.getValueType();
		return new Feature[] {
				new OperationImpl(this, "put", valueType, keyType, valueType) {
					@SuppressWarnings("unchecked")
					protected Object evaluateInternal(Object t, Object[] params) {
						EMap map = (EMap) t;
						return map.put(params[0], params[1]);
					}
				},
				new OperationImpl(this, "put", valueType, elementType) {
					@SuppressWarnings("unchecked")
					protected Object evaluateInternal(Object t, Object[] params) {
						EMap map = (EMap) t;
						Map.Entry<Object, Object> e = (Map.Entry<Object, Object>) params[0];
						return map.put(e.getKey(), e.getValue());
					}
				},
				new OperationImpl(this, "putAll",
						getTypeSystem().getVoidType(), getTypeSystem()
								.getCollectionType(elementType)) {
					@SuppressWarnings("unchecked")
					protected Object evaluateInternal(Object t, Object[] params) {
						EMap map = (EMap) t;
						for (Object o : (Collection) params[0]) {
							Map.Entry<Object, Object> e = (Map.Entry<Object, Object>) o;
							map.put(e.getKey(), e.getValue());
						}
						return null;
					}
				},
				new OperationImpl(this, "get", valueType, keyType) {
					@SuppressWarnings("unchecked")
					protected Object evaluateInternal(Object t, Object[] params) {
						EMap map = (EMap) t;
						return map.get(params[0]);
					}
				},
				new OperationImpl(this, "indexOfKey", getTypeSystem()
						.getIntegerType(), keyType) {
					@SuppressWarnings("unchecked")
					protected Object evaluateInternal(Object t, Object[] params) {
						EMap map = (EMap) t;
						return map.indexOfKey(params[0]);
					}
				},
				new OperationImpl(this, "containsKey", getTypeSystem()
						.getBooleanType(), keyType) {
					@SuppressWarnings("unchecked")
					protected Object evaluateInternal(Object t, Object[] params) {
						EMap map = (EMap) t;
						return map.containsKey(params[0]);
					}
				},
				new OperationImpl(this, "containsValue", getTypeSystem()
						.getBooleanType(), valueType) {
					@SuppressWarnings("unchecked")
					protected Object evaluateInternal(Object t, Object[] params) {
						EMap map = (EMap) t;
						return map.containsValue(params[0]);
					}
				},
				new OperationImpl(this, "removeKey", valueType, keyType) {
					@SuppressWarnings("unchecked")
					protected Object evaluateInternal(Object t, Object[] params) {
						EMap map = (EMap) t;
						return map.removeKey(params[0]);
					}
				},
				new OperationImpl(this, "keySet", getTypeSystem().getSetType(
						keyType)) {
					@SuppressWarnings("unchecked")
					protected Object evaluateInternal(Object t, Object[] params) {
						EMap map = (EMap) t;
						return map.keySet();
					}
				},
				new OperationImpl(this, "values", getTypeSystem()
						.getCollectionType(valueType)) {
					@SuppressWarnings("unchecked")
					protected Object evaluateInternal(Object t, Object[] params) {
						EMap map = (EMap) t;
						return map.values();
					}
				} };

	}

	public Set<? extends Type> getSuperTypes() {
		return Collections.singleton(getTypeSystem().getListType(elementType));
	}

	public boolean isInstance(Object o) {
		return isEMapObject(o);
	}

	public Object newInstance() {
		throw new UnsupportedOperationException(
				"EMaps can not be instantiated outside EObjects");
	}

}
