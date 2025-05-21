/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersPackage
 * @generated
 */
public interface OffersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OffersFactory eINSTANCE = uk.ac.york.cs.eng2.offers.impl.OffersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Offer Components</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer Components</em>'.
	 * @generated
	 */
	OfferComponents createOfferComponents();

	/**
	 * Returns a new object of class '<em>Products</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Products</em>'.
	 * @generated
	 */
	Products createProducts();

	/**
	 * Returns a new object of class '<em>Categories</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categories</em>'.
	 * @generated
	 */
	Categories createCategories();

	/**
	 * Returns a new object of class '<em>Sub Categories</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Categories</em>'.
	 * @generated
	 */
	SubCategories createSubCategories();

	/**
	 * Returns a new object of class '<em>Tags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tags</em>'.
	 * @generated
	 */
	Tags createTags();

	/**
	 * Returns a new object of class '<em>All Offers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Offers</em>'.
	 * @generated
	 */
	AllOffers createAllOffers();

	/**
	 * Returns a new object of class '<em>Offer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer Rule</em>'.
	 * @generated
	 */
	OfferRule createOfferRule();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Sub Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Category</em>'.
	 * @generated
	 */
	SubCategory createSubCategory();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Free Product Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Product Offer</em>'.
	 * @generated
	 */
	FreeProductOffer createFreeProductOffer();

	/**
	 * Returns a new object of class '<em>Offer Price Reduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer Price Reduction</em>'.
	 * @generated
	 */
	OfferPriceReduction createOfferPriceReduction();

	/**
	 * Returns a new object of class '<em>Offer Fixed Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer Fixed Price</em>'.
	 * @generated
	 */
	OfferFixedPrice createOfferFixedPrice();

	/**
	 * Returns a new object of class '<em>Offer Buy XGet YFree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer Buy XGet YFree</em>'.
	 * @generated
	 */
	OfferBuyXGetYFree createOfferBuyXGetYFree();

	/**
	 * Returns a new object of class '<em>Offer XPounds Off</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer XPounds Off</em>'.
	 * @generated
	 */
	OfferXPoundsOff createOfferXPoundsOff();

	/**
	 * Returns a new object of class '<em>Min Price Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Price Condition</em>'.
	 * @generated
	 */
	MinPriceCondition createMinPriceCondition();

	/**
	 * Returns a new object of class '<em>Check Quantity Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Quantity Condition</em>'.
	 * @generated
	 */
	CheckQuantityCondition createCheckQuantityCondition();

	/**
	 * Returns a new object of class '<em>Check Num Orders Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Num Orders Condition</em>'.
	 * @generated
	 */
	CheckNumOrdersCondition createCheckNumOrdersCondition();

	/**
	 * Returns a new object of class '<em>Check Date Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Date Condition</em>'.
	 * @generated
	 */
	CheckDateCondition createCheckDateCondition();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OffersPackage getOffersPackage();

} //OffersFactory
