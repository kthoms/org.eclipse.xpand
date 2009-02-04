/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.typesystem.emf;

import java.io.IOException;
import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtend.expression.ExecutionContextImpl;

/**
 * @author Dennis Hübner - Initial contribution and API
 * 
 */
public class PluginTests extends TestCase {
	@Override
	protected void setUp() throws Exception {
		new StandaloneSetup().setPlatformUri("..");
	}

	public final void testLoadMetaModelFile() throws IOException {
		final ExecutionContextImpl ctx = new ExecutionContextImpl();
		registerEPackagesOfModel("org.eclipse.xtend.typesystem.emf.tests/metamodels/subdir/model.xmi");
		EmfRegistryMetaModel mm = new EmfRegistryMetaModel();
		ctx.registerMetaModel(mm);
		// assertNotNull(ctx.getTypeForName("base::BaseType"));
		assertNotNull(ctx.getTypeForName("referee::SubAndReferring"));
		assertNotNull(ctx.getTypeForName("ecore::EClass"));
		assertNotNull(ctx.getTypeForName("nested::SubA"));

	}

	private void registerEPackagesOfModel(String string) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(URI.createPlatformPluginURI(string, true));
		r.load(Collections.EMPTY_MAP);
		EcoreUtil.resolveAll(rs);
		EPackage.Registry.INSTANCE.putAll(rs.getPackageRegistry());
	}

}
