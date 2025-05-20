/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.cs.eng2.offers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OffersFactoryImpl extends EFactoryImpl implements OffersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OffersFactory init() {
		try {
			OffersFactory theOffersFactory = (OffersFactory)EPackage.Registry.INSTANCE.getEFactory(OffersPackage.eNS_URI);
			if (theOffersFactory != null) {
				return theOffersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OffersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OffersPackage.OFFER_COMPONENTS: return createOfferComponents();
			case OffersPackage.PRODUCTS: return createProducts();
			case OffersPackage.CATEGORIES: return createCategories();
			case OffersPackage.SUB_CATEGORIES: return createSubCategories();
			case OffersPackage.TAGS: return createTags();
			case OffersPackage.ALL_OFFERS: return createAllOffers();
			case OffersPackage.OFFER_RULE: return createOfferRule();
			case OffersPackage.PRODUCT: return createProduct();
			case OffersPackage.CATEGORY: return createCategory();
			case OffersPackage.SUB_CATEGORY: return createSubCategory();
			case OffersPackage.TAG: return createTag();
			case OffersPackage.OFFER_PRICE_REDUCTION: return createOfferPriceReduction();
			case OffersPackage.OFFER_FIXED_PRICE: return createOfferFixedPrice();
			case OffersPackage.OFFER_BUY_XGET_YFREE: return createOfferBuyXGetYFree();
			case OffersPackage.OFFER_XPOUNDS_OFF: return createOfferXPoundsOff();
			case OffersPackage.OFFER_XPOUNDS_OFF_ON_DATE: return createOfferXPoundsOffOnDate();
			case OffersPackage.OFFER_PRICE_REDUCTION_ON_DATE: return createOfferPriceReductionOnDate();
			case OffersPackage.MIN_PRICE_CONDITION: return createMinPriceCondition();
			case OffersPackage.CHECK_QUANTITY_CONDITION: return createCheckQuantityCondition();
			case OffersPackage.TRIGGER: return createTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OffersPackage.TRIGGER_TYPE:
				return createTriggerTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OffersPackage.TRIGGER_TYPE:
				return convertTriggerTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferComponents createOfferComponents() {
		OfferComponentsImpl offerComponents = new OfferComponentsImpl();
		return offerComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Products createProducts() {
		ProductsImpl products = new ProductsImpl();
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Categories createCategories() {
		CategoriesImpl categories = new CategoriesImpl();
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategories createSubCategories() {
		SubCategoriesImpl subCategories = new SubCategoriesImpl();
		return subCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tags createTags() {
		TagsImpl tags = new TagsImpl();
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllOffers createAllOffers() {
		AllOffersImpl allOffers = new AllOffersImpl();
		return allOffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferRule createOfferRule() {
		OfferRuleImpl offerRule = new OfferRuleImpl();
		return offerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory createSubCategory() {
		SubCategoryImpl subCategory = new SubCategoryImpl();
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferPriceReduction createOfferPriceReduction() {
		OfferPriceReductionImpl offerPriceReduction = new OfferPriceReductionImpl();
		return offerPriceReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferFixedPrice createOfferFixedPrice() {
		OfferFixedPriceImpl offerFixedPrice = new OfferFixedPriceImpl();
		return offerFixedPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferBuyXGetYFree createOfferBuyXGetYFree() {
		OfferBuyXGetYFreeImpl offerBuyXGetYFree = new OfferBuyXGetYFreeImpl();
		return offerBuyXGetYFree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferXPoundsOff createOfferXPoundsOff() {
		OfferXPoundsOffImpl offerXPoundsOff = new OfferXPoundsOffImpl();
		return offerXPoundsOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferXPoundsOffOnDate createOfferXPoundsOffOnDate() {
		OfferXPoundsOffOnDateImpl offerXPoundsOffOnDate = new OfferXPoundsOffOnDateImpl();
		return offerXPoundsOffOnDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferPriceReductionOnDate createOfferPriceReductionOnDate() {
		OfferPriceReductionOnDateImpl offerPriceReductionOnDate = new OfferPriceReductionOnDateImpl();
		return offerPriceReductionOnDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinPriceCondition createMinPriceCondition() {
		MinPriceConditionImpl minPriceCondition = new MinPriceConditionImpl();
		return minPriceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckQuantityCondition createCheckQuantityCondition() {
		CheckQuantityConditionImpl checkQuantityCondition = new CheckQuantityConditionImpl();
		return checkQuantityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerType createTriggerTypeFromString(EDataType eDataType, String initialValue) {
		TriggerType result = TriggerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OffersPackage getOffersPackage() {
		return (OffersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OffersPackage getPackage() {
		return OffersPackage.eINSTANCE;
	}

} //OffersFactoryImpl
