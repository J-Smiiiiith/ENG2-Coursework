/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Product Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.FreeProductOffer#getFreeProduct <em>Free Product</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getFreeProductOffer()
 * @model
 * @generated
 */
public interface FreeProductOffer extends Offer {
	/**
	 * Returns the value of the '<em><b>Free Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Product</em>' reference.
	 * @see #setFreeProduct(Product)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getFreeProductOffer_FreeProduct()
	 * @model
	 * @generated
	 */
	Product getFreeProduct();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.FreeProductOffer#getFreeProduct <em>Free Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Product</em>' reference.
	 * @see #getFreeProduct()
	 * @generated
	 */
	void setFreeProduct(Product value);

} // FreeProductOffer
