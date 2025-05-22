package uk.ac.york.eng2.products.resources.offers.generated.offers;

import uk.ac.york.eng2.products.resources.offers.src.AbstractOfferHandlerOperations;

/**
* Auto-generated offer handler for offer: Free Ice Cream
*/
public class FreeIceCream extends AbstractOfferHandlerOperations {

	private float price;

	public FreeIceCream() {
		this.price = 2.5f;
	}

	public String getOfferName() {
		return "Free Ice Cream";
	}

	public float getFreeProductPrice() {
		return price;
	}
}