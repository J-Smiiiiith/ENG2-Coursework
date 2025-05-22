package uk.ac.york.eng2.products.resources.offers.generated;

import uk.ac.york.eng2.products.resources.offers.generated.rules.First10ordersofBakewellTartsintheday10off;
import uk.ac.york.eng2.products.resources.offers.src.OfferPricingContext;

import java.util.Map;

public class StartingRule {

	public OfferPricingContext pricingContext;

	public StartingRule(OfferPricingContext pricingContext) {
		this.pricingContext = pricingContext;
	}

	public float start() {
		return new First10ordersofBakewellTartsintheday10off(pricingContext).useOfferRule();
	}
}