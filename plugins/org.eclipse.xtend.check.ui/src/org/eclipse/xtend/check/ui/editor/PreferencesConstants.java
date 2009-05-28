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

package org.eclipse.xtend.check.ui.editor;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;

public class PreferencesConstants {

    public static final String HIGHLIGHT_KEYWORDS = "hl_keywords";

    public static final String HIGHLIGHT_STRING = "hl_string";

    public static final String HIGHLIGHT_COMMENT = "hl_comment";

    public static final String HIGHLIGHT_OTHER = "hl_other";

    public final static void initializeDefaultValues(final IPreferenceStore store) {
        PreferenceConverter.setDefault(store, HIGHLIGHT_KEYWORDS, new RGB(127, 0, 85));
        PreferenceConverter.setDefault(store, HIGHLIGHT_STRING, new RGB(42, 0, 255));
        PreferenceConverter.setDefault(store, HIGHLIGHT_COMMENT, new RGB(63, 127, 95));
        PreferenceConverter.setDefault(store, HIGHLIGHT_OTHER, new RGB(0, 0, 0));
    }

}
