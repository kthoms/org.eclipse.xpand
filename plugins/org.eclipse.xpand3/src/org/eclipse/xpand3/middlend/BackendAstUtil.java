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
package org.eclipse.xpand3.middlend;

import org.eclipse.xpand3.Identifier;
import org.eclipse.xpand3.SyntaxElement;
import org.eclipse.xtend.backend.common.SourcePos;

/**
 * @author Sven Efftinge
 * 
 */
public class BackendAstUtil {
	/**
	 * @param lit
	 * @return
	 */
	public static SourcePos getSourcePos(SyntaxElement se) {
		return new SourcePos(se.getFileName(), se.getFileName(), se.getLine());
	}

	public static String operationName(Identifier operatorIdentifier) {
		String operator = operatorIdentifier.getValue();
		if ("+".equals(operator)) {
			return "operatorPlus";
		} else if ("-".equals(operator)) {
			return "operatorMinus";
		} else if ("*".equals(operator)) {
			return "operatorMult";
		} else if ("/".equals(operator)) {
			return "operatorDiv";
		} else if ("%".equals(operator)) {
			return "operatorMod";
		} else if ("==".equals(operator)) {
			return "operatorEquals";
		} else if ("!=".equals(operator)) {
			return "operatorNotEquals";
		} else if ("<".equals(operator)) {
			return "operatorLess";
		} else if ("<=".equals(operator)) {
			return "operatorLessOrEquals";
		} else if (">".equals(operator)) {
			return "operatorGreater";
		} else if (">=".equals(operator)) {
			return "operatorGreaterOrEquals";
		} else if ("implies".equals(operator)) {
			return "operatorImplies";
		} else if ("!".equals(operator)) {
			return "operatorNot";
		}
		return null;
	}
}
