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


package org.eclipse.xtend.ui.editor.color;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class ColorProvider {
    protected Map<RGB, Color> ivColorTable = new HashMap<RGB, Color>(10);

    public void dispose() {
        final Iterator<Color> e = ivColorTable.values().iterator();
        while (e.hasNext()) {
            e.next().dispose();
        }
    }

    public Color getColor(final RGB aRgb) {
        Color color = ivColorTable.get(aRgb);
        if (color == null) {
            color = new Color(Display.getCurrent(), aRgb);
            ivColorTable.put(aRgb, color);
        }
        return color;
    }
}
