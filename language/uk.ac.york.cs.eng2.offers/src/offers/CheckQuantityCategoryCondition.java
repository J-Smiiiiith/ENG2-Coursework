/**
 */
package offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Quantity Category Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link offers.CheckQuantityCategoryCondition#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see offers.OffersPackage#getCheckQuantityCategoryCondition()
 * @model
 * @generated
 */
public interface CheckQuantityCategoryCondition extends CheckQuantityCondition {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link offers.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see offers.OffersPackage#getCheckQuantityCategoryCondition_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

} // CheckQuantityCategoryCondition
