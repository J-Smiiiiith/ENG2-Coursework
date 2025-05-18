/**
 */
package offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Quantity Product Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link offers.CheckQuantityProductCondition#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see offers.OffersPackage#getCheckQuantityProductCondition()
 * @model
 * @generated
 */
public interface CheckQuantityProductCondition extends CheckQuantityCondition {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link offers.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see offers.OffersPackage#getCheckQuantityProductCondition_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

} // CheckQuantityProductCondition
