/**
 */
package offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer Price Reduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link offers.OfferPriceReduction#getPercentageReduction <em>Percentage Reduction</em>}</li>
 * </ul>
 *
 * @see offers.OffersPackage#getOfferPriceReduction()
 * @model
 * @generated
 */
public interface OfferPriceReduction extends Offer {
	/**
	 * Returns the value of the '<em><b>Percentage Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Reduction</em>' attribute.
	 * @see #setPercentageReduction(float)
	 * @see offers.OffersPackage#getOfferPriceReduction_PercentageReduction()
	 * @model
	 * @generated
	 */
	float getPercentageReduction();

	/**
	 * Sets the value of the '{@link offers.OfferPriceReduction#getPercentageReduction <em>Percentage Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Reduction</em>' attribute.
	 * @see #getPercentageReduction()
	 * @generated
	 */
	void setPercentageReduction(float value);

} // OfferPriceReduction
