
package uk.ac.york.eng2.products.resources.offers.generated;

import uk.ac.york.eng2.products.resources.offers.src.OfferHandler;
import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.CheckChristmasDay;
import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check60minprice;

/**
* Auto-generated offer handler for rule: Christmas Day Discount 10% (60 GBP minimum order)
*/
public class ChristmasDayDiscount1060GBPminimumorder implements OfferHandler {

	@Override
	public boolean isOfferValid(Map<Long, Integer> order) {
		boolean allValid = true;

		// protected region check_CheckChristmasDay on begin //
		Boolean CheckChristmasDayIsValid = new CheckChristmasDay().checkCondition(); //some parameter tbd//
		// protected region check_CheckChristmasDay end //

		// protected region check_Check60minprice on begin //
		Boolean Check60minpriceIsValid = new Check60minprice().checkCondition(); //some parameter tbd//
		// protected region check_Check60minprice end //

		if (CheckChristmasDayIsValid == false) {
			return false;
		}

		return true;
		if (Check60minpriceIsValid == false) {
			return false;
		}

		return true;
	}

	@Override
	public float applyOffer(Map<Long, Integer> order) {
		float total = 0;
		// total += apply10off(order);
		return total;
	}

	@Override
	public String getRuleName() {
		return "Christmas Day Discount 10% (60 GBP minimum order)"
	}
}