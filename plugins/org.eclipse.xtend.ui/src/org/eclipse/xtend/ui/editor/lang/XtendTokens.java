/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.ui.editor.lang;

public class XtendTokens {

    public final static String CACHED = "cached";

    public final static String CASE = "case";

    public final static String DEFAULT = "default";

    public final static String EXTENSION = "extension";

    public final static String FALSE_CONST = "false";

    public final static String IMPORT = "import";

    public final static String JAVA = "JAVA";

    public final static String WORKFLOWSLOT = "WORKFLOWSLOT";

    public final static String LET = "let";

    public final static String NEW = "new";

    public final static String NULL_CONST = "null";

    public final static String PRIVATE = "private";

    public final static String CREATE = "create";

    public final static String SWITCH = "switch";

    public final static String THIS = "this";

    public final static String TRUE_CONST = "true";

    public final static String REEXPORT = "reexport";

    public final static String AROUND = "around";
    public final static String IF = "if";
    public final static String ELSE = "else";
    
    public final static String CTX = "context";

    public final static String ERR = "ERROR";

    public final static String WARN = "WARNING";

    public final static String[] allKeywords() {
        return new String[] { CTX, ERR, WARN, PRIVATE, CREATE, REEXPORT, EXTENSION, IMPORT, SWITCH, CASE, DEFAULT, NEW, TRUE_CONST,
                FALSE_CONST, NULL_CONST, THIS, JAVA, WORKFLOWSLOT, CACHED, LET, AROUND, IF, ELSE };
    }
}
