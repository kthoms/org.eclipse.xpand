/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend;

import java.io.StringReader;
import java.util.Set;

import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.expression.TypeSystemImpl;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.Type;

public class XtendFacade {

    private ExecutionContext ctx;

    private XtendFacade(final ExecutionContext ctx) {
        this.ctx = ctx;
    }
    
    public final XtendFacade cloneWithExtensions(String extensionCode) {
        return new XtendFacade( ctx.cloneWithResource(parse(extensionCode)));
    }
    
    public final void registerMetaModel(final MetaModel mm) {
    	if (ctx instanceof ExecutionContextImpl) {
    		((ExecutionContextImpl) ctx).registerMetaModel(mm);
    	} else {
    		throw new IllegalStateException("Couldn't register Metamodel - ExecutionContextImpl expected.");
    	}
    }
    
    private ExtensionFile parse(final String extFile) {
    	return ParseFacade.file(new StringReader(extFile), "nofile");
    }

    public final static XtendFacade create(final String... extFile) {
        return create(new ExecutionContextImpl(new TypeSystemImpl()),extFile);
    }
    
    public final static XtendFacade create(ExecutionContext ctx,final String... extFile) {
    	ctx = ctx.cloneWithResource(new Resource() {
    		
    		public String getFullyQualifiedName() {
    			return null;
    		}
    		
    		public void setFullyQualifiedName(final String fqn) {
    			
    		}
    		
    		public String[] getImportedNamespaces() {
    			return null;
    		}
    		
    		public String[] getImportedExtensions() {
    			return extFile;
    		}
    	});
    	return new XtendFacade(ctx);
    }

    public Object call(final String ext, Object... params) {
        if (params==null)
            params = new Object[] {null};
        final Extension extension = ctx.getExtension(ext, params);
        if (extension == null)
            throw new IllegalArgumentException("Couldn't find extension " + ext);
        return extension.evaluate(params, ctx);
    }

    public Type analyze(final String string, Object[] objects, final Set<AnalysationIssue> issues) {
        if (objects == null) {
            objects = new Object[0];
        }
        final Extension extension = ctx.getExtension(string, objects);
        final Type[] params = new Type[objects.length];
        for (int i = 0; i < params.length; i++) {
            params[i] = ctx.getType(objects[i]);
        }
        return extension.getReturnType(params, ctx, issues);
    }
}
