/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.FreeProductOffer;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Product Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.FreeProductOfferImpl#getFreeProduct <em>Free Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreeProductOfferImpl extends OfferImpl implements FreeProductOffer {
	/**
	 * The cached value of the '{@link #getFreeProduct() <em>Free Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeProduct()
	 * @generated
	 * @ordered
	 */
	protected Product freeProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeProductOfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.FREE_PRODUCT_OFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getFreeProduct() {
		if (freeProduct != null && freeProduct.eIsProxy()) {
			InternalEObject oldFreeProduct = (InternalEObject)freeProduct;
			freeProduct = (Product)eResolveProxy(oldFreeProduct);
			if (freeProduct != oldFreeProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OffersPackage.FREE_PRODUCT_OFFER__FREE_PRODUCT, oldFreeProduct, freeProduct));
			}
		}
		return freeProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetFreeProduct() {
		return freeProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreeProduct(Product newFreeProduct) {
		Product oldFreeProduct = freeProduct;
		freeProduct = newFreeProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.FREE_PRODUCT_OFFER__FREE_PRODUCT, oldFreeProduct, freeProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.FREE_PRODUCT_OFFER__FREE_PRODUCT:
				if (resolve) return getFreeProduct();
				return basicGetFreeProduct();
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
			case OffersPackage.FREE_PRODUCT_OFFER__FREE_PRODUCT:
				setFreeProduct((Product)newValue);
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
			case OffersPackage.FREE_PRODUCT_OFFER__FREE_PRODUCT:
				setFreeProduct((Product)null);
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
			case OffersPackage.FREE_PRODUCT_OFFER__FREE_PRODUCT:
				return freeProduct != null;
		}
		return super.eIsSet(featureID);
	}

} //FreeProductOfferImpl
