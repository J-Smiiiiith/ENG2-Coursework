package uk.ac.york.eng2.products.resources.offers.generated.offers;

import uk.ac.york.eng2.products.resources.offers.src.AbstractOfferHandlerOperations;

/**
* Auto-generated offer handler for offer: Reduction 10%
*/
public class Reduction10 extends AbstractOfferHandlerOperations {

	private float percentageReduction;
	private float totalPrice;

	public Reduction10(float totalPrice) {
		this.percentageReduction = 10.0f;
		this.totalPrice = totalPrice;
	}

	public float apply() {
		return applyPricePercentageReduction(percentageReduction, totalPrice);
	}

	public String getOfferName() {
		return "Reduction 10%";
	}

	public float getPercentageReduction() {
		return percentageReduction;
	}
}