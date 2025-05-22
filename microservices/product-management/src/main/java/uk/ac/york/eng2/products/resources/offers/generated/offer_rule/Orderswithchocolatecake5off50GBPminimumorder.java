
package uk.ac.york.eng2.products.resources.offers.generated.offer_rule;

import uk.ac.york.eng2.products.resources.offers.src.OfferHandler;
import java.util.Map;

/**
* Auto-generated offer handler for rule: Orders with chocolate cake £5 off (50 GBP minimum order)
*/
public class Orderswithchocolatecake5off50GBPminimumorder implements OfferHandler {

	@Override
	public String getRuleName() {
		return "Orders with chocolate cake £5 off (50 GBP minimum order)";
	}

	@Override
	public boolean isOfferValid(Map<Long, Integer> order) {
		if (!checkCheck50minprice(order)) return false;
		if (!checkCheckQuantityChocolateCake1(order)) return false;
		return true;
	}

	@Override
	public float applyOffer(Map<Long, Integer> order) {
		float total = 0;
		total += apply5off(order);
		return total;
	}

	// --- Condition Check Methods ---
	private boolean checkCheck50minprice(Map<Long, Integer> order) {
		// protected region check_Check50minprice on begin //
		// TODO: Implement condition logic for Check £50 min price
		return true;
		// protected region check_Check50minprice end //
	}
	private boolean checkCheckQuantityChocolateCake1(Map<Long, Integer> order) {
		// protected region check_CheckQuantityChocolateCake1 on begin //
		// TODO: Implement condition logic for Check Quantity Chocolate Cake = 1
		return true;
		// protected region check_CheckQuantityChocolateCake1 end //
	}

	// --- Offer Apply Methods ---
	private float apply5off(Map<Long, Integer> order) {
		// protected region apply_5off on begin //
		// TODO: Implement offer logic for £5 off
		return 0;
		// protected region apply_5off end //
	}
}