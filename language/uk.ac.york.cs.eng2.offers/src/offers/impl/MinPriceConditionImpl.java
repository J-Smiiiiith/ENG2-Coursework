/**
 */
package offers.impl;

import offers.MinPriceCondition;
import offers.OffersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Price Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link offers.impl.MinPriceConditionImpl#getMinPrice <em>Min Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinPriceConditionImpl extends ConditionImpl implements MinPriceCondition {
	/**
	 * The default value of the '{@link #getMinPrice() <em>Min Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinPrice() <em>Min Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPrice()
	 * @generated
	 * @ordered
	 */
	protected float minPrice = MIN_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinPriceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.MIN_PRICE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMinPrice() {
		return minPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinPrice(float newMinPrice) {
		float oldMinPrice = minPrice;
		minPrice = newMinPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.MIN_PRICE_CONDITION__MIN_PRICE, oldMinPrice, minPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.MIN_PRICE_CONDITION__MIN_PRICE:
				return getMinPrice();
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
			case OffersPackage.MIN_PRICE_CONDITION__MIN_PRICE:
				setMinPrice((Float)newValue);
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
			case OffersPackage.MIN_PRICE_CONDITION__MIN_PRICE:
				setMinPrice(MIN_PRICE_EDEFAULT);
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
			case OffersPackage.MIN_PRICE_CONDITION__MIN_PRICE:
				return minPrice != MIN_PRICE_EDEFAULT;
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
		result.append(" (minPrice: ");
		result.append(minPrice);
		result.append(')');
		return result.toString();
	}

} //MinPriceConditionImpl
