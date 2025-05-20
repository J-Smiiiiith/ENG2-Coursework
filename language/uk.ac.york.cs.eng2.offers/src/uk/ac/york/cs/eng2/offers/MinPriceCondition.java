/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Price Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.MinPriceCondition#getMinPrice <em>Min Price</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMinPriceCondition()
 * @model
 * @generated
 */
public interface MinPriceCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Min Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Price</em>' attribute.
	 * @see #setMinPrice(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMinPriceCondition_MinPrice()
	 * @model
	 * @generated
	 */
	float getMinPrice();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.MinPriceCondition#getMinPrice <em>Min Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Price</em>' attribute.
	 * @see #getMinPrice()
	 * @generated
	 */
	void setMinPrice(float value);

} // MinPriceCondition
