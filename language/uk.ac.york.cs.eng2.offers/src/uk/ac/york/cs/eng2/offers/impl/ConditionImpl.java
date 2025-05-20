/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.york.cs.eng2.offers.Category;
import uk.ac.york.cs.eng2.offers.Condition;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Product;
import uk.ac.york.cs.eng2.offers.SubCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl#getApplicableProducts <em>Applicable Products</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl#getApplicableCategories <em>Applicable Categories</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl#getApplicableSubCategories <em>Applicable Sub Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
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
	 * The cached value of the '{@link #getApplicableProducts() <em>Applicable Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> applicableProducts;

	/**
	 * The cached value of the '{@link #getApplicableCategories() <em>Applicable Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> applicableCategories;

	/**
	 * The cached value of the '{@link #getApplicableSubCategories() <em>Applicable Sub Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableSubCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<SubCategory> applicableSubCategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.CONDITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getApplicableProducts() {
		if (applicableProducts == null) {
			applicableProducts = new EObjectResolvingEList<Product>(Product.class, this, OffersPackage.CONDITION__APPLICABLE_PRODUCTS);
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
			applicableCategories = new EObjectResolvingEList<Category>(Category.class, this, OffersPackage.CONDITION__APPLICABLE_CATEGORIES);
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
			applicableSubCategories = new EObjectResolvingEList<SubCategory>(SubCategory.class, this, OffersPackage.CONDITION__APPLICABLE_SUB_CATEGORIES);
		}
		return applicableSubCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.CONDITION__NAME:
				return getName();
			case OffersPackage.CONDITION__APPLICABLE_PRODUCTS:
				return getApplicableProducts();
			case OffersPackage.CONDITION__APPLICABLE_CATEGORIES:
				return getApplicableCategories();
			case OffersPackage.CONDITION__APPLICABLE_SUB_CATEGORIES:
				return getApplicableSubCategories();
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
			case OffersPackage.CONDITION__NAME:
				setName((String)newValue);
				return;
			case OffersPackage.CONDITION__APPLICABLE_PRODUCTS:
				getApplicableProducts().clear();
				getApplicableProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case OffersPackage.CONDITION__APPLICABLE_CATEGORIES:
				getApplicableCategories().clear();
				getApplicableCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case OffersPackage.CONDITION__APPLICABLE_SUB_CATEGORIES:
				getApplicableSubCategories().clear();
				getApplicableSubCategories().addAll((Collection<? extends SubCategory>)newValue);
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
			case OffersPackage.CONDITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OffersPackage.CONDITION__APPLICABLE_PRODUCTS:
				getApplicableProducts().clear();
				return;
			case OffersPackage.CONDITION__APPLICABLE_CATEGORIES:
				getApplicableCategories().clear();
				return;
			case OffersPackage.CONDITION__APPLICABLE_SUB_CATEGORIES:
				getApplicableSubCategories().clear();
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
			case OffersPackage.CONDITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OffersPackage.CONDITION__APPLICABLE_PRODUCTS:
				return applicableProducts != null && !applicableProducts.isEmpty();
			case OffersPackage.CONDITION__APPLICABLE_CATEGORIES:
				return applicableCategories != null && !applicableCategories.isEmpty();
			case OffersPackage.CONDITION__APPLICABLE_SUB_CATEGORIES:
				return applicableSubCategories != null && !applicableSubCategories.isEmpty();
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

} //ConditionImpl
