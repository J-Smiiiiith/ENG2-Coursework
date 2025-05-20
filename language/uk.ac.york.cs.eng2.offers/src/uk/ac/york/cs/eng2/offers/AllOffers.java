/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Offers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.AllOffers#getOffers <em>Offers</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getAllOffers()
 * @model
 * @generated
 */
public interface AllOffers extends EObject {
	/**
	 * Returns the value of the '<em><b>Offers</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.OfferRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getAllOffers_Offers()
	 * @model containment="true"
	 * @generated
	 */
	EList<OfferRule> getOffers();

} // AllOffers
