/**
 */
package offers;

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
 *   <li>{@link offers.CheckTagsCondition#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see offers.OffersPackage#getCheckTagsCondition()
 * @model
 * @generated
 */
public interface CheckTagsCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link offers.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see offers.OffersPackage#getCheckTagsCondition_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // CheckTagsCondition
