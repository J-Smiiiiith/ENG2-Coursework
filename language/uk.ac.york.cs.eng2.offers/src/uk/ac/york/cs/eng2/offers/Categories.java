/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Categories#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCategories()
 * @model
 * @generated
 */
public interface Categories extends EObject {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCategories_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

} // Categories
