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

package org.eclipse.xtend.shared.ui.core.metamodel.jdt;

import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

public interface JdtTypeStrategy {

    public IType[] getSuperTypes(IType type) throws Exception;

    public boolean isAssignable(IType toAssignTo, IType assignableType) throws Exception;

    public boolean isGetter(IMethod method);

    public boolean isOperation(IMethod method);
    
    /**
     * Proves a field to represent a constant
     * @param field The field to check
     * @return <tt>true</tt> if the field represents a constant
     * @since 4.2
     */
    public boolean isConstant(IField field);

    public String propertyName(IMethod method);

    public String propertyName(IField field);

    public String getPropertiesInnerType(IMethod method);
}
