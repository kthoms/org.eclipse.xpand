/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class XSDLog {

	public static interface XSDLogFactory {
		public Log getLog(Class<?> clazz);
	}

	private static XSDLogFactory factory = new XSDLogFactory() {
		public Log getLog(Class<?> clazz) {
			return LogFactory.getLog(clazz);
		}
	};

	public static Log getLog(Class<?> clazz) {
		return factory.getLog(clazz);
	}

	public static void setLogFactory(XSDLogFactory fac) {
		factory = fac;
	}

}
