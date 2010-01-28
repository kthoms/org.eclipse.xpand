/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: committers of openArchitectureWare - initial API and
 * implementation
 ******************************************************************************/
package org.eclipse.xtend.shared.ui.core.search;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.internal.xpand2.XpandUtil;
import org.eclipse.internal.xpand2.ast.AbstractDefinition;
import org.eclipse.internal.xpand2.ast.AbstractXpandVisitor;
import org.eclipse.internal.xpand2.ast.Definition;
import org.eclipse.internal.xpand2.ast.ErrorStatement;
import org.eclipse.internal.xpand2.ast.ExpandStatement;
import org.eclipse.internal.xpand2.ast.ExpressionStatement;
import org.eclipse.internal.xpand2.ast.FileStatement;
import org.eclipse.internal.xpand2.ast.ForEachStatement;
import org.eclipse.internal.xpand2.ast.IfStatement;
import org.eclipse.internal.xpand2.ast.LetStatement;
import org.eclipse.internal.xpand2.ast.ProtectStatement;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xpand2.model.XpandDefinition;
import org.eclipse.internal.xpand2.model.XpandResource;
import org.eclipse.internal.xtend.expression.ast.AbstractExpressionVisitor;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.OperationCall;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.internal.xtend.xtend.ast.AbstractExtension;
import org.eclipse.internal.xtend.xtend.ast.AbstractExtensionDefinition;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.Check;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

/**
 * Search engine for Xtend.
 * 
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Peter Friese
 * @author Darius Jockel
 */
public class XtendXpandSearchEngine {

	public class ExpressionVisitor extends AbstractExpressionVisitor {
		public Set<OperationCall> targetStatement = new HashSet<OperationCall>();
		private final IRegion region;
		
		public ExpressionVisitor(final IRegion region, Set<OperationCall> targetStatement){
			this.region = region;
			this.targetStatement = targetStatement;
		}
		@Override
		protected Object visitOperationCall(OperationCall oc) {
			if (oc.getStart()<= region.getOffset() && oc.getEnd() >= region.getOffset()+region.getLength())
				targetStatement.add(oc);
			if (oc.getTarget() != null) {
				oc.getTarget().accept(this);
			}
			if (oc.getParamsAsList() != null) {
				for (Expression expr : oc.getParamsAsList()) {
					expr.accept(this);
				}
			}
			return oc;
		}
	}
	
	public static List<Definition> findAllDefines(IXtendXpandProject project) {
		List<Definition> matches = new ArrayList<Definition>();
		IXtendXpandResource[] resources = project.getRegisteredResources();
		for (IXtendXpandResource res : resources) {

			if (res.getExtXptResource() instanceof Template) {
				Template tpl = (Template) res.getExtXptResource();
				for (XpandDefinition xdef : tpl.getDefinitions()) {
					if (xdef instanceof Definition) {
						Definition def = (Definition) xdef;
						matches.add(def);
					}
				}
			}
		}
		return matches;
	}

	public static List<SearchMatch> findAllOccurrences(IXtendXpandProject project, String identifier) {
		List<SearchMatch> matches = new ArrayList<SearchMatch>();
		IXtendXpandResource[] resources = project.getRegisteredResources();
		for (IXtendXpandResource res : resources) {

			if (res.getExtXptResource() instanceof Template) {
				Template tpl = (Template) res.getExtXptResource();
				for (XpandDefinition xdef : tpl.getDefinitions()) {
					if (xdef instanceof Definition) {
						Definition def = (Definition) xdef;
						if (def.getName().equals(identifier)) {
							int startOfDefnitionName = def.getDefName().getStart() - 1;
							int lengthOfDefinitionName = def.getDefName().getEnd() - def.getDefName().getStart();
							matches.add(new SearchMatch(startOfDefnitionName, lengthOfDefinitionName, res
									.getUnderlyingStorage()));
						}
					}
				}
				
			}

			// there is no visitor api or something similar so far, so we have
			// to use a reflective mechanism...
			Set<ExpandStatement> ops = findRec(res.getExtXptResource(), ExpandStatement.class, new HashSet<Object>());
			for (ExpandStatement expr : ops) {
				Identifier definition = expr.getDefinition();
				String definitionFQN = definition.getValue();

				int lastIndexOf = definitionFQN.lastIndexOf(identifier);
				if (lastIndexOf > -1) {
					int startOfDefinition = definition.getStart() + lastIndexOf - 1;
					int lengthOfDefinition = identifier.length();
					matches.add(new SearchMatch(startOfDefinition, lengthOfDefinition, res.getUnderlyingStorage()));

				}

			}

		}
		for (IProject p : project.getProject().getProject().getReferencingProjects()) {
			IXtendXpandProject extxptp = Activator.getExtXptModelManager().findProject(p);
			if (extxptp != null) {
				matches.addAll(findAllOccurrences(extxptp, identifier));
			}
		}
		return sort(matches);
	}

	/**
	 * Find all operation invocations for the given identifier. Ignores
	 * parameters and types as well as resource references (i.e. imports)
	 */
	public static List<SearchMatch> findReferences(IXtendXpandProject project, String identifier) {
		List<SearchMatch> matches = new ArrayList<SearchMatch>();
		IXtendXpandResource[] resources = project.getRegisteredResources();
		for (IXtendXpandResource res : resources) {
			// there is no visitor api or something similar so far, so we have
			// to use a reflective mechanism...
			Set<OperationCall> ops = findRec(res.getExtXptResource(), OperationCall.class, new HashSet<Object>());
			for (OperationCall expr : ops) {
				if (expr.getName().getValue().equals(identifier)) {
					matches.add(new SearchMatch(expr.getName().getStart(), expr.getName().getEnd() - expr.getStart()
							- 1, res.getUnderlyingStorage()));
				}
			}
		}
		for (IProject p : project.getProject().getProject().getReferencingProjects()) {
			IXtendXpandProject extxptp = Activator.getExtXptModelManager().findProject(p);
			if (extxptp != null) {
				matches.addAll(findReferences(extxptp, identifier));
			}
		}
		return sort(matches);
	}

	/**
	 * Find all extension declarations for the given identifier. Ignores
	 * parameters and types as well as resource references (i.e. imports)
	 */
	public static List<SearchMatch> findDeclarations(IXtendXpandProject project, String identifier) {
		List<SearchMatch> matches = new ArrayList<SearchMatch>();
		IXtendXpandResource[] resources = project.getRegisteredResources();
		for (IXtendXpandResource res : resources) {
			if (res.getExtXptResource() instanceof ExtensionFile) {
				ExtensionFile ef = (ExtensionFile) res.getExtXptResource();
				for (Extension ext : ef.getExtensions()) {
					if (ext instanceof AbstractExtension) {
						AbstractExtension ae = (AbstractExtension) ext;
						if (ext.getName().equals(identifier)) {
							Identifier id = ae.getNameIdentifier();
							matches.add(new SearchMatch(id.getStart(), id.getEnd() - id.getStart() + 1 /*
																										 * sorry
																										 * for
																										 * the
																										 * "+1"-hack
																										 */, res.getUnderlyingStorage()));
						}
					}
				}
				
			}
			if (res.getExtXptResource() instanceof Template) {
				Template tpl = (Template) res.getExtXptResource();
				for (XpandDefinition xdef : tpl.getDefinitions()) {
					if (xdef instanceof Definition) {
						Definition def = (Definition) xdef;
						if (def.getName().equals(identifier)) {
							matches.add(new SearchMatch(def.getDefName().getStart(), def.getDefName().getEnd()
									- def.getDefName().getStart(), res.getUnderlyingStorage()));
						}
					}
				}
				
			}
		}
		try {
			for (IProject p : project.getProject().getProject().getReferencedProjects()) {
				IXtendXpandProject extxptp = Activator.getExtXptModelManager().findProject(p);
				if (extxptp != null) {
					matches.addAll(findDeclarations(extxptp, identifier));
				}
			}
		} catch (CoreException e) {
			XtendLog.logError(e);
		}
		return sort(matches);
	}
	
	/**
	 * Find all reachable Xpand declarations by name in given template <em>resource</em> or imported templates.
	 * Type or parameters are ignored.
	 */
	public static List<AbstractDefinition> findDefinitionsByNameInResourceAndImports(IXtendXpandProject project, String identifier, XpandResource resource) {
		
		List<AbstractDefinition> matches = new ArrayList<AbstractDefinition>();
		
		//The name of the definition
		String definitionName = XpandUtil.getLastSegment(identifier);
		//If the definition qualifier is qualified, the name of the template
		String templateName = XpandUtil.withoutLastSegment(identifier);
		
		XpandExecutionContext xctx = (XpandExecutionContext)Activator.getExecutionContext(project.getProject()).cloneWithResource(resource);
		List<XpandResource> tpls = new ArrayList<XpandResource>();
		if (templateName != null && !templateName.equals(""))
		{
			XpandResource xpandResource = xctx.findTemplate(templateName);
			if (xpandResource != null)
				tpls.add(xpandResource);
		}

		if (tpls.isEmpty()) {
			List<IXtendXpandResource> xtendXpandResources = new ArrayList<IXtendXpandResource>();
			for(String name : resource.getImportedNamespaces())
				xtendXpandResources.add(Activator.getExtXptModelManager().findXtendXpandResource(
						name.replaceAll(XpandUtil.NS_DELIM, "/"),
						XpandUtil.TEMPLATE_EXTENSION));		
		
		for (IXtendXpandResource res : xtendXpandResources) {
			if (res != null && res.getExtXptResource() instanceof XpandResource) 
				tpls.add((XpandResource) res.getExtXptResource());
		}
		tpls.add(resource);
		}
		
		for (XpandResource tpl : tpls) {
			for (XpandDefinition xdef : tpl.getDefinitions()) {
				if (xdef instanceof Definition) {
					Definition def = (Definition) xdef;
					if (XpandUtil.getLastSegment(def.getName()).equals(definitionName)) {
						matches.add(def);
					}
				}
			}
		}
		
		if (!matches.isEmpty()) {
			matches.add(matches.size(), matches.get(0));
			matches.remove(0);
		}
		return matches;
	}	
	
	/**
	 * Find all reachable Extensions declarations with name <em>identifier</em> in given resource.
	 * 
	 * @return A list of extensions imported by the IXtendXpandResource <em>resource</em> with given name <em>identifier</em>
	 */
	public static List<Extension> findExtensionsByNameInResourceAndImports(IXtendXpandProject project,
			String identifier, IXtendXpandResource resource) {
		List<Extension> matches = new ArrayList<Extension>();
		ExecutionContext ctx = Activator.getExecutionContext(project.getProject());
		ctx = ctx.cloneWithResource(resource.getExtXptResource());
		final Set<? extends Extension> extensions = ctx.getAllExtensions();
		for (Extension ext : extensions) {
			if (ext.getName().equals(identifier)) {
				matches.add(ext);
			}
		}
		if (!matches.isEmpty()) {
		matches.add(matches.size(), matches.get(0));
		matches.remove(0);
		}
		return matches;
	}

	private static List<SearchMatch> sort(List<SearchMatch> searchmatches) {
		Collections.sort(searchmatches, new Comparator<SearchMatch>() {

			public int compare(SearchMatch o1, SearchMatch o2) {
				if (o1.getFile() == null) {
					return -1;
				}
				if (o2.getFile() == null) {
					return 1;
				}
				int fileCompare = o1.getFile().getName().compareTo(o2.getFile().getName());
				if (fileCompare == 0) {
					return ((Integer) o1.getOffSet()).compareTo(o2.getOffSet());
				}
				return fileCompare;
			}
		});
		return searchmatches;
	}

	@SuppressWarnings("unchecked")
	private static <T extends SyntaxElement> Set<T> findRec(Object res, Class<T> clazz, Set<Object> visitedNodes) {
		if (visitedNodes.contains(res)) {
			return Collections.emptySet();
		}
		visitedNodes.add(res);
		Set<T> result = new HashSet<T>();
		if (clazz.isInstance(res)) {
			result.add((T) res);
		}

		Class<?> instanceClass = res.getClass();
		Method[] methods = instanceClass.getMethods();
		for (Method method : methods) {
			int mod = method.getModifiers();
			if (Modifier.isPublic(mod) && !Modifier.isStatic(mod) && method.getName().startsWith("get")
					&& method.getParameterTypes().length == 0) {
				Class<?> pType = method.getReturnType();
				// if it's a SyntaxElement navigate it
				if (Collection.class.isAssignableFrom(pType) || SyntaxElement.class.isAssignableFrom(pType)) {
					Object invRes;
					try {
						invRes = method.invoke(res, new Object[] {});
						if (invRes instanceof Collection<?>) {
							for (Object o : (Collection<?>) invRes) {
								result.addAll(findRec(o, clazz, visitedNodes));
							}
						} else if (invRes != null) {
							result.addAll(findRec(invRes, clazz, visitedNodes));
						}
					} catch (Exception e) {
						XtendLog.logError(e);
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Search a template for a {@link org.eclipse.internal.xtend.expression.ast.Expression Expression} inside region.
	 * 
	 * @param hyperlinkRegion
	 * 			The region inside the template to search for
	 * @param template
	 * 			the template to search inside
	 *
	 * @return 	Iff found, the Expression, 
	 * 			else <code>null</code>
	 */
	public static OperationCall findExpressionInTemplate(final IRegion region,
			final Template template) {
		final Set<OperationCall> targetStatement = new HashSet<OperationCall>();
		AbstractDefinition[] defs = template.getAllDefinitions();
		final XtendXpandSearchEngine xxse= new XtendXpandSearchEngine();
    	for (AbstractDefinition def : defs) {
    		if (!targetStatement.isEmpty())
    			break;
    		def.accept(new AbstractXpandVisitor() {
    			@Override
    			protected Object visitExpressionStatement(ExpressionStatement node){
    				if (node.getExpression() != null)
    					node.getExpression().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				return node;
    			}
    			@Override
    			protected Object visitExpandStatement(ExpandStatement node){
    				if (node.getTarget() != null)
    					node.getTarget().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				if (node.getSeparator() != null)
    					node.getSeparator().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				if (node.getParameters() != null)
    					for (Expression param: node.getParameters()) 
    						param.accept(xxse.new ExpressionVisitor(region, targetStatement));
    				return node;
    			}
    			@Override
    			protected Object visitErrorStatement(ErrorStatement node){
    				if (node.getMessage() != null)
    					node.getMessage().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				return node;
    			}
    			@Override
    			protected Object visitFileStatement(FileStatement node){
    				if (node.getTargetFileName() != null)
    					node.getTargetFileName().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				visitChildren(node.getBodyAsList());
    				return node;
    			}
    			@Override
    			protected Object visitForEachStatement(ForEachStatement node){
    				if (node.getTarget() != null)
    					node.getTarget().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				if (node.getSeparator() != null)
    					node.getSeparator().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				visitChildren(node.getBodyAsList());
    				return node;
    			}
    			@Override
    			protected Object visitIfStatement(IfStatement node){
    				if (node.getCondition() != null)
    					node.getCondition().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				visitChildren(node.getBodyAsList());
    				visitChild(node.getElseIf());
    				return node;
    			}
    			@Override
    			protected Object visitLetStatement(LetStatement node){
    				if (node.getVarValue() != null)
    					node.getVarValue().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				visitChildren(node.getBodyAsList());
    				return node;
    			}
    			@Override
    			protected Object visitProtectStatement(ProtectStatement node){
    				if (node.getCommentStart() != null)
    					node.getCommentStart().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				if (node.getCommentEnd() != null)
    					node.getCommentEnd().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				if (node.getId() != null)
    					node.getId().accept(xxse.new ExpressionVisitor(region, targetStatement));
    				visitChildren(node.getBodyAsList());
    				return node;
    			}
    		});
    		if (!targetStatement.isEmpty())
    			return targetStatement.iterator().next();
    	}
    	return null;
	}
	
	/**
	 * Search a ExtensionFile for a {@link org.eclipse.internal.xtend.expression.ast.OperationCall OperationCall} inside region.
	 * 
	 * @param hyperlinkRegion
	 * 			The region inside the template to search for
	 * @param extensionFile
	 * 			the ExtensionFile to search inside
	 *
	 * @return 	Iff found, the OperationCall, 
	 * 			else <code>null</code>
	 */
	public static OperationCall findExpressionInExtensionFile(final IRegion region,
			final ExtensionFile extensionFile) {
		final Set<OperationCall> targetStatement = new HashSet<OperationCall>();
		final XtendXpandSearchEngine xxse= new XtendXpandSearchEngine();
		//handle Extensions
		for (Extension extension : extensionFile.getExtensions()) {
			if (!targetStatement.isEmpty())
				break;
			if (extension instanceof AbstractExtensionDefinition && extension.getStart() <= region.getOffset() && 
					extension.getEnd() >= region.getOffset()+region.getLength()) {
				AbstractExtensionDefinition abstractExtensionDefinition = (AbstractExtensionDefinition)extension;
				abstractExtensionDefinition.getExpression().accept(xxse.new ExpressionVisitor(region, targetStatement));
			}
    	}
		//handle Arounds
		for (Around around : extensionFile.getArounds()) {
			if (!targetStatement.isEmpty())
				break;
			if (around.getStart() <= region.getOffset() && 
					around.getEnd() >= region.getOffset()+region.getLength())
				around.getExpression().accept(xxse.new ExpressionVisitor(region, targetStatement));
		}
		//handle Checks
		for (Check check : extensionFile.getChecks()) {
			if (!targetStatement.isEmpty())
				break;
			if (check.getStart() <= region.getOffset() && 
					check.getEnd() >= region.getOffset()+region.getLength())
			{
			check.getMsg().accept(xxse.new ExpressionVisitor(region, targetStatement));
			check.getConstraint().accept(xxse.new ExpressionVisitor(region, targetStatement));
			if (check.getGuard() != null)
				check.getGuard().accept(xxse.new ExpressionVisitor(region, targetStatement));
			}
		}
    	return targetStatement.isEmpty()?null:targetStatement.iterator().next();
	}

	/**
	 * Search a template for a {@link org.eclipse.internal.xpand2.ast.ExpandStatement ExpandStatement} inside given region.
	 * 
	 * @param region
	 * 			The region inside the template to search for
	 * @param template
	 * 			The template to search inside
	 * 
	 * @return 	Iff found, the ExpandStatement, 
	 * 			else <code>null</code>
	 */
	public static ExpandStatement findDefinition(final String name, final IRegion region, Template template) {
		final Set<ExpandStatement> targetStatement = new HashSet<ExpandStatement>();
    	for (AbstractDefinition def : template.getAllDefinitions()) {
    		if (!targetStatement.isEmpty())
    			break;
    		def.accept(new AbstractXpandVisitor() {
    			@Override
    			protected Object visitExpandStatement(ExpandStatement node) {
    				if (node.getStart() <= region.getOffset() && 
    						node.getEnd() >= region.getOffset()+region.getLength() && 
    						node.getDefinition().getValue().contains(name.trim()))
    					targetStatement.add(node);
    				return super.visitExpandStatement(node);
    			}
    		});
    		if (!targetStatement.isEmpty())
    			return targetStatement.iterator().next();
    	}
    	return null;
	}
}
