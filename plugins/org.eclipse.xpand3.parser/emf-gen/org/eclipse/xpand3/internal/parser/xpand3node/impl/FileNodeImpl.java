/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileNodeImpl.java,v 1.1 2008/03/06 08:55:16 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.FileNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FileNodeImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FileNodeImpl#getImp <em>Imp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileNodeImpl extends CompositeNodeImpl implements FileNode {
	/**
	 * The cached value of the '{@link #getDecl() <em>Decl</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeNode> decl;

	/**
	 * The cached value of the '{@link #getImp() <em>Imp</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImp()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeNode> imp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.FILE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeNode> getDecl() {
		if (decl == null) {
			decl = new EObjectResolvingEList<CompositeNode>(CompositeNode.class, this, Xpand3nodePackage.FILE_NODE__DECL);
		}
		return decl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeNode> getImp() {
		if (imp == null) {
			imp = new EObjectResolvingEList<CompositeNode>(CompositeNode.class, this, Xpand3nodePackage.FILE_NODE__IMP);
		}
		return imp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.FILE_NODE__DECL:
				return getDecl();
			case Xpand3nodePackage.FILE_NODE__IMP:
				return getImp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Xpand3nodePackage.FILE_NODE__DECL:
				getDecl().clear();
				getDecl().addAll((Collection<? extends CompositeNode>)newValue);
				return;
			case Xpand3nodePackage.FILE_NODE__IMP:
				getImp().clear();
				getImp().addAll((Collection<? extends CompositeNode>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Xpand3nodePackage.FILE_NODE__DECL:
				getDecl().clear();
				return;
			case Xpand3nodePackage.FILE_NODE__IMP:
				getImp().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Xpand3nodePackage.FILE_NODE__DECL:
				return decl != null && !decl.isEmpty();
			case Xpand3nodePackage.FILE_NODE__IMP:
				return imp != null && !imp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileNodeImpl
