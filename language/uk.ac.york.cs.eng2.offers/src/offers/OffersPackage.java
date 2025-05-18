/**
 */
package offers;

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
 * @see offers.OffersFactory
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
	OffersPackage eINSTANCE = offers.impl.OffersPackageImpl.init();

	/**
	 * The meta object id for the '{@link offers.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.CategoryImpl
	 * @see offers.impl.OffersPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 0;

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
	 * The meta object id for the '{@link offers.impl.SubCategoryImpl <em>Sub Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.SubCategoryImpl
	 * @see offers.impl.OffersPackageImpl#getSubCategory()
	 * @generated
	 */
	int SUB_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY__NAME = CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference.
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
	 * The meta object id for the '{@link offers.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.ProductImpl
	 * @see offers.impl.OffersPackageImpl#getProduct()
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
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TAGS = 1;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SUB_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CATEGORY = 3;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link offers.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.TagImpl
	 * @see offers.impl.OffersPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 3;

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
	 * The meta object id for the '{@link offers.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.OfferImpl
	 * @see offers.impl.OffersPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__APPLICABLE_PRODUCTS = 1;

	/**
	 * The feature id for the '<em><b>Applicable Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__APPLICABLE_CATEGORIES = 2;

	/**
	 * The feature id for the '<em><b>Applicable Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__APPLICABLE_SUB_CATEGORIES = 3;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__CONDITIONS = 4;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link offers.impl.OfferPriceReductionImpl <em>Offer Price Reduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.OfferPriceReductionImpl
	 * @see offers.impl.OffersPackageImpl#getOfferPriceReduction()
	 * @generated
	 */
	int OFFER_PRICE_REDUCTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION__NAME = OFFER__NAME;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION__APPLICABLE_PRODUCTS = OFFER__APPLICABLE_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Applicable Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION__APPLICABLE_CATEGORIES = OFFER__APPLICABLE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Applicable Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION__APPLICABLE_SUB_CATEGORIES = OFFER__APPLICABLE_SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION__CONDITIONS = OFFER__CONDITIONS;

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
	 * The meta object id for the '{@link offers.impl.OfferFixedPriceImpl <em>Offer Fixed Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.OfferFixedPriceImpl
	 * @see offers.impl.OffersPackageImpl#getOfferFixedPrice()
	 * @generated
	 */
	int OFFER_FIXED_PRICE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FIXED_PRICE__NAME = OFFER__NAME;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FIXED_PRICE__APPLICABLE_PRODUCTS = OFFER__APPLICABLE_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Applicable Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FIXED_PRICE__APPLICABLE_CATEGORIES = OFFER__APPLICABLE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Applicable Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FIXED_PRICE__APPLICABLE_SUB_CATEGORIES = OFFER__APPLICABLE_SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FIXED_PRICE__CONDITIONS = OFFER__CONDITIONS;

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
	 * The meta object id for the '{@link offers.impl.OfferBuyXGetYFreeImpl <em>Offer Buy XGet YFree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.OfferBuyXGetYFreeImpl
	 * @see offers.impl.OffersPackageImpl#getOfferBuyXGetYFree()
	 * @generated
	 */
	int OFFER_BUY_XGET_YFREE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_BUY_XGET_YFREE__NAME = OFFER__NAME;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_BUY_XGET_YFREE__APPLICABLE_PRODUCTS = OFFER__APPLICABLE_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Applicable Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_BUY_XGET_YFREE__APPLICABLE_CATEGORIES = OFFER__APPLICABLE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Applicable Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_BUY_XGET_YFREE__APPLICABLE_SUB_CATEGORIES = OFFER__APPLICABLE_SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_BUY_XGET_YFREE__CONDITIONS = OFFER__CONDITIONS;

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
	 * The meta object id for the '{@link offers.impl.OfferXPoundsOffImpl <em>Offer XPounds Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.OfferXPoundsOffImpl
	 * @see offers.impl.OffersPackageImpl#getOfferXPoundsOff()
	 * @generated
	 */
	int OFFER_XPOUNDS_OFF = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF__NAME = OFFER__NAME;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF__APPLICABLE_PRODUCTS = OFFER__APPLICABLE_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Applicable Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF__APPLICABLE_CATEGORIES = OFFER__APPLICABLE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Applicable Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF__APPLICABLE_SUB_CATEGORIES = OFFER__APPLICABLE_SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF__CONDITIONS = OFFER__CONDITIONS;

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
	 * The meta object id for the '{@link offers.impl.OfferXPoundsOffOnDateImpl <em>Offer XPounds Off On Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.OfferXPoundsOffOnDateImpl
	 * @see offers.impl.OffersPackageImpl#getOfferXPoundsOffOnDate()
	 * @generated
	 */
	int OFFER_XPOUNDS_OFF_ON_DATE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF_ON_DATE__NAME = OFFER_XPOUNDS_OFF__NAME;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF_ON_DATE__APPLICABLE_PRODUCTS = OFFER_XPOUNDS_OFF__APPLICABLE_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Applicable Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF_ON_DATE__APPLICABLE_CATEGORIES = OFFER_XPOUNDS_OFF__APPLICABLE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Applicable Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF_ON_DATE__APPLICABLE_SUB_CATEGORIES = OFFER_XPOUNDS_OFF__APPLICABLE_SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF_ON_DATE__CONDITIONS = OFFER_XPOUNDS_OFF__CONDITIONS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF_ON_DATE__X = OFFER_XPOUNDS_OFF__X;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF_ON_DATE__DATE = OFFER_XPOUNDS_OFF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offer XPounds Off On Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF_ON_DATE_FEATURE_COUNT = OFFER_XPOUNDS_OFF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Offer XPounds Off On Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_XPOUNDS_OFF_ON_DATE_OPERATION_COUNT = OFFER_XPOUNDS_OFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offers.impl.OfferPriceReductionOnDateImpl <em>Offer Price Reduction On Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.OfferPriceReductionOnDateImpl
	 * @see offers.impl.OffersPackageImpl#getOfferPriceReductionOnDate()
	 * @generated
	 */
	int OFFER_PRICE_REDUCTION_ON_DATE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION_ON_DATE__NAME = OFFER_PRICE_REDUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Applicable Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION_ON_DATE__APPLICABLE_PRODUCTS = OFFER_PRICE_REDUCTION__APPLICABLE_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Applicable Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION_ON_DATE__APPLICABLE_CATEGORIES = OFFER_PRICE_REDUCTION__APPLICABLE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Applicable Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION_ON_DATE__APPLICABLE_SUB_CATEGORIES = OFFER_PRICE_REDUCTION__APPLICABLE_SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION_ON_DATE__CONDITIONS = OFFER_PRICE_REDUCTION__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Percentage Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION_ON_DATE__PERCENTAGE_REDUCTION = OFFER_PRICE_REDUCTION__PERCENTAGE_REDUCTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION_ON_DATE__DATE = OFFER_PRICE_REDUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offer Price Reduction On Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION_ON_DATE_FEATURE_COUNT = OFFER_PRICE_REDUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Offer Price Reduction On Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PRICE_REDUCTION_ON_DATE_OPERATION_COUNT = OFFER_PRICE_REDUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offers.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.ConditionImpl
	 * @see offers.impl.OffersPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link offers.impl.CheckTagsConditionImpl <em>Check Tags Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.CheckTagsConditionImpl
	 * @see offers.impl.OffersPackageImpl#getCheckTagsCondition()
	 * @generated
	 */
	int CHECK_TAGS_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_TAGS_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_TAGS_CONDITION__TAGS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Tags Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_TAGS_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Tags Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_TAGS_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offers.impl.MinPriceConditionImpl <em>Min Price Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.MinPriceConditionImpl
	 * @see offers.impl.OffersPackageImpl#getMinPriceCondition()
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
	 * The meta object id for the '{@link offers.impl.CheckQuantityConditionImpl <em>Check Quantity Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.CheckQuantityConditionImpl
	 * @see offers.impl.OffersPackageImpl#getCheckQuantityCondition()
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
	 * The meta object id for the '{@link offers.impl.CheckQuantityCategoryConditionImpl <em>Check Quantity Category Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.CheckQuantityCategoryConditionImpl
	 * @see offers.impl.OffersPackageImpl#getCheckQuantityCategoryCondition()
	 * @generated
	 */
	int CHECK_QUANTITY_CATEGORY_CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_CATEGORY_CONDITION__NAME = CHECK_QUANTITY_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_CATEGORY_CONDITION__QUANTITY = CHECK_QUANTITY_CONDITION__QUANTITY;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_CATEGORY_CONDITION__CATEGORIES = CHECK_QUANTITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Quantity Category Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_CATEGORY_CONDITION_FEATURE_COUNT = CHECK_QUANTITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Quantity Category Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_CATEGORY_CONDITION_OPERATION_COUNT = CHECK_QUANTITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offers.impl.CheckQuantitySubCategoryConditionImpl <em>Check Quantity Sub Category Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.CheckQuantitySubCategoryConditionImpl
	 * @see offers.impl.OffersPackageImpl#getCheckQuantitySubCategoryCondition()
	 * @generated
	 */
	int CHECK_QUANTITY_SUB_CATEGORY_CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_SUB_CATEGORY_CONDITION__NAME = CHECK_QUANTITY_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_SUB_CATEGORY_CONDITION__QUANTITY = CHECK_QUANTITY_CONDITION__QUANTITY;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_SUB_CATEGORY_CONDITION__SUB_CATEGORIES = CHECK_QUANTITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Quantity Sub Category Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_SUB_CATEGORY_CONDITION_FEATURE_COUNT = CHECK_QUANTITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Quantity Sub Category Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_SUB_CATEGORY_CONDITION_OPERATION_COUNT = CHECK_QUANTITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offers.impl.CheckQuantityProductConditionImpl <em>Check Quantity Product Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.CheckQuantityProductConditionImpl
	 * @see offers.impl.OffersPackageImpl#getCheckQuantityProductCondition()
	 * @generated
	 */
	int CHECK_QUANTITY_PRODUCT_CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_PRODUCT_CONDITION__NAME = CHECK_QUANTITY_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_PRODUCT_CONDITION__QUANTITY = CHECK_QUANTITY_CONDITION__QUANTITY;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_PRODUCT_CONDITION__PRODUCTS = CHECK_QUANTITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Quantity Product Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_PRODUCT_CONDITION_FEATURE_COUNT = CHECK_QUANTITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Quantity Product Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUANTITY_PRODUCT_CONDITION_OPERATION_COUNT = CHECK_QUANTITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link offers.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.TriggerImpl
	 * @see offers.impl.OffersPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 18;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link offers.impl.OfferRuleImpl <em>Offer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.impl.OfferRuleImpl
	 * @see offers.impl.OffersPackageImpl#getOfferRule()
	 * @generated
	 */
	int OFFER_RULE = 19;

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
	 * The meta object id for the '{@link offers.TriggerType <em>Trigger Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see offers.TriggerType
	 * @see offers.impl.OffersPackageImpl#getTriggerType()
	 * @generated
	 */
	int TRIGGER_TYPE = 20;


	/**
	 * Returns the meta object for class '{@link offers.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see offers.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link offers.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see offers.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for class '{@link offers.SubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Category</em>'.
	 * @see offers.SubCategory
	 * @generated
	 */
	EClass getSubCategory();

	/**
	 * Returns the meta object for the containment reference '{@link offers.SubCategory#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Category</em>'.
	 * @see offers.SubCategory#getCategory()
	 * @see #getSubCategory()
	 * @generated
	 */
	EReference getSubCategory_Category();

	/**
	 * Returns the meta object for class '{@link offers.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see offers.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link offers.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see offers.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.Product#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see offers.Product#getTags()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link offers.Product#getSubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Category</em>'.
	 * @see offers.Product#getSubCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_SubCategory();

	/**
	 * Returns the meta object for the containment reference '{@link offers.Product#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Category</em>'.
	 * @see offers.Product#getCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Category();

	/**
	 * Returns the meta object for class '{@link offers.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see offers.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link offers.Tag#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see offers.Tag#getTag()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Tag();

	/**
	 * Returns the meta object for class '{@link offers.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see offers.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the attribute '{@link offers.Offer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see offers.Offer#getName()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.Offer#getApplicableProducts <em>Applicable Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicable Products</em>'.
	 * @see offers.Offer#getApplicableProducts()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_ApplicableProducts();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.Offer#getApplicableCategories <em>Applicable Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicable Categories</em>'.
	 * @see offers.Offer#getApplicableCategories()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_ApplicableCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.Offer#getApplicableSubCategories <em>Applicable Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicable Sub Categories</em>'.
	 * @see offers.Offer#getApplicableSubCategories()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_ApplicableSubCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.Offer#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see offers.Offer#getConditions()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_Conditions();

	/**
	 * Returns the meta object for class '{@link offers.OfferPriceReduction <em>Offer Price Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Price Reduction</em>'.
	 * @see offers.OfferPriceReduction
	 * @generated
	 */
	EClass getOfferPriceReduction();

	/**
	 * Returns the meta object for the attribute '{@link offers.OfferPriceReduction#getPercentageReduction <em>Percentage Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Reduction</em>'.
	 * @see offers.OfferPriceReduction#getPercentageReduction()
	 * @see #getOfferPriceReduction()
	 * @generated
	 */
	EAttribute getOfferPriceReduction_PercentageReduction();

	/**
	 * Returns the meta object for class '{@link offers.OfferFixedPrice <em>Offer Fixed Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Fixed Price</em>'.
	 * @see offers.OfferFixedPrice
	 * @generated
	 */
	EClass getOfferFixedPrice();

	/**
	 * Returns the meta object for the attribute '{@link offers.OfferFixedPrice#getNewPrice <em>New Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Price</em>'.
	 * @see offers.OfferFixedPrice#getNewPrice()
	 * @see #getOfferFixedPrice()
	 * @generated
	 */
	EAttribute getOfferFixedPrice_NewPrice();

	/**
	 * Returns the meta object for class '{@link offers.OfferBuyXGetYFree <em>Offer Buy XGet YFree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Buy XGet YFree</em>'.
	 * @see offers.OfferBuyXGetYFree
	 * @generated
	 */
	EClass getOfferBuyXGetYFree();

	/**
	 * Returns the meta object for the attribute '{@link offers.OfferBuyXGetYFree#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see offers.OfferBuyXGetYFree#getX()
	 * @see #getOfferBuyXGetYFree()
	 * @generated
	 */
	EAttribute getOfferBuyXGetYFree_X();

	/**
	 * Returns the meta object for the attribute '{@link offers.OfferBuyXGetYFree#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see offers.OfferBuyXGetYFree#getY()
	 * @see #getOfferBuyXGetYFree()
	 * @generated
	 */
	EAttribute getOfferBuyXGetYFree_Y();

	/**
	 * Returns the meta object for class '{@link offers.OfferXPoundsOff <em>Offer XPounds Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer XPounds Off</em>'.
	 * @see offers.OfferXPoundsOff
	 * @generated
	 */
	EClass getOfferXPoundsOff();

	/**
	 * Returns the meta object for the attribute '{@link offers.OfferXPoundsOff#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see offers.OfferXPoundsOff#getX()
	 * @see #getOfferXPoundsOff()
	 * @generated
	 */
	EAttribute getOfferXPoundsOff_X();

	/**
	 * Returns the meta object for class '{@link offers.OfferXPoundsOffOnDate <em>Offer XPounds Off On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer XPounds Off On Date</em>'.
	 * @see offers.OfferXPoundsOffOnDate
	 * @generated
	 */
	EClass getOfferXPoundsOffOnDate();

	/**
	 * Returns the meta object for the attribute '{@link offers.OfferXPoundsOffOnDate#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see offers.OfferXPoundsOffOnDate#getDate()
	 * @see #getOfferXPoundsOffOnDate()
	 * @generated
	 */
	EAttribute getOfferXPoundsOffOnDate_Date();

	/**
	 * Returns the meta object for class '{@link offers.OfferPriceReductionOnDate <em>Offer Price Reduction On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Price Reduction On Date</em>'.
	 * @see offers.OfferPriceReductionOnDate
	 * @generated
	 */
	EClass getOfferPriceReductionOnDate();

	/**
	 * Returns the meta object for the attribute '{@link offers.OfferPriceReductionOnDate#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see offers.OfferPriceReductionOnDate#getDate()
	 * @see #getOfferPriceReductionOnDate()
	 * @generated
	 */
	EAttribute getOfferPriceReductionOnDate_Date();

	/**
	 * Returns the meta object for class '{@link offers.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see offers.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link offers.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see offers.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link offers.CheckTagsCondition <em>Check Tags Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Tags Condition</em>'.
	 * @see offers.CheckTagsCondition
	 * @generated
	 */
	EClass getCheckTagsCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.CheckTagsCondition#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see offers.CheckTagsCondition#getTags()
	 * @see #getCheckTagsCondition()
	 * @generated
	 */
	EReference getCheckTagsCondition_Tags();

	/**
	 * Returns the meta object for class '{@link offers.MinPriceCondition <em>Min Price Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Price Condition</em>'.
	 * @see offers.MinPriceCondition
	 * @generated
	 */
	EClass getMinPriceCondition();

	/**
	 * Returns the meta object for the attribute '{@link offers.MinPriceCondition#getMinPrice <em>Min Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Price</em>'.
	 * @see offers.MinPriceCondition#getMinPrice()
	 * @see #getMinPriceCondition()
	 * @generated
	 */
	EAttribute getMinPriceCondition_MinPrice();

	/**
	 * Returns the meta object for class '{@link offers.CheckQuantityCondition <em>Check Quantity Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Quantity Condition</em>'.
	 * @see offers.CheckQuantityCondition
	 * @generated
	 */
	EClass getCheckQuantityCondition();

	/**
	 * Returns the meta object for the attribute '{@link offers.CheckQuantityCondition#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see offers.CheckQuantityCondition#getQuantity()
	 * @see #getCheckQuantityCondition()
	 * @generated
	 */
	EAttribute getCheckQuantityCondition_Quantity();

	/**
	 * Returns the meta object for class '{@link offers.CheckQuantityCategoryCondition <em>Check Quantity Category Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Quantity Category Condition</em>'.
	 * @see offers.CheckQuantityCategoryCondition
	 * @generated
	 */
	EClass getCheckQuantityCategoryCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.CheckQuantityCategoryCondition#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see offers.CheckQuantityCategoryCondition#getCategories()
	 * @see #getCheckQuantityCategoryCondition()
	 * @generated
	 */
	EReference getCheckQuantityCategoryCondition_Categories();

	/**
	 * Returns the meta object for class '{@link offers.CheckQuantitySubCategoryCondition <em>Check Quantity Sub Category Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Quantity Sub Category Condition</em>'.
	 * @see offers.CheckQuantitySubCategoryCondition
	 * @generated
	 */
	EClass getCheckQuantitySubCategoryCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.CheckQuantitySubCategoryCondition#getSubCategories <em>Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Categories</em>'.
	 * @see offers.CheckQuantitySubCategoryCondition#getSubCategories()
	 * @see #getCheckQuantitySubCategoryCondition()
	 * @generated
	 */
	EReference getCheckQuantitySubCategoryCondition_SubCategories();

	/**
	 * Returns the meta object for class '{@link offers.CheckQuantityProductCondition <em>Check Quantity Product Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Quantity Product Condition</em>'.
	 * @see offers.CheckQuantityProductCondition
	 * @generated
	 */
	EClass getCheckQuantityProductCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.CheckQuantityProductCondition#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see offers.CheckQuantityProductCondition#getProducts()
	 * @see #getCheckQuantityProductCondition()
	 * @generated
	 */
	EReference getCheckQuantityProductCondition_Products();

	/**
	 * Returns the meta object for class '{@link offers.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see offers.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference '{@link offers.Trigger#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see offers.Trigger#getTarget()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Target();

	/**
	 * Returns the meta object for the attribute '{@link offers.Trigger#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see offers.Trigger#getType()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Type();

	/**
	 * Returns the meta object for class '{@link offers.OfferRule <em>Offer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Rule</em>'.
	 * @see offers.OfferRule
	 * @generated
	 */
	EClass getOfferRule();

	/**
	 * Returns the meta object for the attribute '{@link offers.OfferRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see offers.OfferRule#getName()
	 * @see #getOfferRule()
	 * @generated
	 */
	EAttribute getOfferRule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.OfferRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see offers.OfferRule#getConditions()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.OfferRule#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers</em>'.
	 * @see offers.OfferRule#getOffers()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Offers();

	/**
	 * Returns the meta object for the containment reference list '{@link offers.OfferRule#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see offers.OfferRule#getTriggers()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Triggers();

	/**
	 * Returns the meta object for enum '{@link offers.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Type</em>'.
	 * @see offers.TriggerType
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
		 * The meta object literal for the '{@link offers.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.CategoryImpl
		 * @see offers.impl.OffersPackageImpl#getCategory()
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
		 * The meta object literal for the '{@link offers.impl.SubCategoryImpl <em>Sub Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.SubCategoryImpl
		 * @see offers.impl.OffersPackageImpl#getSubCategory()
		 * @generated
		 */
		EClass SUB_CATEGORY = eINSTANCE.getSubCategory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CATEGORY__CATEGORY = eINSTANCE.getSubCategory_Category();

		/**
		 * The meta object literal for the '{@link offers.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.ProductImpl
		 * @see offers.impl.OffersPackageImpl#getProduct()
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
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__TAGS = eINSTANCE.getProduct_Tags();

		/**
		 * The meta object literal for the '<em><b>Sub Category</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__SUB_CATEGORY = eINSTANCE.getProduct_SubCategory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CATEGORY = eINSTANCE.getProduct_Category();

		/**
		 * The meta object literal for the '{@link offers.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.TagImpl
		 * @see offers.impl.OffersPackageImpl#getTag()
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
		 * The meta object literal for the '{@link offers.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.OfferImpl
		 * @see offers.impl.OffersPackageImpl#getOffer()
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
		 * The meta object literal for the '<em><b>Applicable Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__APPLICABLE_PRODUCTS = eINSTANCE.getOffer_ApplicableProducts();

		/**
		 * The meta object literal for the '<em><b>Applicable Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__APPLICABLE_CATEGORIES = eINSTANCE.getOffer_ApplicableCategories();

		/**
		 * The meta object literal for the '<em><b>Applicable Sub Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__APPLICABLE_SUB_CATEGORIES = eINSTANCE.getOffer_ApplicableSubCategories();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__CONDITIONS = eINSTANCE.getOffer_Conditions();

		/**
		 * The meta object literal for the '{@link offers.impl.OfferPriceReductionImpl <em>Offer Price Reduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.OfferPriceReductionImpl
		 * @see offers.impl.OffersPackageImpl#getOfferPriceReduction()
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
		 * The meta object literal for the '{@link offers.impl.OfferFixedPriceImpl <em>Offer Fixed Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.OfferFixedPriceImpl
		 * @see offers.impl.OffersPackageImpl#getOfferFixedPrice()
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
		 * The meta object literal for the '{@link offers.impl.OfferBuyXGetYFreeImpl <em>Offer Buy XGet YFree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.OfferBuyXGetYFreeImpl
		 * @see offers.impl.OffersPackageImpl#getOfferBuyXGetYFree()
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
		 * The meta object literal for the '{@link offers.impl.OfferXPoundsOffImpl <em>Offer XPounds Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.OfferXPoundsOffImpl
		 * @see offers.impl.OffersPackageImpl#getOfferXPoundsOff()
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
		 * The meta object literal for the '{@link offers.impl.OfferXPoundsOffOnDateImpl <em>Offer XPounds Off On Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.OfferXPoundsOffOnDateImpl
		 * @see offers.impl.OffersPackageImpl#getOfferXPoundsOffOnDate()
		 * @generated
		 */
		EClass OFFER_XPOUNDS_OFF_ON_DATE = eINSTANCE.getOfferXPoundsOffOnDate();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_XPOUNDS_OFF_ON_DATE__DATE = eINSTANCE.getOfferXPoundsOffOnDate_Date();

		/**
		 * The meta object literal for the '{@link offers.impl.OfferPriceReductionOnDateImpl <em>Offer Price Reduction On Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.OfferPriceReductionOnDateImpl
		 * @see offers.impl.OffersPackageImpl#getOfferPriceReductionOnDate()
		 * @generated
		 */
		EClass OFFER_PRICE_REDUCTION_ON_DATE = eINSTANCE.getOfferPriceReductionOnDate();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_PRICE_REDUCTION_ON_DATE__DATE = eINSTANCE.getOfferPriceReductionOnDate_Date();

		/**
		 * The meta object literal for the '{@link offers.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.ConditionImpl
		 * @see offers.impl.OffersPackageImpl#getCondition()
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
		 * The meta object literal for the '{@link offers.impl.CheckTagsConditionImpl <em>Check Tags Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.CheckTagsConditionImpl
		 * @see offers.impl.OffersPackageImpl#getCheckTagsCondition()
		 * @generated
		 */
		EClass CHECK_TAGS_CONDITION = eINSTANCE.getCheckTagsCondition();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_TAGS_CONDITION__TAGS = eINSTANCE.getCheckTagsCondition_Tags();

		/**
		 * The meta object literal for the '{@link offers.impl.MinPriceConditionImpl <em>Min Price Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.MinPriceConditionImpl
		 * @see offers.impl.OffersPackageImpl#getMinPriceCondition()
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
		 * The meta object literal for the '{@link offers.impl.CheckQuantityConditionImpl <em>Check Quantity Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.CheckQuantityConditionImpl
		 * @see offers.impl.OffersPackageImpl#getCheckQuantityCondition()
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
		 * The meta object literal for the '{@link offers.impl.CheckQuantityCategoryConditionImpl <em>Check Quantity Category Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.CheckQuantityCategoryConditionImpl
		 * @see offers.impl.OffersPackageImpl#getCheckQuantityCategoryCondition()
		 * @generated
		 */
		EClass CHECK_QUANTITY_CATEGORY_CONDITION = eINSTANCE.getCheckQuantityCategoryCondition();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_QUANTITY_CATEGORY_CONDITION__CATEGORIES = eINSTANCE.getCheckQuantityCategoryCondition_Categories();

		/**
		 * The meta object literal for the '{@link offers.impl.CheckQuantitySubCategoryConditionImpl <em>Check Quantity Sub Category Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.CheckQuantitySubCategoryConditionImpl
		 * @see offers.impl.OffersPackageImpl#getCheckQuantitySubCategoryCondition()
		 * @generated
		 */
		EClass CHECK_QUANTITY_SUB_CATEGORY_CONDITION = eINSTANCE.getCheckQuantitySubCategoryCondition();

		/**
		 * The meta object literal for the '<em><b>Sub Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_QUANTITY_SUB_CATEGORY_CONDITION__SUB_CATEGORIES = eINSTANCE.getCheckQuantitySubCategoryCondition_SubCategories();

		/**
		 * The meta object literal for the '{@link offers.impl.CheckQuantityProductConditionImpl <em>Check Quantity Product Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.CheckQuantityProductConditionImpl
		 * @see offers.impl.OffersPackageImpl#getCheckQuantityProductCondition()
		 * @generated
		 */
		EClass CHECK_QUANTITY_PRODUCT_CONDITION = eINSTANCE.getCheckQuantityProductCondition();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_QUANTITY_PRODUCT_CONDITION__PRODUCTS = eINSTANCE.getCheckQuantityProductCondition_Products();

		/**
		 * The meta object literal for the '{@link offers.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.TriggerImpl
		 * @see offers.impl.OffersPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

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
		 * The meta object literal for the '{@link offers.impl.OfferRuleImpl <em>Offer Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.impl.OfferRuleImpl
		 * @see offers.impl.OffersPackageImpl#getOfferRule()
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
		 * The meta object literal for the '{@link offers.TriggerType <em>Trigger Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see offers.TriggerType
		 * @see offers.impl.OffersPackageImpl#getTriggerType()
		 * @generated
		 */
		EEnum TRIGGER_TYPE = eINSTANCE.getTriggerType();

	}

} //OffersPackage
