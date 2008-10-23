///**
// * <copyright> 
// *
// * Copyright (c) 2008 itemis AG and others.
// * All rights reserved.   This program and the accompanying materials
// * are made available under the terms of the Eclipse Public License v1.0
// * which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// * 
// * Contributors: 
// *   itemis AG - Initial API and implementation
// *
// * </copyright>
// *
// */
//package org.eclipse.emf.editor.oaw;
//
//import org.eclipse.core.resources.IProject;
//import org.eclipse.core.resources.IResource;
//import org.eclipse.xtend.expression.Resource;
//import org.eclipse.xtend.expression.ResourceManager;
//import org.eclipse.xtend.expression.ResourceParser;
//
//
///**
// * @author Dennis Huebner
// * 
// */
//public class WorkspaceResourceManager implements ResourceManager {
//
//	private IProject project;
//
//	public WorkspaceResourceManager(IProject p) {
//		this.project = p;
//	}
//
//	/* (non-Javadoc)
//	 * @see org.eclipse.xtend.expression.ResourceManager#loadResource(java.lang.String, java.lang.String)
//	 */
//	public Resource loadResource(String fullyQualifiedName, String extension) {
//		IResource oawResource = project.findOawResource(fullyQualifiedName,
//				extension);
//		if (oawResource != null)
//			return oawResource.getOawResource();
//		return null;
//	}
//
//	public void registerParser(String template_extension, ResourceParser parser) {
//		// not needed
//	}
//
//	public void setFileEncoding(String fileEncoding) {
//		// not needed
//	}
//
//}
