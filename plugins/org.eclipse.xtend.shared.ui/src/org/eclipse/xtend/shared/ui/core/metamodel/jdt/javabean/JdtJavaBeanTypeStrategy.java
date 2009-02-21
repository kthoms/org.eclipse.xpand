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

package org.eclipse.xtend.shared.ui.core.metamodel.jdt.javabean;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.internal.xtend.util.StringHelper;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtend.shared.ui.core.metamodel.jdt.JdtTypeStrategy;

public class JdtJavaBeanTypeStrategy implements JdtTypeStrategy {

    public JdtJavaBeanTypeStrategy (final IJavaProject project) {
        super();
    }

    public IType[] getSuperTypes(final IType type) throws JavaModelException {
        final ITypeHierarchy hier = type.newSupertypeHierarchy(new NullProgressMonitor());
        final IType[] ifs = hier.getSuperInterfaces(type);
        final IType st = hier.getSuperclass(type);
        if (st == null)
            return ifs;
        final IType[] result = new IType[ifs.length + 1];
        System.arraycopy(ifs, 0, result, 0, ifs.length);
        result[ifs.length] = st;
        return result;
    }

    public boolean isAssignable(final IType toAssigTo, final IType assignable) throws JavaModelException {
        return assignable.newSupertypeHierarchy(new NullProgressMonitor()).contains(toAssigTo);

    }

    public boolean isGetter(final IMethod method) {
        int flags;
        try {
            flags = method.getFlags();
        } catch (final JavaModelException e) {
            return false;
        }
        final String name = method.getElementName();
        if (!Flags.isStatic(flags) && method.getParameterTypes().length == 0
                && (name.startsWith("get") || name.startsWith("is")))
            return true;
        return false;
    }

    public String getterToProperty(final String elementName) {
        String propName = null;
        if (elementName.startsWith("get")) {
            propName = elementName.substring(3, elementName.length());
        } else if (elementName.startsWith("is")) {
            propName = elementName.substring(2, elementName.length());
        } else {
            return elementName;
        }
         
		if (propName.length()==1 || propName.matches("\\p{Upper}\\p{Lower}.*")) {
			propName = StringHelper.firstLower(propName);
			return propName;
		} else if (propName.length()>1) {
			return propName;
		} else {
			return elementName;
		}
    }
    
    
    /**
     * Constants are fields that are
     * <ul>
     * <li> Enumeration literals
     * <li> Accessible fields in Interfaces
     * <li> Class fields with modifier <tt>public final static</tt>
     * </ul>
     */
    public boolean isConstant(IField field) {
		try {
			if (field.isEnumConstant() || field.getDeclaringType().isInterface() || (Flags.isPublic(field.getFlags()) && Flags.isFinal(field.getFlags()) && Flags.isStatic(field.getFlags()))) {
				return true;
			}
		} catch (JavaModelException e) {
			return false;
		}
		return false;
	}

    /**
     * Operations are 
     * <ul>
     * <li>non-static methods 
     * <li>no Getter (property accessor) methods
     * </ul>
     */
	public boolean isOperation(final IMethod method) {
        if (!isGetter(method)) {
            try {
                final int flags = method.getFlags();
                if (!Flags.isStatic(flags)) {
                    return true;
                }
            } catch (final JavaModelException e) {
                return false;
            }
        }
        return false;
    }

    public String propertyName(final IMethod method) {
        return getterToProperty(method.getElementName());
    }

    public String getPropertiesInnerType(final IMethod method) {
        return null;
    }

	public String propertyName(IField field) {
		return field.getElementName();
	}
    
    

}
