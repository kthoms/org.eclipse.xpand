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
package org.eclipse.xand3.analyzation.typesystem;

import org.eclipse.xand3.analyzation.TypeSystem;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.StaticTypesystemFactory;
import org.eclipse.xpand3.staticTypesystem.WildcardType;

/**
 * @author Sven Efftinge
 *
 */
public abstract class AbstractTypeSystemImpl implements TypeSystem {
	
	protected StaticTypesystemFactory FACTORY = StaticTypesystemFactory.eINSTANCE;
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.TypeSystem#wildCardWithLower(org.eclipse.xpand3.staticTypesystem.AbstractTypeReference[])
	 */
	public WildcardType wildCardWithLower(AbstractTypeReference... lowerBounds) {
		WildcardType wildCard = wildCard();
		for (AbstractTypeReference abstractTypeReference : lowerBounds) {
			wildCard.getLowerBounds().add(abstractTypeReference);
		}
		return wildCard;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.TypeSystem#wildCard(org.eclipse.xpand3.staticTypesystem.AbstractTypeReference[])
	 */
	public WildcardType wildCard(AbstractTypeReference... upperBounds) {
		WildcardType wildCard = FACTORY.createWildcardType();
		for (AbstractTypeReference abstractTypeReference : upperBounds) {
			wildCard.getLowerBounds().add(abstractTypeReference);
		}
		return wildCard;
	}
}
