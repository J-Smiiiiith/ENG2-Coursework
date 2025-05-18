/**
 */
package offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Quantity Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link offers.CheckQuantityCondition#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see offers.OffersPackage#getCheckQuantityCondition()
 * @model abstract="true"
 * @generated
 */
public interface CheckQuantityCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see offers.OffersPackage#getCheckQuantityCondition_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link offers.CheckQuantityCondition#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // CheckQuantityCondition
