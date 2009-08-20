package org.eclipse.xtend.middleend.xpand.internal;

import org.eclipse.internal.xpand2.model.XpandDefinition;
import org.eclipse.internal.xpand2.model.XpandResource;
import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtend.typesystem.Type;

/*
Copyright (c) 2009 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
public class XpandConverterUtil {

	/**
	 * Find a XpandDefinition based on it's name and parameter types
	 * @param ctx
	 * @param name
	 * @param target
	 * @param paramTypes
	 * @return
	 */
    public static XpandDefinition findDefinition(XpandExecutionContext ctx, final String name, final Type target, final Type[] paramTypes) {
    	XpandDefinition def = ctx.findDefinition(name, target, paramTypes);
    	if (def==null)
    		def = guessDefinition(ctx, name, target, paramTypes);
    	return def;
    }
    
    
	/**
	 * Try to find a XpandDefinition based on it's name and the number of parameters
	 * @param ctx
	 * @param name
	 * @param target
	 * @param paramTypes
	 * @return
	 */
    public static XpandDefinition guessDefinition(XpandExecutionContext ctx, final String name, final Type target, final Type[] paramTypes) {
        XpandResource tpl = null;
        if (name.indexOf(SyntaxConstants.NS_DELIM) != -1) { // local call
            tpl = ctx.findTemplate(withoutLastSegment(name));
        } else {
            tpl = (XpandResource) ctx.currentResource();
        }
        if (tpl == null)
            return null;
        XpandDefinition[] definitions = tpl.getDefinitions();
		for (int i = 0; i < definitions.length; i++) {
			final XpandDefinition def = definitions[i];
			if (def.getParams().length == paramTypes.length
					&& (name.equals(def.getQualifiedName()) || 
							name.equals(lastSegment(tpl.getFullyQualifiedName())
									+ SyntaxConstants.NS_DELIM + def.getName()) ||
									name.indexOf(SyntaxConstants.NS_DELIM) == -1 && name.equals (lastSegment (def.getName())) )) {
				return def;
			}
		}
        return null;
    }
    
    /**
     * Get the namespace of the FQN dropping the last segment of the FQN
     * @param fqn
     * @return
     */
	public static String withoutLastSegment(final String fqn) {
		if (fqn == null || fqn.lastIndexOf(SyntaxConstants.NS_DELIM) == -1)
			return null;
		return fqn.substring(0, fqn.lastIndexOf(SyntaxConstants.NS_DELIM));
	}
    
    /**
     * Get the last segment of the FQN
     * @param fqn
     * @return
     */
	public static String lastSegment(final String fqn) {
		if (fqn == null)
			return null;
		else if (fqn.lastIndexOf (SyntaxConstants.NS_DELIM) == -1)
			return fqn;
		return fqn.substring (fqn.lastIndexOf (SyntaxConstants.NS_DELIM) + SyntaxConstants.NS_DELIM.length());
	}

}
