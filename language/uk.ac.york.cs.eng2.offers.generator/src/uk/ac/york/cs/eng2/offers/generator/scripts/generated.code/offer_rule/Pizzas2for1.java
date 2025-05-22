
package uk.ac.york.cs.eng2.products.resources.offers.generated;

import uk.ac.york.cs.eng2.products.resources.offers.OfferHandler;
import java.util.Map;

/**
* Auto-generated offer handler for rule: Pizzas 2 for 1
*/
public class Pizzas2for1 implements OfferHandler {

	@Override
	public String getRuleName() {
		return "Pizzas 2 for 1";
	}

	@Override
	public boolean isOfferValid(Map<Long, Integer> order) {
		if (!checkCheck2Pizzas(order)) return false;
		return true;
	}

	@Override
	public float applyOffer(Map<Long, Integer> order) {
		float total = 0;
		total += applyBOGOF(order);
		return total;
	}

	// --- Condition Check Methods ---
	private boolean checkCheck2Pizzas(Map<Long, Integer> order) {
		// protected region check_Check2Pizzas on begin //
		// TODO: Implement condition logic for Check 2 Pizzas
		return true;
		// protected region check_Check2Pizzas end //
	}

	// --- Offer Apply Methods ---
	private float applyBOGOF(Map<Long, Integer> order) {
		// protected region apply_BOGOF on begin //
		// TODO: Implement offer logic for BOGOF
		return 0;
		// protected region apply_BOGOF end //
	}
}