/*
Copyright (c) 2005, 2007, 2009 committers of openArchitectureWare and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    committers of openArchitectureWare - initial API and implementation
 */
package org.eclipse.xtend.middleend.xpand.internal.xpandlib;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.middleend.javaannotations.AbstractExecutionContextAware;
import org.eclipse.xtend.middleend.xpand.internal.xpandlib.pr.XpandProtectedRegionResolver;
import org.eclipse.xtend.middleend.xpand.internal.xpandlib.pr.XpandProtectedRegionResolver.XpandProtectedRegion;
import org.eclipse.xtend.middleend.xpand.internal.xpandlib.pr.XpandProtectedRegionSyntaxException;

/**
 * This class is a library of functions provided by the XpandLib
 * 
 * @author André Arnold
 *
 */
public final class XpandProtectedRegionOperations extends AbstractExecutionContextAware {

	private Log log = LogFactory.getLog(XpandProtectedRegionOperations.class);

	public CharSequence XpandProtect (final CharSequence id, final CharSequence startComment, final CharSequence endComment, final boolean disabled, final CharSequence body) {
		EfficientLazyString result = new EfficientLazyString ();
		Object o = _ctx.getContributionStateContext ().retrieveState (XpandProtectedRegionResolver.XPAND_PROTECTED_REGION_RESOLVER);
		if (o != null && o instanceof XpandProtectedRegionResolver) {
			XpandProtectedRegionResolver resolver = (XpandProtectedRegionResolver) o;
			XpandProtectedRegion region = resolver.getProtectedRegion (id.toString());
			if (region == null) {
				region = resolver.createProtectedRegion (id.toString(), disabled);
	            result = EfficientLazyString.createAppendedString (result, region.getStartString(startComment.toString(), endComment.toString()));
	            result = EfficientLazyString.createAppendedString (result, body.toString());
				result = EfficientLazyString.createAppendedString (result, region.getEndString(startComment.toString(), endComment.toString()));
	        } else {
	        	result = EfficientLazyString.createAppendedString (result, region.getStartString(startComment.toString(), endComment.toString()));
	            try {
					result = EfficientLazyString.createAppendedString (result, region.getBody(startComment.toString(), endComment.toString()));
				} catch (XpandProtectedRegionSyntaxException e) {
					log.warn (e.getMessage());
				}
	            result = EfficientLazyString.createAppendedString (result, region.getEndString(startComment.toString(), endComment.toString()));
			}
		} else {
			log.warn("No protected region resolver configured!");
		}
		return result;
	}

}
