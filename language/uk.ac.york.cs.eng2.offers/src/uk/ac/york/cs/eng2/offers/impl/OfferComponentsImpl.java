/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.cs.eng2.offers.AllOffers;
import uk.ac.york.cs.eng2.offers.Categories;
import uk.ac.york.cs.eng2.offers.OfferComponents;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Products;
import uk.ac.york.cs.eng2.offers.SubCategories;
import uk.ac.york.cs.eng2.offers.Tags;

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
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferComponentsImpl#getOffers <em>Offers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OfferComponentsImpl extends MinimalEObjectImpl.Container implements OfferComponents {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected Products products;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected Categories categories;

	/**
	 * The cached value of the '{@link #getSubCategories() <em>Sub Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategories()
	 * @generated
	 * @ordered
	 */
	protected SubCategories subCategories;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected Tags tags;

	/**
	 * The cached value of the '{@link #getOffers() <em>Offers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffers()
	 * @generated
	 * @ordered
	 */
	protected AllOffers offers;

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
	public Products getProducts() {
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProducts(Products newProducts, NotificationChain msgs) {
		Products oldProducts = products;
		products = newProducts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_COMPONENTS__PRODUCTS, oldProducts, newProducts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProducts(Products newProducts) {
		if (newProducts != products) {
			NotificationChain msgs = null;
			if (products != null)
				msgs = ((InternalEObject)products).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OffersPackage.OFFER_COMPONENTS__PRODUCTS, null, msgs);
			if (newProducts != null)
				msgs = ((InternalEObject)newProducts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OffersPackage.OFFER_COMPONENTS__PRODUCTS, null, msgs);
			msgs = basicSetProducts(newProducts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_COMPONENTS__PRODUCTS, newProducts, newProducts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Categories getCategories() {
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategories(Categories newCategories, NotificationChain msgs) {
		Categories oldCategories = categories;
		categories = newCategories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_COMPONENTS__CATEGORIES, oldCategories, newCategories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategories(Categories newCategories) {
		if (newCategories != categories) {
			NotificationChain msgs = null;
			if (categories != null)
				msgs = ((InternalEObject)categories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OffersPackage.OFFER_COMPONENTS__CATEGORIES, null, msgs);
			if (newCategories != null)
				msgs = ((InternalEObject)newCategories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OffersPackage.OFFER_COMPONENTS__CATEGORIES, null, msgs);
			msgs = basicSetCategories(newCategories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_COMPONENTS__CATEGORIES, newCategories, newCategories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategories getSubCategories() {
		return subCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubCategories(SubCategories newSubCategories, NotificationChain msgs) {
		SubCategories oldSubCategories = subCategories;
		subCategories = newSubCategories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES, oldSubCategories, newSubCategories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubCategories(SubCategories newSubCategories) {
		if (newSubCategories != subCategories) {
			NotificationChain msgs = null;
			if (subCategories != null)
				msgs = ((InternalEObject)subCategories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES, null, msgs);
			if (newSubCategories != null)
				msgs = ((InternalEObject)newSubCategories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES, null, msgs);
			msgs = basicSetSubCategories(newSubCategories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES, newSubCategories, newSubCategories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tags getTags() {
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTags(Tags newTags, NotificationChain msgs) {
		Tags oldTags = tags;
		tags = newTags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_COMPONENTS__TAGS, oldTags, newTags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTags(Tags newTags) {
		if (newTags != tags) {
			NotificationChain msgs = null;
			if (tags != null)
				msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OffersPackage.OFFER_COMPONENTS__TAGS, null, msgs);
			if (newTags != null)
				msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OffersPackage.OFFER_COMPONENTS__TAGS, null, msgs);
			msgs = basicSetTags(newTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_COMPONENTS__TAGS, newTags, newTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllOffers getOffers() {
		return offers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffers(AllOffers newOffers, NotificationChain msgs) {
		AllOffers oldOffers = offers;
		offers = newOffers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_COMPONENTS__OFFERS, oldOffers, newOffers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffers(AllOffers newOffers) {
		if (newOffers != offers) {
			NotificationChain msgs = null;
			if (offers != null)
				msgs = ((InternalEObject)offers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OffersPackage.OFFER_COMPONENTS__OFFERS, null, msgs);
			if (newOffers != null)
				msgs = ((InternalEObject)newOffers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OffersPackage.OFFER_COMPONENTS__OFFERS, null, msgs);
			msgs = basicSetOffers(newOffers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_COMPONENTS__OFFERS, newOffers, newOffers));
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
				return basicSetProducts(null, msgs);
			case OffersPackage.OFFER_COMPONENTS__CATEGORIES:
				return basicSetCategories(null, msgs);
			case OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES:
				return basicSetSubCategories(null, msgs);
			case OffersPackage.OFFER_COMPONENTS__TAGS:
				return basicSetTags(null, msgs);
			case OffersPackage.OFFER_COMPONENTS__OFFERS:
				return basicSetOffers(null, msgs);
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
			case OffersPackage.OFFER_COMPONENTS__OFFERS:
				return getOffers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OffersPackage.OFFER_COMPONENTS__PRODUCTS:
				setProducts((Products)newValue);
				return;
			case OffersPackage.OFFER_COMPONENTS__CATEGORIES:
				setCategories((Categories)newValue);
				return;
			case OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES:
				setSubCategories((SubCategories)newValue);
				return;
			case OffersPackage.OFFER_COMPONENTS__TAGS:
				setTags((Tags)newValue);
				return;
			case OffersPackage.OFFER_COMPONENTS__OFFERS:
				setOffers((AllOffers)newValue);
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
				setProducts((Products)null);
				return;
			case OffersPackage.OFFER_COMPONENTS__CATEGORIES:
				setCategories((Categories)null);
				return;
			case OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES:
				setSubCategories((SubCategories)null);
				return;
			case OffersPackage.OFFER_COMPONENTS__TAGS:
				setTags((Tags)null);
				return;
			case OffersPackage.OFFER_COMPONENTS__OFFERS:
				setOffers((AllOffers)null);
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
				return products != null;
			case OffersPackage.OFFER_COMPONENTS__CATEGORIES:
				return categories != null;
			case OffersPackage.OFFER_COMPONENTS__SUB_CATEGORIES:
				return subCategories != null;
			case OffersPackage.OFFER_COMPONENTS__TAGS:
				return tags != null;
			case OffersPackage.OFFER_COMPONENTS__OFFERS:
				return offers != null;
		}
		return super.eIsSet(featureID);
	}

} //OfferComponentsImpl
