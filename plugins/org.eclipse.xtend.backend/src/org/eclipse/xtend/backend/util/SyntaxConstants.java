/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.util;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface SyntaxConstants {
    String NS_DELIM = "::";
    String THIS = "this";
    
    // special function names
    String WRITE_TO_FILE = "writeToFile";
    
    String FOREACH_WITHOUT_ITERATOR = "forEach";
    String FOREACH_WITH_ITERATOR = "forEachWithIterator";
    
    // function names for operator overloading
    String OPERATOR_PLUS = "operatorPlus";
    String OPERATOR_MINUS = "operatorMinus";
    String OPERATOR_MULT = "operatorMult";
    String OPERATOR_DIV = "operatorDiv";
    String OPERATOR_MOD = "operatorMod";
}
