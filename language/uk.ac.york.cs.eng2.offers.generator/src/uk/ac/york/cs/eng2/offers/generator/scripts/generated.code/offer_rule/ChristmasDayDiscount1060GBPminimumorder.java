
package uk.ac.york.cs.eng2.products.resources.offers.generated;

import uk.ac.york.cs.eng2.products.resources.offers.OfferHandler;
import java.util.Map;

/**
* Auto-generated offer handler for rule: Christmas Day Discount 10% (60 GBP minimum order)
*/
public class ChristmasDayDiscount1060GBPminimumorder implements OfferHandler {

	@Override
	public String getRuleName() {
		return "Christmas Day Discount 10% (60 GBP minimum order)";
	}

	@Override
	public boolean isOfferValid(Map<Long, Integer> order) {
		if (!checkCheckChristmasDay(order)) return false;
		if (!checkCheck60minprice(order)) return false;
		return true;
	}

	@Override
	public float applyOffer(Map<Long, Integer> order) {
		float total = 0;
		total += apply10off(order);
		return total;
	}

	// --- Condition Check Methods ---
	private boolean checkCheckChristmasDay(Map<Long, Integer> order) {
		// protected region check_CheckChristmasDay on begin //
		// TODO: Implement condition logic for Check Christmas Day
		return true;
		// protected region check_CheckChristmasDay end //
	}
	private boolean checkCheck60minprice(Map<Long, Integer> order) {
		// protected region check_Check60minprice on begin //
		// TODO: Implement condition logic for Check £60 min price
		return true;
		// protected region check_Check60minprice end //
	}

	// --- Offer Apply Methods ---
	private float apply10off(Map<Long, Integer> order) {
		// protected region apply_10off on begin //
		// TODO: Implement offer logic for 10% off
		return 0;
		// protected region apply_10off end //
	}
}