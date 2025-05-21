/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferComponents#getProducts <em>Products</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferComponents#getCategories <em>Categories</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferComponents#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferComponents#getTags <em>Tags</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferComponents#getOffers <em>Offers</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferComponents()
 * @model
 * @generated
 */
public interface OfferComponents extends EObject {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference.
	 * @see #setProducts(Products)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferComponents_Products()
	 * @model containment="true"
	 * @generated
	 */
	Products getProducts();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferComponents#getProducts <em>Products</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Products</em>' containment reference.
	 * @see #getProducts()
	 * @generated
	 */
	void setProducts(Products value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference.
	 * @see #setCategories(Categories)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferComponents_Categories()
	 * @model containment="true"
	 * @generated
	 */
	Categories getCategories();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferComponents#getCategories <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' containment reference.
	 * @see #getCategories()
	 * @generated
	 */
	void setCategories(Categories value);

	/**
	 * Returns the value of the '<em><b>Sub Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Categories</em>' containment reference.
	 * @see #setSubCategories(SubCategories)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferComponents_SubCategories()
	 * @model containment="true"
	 * @generated
	 */
	SubCategories getSubCategories();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferComponents#getSubCategories <em>Sub Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Categories</em>' containment reference.
	 * @see #getSubCategories()
	 * @generated
	 */
	void setSubCategories(SubCategories value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference.
	 * @see #setTags(Tags)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferComponents_Tags()
	 * @model containment="true"
	 * @generated
	 */
	Tags getTags();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferComponents#getTags <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' containment reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(Tags value);

	/**
	 * Returns the value of the '<em><b>Offers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' containment reference.
	 * @see #setOffers(AllOffers)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferComponents_Offers()
	 * @model containment="true"
	 * @generated
	 */
	AllOffers getOffers();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferComponents#getOffers <em>Offers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offers</em>' containment reference.
	 * @see #getOffers()
	 * @generated
	 */
	void setOffers(AllOffers value);

} // OfferComponents
