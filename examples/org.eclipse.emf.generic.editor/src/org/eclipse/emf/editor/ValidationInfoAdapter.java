/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.editor;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Sven Efftinge - Initial contribution and API
 *
 */
public class ValidationInfoAdapter implements Adapter {
	
	public static ValidationInfoAdapter find(EObject obj) {
		EList<Adapter> adapters = obj.eAdapters();
		for (Adapter adapter : adapters) {
			if (adapter instanceof ValidationInfoAdapter) {
				return (ValidationInfoAdapter) adapter;
			}
		}
		return null;
	}
	
	private String message;
	private EStructuralFeature feature;
	private int severity = Diagnostic.ERROR;

	public ValidationInfoAdapter(String message, EStructuralFeature feature, int severity) {
		super();
		this.message = message;
		this.feature = feature;
		this.severity = severity;
	}
	
	public EStructuralFeature getFeature() {
		return feature;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getSeverity() {
		return severity;
	}

	public Notifier getTarget() {
		return null;
	}

	public boolean isAdapterForType(Object type) {
		return false;
	}

	public void notifyChanged(Notification notification) {
	}

	public void setTarget(Notifier newTarget) {
	}
	

	/**
	 * @param rootObject
	 */
	public static void removeAll(Resource res) {
		EList<EObject> list = res.getContents();
		for (EObject eObject : list) {
			removeAll(eObject);
		}
	}

	/**
	 * @param rootObject
	 */
	public static void removeAll(EObject obj) {
		remove(obj);
		TreeIterator<EObject> iterator = obj.eAllContents();
		while (iterator.hasNext()) {
			EObject eObject =  iterator.next();
			remove(eObject);
		}
	}

	/**
	 * @param obj
	 */
	public static void remove(EObject obj) {
		Iterator<Adapter> iterator = obj.eAdapters().iterator();
		while (iterator.hasNext()) {
			Adapter adapter = iterator.next();
			if (adapter instanceof ValidationInfoAdapter)
				iterator.remove();
		}
	}

}
