
package uk.ac.york.eng2.products.resources.offers.generated.offer_rule;

import uk.ac.york.eng2.products.resources.offers.src.OfferHandler;
import java.util.Map;

/**
* Auto-generated offer handler for rule: First 10 orders of Bakewell Tarts in the day 10% off
*/
public class First10ordersofBakewellTartsintheday10off implements OfferHandler {

	@Override
	public String getRuleName() {
		return "First 10 orders of Bakewell Tarts in the day 10% off ";
	}

	@Override
	public boolean isOfferValid(Map<Long, Integer> order) {
		if (!checkChecknumorders10(order)) return false;
		if (!checkCheck1bakewelltart(order)) return false;
		return true;
	}

	@Override
	public float applyOffer(Map<Long, Integer> order) {
		float total = 0;
		total += apply10off(order);
		return total;
	}

	// --- Condition Check Methods ---
	private boolean checkChecknumorders10(Map<Long, Integer> order) {
		// protected region check_Checknumorders10 on begin //
		// TODO: Implement condition logic for Check num orders = 10
		return true;
		// protected region check_Checknumorders10 end //
	}
	private boolean checkCheck1bakewelltart(Map<Long, Integer> order) {
		// protected region check_Check1bakewelltart on begin //
		// TODO: Implement condition logic for Check 1 bakewell tart
		return true;
		// protected region check_Check1bakewelltart end //
	}

	// --- Offer Apply Methods ---
	private float apply10off(Map<Long, Integer> order) {
		// protected region apply_10off on begin //
		// TODO: Implement offer logic for 10% off
		return 0;
		// protected region apply_10off end //
	}
}