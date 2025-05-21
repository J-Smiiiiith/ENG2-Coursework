/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Trigger#getTarget <em>Target</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Trigger#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(OfferRule)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTrigger_Target()
	 * @model
	 * @generated
	 */
	OfferRule getTarget();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Trigger#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(OfferRule value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.cs.eng2.offers.TriggerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @see #setType(TriggerType)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTrigger_Type()
	 * @model
	 * @generated
	 */
	TriggerType getType();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Trigger#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @see #getType()
	 * @generated
	 */
	void setType(TriggerType value);

} // Trigger
