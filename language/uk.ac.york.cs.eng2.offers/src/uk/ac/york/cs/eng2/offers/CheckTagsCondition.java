/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Tags Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.CheckTagsCondition#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCheckTagsCondition()
 * @model
 * @generated
 */
public interface CheckTagsCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCheckTagsCondition_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

} // CheckTagsCondition
