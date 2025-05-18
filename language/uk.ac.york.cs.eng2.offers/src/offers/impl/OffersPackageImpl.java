/**
 */
package offers.impl;

import offers.Category;
import offers.CheckQuantityCategoryCondition;
import offers.CheckQuantityCondition;
import offers.CheckQuantityProductCondition;
import offers.CheckQuantitySubCategoryCondition;
import offers.CheckTagsCondition;
import offers.Condition;
import offers.MinPriceCondition;
import offers.Offer;
import offers.OfferBuyXGetYFree;
import offers.OfferFixedPrice;
import offers.OfferPriceReduction;
import offers.OfferPriceReductionOnDate;
import offers.OfferRule;
import offers.OfferXPoundsOff;
import offers.OfferXPoundsOffOnDate;
import offers.OffersFactory;
import offers.OffersPackage;
import offers.Product;
import offers.SubCategory;
import offers.Tag;
import offers.Trigger;
import offers.TriggerType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OffersPackageImpl extends EPackageImpl implements OffersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerPriceReductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerFixedPriceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerBuyXGetYFreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerXPoundsOffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerXPoundsOffOnDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerPriceReductionOnDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkTagsConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minPriceConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkQuantityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkQuantityCategoryConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkQuantitySubCategoryConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkQuantityProductConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see offers.OffersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OffersPackageImpl() {
		super(eNS_URI, OffersFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OffersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OffersPackage init() {
		if (isInited) return (OffersPackage)EPackage.Registry.INSTANCE.getEPackage(OffersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOffersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OffersPackageImpl theOffersPackage = registeredOffersPackage instanceof OffersPackageImpl ? (OffersPackageImpl)registeredOffersPackage : new OffersPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOffersPackage.createPackageContents();

		// Initialize created meta-data
		theOffersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOffersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OffersPackage.eNS_URI, theOffersPackage);
		return theOffersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategory_Name() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubCategory() {
		return subCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubCategory_Category() {
		return (EReference)subCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Name() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Tags() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_SubCategory() {
		return (EReference)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Category() {
		return (EReference)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Tag() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOffer() {
		return offerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_Name() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOffer_ApplicableProducts() {
		return (EReference)offerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOffer_ApplicableCategories() {
		return (EReference)offerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOffer_ApplicableSubCategories() {
		return (EReference)offerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOffer_Conditions() {
		return (EReference)offerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOfferPriceReduction() {
		return offerPriceReductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfferPriceReduction_PercentageReduction() {
		return (EAttribute)offerPriceReductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOfferFixedPrice() {
		return offerFixedPriceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfferFixedPrice_NewPrice() {
		return (EAttribute)offerFixedPriceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOfferBuyXGetYFree() {
		return offerBuyXGetYFreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfferBuyXGetYFree_X() {
		return (EAttribute)offerBuyXGetYFreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfferBuyXGetYFree_Y() {
		return (EAttribute)offerBuyXGetYFreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOfferXPoundsOff() {
		return offerXPoundsOffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfferXPoundsOff_X() {
		return (EAttribute)offerXPoundsOffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOfferXPoundsOffOnDate() {
		return offerXPoundsOffOnDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfferXPoundsOffOnDate_Date() {
		return (EAttribute)offerXPoundsOffOnDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOfferPriceReductionOnDate() {
		return offerPriceReductionOnDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfferPriceReductionOnDate_Date() {
		return (EAttribute)offerPriceReductionOnDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondition_Name() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckTagsCondition() {
		return checkTagsConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckTagsCondition_Tags() {
		return (EReference)checkTagsConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinPriceCondition() {
		return minPriceConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinPriceCondition_MinPrice() {
		return (EAttribute)minPriceConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckQuantityCondition() {
		return checkQuantityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckQuantityCondition_Quantity() {
		return (EAttribute)checkQuantityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckQuantityCategoryCondition() {
		return checkQuantityCategoryConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckQuantityCategoryCondition_Categories() {
		return (EReference)checkQuantityCategoryConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckQuantitySubCategoryCondition() {
		return checkQuantitySubCategoryConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckQuantitySubCategoryCondition_SubCategories() {
		return (EReference)checkQuantitySubCategoryConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckQuantityProductCondition() {
		return checkQuantityProductConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckQuantityProductCondition_Products() {
		return (EReference)checkQuantityProductConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrigger_Target() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrigger_Type() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOfferRule() {
		return offerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfferRule_Name() {
		return (EAttribute)offerRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfferRule_Conditions() {
		return (EReference)offerRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfferRule_Offers() {
		return (EReference)offerRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfferRule_Triggers() {
		return (EReference)offerRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTriggerType() {
		return triggerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OffersFactory getOffersFactory() {
		return (OffersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__NAME);

		subCategoryEClass = createEClass(SUB_CATEGORY);
		createEReference(subCategoryEClass, SUB_CATEGORY__CATEGORY);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEReference(productEClass, PRODUCT__TAGS);
		createEReference(productEClass, PRODUCT__SUB_CATEGORY);
		createEReference(productEClass, PRODUCT__CATEGORY);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__TAG);

		offerEClass = createEClass(OFFER);
		createEAttribute(offerEClass, OFFER__NAME);
		createEReference(offerEClass, OFFER__APPLICABLE_PRODUCTS);
		createEReference(offerEClass, OFFER__APPLICABLE_CATEGORIES);
		createEReference(offerEClass, OFFER__APPLICABLE_SUB_CATEGORIES);
		createEReference(offerEClass, OFFER__CONDITIONS);

		offerPriceReductionEClass = createEClass(OFFER_PRICE_REDUCTION);
		createEAttribute(offerPriceReductionEClass, OFFER_PRICE_REDUCTION__PERCENTAGE_REDUCTION);

		offerFixedPriceEClass = createEClass(OFFER_FIXED_PRICE);
		createEAttribute(offerFixedPriceEClass, OFFER_FIXED_PRICE__NEW_PRICE);

		offerBuyXGetYFreeEClass = createEClass(OFFER_BUY_XGET_YFREE);
		createEAttribute(offerBuyXGetYFreeEClass, OFFER_BUY_XGET_YFREE__X);
		createEAttribute(offerBuyXGetYFreeEClass, OFFER_BUY_XGET_YFREE__Y);

		offerXPoundsOffEClass = createEClass(OFFER_XPOUNDS_OFF);
		createEAttribute(offerXPoundsOffEClass, OFFER_XPOUNDS_OFF__X);

		offerXPoundsOffOnDateEClass = createEClass(OFFER_XPOUNDS_OFF_ON_DATE);
		createEAttribute(offerXPoundsOffOnDateEClass, OFFER_XPOUNDS_OFF_ON_DATE__DATE);

		offerPriceReductionOnDateEClass = createEClass(OFFER_PRICE_REDUCTION_ON_DATE);
		createEAttribute(offerPriceReductionOnDateEClass, OFFER_PRICE_REDUCTION_ON_DATE__DATE);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__NAME);

		checkTagsConditionEClass = createEClass(CHECK_TAGS_CONDITION);
		createEReference(checkTagsConditionEClass, CHECK_TAGS_CONDITION__TAGS);

		minPriceConditionEClass = createEClass(MIN_PRICE_CONDITION);
		createEAttribute(minPriceConditionEClass, MIN_PRICE_CONDITION__MIN_PRICE);

		checkQuantityConditionEClass = createEClass(CHECK_QUANTITY_CONDITION);
		createEAttribute(checkQuantityConditionEClass, CHECK_QUANTITY_CONDITION__QUANTITY);

		checkQuantityCategoryConditionEClass = createEClass(CHECK_QUANTITY_CATEGORY_CONDITION);
		createEReference(checkQuantityCategoryConditionEClass, CHECK_QUANTITY_CATEGORY_CONDITION__CATEGORIES);

		checkQuantitySubCategoryConditionEClass = createEClass(CHECK_QUANTITY_SUB_CATEGORY_CONDITION);
		createEReference(checkQuantitySubCategoryConditionEClass, CHECK_QUANTITY_SUB_CATEGORY_CONDITION__SUB_CATEGORIES);

		checkQuantityProductConditionEClass = createEClass(CHECK_QUANTITY_PRODUCT_CONDITION);
		createEReference(checkQuantityProductConditionEClass, CHECK_QUANTITY_PRODUCT_CONDITION__PRODUCTS);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__TARGET);
		createEAttribute(triggerEClass, TRIGGER__TYPE);

		offerRuleEClass = createEClass(OFFER_RULE);
		createEAttribute(offerRuleEClass, OFFER_RULE__NAME);
		createEReference(offerRuleEClass, OFFER_RULE__CONDITIONS);
		createEReference(offerRuleEClass, OFFER_RULE__OFFERS);
		createEReference(offerRuleEClass, OFFER_RULE__TRIGGERS);

		// Create enums
		triggerTypeEEnum = createEEnum(TRIGGER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		subCategoryEClass.getESuperTypes().add(this.getCategory());
		offerPriceReductionEClass.getESuperTypes().add(this.getOffer());
		offerFixedPriceEClass.getESuperTypes().add(this.getOffer());
		offerBuyXGetYFreeEClass.getESuperTypes().add(this.getOffer());
		offerXPoundsOffEClass.getESuperTypes().add(this.getOffer());
		offerXPoundsOffOnDateEClass.getESuperTypes().add(this.getOfferXPoundsOff());
		offerPriceReductionOnDateEClass.getESuperTypes().add(this.getOfferPriceReduction());
		checkTagsConditionEClass.getESuperTypes().add(this.getCondition());
		minPriceConditionEClass.getESuperTypes().add(this.getCondition());
		checkQuantityConditionEClass.getESuperTypes().add(this.getCondition());
		checkQuantityCategoryConditionEClass.getESuperTypes().add(this.getCheckQuantityCondition());
		checkQuantitySubCategoryConditionEClass.getESuperTypes().add(this.getCheckQuantityCondition());
		checkQuantityProductConditionEClass.getESuperTypes().add(this.getCheckQuantityCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subCategoryEClass, SubCategory.class, "SubCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubCategory_Category(), this.getCategory(), null, "category", null, 0, 1, SubCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Tags(), this.getTag(), null, "tags", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_SubCategory(), this.getSubCategory(), null, "subCategory", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Category(), this.getCategory(), null, "category", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerEClass, Offer.class, "Offer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffer_ApplicableProducts(), this.getProduct(), null, "applicableProducts", null, 0, -1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffer_ApplicableCategories(), this.getCategory(), null, "applicableCategories", null, 0, -1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffer_ApplicableSubCategories(), this.getSubCategory(), null, "applicableSubCategories", null, 0, -1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffer_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerPriceReductionEClass, OfferPriceReduction.class, "OfferPriceReduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfferPriceReduction_PercentageReduction(), ecorePackage.getEFloat(), "percentageReduction", null, 0, 1, OfferPriceReduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerFixedPriceEClass, OfferFixedPrice.class, "OfferFixedPrice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfferFixedPrice_NewPrice(), ecorePackage.getEFloat(), "newPrice", null, 0, 1, OfferFixedPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerBuyXGetYFreeEClass, OfferBuyXGetYFree.class, "OfferBuyXGetYFree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfferBuyXGetYFree_X(), ecorePackage.getEInt(), "x", null, 0, 1, OfferBuyXGetYFree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOfferBuyXGetYFree_Y(), ecorePackage.getEInt(), "y", null, 0, 1, OfferBuyXGetYFree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerXPoundsOffEClass, OfferXPoundsOff.class, "OfferXPoundsOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfferXPoundsOff_X(), ecorePackage.getEInt(), "x", null, 0, 1, OfferXPoundsOff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerXPoundsOffOnDateEClass, OfferXPoundsOffOnDate.class, "OfferXPoundsOffOnDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfferXPoundsOffOnDate_Date(), ecorePackage.getEString(), "date", null, 0, 1, OfferXPoundsOffOnDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerPriceReductionOnDateEClass, OfferPriceReductionOnDate.class, "OfferPriceReductionOnDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfferPriceReductionOnDate_Date(), ecorePackage.getEString(), "date", null, 0, 1, OfferPriceReductionOnDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkTagsConditionEClass, CheckTagsCondition.class, "CheckTagsCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckTagsCondition_Tags(), this.getTag(), null, "tags", null, 0, -1, CheckTagsCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minPriceConditionEClass, MinPriceCondition.class, "MinPriceCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinPriceCondition_MinPrice(), ecorePackage.getEFloat(), "minPrice", null, 0, 1, MinPriceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkQuantityConditionEClass, CheckQuantityCondition.class, "CheckQuantityCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckQuantityCondition_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, CheckQuantityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkQuantityCategoryConditionEClass, CheckQuantityCategoryCondition.class, "CheckQuantityCategoryCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckQuantityCategoryCondition_Categories(), this.getCategory(), null, "categories", null, 0, -1, CheckQuantityCategoryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkQuantitySubCategoryConditionEClass, CheckQuantitySubCategoryCondition.class, "CheckQuantitySubCategoryCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckQuantitySubCategoryCondition_SubCategories(), this.getSubCategory(), null, "subCategories", null, 0, -1, CheckQuantitySubCategoryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkQuantityProductConditionEClass, CheckQuantityProductCondition.class, "CheckQuantityProductCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckQuantityProductCondition_Products(), this.getProduct(), null, "products", null, 0, -1, CheckQuantityProductCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Target(), this.getOfferRule(), null, "target", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Type(), this.getTriggerType(), "type", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerRuleEClass, OfferRule.class, "OfferRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfferRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOfferRule_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOfferRule_Offers(), this.getOffer(), null, "offers", null, 0, -1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOfferRule_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(triggerTypeEEnum, TriggerType.class, "TriggerType");
		addEEnumLiteral(triggerTypeEEnum, TriggerType.ALWAYS);
		addEEnumLiteral(triggerTypeEEnum, TriggerType.IF_MATCH);
		addEEnumLiteral(triggerTypeEEnum, TriggerType.IF_NOT_MATCH);

		// Create resource
		createResource(eNS_URI);
	}

} //OffersPackageImpl
