/**
 */
package offers.util;

import offers.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see offers.OffersPackage
 * @generated
 */
public class OffersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OffersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OffersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OffersSwitch<Adapter> modelSwitch =
		new OffersSwitch<Adapter>() {
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseSubCategory(SubCategory object) {
				return createSubCategoryAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseOffer(Offer object) {
				return createOfferAdapter();
			}
			@Override
			public Adapter caseOfferPriceReduction(OfferPriceReduction object) {
				return createOfferPriceReductionAdapter();
			}
			@Override
			public Adapter caseOfferFixedPrice(OfferFixedPrice object) {
				return createOfferFixedPriceAdapter();
			}
			@Override
			public Adapter caseOfferBuyXGetYFree(OfferBuyXGetYFree object) {
				return createOfferBuyXGetYFreeAdapter();
			}
			@Override
			public Adapter caseOfferXPoundsOff(OfferXPoundsOff object) {
				return createOfferXPoundsOffAdapter();
			}
			@Override
			public Adapter caseOfferXPoundsOffOnDate(OfferXPoundsOffOnDate object) {
				return createOfferXPoundsOffOnDateAdapter();
			}
			@Override
			public Adapter caseOfferPriceReductionOnDate(OfferPriceReductionOnDate object) {
				return createOfferPriceReductionOnDateAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseCheckTagsCondition(CheckTagsCondition object) {
				return createCheckTagsConditionAdapter();
			}
			@Override
			public Adapter caseMinPriceCondition(MinPriceCondition object) {
				return createMinPriceConditionAdapter();
			}
			@Override
			public Adapter caseCheckQuantityCondition(CheckQuantityCondition object) {
				return createCheckQuantityConditionAdapter();
			}
			@Override
			public Adapter caseCheckQuantityCategoryCondition(CheckQuantityCategoryCondition object) {
				return createCheckQuantityCategoryConditionAdapter();
			}
			@Override
			public Adapter caseCheckQuantitySubCategoryCondition(CheckQuantitySubCategoryCondition object) {
				return createCheckQuantitySubCategoryConditionAdapter();
			}
			@Override
			public Adapter caseCheckQuantityProductCondition(CheckQuantityProductCondition object) {
				return createCheckQuantityProductConditionAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseOfferRule(OfferRule object) {
				return createOfferRuleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link offers.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.SubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.SubCategory
	 * @generated
	 */
	public Adapter createSubCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.Offer
	 * @generated
	 */
	public Adapter createOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.OfferPriceReduction <em>Offer Price Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.OfferPriceReduction
	 * @generated
	 */
	public Adapter createOfferPriceReductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.OfferFixedPrice <em>Offer Fixed Price</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.OfferFixedPrice
	 * @generated
	 */
	public Adapter createOfferFixedPriceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.OfferBuyXGetYFree <em>Offer Buy XGet YFree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.OfferBuyXGetYFree
	 * @generated
	 */
	public Adapter createOfferBuyXGetYFreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.OfferXPoundsOff <em>Offer XPounds Off</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.OfferXPoundsOff
	 * @generated
	 */
	public Adapter createOfferXPoundsOffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.OfferXPoundsOffOnDate <em>Offer XPounds Off On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.OfferXPoundsOffOnDate
	 * @generated
	 */
	public Adapter createOfferXPoundsOffOnDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.OfferPriceReductionOnDate <em>Offer Price Reduction On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.OfferPriceReductionOnDate
	 * @generated
	 */
	public Adapter createOfferPriceReductionOnDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.CheckTagsCondition <em>Check Tags Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.CheckTagsCondition
	 * @generated
	 */
	public Adapter createCheckTagsConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.MinPriceCondition <em>Min Price Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.MinPriceCondition
	 * @generated
	 */
	public Adapter createMinPriceConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.CheckQuantityCondition <em>Check Quantity Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.CheckQuantityCondition
	 * @generated
	 */
	public Adapter createCheckQuantityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.CheckQuantityCategoryCondition <em>Check Quantity Category Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.CheckQuantityCategoryCondition
	 * @generated
	 */
	public Adapter createCheckQuantityCategoryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.CheckQuantitySubCategoryCondition <em>Check Quantity Sub Category Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.CheckQuantitySubCategoryCondition
	 * @generated
	 */
	public Adapter createCheckQuantitySubCategoryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.CheckQuantityProductCondition <em>Check Quantity Product Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.CheckQuantityProductCondition
	 * @generated
	 */
	public Adapter createCheckQuantityProductConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link offers.OfferRule <em>Offer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see offers.OfferRule
	 * @generated
	 */
	public Adapter createOfferRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OffersAdapterFactory
