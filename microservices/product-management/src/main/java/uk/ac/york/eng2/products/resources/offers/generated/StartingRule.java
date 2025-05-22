package uk.ac.york.eng2.products.resources.offers.generated;

import uk.ac.york.eng2.products.resources.offers.generated.rules.First10ordersofBakewellTartsintheday10off;

import java.util.Map;

public class StartingRule {

	private Map<Long, Integer> order;

	public StartingRule(Map<Long, Integer> order) {
		this.order = order;
	}

	public float start() {
		return new First10ordersofBakewellTartsintheday10off().useOfferRule(order);
	}
}