/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.cs.eng2.offers.Category;
import uk.ac.york.cs.eng2.offers.Offer;
import uk.ac.york.cs.eng2.offers.OfferComponents;
import uk.ac.york.cs.eng2.offers.OfferRule;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Product;
import uk.ac.york.cs.eng2.offers.SubCategory;
import uk.ac.york.cs.eng2.offers.Tag;
import uk.ac.york.cs.eng2.offers.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl#getOfferRules <em>Offer Rules</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl#getOffers <em>Offers</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OfferComponentsImpl extends MinimalEObjectImpl.Container implements OfferComponents {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getSubCategories() <em>Sub Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<SubCategory> subCategories;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getOfferRules() <em>Offer Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferRules()
	 * @generated
	 * @ordered
	 */
	protected EList<OfferRule> offerRules;

	/**
	 * The cached value of the '{@link #getOffers() <em>Offers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<Offer> offers;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.OFFER_COMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<Product>(Product.class, this, OffersPackage.OFFER_COMPONENTS__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class, this, OffersPackage.OFFER_COMPONENTS__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubCategory> getSubCategories() {
		if (subCategories == null) {
			subCategories = new EObjectContainmentEList<SubCategory>(SubCategory.class, this, OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES);
		}
		return subCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, OffersPackage.OFFER_COMPONENTS__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OfferRule> getOfferRules() {
		if (offerRules == null) {
			offerRules = new EObjectContainmentEList<OfferRule>(OfferRule.class, this, OffersPackage.OFFER_COMPONENTS__OFFER_RULES);
		}
		return offerRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Offer> getOffers() {
		if (offers == null) {
			offers = new EObjectContainmentEList<Offer>(Offer.class, this, OffersPackage.OFFER_COMPONENTS__OFFERS);
		}
		return offers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, OffersPackage.OFFER_COMPONENTS__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OffersPackage.OFFER_COMPONENTS__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER_COMPONENTS__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES:
				return ((InternalEList<?>)getSubCategories()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER_COMPONENTS__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER_COMPONENTS__OFFER_RULES:
				return ((InternalEList<?>)getOfferRules()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER_COMPONENTS__OFFERS:
				return ((InternalEList<?>)getOffers()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER_COMPONENTS__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.OFFER_COMPONENTS__PRODUCTS:
				return getProducts();
			case OffersPackage.OFFER_COMPONENTS__CATEGORIES:
				return getCategories();
			case OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES:
				return getSubCategories();
			case OffersPackage.OFFER_COMPONENTS__TAGS:
				return getTags();
			case OffersPackage.OFFER_COMPONENTS__OFFER_RULES:
				return getOfferRules();
			case OffersPackage.OFFER_COMPONENTS__OFFERS:
				return getOffers();
			case OffersPackage.OFFER_COMPONENTS__TRIGGERS:
				return getTriggers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OffersPackage.OFFER_COMPONENTS__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case OffersPackage.OFFER_COMPONENTS__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES:
				getSubCategories().clear();
				getSubCategories().addAll((Collection<? extends SubCategory>)newValue);
				return;
			case OffersPackage.OFFER_COMPONENTS__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case OffersPackage.OFFER_COMPONENTS__OFFER_RULES:
				getOfferRules().clear();
				getOfferRules().addAll((Collection<? extends OfferRule>)newValue);
				return;
			case OffersPackage.OFFER_COMPONENTS__OFFERS:
				getOffers().clear();
				getOffers().addAll((Collection<? extends Offer>)newValue);
				return;
			case OffersPackage.OFFER_COMPONENTS__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends Trigger>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OffersPackage.OFFER_COMPONENTS__PRODUCTS:
				getProducts().clear();
				return;
			case OffersPackage.OFFER_COMPONENTS__CATEGORIES:
				getCategories().clear();
				return;
			case OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES:
				getSubCategories().clear();
				return;
			case OffersPackage.OFFER_COMPONENTS__TAGS:
				getTags().clear();
				return;
			case OffersPackage.OFFER_COMPONENTS__OFFER_RULES:
				getOfferRules().clear();
				return;
			case OffersPackage.OFFER_COMPONENTS__OFFERS:
				getOffers().clear();
				return;
			case OffersPackage.OFFER_COMPONENTS__TRIGGERS:
				getTriggers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OffersPackage.OFFER_COMPONENTS__PRODUCTS:
				return products != null && !products.isEmpty();
			case OffersPackage.OFFER_COMPONENTS__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES:
				return subCategories != null && !subCategories.isEmpty();
			case OffersPackage.OFFER_COMPONENTS__TAGS:
				return tags != null && !tags.isEmpty();
			case OffersPackage.OFFER_COMPONENTS__OFFER_RULES:
				return offerRules != null && !offerRules.isEmpty();
			case OffersPackage.OFFER_COMPONENTS__OFFERS:
				return offers != null && !offers.isEmpty();
			case OffersPackage.OFFER_COMPONENTS__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OfferComponentsImpl
