/*******************************************************************************
 * Copyright (c) 2005 - 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.typesystem.xsd.lib;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.typesystem.xsd.XMLReaderImpl;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class XMLReaderHelper {

	public static EObject readDocumentRoot(EObject context, String xmlFileName) {
		return XMLReaderImpl.read(context, xmlFileName, true);
	}

	public static EObject readDocumentRoot(String xmlFileName) {
		return XMLReaderImpl.read(xmlFileName, true);
	}

	public static EObject readDocumentRoot(String xmlFileName,
			String metaModelID) {
		return XMLReaderImpl.read(xmlFileName, metaModelID, true);
	}

	public static EObject readXML(EObject context, String xmlFileName) {
		return XMLReaderImpl.read(context, xmlFileName, false);
	}

	public static EObject readXML(String xmlFileName) {
		return XMLReaderImpl.read(xmlFileName, false);
	}

	public static EObject readXML(String xmlFileName, String metaModelID) {
		return XMLReaderImpl.read(xmlFileName, metaModelID, false);
	}

}
