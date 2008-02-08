/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
*/
package org.eclipse.xtend.middleend.old;

import java.util.List;

import org.eclipse.internal.xpand2.model.XpandDefinition;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.FeatureCall;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.typesystem.Type;


/**
 * This class serves as a representation of an Xpand definition name. It takes
 *  care of the intricacies and ambiguities of Xpand template referencing 
 *  (fully qualified, relative, ...) by providing a normalized, canonical
 *  name.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
final class XpandDefinitionName {
    private final String _canonicalDefinitionName;
    private final String _canonicalTemplateFileName;

    
    public XpandDefinitionName (XpandDefinition def) {
        _canonicalTemplateFileName = def.getFileName();
        _canonicalDefinitionName = _canonicalTemplateFileName.substring (0, _canonicalTemplateFileName.length() - 4) + "/" + def.getName();
    }
    
    /**
     * @param rawDefName the name as it appears in Xpand code
     * @param targetType may not be null
     * @param argTypes 
     * @param ctx the XpandExecutionContext that is valid at the place from which the definition is called. This
     *   is necessary to resolve relative references.
     */
    public XpandDefinitionName (String rawDefName, Type targetType, Type[] argTypes, XpandExecutionContext ctx) {
        this (ctx.findDefinition(rawDefName, targetType, argTypes));
    }

    public XpandDefinitionName (String rawDefName, Expression target, List<Expression> args, XpandExecutionContext ctx) {
        this (rawDefName, typeForTargetExpression (target, ctx), typesForArgExpressions(args, ctx), ctx);
    }
    
    private static Type typeForTargetExpression (Expression target, XpandExecutionContext ctx) {
        if (target == null)
            target = new FeatureCall (new Identifier (ExecutionContext.IMPLICIT_VARIABLE), null); // no target is treated as a 'this' reference
        
        return new OldTypeAnalyzer().analyze (ctx, target);
    }
    
    private static Type[] typesForArgExpressions (List<Expression> args, XpandExecutionContext ctx) {
        final Type[] result = new Type[args.size()];
        for (int i=0; i<args.size(); i++)
            result[i] = new OldTypeAnalyzer().analyze (ctx, args.get(i));
        return result;
    }
    
    
    public String getCanonicalDefinitionName () {
        return _canonicalDefinitionName;
    }
    
    public String getCanonicalTemplateFileName () {
        return _canonicalTemplateFileName;
    }
    
    @Override
    public String toString () {
        return _canonicalDefinitionName;
    }

    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_canonicalDefinitionName == null) ? 0 : _canonicalDefinitionName.hashCode());
        result = prime * result + ((_canonicalTemplateFileName == null) ? 0 : _canonicalTemplateFileName.hashCode());
        return result;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final XpandDefinitionName other = (XpandDefinitionName) obj;
        if (_canonicalDefinitionName == null) {
            if (other._canonicalDefinitionName != null)
                return false;
        } else if (!_canonicalDefinitionName.equals(other._canonicalDefinitionName))
            return false;
        if (_canonicalTemplateFileName == null) {
            if (other._canonicalTemplateFileName != null)
                return false;
        } else if (!_canonicalTemplateFileName.equals(other._canonicalTemplateFileName))
            return false;
        return true;
    }
}
