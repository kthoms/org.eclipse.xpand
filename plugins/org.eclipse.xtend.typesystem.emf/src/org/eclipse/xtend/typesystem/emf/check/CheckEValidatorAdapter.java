/*******************************************************************************
 * <copyright>
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * committers of openArchitectureWare - initial API and implementation
 * </copyright>
 *******************************************************************************/
package org.eclipse.xtend.typesystem.emf.check;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.xtend.check.CheckUtils;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ResourceManager;
import org.eclipse.xtend.expression.ResourceManagerDefaultImpl;
import org.eclipse.xtend.expression.TypeSystemImpl;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

/**
 * An implementation of {@link org.eclipse.emf.ecore.EValidator} that executes
 * oAW checks. Further EValidators can be nested.
 * 
 * Check files can be added with reparse option. If true, the check files are
 * reparse on each validation.
 * 
 * @author Jan Köhnlein
 */
public class CheckEValidatorAdapter implements EValidator {

	private final Log log = LogFactory.getLog(CheckEValidatorAdapter.class);

	private List<CheckFileWithContext> _checkFiles;

	private EValidator _nestedValidator;

	private EPackage _ePackage;
	
	private ResourceManager _externalResourceManager;

	public CheckEValidatorAdapter(EPackage ePackage) {
		_ePackage = ePackage;
		_checkFiles = new ArrayList<CheckFileWithContext>();
	}

	public CheckEValidatorAdapter(EPackage ePackage,
			EValidator existingValidator) {
		this(ePackage);
		if (existingValidator != null) {
			_nestedValidator = existingValidator;
		}
	}

	public void addCheckFile(CheckFileWithContext checkFile) {
		_checkFiles.add(checkFile);
	}

	public boolean validate(EObject eObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	public boolean validate(EClass eClass, EObject eObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		List<EObject> allElements = Collections.singletonList(eObject);
		boolean isValid = runOawCheck(diagnostics, allElements);
		if (_nestedValidator != null) {
			isValid &= _nestedValidator.validate(eClass, eObject, diagnostics,
					context);
		}
		return isValid;
	}

	public boolean validate(EDataType dataType, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		List<?> allElements = Collections.singletonList(dataType);
		boolean isValid = runOawCheck(diagnostics, allElements);
		if (_nestedValidator != null) {
			isValid &= _nestedValidator.validate(dataType, value, diagnostics,
					context);
		}
		return isValid;
	}

	
	public void setExternalResourceManager(ResourceManager externalResourceManager) {
		_externalResourceManager = externalResourceManager;
	}
	
	private ResourceManager getResourceManager() {
		if(_externalResourceManager != null) {
			return _externalResourceManager;
		}
		return new ResourceManagerDefaultImpl();
	}

	private ExecutionContext createExecutionContext(
			CheckFileWithContext checkFile, ResourceManager resourceManager) {
		final Set<EPackage> allEPackages = new HashSet<EPackage>();
		allEPackages.add(_ePackage);
		for (String nsURI : checkFile.getImportedEPackageNsUris()) {
			try {
				EPackage importedEPackage = EPackage.Registry.INSTANCE
						.getEPackage(nsURI);
				if (importedEPackage != null) {
					allEPackages.add(importedEPackage);
				}
			} catch (Exception exc) {
				log.error(exc);
			}
		}
		TypeSystemImpl typeSystem = new TypeSystemImpl();
		typeSystem.registerMetaModel(new EmfMetaModel() {
			private EPackage[] _allEPackages = allEPackages
					.toArray(new EPackage[allEPackages.size()]);

			@Override
			protected EPackage[] allPackages() {
				return _allEPackages;
			}
		});
		ExecutionContext executionContext = new ExecutionContextImpl(
				resourceManager, typeSystem, null);
		return executionContext;
	}

	private boolean runOawCheck(DiagnosticChain diagnostics, List<?> allElements) {
		boolean isValid = true;
		for (CheckFileWithContext checkFile : _checkFiles) {
			Issues issues = new IssuesImpl();
			ResourceManager resourceManager = getResourceManager();
			ExtensionFile parsedCheckFile = (ExtensionFile) resourceManager
					.loadResource(checkFile.getFileName(),
							CheckUtils.FILE_EXTENSION);
			ExecutionContext executionContext = createExecutionContext(checkFile, resourceManager);
			runOawCheck(parsedCheckFile, allElements, diagnostics,
					executionContext);
			isValid &= issues.hasErrors();
		}
		return isValid;
	}

	private Issues runOawCheck(ExtensionFile parsedCheckFile,
			List<?> allElements, DiagnosticChain diagnostics,
			ExecutionContext executionContext) {
		Issues issues = new IssuesImpl();
		parsedCheckFile.check(executionContext, allElements, issues, false);
		addDiagnosticFromIssues(diagnostics, issues);
		return issues;
	}

	private void addDiagnosticFromIssues(
			DiagnosticChain allDiagnostics, Issues issues) {
		MWEDiagnostic[] errors = issues.getErrors();
		addDiagnostics(allDiagnostics, errors);
			
		MWEDiagnostic[] warnings = issues.getWarnings();
		addDiagnostics(allDiagnostics, warnings);
	}

	private void addDiagnostics(DiagnosticChain allDiagnostics,
			MWEDiagnostic[] issues) {
		for (MWEDiagnostic issue : issues) {
			allDiagnostics.add(issue);
		}
	}

}
