/**
 */
package offers.impl;

import java.util.Collection;

import offers.Category;
import offers.Condition;
import offers.Offer;
import offers.OffersPackage;
import offers.Product;
import offers.SubCategory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link offers.impl.OfferImpl#getName <em>Name</em>}</li>
 *   <li>{@link offers.impl.OfferImpl#getApplicableProducts <em>Applicable Products</em>}</li>
 *   <li>{@link offers.impl.OfferImpl#getApplicableCategories <em>Applicable Categories</em>}</li>
 *   <li>{@link offers.impl.OfferImpl#getApplicableSubCategories <em>Applicable Sub Categories</em>}</li>
 *   <li>{@link offers.impl.OfferImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OfferImpl extends MinimalEObjectImpl.Container implements Offer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplicableProducts() <em>Applicable Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> applicableProducts;

	/**
	 * The cached value of the '{@link #getApplicableCategories() <em>Applicable Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> applicableCategories;

	/**
	 * The cached value of the '{@link #getApplicableSubCategories() <em>Applicable Sub Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableSubCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<SubCategory> applicableSubCategories;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.OFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getApplicableProducts() {
		if (applicableProducts == null) {
			applicableProducts = new EObjectContainmentEList<Product>(Product.class, this, OffersPackage.OFFER__APPLICABLE_PRODUCTS);
		}
		return applicableProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Category> getApplicableCategories() {
		if (applicableCategories == null) {
			applicableCategories = new EObjectContainmentEList<Category>(Category.class, this, OffersPackage.OFFER__APPLICABLE_CATEGORIES);
		}
		return applicableCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubCategory> getApplicableSubCategories() {
		if (applicableSubCategories == null) {
			applicableSubCategories = new EObjectContainmentEList<SubCategory>(SubCategory.class, this, OffersPackage.OFFER__APPLICABLE_SUB_CATEGORIES);
		}
		return applicableSubCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, OffersPackage.OFFER__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OffersPackage.OFFER__APPLICABLE_PRODUCTS:
				return ((InternalEList<?>)getApplicableProducts()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER__APPLICABLE_CATEGORIES:
				return ((InternalEList<?>)getApplicableCategories()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER__APPLICABLE_SUB_CATEGORIES:
				return ((InternalEList<?>)getApplicableSubCategories()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
			case OffersPackage.OFFER__NAME:
				return getName();
			case OffersPackage.OFFER__APPLICABLE_PRODUCTS:
				return getApplicableProducts();
			case OffersPackage.OFFER__APPLICABLE_CATEGORIES:
				return getApplicableCategories();
			case OffersPackage.OFFER__APPLICABLE_SUB_CATEGORIES:
				return getApplicableSubCategories();
			case OffersPackage.OFFER__CONDITIONS:
				return getConditions();
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
			case OffersPackage.OFFER__NAME:
				setName((String)newValue);
				return;
			case OffersPackage.OFFER__APPLICABLE_PRODUCTS:
				getApplicableProducts().clear();
				getApplicableProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case OffersPackage.OFFER__APPLICABLE_CATEGORIES:
				getApplicableCategories().clear();
				getApplicableCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case OffersPackage.OFFER__APPLICABLE_SUB_CATEGORIES:
				getApplicableSubCategories().clear();
				getApplicableSubCategories().addAll((Collection<? extends SubCategory>)newValue);
				return;
			case OffersPackage.OFFER__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
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
			case OffersPackage.OFFER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OffersPackage.OFFER__APPLICABLE_PRODUCTS:
				getApplicableProducts().clear();
				return;
			case OffersPackage.OFFER__APPLICABLE_CATEGORIES:
				getApplicableCategories().clear();
				return;
			case OffersPackage.OFFER__APPLICABLE_SUB_CATEGORIES:
				getApplicableSubCategories().clear();
				return;
			case OffersPackage.OFFER__CONDITIONS:
				getConditions().clear();
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
			case OffersPackage.OFFER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OffersPackage.OFFER__APPLICABLE_PRODUCTS:
				return applicableProducts != null && !applicableProducts.isEmpty();
			case OffersPackage.OFFER__APPLICABLE_CATEGORIES:
				return applicableCategories != null && !applicableCategories.isEmpty();
			case OffersPackage.OFFER__APPLICABLE_SUB_CATEGORIES:
				return applicableSubCategories != null && !applicableSubCategories.isEmpty();
			case OffersPackage.OFFER__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OfferImpl
