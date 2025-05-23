package uk.ac.york.eng2.products.resources.offers.generated.offers;

import uk.ac.york.eng2.products.resources.offers.src.AbstractOfferHandlerOperations;

/**
* Auto-generated offer handler for offer: BOGOF
*/
public class BOGOF extends AbstractOfferHandlerOperations {

	private float freeProductPrice;
	private int numFree;

	public BOGOF() {
		this.numFree = 1;
		this.freeProductPrice = 4.25f;
	}

	public String getOfferName() {
		return "BOGOF";
	}

	public float getNumFree() {
		return numFree;
	}

	public float apply() {
		float totalReduction = 0;
		for (int i = 0; i < numFree; i++) {
			totalReduction += applyFreeProduct(freeProductPrice);
		}
		return totalReduction;
	}
}