/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersFactory
 * @model kind="package"
 * @generated
 */
public interface OffersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "offers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.york.ac.uk/eng2/202425/offers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OffersPackage eINSTANCE = uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl <em>Offer Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferComponents()
	 * @generated
	 */
	int OFFER_COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_COMPONENTS__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_COMPONENTS__CATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_COMPONENTS__SUB_CATEGORIES = 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_COMPONENTS__TAGS = 3;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_COMPONENTS__OFFERS = 4;

	/**
	 * The number of structural features of the '<em>Offer Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_COMPONENTS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Offer Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_COMPONENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl <em>Offer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferRule()
	 * @generated
	 */
	int OFFER_RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__OFFERS = 2;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__TRIGGERS = 3;

	/**
	 * The number of structural features of the '<em>Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TAGS = 2;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SUB_CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CATEGORY = 4;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.CategoryImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.SubCategoryImpl <em>Sub Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.SubCategoryImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getSubCategory()
	 * @generated
	 */
	int SUB_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY__NAME = CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY__CATEGORY = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TagImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 5;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__TAG = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.FreeProductOfferImpl <em>Free Product Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.FreeProductOfferImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFreeProductOffer()
	 * @generated
	 */
	int FREE_PRODUCT_OFFER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_PRODUCT_OFFER__NAME = OFFER__NAME;

	/**
	 * The feature id for the '<em><b>Free Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_PRODUCT_OFFER__FREE_PRODUCT = OFFER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Free Product Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_PRODUCT_OFFER_FEATURE_COUNT = OFFER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Free Product Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_PRODUCT_OFFER_OPERATION_COUNT = OFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferPriceReductionImpl <em>Offer Price Reduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferPriceReductionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferPriceReduction()
	 * @generated
	 */
	int OFFER_PRICE_REDUCTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION__NAME = OFFER__NAME;

	/**
	 * The feature id for the '<em><b>Percentage Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION__PERCENTAGE_REDUCTION = OFFER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offer Price Reduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION_FEATURE_COUNT = OFFER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Offer Price Reduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION_OPERATION_COUNT = OFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferFixedPriceImpl <em>Offer Fixed Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferFixedPriceImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferFixedPrice()
	 * @generated
	 */
	int OFFER_FIXED_PRICE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FIXED_PRICE__NAME = OFFER__NAME;

	/**
	 * The feature id for the '<em><b>New Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FIXED_PRICE__NEW_PRICE = OFFER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offer Fixed Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FIXED_PRICE_FEATURE_COUNT = OFFER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Offer Fixed Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FIXED_PRICE_OPERATION_COUNT = OFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferBuyXGetYFreeImpl <em>Offer Buy XGet YFree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferBuyXGetYFreeImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferBuyXGetYFree()
	 * @generated
	 */
	int OFFER_BUY_XGET_YFREE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_BUY_XGET_YFREE__NAME = OFFER__NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_BUY_XGET_YFREE__X = OFFER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_BUY_XGET_YFREE__Y = OFFER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Offer Buy XGet YFree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_BUY_XGET_YFREE_FEATURE_COUNT = OFFER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Offer Buy XGet YFree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_BUY_XGET_YFREE_OPERATION_COUNT = OFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferXPoundsOffImpl <em>Offer XPounds Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferXPoundsOffImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferXPoundsOff()
	 * @generated
	 */
	int OFFER_XPOUNDS_OFF = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF__NAME = OFFER__NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF__X = OFFER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offer XPounds Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF_FEATURE_COUNT = OFFER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Offer XPounds Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF_OPERATION_COUNT = OFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__APPLICABLE_PRODUCTS = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.MinPriceConditionImpl <em>Min Price Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.MinPriceConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMinPriceCondition()
	 * @generated
	 */
	int MIN_PRICE_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_PRICE_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_PRICE_CONDITION__APPLICABLE_PRODUCTS = CONDITION__APPLICABLE_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Min Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_PRICE_CONDITION__MIN_PRICE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Price Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_PRICE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Price Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_PRICE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.CheckQuantityConditionImpl <em>Check Quantity Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.CheckQuantityConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCheckQuantityCondition()
	 * @generated
	 */
	int CHECK_QUANTITY_CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_CONDITION__APPLICABLE_PRODUCTS = CONDITION__APPLICABLE_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_CONDITION__QUANTITY = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Quantity Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Quantity Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.CheckNumOrdersConditionImpl <em>Check Num Orders Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.CheckNumOrdersConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCheckNumOrdersCondition()
	 * @generated
	 */
	int CHECK_NUM_ORDERS_CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NUM_ORDERS_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NUM_ORDERS_CONDITION__APPLICABLE_PRODUCTS = CONDITION__APPLICABLE_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Num Orders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NUM_ORDERS_CONDITION__NUM_ORDERS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Num Orders Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NUM_ORDERS_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Num Orders Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NUM_ORDERS_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.CheckDateConditionImpl <em>Check Date Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.CheckDateConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCheckDateCondition()
	 * @generated
	 */
	int CHECK_DATE_CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DATE_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DATE_CONDITION__APPLICABLE_PRODUCTS = CONDITION__APPLICABLE_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DATE_CONDITION__DATE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Date Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DATE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Date Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DATE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TriggerImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.TriggerType <em>Trigger Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTriggerType()
	 * @generated
	 */
	int TRIGGER_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OfferComponents <em>Offer Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Components</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferComponents
	 * @generated
	 */
	EClass getOfferComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferComponents#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferComponents#getProducts()
	 * @see #getOfferComponents()
	 * @generated
	 */
	EReference getOfferComponents_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferComponents#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferComponents#getCategories()
	 * @see #getOfferComponents()
	 * @generated
	 */
	EReference getOfferComponents_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferComponents#getSubCategories <em>Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Categories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferComponents#getSubCategories()
	 * @see #getOfferComponents()
	 * @generated
	 */
	EReference getOfferComponents_SubCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferComponents#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferComponents#getTags()
	 * @see #getOfferComponents()
	 * @generated
	 */
	EReference getOfferComponents_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferComponents#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferComponents#getOffers()
	 * @see #getOfferComponents()
	 * @generated
	 */
	EReference getOfferComponents_Offers();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OfferRule <em>Offer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Rule</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule
	 * @generated
	 */
	EClass getOfferRule();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OfferRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getName()
	 * @see #getOfferRule()
	 * @generated
	 */
	EAttribute getOfferRule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getConditions()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferRule#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getOffers()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Offers();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferRule#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getTriggers()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Triggers();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Product#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Price();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.Product#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getTags()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Tags();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.Product#getSubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getSubCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_SubCategory();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.Product#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Category();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.SubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.SubCategory
	 * @generated
	 */
	EClass getSubCategory();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.SubCategory#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.SubCategory#getCategory()
	 * @see #getSubCategory()
	 * @generated
	 */
	EReference getSubCategory_Category();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Tag#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Tag#getTag()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Tag();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Offer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Offer#getName()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.FreeProductOffer <em>Free Product Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Product Offer</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FreeProductOffer
	 * @generated
	 */
	EClass getFreeProductOffer();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.FreeProductOffer#getFreeProduct <em>Free Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Free Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FreeProductOffer#getFreeProduct()
	 * @see #getFreeProductOffer()
	 * @generated
	 */
	EReference getFreeProductOffer_FreeProduct();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OfferPriceReduction <em>Offer Price Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Price Reduction</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferPriceReduction
	 * @generated
	 */
	EClass getOfferPriceReduction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OfferPriceReduction#getPercentageReduction <em>Percentage Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Reduction</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferPriceReduction#getPercentageReduction()
	 * @see #getOfferPriceReduction()
	 * @generated
	 */
	EAttribute getOfferPriceReduction_PercentageReduction();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OfferFixedPrice <em>Offer Fixed Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Fixed Price</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferFixedPrice
	 * @generated
	 */
	EClass getOfferFixedPrice();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OfferFixedPrice#getNewPrice <em>New Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Price</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferFixedPrice#getNewPrice()
	 * @see #getOfferFixedPrice()
	 * @generated
	 */
	EAttribute getOfferFixedPrice_NewPrice();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OfferBuyXGetYFree <em>Offer Buy XGet YFree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Buy XGet YFree</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferBuyXGetYFree
	 * @generated
	 */
	EClass getOfferBuyXGetYFree();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OfferBuyXGetYFree#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferBuyXGetYFree#getX()
	 * @see #getOfferBuyXGetYFree()
	 * @generated
	 */
	EAttribute getOfferBuyXGetYFree_X();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OfferBuyXGetYFree#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferBuyXGetYFree#getY()
	 * @see #getOfferBuyXGetYFree()
	 * @generated
	 */
	EAttribute getOfferBuyXGetYFree_Y();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OfferXPoundsOff <em>Offer XPounds Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer XPounds Off</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferXPoundsOff
	 * @generated
	 */
	EClass getOfferXPoundsOff();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OfferXPoundsOff#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferXPoundsOff#getX()
	 * @see #getOfferXPoundsOff()
	 * @generated
	 */
	EAttribute getOfferXPoundsOff_X();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.Condition#getApplicableProducts <em>Applicable Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applicable Products</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Condition#getApplicableProducts()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ApplicableProducts();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.MinPriceCondition <em>Min Price Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Price Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MinPriceCondition
	 * @generated
	 */
	EClass getMinPriceCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.MinPriceCondition#getMinPrice <em>Min Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Price</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MinPriceCondition#getMinPrice()
	 * @see #getMinPriceCondition()
	 * @generated
	 */
	EAttribute getMinPriceCondition_MinPrice();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.CheckQuantityCondition <em>Check Quantity Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Quantity Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.CheckQuantityCondition
	 * @generated
	 */
	EClass getCheckQuantityCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.CheckQuantityCondition#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see uk.ac.york.cs.eng2.offers.CheckQuantityCondition#getQuantity()
	 * @see #getCheckQuantityCondition()
	 * @generated
	 */
	EAttribute getCheckQuantityCondition_Quantity();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.CheckNumOrdersCondition <em>Check Num Orders Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Num Orders Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.CheckNumOrdersCondition
	 * @generated
	 */
	EClass getCheckNumOrdersCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.CheckNumOrdersCondition#getNumOrders <em>Num Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Orders</em>'.
	 * @see uk.ac.york.cs.eng2.offers.CheckNumOrdersCondition#getNumOrders()
	 * @see #getCheckNumOrdersCondition()
	 * @generated
	 */
	EAttribute getCheckNumOrdersCondition_NumOrders();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.CheckDateCondition <em>Check Date Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Date Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.CheckDateCondition
	 * @generated
	 */
	EClass getCheckDateCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.CheckDateCondition#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see uk.ac.york.cs.eng2.offers.CheckDateCondition#getDate()
	 * @see #getCheckDateCondition()
	 * @generated
	 */
	EAttribute getCheckDateCondition_Date();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.Trigger#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Trigger#getSource()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Source();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.Trigger#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Trigger#getTarget()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Target();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Trigger#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Trigger#getType()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Type();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.cs.eng2.offers.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Type</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @generated
	 */
	EEnum getTriggerType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OffersFactory getOffersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl <em>Offer Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferComponents()
		 * @generated
		 */
		EClass OFFER_COMPONENTS = eINSTANCE.getOfferComponents();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_COMPONENTS__PRODUCTS = eINSTANCE.getOfferComponents_Products();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_COMPONENTS__CATEGORIES = eINSTANCE.getOfferComponents_Categories();

		/**
		 * The meta object literal for the '<em><b>Sub Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_COMPONENTS__SUB_CATEGORIES = eINSTANCE.getOfferComponents_SubCategories();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_COMPONENTS__TAGS = eINSTANCE.getOfferComponents_Tags();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_COMPONENTS__OFFERS = eINSTANCE.getOfferComponents_Offers();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl <em>Offer Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferRule()
		 * @generated
		 */
		EClass OFFER_RULE = eINSTANCE.getOfferRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_RULE__NAME = eINSTANCE.getOfferRule_Name();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__CONDITIONS = eINSTANCE.getOfferRule_Conditions();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__OFFERS = eINSTANCE.getOfferRule_Offers();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__TRIGGERS = eINSTANCE.getOfferRule_Triggers();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE = eINSTANCE.getProduct_Price();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__TAGS = eINSTANCE.getProduct_Tags();

		/**
		 * The meta object literal for the '<em><b>Sub Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__SUB_CATEGORY = eINSTANCE.getProduct_SubCategory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CATEGORY = eINSTANCE.getProduct_Category();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.CategoryImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.SubCategoryImpl <em>Sub Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.SubCategoryImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getSubCategory()
		 * @generated
		 */
		EClass SUB_CATEGORY = eINSTANCE.getSubCategory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CATEGORY__CATEGORY = eINSTANCE.getSubCategory_Category();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TagImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__TAG = eINSTANCE.getTag_Tag();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OfferImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__NAME = eINSTANCE.getOffer_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.FreeProductOfferImpl <em>Free Product Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.FreeProductOfferImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFreeProductOffer()
		 * @generated
		 */
		EClass FREE_PRODUCT_OFFER = eINSTANCE.getFreeProductOffer();

		/**
		 * The meta object literal for the '<em><b>Free Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREE_PRODUCT_OFFER__FREE_PRODUCT = eINSTANCE.getFreeProductOffer_FreeProduct();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferPriceReductionImpl <em>Offer Price Reduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OfferPriceReductionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferPriceReduction()
		 * @generated
		 */
		EClass OFFER_PRICE_REDUCTION = eINSTANCE.getOfferPriceReduction();

		/**
		 * The meta object literal for the '<em><b>Percentage Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_PRICE_REDUCTION__PERCENTAGE_REDUCTION = eINSTANCE.getOfferPriceReduction_PercentageReduction();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferFixedPriceImpl <em>Offer Fixed Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OfferFixedPriceImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferFixedPrice()
		 * @generated
		 */
		EClass OFFER_FIXED_PRICE = eINSTANCE.getOfferFixedPrice();

		/**
		 * The meta object literal for the '<em><b>New Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_FIXED_PRICE__NEW_PRICE = eINSTANCE.getOfferFixedPrice_NewPrice();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferBuyXGetYFreeImpl <em>Offer Buy XGet YFree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OfferBuyXGetYFreeImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferBuyXGetYFree()
		 * @generated
		 */
		EClass OFFER_BUY_XGET_YFREE = eINSTANCE.getOfferBuyXGetYFree();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_BUY_XGET_YFREE__X = eINSTANCE.getOfferBuyXGetYFree_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_BUY_XGET_YFREE__Y = eINSTANCE.getOfferBuyXGetYFree_Y();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferXPoundsOffImpl <em>Offer XPounds Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OfferXPoundsOffImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferXPoundsOff()
		 * @generated
		 */
		EClass OFFER_XPOUNDS_OFF = eINSTANCE.getOfferXPoundsOff();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_XPOUNDS_OFF__X = eINSTANCE.getOfferXPoundsOff_X();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Applicable Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__APPLICABLE_PRODUCTS = eINSTANCE.getCondition_ApplicableProducts();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.MinPriceConditionImpl <em>Min Price Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.MinPriceConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMinPriceCondition()
		 * @generated
		 */
		EClass MIN_PRICE_CONDITION = eINSTANCE.getMinPriceCondition();

		/**
		 * The meta object literal for the '<em><b>Min Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_PRICE_CONDITION__MIN_PRICE = eINSTANCE.getMinPriceCondition_MinPrice();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.CheckQuantityConditionImpl <em>Check Quantity Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.CheckQuantityConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCheckQuantityCondition()
		 * @generated
		 */
		EClass CHECK_QUANTITY_CONDITION = eINSTANCE.getCheckQuantityCondition();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_QUANTITY_CONDITION__QUANTITY = eINSTANCE.getCheckQuantityCondition_Quantity();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.CheckNumOrdersConditionImpl <em>Check Num Orders Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.CheckNumOrdersConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCheckNumOrdersCondition()
		 * @generated
		 */
		EClass CHECK_NUM_ORDERS_CONDITION = eINSTANCE.getCheckNumOrdersCondition();

		/**
		 * The meta object literal for the '<em><b>Num Orders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_NUM_ORDERS_CONDITION__NUM_ORDERS = eINSTANCE.getCheckNumOrdersCondition_NumOrders();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.CheckDateConditionImpl <em>Check Date Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.CheckDateConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCheckDateCondition()
		 * @generated
		 */
		EClass CHECK_DATE_CONDITION = eINSTANCE.getCheckDateCondition();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_DATE_CONDITION__DATE = eINSTANCE.getCheckDateCondition_Date();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TriggerImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__SOURCE = eINSTANCE.getTrigger_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__TARGET = eINSTANCE.getTrigger_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__TYPE = eINSTANCE.getTrigger_Type();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.TriggerType <em>Trigger Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.TriggerType
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTriggerType()
		 * @generated
		 */
		EEnum TRIGGER_TYPE = eINSTANCE.getTriggerType();

	}

} //OffersPackage
