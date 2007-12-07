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
package org.eclipse.internal.xtend.expression.debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.emf.mwe.core.debug.model.NameValuePair;
import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;
import org.eclipse.emf.mwe.core.debug.processing.ElementAdapter;
import org.eclipse.internal.xtend.expression.ast.ChainExpression;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.FeatureCall;
import org.eclipse.internal.xtend.expression.ast.Literal;
import org.eclipse.internal.xtend.expression.ast.OperationCall;
import org.eclipse.internal.xtend.type.baseimpl.PolymorphicResolver;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.AbstractTypeImpl;
import org.eclipse.xtend.typesystem.Callable;
import org.eclipse.xtend.typesystem.Property;
import org.eclipse.xtend.typesystem.Type;

/**
 * The IElementAdapter implementation for expressions.
 * 
 * @author Bernd Kolb
 * @author Clemens Kadura (zAJKa)
 */
public class ExpressionElementAdapter implements ElementAdapter {

	public static final String TYPE = "expression";

	protected ExecutionContext context;

	protected ExpressionModelPresentation pres;

	protected Set<BaseSpecialTreatment> specials = new HashSet<BaseSpecialTreatment>();

	// -------------------------------------------------------------------------

	public ExpressionElementAdapter() {
		specials.add(new NoResourceSpecial());
		pres = new ExpressionModelPresentation(specials);
	}

	// -------------------------------------------------------------------------

	public ExecutionContext getContext() {
		return context;
	}

	public void setContext(Object context) {
		this.context = (ExecutionContext) context;
	}

	public String getAdapterType() {
		return TYPE;
	}

	// -------------------------------------------------------------------------

	public boolean canHandle(Object element) {
		if (element instanceof Expression)
			return true;
		if (element instanceof SyntaxElement) {
			SyntaxElement se = (SyntaxElement) element;
			return se.resource.endsWith(".ext");
		}
		return false;
	}

	public boolean shallHandle(Object element) {
		return element instanceof OperationCall && ((OperationCall) element).getName().getValue().length() > 2;
	}

	public boolean shallSuspend(Object element, int flag) {
		boolean result = true;
		for (BaseSpecialTreatment special : specials)
			result &= !(special.shallNotSuspend(element, flag, context));
		return result;
	}

	public SyntaxElement createElementTO(Object element) {
		SyntaxElement to = pres.getStartPresentation((org.eclipse.internal.xtend.expression.ast.SyntaxElement) element, context);
		for (BaseSpecialTreatment special : specials)
			special.adaptSyntaxElement(to, element);
		return to;
	}

	public boolean isSurroundingElement(Object element) {
		return false;
	}

	public SyntaxElement createEndElementTO(Object element) {
		// TODO: CK: low: decide where end location is available and set it here
		return pres.getEndPresentation((org.eclipse.internal.xtend.expression.ast.SyntaxElement) element, context);
	}

	public String getVariableDetailRep(Object element) {
		return pres.getStringRep(element);
	}

	public String getVariableSimpleRep(Object element) {
		return pres.getVariableSimpleRep(element, context);
	}

	public boolean checkVariableHasMembers(Object element) {
		if (element instanceof Collection)
			return !((Collection<?>) element).isEmpty();
		if (element instanceof Type) {
			Type t = (Type) element;
			return t.getAllProperties().size() > 0;
		}
		return context.getType(element).getAllProperties().size() > 0;
	}

	public List<NameValuePair> getVariables(Object element) {
		if (element instanceof ChainExpression || element instanceof Literal) {
			return Collections.EMPTY_LIST;
		}
		if (element instanceof OperationCall) {
			ArrayList<NameValuePair> result = getAllVisibleVariables();

			Map<String, Variable> visibleVariables = context.getVisibleVariables();

			Expression[] params = ((OperationCall) element).getParams();
			for (Expression expression : params) {
				if (expression instanceof FeatureCall && !(expression instanceof OperationCall)) {
					FeatureCall fc = (FeatureCall) expression;
					if (!visibleVariables.containsKey(fc.toString())) {
						result.addAll(evaluateFeatureCall(fc));
					}
				}
			}

			Expression target = ((OperationCall) element).getTarget();
			if (target instanceof FeatureCall && !(target instanceof OperationCall)) {
				if (!visibleVariables.containsKey(target.toString())) {
					FeatureCall fc = (FeatureCall) target;
					result.addAll(evaluateFeatureCall(fc));
				}

			}

			return result;
		}
		if (element instanceof FeatureCall) {
			return evaluateFeatureCall((FeatureCall) element);
		}
		if (element instanceof Collection) {
			List<NameValuePair> result = new ArrayList<NameValuePair>();
			Collection col = (Collection) element;
			int i = 0;
			for (Object object : col) {
				result.add(new NameValuePair("[" + i + "]", object));
				i++;
			}
			return result;
		}
		Type type = context.getType(element);
		return getAllPropertiesFor(type, element);
	}

	public Object findElement(SyntaxElement se, Object actual, int flag) {
		if (actual == null)
			return null;
		if (actual instanceof OperationCall) {
			OperationCall op = (OperationCall) actual;
			int start = pres.getStart(op);
			if (se.resource.endsWith(pres.getStringRep(op.getFileName())) && se.start == start)
				return actual;
		}
		return null;
	}

	// -------------------------------------------------------------------------

	protected ArrayList<NameValuePair> getAllVisibleVariables() {
		ArrayList<NameValuePair> result = new ArrayList<NameValuePair>();
		Map<String, Variable> visibleVariables = context.getVisibleVariables();

		for (Entry<String, Variable> nameValuePair : visibleVariables.entrySet()) {
			result.add(new NameValuePair(nameValuePair.getKey(), nameValuePair.getValue().getValue()));
		}
		return result;
	}

	private List<NameValuePair> evaluateFeatureCall(FeatureCall fc) {
		return getEvalResultProperties(fc.toString(), fc.evaluate(context.cloneWithoutMonitor()));
	}

	private List<NameValuePair> getEvalResultProperties(String prefix, Object evaluate) {
		ArrayList<NameValuePair> result = new ArrayList<NameValuePair>();
		if (evaluate instanceof Collection) {
			result.add(new NameValuePair(prefix, evaluate));
			return result;
		}
		Type type = context.getType(evaluate);
		return getAllPropertiesFor(type, evaluate);
	}

	// Hint: We don't use the AbstractTypeImpl collection of all properties, because it collects methods with the
	// same name from superclasses twice. We take only the most specialized method here (as in Java)
	// Is this a bug or intended that way in AbstractTypeImpl? (TODO: ask Sven or Arno)
	private List<NameValuePair> getAllPropertiesFor(Type type, Object element) {
		ArrayList<NameValuePair> result = new ArrayList<NameValuePair>();

		for (Property p : getAllProperties(type)) {
			String name = p.getName();
			if (!(name.equals("wait") || name.startsWith("notify"))) {
				Object value = null;
				try {
					value = p.get(element);
				} catch (Exception e) {
					value = "Error: " + e.getMessage();
				}
				if (value != null) {
					result.add(new NameValuePair(name, value));
				}
			}
		}
		return result;
	}

	// -------------------------------------------------------------------------
	// see AbstractTypeImpl

	private final Map<Type, Map<String, Callable>> typeCache = new HashMap<Type, Map<String, Callable>>();

	private Set<? extends Property> getAllProperties(Type type) {
		return PolymorphicResolver.select(getAllFeatures(type), Property.class);
	}

	public final Set<Callable> getAllFeatures(Type type) {
		Map<String, Callable> allFeatures;
		if (typeCache.containsKey(type))
			allFeatures = typeCache.get(type);
		else {
			allFeatures = new HashMap<String, Callable>();
			Callable[] contribs = ((AbstractTypeImpl) type).getContributedFeatures();
			addIfNotExist(allFeatures, Arrays.asList(contribs));
			for (Type superType : type.getSuperTypes()) {
				if (superType != null)
					addIfNotExist(allFeatures, getAllFeatures(superType));
			}
			typeCache.put(type, allFeatures);
		}
		Set<Callable> result = new HashSet<Callable>();
		result.addAll(allFeatures.values());
		return result;
	}

	private void addIfNotExist(Map<String, Callable> all, Collection<Callable> more) {
		for (Callable one : more) {
			String name = one.getName();
			if (!all.containsKey(name))
				all.put(name, one);
		}
	}

}
