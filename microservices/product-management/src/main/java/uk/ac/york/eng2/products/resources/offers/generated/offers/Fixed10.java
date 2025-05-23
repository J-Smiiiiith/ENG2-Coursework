package uk.ac.york.eng2.products.resources.offers.generated.offers;

import uk.ac.york.eng2.products.resources.offers.src.AbstractOfferHandlerOperations;

import java.util.Map;

/**
* Auto-generated offer handler for offer: Fixed £10
*/
public class Fixed10 extends AbstractOfferHandlerOperations {

	private Map<Float, Integer> fixedPriceProducts;
	float fixedPrice;

	public Fixed10() {
		this.fixedPrice = 10.0f;
	}

	public String getOfferName() {
		return "Fixed £10";
	}

	public float getFixedPrice() {
		return fixedPrice;
	}

	public float apply() {
		return applyFixedPrice(fixedPrice, fixedPriceProducts);
	}
}