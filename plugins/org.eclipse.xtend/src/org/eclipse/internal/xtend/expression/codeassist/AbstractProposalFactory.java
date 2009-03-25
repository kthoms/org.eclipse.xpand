package org.eclipse.internal.xtend.expression.codeassist;

import java.util.Set;

import org.eclipse.xtend.typesystem.Feature;
import org.eclipse.xtend.typesystem.ParameterizedCallable;
import org.eclipse.xtend.typesystem.Type;

public abstract class AbstractProposalFactory implements ProposalFactory {

	public boolean isDuplicate(Set<String> nameCache, Object proposal) {
		if (nameCache == null || proposal == null)
			throw new IllegalArgumentException("nameCache: " + nameCache + " proposal: " + proposal);

		Feature feature = castToFeature(proposal);
		return feature == null || nameCache.contains(getAsString(feature));
	}

	private String getAsString(Feature feature) {
		StringBuilder result = new StringBuilder(feature.getOwner().getName()).append(".").append(feature.getName());
		if (feature instanceof ParameterizedCallable) {
			result.append('(');
			for(Type param: ((ParameterizedCallable) feature).getParameterTypes()) {
				result.append(param.toString());
				result.append(',');
			}
			result.append(')');
		}
		return result.toString();
	}

	public void addToCache(Set<String> nameCache, Object proposal) {
		Feature feature = castToFeature(proposal);
		if (feature != null) {
			nameCache.add(getAsString(feature));
		}
	}

	private Feature castToFeature(Object obj) {
		if (obj instanceof Feature)
			return (Feature) obj;

		return null;
	}
	
}
