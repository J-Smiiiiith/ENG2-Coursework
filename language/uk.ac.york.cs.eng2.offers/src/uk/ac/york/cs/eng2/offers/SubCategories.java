/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Categories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.SubCategories#getSubCategories <em>Sub Categories</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getSubCategories()
 * @model
 * @generated
 */
public interface SubCategories extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Categories</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.SubCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Categories</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getSubCategories_SubCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubCategory> getSubCategories();

} // SubCategories
