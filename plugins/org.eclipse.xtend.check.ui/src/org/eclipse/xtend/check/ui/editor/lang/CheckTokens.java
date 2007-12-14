/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.check.ui.editor.lang;

public class CheckTokens {

    public final static String EXTENSION = "extension";

    public final static String SWITCH = "switch";

    public final static String CASE = "case";

    public final static String DEFAULT = "default";

    public final static String NEW = "new";

    public final static String LET = "let";

    public final static String IMPORT = "import";

    public final static String TRUE_CONST = "true";

    public final static String FALSE_CONST = "false";

    public final static String NULL_CONST = "null";

    public final static String CTX = "context";

    public final static String ERR = "ERROR";

    public final static String WARN = "WARNING";

    public final static String IF = "if";

    public final static String THIS = "this";

    public final static String[] allKeywords() {
        return new String[] { EXTENSION, IMPORT, SWITCH, CASE, DEFAULT, TRUE_CONST, FALSE_CONST, NEW, NULL_CONST, IF,
                THIS, CTX, ERR, WARN, LET };
    }
}
