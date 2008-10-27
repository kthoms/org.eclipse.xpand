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
package org.eclipse.emf.editor.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.editor.extxpt.ExtXptFacade;

/**
 * @author Dennis Hübner
 * 
 */
public class ProposalCreator {
	private EditingDomain domain;
	private final ExtXptFacade facade;

	public ProposalCreator(EditingDomain domain, ExtXptFacade facade) {
		super();
		this.domain = domain;
		this.facade = facade;
	}

	/**
	 * 
	 * @param source
	 * @param feature
	 * @return possible values
	 */
	public List<?> proposals(EObject source, EStructuralFeature feature) {

		List<?> retVal = null;
		// TODO Reference[] handle
		if (feature instanceof EReference) {
			retVal = findAllInstances(feature.getEType());
		} else if (feature.getEType() instanceof EEnumImpl) {
			EEnum eEnum = (EEnum) feature.getEType();
			List<Enumerator> enumerators = new ArrayList<Enumerator>();
			for (Iterator<?> iter = eEnum.getELiterals().iterator(); iter
					.hasNext();) {
				Enumerator instance = ((EEnumLiteral) iter.next())
						.getInstance();
				enumerators.add(instance);
			}
			retVal = enumerators;
		}
		return facade.proposals(feature, source, retVal);
	}

	private List<Object> findAllInstances(EClassifier type) {
		List<Object> objects = new ArrayList<Object>();
		TreeIterator<Object> allContents = EcoreUtil.getAllContents(domain
				.getResourceSet().getResources(), true);
		while (allContents.hasNext()) {
			Object o = allContents.next();
			if (type.isInstance(o))
				objects.add(o);
		}
		for (TreeIterator<Object> iter = EcoreUtil.getAllContents(EcoreUtil
				.getRootContainer(EcorePackage.eINSTANCE, true), false); iter
				.hasNext();) {
			Object next = iter.next();
			if ((type.isInstance(next)) && !objects.contains(next)) {
				objects.add(next);
			}
		}
		return objects;
	}
}
