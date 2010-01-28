/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: committers of openArchitectureWare - initial API and
 * implementation
 ******************************************************************************/
package org.eclipse.xpand.ui.editor;

import java.util.HashSet;
import java.util.List;

import org.eclipse.internal.xpand2.XpandUtil;
import org.eclipse.internal.xpand2.ast.AbstractDefinition;
import org.eclipse.internal.xpand2.ast.Definition;
import org.eclipse.internal.xpand2.ast.ExpandStatement;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xtend.expression.ast.OperationCall;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xpand.ui.core.IXpandResource;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.search.SearchMatch;
import org.eclipse.xtend.shared.ui.core.search.XtendXpandSearchEngine;
import org.eclipse.xtend.shared.ui.editor.navigation.GenericHyperlink;
import org.eclipse.xtend.shared.ui.editor.navigation.AbstractHyperlinkDetector;
import org.eclipse.xtend.typesystem.Type;

/**
 * @author Darius Jockel - Initial contribution and API
 */
public class XpandHyperlinkDetector extends AbstractHyperlinkDetector {

	public XpandHyperlinkDetector(IEditorPart editor) {
		super(editor);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected List<GenericHyperlink> computeMatchesAndHyperlinks(IRegion hyperlinkRegion, String hyperlinkedWord,
			IXtendXpandProject project) {

			IXpandResource xpandResource = (IXpandResource)Activator.getExtXptModelManager().findExtXptResource(getFile());
			
			List<GenericHyperlink> links = createHyperlinkToImportedExtensions(xpandResource, hyperlinkRegion, hyperlinkedWord);
			if (!links.isEmpty())
				return links;
			
			ExpandStatement statement = XtendXpandSearchEngine.findDefinition(hyperlinkedWord, hyperlinkRegion, (Template)xpandResource.getExtXptResource());
			
			if (statement != null) {
				List<AbstractDefinition> defmatches = XtendXpandSearchEngine.findDefinitionsByNameInResourceAndImports(project, statement.getDefinition().getValue(), xpandResource);
				
			boolean[] isAssignable = isDefinitionAssignableFromExpandStatement(defmatches.toArray(new Definition[defmatches.size()]) ,statement);
				for (int i =0; i< isAssignable.length; i++) {
					if (isAssignable[i]) {
						SearchMatch match = new SearchMatch(
								defmatches.get(i).getDefName().getStart(), 
								defmatches.get(i).getDefName().getEnd() - defmatches.get(i).getDefName().getStart(),
								getXXResourceByName(defmatches.get(i).getFileName(), XpandUtil.TEMPLATE_EXTENSION).getUnderlyingStorage());
						GenericHyperlink genericHyperlink = new GenericHyperlink(
								getWorkbenchPage(), 
								match,
								new Region(statement.getDefinition().getStart(), statement.getDefinition().getEnd()-statement.getDefinition().getStart()),
								computeHyperlinkLabel(hyperlinkedWord, defmatches.get(i).getTargetType(), defmatches.get(i).getParamsAsList(), getXXResourceByName(defmatches.get(i).getFileName(), XpandUtil.TEMPLATE_EXTENSION))
						);
						links.add(genericHyperlink);
					}
				}
			}
			OperationCall expression = null;
			if (statement == null) //performance issue. If expand statement is found no need to search for extension.
				 expression = XtendXpandSearchEngine.findExpressionInTemplate(hyperlinkRegion, (Template)xpandResource.getExtXptResource());
			if (expression != null)
				links = findExtensionMatches(hyperlinkRegion, hyperlinkedWord, project, xpandResource, links, expression.getParams().length);
			
			return links;
	}
	
	/**
	 * Determines for an array of definitions, iff the definition can be called from an expand statement or not.
	 * Therefore the target type of the expand statement and all types of the parameters of the expand statement are computed.
	 * If no type can be computered, the type is set to <code>ObjectType</code>.
	 * 
	 *  @param expandStatement 
	 *  			The expand statement
	 *  @param definition 
	 *  			The definitions to check
	 */
	private boolean[] isDefinitionAssignableFromExpandStatement(AbstractDefinition[] definition, ExpandStatement expandStatement) {
		boolean[] isAssignable = new boolean[definition.length];

		ExecutionContext ctx = Activator.getExecutionContext(
				getXtendXpandProject().getProject()).cloneWithResource(expandStatement.getContainingDefinition().getOwner());
		Type expandTargetType = expandStatement.getTarget().analyze(ctx, new HashSet<AnalysationIssue>());
		if (expandTargetType == null) 
			expandTargetType = ctx.getObjectType();
		Type[] statementTypes = new Type[expandStatement.getParameters().length];
		for (int i = 0; i<statementTypes.length; i++) {
			statementTypes[i] = expandStatement.getParameters()[i].analyze(ctx, new HashSet<AnalysationIssue>());
			if (statementTypes[i] == null) statementTypes[i] = ctx.getObjectType();
		}
		for(int i = 0;i<definition.length;i++){
			if (definition[i].getParams().length != statementTypes.length)  
				isAssignable[i] = false;
			else 
			{
				Type defineType = ctx.getTypeForName(definition[i].getType().getValue());
				if (defineType == null) defineType = ctx.getObjectType();
				if (!expandTargetType.isAssignableFrom(defineType)) 
				{
					isAssignable[i] = false;
					break;
				}
				boolean flag = true;
				for (int j =0; j<definition[i].getParams().length; j++){
					Type definitionType = ctx.getTypeForName(definition[i].getParams()[j].getType().getValue());
					if (definitionType == null) definitionType = ctx.getObjectType();
					if (!statementTypes[j].isAssignableFrom(definitionType))
						flag = false;
				}
				isAssignable[i] = flag;
			}
		}
		return isAssignable;
	}
		
}
