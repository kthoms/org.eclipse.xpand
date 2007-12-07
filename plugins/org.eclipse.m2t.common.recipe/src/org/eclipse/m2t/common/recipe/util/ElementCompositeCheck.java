/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Markus Voelter and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Voelter - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.m2t.common.recipe.util;

import java.lang.reflect.Method;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.m2t.common.recipe.core.CompositeCheck;

public class ElementCompositeCheck extends CompositeCheck {

	private static final long serialVersionUID = 8048487187256153880L;

	public ElementCompositeCheck(Object element) {
		super(name(element), "");
		setParameter("Element", name(element));
	}

	public ElementCompositeCheck(Object element, String message) {
		super(name(element), name(element) + ": " + message);
		setParameter("element", name(element));
	}

	public ElementCompositeCheck(Object element, String elementDesc, String message) {
		super(name(element), elementDesc + ": " + message);
		setParameter("element", name(element));
	}

	private static String name(Object element) {
		String name = "";
		if (element instanceof EObject) {
			EObject eobject = (EObject) element;
			EStructuralFeature structuralFeature = eobject.eClass().getEStructuralFeature("QualifiedName");
			if (structuralFeature != null)
				return eobject.eGet(structuralFeature).toString();
			structuralFeature = eobject.eClass().getEStructuralFeature("name");
			if (structuralFeature != null)
				return eobject.eGet(structuralFeature).toString();
			return eobject.toString();
		}
		name = tryMethod("QualifiedName", element);
		if (name == null)
			name = tryMethod("NameS", element);
		if (name == null)
			name = tryMethod("name", element);
		if (name == null)
			name = element.toString();
		return name;
	}

	private static String tryMethod(String name, Object element) {
		try {
			Method m = element.getClass().getMethod(name, (Class[]) null);
			Object res = m.invoke(element, (Object[]) null);
			return (String) res;
		} catch (Exception ignore) {
		}
		return null;
	}

}
