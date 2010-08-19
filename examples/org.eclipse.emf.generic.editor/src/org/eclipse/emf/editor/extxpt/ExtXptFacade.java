/**
 * <copyright> 
 *
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   itemis AG - Initial API and implementation
 *
 * </copyright>
 *
 */
package org.eclipse.emf.editor.extxpt;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.editor.EEPlugin;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.xtend.check.CheckUtils;
import org.eclipse.xtend.expression.EvaluationException;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;

/**
 * @author Dennis Hübner - Initial contribution and API
 * 
 */
public class ExtXptFacade {

	/**
	 * @author huebner - Initial contribution and API
	 */
	private final class ExtensionResource implements Resource {
		private final String extensionFile;

		private ExtensionResource(String extensionFile) {
			this.extensionFile = extensionFile;
		}

		public String getFullyQualifiedName() {
			return null;
		}

		public void setFullyQualifiedName(final String fqn) {

		}

		public String[] getImportedNamespaces() {
			return null;
		}

		public String[] getImportedExtensions() {
			return new String[] { extensionFile };
		}
	}

	private IProject project;
	private final ExecutionContext context;

	private static final String XTEND_EXTENSION = "ext";

	public ExtXptFacade(IProject project, ExecutionContext context) {
		this.project = project;
		this.context = context;
	}

	public Object style(String extension, EObject object) {
		String extendFile = ExtendUtils.appropriateStyleFile(object);
		return evaluate(extendFile, extension, object);
	}

	/**
	 * @param extensionFile
	 * @param extensionName
	 * @param params
	 * @return
	 */
	private Object evaluate(final String extensionFile, String extensionName, Object... params) {
		Object retVal = null;
		if (extensionFileExists(extensionFile)) {
			try {
				Extension extension = findExtension(extensionFile, extensionName, params);
				if (extension != null) {
					retVal = extension.evaluate(params, context);
				}
			}
			catch (EvaluationException e) {
				//Syntax error in file
				//TODO show in editor header
				//EEPlugin.logError("Exception during extension evaluation", e);
			}
		}
		return retVal;
	}

	private Extension findExtension(String extensionFileName, String extensionName, Object... params) {
		Resource extensionResource = new ExtensionResource(extensionFileName);
		return context.cloneWithResource(extensionResource).getExtension(extensionName, params);
	}

	private boolean extensionFileExists(String resourceFQN) {
		return context.getResourceManager().loadResource(resourceFQN, XTEND_EXTENSION) != null;
	}

	// TODO split method
	public List<?> proposals(EStructuralFeature feature, EObject ctx, List<?> fromList) {
		String extFile = ExtendUtils.appropriateProposalsFile(ctx);
		List<?> retVal = new ArrayList<Object>();
		Object eval;
		if (fromList != null) {
			retVal = fromList;
			eval = evaluate(extFile, feature.getName(), ctx, fromList);
		}
		else {
			eval = evaluate(extFile, feature.getName(), ctx);
		}
		if (eval != null) {
			if (eval instanceof List<?>) {
				retVal = (List<?>) eval;
			}
			else {
				EEPlugin.logError("Returned type must be a List! File:" + extFile + ", Extension:" + feature.getName());
			}
		}
		return retVal;
	}

	public Issues check(EObject rootObject) {
		String checkFile = ExtendUtils.appropriateCheckFile(rootObject);
		List<EObject> all = new ArrayList<EObject>();
		all.add(rootObject);
		EObject rootContainer = EcoreUtil.getRootContainer(rootObject);
		TreeIterator<EObject> iter = rootContainer.eAllContents();
		while (iter.hasNext())
			all.add(iter.next());
		Issues issuesImpl = new IssuesImpl();
		IXtendXpandProject extxptProject = Activator.getExtXptModelManager().findProject(project);
		if (extxptProject != null) {
			IXtendXpandResource extxptResource = extxptProject.findExtXptResource(checkFile, CheckUtils.FILE_EXTENSION);
			if (extxptResource != null) {
				ExtensionFile file = (ExtensionFile) extxptResource.getExtXptResource();
				try {
					file.check(context, all, issuesImpl, false);
				}
				catch (IllegalArgumentException e) {
					// no extension specified ignore
				}
				catch (Exception e) {
					EEPlugin.logError("Exception during check evaluation", e);
				}
			}
		}
		else {
			EEPlugin.logWarning("Enable Xtend/Xpand-Nature for '" + project.getName() + "' to check models.");
		}
		return issuesImpl;
	}

	public IProject getProject() {
		return project;
	}
}
