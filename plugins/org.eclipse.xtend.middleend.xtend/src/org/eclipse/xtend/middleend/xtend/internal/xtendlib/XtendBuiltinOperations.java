package org.eclipse.xtend.middleend.xtend.internal.xtendlib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.xtend.backend.aop.ThisJoinPoint;
import org.eclipse.xtend.backend.aop.ThisJoinPointStaticPart;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.Property;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.common.StaticProperty;
import org.eclipse.xtend.backend.common.SyntaxConstants;
import org.eclipse.xtend.backend.syslib.CollectionOperations;
import org.eclipse.xtend.backend.syslib.SysLibNames;
import org.eclipse.xtend.backend.types.builtin.CollectionType;
import org.eclipse.xtend.backend.types.builtin.FunctionType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.types.builtin.PropertyType;
import org.eclipse.xtend.backend.types.builtin.StaticPropertyType;
import org.eclipse.xtend.backend.types.emf.EObjectType;
import org.eclipse.xtend.backend.types.java.internal.JavaBeansType;
import org.eclipse.xtend.middleend.javaannotations.AbstractExecutionContextAware;
import org.eclipse.xtend.middleend.javaannotations.M2tCached;

public class XtendBuiltinOperations extends AbstractExecutionContextAware {

	@SuppressWarnings("unchecked")
	public Long xtendCompareTo (Object target, Object o) {
        if (target == null)
            return o == null ? new Long(0) : new Long(-1);
        if (o == null)
            return new Long(1);
        if (target instanceof Comparable)
            return new Long(((Comparable<Object>) target).compareTo(o));
        else {
        	final String s1 = (String)_ctx.getFunctionDefContext ().invoke (_ctx, new QualifiedName ("toString"), Arrays.asList(target));
        	final String s2 = (String)_ctx.getFunctionDefContext ().invoke (_ctx, new QualifiedName ("toString"), Arrays.asList(target));
            return new Long(s1.compareTo(s2));
        }
	}

	public BackendType XtendMetaType (Object o) {
        return _ctx.getTypesystem().findType(o);
	}
	
	@M2tCached
	public String XtendStringReplaceFirst (String s, String regex, String replacement) {
        return s.replaceFirst(regex, replacement);
	}
	
	@M2tCached
	public List<Long> XtendUpto (Long target, Long v) {
        final List<Long> result = new ArrayList<Long>();
        Long l1 = target;
        while (l1.compareTo(v) <= 0) {
            result.add(l1);
            l1 = l1++;
        }
        return result;
	}
	
	@M2tCached
	public List<Integer> XtendUpto (Integer target, Integer v) {
        final List<Integer> result = new ArrayList<Integer>();
        Integer l1 = target;
        while (l1.compareTo(v) <= 0) {
            result.add(l1);
            l1++;
        }
        return result;
	}
	
	@M2tCached
	public List<Long> XtendUpto (Long target, Long v, Long inc) {
        final List<Long> result = new ArrayList<Long>();
        Long l1 = target;
        while (l1.compareTo(v) <= 0) {
            result.add(l1);
            l1 = l1 + inc;
        }
        return result;
	}
	
	@M2tCached
	public List<Integer> XtendUpto (Integer target, Integer v, Integer inc) {
        final List<Integer> result = new ArrayList<Integer>();
        Integer l1 = target;
        while (l1.compareTo(v) <= 0) {
            result.add(l1);
            l1 = l1 + inc;
        }
        return result;
	}
	
	public Set<StaticProperty> XtendTypeAllStaticProperties (BackendType target) {
		Set<StaticProperty> result = new HashSet<StaticProperty>();
		result.addAll (target.getStaticProperties ().values());
		for (BackendType superType : target.getSuperTypes()) {
			result.addAll (superType.getStaticProperties ().values());
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public Set XtendTypeAllFeatures (BackendType target) {
		Set result = new HashSet ();
		result.addAll (XtendTypeAllProperties (target));
		result.addAll (XtendTypeAllOperations (target));
		result.addAll (XtendTypeAllStaticProperties (target));
		return result;
	}

	public Set<NamedFunction> XtendTypeAllOperations (BackendType target) {
		Set<NamedFunction> result = new HashSet<NamedFunction>();
		Collection<? extends NamedFunction> builtinOps = target.getBuiltinOperations();
		for (NamedFunction f : builtinOps) {
			if (isXtendOperation(target, f))
				result.add (f);
		}
		result.addAll(target.getBuiltinOperations());
		Collection<? extends BackendType> superTypes = target.getSuperTypes();
		for (BackendType backendType : superTypes) {
			Collection<? extends NamedFunction> superTypeOps = backendType.getBuiltinOperations();
			Collection<NamedFunction> funcs =_ctx.getFunctionDefContext().getByFirstParameterType (backendType);
			for (NamedFunction namedFunction : funcs) {
				if (isXtendOperation(target, namedFunction))
					result.add (namedFunction);
			}
		}
		return result;
	}

	public Set<Object> XtendTypeAllProperties (BackendType target) {
		Set<Object> result = new HashSet<Object>();
		result.addAll (target.getProperties (_ctx).values());
		for (BackendType superType : target.getSuperTypes()) {
			result.addAll (superType.getProperties (_ctx).values());
		}
		Set<NamedFunction> accessors = XtendTypeAllOperations (target);
		for (NamedFunction accessorFunc : accessors) {
			if (isFunctionBackedProperty (accessorFunc))
				result.add (accessorFunc);
		}
		return result;
	}

	public Set<BackendType> XtendTypeSuperTypes (BackendType target) {
		Set<BackendType> result = new HashSet<BackendType>();
		result.addAll(target.getSuperTypes());
		return result;
	}
	
	public String XtendTypeDocumentation (BackendType target) {
		return "";
	}
	
	public String XtendTypeDocumentation (Object target) {
		return "";
	}
	
	public String XtendTypeDocumentation (EObjectType target) {
		return "base type for all ecore based metamodels (added by oAW4 emftools)";
	}
	
	public String XtendTypeDocumentation (JavaBeansType target) {
		return "";
	}
	
	public String XtendTypeDocumentation (NamedFunction target) {
		return "";
	}
	
	public String XtendTypeDocumentation (Property target) {
		return "";
	}
	
	public String XtendTypeDocumentation (StaticProperty target) {
		return "";
	}

	public Object XtendTypeGetProperty (BackendType target, String propertyName) {
		final QualifiedName xtendNameFunc = new QualifiedName (XtendLibNames.OPERATION_NAME);
		for (Property prop : target.getProperties (_ctx).values()) {
			final String name = (String) _ctx.getFunctionDefContext().invoke(_ctx, xtendNameFunc, Arrays.asList(prop));
			if (propertyName.equals(name))
				return prop;
		}
		for (BackendType superType : XtendTypeSuperTypes(target)) {
			for (Property prop : superType.getProperties (_ctx).values()) {
				final String name = (String) _ctx.getFunctionDefContext().invoke(_ctx, xtendNameFunc, Arrays.asList(prop));
				if (propertyName.equals(name))
					return prop;
			}
		}
		NamedFunction builtinFunc = XtendTypeGetOperation(target, propertyName, new ArrayList<BackendType>());
		if (isXtendOperation(target, builtinFunc))
			return builtinFunc;
		return null;
	}
	
	public Object XtendTypeGetFeature (BackendType target, String featureName, List<BackendType> paramTypes) {
		final QualifiedName xtendNameFunc = new QualifiedName (XtendLibNames.OPERATION_NAME);
		for (Property prop : target.getProperties (_ctx).values()) {
			final String name = (String) _ctx.getFunctionDefContext().invoke(_ctx, xtendNameFunc, Arrays.asList(prop));
			if (featureName.equals(name))
				return prop;
		}
		for (StaticProperty staticProp : target.getStaticProperties().values()) {
			final String name = (String) _ctx.getFunctionDefContext().invoke(_ctx, xtendNameFunc, Arrays.asList(staticProp));
			if (featureName.equals(name))
				return staticProp;
		}
		NamedFunction builtinFunc = XtendTypeGetOperation(target, featureName, paramTypes);
		if (builtinFunc != null)
			return builtinFunc;
		for (BackendType superType : XtendTypeSuperTypes(target)) {
			for (Property prop : superType.getProperties (_ctx).values()) {
				final String name = (String) _ctx.getFunctionDefContext().invoke(_ctx, xtendNameFunc, Arrays.asList(prop));
				if (featureName.equals(name))
					return prop;
			}
			for (StaticProperty staticProp : target.getStaticProperties().values()) {
				final String name = (String) _ctx.getFunctionDefContext().invoke(_ctx, xtendNameFunc, Arrays.asList(staticProp));
				if (featureName.equals(name))
					return staticProp;
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public NamedFunction XtendTypeGetOperation (BackendType target, String functionName, List<BackendType> paramTypes) {
		List<BackendType> pTypes = new LinkedList<BackendType>();
		pTypes.add(0, target);
		pTypes.addAll(paramTypes);
		String convertedName = toBackendBuiltinFeatureName (functionName);
		if (convertedName == null)
			convertedName = functionName;
		Collection<NamedFunction> canditates = (Collection<NamedFunction>) _ctx.getFunctionDefContext().invoke (_ctx, new QualifiedName (XtendLibNames.TYPE_ALL_OPERATIONS), Arrays.asList (target));
		canditates.addAll (_ctx.getFunctionDefContext ().getByFirstParameterType (target));
		Function matchedInnerFunc = _ctx.getFunctionDefContext ().getMatch (_ctx, new QualifiedName (functionName), pTypes);
		if (matchedInnerFunc == null) 
			matchedInnerFunc  = _ctx.getFunctionDefContext ().getMatch (_ctx, new QualifiedName ( convertedName), pTypes);
		for (NamedFunction f : canditates) {
			if (f.getFunction().equals (matchedInnerFunc))
				return f;
		}
		//TODO Exception handling
		return null; 
	}

	public List<? extends BackendType> XtendOperationGetParameterTypes (NamedFunction target) {
		List<? extends BackendType> params = target.getFunction().getParameterTypes ();
		return params.subList (1, params.size ());
	}
	
	@SuppressWarnings("unchecked")
	public Object XtendOperationEvaluate (NamedFunction f, Object target, List params) {
		params.add(0, target);
		return _ctx.getFunctionInvoker().invoke(_ctx, f.getFunction(), params);
	}
	
	public BackendType XtendFeatureReturnType (NamedFunction f) {
		return f.getFunction().getReturnType();
	}
	public BackendType XtendFeatureReturnType (Property p) {
		return p.getType (_ctx.getTypesystem());
	}
	public BackendType XtendFeatureReturnType (StaticProperty p) {
		return p.getType ();
	}
	
	public BackendType XtendFeatureOwner (Property target) {
		return target.getOwner();
	}
	
	public BackendType XtendFeatureOwner (StaticProperty target) {
		return target.getOwner();
	}
	
	public BackendType XtendFeatureOwner (NamedFunction target) {
		return target.getFunction().getParameterTypes().get(0);
	}
	
	public Object XtendName (NamedFunction f) {
		final String name = f.getName().getFullQualifiedName();
		final String xpandName = toXpandBuiltinFeatureName(name);
		if (xpandName != null)
			return xpandName;
		return name;
	}
	
	public Object XtendName (Property p) {
		final String name = p.getName();
		final String xpandName = toXpandBuiltinFeatureName(name);
		if (xpandName != null)
			return xpandName;
		return name;
	}
	
	public Object XtendName (StaticProperty p) {
		final String name = p.getName();
		final String xpandName = toXpandBuiltinFeatureName(name);
		if (xpandName != null)
			return xpandName;
		return name;
	}

	public Object XtendName (Object target) {
        final BackendType t = _ctx.getTypesystem().findType (target);
        
        if (CollectionType.INSTANCE.isAssignableFrom(t)) {
            if (isProperty (_ctx, t, "name"))
                return t.getProperty (_ctx, target, "name");
            
            final Collection<Object> result = CollectionOperations.createMatchingCollection ((Collection<?>) target);

            for (Object obj: (Collection<?>) target) {
            	Object[] args = {obj};
				CollectionOperations.addFlattened(result,
						_ctx.getFunctionDefContext()
								.getMatch(_ctx, new QualifiedName (XtendLibNames.OPERATION_NAME), Arrays.asList (_ctx.getTypesystem().findType (obj)))
									.invoke(_ctx, args));
            }

            return result;
        }
        else
            return t.getProperty (_ctx, target, "name");
	}
	
	public List<?> adviceCtxParamValues (ThisJoinPoint jp) {
		return jp.getParameters();
	}

	public List<? extends BackendType> adviceCtxParamTypes (ThisJoinPoint jp) {
		final ThisJoinPointStaticPart joinPointStaticPart = (ThisJoinPointStaticPart) _ctx.getLocalVarContext ().getLocalVars ().get (SyntaxConstants.THIS_JOINPOINT_STATICPART);
		if (joinPointStaticPart != null)
			return joinPointStaticPart.getFunction().getParameterTypes();
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<String> adviceCtxParamNames (ThisJoinPoint jp) {
		final ThisJoinPointStaticPart joinPointStaticPart = (ThisJoinPointStaticPart) _ctx.getLocalVarContext ().getLocalVars ().get (SyntaxConstants.THIS_JOINPOINT_STATICPART);
		if (joinPointStaticPart != null) {
			return (List<String>) _ctx.getFunctionDefContext().invoke (_ctx, new QualifiedName (SysLibNames.OPERATION_PARAM_NAMES), Arrays.asList(joinPointStaticPart.getFunction()));
		}
		return null;
	}
	
	public String xtendDefinitionName (ThisJoinPoint jp) {
		final ThisJoinPointStaticPart joinPointStaticPart = (ThisJoinPointStaticPart) _ctx.getLocalVarContext ().getLocalVars ().get (SyntaxConstants.THIS_JOINPOINT_STATICPART);
		if (joinPointStaticPart != null) {
			Function f = joinPointStaticPart.getFunction();
			BackendType targetType = f.getParameterTypes().get(0);
			Collection<NamedFunction> canditates = _ctx.getFunctionDefContext().getByFirstParameterType(targetType);
			for (NamedFunction namedFunction : canditates) {
				if (namedFunction.getFunction ().equals (f))
					return namedFunction.getName ().getFullQualifiedName();
			}
		}
		return null;
	}
	
	public Object xtendDefinitionToString (ThisJoinPoint jp) {
		if (jp.getParameters().size() > 0) {
			Object target = jp.getParameters().get(0);
			return _ctx.getFunctionDefContext().invoke(_ctx, new QualifiedName ("toString"), Arrays.asList(target));
		}
		return null;
	}
	
	public String adviceCtxName (ThisJoinPoint jp) {
		final ThisJoinPointStaticPart joinPointStaticPart = (ThisJoinPointStaticPart) _ctx.getLocalVarContext ().getLocalVars ().get (SyntaxConstants.THIS_JOINPOINT_STATICPART);
		if (joinPointStaticPart != null) {
			return joinPointStaticPart.getFunctionName ().getFullQualifiedName();
		}
		return null;
	}
	
	public List<? extends BackendType> xtendDefinitionParamTypes (ThisJoinPoint jp) {
		final ThisJoinPointStaticPart joinPointStaticPart = (ThisJoinPointStaticPart) _ctx.getLocalVarContext ().getLocalVars ().get (SyntaxConstants.THIS_JOINPOINT_STATICPART);
		if (joinPointStaticPart != null) {
			List<? extends BackendType> parameterTypes = joinPointStaticPart.getFunction().getParameterTypes();
			return parameterTypes.subList(1, parameterTypes.size());
		}
		return null;
	}
	
	public BackendType adviceCtxTargetType (ThisJoinPoint jp) {
		final ThisJoinPointStaticPart joinPointStaticPart = (ThisJoinPointStaticPart) _ctx.getLocalVarContext ().getLocalVars ().get (SyntaxConstants.THIS_JOINPOINT_STATICPART);
		if (joinPointStaticPart != null) {
			List<? extends BackendType> parameterTypes = joinPointStaticPart.getFunction().getParameterTypes();
			if (parameterTypes != null && parameterTypes.size() > 0)
				return parameterTypes.get(0);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<String> xtendDefinitionParamNames (ThisJoinPoint jp) {
		final ThisJoinPointStaticPart joinPointStaticPart = (ThisJoinPointStaticPart) _ctx.getLocalVarContext ().getLocalVars ().get (SyntaxConstants.THIS_JOINPOINT_STATICPART);
		if (joinPointStaticPart != null) {
			List<String> paramNames = (List<String>) _ctx.getFunctionDefContext().invoke (_ctx, new QualifiedName (SysLibNames.OPERATION_PARAM_NAMES), Arrays.asList(joinPointStaticPart.getFunction()));
			if (paramNames != null)
				return paramNames.subList(1, paramNames.size());
		}
		return null;
	}
	
	public Object XtendName (ThisJoinPoint jp) {
		final ThisJoinPointStaticPart joinPointStaticPart = (ThisJoinPointStaticPart) _ctx.getLocalVarContext ().getLocalVars ().get (SyntaxConstants.THIS_JOINPOINT_STATICPART);
		if (joinPointStaticPart != null)
			return joinPointStaticPart.getFunctionName().getFullQualifiedName();
		return null;
	}
	
    private boolean isProperty (ExecutionContext ctx, BackendType t, String propName) {
        return t.getProperties(ctx).containsKey (propName);
    }
    
    private boolean isFunctionBackedProperty (NamedFunction f) {
    	BackendType targetType = f.getFunction().getParameterTypes().get(0);
    	if (f.getName().getFullQualifiedName().equals (XtendLibNames.OPERATION_NAME)) {
    		if (targetType.equals(ObjectType.INSTANCE))
    			return false;
    		else
    			return true;
    	}
    	if (f.getName().getFullQualifiedName().equals(XtendLibNames.OBJECT_META_TYPE))
    		return true;
    	if (f.getName().getFullQualifiedName().equals(XtendLibNames.ITERATOR_ELEMENTS))
    		return true;
    	if (f.getName().getFullQualifiedName().equals(XtendLibNames.TYPE_ALL_FEATURES))
    		return true;
    	if (f.getName().getFullQualifiedName().equals(XtendLibNames.TYPE_ALL_OPERATIONS))
    		return true;
    	if (f.getName().getFullQualifiedName().equals(XtendLibNames.TYPE_ALL_PROPERTIES))
    		return true;
    	if (f.getName().getFullQualifiedName().equals(XtendLibNames.TYPE_ALL_STATIC_PROPERTIES))
    		return true;
    	if (f.getName().getFullQualifiedName().equals(XtendLibNames.TYPE_SUPER_TYPES))
    		return true;
    	return false;
    }
    
    private boolean isXtendOperation (BackendType target, NamedFunction f) {
    	BackendType funcTargetType = f.getFunction().getParameterTypes().get(0);
    	if (f.getName().getFullQualifiedName().equals (XtendLibNames.OPERATION_NAME)) {
    		if (FunctionType.INSTANCE.isAssignableFrom(funcTargetType))
    			return true;
    		else if (PropertyType.INSTANCE.isAssignableFrom(funcTargetType))
    			return true;
    		else if (StaticPropertyType.INSTANCE.isAssignableFrom(funcTargetType))
    			return true;
    		else
    			return false;
    	}
    	if (f.getName().getFullQualifiedName().equals("concat") && funcTargetType.equals(ObjectType.INSTANCE) && !target.getBuiltinOperations().contains(f))
    		return false;
    	return true;
    }
    	
	private String toBackendBuiltinFeatureName (final String name) {
		if (name.equals ("name"))
			return XtendLibNames.OPERATION_NAME;
		if (name.equals ("metaType"))
			return XtendLibNames.OBJECT_META_TYPE;
		if (name.equals ("allFeatures"))
			return XtendLibNames.TYPE_ALL_FEATURES;
		if (name.equals ("allOperations"))
			return XtendLibNames.TYPE_ALL_OPERATIONS;
		if (name.equals ("allProperties"))
			return XtendLibNames.TYPE_ALL_PROPERTIES;
		if (name.equals ("elements"))
			return XtendLibNames.ITERATOR_ELEMENTS;

		if (name.equals ("<"))
			return SysLibNames.OPERATOR_LESS;
		if (name.equals (">"))
			return SysLibNames.OPERATOR_GREATER;
		if (name.equals ("<="))
			return SysLibNames.OPERATOR_LESS_OR_EQUALS;
		if (name.equals(">="))
			return SysLibNames.OPERATOR_GREATER_OR_EQUALS;
		if (name.equals ("=="))
			return SysLibNames.OPERATOR_EQUALS;
		if (name.equals ("!="))
			return SysLibNames.OPERATOR_NOT_EQUALS;
		if (name.equals ("!"))
			return SysLibNames.OPERATOR_NOT;
		if (name.equals ("+"))
			return SysLibNames.OPERATOR_PLUS;
		if (name.equals ("-"))
			return SysLibNames.OPERATOR_MINUS;
		if (name.equals ("*"))
			return SysLibNames.OPERATOR_MULT;
		if (name.equals ("/"))
			return SysLibNames.OPERATOR_DIV;
		if (name.equals ("%"))
			return SysLibNames.OPERATOR_MOD;
		if (name.equals ("compareTo"))
			return XtendLibNames.COMPARE_TO;
		if (name.equals ("add"))
			return XtendLibNames.ADD;
		if (name.equals ("addAll"))
			return XtendLibNames.ADD_ALL;
		if (name.equals ("remove"))
			return XtendLibNames.REMOVE;
		if (name.equals ("removeAll"))
			return XtendLibNames.REMOVE_ALL;
		return null;
	}

	private String toXpandBuiltinFeatureName(final String name) {
		if (name.equals(XtendLibNames.OPERATION_NAME))
			return "name";
		if (name.equals(XtendLibNames.OBJECT_META_TYPE))
			return "metaType";
		if (name.equals(XtendLibNames.TYPE_ALL_FEATURES))
			return "allFeatures";
		if (name.equals(XtendLibNames.TYPE_ALL_OPERATIONS))
			return "allOperations";
		if (name.equals(XtendLibNames.TYPE_ALL_PROPERTIES))
			return "allProperties";
		if (name.equals(XtendLibNames.ITERATOR_ELEMENTS))
			return "elements";

		if (name.equals(SysLibNames.OPERATOR_LESS))
			return "<";
		if (name.equals(SysLibNames.OPERATOR_GREATER))
			return ">";
		if (name.equals(SysLibNames.OPERATOR_LESS_OR_EQUALS))
			return "<=";
		if (name.equals(SysLibNames.OPERATOR_GREATER_OR_EQUALS))
			return ">=";
		if (name.equals(SysLibNames.OPERATOR_EQUALS))
			return "==";
		if (name.equals(SysLibNames.OPERATOR_NOT_EQUALS))
			return "!=";
		if (name.equals(SysLibNames.OPERATOR_NOT))
			return "!";
		if (name.equals(SysLibNames.OPERATOR_PLUS))
			return "+";
		if (name.equals(SysLibNames.OPERATOR_MINUS))
			return "-";
		if (name.equals(SysLibNames.OPERATOR_MULT))
			return "*";
		if (name.equals(SysLibNames.OPERATOR_DIV))
			return "/";
		if (name.equals(SysLibNames.OPERATOR_MOD))
			return "%";
		if (name.equals(XtendLibNames.COMPARE_TO))
			return "compareTo";
		if (name.equals(XtendLibNames.ADD))
			return "add";
		if (name.equals(XtendLibNames.ADD_ALL))
			return "addAll";
		if (name.equals(XtendLibNames.REMOVE))
			return "remove";
		if (name.equals(XtendLibNames.REMOVE_ALL))
			return "removeAll";
		return null;
	}

}
