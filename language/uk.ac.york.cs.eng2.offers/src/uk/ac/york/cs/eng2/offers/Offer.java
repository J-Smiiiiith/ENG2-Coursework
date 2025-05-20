/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Offer#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Offer#getApplicableProducts <em>Applicable Products</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Offer#getApplicableCategories <em>Applicable Categories</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Offer#getApplicableSubCategories <em>Applicable Sub Categories</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOffer()
 * @model abstract="true"
 * @generated
 */
public interface Offer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOffer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Offer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Applicable Products</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Products</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOffer_ApplicableProducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getApplicableProducts();

	/**
	 * Returns the value of the '<em><b>Applicable Categories</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Categories</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOffer_ApplicableCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getApplicableCategories();

	/**
	 * Returns the value of the '<em><b>Applicable Sub Categories</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.SubCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Sub Categories</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOffer_ApplicableSubCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubCategory> getApplicableSubCategories();

} // Offer
