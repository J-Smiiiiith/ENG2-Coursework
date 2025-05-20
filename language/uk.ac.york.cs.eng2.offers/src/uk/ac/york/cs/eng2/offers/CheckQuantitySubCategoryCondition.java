/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Quantity Sub Category Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.CheckQuantitySubCategoryCondition#getSubCategories <em>Sub Categories</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCheckQuantitySubCategoryCondition()
 * @model
 * @generated
 */
public interface CheckQuantitySubCategoryCondition extends CheckQuantityCondition {
	/**
	 * Returns the value of the '<em><b>Sub Categories</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.SubCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Categories</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCheckQuantitySubCategoryCondition_SubCategories()
	 * @model
	 * @generated
	 */
	EList<SubCategory> getSubCategories();

} // CheckQuantitySubCategoryCondition
