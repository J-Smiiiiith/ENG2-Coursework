/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.york.cs.eng2.offers.CheckQuantitySubCategoryCondition;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.SubCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Quantity Sub Category Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.CheckQuantitySubCategoryConditionImpl#getSubCategories <em>Sub Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckQuantitySubCategoryConditionImpl extends CheckQuantityConditionImpl implements CheckQuantitySubCategoryCondition {
	/**
	 * The cached value of the '{@link #getSubCategories() <em>Sub Categories</em>}' reference list.
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
	protected CheckQuantitySubCategoryConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.CHECK_QUANTITY_SUB_CATEGORY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubCategory> getSubCategories() {
		if (subCategories == null) {
			subCategories = new EObjectResolvingEList<SubCategory>(SubCategory.class, this, OffersPackage.CHECK_QUANTITY_SUB_CATEGORY_CONDITION__SUB_CATEGORIES);
		}
		return subCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.CHECK_QUANTITY_SUB_CATEGORY_CONDITION__SUB_CATEGORIES:
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
			case OffersPackage.CHECK_QUANTITY_SUB_CATEGORY_CONDITION__SUB_CATEGORIES:
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
			case OffersPackage.CHECK_QUANTITY_SUB_CATEGORY_CONDITION__SUB_CATEGORIES:
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
			case OffersPackage.CHECK_QUANTITY_SUB_CATEGORY_CONDITION__SUB_CATEGORIES:
				return subCategories != null && !subCategories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CheckQuantitySubCategoryConditionImpl
