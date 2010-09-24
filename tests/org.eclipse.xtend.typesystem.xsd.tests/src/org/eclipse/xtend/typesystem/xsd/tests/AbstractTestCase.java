/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.WorkflowEngine;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.internal.core.ast.util.WorkflowFactory;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.internal.xtend.util.Pair;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtend.typesystem.xsd.util.XSDLog;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
@SuppressWarnings("restriction")
public abstract class AbstractTestCase extends TestCase {

	final static String SEPARATOR = "**************************************************************************************";

	static { // work around some wired OS X 10.5 bug
		if (Thread.currentThread().getContextClassLoader() == null)
			Thread.currentThread().setContextClassLoader(
					AbstractTestCase.class.getClassLoader());
	}

	protected Log log = XSDLog.getLog(getClass());

	private String srcgendir = null;

	protected void assertFalse(Object obj) {
		assertTrue(Boolean.FALSE.equals(obj));
	}

	protected void assertFileContents(String file, String expectedContent) {
		try {
			File f = new File(getSrcGenDir() + "/" + file);
			assertTrue(f.isFile());
			FileInputStream fs = new FileInputStream(f);
			byte b[] = new byte[fs.available()];
			fs.read(b);
			assertEquals(expectedContent, new String(b));
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	protected BufferedReader getReader(String uri) throws IOException {
		URI u = EcoreUtil2.getURI(uri);
		if (u.isRelative())
			u = URI.createFileURI(u.toString());
		InputStream in = new ExtensibleURIConverterImpl().createInputStream(u);
		return new BufferedReader(new InputStreamReader(in));
	}

	protected void assertFilesEqual(String expectedFile, String testFile) {
		try {
			BufferedReader re = getReader(getSrcGenDir() + "/" + expectedFile);
			BufferedReader rt = getReader(getSrcDir() + "/" + testFile);
			StringBuffer be = new StringBuffer();
			StringBuffer bt = new StringBuffer();
			String s;
			while((s = re.readLine()) != null) {
				be.append(s);
				be.append("\n");
			}
			while((s = rt.readLine()) != null) {
				bt.append(s);
				bt.append("\n");
			}
			assertEquals("Expected: " + expectedFile + " Actual: " + testFile,
					be.toString(), bt.toString());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	protected void assertInstanceOf(Object obj, Class<?> expectedClass) {
		assertNotNull("expected '" + expectedClass + "', got null", obj);
		assertTrue("expected '" + expectedClass + "', got '" + obj.getClass()
				+ "'", expectedClass.isInstance(obj));

	}

	protected void assertTrue(Object obj) {
		assertTrue(Boolean.TRUE.equals(obj));
	}

	protected void cleanGlobalPackageRegistry() {
		Iterator<String> i = EPackage.Registry.INSTANCE.keySet().iterator();
		while (i.hasNext())
			if (i.next().contains("www.eclipse.org/modeling/xpand/example"))
				i.remove();
	}

	protected Map<String, String> createWFParams(Pair<String, String>... values) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("src-dir", getSrcDir());
		map.put("plugin-dir", getPluginDir());
		map.put("src-gen-dir", getSrcGenDir());
		map.put("src-pkg", getSrcPkg());

		for (Pair<String, String> v : values)
			map.put(v.getFirst(), v.getSecond());
		return map;
	}

	protected Object eGet(EObject obj, String featureName) {
		assertNotNull(obj);
		EStructuralFeature f = obj.eClass().getEStructuralFeature(featureName);
		assertNotNull("Feature '" + featureName
				+ "' not found. Features available: "
				+ obj.eClass().getEAllStructuralFeatures(), f);
		return obj.eGet(f);
	}

	@SuppressWarnings("unchecked")
	protected <T> T eGet(EObject obj, String featureName, Class<T> expectedClass) {
		assertNotNull(obj);
		Object r = eGet(obj, featureName);
		assertInstanceOf(r, expectedClass);
		return (T) r;
	}

	protected void failWorkflow(String wfFile, String slot,
			Map<String, String> params) {
		WorkflowEngine runner = new WorkflowEngine();
		assertFalse(runner.run(getSrcDir() + "/" + wfFile,
				new NullProgressMonitor(), params, null));
	}

	protected String getPluginDir() {
		return "src/" + getSrcDir();
	}

	protected String getSrcDir() {
		String dir = getClass().getName();
		dir = dir.substring(0, dir.lastIndexOf("."));
		dir = dir.replace('.', '/');
		return dir;
	}

	protected String prepareWriteableDir(String dirname) {
		try {
			File dir = new File(dirname);
			if (!dir.exists() && !dir.mkdirs())
				return null;
			String testfile = dir.getCanonicalPath() + "/tmp.txt";
			FileOutputStream fo = new FileOutputStream(testfile);
			fo.write(32);
			fo.flush();
			fo.close();
			File f = new File(testfile);
			f.delete();
			return dir.getCanonicalPath();
		} catch (Exception e) {
			return null;
		}
	}

	protected String getSrcGenDir() {
		final String srcgen = "src-gen";
		if (srcgendir == null) {
			srcgendir = prepareWriteableDir(srcgen);
			if (srcgendir == null) {
				String tmp = System.getProperty("java.io.tmpdir") + "/"
						+ srcgen;
				srcgendir = prepareWriteableDir(tmp);
				if (srcgendir == null)
					throw new RuntimeException("Neither '" + srcgen + "' nor '"
							+ tmp + "' are writeable.");
			}
		}
		return srcgendir;
	}

	protected String getSrcPkg() {
		String dir = getClass().getName();
		dir = dir.substring(0, dir.lastIndexOf("."));
		dir = dir.replace(".", "::");
		return dir;
	}

	protected boolean isDirWritable(String dir) {
		try {
			String fn = dir + "/tmp.txt";
			FileOutputStream fo = new FileOutputStream(fn);
			fo.write(32);
			fo.flush();
			fo.close();
			File f = new File(fn);
			f.delete();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private void logSeparator(String msg) {
		if (msg == null)
			log.info(SEPARATOR);
		else if (SEPARATOR.length() - 4 < msg.length())
			log.info(SEPARATOR.subSequence(0, 2) + " " + msg);
		else {
			msg = " " + msg + " ";
			int left = (SEPARATOR.length() - msg.length()) / 2;
			int right = SEPARATOR.length() - left - msg.length();
			String l = SEPARATOR.substring(0, left);
			String r = SEPARATOR.substring(0, right);
			log.info(l + msg + r);
		}
	}

	protected String objToStr(Object obj, String ident) {
		String innerIdent = "  " + ident;
		if (obj instanceof EObject) {
			StringBuffer buf = new StringBuffer();
			EObject eobj = (EObject) obj;
			buf.append(eobj.getClass().getSimpleName() + " {\n");
			for (EStructuralFeature f : eobj.eClass()
					.getEAllStructuralFeatures()) {
				if (!eobj.eIsSet(f))
					continue;
				String fType = "unknown";
				String val = "???";
				if (f instanceof EReference) {
					EReference r = (EReference) f;
					if (r.isContainment()) {
						val = objToStr(eobj.eGet(f), innerIdent);
						fType = "cref";
					} else {
						val = refToStr(eobj, r);
						fType = "ref";
					}
				} else if (f instanceof EAttribute) {
					fType = "attr";
					// System.out.println(Msg.create("Path:").path(eobj));
					Object at = eobj.eGet(f);
					if (eobj != at)
						val = objToStr(at, innerIdent);
					else
						val = "<same as container object>";
				}
				String vType = f.getEType().getName();
				String name = f.getName();
				buf.append(innerIdent + fType + " " + vType + " " + name + " "
						+ val + "\n");
			}
			buf.append(ident + "}");
			return buf.toString();
		}
		if (obj instanceof Collection) {
			StringBuffer buf = new StringBuffer();
			buf.append("[\n");
			for (Object o : (Collection<?>) obj)
				buf.append(innerIdent + objToStr(o, innerIdent) + "\n");
			buf.append(ident + "]");
			return buf.toString();
		}
		if (obj != null)
			return "'" + obj + "'";
		return "null";
	}

	protected void print(Object obj) {
		log.info(objToStr(obj, "").toString());
	}

	protected String refToStr(EObject obj, EReference ref) {
		Object o = obj.eGet(ref);
		if (o instanceof EObject) {
			EObject eo = (EObject) o;

			StringBuffer buf = new StringBuffer();
			if (eo instanceof ENamedElement)
				buf.append("'" + ((ENamedElement) eo).getName() + "' ");
			buf.append("ref:" + EcoreUtil.getURI(eo));
			return buf.toString();
		}
		return "?????";
	}

	protected void runWorkflow(String wfFile, Map<String, String> params) {
		runWorkflow(wfFile, null, params);
	}

	protected void runWorkflow(String wfFile, Pair<String, String>... values) {
		runWorkflow(wfFile, null, createWFParams(values));
	}

	protected Object runWorkflow(String wfFile, String slot,
			Map<String, String> params) {
		if (wfFile.startsWith("/"))
			wfFile = wfFile.substring(1);
		else
			wfFile = getSrcDir() + "/" + wfFile;
		final Issues issues = new IssuesImpl();
		try {
			final WorkflowContext ctx = new WorkflowContextDefaultImpl();
			final WorkflowFactory factory = new WorkflowFactory();
			final Workflow workflow = factory.parseInitAndCreate(wfFile,
					params, WorkflowFactory.getDefaultConverter(), issues);
			assertNotNull(issues.toString(), workflow);
			if (issues.hasErrors())
				fail(issues.toString());
			workflow.checkConfiguration(issues);
			if (issues.hasErrors())
				fail(issues.toString());
			workflow.invoke(ctx, new NullProgressMonitor(), issues);
			if (issues.hasErrors())
				fail(issues.toString());
			return (slot == null) ? null : ctx.get(slot);
		} catch (IllegalArgumentException e) {
			throw new RuntimeException(issues.toString(), e);
		}
	}

	protected Object runWorkflow(String wfFile, String slot,
			Pair<String, String>... values) {
		return runWorkflow(wfFile, slot, createWFParams(values));
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new Object();

		// System.out.println(EPackage.Registry.INSTANCE);

		StandaloneSetup setup = new StandaloneSetup();
		setup.setPlatformUri("..");

		logSeparator(null);
		logSeparator("running " + getClass().getSimpleName() + "::" + getName());
		logSeparator(null);
		cleanGlobalPackageRegistry();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		logSeparator("finished " + getClass().getSimpleName() + "::"
				+ getName());
		log.info("");
	}

}
