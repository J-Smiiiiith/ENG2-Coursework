/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Sub Category Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.CheckSubCategoryCondition#getSubCategories <em>Sub Categories</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCheckSubCategoryCondition()
 * @model
 * @generated
 */
public interface CheckSubCategoryCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Sub Categories</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.SubCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Categories</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCheckSubCategoryCondition_SubCategories()
	 * @model
	 * @generated
	 */
	EList<SubCategory> getSubCategories();

} // CheckSubCategoryCondition
