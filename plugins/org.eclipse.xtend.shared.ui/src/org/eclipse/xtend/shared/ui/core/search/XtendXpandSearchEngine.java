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
import org.eclipse.internal.xpand2.ast.Definition;
import org.eclipse.internal.xpand2.ast.ExpandStatement;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xpand2.model.XpandDefinition;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.OperationCall;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.internal.xtend.xtend.ast.AbstractExtension;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

/**
 * Search engine for Xtend.
 * 
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Peter Friese
 */
public class XtendXpandSearchEngine {

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
				;
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
	 * finds all operation invocations for the given identifier. Ignores
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
	 * finds all extension declarations for the given identifier. Ignores
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
				;
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
				;
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
}
