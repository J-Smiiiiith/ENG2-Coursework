/**
 */
package uk.ac.york.cs.eng2.offers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.york.cs.eng2.offers.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersPackage
 * @generated
 */
public class OffersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OffersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffersSwitch() {
		if (modelPackage == null) {
			modelPackage = OffersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OffersPackage.OFFER_COMPONENTS: {
				OfferComponents offerComponents = (OfferComponents)theEObject;
				T result = caseOfferComponents(offerComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.PRODUCTS: {
				Products products = (Products)theEObject;
				T result = caseProducts(products);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.CATEGORIES: {
				Categories categories = (Categories)theEObject;
				T result = caseCategories(categories);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.SUB_CATEGORIES: {
				SubCategories subCategories = (SubCategories)theEObject;
				T result = caseSubCategories(subCategories);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.TAGS: {
				Tags tags = (Tags)theEObject;
				T result = caseTags(tags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.ALL_OFFERS: {
				AllOffers allOffers = (AllOffers)theEObject;
				T result = caseAllOffers(allOffers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.OFFER_RULE: {
				OfferRule offerRule = (OfferRule)theEObject;
				T result = caseOfferRule(offerRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.SUB_CATEGORY: {
				SubCategory subCategory = (SubCategory)theEObject;
				T result = caseSubCategory(subCategory);
				if (result == null) result = caseCategory(subCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.OFFER: {
				Offer offer = (Offer)theEObject;
				T result = caseOffer(offer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.FREE_PRODUCT_OFFER: {
				FreeProductOffer freeProductOffer = (FreeProductOffer)theEObject;
				T result = caseFreeProductOffer(freeProductOffer);
				if (result == null) result = caseOffer(freeProductOffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.OFFER_PRICE_REDUCTION: {
				OfferPriceReduction offerPriceReduction = (OfferPriceReduction)theEObject;
				T result = caseOfferPriceReduction(offerPriceReduction);
				if (result == null) result = caseOffer(offerPriceReduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.OFFER_FIXED_PRICE: {
				OfferFixedPrice offerFixedPrice = (OfferFixedPrice)theEObject;
				T result = caseOfferFixedPrice(offerFixedPrice);
				if (result == null) result = caseOffer(offerFixedPrice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.OFFER_BUY_XGET_YFREE: {
				OfferBuyXGetYFree offerBuyXGetYFree = (OfferBuyXGetYFree)theEObject;
				T result = caseOfferBuyXGetYFree(offerBuyXGetYFree);
				if (result == null) result = caseOffer(offerBuyXGetYFree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.OFFER_XPOUNDS_OFF: {
				OfferXPoundsOff offerXPoundsOff = (OfferXPoundsOff)theEObject;
				T result = caseOfferXPoundsOff(offerXPoundsOff);
				if (result == null) result = caseOffer(offerXPoundsOff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.MIN_PRICE_CONDITION: {
				MinPriceCondition minPriceCondition = (MinPriceCondition)theEObject;
				T result = caseMinPriceCondition(minPriceCondition);
				if (result == null) result = caseCondition(minPriceCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.CHECK_QUANTITY_CONDITION: {
				CheckQuantityCondition checkQuantityCondition = (CheckQuantityCondition)theEObject;
				T result = caseCheckQuantityCondition(checkQuantityCondition);
				if (result == null) result = caseCondition(checkQuantityCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.CHECK_NUM_ORDERS_CONDITION: {
				CheckNumOrdersCondition checkNumOrdersCondition = (CheckNumOrdersCondition)theEObject;
				T result = caseCheckNumOrdersCondition(checkNumOrdersCondition);
				if (result == null) result = caseCondition(checkNumOrdersCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.CHECK_DATE_CONDITION: {
				CheckDateCondition checkDateCondition = (CheckDateCondition)theEObject;
				T result = caseCheckDateCondition(checkDateCondition);
				if (result == null) result = caseCondition(checkDateCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfferComponents(OfferComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Products</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Products</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProducts(Products object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categories</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categories</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategories(Categories object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Categories</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Categories</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubCategories(SubCategories object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTags(Tags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Offers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Offers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllOffers(AllOffers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfferRule(OfferRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubCategory(SubCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffer(Offer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Product Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Product Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeProductOffer(FreeProductOffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer Price Reduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer Price Reduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfferPriceReduction(OfferPriceReduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer Fixed Price</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer Fixed Price</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfferFixedPrice(OfferFixedPrice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer Buy XGet YFree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer Buy XGet YFree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfferBuyXGetYFree(OfferBuyXGetYFree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer XPounds Off</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer XPounds Off</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfferXPoundsOff(OfferXPoundsOff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Price Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Price Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinPriceCondition(MinPriceCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Quantity Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Quantity Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckQuantityCondition(CheckQuantityCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Num Orders Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Num Orders Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckNumOrdersCondition(CheckNumOrdersCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Date Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Date Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckDateCondition(CheckDateCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OffersSwitch
