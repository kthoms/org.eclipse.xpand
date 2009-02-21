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
package org.eclipse.xtend.shared.ui.editor.search.actions;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jdt.ui.PreferenceConstants;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchSite;
import org.eclipse.ui.actions.ActionContext;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
import org.eclipse.xtend.shared.ui.editor.AbstractXtendXpandEditor;

/**
 * Action group that adds the Xtend search actions to a context menu and the
 * global menu bar.
 * 
 * This class may be instantiated; it is not intended to be subclassed.
 */
public class SearchActionGroup extends ActionGroup {

	private AbstractXtendXpandEditor editor;

	private final ReferencesSearchGroup referencesGroup;
	private final DeclarationsSearchGroup declarationsGroup;

	/**
	 * Creates a new {@link SearchActionGroup}. The group requires that the
	 * selection provided by the part's selection provider is of type
	 * {@link org.eclipse.jface.viewers.IStructuredSelection}.
	 * 
	 * @param part
	 *            the view part that owns this action group
	 */
	public SearchActionGroup(IViewPart part) {
		this(part.getViewSite());
	}

	/**
	 * Creates a new {@link SearchActionGroup}. The group requires that the
	 * selection provided by the page's selection provider is of type
	 * {@link org.eclipse.jface.viewers.IStructuredSelection}.
	 * 
	 * @param page
	 *            the page that owns this action group
	 */
	public SearchActionGroup(Page page) {
		this(page.getSite());
	}

	/**
	 * Note: This constructor is for internal use only. Clients should not call
	 * this constructor.
	 * 
	 * @param editor
	 *            the editor
	 */
	public SearchActionGroup(AbstractXtendXpandEditor editor) {
		Assert.isNotNull(editor);
		this.editor = editor;

		referencesGroup = new ReferencesSearchGroup(editor);
		declarationsGroup = new DeclarationsSearchGroup(editor);
	}

	private SearchActionGroup(IWorkbenchSite site) {
		referencesGroup = new ReferencesSearchGroup(site);
		declarationsGroup = new DeclarationsSearchGroup(site);
	}

	/*
	 * Method declared on ActionGroup.
	 */
	@Override
	public void setContext(ActionContext context) {
		referencesGroup.setContext(context);
		declarationsGroup.setContext(context);
	}

	/*
	 * Method declared on ActionGroup.
	 */
	@Override
	public void fillActionBars(IActionBars actionBar) {
		super.fillActionBars(actionBar);
		referencesGroup.fillActionBars(actionBar);
		declarationsGroup.fillActionBars(actionBar);
	}

	/*
	 * Method declared on ActionGroup.
	 */
	@Override
	public void fillContextMenu(IMenuManager menu) {
		super.fillContextMenu(menu);

		if (PreferenceConstants.getPreferenceStore().getBoolean(PreferenceConstants.SEARCH_USE_REDUCED_MENU)) {
			referencesGroup.fillContextMenu(menu);
			declarationsGroup.fillContextMenu(menu);
		} else {
			IMenuManager target = menu;
			IMenuManager searchSubMenu = null;
			if (editor != null) {
				String groupName = "Search";
				searchSubMenu = new MenuManager(groupName, ITextEditorActionConstants.GROUP_FIND);
				searchSubMenu.add(new GroupMarker(ITextEditorActionConstants.GROUP_FIND));
				target = searchSubMenu;
			}

			referencesGroup.fillContextMenu(target);
			declarationsGroup.fillContextMenu(target);

			if (searchSubMenu != null) {
				searchSubMenu.add(new Separator());
			}

			// no other way to find out if we have added items.
			if (searchSubMenu != null && searchSubMenu.getItems().length > 2) {
				menu.appendToGroup(ITextEditorActionConstants.GROUP_FIND, searchSubMenu);
			}
		}
	}

	/*
	 * Method declared on ActionGroup.
	 */
	@Override
	public void dispose() {
		referencesGroup.dispose();
		declarationsGroup.dispose();

		super.dispose();
	}
}
