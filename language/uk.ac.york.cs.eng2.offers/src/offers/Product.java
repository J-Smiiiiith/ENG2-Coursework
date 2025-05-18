/**
 */
package offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link offers.Product#getName <em>Name</em>}</li>
 *   <li>{@link offers.Product#getTags <em>Tags</em>}</li>
 *   <li>{@link offers.Product#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link offers.Product#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see offers.OffersPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see offers.OffersPackage#getProduct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link offers.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link offers.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see offers.OffersPackage#getProduct_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Sub Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Category</em>' containment reference.
	 * @see #setSubCategory(SubCategory)
	 * @see offers.OffersPackage#getProduct_SubCategory()
	 * @model containment="true"
	 * @generated
	 */
	SubCategory getSubCategory();

	/**
	 * Sets the value of the '{@link offers.Product#getSubCategory <em>Sub Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Category</em>' containment reference.
	 * @see #getSubCategory()
	 * @generated
	 */
	void setSubCategory(SubCategory value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(Category)
	 * @see offers.OffersPackage#getProduct_Category()
	 * @model containment="true"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link offers.Product#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

} // Product
