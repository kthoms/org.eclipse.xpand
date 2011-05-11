/*******************************************************************************
 * Copyright (c) 2011 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend.lib;

import java.util.List;

import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.FutureResultHolder;
import org.eclipse.xtend.backend.common.Helpers;

/**
 * @author aarnold - Initial contribution and API
 */
public class Concatenator {
	
	public static EfficientLazyString append (ExecutionContext ctx, List<Object> parts) {
        EfficientLazyString result = new EfficientLazyString ();

        for (Object p: parts) {
        	if (p instanceof FutureResultHolder && !((FutureResultHolder)p).isReady())
        		result = EfficientLazyString.createAppendedString (result, p);
        	else
        		result = EfficientLazyString.createAppendedString (result, Helpers.overridableToString (ctx, p));
        }

        return result;
	}

}
