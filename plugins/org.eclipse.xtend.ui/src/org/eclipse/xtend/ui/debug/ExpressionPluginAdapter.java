/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.ui.debug;

import static org.eclipse.internal.xtend.expression.debug.ExpressionElementAdapter.TYPE;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.emf.mwe.ui.debug.model.MWEBreakpoint;
import org.eclipse.emf.mwe.ui.debug.processing.PluginAdapter;
import org.eclipse.emf.mwe.ui.workflow.util.PluginConfigurationElementUtil;
import org.eclipse.internal.xtend.expression.ast.BooleanOperation;
import org.eclipse.internal.xtend.expression.ast.Cast;
import org.eclipse.internal.xtend.expression.ast.ChainExpression;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.FeatureCall;
import org.eclipse.internal.xtend.expression.ast.ISyntaxElement;
import org.eclipse.internal.xtend.expression.ast.IfExpression;
import org.eclipse.internal.xtend.expression.ast.LetExpression;
import org.eclipse.internal.xtend.expression.ast.OperationCall;
import org.eclipse.internal.xtend.expression.ast.SwitchExpression;
import org.eclipse.internal.xtend.expression.debug.BaseSpecialTreatment;
import org.eclipse.internal.xtend.expression.debug.EvaluatedElementWrapper;
import org.eclipse.internal.xtend.expression.debug.ExpressionModelPresentation;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.CreateExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.ExpressionExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.internal.XtendLog;
import org.eclipse.xtend.ui.XtendEditorPlugin;
import org.eclipse.xtend.ui.editor.XtendEditor;

/**
 * The IPluginAdapter implementation for Expressions.
 * 
 * @author Clemens Kadura (zAJKa)
 */
public class ExpressionPluginAdapter implements PluginAdapter {

	protected ExpressionModelPresentation pres;

	protected Set<BaseSpecialTreatment> specials = new HashSet<BaseSpecialTreatment>();

	// -------------------------------------------------------------------------

	public ExpressionPluginAdapter() {
		pres = new ExpressionModelPresentation(specials);
	}

	// -------------------------------------------------------------------------

	protected String getRequiredExtension() {
		return "ext"; // TODO: CK: high: handle chk as well
	}

	public boolean canHandleResourceExtension(String ext) {
		return getRequiredExtension().equals(ext);
	}

	public boolean canHandleType(String type) {
		return TYPE.equals(type);
	}

	public String getEditorId() {
		// TODO: CK: next: integrate Check editor
		return PluginConfigurationElementUtil.getConfigAttribute("org.eclipse.ui.editors/" + "editor[class=" + XtendEditor.class.getName() + "]/id");
	}

	public boolean isToggleBpEnabled(IResource resource, int start, int end, int line) {
		final List<ISyntaxElement> candidates = getAllElementsForExtensionAtOffset(resource, start);
		if (candidates.isEmpty())
			return false;
		ISyntaxElement element = findLastValidElementBeforeOffset(candidates, start);
		if (element == null)
			return false;

		return pres.getStart(element) <= start && pres.getStartingEndPosition(element) >= end;
	}

	public MWEBreakpoint createBreakpoint(IResource resource, int start, int end, int line) throws CoreException {
		ISyntaxElement element = findElementForPosition(resource, start, end);
		if (element == null)
			// TODO: CK: Message that no BP could be created
			return null;

		return new MWEBreakpoint(resource, element.getNameString(null), element.getLine(), pres.getStart(element), pres
				.getStartingEndPosition(element));
	}

	public IBreakpoint checkBreakpoints(IBreakpoint[] bps, IResource resource, int start, int end, int line) throws CoreException {
		ISyntaxElement element = findElementForPosition(resource, start, end);
		if (element == null)
			return null;

		for (IBreakpoint bp1 : bps) {
			MWEBreakpoint bp = (MWEBreakpoint) bp1;
			if (bp.getResource().equals(resource.getFullPath().toString()) 
					&& bp.getLine() == element.getLine()
					)
				return bp;
		}
		return null;
	}

	private ISyntaxElement findElementForPosition(IResource resource, int start, int end) {
		final List<ISyntaxElement> candidates = getAllElementsForExtensionAtOffset(resource, start);

		ISyntaxElement element = null;

		if (end == start)
			element = findLastValidElementBeforeOffset(candidates, start);
		else
			element = findFirstValidElementInLine(candidates, start, end);
		if (element == null)
			element = findLastValidElementBeforeOffset(candidates, start);
		return element;
	}

	private List<ISyntaxElement> getAllElementsForExtensionAtOffset(IResource resource, int offset) {
		final IXtendXpandProject project = Activator.getExtXptModelManager().findProject(resource.getProject().getFullPath());
		if (project != null) {
			for (IXtendXpandResource res : project.getAllRegisteredResources()) {
				if (!res.getUnderlyingStorage().equals(resource))
					continue;
				List<ISyntaxElement> candidates = collectFirstLevelElements(res);
				if (candidates.isEmpty())
					return Collections.emptyList();
				ISyntaxElement topElement = candidates.get(0);
				for (ISyntaxElement next : candidates) {
					int start = next.getStart();
					// workaround for a Antlr3 bug: some elements don't have a correct location (start is 0)
					if (start == 0) {
						System.out.println("Start is 0 for " + next.getClass().getSimpleName());
						List<ISyntaxElement> bodyElements = getBody(next);
						if (!bodyElements.isEmpty())
							start = pres.getStart(bodyElements.get(0));
					}
					if (start > offset)
						break;
					topElement = next;
				}
				return getAllContainingElements(topElement);
			}
		} else {
			XtendLog.logInfo("Couldn't create ExtXpt Project for project " + resource.getProject().getName());
		}
		return Collections.emptyList();
	}

	private List<ISyntaxElement> getAllContainingElements(ISyntaxElement parent) {
		List<ISyntaxElement> result = new ArrayList<ISyntaxElement>();
		if (parent instanceof EvaluatedElementWrapper)
			result.add(((EvaluatedElementWrapper) parent).getElement());
		else {
			List<ISyntaxElement> bodyElements = getBody(parent);
			for (ISyntaxElement element : bodyElements)
				result.addAll(getAllContainingElements(element));
		}
		return result;
	}

	private ISyntaxElement findLastValidElementBeforeOffset(List<ISyntaxElement> candidates, int offset) {
		ISyntaxElement previousValid = null;
		ISyntaxElement candidate = null;
		for (ISyntaxElement next : candidates) {
			if (isValidReturnElement(next))
				previousValid = next;
			if (pres.getStart(next) > offset) {
				if (isValidReturnElement(candidate))
					return candidate;
			}
			candidate = next;
		}
		if (isValidReturnElement(candidate))
			return candidate;
		return previousValid;
	}

	private ISyntaxElement findFirstValidElementInLine(List<ISyntaxElement> candidates, int start, int end) {
		for (ISyntaxElement next : candidates) {
			if (pres.getStart(next) > start)
				if (isValidReturnElement(next))
					return next;
			if (pres.getStart(next) > end)
				break;
		}
		return null;
	}

	// -------------------------------------------------------------------------
	// Expression specific methods

	protected List<ISyntaxElement> collectFirstLevelElements(IXtendXpandResource res) {
		List<ISyntaxElement> exts = new ArrayList<ISyntaxElement>();
		exts.addAll(((ExtensionFile) res.getExtXptResource()).getExtensions());
		exts.addAll(((ExtensionFile) res.getExtXptResource()).getArounds());
		List<ISyntaxElement> expressions = new ArrayList<ISyntaxElement>();
		for (ISyntaxElement ext : exts)
			// Hint: we don't create BP internal of Java extension statements
			// Java Debugger to be used instead
			if (ext instanceof ExpressionExtensionStatement)
				expressions.add(ext);
			else if (ext instanceof CreateExtensionStatement)
				expressions.add(ext);
			else if (ext instanceof Around)
				expressions.add(ext);
		return expressions;
	}

	protected List<ISyntaxElement> getBody(ISyntaxElement exp) {
		// Hint: we accept all kinds of body elements here, because their children could be OperationCalls
		ISyntaxElement[] body = new ISyntaxElement[0];
		if (exp instanceof IfExpression) {
			IfExpression op = (IfExpression) exp;
			body = new ISyntaxElement[] { op.getCondition(), op.getThenPart(), op.getElsePart() };
		} else if (exp instanceof OperationCall) {
			// Note: Check first for OperationCall because it extends FeatureCall
			OperationCall op = (OperationCall) exp;
			List<ISyntaxElement> kids = new ArrayList<ISyntaxElement>();
			kids.add(op.getTarget());
			kids.add(new EvaluatedElementWrapper(op));
			kids.addAll(op.getParamsAsList());
			body = kids.toArray(new ISyntaxElement[0]);
		} else if (exp instanceof FeatureCall)
			body = new ISyntaxElement[] { ((FeatureCall) exp).getTarget(), new EvaluatedElementWrapper(exp) };
		else if (exp instanceof ExpressionExtensionStatement)
			body = new ISyntaxElement[] { ((ExpressionExtensionStatement) exp).getExpression() };
		else if (exp instanceof CreateExtensionStatement)
			body = new ISyntaxElement[] { ((CreateExtensionStatement) exp).getExpression() };
		else if (exp instanceof Around)
			body = new ISyntaxElement[] { ((Around) exp).getExpression() };
		else if (exp instanceof BooleanOperation) {
			BooleanOperation op = (BooleanOperation) exp;
			body = new ISyntaxElement[] { op.getLeft(), op.getRight() };
		} else if (exp instanceof SwitchExpression) {
			SwitchExpression op = (SwitchExpression) exp;
			body = new ISyntaxElement[] { op.getSwitchExpr(), op.getDefaultExpr() };
		} else if (exp instanceof ChainExpression) {
			ChainExpression op = (ChainExpression) exp;
			body = new ISyntaxElement[] { op.getFirst(), op.getNext() };
		} else if (exp instanceof LetExpression) {
			LetExpression op = (LetExpression) exp;
			body = new ISyntaxElement[] { op.getVarExpression(), op.getTargetExpression() };
		} else if (exp instanceof Cast) {
			Cast op = (Cast) exp;
			body = new ISyntaxElement[] { op.getTarget() };
		}
		List<ISyntaxElement> result = new ArrayList<ISyntaxElement>();
		for (ISyntaxElement element : body)
			if (element != null)
				result.add(element);
		return result;
	}

	protected boolean isValidReturnElement(ISyntaxElement se) {

		return (se instanceof Expression);
	}

	// -------------------------------------------------------------------------

	private Image icon = null;

	public Image getIcon() {
		if (icon != null)
			return icon;
		IPath path = new Path("/icons/extensionfile.gif");
		InputStream is = null;
		try {
			is = FileLocator.openStream(XtendEditorPlugin.getDefault().getBundle(), path, false);
		} catch (IOException e) {
		}
		if (is != null) {
			final ImageData iData = new ImageData(is);
			icon = new Image(Display.getCurrent(), iData);
			return icon;
		}
		return null;
	}

}
