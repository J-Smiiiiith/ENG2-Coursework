/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.cs.eng2.offers.Condition;
import uk.ac.york.cs.eng2.offers.Offer;
import uk.ac.york.cs.eng2.offers.OfferRule;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getOffers <em>Offers</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OfferRuleImpl extends MinimalEObjectImpl.Container implements OfferRule {
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
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

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
	protected OfferRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.OFFER_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, OffersPackage.OFFER_RULE__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Offer> getOffers() {
		if (offers == null) {
			offers = new EObjectContainmentEList<Offer>(Offer.class, this, OffersPackage.OFFER_RULE__OFFERS);
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
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, OffersPackage.OFFER_RULE__TRIGGERS);
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
			case OffersPackage.OFFER_RULE__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER_RULE__OFFERS:
				return ((InternalEList<?>)getOffers()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER_RULE__TRIGGERS:
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
			case OffersPackage.OFFER_RULE__NAME:
				return getName();
			case OffersPackage.OFFER_RULE__CONDITIONS:
				return getConditions();
			case OffersPackage.OFFER_RULE__OFFERS:
				return getOffers();
			case OffersPackage.OFFER_RULE__TRIGGERS:
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
			case OffersPackage.OFFER_RULE__NAME:
				setName((String)newValue);
				return;
			case OffersPackage.OFFER_RULE__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case OffersPackage.OFFER_RULE__OFFERS:
				getOffers().clear();
				getOffers().addAll((Collection<? extends Offer>)newValue);
				return;
			case OffersPackage.OFFER_RULE__TRIGGERS:
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
			case OffersPackage.OFFER_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OffersPackage.OFFER_RULE__CONDITIONS:
				getConditions().clear();
				return;
			case OffersPackage.OFFER_RULE__OFFERS:
				getOffers().clear();
				return;
			case OffersPackage.OFFER_RULE__TRIGGERS:
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
			case OffersPackage.OFFER_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OffersPackage.OFFER_RULE__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case OffersPackage.OFFER_RULE__OFFERS:
				return offers != null && !offers.isEmpty();
			case OffersPackage.OFFER_RULE__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
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

} //OfferRuleImpl
