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
package org.eclipse.xtend.util.stdlib;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;

public class EmfUtils {
	
	public static final List<EObject> getReferencingObjects(EObject target) {
		LinkedList<EObject> result = new LinkedList<EObject>(); 
		Collection<EStructuralFeature.Setting> settings = CrossReferencer.find(target.eResource().getContents()).get(target);
        if (settings == null) {
        	return Collections.emptyList();
        }
        for (Setting setting : settings) {
            result.add(setting.getEObject());
        }
		return result;
	}
}
