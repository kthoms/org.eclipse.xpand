/**
 * <copyright> 
 *
 * Copyright (c) 2008 itemis AG and others.
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
package org.eclipse.emf.editor.extxpt;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.editor.MessageData;


/**
 * @author Dennis Huebner
 * 
 */
public class ExtXptHelper {
	static public EStructuralFeature extractFeatureFromMessage(EObject eObject,
			MessageData md) {
		String message = md.getMessage();
		int i = message.indexOf('#');
		if (i > 0 && i < message.length() - 1) {
			String featureName = message.substring(0, i);
			message = message.substring(i + 1);
			md.setMessage(message);
			return eObject.eClass().getEStructuralFeature(featureName);
		}
		return null;
	}

}
