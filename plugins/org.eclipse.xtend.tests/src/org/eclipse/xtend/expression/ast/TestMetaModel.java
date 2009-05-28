/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.expression.ast;

import java.util.Collections;
import java.util.Set;

import org.eclipse.internal.xtend.type.baseimpl.OperationImpl;
import org.eclipse.internal.xtend.type.baseimpl.PropertyImpl;
import org.eclipse.xtend.expression.TypeSystem;
import org.eclipse.xtend.typesystem.AbstractTypeImpl;
import org.eclipse.xtend.typesystem.Feature;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.Type;

final class TestMetaModel implements MetaModel {
	private TypeSystem typeSystem;

	public void setTypeSystem(final TypeSystem typeSystem) {
		this.typeSystem = typeSystem;
		if (singleType == null) {
			singleType = new AbstractTypeImpl(typeSystem, "test::Type") {

				@Override
				public Feature[] getContributedFeatures() {
					return new Feature[] {
							new PropertyImpl(this, "strings", getTypeSystem()
									.getCollectionType(
											getTypeSystem().getStringType())) {
								public Object get(Object target) {
									return Collections.singletonList("test");
								}
							},
							new PropertyImpl(this, "list", getTypeSystem()
									.getCollectionType(this)) {
								public Object get(Object target) {
									return Collections.singletonList(target);
								}
							},
							new OperationImpl(this, "strings", getTypeSystem()
									.getCollectionType(
											getTypeSystem().getStringType())) {

								@Override
								protected Object evaluateInternal(
										Object target, Object[] params) {
									return Collections.singletonList("test");
								}
							},
							new OperationImpl(this, "list", getTypeSystem()
									.getCollectionType(this)) {

								@Override
								protected Object evaluateInternal(
										Object target, Object[] params) {
									return Collections.singletonList(target);
								}
							} };
				}

				public boolean isInstance(Object o) {
					return o instanceof TestObjImpl;
				}

				public Object newInstance() {
					return new TestObjImpl();
				}
			};
		}
	}

	Type singleType = null;

	public Set<? extends Type> getKnownTypes() {
		return Collections.singleton(singleType);
	}

	public Set<String> getNamespaces() {
		return Collections.singleton("test");
	}

	public Type getType(Object obj) {
		if (singleType.isInstance(obj))
			return singleType;
		return null;
	}

	public Type getTypeForName(String typeName) {
		return typeName.equals("test::Type") ? singleType : null;
	}

	public TypeSystem getTypeSystem() {
		return typeSystem;
	}
}

class TestObjImpl {

}