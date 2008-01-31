/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.syslib;

import org.eclipse.xtend.backend.common.Helpers;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface SysLibNames {
    // special function names
    String WRITE_TO_FILE = "writeToFile";
    String REGISTER_OUTLET = "registerOutlet";
    
    String TYPE_SELECT = "typeSelect";
    
    String IMPLIES = "implies";
    
    // function names for operator overloading
    String OPERATOR_PLUS = "operatorPlus";
    String OPERATOR_MINUS = "operatorMinus";
    String OPERATOR_MULT = "operatorMult";
    String OPERATOR_DIV = "operatorDiv";
    String OPERATOR_MOD = "operatorMod";
    
    String OPERATOR_EQUALS = Helpers.EQUALS_NAME;
    String OPERATOR_NOT_EQUALS = "operatorNotEquals";
    String OPERATOR_LESS = "operatorLess";
    String OPERATOR_LESS_OR_EQUALS = "operatorLessOrEquals";
    String OPERATOR_GREATER = "operatorGreater";
    String OPERATOR_GREATER_OR_EQUALS = "operatorGreaterOrEquals";
    
    String OPERATOR_NOT = "operatorNot";
    String OPERATOR_UNARY_MINUS = "operatorMinus";
}
