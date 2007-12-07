/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xpand2.output;

import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.XpandExecutionContext;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 */
public interface Output {
    public void write(String bytes);

    public void pushStatement(SyntaxElement stmt, XpandExecutionContext ctx);

    public SyntaxElement popStatement();

    public void openFile(String path, String outletName);

    public void closeFile();

	public void addOutlet(Outlet outlet);

}
