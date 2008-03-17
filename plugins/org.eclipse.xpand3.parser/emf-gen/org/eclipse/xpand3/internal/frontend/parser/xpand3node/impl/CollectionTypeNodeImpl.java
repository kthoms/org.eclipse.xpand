/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionTypeNodeImpl.java,v 1.1 2008/03/17 14:39:06 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.frontend.parser.xpand3node.CollectionTypeNode;
import org.eclipse.xpand3.internal.frontend.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Type Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.CollectionTypeNodeImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.xpand3.internal.frontend.parser.xpand3node.impl.CollectionTypeNodeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionTypeNodeImpl extends CompositeNodeImpl implements CollectionTypeNode {
	/**
	 * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected LeafNode collectionType;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected CompositeNode elementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTypeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.COLLECTION_TYPE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode getCollectionType() {
		if (collectionType != null && collectionType.eIsProxy()) {
			InternalEObject oldCollectionType = (InternalEObject)collectionType;
			collectionType = (LeafNode)eResolveProxy(oldCollectionType);
			if (collectionType != oldCollectionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.COLLECTION_TYPE_NODE__COLLECTION_TYPE, oldCollectionType, collectionType));
			}
		}
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode basicGetCollectionType() {
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionType(LeafNode newCollectionType) {
		LeafNode oldCollectionType = collectionType;
		collectionType = newCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.COLLECTION_TYPE_NODE__COLLECTION_TYPE, oldCollectionType, collectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getElementType() {
		if (elementType != null && elementType.eIsProxy()) {
			InternalEObject oldElementType = (InternalEObject)elementType;
			elementType = (CompositeNode)eResolveProxy(oldElementType);
			if (elementType != oldElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xpand3nodePackage.COLLECTION_TYPE_NODE__ELEMENT_TYPE, oldElementType, elementType));
			}
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode basicGetElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(CompositeNode newElementType) {
		CompositeNode oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3nodePackage.COLLECTION_TYPE_NODE__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xpand3nodePackage.COLLECTION_TYPE_NODE__COLLECTION_TYPE:
				if (resolve) return getCollectionType();
				return basicGetCollectionType();
			case Xpand3nodePackage.COLLECTION_TYPE_NODE__ELEMENT_TYPE:
				if (resolve) return getElementType();
				return basicGetElementType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Xpand3nodePackage.COLLECTION_TYPE_NODE__COLLECTION_TYPE:
				setCollectionType((LeafNode)newValue);
				return;
			case Xpand3nodePackage.COLLECTION_TYPE_NODE__ELEMENT_TYPE:
				setElementType((CompositeNode)newValue);
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
			case Xpand3nodePackage.COLLECTION_TYPE_NODE__COLLECTION_TYPE:
				setCollectionType((LeafNode)null);
				return;
			case Xpand3nodePackage.COLLECTION_TYPE_NODE__ELEMENT_TYPE:
				setElementType((CompositeNode)null);
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
			case Xpand3nodePackage.COLLECTION_TYPE_NODE__COLLECTION_TYPE:
				return collectionType != null;
			case Xpand3nodePackage.COLLECTION_TYPE_NODE__ELEMENT_TYPE:
				return elementType != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionTypeNodeImpl
