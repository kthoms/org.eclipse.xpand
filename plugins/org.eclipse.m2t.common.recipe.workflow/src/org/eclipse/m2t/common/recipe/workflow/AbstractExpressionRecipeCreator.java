/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2t.common.recipe.workflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.MetaModel;

public abstract class AbstractExpressionRecipeCreator extends RecipeCreationComponent {

	private List<String> extensions = new ArrayList<String>();
	private List<String> imports = new ArrayList<String>();
	private List<MetaModel> metamodels = new ArrayList<MetaModel>();
	 
	public void addMetaModel(MetaModel metamodel) {
		this.metamodels.add(metamodel);
	}
	
	public void addExtension(String extension) {
		this.extensions.add(extension);
	}
	
	public void addImport(String imp) {
		this.imports.add(imp);
	}
	

	protected Collection<Check> createRecipes(Object model, String project) {
		ExecutionContextImpl ctx = new ExecutionContextImpl();
		for (MetaModel mm : metamodels) {
			ctx.registerMetaModel(mm);
		}
		ctx = (ExecutionContextImpl) ctx.cloneWithVariable(new Variable("this",model));
		ctx = (ExecutionContextImpl) ctx.cloneWithResource(new Resource() {

			public String getFullyQualifiedName() {
				return "recipe-creation";
			}

			public String[] getImportedExtensions() {
				return extensions.toArray(new String[extensions.size()]);
			}

			public String[] getImportedNamespaces() {
				return imports.toArray(new String[imports.size()]);
			}

			public void setFullyQualifiedName(String arg0) {
								
			}});
		ExpressionFacade facade = new ExpressionFacade(ctx);
		
		return internalCreateRecipes(facade,project);
	}

	protected abstract Collection<Check> internalCreateRecipes(ExpressionFacade facade, String project);
	

}
