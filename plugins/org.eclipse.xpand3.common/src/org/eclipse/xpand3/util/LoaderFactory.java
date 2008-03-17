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
package org.eclipse.xpand3.util;


/**
 * @author Sven Efftinge
 * 
 */
public class LoaderFactory {
	public interface LookupStrategy {
		Loader getClassLoader(Object ctx);
	}

	public static LookupStrategy strategy = new LookupStrategy() {

		public Loader getClassLoader(Object ctx) {
			return new ClassLoaderLoaderImpl(Thread.currentThread()
					.getContextClassLoader());
		}

	};

	public static Loader getClassLoader(Object ctx) {
		return strategy.getClassLoader(ctx);
	}
}
