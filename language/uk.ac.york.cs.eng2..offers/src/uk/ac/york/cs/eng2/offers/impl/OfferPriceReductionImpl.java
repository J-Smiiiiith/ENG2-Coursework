/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.OfferPriceReduction;
import uk.ac.york.cs.eng2.offers.OffersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer Price Reduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferPriceReductionImpl#getPercentageReduction <em>Percentage Reduction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OfferPriceReductionImpl extends OfferImpl implements OfferPriceReduction {
	/**
	 * The default value of the '{@link #getPercentageReduction() <em>Percentage Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageReduction()
	 * @generated
	 * @ordered
	 */
	protected static final float PERCENTAGE_REDUCTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPercentageReduction() <em>Percentage Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageReduction()
	 * @generated
	 * @ordered
	 */
	protected float percentageReduction = PERCENTAGE_REDUCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferPriceReductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.OFFER_PRICE_REDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPercentageReduction() {
		return percentageReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentageReduction(float newPercentageReduction) {
		float oldPercentageReduction = percentageReduction;
		percentageReduction = newPercentageReduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_PRICE_REDUCTION__PERCENTAGE_REDUCTION, oldPercentageReduction, percentageReduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.OFFER_PRICE_REDUCTION__PERCENTAGE_REDUCTION:
				return getPercentageReduction();
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
			case OffersPackage.OFFER_PRICE_REDUCTION__PERCENTAGE_REDUCTION:
				setPercentageReduction((Float)newValue);
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
			case OffersPackage.OFFER_PRICE_REDUCTION__PERCENTAGE_REDUCTION:
				setPercentageReduction(PERCENTAGE_REDUCTION_EDEFAULT);
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
			case OffersPackage.OFFER_PRICE_REDUCTION__PERCENTAGE_REDUCTION:
				return percentageReduction != PERCENTAGE_REDUCTION_EDEFAULT;
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
		result.append(" (percentageReduction: ");
		result.append(percentageReduction);
		result.append(')');
		return result.toString();
	}

} //OfferPriceReductionImpl
