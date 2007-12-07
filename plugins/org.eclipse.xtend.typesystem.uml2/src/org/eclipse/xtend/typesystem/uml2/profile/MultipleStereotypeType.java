package org.eclipse.xtend.typesystem.uml2.profile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.xtend.expression.TypeSystem;
import org.eclipse.xtend.typesystem.Feature;
import org.eclipse.xtend.typesystem.Type;

/**
 * This type is used to support assignment of multiple stereotypes to a
 * model element. Methods from the superclass are overridden to evaluate
 * them for each wrapped stereotype.
 * @author karsten.thoms@itemis.eu
 * @since 4.2
 */
public final class MultipleStereotypeType extends StereotypeType {
	List<StereotypeType> stereotypes;
	
	public MultipleStereotypeType(TypeSystem typeSystem, List<StereotypeType> stereotypes) {
		super(typeSystem, computeName(stereotypes), null);
		this.stereotypes = stereotypes;
	}

	/** Needed to be called within constructor */
	private static String computeName (List<StereotypeType> stereotypes) {
		String result = stereotypes.get(0).getName();
		for (int i=1; i<stereotypes.size(); i++) {
			result += ","+stereotypes.get(i).getName(); 
		}
		return result;
	}

	@Override
	public Feature[] getContributedFeatures() {
		List<Feature> features = new ArrayList<Feature>();
		for (StereotypeType st : stereotypes) {
			features.addAll(Arrays.asList(st.getContributedFeatures()));
		}
		return features.toArray(new Feature[stereotypes.size()]);
	}

	@Override
	public Set<Type> getSuperTypes() {
		Set<Type> superTypes = new HashSet<Type>();
		for (StereotypeType st : stereotypes) {
			superTypes.addAll(st.getSuperTypes());
		}
		return superTypes;
	}

	@Override
	public boolean isInstance(Object o) {
		for (StereotypeType st : stereotypes) {
			if (st.isInstance(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected boolean isCompatible(Type t) {
		for (StereotypeType st : stereotypes) {
			if (st.equals(t)) {
				return true;
			}
		}
		return false;
	}

	
}
