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

import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;

/**
 * @author Sven Efftinge
 * @author Bernd Kolb
 */
public interface AnalyzeContext {

	public final static String IMPLICIT_VARIABLE = "this";

	boolean hasThis();
	Var getThis();
	Var getVariable(String varName);

	AnalyzeContext cloneWith(Var var);


	public class Var {
		public Var(AbstractTypeReference value) {
			this(IMPLICIT_VARIABLE, value);
		}

		public Var(String name, AbstractTypeReference value) {
			this.name = name;
			this.value = value;
		}

		private final String name;
		private final AbstractTypeReference value;

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @return the value
		 */
		public AbstractTypeReference getValue() {
			return value;
		}
	}
}
