/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.CheckNumOrdersCondition;
import uk.ac.york.cs.eng2.offers.OffersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Num Orders Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.CheckNumOrdersConditionImpl#getNumOrders <em>Num Orders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckNumOrdersConditionImpl extends ConditionImpl implements CheckNumOrdersCondition {
	/**
	 * The default value of the '{@link #getNumOrders() <em>Num Orders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOrders()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_ORDERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOrders() <em>Num Orders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOrders()
	 * @generated
	 * @ordered
	 */
	protected int numOrders = NUM_ORDERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckNumOrdersConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.CHECK_NUM_ORDERS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumOrders() {
		return numOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumOrders(int newNumOrders) {
		int oldNumOrders = numOrders;
		numOrders = newNumOrders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.CHECK_NUM_ORDERS_CONDITION__NUM_ORDERS, oldNumOrders, numOrders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.CHECK_NUM_ORDERS_CONDITION__NUM_ORDERS:
				return getNumOrders();
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
			case OffersPackage.CHECK_NUM_ORDERS_CONDITION__NUM_ORDERS:
				setNumOrders((Integer)newValue);
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
			case OffersPackage.CHECK_NUM_ORDERS_CONDITION__NUM_ORDERS:
				setNumOrders(NUM_ORDERS_EDEFAULT);
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
			case OffersPackage.CHECK_NUM_ORDERS_CONDITION__NUM_ORDERS:
				return numOrders != NUM_ORDERS_EDEFAULT;
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
		result.append(" (numOrders: ");
		result.append(numOrders);
		result.append(')');
		return result.toString();
	}

} //CheckNumOrdersConditionImpl
