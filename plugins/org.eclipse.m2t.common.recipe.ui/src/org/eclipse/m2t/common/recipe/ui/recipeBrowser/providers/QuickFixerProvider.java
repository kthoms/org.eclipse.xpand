package org.eclipse.m2t.common.recipe.ui.recipeBrowser.providers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.m2t.common.recipe.core.Check;

public class QuickFixerProvider {

	// public QuickFixer getQuickFixer(Check check) {
	public Object getQuickFixer(Check check) {

		// The policy for QuickFixers is intentionnally the same
		// than for Checks, that is to say at the total opposite of a possible
		// chained structure we might think of.
		// IMPORTANT NOTICE : However the possibility of the optimistic
		// functionning of the quickFixers is only allowed because of
		// the choice to quick fix COMPOSITE CHECKS ONLY, since their list of
		// ATOMIC CHECKS HAPPENS TO BE IN THE GOOD RESOLUTION ORDER ! (no
		// more...no less.)
		// ...maybe one would one day want to change it, and that wouldn't be a
		// bad idea at all !

		String problemNature = check.getClass().getSimpleName().split("Check")[0];

		String pack = check.getClass().getName().split(problemNature)[0];
		String quickFixerClassName = pack + problemNature + "QuickFixer";
		quickFixerClassName = quickFixerClassName.replaceAll("checks", "quickFixers");
		String checkEvaluatorClassName = pack + problemNature + "CheckEvaluator";

		try {
			Class<?> checkEvaluatorClass = this.resolveClass(checkEvaluatorClassName);
			return this.resolveClass(quickFixerClassName).getConstructor(check.getClass(), checkEvaluatorClass).newInstance(check.getClass().cast(check),
					checkEvaluatorClass.newInstance());

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		MessageDialog.openError(null, "Error getting a QuickFixer", "Reason: QuickFixer not found for Check " + check.toString());
		return null;

	}

	private Class<?> resolveClass(String className) throws ClassNotFoundException {
		return Class.forName(className);
	}

}
