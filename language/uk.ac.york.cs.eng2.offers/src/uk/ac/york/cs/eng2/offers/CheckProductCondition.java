/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Product Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.CheckProductCondition#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCheckProductCondition()
 * @model
 * @generated
 */
public interface CheckProductCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCheckProductCondition_Products()
	 * @model
	 * @generated
	 */
	EList<Product> getProducts();

} // CheckProductCondition
