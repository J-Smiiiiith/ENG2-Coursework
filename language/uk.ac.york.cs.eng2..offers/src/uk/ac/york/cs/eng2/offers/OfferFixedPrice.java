/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer Fixed Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferFixedPrice#getNewPrice <em>New Price</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferFixedPrice()
 * @model
 * @generated
 */
public interface OfferFixedPrice extends Offer {
	/**
	 * Returns the value of the '<em><b>New Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Price</em>' attribute.
	 * @see #setNewPrice(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferFixedPrice_NewPrice()
	 * @model
	 * @generated
	 */
	float getNewPrice();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferFixedPrice#getNewPrice <em>New Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Price</em>' attribute.
	 * @see #getNewPrice()
	 * @generated
	 */
	void setNewPrice(float value);

} // OfferFixedPrice
