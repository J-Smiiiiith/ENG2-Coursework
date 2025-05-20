/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Category Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.CheckCategoryCondition#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCheckCategoryCondition()
 * @model
 * @generated
 */
public interface CheckCategoryCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCheckCategoryCondition_Categories()
	 * @model
	 * @generated
	 */
	EList<Category> getCategories();

} // CheckCategoryCondition
