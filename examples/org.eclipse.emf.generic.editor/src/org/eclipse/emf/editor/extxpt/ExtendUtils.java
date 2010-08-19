/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.editor.extxpt;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;

/**
 * Some helper methods.
 * 
 * @author Dennis Huebner - Initial contribution and API
 */
public class ExtendUtils {

	static final String CHECK_FILE = "Checks";
	static final String STYLE_EXT = "ItemLabelProvider";
	static final String PROPOSAL_FILE = "Proposals";

	/**
	 * Creates a Xtendlike path as String<br>
	 * i.e. given EObject EClass is package1.package2.SomeClazz,<br>
	 * This Method will returns a String package1::pakage2::
	 * 
	 * @param object
	 *            Object to investigate
	 * @return Xtend like path
	 */
	private static String path(EObject object) {
		EPackage p = object.eClass().getEPackage();
		String pPath = "";
		while (null != p) {
			pPath = p.getName() + SyntaxConstants.NS_DELIM + pPath;
			p = p.getESuperPackage();
		}
		return pPath;
	}

	/**
	 * Creates a Xtendlike path to the appropriate Check file<br>
	 * i.e. given EObject EClass is package1.package2.SomeClazz,<br>
	 * This Method will returns a String package1::pakage2::Checks
	 * 
	 * @param object
	 *            Object to investigate
	 * @return Xtend like path to the appropriate Check file
	 */
	public static String appropriateCheckFile(EObject eObject) {
		return path(eObject) + CHECK_FILE;
	}

	/**
	 * Creates a Xtendlike path to the appropriate Proposals file<br>
	 * i.e. given EObject EClass is package1.package2.SomeClazz,<br>
	 * This Method will returns a String package1::pakage2::Proposals
	 * 
	 * @param object
	 *            Object to investigate
	 * @return Xtend like path to the appropriate Proposals file
	 */
	public static String appropriateProposalsFile(EObject eObject) {
		return path(eObject) + PROPOSAL_FILE;
	}

	/**
	 * Creates a Xtendlike path to the appropriate Style file<br>
	 * i.e. given EObject EClass is package1.package2.SomeClazz,<br>
	 * This Method will returns a String package1::pakage2::ItemLabelProvider
	 * 
	 * @param object
	 *            Object to investigate
	 * @return Xtend like path to the appropriate Style file
	 */
	public static String appropriateStyleFile(EObject eObject) {
		return path(eObject) + STYLE_EXT;
	}
}
