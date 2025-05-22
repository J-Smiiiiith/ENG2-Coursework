
package uk.ac.york.cs.eng2.products.resources.offers.generated;

import uk.ac.york.cs.eng2.products.resources.offers.OfferHandler;
import java.util.Map;

/**
* Auto-generated offer handler for rule: Largee Pizzas 2 for £10, with one free large ice cream
*/
public class LargeePizzas2for10withonefreelargeicecream implements OfferHandler {

	@Override
	public String getRuleName() {
		return "Largee Pizzas 2 for £10, with one free large ice cream";
	}

	@Override
	public boolean isOfferValid(Map<Long, Integer> order) {
		if (!checkCheck2LargePizzas(order)) return false;
		return true;
	}

	@Override
	public float applyOffer(Map<Long, Integer> order) {
		float total = 0;
		total += applyFixed10(order);
		total += applyFreeIceCream(order);
		return total;
	}

	// --- Condition Check Methods ---
	private boolean checkCheck2LargePizzas(Map<Long, Integer> order) {
		// protected region check_Check2LargePizzas on begin //
		// TODO: Implement condition logic for Check 2 Large Pizzas
		return true;
		// protected region check_Check2LargePizzas end //
	}

	// --- Offer Apply Methods ---
	private float applyFixed10(Map<Long, Integer> order) {
		// protected region apply_Fixed10 on begin //
		// TODO: Implement offer logic for Fixed £10
		return 0;
		// protected region apply_Fixed10 end //
	}
	private float applyFreeIceCream(Map<Long, Integer> order) {
		// protected region apply_FreeIceCream on begin //
		// TODO: Implement offer logic for Free Ice Cream
		return 0;
		// protected region apply_FreeIceCream end //
	}
}