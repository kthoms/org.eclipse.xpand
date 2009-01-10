/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.expression;

import org.eclipse.internal.xtend.expression.ast.SyntaxElement;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class AnalysationIssue {

    public final static AnalysationIssueType INCOMPATIBLE_TYPES = new AnalysationIssueType("Incompatible types");

    public final static AnalysationIssueType UNNECESSARY_CAST = new AnalysationIssueType("Unnecessary cast");

    public final static AnalysationIssueType FEATURE_NOT_FOUND = new AnalysationIssueType("Callable not found");

    public static final AnalysationIssueType TYPE_NOT_FOUND = new AnalysationIssueType("AnalysationIssueType not found");

    public static final AnalysationIssueType INTERNAL_ERROR = new AnalysationIssueType("Internal error");

    public static final AnalysationIssueType JAVA_TYPE_NOT_FOUND = new AnalysationIssueType("Java AnalysationIssueType not found");

    public static final AnalysationIssueType SYNTAX_ERROR = new AnalysationIssueType("Syntax error");

    public static final AnalysationIssueType RESOURCE_NOT_FOUND = new AnalysationIssueType("Resource not found");

    public final static class AnalysationIssueType {
        String name;

        public AnalysationIssueType(final String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private AnalysationIssueType analysationIssueType;

    private String message;

    private SyntaxElement element;

    public AnalysationIssue(final AnalysationIssueType analysationIssueType, final String message, final SyntaxElement element) {
        this.analysationIssueType = analysationIssueType;
        this.message = message;
        this.element = element;
    }

    public SyntaxElement getElement() {
        return element;
    }

    public String getMessage() {
        return message;
    }

    public AnalysationIssueType getType() {
        return analysationIssueType;
    }

    @Override
    public String toString() {
        return "[" + analysationIssueType.name + "] - " + message + " : " + element;
    }
}
