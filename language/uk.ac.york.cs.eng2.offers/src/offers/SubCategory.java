/**
 */
package offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link offers.SubCategory#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see offers.OffersPackage#getSubCategory()
 * @model
 * @generated
 */
public interface SubCategory extends Category {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(Category)
	 * @see offers.OffersPackage#getSubCategory_Category()
	 * @model containment="true"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link offers.SubCategory#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

} // SubCategory
