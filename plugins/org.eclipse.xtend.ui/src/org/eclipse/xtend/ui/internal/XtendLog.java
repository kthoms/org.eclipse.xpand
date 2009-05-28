/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.ui.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.xtend.ui.XtendEditorPlugin;

public class XtendLog {
    public final static void logInfo(final String msg) {
        log(IStatus.INFO, IStatus.OK, msg, null);
    }

    public final static void logError(final Throwable t) {
        logError(t.getMessage(), t);
    }

    public final static void logError(final String msg, final Throwable t) {
        log(IStatus.ERROR, IStatus.OK, msg, t);
    }

    private final static void log(final int severity, final int code, final String message, final Throwable exception) {
        log(createStatus(severity, code, message, exception));
    }

    private final static IStatus createStatus(final int severity, final int code, final String message,
            final Throwable exception) {
        return new Status(severity, XtendEditorPlugin.getDefault().getBundle().getSymbolicName(), code,
                message != null ? message : "", exception);
    }

    private final static void log(final IStatus status) {
        XtendEditorPlugin.getDefault().getLog().log(status);
    }
}
