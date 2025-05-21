/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.SubCategories;
import uk.ac.york.cs.eng2.offers.SubCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Categories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.SubCategoriesImpl#getSubCategories <em>Sub Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubCategoriesImpl extends MinimalEObjectImpl.Container implements SubCategories {
	/**
	 * The cached value of the '{@link #getSubCategories() <em>Sub Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<SubCategory> subCategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubCategoriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.SUB_CATEGORIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubCategory> getSubCategories() {
		if (subCategories == null) {
			subCategories = new EObjectContainmentEList<SubCategory>(SubCategory.class, this, OffersPackage.SUB_CATEGORIES__SUB_CATEGORIES);
		}
		return subCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OffersPackage.SUB_CATEGORIES__SUB_CATEGORIES:
				return ((InternalEList<?>)getSubCategories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.SUB_CATEGORIES__SUB_CATEGORIES:
				return getSubCategories();
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
			case OffersPackage.SUB_CATEGORIES__SUB_CATEGORIES:
				getSubCategories().clear();
				getSubCategories().addAll((Collection<? extends SubCategory>)newValue);
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
			case OffersPackage.SUB_CATEGORIES__SUB_CATEGORIES:
				getSubCategories().clear();
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
			case OffersPackage.SUB_CATEGORIES__SUB_CATEGORIES:
				return subCategories != null && !subCategories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubCategoriesImpl
