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
package org.eclipse.xand3.analyzation;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xpand3.Identifier;
import org.eclipse.xpand3.declaration.AbstractDeclaration;
import org.eclipse.xpand3.declaration.Extension;
import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xpand3.staticTypesystem.FunctionType;

/**
 * @author Sven Efftinge
 * @author Bernd Kolb
 */
public interface AnalyzeContext {

	String IMPLICIT_VARIABLE = null;

	Map<String, ? extends AbstractTypeReference> getLocalVars();

	boolean hasThis();

	Object getThis();

	AnalyzeContext cloneWithVariable(Identifier eleName,
			AbstractTypeReference object);

	AbstractTypeReference getVariable(String varName);

	AbstractExpression getExtensionForTypes(String functionName,
			AbstractTypeReference[] paramTypes);

	FunctionType getOperationFor(AbstractTypeReference target,
			String functionName, AbstractTypeReference[] withoutFirst);

	AbstractExpression getTypeForName(Identifier typeLiteral);

	Extension findExtension(String expression,
			EList<AbstractDeclaration> declarations);

}
