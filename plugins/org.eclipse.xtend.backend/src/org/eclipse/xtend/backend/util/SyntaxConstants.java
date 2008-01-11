package org.eclipse.xtend.backend.util;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface SyntaxConstants {
    String NS_DELIM = "::";
    String THIS = "this";
    
    // special function names
    String CONCAT = "concat";
    
    String FOREACH_WITHOUT_ITERATOR = "forEach";
    String FOREACH_WITH_ITERATOR = "forEachWithIterator";
    
    // function names for operator overloading
    String OPERATOR_PLUS = "operatorPlus";
    String OPERATOR_MINUS = "operatorMinus";
    String OPERATOR_MULT = "operatorMult";
    String OPERATOR_DIV = "operatorDiv";
    String OPERATOR_MOD = "operatorMod";
}
