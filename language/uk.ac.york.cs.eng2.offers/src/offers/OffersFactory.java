/**
 */
package offers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see offers.OffersPackage
 * @generated
 */
public interface OffersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OffersFactory eINSTANCE = offers.impl.OffersFactoryImpl.init();

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
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

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
	 * Returns a new object of class '<em>Offer XPounds Off On Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer XPounds Off On Date</em>'.
	 * @generated
	 */
	OfferXPoundsOffOnDate createOfferXPoundsOffOnDate();

	/**
	 * Returns a new object of class '<em>Offer Price Reduction On Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer Price Reduction On Date</em>'.
	 * @generated
	 */
	OfferPriceReductionOnDate createOfferPriceReductionOnDate();

	/**
	 * Returns a new object of class '<em>Check Tags Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Tags Condition</em>'.
	 * @generated
	 */
	CheckTagsCondition createCheckTagsCondition();

	/**
	 * Returns a new object of class '<em>Min Price Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Price Condition</em>'.
	 * @generated
	 */
	MinPriceCondition createMinPriceCondition();

	/**
	 * Returns a new object of class '<em>Check Quantity Category Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Quantity Category Condition</em>'.
	 * @generated
	 */
	CheckQuantityCategoryCondition createCheckQuantityCategoryCondition();

	/**
	 * Returns a new object of class '<em>Check Quantity Sub Category Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Quantity Sub Category Condition</em>'.
	 * @generated
	 */
	CheckQuantitySubCategoryCondition createCheckQuantitySubCategoryCondition();

	/**
	 * Returns a new object of class '<em>Check Quantity Product Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Quantity Product Condition</em>'.
	 * @generated
	 */
	CheckQuantityProductCondition createCheckQuantityProductCondition();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Offer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer Rule</em>'.
	 * @generated
	 */
	OfferRule createOfferRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OffersPackage getOffersPackage();

} //OffersFactory
