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
package org.eclipse.xpand.ui.refactoring.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.PerformanceStats;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.events.MenuAdapter;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IKeyBindingService;
import org.eclipse.ui.IWorkbenchSite;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.xpand.ui.Messages;
import org.eclipse.xpand.ui.editor.IXpandEditorActionDefinitionIds;
import org.eclipse.xpand.ui.editor.XpandEditor;
import org.eclipse.xtend.shared.ui.core.action.SelectionDispatchAction;

/**
 * Action group that adds refactor actions (for example 'Rename', 'Move') to a
 * context menu and the global menu bar.
 * 
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 * 
 * @since 2.0
 */
public class RefactorActionGroup extends ActionGroup {

	private static final String PERF_REFACTOR_ACTION_GROUP = "org.eclipse.jdt.ui/perf/explorer/RefactorActionGroup"; //$NON-NLS-1$

	/**
	 * Pop-up menu: id of the refactor sub menu (value
	 * <code>org.eclipse.jdt.ui.refactoring.menu</code>).
	 * 
	 * @since 2.1
	 */
	public static final String MENU_ID = "org.eclipse.internal.xtend.xpand2.refactoring.menu"; //$NON-NLS-1$

	/**
	 * Pop-up menu: id of the reorg group of the refactor sub menu (value
	 * <code>reorgGroup</code>).
	 * 
	 * @since 2.1
	 */
	public static final String GROUP_REORG = "reorgGroup"; //$NON-NLS-1$

	/**
	 * Pop-up menu: id of the type group of the refactor sub menu (value
	 * <code>typeGroup</code>).
	 * 
	 * @since 2.1
	 */
	public static final String GROUP_TYPE = "typeGroup"; //$NON-NLS-1$

	/**
	 * Pop-up menu: id of the coding group of the refactor sub menu (value
	 * <code>codingGroup</code>).
	 * 
	 * @since 2.1
	 */
	public static final String GROUP_CODING = "codingGroup"; //$NON-NLS-1$

	/**
	 * Pop-up menu: id of the coding group 2 of the refactor sub menu (value
	 * <code>codingGroup2</code>).
	 * 
	 * @since 3.2
	 */
	public static final String GROUP_CODING2 = "codingGroup2"; //$NON-NLS-1$

	private final IWorkbenchSite fSite;
	private final XpandEditor fEditor;
	private String fGroupName = "";

	private final List<SelectionDispatchAction> fActions = new ArrayList<SelectionDispatchAction>();

	private static final String QUICK_MENU_ID = "org.eclipse.internal.xtend.xpand2.editor.refactoring.quickMenu"; //$NON-NLS-1$

	private class RefactorQuickAccessAction extends QuickMenuAction {
		public RefactorQuickAccessAction() {
			super(RefactorActionGroup.QUICK_MENU_ID);
		}

		@Override
		protected void fillMenu(IMenuManager menu) {
			fillQuickMenu(menu);
		}
	}

	private final RefactorQuickAccessAction quickAccessAction;
	private final IKeyBindingService keyBindingService;

	private static class NoActionAvailable extends Action {
		public NoActionAvailable() {
			setEnabled(true);
			setText(Messages.RefactorActionGroup_NoRefactoringsAvailable);
		}
	}

	private final Action noActionAvailable = new NoActionAvailable();

// private final ExtractDefineAction extractDefineAction;

	private final RenameDefineAction renameDefineAction;

	/**
	 * Note: This constructor is for internal use only. Clients should not call
	 * this constructor.
	 * 
	 * @param editor
	 *            the compilation unit editor
	 * @param groupName
	 *            the group name to add the actions to
	 */
	public RefactorActionGroup(XpandEditor editor, String groupName) {

		final PerformanceStats stats = PerformanceStats.getStats(RefactorActionGroup.PERF_REFACTOR_ACTION_GROUP, this);
		stats.startRun();

		fSite = editor.getEditorSite();
		fEditor = editor;
		fGroupName = groupName;
		ISelectionProvider provider = editor.getSelectionProvider();
		ISelection selection = provider.getSelection();

// extractDefineAction = new ExtractDefineAction(editor);
// initUpdatingAction(extractDefineAction, provider, selection,
// "org.eclipse.internal.xtend.xpand2.extract.define");
// editor.setAction("ExtractDefine", extractDefineAction); //$NON-NLS-1$

		renameDefineAction = new RenameDefineAction(editor);
		initUpdatingAction(renameDefineAction, provider, selection,
				IXpandEditorActionDefinitionIds.REFACTOR_RENAME_DEFINE);
		editor.setAction("RenameDefine", renameDefineAction); //$NON-NLS-1$

		quickAccessAction = new RefactorQuickAccessAction();
		keyBindingService = editor.getEditorSite().getKeyBindingService();
		keyBindingService.registerAction(quickAccessAction);
	}

	/**
	 * Sets actionDefinitionId, updates enablement, adds to fActions, and adds
	 * selection changed listener if provider is not <code>null</code>.
	 * 
	 * @param action
	 * @param provider
	 *            can be <code>null</code>
	 * @param selection
	 * @param actionDefinitionId
	 */
	private void initUpdatingAction(SelectionDispatchAction action, ISelectionProvider provider, ISelection selection,
			String actionDefinitionId) {
		action.setActionDefinitionId(actionDefinitionId);
		action.update(selection);
		if (provider != null) {
			provider.addSelectionChangedListener(action);
		}
		fActions.add(action);
	}

	/*
	 * (non-Javadoc) Method declared in ActionGroup
	 */
	@Override
	public void fillActionBars(IActionBars actionBars) {
		super.fillActionBars(actionBars);
// actionBars.setGlobalActionHandler("org.eclipse.internal.xtend.xpand2.actions.ExtractDefine",
// extractDefineAction);
		actionBars.setGlobalActionHandler("org.eclipse.internal.xtend.xpand2.actions.RenameDefine", renameDefineAction);
	}

	/*
	 * (non-Javadoc) Method declared in ActionGroup
	 */
	@Override
	public void fillContextMenu(IMenuManager menu) {
		super.fillContextMenu(menu);
		addRefactorSubmenu(menu);
	}

	/*
	 * @see ActionGroup#dispose()
	 */
	@Override
	public void dispose() {
		ISelectionProvider provider = fSite.getSelectionProvider();
		disposeAction(renameDefineAction, provider);
// disposeAction(extractDefineAction, provider);
		if (quickAccessAction != null && keyBindingService != null) {
			keyBindingService.unregisterAction(quickAccessAction);
		}
		super.dispose();
	}

	private void disposeAction(ISelectionChangedListener action, ISelectionProvider provider) {
		if (action != null) {
			provider.removeSelectionChangedListener(action);
		}
	}

	private void addRefactorSubmenu(IMenuManager menu) {
		String menuText = Messages.RefactorActionGroup_MenuName;
		if (quickAccessAction != null) {
			menuText = quickAccessAction.addShortcut(menuText);
		}

		IMenuManager refactorSubmenu = new MenuManager(menuText, RefactorActionGroup.MENU_ID);
		if (fEditor != null) {
			refactorSubmenu.addMenuListener(new IMenuListener() {
				public void menuAboutToShow(IMenuManager manager) {
					refactorMenuShown(manager);
				}
			});
			refactorSubmenu.add(noActionAvailable);
			menu.appendToGroup(fGroupName, refactorSubmenu);
		} else {
			ISelection selection = fSite.getSelectionProvider().getSelection();
			for (Object element : fActions) {
				((SelectionDispatchAction) element).update(selection);
			}
			if (fillRefactorMenu(refactorSubmenu) > 0) {
				menu.appendToGroup(fGroupName, refactorSubmenu);
			}
		}
	}

	private int fillRefactorMenu(IMenuManager refactorSubmenu) {
		int added = 0;
		refactorSubmenu.add(new Separator(RefactorActionGroup.GROUP_CODING));
// added += addAction(refactorSubmenu, extractDefineAction);
		added += addAction(refactorSubmenu, renameDefineAction);
		return added;
	}

	private int addAction(IMenuManager menu, IAction action) {
		if (action != null && action.isEnabled()) {
			menu.add(action);
			return 1;
		}
		return 0;
	}

	private void refactorMenuShown(final IMenuManager refactorSubmenu) {
		// we know that we have an MenuManager since we created it in
		// addRefactorSubmenu.
		Menu menu = ((MenuManager) refactorSubmenu).getMenu();
		menu.addMenuListener(new MenuAdapter() {
			@Override
			public void menuHidden(MenuEvent e) {
				refactorMenuHidden(refactorSubmenu);
			}
		});
		ITextSelection textSelection = (ITextSelection) fEditor.getSelectionProvider().getSelection();

		for (SelectionDispatchAction selectionDispatchAction : fActions) {
			SelectionDispatchAction action = selectionDispatchAction;
			action.update(textSelection);
		}
		refactorSubmenu.removeAll();
		if (fillRefactorMenu(refactorSubmenu) == 0) {
			refactorSubmenu.add(noActionAvailable);
		}
	}

	private void refactorMenuHidden(IMenuManager manager) {
		ITextSelection textSelection = (ITextSelection) fEditor.getSelectionProvider().getSelection();
		for (Object element : fActions) {
			SelectionDispatchAction action = (SelectionDispatchAction) element;
			action.update(textSelection);
		}
	}

	private void fillQuickMenu(IMenuManager menu) {
		if (fEditor != null) {
			ITextSelection textSelection = (ITextSelection) fEditor.getSelectionProvider().getSelection();

			for (Object element : fActions) {
				((SelectionDispatchAction) element).update(textSelection);
			}
			fillRefactorMenu(menu);
			for (Object element : fActions) {
				((SelectionDispatchAction) element).update(textSelection);
			}

		} else {
			ISelection selection = fSite.getSelectionProvider().getSelection();
			for (Object element : fActions) {
				((SelectionDispatchAction) element).update(selection);
			}
			fillRefactorMenu(menu);
		}
	}

}
