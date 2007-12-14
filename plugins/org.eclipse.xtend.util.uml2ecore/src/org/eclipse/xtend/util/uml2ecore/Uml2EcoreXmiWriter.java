/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.util.uml2ecore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

/**
 * @author Markus Völter
 */
public class Uml2EcoreXmiWriter extends AbstractWorkflowComponent {
	private String inputSlot = WorkflowContext.DEFAULT_SLOT;

	private String outputPath;

	private final Log log = LogFactory.getLog(getClass());

	public void setInputSlot(final String inputSlot) {
		this.inputSlot = inputSlot;
	}

	public String getLogMessage() {
		return "slot " + inputSlot;
	}

	public void setOutputPath(String p) {
		this.outputPath = p;
	}

	public void checkConfiguration(final Issues issues) {

	}

	protected void invokeInternal(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
		final Object slotContent = ctx.get(inputSlot);
		if (slotContent == null) {
			issues.addError(this, "slot '" + inputSlot + "' is empty.");
			return;
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		ResourceSetImpl rsImpl = new ResourceSetImpl();
		XmiWriterURIConverter uriConverter = new XmiWriterURIConverter(outputPath);
		rsImpl.setURIConverter(uriConverter);
		List<Resource> resources = new ArrayList();
		List<String> resourceNames = new ArrayList();

		if (slotContent instanceof List) {
			List list = (List) slotContent;
			for (Object object : list) {
				if (object instanceof EObject) {
					createResource(rsImpl, uriConverter, (EObject) object, resources, resourceNames);
				} else {
					issues.addError(this, "slot '" + inputSlot + "' contains non-EObject elements in the list!", object);
				}
			}
		} else if (slotContent instanceof EObject) {
			EObject model = (EObject) slotContent;
			createResource(rsImpl, uriConverter, model, resources, resourceNames);
		} else {
			issues.addError(this, "slot '" + inputSlot + "' neither contains an EList nor an EObject", slotContent);
			return;
		}

		for (int i = 0; i < resources.size(); i++) {
			Resource res = resources.get(i);
			String name = resourceNames.get(i);
			try {
				res.save(null);
				removeAbsoluteFileRefs(uriConverter, res, name);
			} catch (final IOException e) {
				throw new ConfigurationException(e);
			}

		}
	}

	private void createResource(ResourceSetImpl rsImpl, XmiWriterURIConverter uriConverter, EObject model, List<Resource> resources, List<String> resourceNames) {
		String filename = getName(model) + ".ecore";
		final URI fileURI = URI.createURI(filename);// EcoreUtil2.getURI(modelFile);
		Resource r = rsImpl.createResource(fileURI);
		log.info("writing to '" + filename + "': " + model.eClass().getName() + " named " + getName(model));
		r.getContents().add(model);
		resources.add(r);
		resourceNames.add(filename);
	}

	private String getName(EObject model) {
		return (String) model.eGet(model.eClass().getEStructuralFeature("name"));
	}

	private void removeAbsoluteFileRefs(XmiWriterURIConverter uriConverter, Resource r, String filename) {
		try {
			StringBuffer newFile = new StringBuffer();
			InputStream stream = uriConverter.createInputStream(r.getURI());
			BufferedReader br = new BufferedReader(new InputStreamReader(stream));
			while (br.ready()) {
				String s = br.readLine();
				s = s.replaceAll(filename + "#//", "#//");
				newFile.append(s + "\n");
			}
			br.close();
			stream.close();
			OutputStream s = uriConverter.createOutputStream(r.getURI());
			PrintStream ps = new PrintStream(s);
			ps.print(newFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class XmiWriterURIConverter extends URIConverterImpl {
		private String pathPrefix;

		public XmiWriterURIConverter(String pathPrefix) {
			this.pathPrefix = pathPrefix;
		}

		@Override
		protected OutputStream createFileOutputStream(String filename) throws IOException {
			return super.createFileOutputStream(tweakFilename(filename));
		}

		@Override
		protected InputStream createFileInputStream(String filename) throws IOException {
			return super.createFileInputStream(tweakFilename(filename));
		}

		private String tweakFilename(String filename) {
			if (pathPrefix != null) {
				pathPrefix = pathPrefix.replace('\\', '/');
				if (!pathPrefix.endsWith("/"))
					pathPrefix += "/";
				filename = filename.replace('\\', '/');
				int lastSlashPos = filename.lastIndexOf("/");
				if (lastSlashPos >= 0) {
					filename = filename.substring(0, lastSlashPos + 1) + pathPrefix + filename.substring(lastSlashPos + 1);
				}
			}
			return filename;
		}
	}

}
