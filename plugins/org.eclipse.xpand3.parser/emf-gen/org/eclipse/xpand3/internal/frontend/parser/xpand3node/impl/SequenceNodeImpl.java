/**
 * <copyright>
 * </copyright>
 *
 * $Id: SequenceNodeImpl.java,v 1.1 2008/03/17 14:39:07 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.tmf.common.node.CompositeNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.frontend.parser.xpand3node.SequenceNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.SequenceNodeImpl#getTextSequences <em>Text Sequences</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.SequenceNodeImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceNodeImpl extends CompositeNodeImpl implements SequenceNode {
	/**
	 * The cached value of the '{@link #getTextSequences() <em>Text Sequences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeNode> textSequences;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeNode> statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.SEQUENCE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeNode> getTextSequences() {
		if (textSequences == null) {
			textSequences = new EObjectResolvingEList<CompositeNode>(CompositeNode.class, this, Xpand3nodePackage.SEQUENCE_NODE__TEXT_SEQUENCES);
		}
		return textSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeNode> getStatements() {
		if (statements == null) {
			statements = new EObjectResolvingEList<CompositeNode>(CompositeNode.class, this, Xpand3nodePackage.SEQUENCE_NODE__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.SEQUENCE_NODE__TEXT_SEQUENCES:
				return getTextSequences();
			case Xpand3nodePackage.SEQUENCE_NODE__STATEMENTS:
				return getStatements();
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
			case Xpand3nodePackage.SEQUENCE_NODE__TEXT_SEQUENCES:
				getTextSequences().clear();
				getTextSequences().addAll((Collection<? extends CompositeNode>)newValue);
				return;
			case Xpand3nodePackage.SEQUENCE_NODE__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends CompositeNode>)newValue);
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
			case Xpand3nodePackage.SEQUENCE_NODE__TEXT_SEQUENCES:
				getTextSequences().clear();
				return;
			case Xpand3nodePackage.SEQUENCE_NODE__STATEMENTS:
				getStatements().clear();
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
			case Xpand3nodePackage.SEQUENCE_NODE__TEXT_SEQUENCES:
				return textSequences != null && !textSequences.isEmpty();
			case Xpand3nodePackage.SEQUENCE_NODE__STATEMENTS:
				return statements != null && !statements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceNodeImpl
